package it.maggioli.eldasoft.ws.conf;

import javax.xml.bind.annotation.XmlType;

@XmlType(name = "WSDMConfigurazioneOutType", propOrder = { "messaggio", "esito", "remotewsdm", "tabellati" })
public class WSDMConfigurazioneOut {

  private String          messaggio;
  private boolean         esito;
  private String          remotewsdm;
  private WSDMTabellato[] tabellati;

  public String getMessaggio() {
    return messaggio;
  }

  public void setMessaggio(String messaggio) {
    this.messaggio = messaggio;
  }

  public boolean isEsito() {
    return esito;
  }

  public void setEsito(boolean esito) {
    this.esito = esito;
  }

  public String getRemotewsdm() {
    return remotewsdm;
  }

  public void setRemotewsdm(String remotewsdm) {
    this.remotewsdm = remotewsdm;
  }

  public WSDMTabellato[] getTabellati() {
    return tabellati;
  }

  public void setTabellati(WSDMTabellato[] tabellati) {
    this.tabellati = tabellati;
  }

}
