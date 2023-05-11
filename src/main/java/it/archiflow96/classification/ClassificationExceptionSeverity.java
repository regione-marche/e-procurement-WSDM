
package it.archiflow96.classification;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ClassificationExceptionSeverity.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ClassificationExceptionSeverity">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="cesSuccessInfo"/>
 *     &lt;enumeration value="cesApplicationError"/>
 *     &lt;enumeration value="cesDbError"/>
 *     &lt;enumeration value="cesError"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ClassificationExceptionSeverity", namespace = "http://schemas.datacontract.org/2004/07/SIAV.Classification.Entities.Common.ValueObject")
@XmlEnum
public enum ClassificationExceptionSeverity {

    @XmlEnumValue("cesSuccessInfo")
    CES_SUCCESS_INFO("cesSuccessInfo"),
    @XmlEnumValue("cesApplicationError")
    CES_APPLICATION_ERROR("cesApplicationError"),
    @XmlEnumValue("cesDbError")
    CES_DB_ERROR("cesDbError"),
    @XmlEnumValue("cesError")
    CES_ERROR("cesError");
    private final String value;

    ClassificationExceptionSeverity(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ClassificationExceptionSeverity fromValue(String v) {
        for (ClassificationExceptionSeverity c: ClassificationExceptionSeverity.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
