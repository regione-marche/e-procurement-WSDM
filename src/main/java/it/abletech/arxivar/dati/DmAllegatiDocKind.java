
package it.abletech.arxivar.dati;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Dm_AllegatiDoc_Kind.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="Dm_AllegatiDoc_Kind">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="ExternalAttachement"/>
 *     &lt;enumeration value="InternalAttachement"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "Dm_AllegatiDoc_Kind")
@XmlEnum
public enum DmAllegatiDocKind {

    @XmlEnumValue("ExternalAttachement")
    EXTERNAL_ATTACHEMENT("ExternalAttachement"),
    @XmlEnumValue("InternalAttachement")
    INTERNAL_ATTACHEMENT("InternalAttachement");
    private final String value;

    DmAllegatiDocKind(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DmAllegatiDocKind fromValue(String v) {
        for (DmAllegatiDocKind c: DmAllegatiDocKind.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
