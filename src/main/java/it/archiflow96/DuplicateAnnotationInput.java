
package it.archiflow96;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DuplicateAnnotationInput complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DuplicateAnnotationInput">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities}BaseInput">
 *       &lt;sequence>
 *         &lt;element name="CollateAnnotation" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="FromCard" type="{http://schemas.microsoft.com/2003/10/Serialization/}guid" minOccurs="0"/>
 *         &lt;element name="ToCard" type="{http://schemas.microsoft.com/2003/10/Serialization/}guid" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DuplicateAnnotationInput", namespace = "http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Card.ValueObject", propOrder = {
    "collateAnnotation",
    "fromCard",
    "toCard"
})
public class DuplicateAnnotationInput
    extends BaseInput
{

    @XmlElement(name = "CollateAnnotation")
    protected Boolean collateAnnotation;
    @XmlElement(name = "FromCard")
    protected String fromCard;
    @XmlElement(name = "ToCard")
    protected String toCard;

    /**
     * Gets the value of the collateAnnotation property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCollateAnnotation() {
        return collateAnnotation;
    }

    /**
     * Sets the value of the collateAnnotation property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCollateAnnotation(Boolean value) {
        this.collateAnnotation = value;
    }

    /**
     * Gets the value of the fromCard property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFromCard() {
        return fromCard;
    }

    /**
     * Sets the value of the fromCard property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFromCard(String value) {
        this.fromCard = value;
    }

    /**
     * Gets the value of the toCard property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getToCard() {
        return toCard;
    }

    /**
     * Sets the value of the toCard property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setToCard(String value) {
        this.toCard = value;
    }

}
