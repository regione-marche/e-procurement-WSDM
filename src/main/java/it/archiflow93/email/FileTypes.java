
package it.archiflow93.email;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FileTypes.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="FileTypes">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="File"/>
 *     &lt;enumeration value="TIFFG4"/>
 *     &lt;enumeration value="GENERICO_RASTER"/>
 *     &lt;enumeration value="SPOOL"/>
 *     &lt;enumeration value="GENERICO"/>
 *     &lt;enumeration value="TIPO_POSTEL"/>
 *     &lt;enumeration value="TIPO_SCANBATCH"/>
 *     &lt;enumeration value="TIPO_FATTURA_PA"/>
 *     &lt;enumeration value="TIPO_INVOICE_XML_LOTTO"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "FileTypes", namespace = "http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Types")
@XmlEnum
public enum FileTypes {

    @XmlEnumValue("File")
    FILE("File"),
    @XmlEnumValue("TIFFG4")
    TIFFG_4("TIFFG4"),
    GENERICO_RASTER("GENERICO_RASTER"),
    SPOOL("SPOOL"),
    GENERICO("GENERICO"),
    TIPO_POSTEL("TIPO_POSTEL"),
    TIPO_SCANBATCH("TIPO_SCANBATCH"),
    TIPO_FATTURA_PA("TIPO_FATTURA_PA"),
    TIPO_INVOICE_XML_LOTTO("TIPO_INVOICE_XML_LOTTO");
    private final String value;

    FileTypes(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static FileTypes fromValue(String v) {
        for (FileTypes c: FileTypes.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
