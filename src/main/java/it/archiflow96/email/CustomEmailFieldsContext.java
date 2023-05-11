
package it.archiflow96.email;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CustomEmailFieldsContext.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CustomEmailFieldsContext">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="CMFCGenericEmail"/>
 *     &lt;enumeration value="CMFCExternalEmail"/>
 *     &lt;enumeration value="CMFCExtendedEmail"/>
 *     &lt;enumeration value="CMFCPECEmail"/>
 *     &lt;enumeration value="CMFCPEOEmail"/>
 *     &lt;enumeration value="CMFCInteropEmail"/>
 *     &lt;enumeration value="CMFCPECInvoiceEmail"/>
 *     &lt;enumeration value="CMFCPEOInvoiceEmail"/>
 *     &lt;enumeration value="CMFCExternalInvoiceCopyEmail"/>
 *     &lt;enumeration value="CMFCExternalEmailSap"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "CustomEmailFieldsContext", namespace = "http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Types")
@XmlEnum
public enum CustomEmailFieldsContext {

    @XmlEnumValue("CMFCGenericEmail")
    CMFC_GENERIC_EMAIL("CMFCGenericEmail"),
    @XmlEnumValue("CMFCExternalEmail")
    CMFC_EXTERNAL_EMAIL("CMFCExternalEmail"),
    @XmlEnumValue("CMFCExtendedEmail")
    CMFC_EXTENDED_EMAIL("CMFCExtendedEmail"),
    @XmlEnumValue("CMFCPECEmail")
    CMFCPEC_EMAIL("CMFCPECEmail"),
    @XmlEnumValue("CMFCPEOEmail")
    CMFCPEO_EMAIL("CMFCPEOEmail"),
    @XmlEnumValue("CMFCInteropEmail")
    CMFC_INTEROP_EMAIL("CMFCInteropEmail"),
    @XmlEnumValue("CMFCPECInvoiceEmail")
    CMFCPEC_INVOICE_EMAIL("CMFCPECInvoiceEmail"),
    @XmlEnumValue("CMFCPEOInvoiceEmail")
    CMFCPEO_INVOICE_EMAIL("CMFCPEOInvoiceEmail"),
    @XmlEnumValue("CMFCExternalInvoiceCopyEmail")
    CMFC_EXTERNAL_INVOICE_COPY_EMAIL("CMFCExternalInvoiceCopyEmail"),
    @XmlEnumValue("CMFCExternalEmailSap")
    CMFC_EXTERNAL_EMAIL_SAP("CMFCExternalEmailSap");
    private final String value;

    CustomEmailFieldsContext(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CustomEmailFieldsContext fromValue(String v) {
        for (CustomEmailFieldsContext c: CustomEmailFieldsContext.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
