
package it.archiflow94;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CompCertModelType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CompCertModelType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="CCMTypeAll"/>
 *     &lt;enumeration value="CCMTypeAnalog"/>
 *     &lt;enumeration value="CCMTypeDigital"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "CompCertModelType", namespace = "http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Types")
@XmlEnum
public enum CompCertModelType {

    @XmlEnumValue("CCMTypeAll")
    CCM_TYPE_ALL("CCMTypeAll"),
    @XmlEnumValue("CCMTypeAnalog")
    CCM_TYPE_ANALOG("CCMTypeAnalog"),
    @XmlEnumValue("CCMTypeDigital")
    CCM_TYPE_DIGITAL("CCMTypeDigital");
    private final String value;

    CompCertModelType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CompCertModelType fromValue(String v) {
        for (CompCertModelType c: CompCertModelType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
