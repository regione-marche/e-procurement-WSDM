
package it.archiflow93.classification;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PreservationStatus.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="PreservationStatus">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="None"/>
 *     &lt;enumeration value="ToBePreserved"/>
 *     &lt;enumeration value="ToBeUpdated"/>
 *     &lt;enumeration value="Preserved"/>
 *     &lt;enumeration value="ArchivedInPda"/>
 *     &lt;enumeration value="Discarded"/>
 *     &lt;enumeration value="Error"/>
 *     &lt;enumeration value="PreservedWarning"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "PreservationStatus", namespace = "http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Types")
@XmlEnum
public enum PreservationStatus {

    @XmlEnumValue("None")
    NONE("None"),
    @XmlEnumValue("ToBePreserved")
    TO_BE_PRESERVED("ToBePreserved"),
    @XmlEnumValue("ToBeUpdated")
    TO_BE_UPDATED("ToBeUpdated"),
    @XmlEnumValue("Preserved")
    PRESERVED("Preserved"),
    @XmlEnumValue("ArchivedInPda")
    ARCHIVED_IN_PDA("ArchivedInPda"),
    @XmlEnumValue("Discarded")
    DISCARDED("Discarded"),
    @XmlEnumValue("Error")
    ERROR("Error"),
    @XmlEnumValue("PreservedWarning")
    PRESERVED_WARNING("PreservedWarning");
    private final String value;

    PreservationStatus(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PreservationStatus fromValue(String v) {
        for (PreservationStatus c: PreservationStatus.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
