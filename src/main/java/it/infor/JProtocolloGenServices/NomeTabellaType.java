
package it.infor.JProtocolloGenServices;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for nomeTabellaType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="nomeTabellaType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="CORRISPONDENTI"/>
 *     &lt;enumeration value="TITOLARIO"/>
 *     &lt;enumeration value="TIPIDOCUMENTO"/>
 *     &lt;enumeration value="TRAMITE"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "nomeTabellaType")
@XmlEnum
public enum NomeTabellaType {

    CORRISPONDENTI,
    TITOLARIO,
    TIPIDOCUMENTO,
    TRAMITE;

    public String value() {
        return name();
    }

    public static NomeTabellaType fromValue(String v) {
        return valueOf(v);
    }

}
