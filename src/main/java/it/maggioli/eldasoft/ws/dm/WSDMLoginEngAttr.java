package it.maggioli.eldasoft.ws.dm;

import javax.xml.bind.annotation.XmlType;

@XmlType(name = "WSDMLoginEngAttrType", propOrder = { "idUtente", "idUtenteUnitaOperativa" })
public class WSDMLoginEngAttr {

  private String idUtente;
  private String idUtenteUnitaOperativa;
  
  public String getIdUtente() {
    return idUtente;
  }
  
  public void setIdUtente(String idUtente) {
    this.idUtente = idUtente;
  }
  
  public String getIdUtenteUnitaOperativa() {
    return idUtenteUnitaOperativa;
  }
  
  public void setIdUtenteUnitaOperativa(String idUtenteUnitaOperativa) {
    this.idUtenteUnitaOperativa = idUtenteUnitaOperativa;
  }

}
