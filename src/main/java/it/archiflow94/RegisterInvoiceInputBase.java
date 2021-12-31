
package it.archiflow94;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RegisterInvoiceInputBase complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RegisterInvoiceInputBase">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/SIAV.Common.Tools.Log}LoggableBase">
 *       &lt;sequence>
 *         &lt;element name="CompId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Company" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ContRep" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="DateFormat" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DocId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Language" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LoginTicket" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LoginType" type="{http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Types}LoginSapType"/>
 *         &lt;element name="UserConversion" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="UserId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RegisterInvoiceInputBase", namespace = "http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Card.ValueObject", propOrder = {
    "compId",
    "company",
    "contRep",
    "dateFormat",
    "docId",
    "language",
    "loginTicket",
    "loginType",
    "userConversion",
    "userId"
})
@XmlSeeAlso({
    DeleteInvoiceByUserInput.class,
    RegisterInvoiceInput.class,
    RegisterInvoiceErrorInput.class
})
public class RegisterInvoiceInputBase
    extends LoggableBase
{

    @XmlElement(name = "CompId", nillable = true)
    protected String compId;
    @XmlElement(name = "Company", nillable = true)
    protected String company;
    @XmlElement(name = "ContRep", required = true, nillable = true)
    protected String contRep;
    @XmlElement(name = "DateFormat", nillable = true)
    protected String dateFormat;
    @XmlElement(name = "DocId", required = true, nillable = true)
    protected String docId;
    @XmlElement(name = "Language", nillable = true)
    protected String language;
    @XmlElement(name = "LoginTicket", nillable = true)
    protected String loginTicket;
    @XmlElement(name = "LoginType", required = true)
    protected LoginSapType loginType;
    @XmlElement(name = "UserConversion")
    protected Boolean userConversion;
    @XmlElement(name = "UserId", nillable = true)
    protected String userId;

    /**
     * Gets the value of the compId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCompId() {
        return compId;
    }

    /**
     * Sets the value of the compId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCompId(String value) {
        this.compId = value;
    }

    /**
     * Gets the value of the company property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCompany() {
        return company;
    }

    /**
     * Sets the value of the company property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCompany(String value) {
        this.company = value;
    }

    /**
     * Gets the value of the contRep property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContRep() {
        return contRep;
    }

    /**
     * Sets the value of the contRep property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContRep(String value) {
        this.contRep = value;
    }

    /**
     * Gets the value of the dateFormat property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDateFormat() {
        return dateFormat;
    }

    /**
     * Sets the value of the dateFormat property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDateFormat(String value) {
        this.dateFormat = value;
    }

    /**
     * Gets the value of the docId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDocId() {
        return docId;
    }

    /**
     * Sets the value of the docId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDocId(String value) {
        this.docId = value;
    }

    /**
     * Gets the value of the language property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLanguage() {
        return language;
    }

    /**
     * Sets the value of the language property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLanguage(String value) {
        this.language = value;
    }

    /**
     * Gets the value of the loginTicket property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLoginTicket() {
        return loginTicket;
    }

    /**
     * Sets the value of the loginTicket property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLoginTicket(String value) {
        this.loginTicket = value;
    }

    /**
     * Gets the value of the loginType property.
     * 
     * @return
     *     possible object is
     *     {@link LoginSapType }
     *     
     */
    public LoginSapType getLoginType() {
        return loginType;
    }

    /**
     * Sets the value of the loginType property.
     * 
     * @param value
     *     allowed object is
     *     {@link LoginSapType }
     *     
     */
    public void setLoginType(LoginSapType value) {
        this.loginType = value;
    }

    /**
     * Gets the value of the userConversion property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isUserConversion() {
        return userConversion;
    }

    /**
     * Sets the value of the userConversion property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUserConversion(Boolean value) {
        this.userConversion = value;
    }

    /**
     * Gets the value of the userId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserId() {
        return userId;
    }

    /**
     * Sets the value of the userId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserId(String value) {
        this.userId = value;
    }

}
