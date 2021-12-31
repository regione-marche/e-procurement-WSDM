
package it.archiflow93.classification;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OggettarioCfg complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OggettarioCfg">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OggettoId" type="{http://schemas.datacontract.org/2004/07/SIAV.Common.BaseClass.ValueObject}BaseIdentifier" minOccurs="0"/>
 *         &lt;element name="TitolarioItemId" type="{http://schemas.datacontract.org/2004/07/SIAV.Classification.Entities.TitolarioItem.Identifier}TitolarioItemIdentifier" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OggettarioCfg", namespace = "http://schemas.datacontract.org/2004/07/SIAV.Classification.Entities.Fascicoli.ValueObject", propOrder = {
    "description",
    "oggettoId",
    "titolarioItemId"
})
public class OggettarioCfg {

    @XmlElement(name = "Description", nillable = true)
    protected String description;
    @XmlElement(name = "OggettoId", nillable = true)
    protected BaseIdentifier oggettoId;
    @XmlElement(name = "TitolarioItemId", nillable = true)
    protected TitolarioItemIdentifier titolarioItemId;

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
     * Gets the value of the oggettoId property.
     * 
     * @return
     *     possible object is
     *     {@link BaseIdentifier }
     *     
     */
    public BaseIdentifier getOggettoId() {
        return oggettoId;
    }

    /**
     * Sets the value of the oggettoId property.
     * 
     * @param value
     *     allowed object is
     *     {@link BaseIdentifier }
     *     
     */
    public void setOggettoId(BaseIdentifier value) {
        this.oggettoId = value;
    }

    /**
     * Gets the value of the titolarioItemId property.
     * 
     * @return
     *     possible object is
     *     {@link TitolarioItemIdentifier }
     *     
     */
    public TitolarioItemIdentifier getTitolarioItemId() {
        return titolarioItemId;
    }

    /**
     * Sets the value of the titolarioItemId property.
     * 
     * @param value
     *     allowed object is
     *     {@link TitolarioItemIdentifier }
     *     
     */
    public void setTitolarioItemId(TitolarioItemIdentifier value) {
        this.titolarioItemId = value;
    }

}
