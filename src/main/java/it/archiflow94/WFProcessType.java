
package it.archiflow94;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for WFProcessType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="WFProcessType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="svTWFNothing"/>
 *     &lt;enumeration value="svTWFAutomatic"/>
 *     &lt;enumeration value="svTWFUser"/>
 *     &lt;enumeration value="svTWFConditioned"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "WFProcessType", namespace = "http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Types")
@XmlEnum
public enum WFProcessType {

    @XmlEnumValue("svTWFNothing")
    SV_TWF_NOTHING("svTWFNothing"),
    @XmlEnumValue("svTWFAutomatic")
    SV_TWF_AUTOMATIC("svTWFAutomatic"),
    @XmlEnumValue("svTWFUser")
    SV_TWF_USER("svTWFUser"),
    @XmlEnumValue("svTWFConditioned")
    SV_TWF_CONDITIONED("svTWFConditioned");
    private final String value;

    WFProcessType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static WFProcessType fromValue(String v) {
        for (WFProcessType c: WFProcessType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
