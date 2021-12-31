
package it.archiflow96;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for WfCardStatusFilter.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="WfCardStatusFilter">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="WfCSFAll"/>
 *     &lt;enumeration value="WfCSFRunning"/>
 *     &lt;enumeration value="WfCSFCompleted"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "WfCardStatusFilter", namespace = "http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Types")
@XmlEnum
public enum WfCardStatusFilter {

    @XmlEnumValue("WfCSFAll")
    WF_CSF_ALL("WfCSFAll"),
    @XmlEnumValue("WfCSFRunning")
    WF_CSF_RUNNING("WfCSFRunning"),
    @XmlEnumValue("WfCSFCompleted")
    WF_CSF_COMPLETED("WfCSFCompleted");
    private final String value;

    WfCardStatusFilter(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static WfCardStatusFilter fromValue(String v) {
        for (WfCardStatusFilter c: WfCardStatusFilter.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
