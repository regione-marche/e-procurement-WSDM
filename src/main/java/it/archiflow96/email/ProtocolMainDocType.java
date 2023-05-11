
package it.archiflow96.email;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ProtocolMainDocType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ProtocolMainDocType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="PMDTNone"/>
 *     &lt;enumeration value="PDTAnalogic"/>
 *     &lt;enumeration value="PDTDigital"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ProtocolMainDocType", namespace = "http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Types")
@XmlEnum
public enum ProtocolMainDocType {

    @XmlEnumValue("PMDTNone")
    PMDT_NONE("PMDTNone"),
    @XmlEnumValue("PDTAnalogic")
    PDT_ANALOGIC("PDTAnalogic"),
    @XmlEnumValue("PDTDigital")
    PDT_DIGITAL("PDTDigital");
    private final String value;

    ProtocolMainDocType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ProtocolMainDocType fromValue(String v) {
        for (ProtocolMainDocType c: ProtocolMainDocType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
