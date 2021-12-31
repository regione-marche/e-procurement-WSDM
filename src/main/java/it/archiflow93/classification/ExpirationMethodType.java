
package it.archiflow93.classification;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ExpirationMethodType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ExpirationMethodType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Undefined"/>
 *     &lt;enumeration value="FromRegistrationDate"/>
 *     &lt;enumeration value="FromFolderClosingDate"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ExpirationMethodType", namespace = "http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Types")
@XmlEnum
public enum ExpirationMethodType {

    @XmlEnumValue("Undefined")
    UNDEFINED("Undefined"),
    @XmlEnumValue("FromRegistrationDate")
    FROM_REGISTRATION_DATE("FromRegistrationDate"),
    @XmlEnumValue("FromFolderClosingDate")
    FROM_FOLDER_CLOSING_DATE("FromFolderClosingDate");
    private final String value;

    ExpirationMethodType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ExpirationMethodType fromValue(String v) {
        for (ExpirationMethodType c: ExpirationMethodType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
