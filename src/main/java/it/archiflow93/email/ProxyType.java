
package it.archiflow93.email;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ProxyType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ProxyType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="None"/>
 *     &lt;enumeration value="Tunnel"/>
 *     &lt;enumeration value="SOCKS4"/>
 *     &lt;enumeration value="SOCKS5"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ProxyType", namespace = "http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Types")
@XmlEnum
public enum ProxyType {

    @XmlEnumValue("None")
    NONE("None"),
    @XmlEnumValue("Tunnel")
    TUNNEL("Tunnel"),
    @XmlEnumValue("SOCKS4")
    SOCKS_4("SOCKS4"),
    @XmlEnumValue("SOCKS5")
    SOCKS_5("SOCKS5");
    private final String value;

    ProxyType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ProxyType fromValue(String v) {
        for (ProxyType c: ProxyType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
