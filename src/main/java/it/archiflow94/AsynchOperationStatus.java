
package it.archiflow94;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AsynchOperationStatus.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="AsynchOperationStatus">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="AsyncOpStatusUnknown"/>
 *     &lt;enumeration value="AsyncOpStatusRunning"/>
 *     &lt;enumeration value="AsyncOpStatusCompleted"/>
 *     &lt;enumeration value="AsyncOpStatusFailed"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "AsynchOperationStatus", namespace = "http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Types")
@XmlEnum
public enum AsynchOperationStatus {

    @XmlEnumValue("AsyncOpStatusUnknown")
    ASYNC_OP_STATUS_UNKNOWN("AsyncOpStatusUnknown"),
    @XmlEnumValue("AsyncOpStatusRunning")
    ASYNC_OP_STATUS_RUNNING("AsyncOpStatusRunning"),
    @XmlEnumValue("AsyncOpStatusCompleted")
    ASYNC_OP_STATUS_COMPLETED("AsyncOpStatusCompleted"),
    @XmlEnumValue("AsyncOpStatusFailed")
    ASYNC_OP_STATUS_FAILED("AsyncOpStatusFailed");
    private final String value;

    AsynchOperationStatus(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static AsynchOperationStatus fromValue(String v) {
        for (AsynchOperationStatus c: AsynchOperationStatus.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
