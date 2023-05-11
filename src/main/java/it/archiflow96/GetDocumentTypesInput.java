
package it.archiflow96;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetDocumentTypesInput complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetDocumentTypesInput">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities}BaseInput">
 *       &lt;sequence>
 *         &lt;element name="FillAccessLevel" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="GetAddInEmailMapping" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="GetAdditives" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="GetFields" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="bReturnAll" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="enAccessLevel" type="{http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Types}AccessLevel" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetDocumentTypesInput", namespace = "http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Card.ValueObject", propOrder = {
    "fillAccessLevel",
    "getAddInEmailMapping",
    "getAdditives",
    "getFields",
    "bReturnAll",
    "enAccessLevel"
})
public class GetDocumentTypesInput
    extends BaseInput
{

    @XmlElement(name = "FillAccessLevel")
    protected Boolean fillAccessLevel;
    @XmlElement(name = "GetAddInEmailMapping")
    protected Boolean getAddInEmailMapping;
    @XmlElement(name = "GetAdditives")
    protected Boolean getAdditives;
    @XmlElement(name = "GetFields")
    protected Boolean getFields;
    protected Boolean bReturnAll;
    protected AccessLevel enAccessLevel;

    /**
     * Gets the value of the fillAccessLevel property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isFillAccessLevel() {
        return fillAccessLevel;
    }

    /**
     * Sets the value of the fillAccessLevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setFillAccessLevel(Boolean value) {
        this.fillAccessLevel = value;
    }

    /**
     * Gets the value of the getAddInEmailMapping property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isGetAddInEmailMapping() {
        return getAddInEmailMapping;
    }

    /**
     * Sets the value of the getAddInEmailMapping property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setGetAddInEmailMapping(Boolean value) {
        this.getAddInEmailMapping = value;
    }

    /**
     * Gets the value of the getAdditives property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isGetAdditives() {
        return getAdditives;
    }

    /**
     * Sets the value of the getAdditives property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setGetAdditives(Boolean value) {
        this.getAdditives = value;
    }

    /**
     * Gets the value of the getFields property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isGetFields() {
        return getFields;
    }

    /**
     * Sets the value of the getFields property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setGetFields(Boolean value) {
        this.getFields = value;
    }

    /**
     * Gets the value of the bReturnAll property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isBReturnAll() {
        return bReturnAll;
    }

    /**
     * Sets the value of the bReturnAll property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setBReturnAll(Boolean value) {
        this.bReturnAll = value;
    }

    /**
     * Gets the value of the enAccessLevel property.
     * 
     * @return
     *     possible object is
     *     {@link AccessLevel }
     *     
     */
    public AccessLevel getEnAccessLevel() {
        return enAccessLevel;
    }

    /**
     * Sets the value of the enAccessLevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccessLevel }
     *     
     */
    public void setEnAccessLevel(AccessLevel value) {
        this.enAccessLevel = value;
    }

}
