  package it.maggioli.eldasoft.ws.dm;

  import javax.jws.WebParam;
  import javax.xml.bind.annotation.XmlType;
  import java.util.Date;

  @XmlType(name = "WSDMFascicoloChiudiInType", propOrder = { "codiceFascicolo", "annoFascicolo", "numeroFascicolo", "classificaFascicolo", "oggettoFascicolo", "custode" })
  public class WSDMFascicoloChiudiIn {

    public String getCodiceFascicolo() {
      return codiceFascicolo;
    }

    public void setCodiceFascicolo(String codiceFascicolo) {
      this.codiceFascicolo = codiceFascicolo;
    }

    public Long getAnnoFascicolo() {
      return annoFascicolo;
    }

    public void setAnnoFascicolo(Long annoFascicolo) {
      this.annoFascicolo = annoFascicolo;
    }

    public String getNumeroFascicolo() {
      return numeroFascicolo;
    }

    public void setNumeroFascicolo(String numeroFascicolo) {
      this.numeroFascicolo = numeroFascicolo;
    }

    public String getClassificaFascicolo() {
      return classificaFascicolo;
    }

    public void setClassificaFascicolo(String classificaFascicolo) {
      this.classificaFascicolo = classificaFascicolo;
    }

    public String getOggettoFascicolo() {
      return oggettoFascicolo;
    }

    public void setOggettoFascicolo(String oggettoFascicolo) {
      this.oggettoFascicolo = oggettoFascicolo;
    }

    public WSDMOperatore getCustode() {
      return custode;
    }

    public void setCustode(WSDMOperatore custode) {
      this.custode = custode;
    }

    private String codiceFascicolo;
    private Long annoFascicolo;
    private String numeroFascicolo;
    private String classificaFascicolo;
    private String oggettoFascicolo;
    private WSDMOperatore custode;



  }
