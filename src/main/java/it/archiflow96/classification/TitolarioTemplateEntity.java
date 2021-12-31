
package it.archiflow96.classification;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TitolarioTemplateEntity complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TitolarioTemplateEntity">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/SIAV.Classification.Entities.Titolario.ValueObject}AbstractTitolario">
 *       &lt;sequence>
 *         &lt;element name="AOOKey" type="{http://schemas.datacontract.org/2004/07/SIAV.Common.BaseClass.ValueObject}CoupleIdentifier" minOccurs="0"/>
 *         &lt;element name="Id" type="{http://schemas.datacontract.org/2004/07/SIAV.Classification.Entities.Titolario.Identifier}TitolarioTemplateIdentifier" minOccurs="0"/>
 *         &lt;element name="Label" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TitolarioTemplateEntity", namespace = "http://schemas.datacontract.org/2004/07/SIAV.Classification.Entities.Titolario.ValueObject", propOrder = {
    "aooKey",
    "id",
    "label"
})
public class TitolarioTemplateEntity
    extends AbstractTitolario
{

    @XmlElement(name = "AOOKey", nillable = true)
    protected CoupleIdentifier aooKey;
    @XmlElement(name = "Id", nillable = true)
    protected TitolarioTemplateIdentifier id;
    @XmlElement(name = "Label", nillable = true)
    protected String label;

    /**
     * Gets the value of the aooKey property.
     * 
     * @return
     *     possible object is
     *     {@link CoupleIdentifier }
     *     
     */
    public CoupleIdentifier getAOOKey() {
        return aooKey;
    }

    /**
     * Sets the value of the aooKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link CoupleIdentifier }
     *     
     */
    public void setAOOKey(CoupleIdentifier value) {
        this.aooKey = value;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link TitolarioTemplateIdentifier }
     *     
     */
    public TitolarioTemplateIdentifier getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link TitolarioTemplateIdentifier }
     *     
     */
    public void setId(TitolarioTemplateIdentifier value) {
        this.id = value;
    }

    /**
     * Gets the value of the label property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLabel() {
        return label;
    }

    /**
     * Sets the value of the label property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLabel(String value) {
        this.label = value;
    }

}
