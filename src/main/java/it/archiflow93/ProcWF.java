
package it.archiflow93;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ProcWF.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ProcWF">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="PWFNothing"/>
 *     &lt;enumeration value="PWFSuspended"/>
 *     &lt;enumeration value="PWFInternalData"/>
 *     &lt;enumeration value="PWFExternalData"/>
 *     &lt;enumeration value="PWFInitError"/>
 *     &lt;enumeration value="PWFUnknownData"/>
 *     &lt;enumeration value="PWFCompleted"/>
 *     &lt;enumeration value="PWFInterrupted"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ProcWF", namespace = "http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Types")
@XmlEnum
public enum ProcWF {

    @XmlEnumValue("PWFNothing")
    PWF_NOTHING("PWFNothing"),
    @XmlEnumValue("PWFSuspended")
    PWF_SUSPENDED("PWFSuspended"),
    @XmlEnumValue("PWFInternalData")
    PWF_INTERNAL_DATA("PWFInternalData"),
    @XmlEnumValue("PWFExternalData")
    PWF_EXTERNAL_DATA("PWFExternalData"),
    @XmlEnumValue("PWFInitError")
    PWF_INIT_ERROR("PWFInitError"),
    @XmlEnumValue("PWFUnknownData")
    PWF_UNKNOWN_DATA("PWFUnknownData"),
    @XmlEnumValue("PWFCompleted")
    PWF_COMPLETED("PWFCompleted"),
    @XmlEnumValue("PWFInterrupted")
    PWF_INTERRUPTED("PWFInterrupted");
    private final String value;

    ProcWF(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ProcWF fromValue(String v) {
        for (ProcWF c: ProcWF.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
