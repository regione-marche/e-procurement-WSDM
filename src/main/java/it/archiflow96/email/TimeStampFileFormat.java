
package it.archiflow96.email;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TimeStampFileFormat.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TimeStampFileFormat">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="TSUndefinedFormat"/>
 *     &lt;enumeration value="TSTSRFormat"/>
 *     &lt;enumeration value="TSMIMFormat"/>
 *     &lt;enumeration value="TSM7MFormat"/>
 *     &lt;enumeration value="TSTSDFormat"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "TimeStampFileFormat", namespace = "http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Types")
@XmlEnum
public enum TimeStampFileFormat {

    @XmlEnumValue("TSUndefinedFormat")
    TS_UNDEFINED_FORMAT("TSUndefinedFormat"),
    @XmlEnumValue("TSTSRFormat")
    TSTSR_FORMAT("TSTSRFormat"),
    @XmlEnumValue("TSMIMFormat")
    TSMIM_FORMAT("TSMIMFormat"),
    @XmlEnumValue("TSM7MFormat")
    TSM_7_M_FORMAT("TSM7MFormat"),
    @XmlEnumValue("TSTSDFormat")
    TSTSD_FORMAT("TSTSDFormat");
    private final String value;

    TimeStampFileFormat(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TimeStampFileFormat fromValue(String v) {
        for (TimeStampFileFormat c: TimeStampFileFormat.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
