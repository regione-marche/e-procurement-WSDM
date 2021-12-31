
package it.abletech.arxivar.dati;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Dm_Pn_Device_Kind.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="Dm_Pn_Device_Kind">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="IOS"/>
 *     &lt;enumeration value="ANDROID"/>
 *     &lt;enumeration value="WINDOWSPHONE"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "Dm_Pn_Device_Kind")
@XmlEnum
public enum DmPnDeviceKind {

    IOS,
    ANDROID,
    WINDOWSPHONE;

    public String value() {
        return name();
    }

    public static DmPnDeviceKind fromValue(String v) {
        return valueOf(v);
    }

}
