
package it.abletech.arxivar.search;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AllegatiWork_SearchMode.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="AllegatiWork_SearchMode">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="RunningProcess"/>
 *     &lt;enumeration value="CompletedProcess"/>
 *     &lt;enumeration value="Both"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "AllegatiWork_SearchMode")
@XmlEnum
public enum AllegatiWorkSearchMode {

    @XmlEnumValue("RunningProcess")
    RUNNING_PROCESS("RunningProcess"),
    @XmlEnumValue("CompletedProcess")
    COMPLETED_PROCESS("CompletedProcess"),
    @XmlEnumValue("Both")
    BOTH("Both");
    private final String value;

    AllegatiWorkSearchMode(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static AllegatiWorkSearchMode fromValue(String v) {
        for (AllegatiWorkSearchMode c: AllegatiWorkSearchMode.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
