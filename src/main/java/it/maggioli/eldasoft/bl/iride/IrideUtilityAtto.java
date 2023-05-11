package it.maggioli.eldasoft.bl.iride;

import it.iride.wsatti.AttoOut;
import it.maggioli.eldasoft.ws.dm.WSDMProtocolloAllegato;
import it.maggioli.eldasoft.ws.dm.WSDMProtocolloDocumento;
import it.maggioli.eldasoft.ws.dm.WSDMProtocolloDocumentoRes;

import java.util.List;

import javax.xml.datatype.XMLGregorianCalendar;

public class IrideUtilityAtto {

  public static WSDMProtocolloDocumentoRes popolaWSDMProtocolloDocumentoResDaAttoOut(AttoOut attoOut) {
    WSDMProtocolloDocumentoRes wsdmProtocolloDocumentoRes = new WSDMProtocolloDocumentoRes();

    boolean esito = true;
    String messaggio = "";
    if (attoOut.getMessaggio() != null) messaggio += attoOut.getMessaggio();
    String errore = attoOut.getErrore();
    if (errore != null && !errore.equals("")) {
      esito = false;
      if (!"".equals(messaggio)) messaggio += " - ";
      messaggio += errore;
    }
    wsdmProtocolloDocumentoRes.setEsito(esito);
    wsdmProtocolloDocumentoRes.setMessaggio(messaggio);

    if (esito) {
      WSDMProtocolloDocumento wsdmProtocolloDocumento = new WSDMProtocolloDocumento();
      wsdmProtocolloDocumento.setTipoDocumento(attoOut.getTipoDocumento());
      wsdmProtocolloDocumento.setTipoDocumentoDescrizione(attoOut.getTipoDocumentoDescrizione());
      wsdmProtocolloDocumento.setOggetto(attoOut.getOggetto());
      wsdmProtocolloDocumento.setClassifica(attoOut.getClassifica());
      wsdmProtocolloDocumento.setClassificaDescrizione(attoOut.getClassificaDescrizione());
      wsdmProtocolloDocumento.setNumeroDocumento(String.valueOf(attoOut.getIdDocumento()));

      XMLGregorianCalendar dataDocumento = attoOut.getDataDocumento();
      if (dataDocumento != null) {
        wsdmProtocolloDocumento.setData(dataDocumento.toGregorianCalendar().getTime());
      }

      // Allegati
      List<it.iride.wsatti.AllegatoOut> listAllegatoOut = attoOut.getAllegati().getAllegato();
      if (!listAllegatoOut.isEmpty() && listAllegatoOut.size() > 0) {
        WSDMProtocolloAllegato[] allegati = new WSDMProtocolloAllegato[listAllegatoOut.size()];
        for (int aa = 0; aa < listAllegatoOut.size(); aa++) {
          it.iride.wsatti.AllegatoOut allegatoOut = listAllegatoOut.get(aa);
          Long serial = new Long(allegatoOut.getSerial());
          Long IDBase = new Long(allegatoOut.getIDBase());
          Long versione = new Long(allegatoOut.getVersione());
          String tipo = allegatoOut.getTipoFile();
          String nome = allegatoOut.getNomeAllegato();
          String commento = allegatoOut.getCommento();
          byte[] contenuto = allegatoOut.getImage();

          allegati[aa] = new WSDMProtocolloAllegato();
          allegati[aa].setSerial(serial);
          allegati[aa].setIDBase(IDBase);
          allegati[aa].setVersione(versione);
          allegati[aa].setTipo(tipo);
          allegati[aa].setNome(nome);
          allegati[aa].setTitolo(commento);
          allegati[aa].setContenuto(contenuto);
        }
        wsdmProtocolloDocumento.setAllegati(allegati);
      }

      wsdmProtocolloDocumentoRes.setProtocolloDocumento(wsdmProtocolloDocumento);

    }

    return wsdmProtocolloDocumentoRes;
  }

}
