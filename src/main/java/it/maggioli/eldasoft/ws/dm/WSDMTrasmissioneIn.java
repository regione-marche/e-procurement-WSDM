package it.maggioli.eldasoft.ws.dm;

import javax.xml.bind.annotation.XmlType;

@XmlType(name = "WSDMTrasmissioneInType", propOrder = { "documenti" })
public class WSDMTrasmissioneIn {

  WSDMTrasmissioneDocumento[] documenti;

  public WSDMTrasmissioneDocumento[] getDocumenti() {
    return documenti;
  }

  public void setDocumenti(WSDMTrasmissioneDocumento[] documenti) {
    this.documenti = documenti;
  }

}
