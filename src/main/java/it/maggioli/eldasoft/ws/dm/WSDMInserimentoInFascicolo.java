package it.maggioli.eldasoft.ws.dm;

import javax.xml.bind.annotation.XmlType;

@XmlType(name = "WSDMInserimentoInFascicoloType")
public enum WSDMInserimentoInFascicolo {
  NO, SI_FASCICOLO_NUOVO, SI_FASCICOLO_ESISTENTE
}
