
package it.archiflow93;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for WebLinkType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="WebLinkType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="WLTUndefined"/>
 *     &lt;enumeration value="WLTCard"/>
 *     &lt;enumeration value="WLTCardDoc"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "WebLinkType", namespace = "http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Types")
@XmlEnum
public enum WebLinkType {

    @XmlEnumValue("WLTUndefined")
    WLT_UNDEFINED("WLTUndefined"),
    @XmlEnumValue("WLTCard")
    WLT_CARD("WLTCard"),
    @XmlEnumValue("WLTCardDoc")
    WLT_CARD_DOC("WLTCardDoc");
    private final String value;

    WebLinkType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static WebLinkType fromValue(String v) {
        for (WebLinkType c: WebLinkType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
