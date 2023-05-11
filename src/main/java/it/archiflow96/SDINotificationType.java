
package it.archiflow96;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SDINotificationType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="SDINotificationType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="XMLSDI_Undefined"/>
 *     &lt;enumeration value="XMLSDI_MT"/>
 *     &lt;enumeration value="XMLSDI_NS"/>
 *     &lt;enumeration value="XMLSDI_MC"/>
 *     &lt;enumeration value="XMLSDI_RC"/>
 *     &lt;enumeration value="XMLSDI_EC"/>
 *     &lt;enumeration value="XMLSDI_SE"/>
 *     &lt;enumeration value="XMLSDI_NE"/>
 *     &lt;enumeration value="XMLSDI_DT"/>
 *     &lt;enumeration value="XMLSDI_AT"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "SDINotificationType", namespace = "http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Types")
@XmlEnum
public enum SDINotificationType {

    @XmlEnumValue("XMLSDI_Undefined")
    XMLSDI_UNDEFINED("XMLSDI_Undefined"),
    XMLSDI_MT("XMLSDI_MT"),
    XMLSDI_NS("XMLSDI_NS"),
    XMLSDI_MC("XMLSDI_MC"),
    XMLSDI_RC("XMLSDI_RC"),
    XMLSDI_EC("XMLSDI_EC"),
    XMLSDI_SE("XMLSDI_SE"),
    XMLSDI_NE("XMLSDI_NE"),
    XMLSDI_DT("XMLSDI_DT"),
    XMLSDI_AT("XMLSDI_AT");
    private final String value;

    SDINotificationType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SDINotificationType fromValue(String v) {
        for (SDINotificationType c: SDINotificationType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
