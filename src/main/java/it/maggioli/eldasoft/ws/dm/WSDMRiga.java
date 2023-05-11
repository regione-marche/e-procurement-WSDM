package it.maggioli.eldasoft.ws.dm;

import javax.xml.bind.annotation.XmlType;

@XmlType(name = "WSDMRigaType", propOrder = { "numero", "campo" })
public class WSDMRiga {

  private Long        numero;
  private WSDMCampo[] campo;

  public Long getNumero() {
    return numero;
  }

  public void setNumero(Long numero) {
    this.numero = numero;
  }

  public WSDMCampo[] getCampo() {
    return campo;
  }

  public void setCampo(WSDMCampo[] campo) {
    this.campo = campo;
  }

}
