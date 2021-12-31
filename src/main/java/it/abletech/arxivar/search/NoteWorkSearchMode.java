
package it.abletech.arxivar.search;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for NoteWork_SearchMode.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="NoteWork_SearchMode">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="RunningProcess"/>
 *     &lt;enumeration value="CompletedProcess"/>
 *     &lt;enumeration value="Both"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "NoteWork_SearchMode")
@XmlEnum
public enum NoteWorkSearchMode {

    @XmlEnumValue("RunningProcess")
    RUNNING_PROCESS("RunningProcess"),
    @XmlEnumValue("CompletedProcess")
    COMPLETED_PROCESS("CompletedProcess"),
    @XmlEnumValue("Both")
    BOTH("Both");
    private final String value;

    NoteWorkSearchMode(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static NoteWorkSearchMode fromValue(String v) {
        for (NoteWorkSearchMode c: NoteWorkSearchMode.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
