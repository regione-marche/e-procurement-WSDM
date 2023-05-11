package it.maggioli.eldasoft.ws.dm;

import javax.xml.bind.annotation.XmlType;

@XmlType(name = "WSDMAnagraficaLeggiResType", propOrder = { "esito", "messaggio", "anagrafica" })
public class WSDMAnagraficaLeggiRes {

  private boolean                  esito;
  private String                   messaggio;
  private WSDMProtocolloAnagrafica anagrafica;
  
  public boolean isEsito() {
    return esito;
  }
  
  public void setEsito(boolean esito) {
    this.esito = esito;
  }
  
  public String getMessaggio() {
    return messaggio;
  }
  
  public void setMessaggio(String messaggio) {
    this.messaggio = messaggio;
  }
  
  public WSDMProtocolloAnagrafica getAnagrafica() {
    return anagrafica;
  }
  
  public void setAnagrafica(WSDMProtocolloAnagrafica anagrafica) {
    this.anagrafica = anagrafica;
  }



}
