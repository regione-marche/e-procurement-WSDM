
package it.archiflow94;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for IdRegistryField.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="IdRegistryField">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="IrName"/>
 *     &lt;enumeration value="IrSurname"/>
 *     &lt;enumeration value="IrNickName"/>
 *     &lt;enumeration value="IrAddress"/>
 *     &lt;enumeration value="IrVillage"/>
 *     &lt;enumeration value="IrCity"/>
 *     &lt;enumeration value="IrCountry"/>
 *     &lt;enumeration value="IrZip"/>
 *     &lt;enumeration value="IrPrivateCode"/>
 *     &lt;enumeration value="IrHomeEmail"/>
 *     &lt;enumeration value="IrOfficeEmail"/>
 *     &lt;enumeration value="IrFax"/>
 *     &lt;enumeration value="IrHomePhone"/>
 *     &lt;enumeration value="IrOfficePhone"/>
 *     &lt;enumeration value="IrMobile"/>
 *     &lt;enumeration value="IrUnknown"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "IdRegistryField", namespace = "http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Types")
@XmlEnum
public enum IdRegistryField {

    @XmlEnumValue("IrName")
    IR_NAME("IrName"),
    @XmlEnumValue("IrSurname")
    IR_SURNAME("IrSurname"),
    @XmlEnumValue("IrNickName")
    IR_NICK_NAME("IrNickName"),
    @XmlEnumValue("IrAddress")
    IR_ADDRESS("IrAddress"),
    @XmlEnumValue("IrVillage")
    IR_VILLAGE("IrVillage"),
    @XmlEnumValue("IrCity")
    IR_CITY("IrCity"),
    @XmlEnumValue("IrCountry")
    IR_COUNTRY("IrCountry"),
    @XmlEnumValue("IrZip")
    IR_ZIP("IrZip"),
    @XmlEnumValue("IrPrivateCode")
    IR_PRIVATE_CODE("IrPrivateCode"),
    @XmlEnumValue("IrHomeEmail")
    IR_HOME_EMAIL("IrHomeEmail"),
    @XmlEnumValue("IrOfficeEmail")
    IR_OFFICE_EMAIL("IrOfficeEmail"),
    @XmlEnumValue("IrFax")
    IR_FAX("IrFax"),
    @XmlEnumValue("IrHomePhone")
    IR_HOME_PHONE("IrHomePhone"),
    @XmlEnumValue("IrOfficePhone")
    IR_OFFICE_PHONE("IrOfficePhone"),
    @XmlEnumValue("IrMobile")
    IR_MOBILE("IrMobile"),
    @XmlEnumValue("IrUnknown")
    IR_UNKNOWN("IrUnknown");
    private final String value;

    IdRegistryField(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static IdRegistryField fromValue(String v) {
        for (IdRegistryField c: IdRegistryField.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
