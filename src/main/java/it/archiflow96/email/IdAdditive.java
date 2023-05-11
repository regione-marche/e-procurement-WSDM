
package it.archiflow96.email;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for IdAdditive.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="IdAdditive">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="IaData1"/>
 *     &lt;enumeration value="IaData2"/>
 *     &lt;enumeration value="IaData3"/>
 *     &lt;enumeration value="IaData4"/>
 *     &lt;enumeration value="IaData5"/>
 *     &lt;enumeration value="IaList1"/>
 *     &lt;enumeration value="IaList2"/>
 *     &lt;enumeration value="IaList3"/>
 *     &lt;enumeration value="IaDataOpt"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "IdAdditive", namespace = "http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Types")
@XmlEnum
public enum IdAdditive {

    @XmlEnumValue("IaData1")
    IA_DATA_1("IaData1"),
    @XmlEnumValue("IaData2")
    IA_DATA_2("IaData2"),
    @XmlEnumValue("IaData3")
    IA_DATA_3("IaData3"),
    @XmlEnumValue("IaData4")
    IA_DATA_4("IaData4"),
    @XmlEnumValue("IaData5")
    IA_DATA_5("IaData5"),
    @XmlEnumValue("IaList1")
    IA_LIST_1("IaList1"),
    @XmlEnumValue("IaList2")
    IA_LIST_2("IaList2"),
    @XmlEnumValue("IaList3")
    IA_LIST_3("IaList3"),
    @XmlEnumValue("IaDataOpt")
    IA_DATA_OPT("IaDataOpt");
    private final String value;

    IdAdditive(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static IdAdditive fromValue(String v) {
        for (IdAdditive c: IdAdditive.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
