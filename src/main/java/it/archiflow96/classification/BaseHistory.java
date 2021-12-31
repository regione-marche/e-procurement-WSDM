
package it.archiflow96.classification;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for BaseHistory complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BaseHistory">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IdHistory" type="{http://schemas.datacontract.org/2004/07/SIAV.Common.BaseClass.ValueObject}BaseIdentifier" minOccurs="0"/>
 *         &lt;element name="IdRes" type="{http://schemas.datacontract.org/2004/07/SIAV.Common.BaseClass.ValueObject}BaseIdentifier" minOccurs="0"/>
 *         &lt;element name="OperationData" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="UserId" type="{http://schemas.datacontract.org/2004/07/SIAV.Common.BaseClass.ValueObject}TypeIdentifierComplete" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BaseHistory", namespace = "http://schemas.datacontract.org/2004/07/SIAV.Common.BaseClass.ValueObject", propOrder = {
    "description",
    "idHistory",
    "idRes",
    "operationData",
    "userId"
})
@XmlSeeAlso({
    FascicoloHistory.class
})
public class BaseHistory {

    @XmlElement(name = "Description", nillable = true)
    protected String description;
    @XmlElement(name = "IdHistory", nillable = true)
    protected BaseIdentifier idHistory;
    @XmlElement(name = "IdRes", nillable = true)
    protected BaseIdentifier idRes;
    @XmlElement(name = "OperationData")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar operationData;
    @XmlElement(name = "UserId", nillable = true)
    protected TypeIdentifierComplete userId;

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Gets the value of the idHistory property.
     * 
     * @return
     *     possible object is
     *     {@link BaseIdentifier }
     *     
     */
    public BaseIdentifier getIdHistory() {
        return idHistory;
    }

    /**
     * Sets the value of the idHistory property.
     * 
     * @param value
     *     allowed object is
     *     {@link BaseIdentifier }
     *     
     */
    public void setIdHistory(BaseIdentifier value) {
        this.idHistory = value;
    }

    /**
     * Gets the value of the idRes property.
     * 
     * @return
     *     possible object is
     *     {@link BaseIdentifier }
     *     
     */
    public BaseIdentifier getIdRes() {
        return idRes;
    }

    /**
     * Sets the value of the idRes property.
     * 
     * @param value
     *     allowed object is
     *     {@link BaseIdentifier }
     *     
     */
    public void setIdRes(BaseIdentifier value) {
        this.idRes = value;
    }

    /**
     * Gets the value of the operationData property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOperationData() {
        return operationData;
    }

    /**
     * Sets the value of the operationData property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOperationData(XMLGregorianCalendar value) {
        this.operationData = value;
    }

    /**
     * Gets the value of the userId property.
     * 
     * @return
     *     possible object is
     *     {@link TypeIdentifierComplete }
     *     
     */
    public TypeIdentifierComplete getUserId() {
        return userId;
    }

    /**
     * Sets the value of the userId property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeIdentifierComplete }
     *     
     */
    public void setUserId(TypeIdentifierComplete value) {
        this.userId = value;
    }

}
