package it.maggioli.eldasoft.ws.dm;

import java.util.Date;

import javax.xml.bind.annotation.XmlType;

@XmlType(name = "WSDMMailInfo2Type", propOrder = { "messaggioDataOra", "messaggioDirezione", "messaggioIdCasellaPosta", "messaggioIndirizzoCasellaPosta", "messaggioId",
    "messaggioOggetto", "statoSpedizione", "tipoSpedizione" })
public class WSDMMailInfo2 {

  private Date   messaggioDataOra;
  private String messaggioDirezione;
  private String messaggioIdCasellaPosta;
  private String messaggioIndirizzoCasellaPosta;
  private String messaggioId;
  private String messaggioOggetto;
  private String statoSpedizione;
  private String tipoSpedizione;
  
  public Date getMessaggioDataOra() {
    return messaggioDataOra;
  }
  
  public void setMessaggioDataOra(Date messaggioDataOra) {
    this.messaggioDataOra = messaggioDataOra;
  }
  
  public String getMessaggioDirezione() {
    return messaggioDirezione;
  }
  
  public void setMessaggioDirezione(String messaggioDirezione) {
    this.messaggioDirezione = messaggioDirezione;
  }
  
  public String getMessaggioIdCasellaPosta() {
    return messaggioIdCasellaPosta;
  }
  
  public void setMessaggioIdCasellaPosta(String messaggioIdCasellaPosta) {
    this.messaggioIdCasellaPosta = messaggioIdCasellaPosta;
  }
  
  public String getMessaggioIndirizzoCasellaPosta() {
    return messaggioIndirizzoCasellaPosta;
  }
  
  public void setMessaggioIndirizzoCasellaPosta(String messaggioIndirizzoCasellaPosta) {
    this.messaggioIndirizzoCasellaPosta = messaggioIndirizzoCasellaPosta;
  }
  
  public String getMessaggioId() {
    return messaggioId;
  }
  
  public void setMessaggioId(String messaggioId) {
    this.messaggioId = messaggioId;
  }
  
  public String getMessaggioOggetto() {
    return messaggioOggetto;
  }
  
  public void setMessaggioOggetto(String messaggioOggetto) {
    this.messaggioOggetto = messaggioOggetto;
  }
  
  public String getStatoSpedizione() {
    return statoSpedizione;
  }
  
  public void setStatoSpedizione(String statoSpedizione) {
    this.statoSpedizione = statoSpedizione;
  }
  
  public String getTipoSpedizione() {
    return tipoSpedizione;
  }
  
  public void setTipoSpedizione(String tipoSpedizione) {
    this.tipoSpedizione = tipoSpedizione;
  }
  



}
