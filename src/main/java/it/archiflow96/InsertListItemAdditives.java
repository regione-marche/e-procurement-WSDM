
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
 *         &lt;element name="strSessionId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="oListItem" type="{http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Card.ValueObject}ListItem" minOccurs="0"/>
 *         &lt;element name="docTypeId" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/>
 *         &lt;element name="additiveId" type="{http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Types}IdAdditive" minOccurs="0"/>
 *         &lt;element name="bCheckDuplication" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
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
    "strSessionId",
    "oListItem",
    "docTypeId",
    "additiveId",
    "bCheckDuplication"
})
@XmlRootElement(name = "InsertListItemAdditives")
public class InsertListItemAdditives {

    @XmlElement(nillable = true)
    protected String strSessionId;
    @XmlElement(nillable = true)
    protected ListItem oListItem;
    protected Short docTypeId;
    protected IdAdditive additiveId;
    protected Boolean bCheckDuplication;

    /**
     * Gets the value of the strSessionId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStrSessionId() {
        return strSessionId;
    }

    /**
     * Sets the value of the strSessionId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStrSessionId(String value) {
        this.strSessionId = value;
    }

    /**
     * Gets the value of the oListItem property.
     * 
     * @return
     *     possible object is
     *     {@link ListItem }
     *     
     */
    public ListItem getOListItem() {
        return oListItem;
    }

    /**
     * Sets the value of the oListItem property.
     * 
     * @param value
     *     allowed object is
     *     {@link ListItem }
     *     
     */
    public void setOListItem(ListItem value) {
        this.oListItem = value;
    }

    /**
     * Gets the value of the docTypeId property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getDocTypeId() {
        return docTypeId;
    }

    /**
     * Sets the value of the docTypeId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setDocTypeId(Short value) {
        this.docTypeId = value;
    }

    /**
     * Gets the value of the additiveId property.
     * 
     * @return
     *     possible object is
     *     {@link IdAdditive }
     *     
     */
    public IdAdditive getAdditiveId() {
        return additiveId;
    }

    /**
     * Sets the value of the additiveId property.
     * 
     * @param value
     *     allowed object is
     *     {@link IdAdditive }
     *     
     */
    public void setAdditiveId(IdAdditive value) {
        this.additiveId = value;
    }

    /**
     * Gets the value of the bCheckDuplication property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isBCheckDuplication() {
        return bCheckDuplication;
    }

    /**
     * Sets the value of the bCheckDuplication property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setBCheckDuplication(Boolean value) {
        this.bCheckDuplication = value;
    }

}
