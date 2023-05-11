package it.maggioli.eldasoft.ws.dm;

import java.util.Date;

import javax.xml.bind.annotation.XmlType;

@XmlType(name = "WSDMProtocolloModificaInType", propOrder = { "numeroDocumento", "livelloRiservatezza", "dataFineRiservatezza" })
public class WSDMProtocolloModificaIn {

  private String[] numeroDocumento;
  private String   livelloRiservatezza;
  private Date     dataFineRiservatezza;

  public String[] getNumeroDocumento() {
    return numeroDocumento;
  }

  public void setNumeroDocumento(String[] numeroDocumento) {
    this.numeroDocumento = numeroDocumento;
  }

  
  public String getLivelloRiservatezza() {
    return livelloRiservatezza;
  }

  
  public void setLivelloRiservatezza(String livelloRiservatezza) {
    this.livelloRiservatezza = livelloRiservatezza;
  }

  
  public Date getDataFineRiservatezza() {
    return dataFineRiservatezza;
  }

  
  public void setDataFineRiservatezza(Date dataFineRiservatezza) {
    this.dataFineRiservatezza = dataFineRiservatezza;
  }

}
