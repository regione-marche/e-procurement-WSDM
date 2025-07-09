package it.maggioli.eldasoft.ws.conf;

import java.rmi.RemoteException;

import javax.jws.WebService;
import javax.naming.InitialContext;
import javax.naming.NameClassPair;
import javax.naming.NamingEnumeration;

import org.apache.log4j.Logger;

@WebService(endpointInterface = "it.maggioli.eldasoft.ws.conf.WSDMConfigurazione", serviceName = "WSDMConfigurazione", targetNamespace = "http://conf.ws.eldasoft.maggioli.it/")
public class WSDMConfigurazioneImpl implements WSDMConfigurazione {

  static Logger         logger     = Logger.getLogger(WSDMConfigurazioneImpl.class);

  static private String REMOTEWSDM = "java:comp/env/REMOTEWSDM";

  // static private String IRIDE_TABELLATI =
  // "classpath:META-INF/tabellati/IrideJIrideTabellati.xml";
  // static private String JIRIDE_TABELLATI =
  // "classpath:META-INF/tabellati/IrideJIrideTabellati.xml";
  // static private String PALEO_TABELLATI =
  // "classpath:META-INF/tabellati/PaleoTabellati.xml";
  // static private String ARXIVAR_TABELLATI =
  // "classpath:META-INF/tabellati/ArxivarTabellati.xml";
  // static private String ENGINEERING_TABELLATI =
  // "classpath:META-INF/tabellati/EngineeringTabellati.xml";
  // static private String ENGINEERINGDOC_TABELLATI =
  // "classpath:META-INF/tabellati/EngineeringDocTabellati.xml";
  // static private String ARCHIFLOW_TABELLATI =
  // "classpath:META-INF/tabellati/ArchiflowTabellati.xml";
  // static private String TITULUS_TABELLATI =
  // "classpath:META-INF/tabellati/TitulusTabellati.xml";

  /**
   * Lettura delle definizioni.
   * 
   */
  public WSDMConfigurazioneOut WSDMConfigurazioneLeggi() throws RemoteException {
    WSDMConfigurazioneOut configurazione = new WSDMConfigurazioneOut();

    try {

      // Codice configurazione restituita ai client
      String remotewsdm = InitialContext.doLookup(REMOTEWSDM);

      if ("DATAGRAPH.PRISMA".equals(remotewsdm)) {
        remotewsdm = "PRISMA";
      }
      if ("FOLIUM2.FOLIUM".equals(remotewsdm)) {
        remotewsdm = "FOLIUM";
      } 
      if ("INFOR2.INFOR".equals(remotewsdm)) {
        remotewsdm = "INFOR";
      }

      // Archiflow in versione 10, modalità fascicolo standard. Viene restituito ai client con ARCHIFLOW
      if ("ARCHIFLOW10.ARCHIFLOW".equals(remotewsdm)) {
        remotewsdm = "ARCHIFLOW";
      }

      configurazione.setRemotewsdm(remotewsdm);

      // Configurazione e gestione dei tabellati
      String remotewsdmTabellati = InitialContext.doLookup(REMOTEWSDM);

      try {
        InitialContext ctx_tab = new InitialContext();
        if ("IRIDE".equals(remotewsdmTabellati)) {
          remotewsdmTabellati = "JIRIDE";
        }
        if ("DATAGRAPH.PRISMA".equals(remotewsdmTabellati)) {
          remotewsdmTabellati = "DATAGRAPH";
        }
        if ("FOLIUM2.FOLIUM".equals(remotewsdmTabellati)) {
          remotewsdmTabellati = "FOLIUM2";
        }
        if ("INFOR2.INFOR".equals(remotewsdmTabellati)) {
          remotewsdmTabellati = "INFOR2";
        }

        // Archiflow versione 10, in modalità fascicolo standard. I tabellati e le configurazione sono quelli della configurazione ARCHIFLOWFA
        if ("ARCHIFLOW10.ARCHIFLOW".equals(remotewsdmTabellati)) {
          remotewsdmTabellati = "ARCHIFLOW";
        }

        String _searchtab = "java:comp/env/tab/" + remotewsdmTabellati;

        // Tabellati
        NamingEnumeration<NameClassPair> _tablist = ctx_tab.list(_searchtab);
        NamingEnumeration<NameClassPair> _tablisttot = ctx_tab.list(_searchtab);
        int _tabnum = -1;
        int _tabnumtot = 0;
        while (_tablisttot.hasMore()) {
          _tabnumtot++;
          _tablisttot.next();
        }

        if (_tabnumtot > 0) {
          WSDMTabellato[] tabellati = new WSDMTabellato[_tabnumtot];
          while (_tablist.hasMore()) {
            String _tabName = _tablist.next().getName();
            String _tabFullName = _searchtab + "/" + _tabName;
            _tabnum++;
            tabellati[_tabnum] = new WSDMTabellato();
            tabellati[_tabnum].setNome(_tabName);

            // Elementi
            NamingEnumeration<NameClassPair> _keylist = ctx_tab.list(_tabFullName);
            NamingEnumeration<NameClassPair> _keylisttot = ctx_tab.list(_tabFullName);
            int _keynum = -1;
            int _keynumtot = 0;
            while (_keylisttot.hasMore()) {
              _keynumtot++;
              _keylisttot.next();
            }

            if (_keynumtot > 0) {
              WSDMTabellatoElemento[] elementi = new WSDMTabellatoElemento[_keynumtot];
              while (_keylist.hasMore()) {
                String _keyName = _keylist.next().getName();
                String _keyFullName = _tabFullName + "/" + _keyName;
                _keynum++;
                elementi[_keynum] = new WSDMTabellatoElemento();
                String codice = _keyName;
                codice = codice.replaceAll("###", "/");
                elementi[_keynum].setCodice(codice);
                elementi[_keynum].setDescrizione((String) InitialContext.doLookup(_keyFullName));
              }
              tabellati[_tabnum].setElementi(elementi);
            }
          }
          configurazione.setTabellati(tabellati);
        }
      } catch (Exception e) {

      }

      configurazione.setEsito(true);
    } catch (Throwable t) {
      configurazione.setEsito(false);
      configurazione.setMessaggio(t.getMessage());
    }
    return configurazione;
  }

}
