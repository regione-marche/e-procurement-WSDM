
package it.archiflow96;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ImageFormat.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ImageFormat">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Unknown"/>
 *     &lt;enumeration value="bmp"/>
 *     &lt;enumeration value="jpg"/>
 *     &lt;enumeration value="png"/>
 *     &lt;enumeration value="tif"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ImageFormat", namespace = "http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Types")
@XmlEnum
public enum ImageFormat {

    @XmlEnumValue("Unknown")
    UNKNOWN("Unknown"),
    @XmlEnumValue("bmp")
    BMP("bmp"),
    @XmlEnumValue("jpg")
    JPG("jpg"),
    @XmlEnumValue("png")
    PNG("png"),
    @XmlEnumValue("tif")
    TIF("tif");
    private final String value;

    ImageFormat(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ImageFormat fromValue(String v) {
        for (ImageFormat c: ImageFormat.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
