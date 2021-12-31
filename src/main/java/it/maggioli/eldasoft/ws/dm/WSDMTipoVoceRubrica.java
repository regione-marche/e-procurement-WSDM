package it.maggioli.eldasoft.ws.dm;

import javax.xml.bind.annotation.XmlType;

@XmlType(name = "WSDMTipoVoceRubricaType")
public enum WSDMTipoVoceRubrica {
  INDEFINITO, AMMINISTRAZIONE, AOO, UO, PERSONA, ALTRO, IMPRESA
}
