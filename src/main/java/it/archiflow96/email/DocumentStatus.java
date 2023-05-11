
package it.archiflow96.email;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DocumentStatus.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="DocumentStatus">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="DsNone"/>
 *     &lt;enumeration value="DsCheckOut"/>
 *     &lt;enumeration value="DsCheckOutOther"/>
 *     &lt;enumeration value="DsCheckIn"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "DocumentStatus", namespace = "http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Types")
@XmlEnum
public enum DocumentStatus {

    @XmlEnumValue("DsNone")
    DS_NONE("DsNone"),
    @XmlEnumValue("DsCheckOut")
    DS_CHECK_OUT("DsCheckOut"),
    @XmlEnumValue("DsCheckOutOther")
    DS_CHECK_OUT_OTHER("DsCheckOutOther"),
    @XmlEnumValue("DsCheckIn")
    DS_CHECK_IN("DsCheckIn");
    private final String value;

    DocumentStatus(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DocumentStatus fromValue(String v) {
        for (DocumentStatus c: DocumentStatus.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
