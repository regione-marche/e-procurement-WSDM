
package it.abletech.arxivar.search;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TaskWorork_SearchMode.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TaskWorork_SearchMode">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="RunningTasks"/>
 *     &lt;enumeration value="CompletedTasks"/>
 *     &lt;enumeration value="Both"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "TaskWorork_SearchMode")
@XmlEnum
public enum TaskWororkSearchMode {

    @XmlEnumValue("RunningTasks")
    RUNNING_TASKS("RunningTasks"),
    @XmlEnumValue("CompletedTasks")
    COMPLETED_TASKS("CompletedTasks"),
    @XmlEnumValue("Both")
    BOTH("Both");
    private final String value;

    TaskWororkSearchMode(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TaskWororkSearchMode fromValue(String v) {
        for (TaskWororkSearchMode c: TaskWororkSearchMode.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
