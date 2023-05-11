
package it.archiflow93.classification;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BaseFascicoloDocumento complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BaseFascicoloDocumento">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/SIAV.Common.BaseClass.ValueObject}BaseValueObject">
 *       &lt;sequence>
 *         &lt;element name="Fascicolo_Id" type="{http://schemas.datacontract.org/2004/07/SIAV.Classification.Entities.Fascicoli.Identifier}FascicoloIdentifier" minOccurs="0"/>
 *         &lt;element name="Id" type="{http://schemas.datacontract.org/2004/07/SIAV.Classification.Entities.Fascicolo.Identifier}FascicoloDocIdentifier" minOccurs="0"/>
 *         &lt;element name="Primary" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="Visibility" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BaseFascicoloDocumento", namespace = "http://schemas.datacontract.org/2004/07/SIAV.Classification.Entities.Fascicoli.ValueObject", propOrder = {
    "fascicoloId",
    "id",
    "primary",
    "visibility"
})
@XmlSeeAlso({
    FascicoloDocumentoEntity.class
})
public class BaseFascicoloDocumento
    extends BaseValueObject
{

    @XmlElement(name = "Fascicolo_Id", nillable = true)
    protected FascicoloIdentifier fascicoloId;
    @XmlElement(name = "Id", nillable = true)
    protected FascicoloDocIdentifier id;
    @XmlElement(name = "Primary")
    protected Integer primary;
    @XmlElement(name = "Visibility")
    protected Integer visibility;

    /**
     * Gets the value of the fascicoloId property.
     * 
     * @return
     *     possible object is
     *     {@link FascicoloIdentifier }
     *     
     */
    public FascicoloIdentifier getFascicoloId() {
        return fascicoloId;
    }

    /**
     * Sets the value of the fascicoloId property.
     * 
     * @param value
     *     allowed object is
     *     {@link FascicoloIdentifier }
     *     
     */
    public void setFascicoloId(FascicoloIdentifier value) {
        this.fascicoloId = value;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link FascicoloDocIdentifier }
     *     
     */
    public FascicoloDocIdentifier getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link FascicoloDocIdentifier }
     *     
     */
    public void setId(FascicoloDocIdentifier value) {
        this.id = value;
    }

    /**
     * Gets the value of the primary property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPrimary() {
        return primary;
    }

    /**
     * Sets the value of the primary property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPrimary(Integer value) {
        this.primary = value;
    }

    /**
     * Gets the value of the visibility property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getVisibility() {
        return visibility;
    }

    /**
     * Sets the value of the visibility property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setVisibility(Integer value) {
        this.visibility = value;
    }

}
