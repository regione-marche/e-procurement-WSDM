
package it.archiflow94;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for UploadType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="UploadType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Start"/>
 *     &lt;enumeration value="DataStream"/>
 *     &lt;enumeration value="Finish"/>
 *     &lt;enumeration value="Break"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "UploadType", namespace = "http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Types")
@XmlEnum
public enum UploadType {

    @XmlEnumValue("Start")
    START("Start"),
    @XmlEnumValue("DataStream")
    DATA_STREAM("DataStream"),
    @XmlEnumValue("Finish")
    FINISH("Finish"),
    @XmlEnumValue("Break")
    BREAK("Break");
    private final String value;

    UploadType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static UploadType fromValue(String v) {
        for (UploadType c: UploadType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
