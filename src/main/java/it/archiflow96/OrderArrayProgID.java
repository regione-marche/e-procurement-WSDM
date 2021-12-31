
package it.archiflow96;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="oSessionInfo" type="{http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Login.ValueObject}SessionInfo" minOccurs="0"/>
 *         &lt;element name="eFieldToOrderBy" type="{http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Types}FieldToOrderBy" minOccurs="0"/>
 *         &lt;element name="bSortDescending" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="eProgIdType" type="{http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Types}ProgIdType" minOccurs="0"/>
 *         &lt;element name="oCardIds" type="{http://schemas.microsoft.com/2003/10/Serialization/Arrays}ArrayOfguid" minOccurs="0"/>
 *         &lt;element name="bSharedMail" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="iOfficeId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "oSessionInfo",
    "eFieldToOrderBy",
    "bSortDescending",
    "eProgIdType",
    "oCardIds",
    "bSharedMail",
    "iOfficeId"
})
@XmlRootElement(name = "OrderArrayProgID")
public class OrderArrayProgID {

    @XmlElement(nillable = true)
    protected SessionInfo oSessionInfo;
    protected FieldToOrderBy eFieldToOrderBy;
    protected Boolean bSortDescending;
    protected ProgIdType eProgIdType;
    @XmlElement(nillable = true)
    protected ArrayOfguid oCardIds;
    protected Boolean bSharedMail;
    protected Integer iOfficeId;

    /**
     * Gets the value of the oSessionInfo property.
     * 
     * @return
     *     possible object is
     *     {@link SessionInfo }
     *     
     */
    public SessionInfo getOSessionInfo() {
        return oSessionInfo;
    }

    /**
     * Sets the value of the oSessionInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link SessionInfo }
     *     
     */
    public void setOSessionInfo(SessionInfo value) {
        this.oSessionInfo = value;
    }

    /**
     * Gets the value of the eFieldToOrderBy property.
     * 
     * @return
     *     possible object is
     *     {@link FieldToOrderBy }
     *     
     */
    public FieldToOrderBy getEFieldToOrderBy() {
        return eFieldToOrderBy;
    }

    /**
     * Sets the value of the eFieldToOrderBy property.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldToOrderBy }
     *     
     */
    public void setEFieldToOrderBy(FieldToOrderBy value) {
        this.eFieldToOrderBy = value;
    }

    /**
     * Gets the value of the bSortDescending property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isBSortDescending() {
        return bSortDescending;
    }

    /**
     * Sets the value of the bSortDescending property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setBSortDescending(Boolean value) {
        this.bSortDescending = value;
    }

    /**
     * Gets the value of the eProgIdType property.
     * 
     * @return
     *     possible object is
     *     {@link ProgIdType }
     *     
     */
    public ProgIdType getEProgIdType() {
        return eProgIdType;
    }

    /**
     * Sets the value of the eProgIdType property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProgIdType }
     *     
     */
    public void setEProgIdType(ProgIdType value) {
        this.eProgIdType = value;
    }

    /**
     * Gets the value of the oCardIds property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfguid }
     *     
     */
    public ArrayOfguid getOCardIds() {
        return oCardIds;
    }

    /**
     * Sets the value of the oCardIds property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfguid }
     *     
     */
    public void setOCardIds(ArrayOfguid value) {
        this.oCardIds = value;
    }

    /**
     * Gets the value of the bSharedMail property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isBSharedMail() {
        return bSharedMail;
    }

    /**
     * Sets the value of the bSharedMail property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setBSharedMail(Boolean value) {
        this.bSharedMail = value;
    }

    /**
     * Gets the value of the iOfficeId property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getIOfficeId() {
        return iOfficeId;
    }

    /**
     * Sets the value of the iOfficeId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setIOfficeId(Integer value) {
        this.iOfficeId = value;
    }

}
