
package it.archiflow93;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FieldToOrderBy.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="FieldToOrderBy">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="CardArchive"/>
 *     &lt;enumeration value="DocumentType"/>
 *     &lt;enumeration value="Reference"/>
 *     &lt;enumeration value="DateReg"/>
 *     &lt;enumeration value="Protocol"/>
 *     &lt;enumeration value="DateDoc"/>
 *     &lt;enumeration value="Key11"/>
 *     &lt;enumeration value="Key12"/>
 *     &lt;enumeration value="Key13"/>
 *     &lt;enumeration value="Key14"/>
 *     &lt;enumeration value="Key15"/>
 *     &lt;enumeration value="Key21"/>
 *     &lt;enumeration value="Key22"/>
 *     &lt;enumeration value="Key23"/>
 *     &lt;enumeration value="Key24"/>
 *     &lt;enumeration value="Key25"/>
 *     &lt;enumeration value="Key31"/>
 *     &lt;enumeration value="Key32"/>
 *     &lt;enumeration value="Key33"/>
 *     &lt;enumeration value="Key34"/>
 *     &lt;enumeration value="Key35"/>
 *     &lt;enumeration value="Key41"/>
 *     &lt;enumeration value="Key42"/>
 *     &lt;enumeration value="Key43"/>
 *     &lt;enumeration value="Key44"/>
 *     &lt;enumeration value="Key45"/>
 *     &lt;enumeration value="Obj"/>
 *     &lt;enumeration value="ExistDocPrinc"/>
 *     &lt;enumeration value="NumPag"/>
 *     &lt;enumeration value="ExistCheckInOut"/>
 *     &lt;enumeration value="ExistsAttach"/>
 *     &lt;enumeration value="ExistFascStd"/>
 *     &lt;enumeration value="ExistFascArch"/>
 *     &lt;enumeration value="ExistClass"/>
 *     &lt;enumeration value="ExistCC"/>
 *     &lt;enumeration value="ExistAnnot"/>
 *     &lt;enumeration value="Anag"/>
 *     &lt;enumeration value="AddKey1"/>
 *     &lt;enumeration value="AddKey2"/>
 *     &lt;enumeration value="AddKey3"/>
 *     &lt;enumeration value="AddKey4"/>
 *     &lt;enumeration value="AddKey5"/>
 *     &lt;enumeration value="AddVarie"/>
 *     &lt;enumeration value="AddList1"/>
 *     &lt;enumeration value="AddList2"/>
 *     &lt;enumeration value="AddList3"/>
 *     &lt;enumeration value="Message"/>
 *     &lt;enumeration value="MailDate"/>
 *     &lt;enumeration value="MailTime"/>
 *     &lt;enumeration value="MailSender"/>
 *     &lt;enumeration value="MailIsRead"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "FieldToOrderBy", namespace = "http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Types")
@XmlEnum
public enum FieldToOrderBy {

    @XmlEnumValue("CardArchive")
    CARD_ARCHIVE("CardArchive"),
    @XmlEnumValue("DocumentType")
    DOCUMENT_TYPE("DocumentType"),
    @XmlEnumValue("Reference")
    REFERENCE("Reference"),
    @XmlEnumValue("DateReg")
    DATE_REG("DateReg"),
    @XmlEnumValue("Protocol")
    PROTOCOL("Protocol"),
    @XmlEnumValue("DateDoc")
    DATE_DOC("DateDoc"),
    @XmlEnumValue("Key11")
    KEY_11("Key11"),
    @XmlEnumValue("Key12")
    KEY_12("Key12"),
    @XmlEnumValue("Key13")
    KEY_13("Key13"),
    @XmlEnumValue("Key14")
    KEY_14("Key14"),
    @XmlEnumValue("Key15")
    KEY_15("Key15"),
    @XmlEnumValue("Key21")
    KEY_21("Key21"),
    @XmlEnumValue("Key22")
    KEY_22("Key22"),
    @XmlEnumValue("Key23")
    KEY_23("Key23"),
    @XmlEnumValue("Key24")
    KEY_24("Key24"),
    @XmlEnumValue("Key25")
    KEY_25("Key25"),
    @XmlEnumValue("Key31")
    KEY_31("Key31"),
    @XmlEnumValue("Key32")
    KEY_32("Key32"),
    @XmlEnumValue("Key33")
    KEY_33("Key33"),
    @XmlEnumValue("Key34")
    KEY_34("Key34"),
    @XmlEnumValue("Key35")
    KEY_35("Key35"),
    @XmlEnumValue("Key41")
    KEY_41("Key41"),
    @XmlEnumValue("Key42")
    KEY_42("Key42"),
    @XmlEnumValue("Key43")
    KEY_43("Key43"),
    @XmlEnumValue("Key44")
    KEY_44("Key44"),
    @XmlEnumValue("Key45")
    KEY_45("Key45"),
    @XmlEnumValue("Obj")
    OBJ("Obj"),
    @XmlEnumValue("ExistDocPrinc")
    EXIST_DOC_PRINC("ExistDocPrinc"),
    @XmlEnumValue("NumPag")
    NUM_PAG("NumPag"),
    @XmlEnumValue("ExistCheckInOut")
    EXIST_CHECK_IN_OUT("ExistCheckInOut"),
    @XmlEnumValue("ExistsAttach")
    EXISTS_ATTACH("ExistsAttach"),
    @XmlEnumValue("ExistFascStd")
    EXIST_FASC_STD("ExistFascStd"),
    @XmlEnumValue("ExistFascArch")
    EXIST_FASC_ARCH("ExistFascArch"),
    @XmlEnumValue("ExistClass")
    EXIST_CLASS("ExistClass"),
    @XmlEnumValue("ExistCC")
    EXIST_CC("ExistCC"),
    @XmlEnumValue("ExistAnnot")
    EXIST_ANNOT("ExistAnnot"),
    @XmlEnumValue("Anag")
    ANAG("Anag"),
    @XmlEnumValue("AddKey1")
    ADD_KEY_1("AddKey1"),
    @XmlEnumValue("AddKey2")
    ADD_KEY_2("AddKey2"),
    @XmlEnumValue("AddKey3")
    ADD_KEY_3("AddKey3"),
    @XmlEnumValue("AddKey4")
    ADD_KEY_4("AddKey4"),
    @XmlEnumValue("AddKey5")
    ADD_KEY_5("AddKey5"),
    @XmlEnumValue("AddVarie")
    ADD_VARIE("AddVarie"),
    @XmlEnumValue("AddList1")
    ADD_LIST_1("AddList1"),
    @XmlEnumValue("AddList2")
    ADD_LIST_2("AddList2"),
    @XmlEnumValue("AddList3")
    ADD_LIST_3("AddList3"),
    @XmlEnumValue("Message")
    MESSAGE("Message"),
    @XmlEnumValue("MailDate")
    MAIL_DATE("MailDate"),
    @XmlEnumValue("MailTime")
    MAIL_TIME("MailTime"),
    @XmlEnumValue("MailSender")
    MAIL_SENDER("MailSender"),
    @XmlEnumValue("MailIsRead")
    MAIL_IS_READ("MailIsRead");
    private final String value;

    FieldToOrderBy(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static FieldToOrderBy fromValue(String v) {
        for (FieldToOrderBy c: FieldToOrderBy.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
