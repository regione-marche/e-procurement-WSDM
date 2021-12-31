
package it.archiflow93.classification;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FascicoloPreservation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FascicoloPreservation">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/SIAV.Classification.Entities.Fascicoli.ValueObject}FascicoloEntity">
 *       &lt;sequence>
 *         &lt;element name="CardIdColl" type="{http://schemas.datacontract.org/2004/07/SIAV.Classification.Entities.Common.Identifier}ArrayOfDocumentIdentifier" minOccurs="0"/>
 *         &lt;element name="CustomFieldCollection" type="{http://schemas.microsoft.com/2003/10/Serialization/Arrays}ArrayOfKeyValueOfstringstring" minOccurs="0"/>
 *         &lt;element name="UO_ResponsibleDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FascicoloPreservation", namespace = "http://schemas.datacontract.org/2004/07/SIAV.Classification.Entities.Fascicoli.ValueObject", propOrder = {
    "cardIdColl",
    "customFieldCollection",
    "uoResponsibleDescription"
})
public class FascicoloPreservation
    extends FascicoloEntity
{

    @XmlElement(name = "CardIdColl", nillable = true)
    protected ArrayOfDocumentIdentifier cardIdColl;
    @XmlElement(name = "CustomFieldCollection", nillable = true)
    protected ArrayOfKeyValueOfstringstring customFieldCollection;
    @XmlElement(name = "UO_ResponsibleDescription", nillable = true)
    protected String uoResponsibleDescription;

    /**
     * Gets the value of the cardIdColl property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDocumentIdentifier }
     *     
     */
    public ArrayOfDocumentIdentifier getCardIdColl() {
        return cardIdColl;
    }

    /**
     * Sets the value of the cardIdColl property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDocumentIdentifier }
     *     
     */
    public void setCardIdColl(ArrayOfDocumentIdentifier value) {
        this.cardIdColl = value;
    }

    /**
     * Gets the value of the customFieldCollection property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfKeyValueOfstringstring }
     *     
     */
    public ArrayOfKeyValueOfstringstring getCustomFieldCollection() {
        return customFieldCollection;
    }

    /**
     * Sets the value of the customFieldCollection property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfKeyValueOfstringstring }
     *     
     */
    public void setCustomFieldCollection(ArrayOfKeyValueOfstringstring value) {
        this.customFieldCollection = value;
    }

    /**
     * Gets the value of the uoResponsibleDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUOResponsibleDescription() {
        return uoResponsibleDescription;
    }

    /**
     * Sets the value of the uoResponsibleDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUOResponsibleDescription(String value) {
        this.uoResponsibleDescription = value;
    }

}
