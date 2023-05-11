
package it.archiflow96;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArchiflowExceptionSeverity.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ArchiflowExceptionSeverity">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="SuccessInfo"/>
 *     &lt;enumeration value="ApplicationError"/>
 *     &lt;enumeration value="COMError"/>
 *     &lt;enumeration value="Error"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ArchiflowExceptionSeverity", namespace = "http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Exceptions")
@XmlEnum
public enum ArchiflowExceptionSeverity {

    @XmlEnumValue("SuccessInfo")
    SUCCESS_INFO("SuccessInfo"),
    @XmlEnumValue("ApplicationError")
    APPLICATION_ERROR("ApplicationError"),
    @XmlEnumValue("COMError")
    COM_ERROR("COMError"),
    @XmlEnumValue("Error")
    ERROR("Error");
    private final String value;

    ArchiflowExceptionSeverity(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ArchiflowExceptionSeverity fromValue(String v) {
        for (ArchiflowExceptionSeverity c: ArchiflowExceptionSeverity.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
