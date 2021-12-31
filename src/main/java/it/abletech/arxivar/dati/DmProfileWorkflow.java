
package it.abletech.arxivar.dati;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Dm_Profile_Workflow.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="Dm_Profile_Workflow">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Nessuno"/>
 *     &lt;enumeration value="InCorso"/>
 *     &lt;enumeration value="Concluso"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "Dm_Profile_Workflow")
@XmlEnum
public enum DmProfileWorkflow {

    @XmlEnumValue("Nessuno")
    NESSUNO("Nessuno"),
    @XmlEnumValue("InCorso")
    IN_CORSO("InCorso"),
    @XmlEnumValue("Concluso")
    CONCLUSO("Concluso");
    private final String value;

    DmProfileWorkflow(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DmProfileWorkflow fromValue(String v) {
        for (DmProfileWorkflow c: DmProfileWorkflow.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
