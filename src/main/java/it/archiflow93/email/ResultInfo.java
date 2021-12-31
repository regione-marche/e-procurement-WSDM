
package it.archiflow93.email;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ResultInfo.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ResultInfo">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="NULL"/>
 *     &lt;enumeration value="OK"/>
 *     &lt;enumeration value="SERVER_ERROR"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ResultInfo", namespace = "http://schemas.datacontract.org/2004/07/SIAV.Common.BaseClass.Types")
@XmlEnum
public enum ResultInfo {

    NULL,
    OK,
    SERVER_ERROR;

    public String value() {
        return name();
    }

    public static ResultInfo fromValue(String v) {
        return valueOf(v);
    }

}
