
package it.archiflow93;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CreatingZipError.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CreatingZipError">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="CZNoError"/>
 *     &lt;enumeration value="CZGenericError"/>
 *     &lt;enumeration value="CZErrorNoCard"/>
 *     &lt;enumeration value="CZErrorNoFile"/>
 *     &lt;enumeration value="CZErrorMaxCardsLimitExceeded"/>
 *     &lt;enumeration value="CZErrorTooBig"/>
 *     &lt;enumeration value="CZErrorTimeout"/>
 *     &lt;enumeration value="CZErrorReadingCardMainDoc"/>
 *     &lt;enumeration value="CZErrorReadingCardAtt"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "CreatingZipError", namespace = "http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Types")
@XmlEnum
public enum CreatingZipError {

    @XmlEnumValue("CZNoError")
    CZ_NO_ERROR("CZNoError"),
    @XmlEnumValue("CZGenericError")
    CZ_GENERIC_ERROR("CZGenericError"),
    @XmlEnumValue("CZErrorNoCard")
    CZ_ERROR_NO_CARD("CZErrorNoCard"),
    @XmlEnumValue("CZErrorNoFile")
    CZ_ERROR_NO_FILE("CZErrorNoFile"),
    @XmlEnumValue("CZErrorMaxCardsLimitExceeded")
    CZ_ERROR_MAX_CARDS_LIMIT_EXCEEDED("CZErrorMaxCardsLimitExceeded"),
    @XmlEnumValue("CZErrorTooBig")
    CZ_ERROR_TOO_BIG("CZErrorTooBig"),
    @XmlEnumValue("CZErrorTimeout")
    CZ_ERROR_TIMEOUT("CZErrorTimeout"),
    @XmlEnumValue("CZErrorReadingCardMainDoc")
    CZ_ERROR_READING_CARD_MAIN_DOC("CZErrorReadingCardMainDoc"),
    @XmlEnumValue("CZErrorReadingCardAtt")
    CZ_ERROR_READING_CARD_ATT("CZErrorReadingCardAtt");
    private final String value;

    CreatingZipError(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CreatingZipError fromValue(String v) {
        for (CreatingZipError c: CreatingZipError.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
