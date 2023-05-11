
package it.archiflow94;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for InvoiceSearchCriteria complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="InvoiceSearchCriteria">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/SIAV.Common.Tools.Log}LoggableBase">
 *       &lt;sequence>
 *         &lt;element name="Barcode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Channels" type="{http://schemas.microsoft.com/2003/10/Serialization/Arrays}ArrayOfguid" minOccurs="0"/>
 *         &lt;element name="ConservationState" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CurrencyCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Customer" type="{http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Invoice.ValueObject}MemberInfo" minOccurs="0"/>
 *         &lt;element name="Error" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="FirstExpirationDate" type="{http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Invoice.ValueObject}RangeOfNullableOfdateTime5F2dSckg" minOccurs="0"/>
 *         &lt;element name="InsertDate" type="{http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Invoice.ValueObject}RangeOfNullableOfdateTime5F2dSckg" minOccurs="0"/>
 *         &lt;element name="InvoiceDate" type="{http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Invoice.ValueObject}RangeOfNullableOfdateTime5F2dSckg" minOccurs="0"/>
 *         &lt;element name="InvoiceNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Note" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PhaseList" type="{http://schemas.microsoft.com/2003/10/Serialization/Arrays}ArrayOfstring" minOccurs="0"/>
 *         &lt;element name="PublicationDate" type="{http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Invoice.ValueObject}RangeOfNullableOfdateTime5F2dSckg" minOccurs="0"/>
 *         &lt;element name="RegistrationDate" type="{http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Invoice.ValueObject}RangeOfNullableOfdateTime5F2dSckg" minOccurs="0"/>
 *         &lt;element name="Sdi" type="{http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Invoice.ValueObject}SdiInfo" minOccurs="0"/>
 *         &lt;element name="SendReceiveDate" type="{http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Invoice.ValueObject}RangeOfNullableOfdateTime5F2dSckg" minOccurs="0"/>
 *         &lt;element name="StatusList" type="{http://schemas.microsoft.com/2003/10/Serialization/Arrays}ArrayOfstring" minOccurs="0"/>
 *         &lt;element name="Supplier" type="{http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Invoice.ValueObject}MemberInfo" minOccurs="0"/>
 *         &lt;element name="Total" type="{http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Invoice.ValueObject}RangeOfNullableOfdecimal5F2dSckg" minOccurs="0"/>
 *         &lt;element name="Transmitter" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Type" type="{http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Invoice.ValueObject}InvoiceSearchCriteria.InvoiceFilterType"/>
 *         &lt;element name="UniqueProtocol" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="VatProtocol" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="VatRegister" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InvoiceSearchCriteria", namespace = "http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Invoice.ValueObject", propOrder = {
    "barcode",
    "channels",
    "conservationState",
    "currencyCode",
    "customer",
    "error",
    "firstExpirationDate",
    "insertDate",
    "invoiceDate",
    "invoiceNumber",
    "note",
    "phaseList",
    "publicationDate",
    "registrationDate",
    "sdi",
    "sendReceiveDate",
    "statusList",
    "supplier",
    "total",
    "transmitter",
    "type",
    "uniqueProtocol",
    "vatProtocol",
    "vatRegister"
})
public class InvoiceSearchCriteria
    extends LoggableBase
{

    @XmlElement(name = "Barcode", nillable = true)
    protected String barcode;
    @XmlElement(name = "Channels", nillable = true)
    protected ArrayOfguid channels;
    @XmlElement(name = "ConservationState", nillable = true)
    protected String conservationState;
    @XmlElement(name = "CurrencyCode", nillable = true)
    protected String currencyCode;
    @XmlElement(name = "Customer", nillable = true)
    protected MemberInfo customer;
    @XmlElement(name = "Error", nillable = true)
    protected Integer error;
    @XmlElement(name = "FirstExpirationDate", nillable = true)
    protected RangeOfNullableOfdateTime5F2DSckg firstExpirationDate;
    @XmlElement(name = "InsertDate", nillable = true)
    protected RangeOfNullableOfdateTime5F2DSckg insertDate;
    @XmlElement(name = "InvoiceDate", nillable = true)
    protected RangeOfNullableOfdateTime5F2DSckg invoiceDate;
    @XmlElement(name = "InvoiceNumber", nillable = true)
    protected String invoiceNumber;
    @XmlElement(name = "Note", nillable = true)
    protected String note;
    @XmlElement(name = "PhaseList", nillable = true)
    protected ArrayOfstring phaseList;
    @XmlElement(name = "PublicationDate", nillable = true)
    protected RangeOfNullableOfdateTime5F2DSckg publicationDate;
    @XmlElement(name = "RegistrationDate", nillable = true)
    protected RangeOfNullableOfdateTime5F2DSckg registrationDate;
    @XmlElement(name = "Sdi", nillable = true)
    protected SdiInfo sdi;
    @XmlElement(name = "SendReceiveDate", nillable = true)
    protected RangeOfNullableOfdateTime5F2DSckg sendReceiveDate;
    @XmlElement(name = "StatusList", nillable = true)
    protected ArrayOfstring statusList;
    @XmlElement(name = "Supplier", nillable = true)
    protected MemberInfo supplier;
    @XmlElement(name = "Total", nillable = true)
    protected RangeOfNullableOfdecimal5F2DSckg total;
    @XmlElement(name = "Transmitter", nillable = true)
    protected String transmitter;
    @XmlElement(name = "Type", required = true)
    protected InvoiceSearchCriteriaInvoiceFilterType type;
    @XmlElement(name = "UniqueProtocol", nillable = true)
    protected String uniqueProtocol;
    @XmlElement(name = "VatProtocol", nillable = true)
    protected String vatProtocol;
    @XmlElement(name = "VatRegister", nillable = true)
    protected String vatRegister;

    /**
     * Gets the value of the barcode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBarcode() {
        return barcode;
    }

    /**
     * Sets the value of the barcode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBarcode(String value) {
        this.barcode = value;
    }

    /**
     * Gets the value of the channels property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfguid }
     *     
     */
    public ArrayOfguid getChannels() {
        return channels;
    }

    /**
     * Sets the value of the channels property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfguid }
     *     
     */
    public void setChannels(ArrayOfguid value) {
        this.channels = value;
    }

    /**
     * Gets the value of the conservationState property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConservationState() {
        return conservationState;
    }

    /**
     * Sets the value of the conservationState property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConservationState(String value) {
        this.conservationState = value;
    }

    /**
     * Gets the value of the currencyCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCurrencyCode() {
        return currencyCode;
    }

    /**
     * Sets the value of the currencyCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCurrencyCode(String value) {
        this.currencyCode = value;
    }

    /**
     * Gets the value of the customer property.
     * 
     * @return
     *     possible object is
     *     {@link MemberInfo }
     *     
     */
    public MemberInfo getCustomer() {
        return customer;
    }

    /**
     * Sets the value of the customer property.
     * 
     * @param value
     *     allowed object is
     *     {@link MemberInfo }
     *     
     */
    public void setCustomer(MemberInfo value) {
        this.customer = value;
    }

    /**
     * Gets the value of the error property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getError() {
        return error;
    }

    /**
     * Sets the value of the error property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setError(Integer value) {
        this.error = value;
    }

    /**
     * Gets the value of the firstExpirationDate property.
     * 
     * @return
     *     possible object is
     *     {@link RangeOfNullableOfdateTime5F2DSckg }
     *     
     */
    public RangeOfNullableOfdateTime5F2DSckg getFirstExpirationDate() {
        return firstExpirationDate;
    }

    /**
     * Sets the value of the firstExpirationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link RangeOfNullableOfdateTime5F2DSckg }
     *     
     */
    public void setFirstExpirationDate(RangeOfNullableOfdateTime5F2DSckg value) {
        this.firstExpirationDate = value;
    }

    /**
     * Gets the value of the insertDate property.
     * 
     * @return
     *     possible object is
     *     {@link RangeOfNullableOfdateTime5F2DSckg }
     *     
     */
    public RangeOfNullableOfdateTime5F2DSckg getInsertDate() {
        return insertDate;
    }

    /**
     * Sets the value of the insertDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link RangeOfNullableOfdateTime5F2DSckg }
     *     
     */
    public void setInsertDate(RangeOfNullableOfdateTime5F2DSckg value) {
        this.insertDate = value;
    }

    /**
     * Gets the value of the invoiceDate property.
     * 
     * @return
     *     possible object is
     *     {@link RangeOfNullableOfdateTime5F2DSckg }
     *     
     */
    public RangeOfNullableOfdateTime5F2DSckg getInvoiceDate() {
        return invoiceDate;
    }

    /**
     * Sets the value of the invoiceDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link RangeOfNullableOfdateTime5F2DSckg }
     *     
     */
    public void setInvoiceDate(RangeOfNullableOfdateTime5F2DSckg value) {
        this.invoiceDate = value;
    }

    /**
     * Gets the value of the invoiceNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInvoiceNumber() {
        return invoiceNumber;
    }

    /**
     * Sets the value of the invoiceNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInvoiceNumber(String value) {
        this.invoiceNumber = value;
    }

    /**
     * Gets the value of the note property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNote() {
        return note;
    }

    /**
     * Sets the value of the note property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNote(String value) {
        this.note = value;
    }

    /**
     * Gets the value of the phaseList property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfstring }
     *     
     */
    public ArrayOfstring getPhaseList() {
        return phaseList;
    }

    /**
     * Sets the value of the phaseList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfstring }
     *     
     */
    public void setPhaseList(ArrayOfstring value) {
        this.phaseList = value;
    }

    /**
     * Gets the value of the publicationDate property.
     * 
     * @return
     *     possible object is
     *     {@link RangeOfNullableOfdateTime5F2DSckg }
     *     
     */
    public RangeOfNullableOfdateTime5F2DSckg getPublicationDate() {
        return publicationDate;
    }

    /**
     * Sets the value of the publicationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link RangeOfNullableOfdateTime5F2DSckg }
     *     
     */
    public void setPublicationDate(RangeOfNullableOfdateTime5F2DSckg value) {
        this.publicationDate = value;
    }

    /**
     * Gets the value of the registrationDate property.
     * 
     * @return
     *     possible object is
     *     {@link RangeOfNullableOfdateTime5F2DSckg }
     *     
     */
    public RangeOfNullableOfdateTime5F2DSckg getRegistrationDate() {
        return registrationDate;
    }

    /**
     * Sets the value of the registrationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link RangeOfNullableOfdateTime5F2DSckg }
     *     
     */
    public void setRegistrationDate(RangeOfNullableOfdateTime5F2DSckg value) {
        this.registrationDate = value;
    }

    /**
     * Gets the value of the sdi property.
     * 
     * @return
     *     possible object is
     *     {@link SdiInfo }
     *     
     */
    public SdiInfo getSdi() {
        return sdi;
    }

    /**
     * Sets the value of the sdi property.
     * 
     * @param value
     *     allowed object is
     *     {@link SdiInfo }
     *     
     */
    public void setSdi(SdiInfo value) {
        this.sdi = value;
    }

    /**
     * Gets the value of the sendReceiveDate property.
     * 
     * @return
     *     possible object is
     *     {@link RangeOfNullableOfdateTime5F2DSckg }
     *     
     */
    public RangeOfNullableOfdateTime5F2DSckg getSendReceiveDate() {
        return sendReceiveDate;
    }

    /**
     * Sets the value of the sendReceiveDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link RangeOfNullableOfdateTime5F2DSckg }
     *     
     */
    public void setSendReceiveDate(RangeOfNullableOfdateTime5F2DSckg value) {
        this.sendReceiveDate = value;
    }

    /**
     * Gets the value of the statusList property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfstring }
     *     
     */
    public ArrayOfstring getStatusList() {
        return statusList;
    }

    /**
     * Sets the value of the statusList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfstring }
     *     
     */
    public void setStatusList(ArrayOfstring value) {
        this.statusList = value;
    }

    /**
     * Gets the value of the supplier property.
     * 
     * @return
     *     possible object is
     *     {@link MemberInfo }
     *     
     */
    public MemberInfo getSupplier() {
        return supplier;
    }

    /**
     * Sets the value of the supplier property.
     * 
     * @param value
     *     allowed object is
     *     {@link MemberInfo }
     *     
     */
    public void setSupplier(MemberInfo value) {
        this.supplier = value;
    }

    /**
     * Gets the value of the total property.
     * 
     * @return
     *     possible object is
     *     {@link RangeOfNullableOfdecimal5F2DSckg }
     *     
     */
    public RangeOfNullableOfdecimal5F2DSckg getTotal() {
        return total;
    }

    /**
     * Sets the value of the total property.
     * 
     * @param value
     *     allowed object is
     *     {@link RangeOfNullableOfdecimal5F2DSckg }
     *     
     */
    public void setTotal(RangeOfNullableOfdecimal5F2DSckg value) {
        this.total = value;
    }

    /**
     * Gets the value of the transmitter property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransmitter() {
        return transmitter;
    }

    /**
     * Sets the value of the transmitter property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransmitter(String value) {
        this.transmitter = value;
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link InvoiceSearchCriteriaInvoiceFilterType }
     *     
     */
    public InvoiceSearchCriteriaInvoiceFilterType getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link InvoiceSearchCriteriaInvoiceFilterType }
     *     
     */
    public void setType(InvoiceSearchCriteriaInvoiceFilterType value) {
        this.type = value;
    }

    /**
     * Gets the value of the uniqueProtocol property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUniqueProtocol() {
        return uniqueProtocol;
    }

    /**
     * Sets the value of the uniqueProtocol property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUniqueProtocol(String value) {
        this.uniqueProtocol = value;
    }

    /**
     * Gets the value of the vatProtocol property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVatProtocol() {
        return vatProtocol;
    }

    /**
     * Sets the value of the vatProtocol property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVatProtocol(String value) {
        this.vatProtocol = value;
    }

    /**
     * Gets the value of the vatRegister property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVatRegister() {
        return vatRegister;
    }

    /**
     * Sets the value of the vatRegister property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVatRegister(String value) {
        this.vatRegister = value;
    }

}
