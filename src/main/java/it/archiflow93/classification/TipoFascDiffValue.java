
package it.archiflow93.classification;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TipoFascDiffValue complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TipoFascDiffValue">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/SIAV.Common.BaseClass.ValueObject}BaseValueObject">
 *       &lt;sequence>
 *         &lt;element name="DiffType" type="{http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Types}DiffTypes" minOccurs="0"/>
 *         &lt;element name="IdRelatedNodes" type="{http://schemas.microsoft.com/2003/10/Serialization/Arrays}ArrayOfint" minOccurs="0"/>
 *         &lt;element name="TipoFascDiffId" type="{http://schemas.datacontract.org/2004/07/SIAV.Classification.Entities.TipoFascicolo.Identifier}TipoFascDiffIdentifier" minOccurs="0"/>
 *         &lt;element name="TipoFascId" type="{http://schemas.datacontract.org/2004/07/SIAV.Classification.Entities.TipoFascicolo.Identifier}TipoFascicoloIdentifier" minOccurs="0"/>
 *         &lt;element name="TitItemId" type="{http://schemas.datacontract.org/2004/07/SIAV.Classification.Entities.TitolarioItem.Identifier}TitolarioItemIdentifier" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TipoFascDiffValue", namespace = "http://schemas.datacontract.org/2004/07/SIAV.Classification.Entities.TipoFascicolo.ValueObject", propOrder = {
    "diffType",
    "idRelatedNodes",
    "tipoFascDiffId",
    "tipoFascId",
    "titItemId"
})
public class TipoFascDiffValue
    extends BaseValueObject
{

    @XmlElement(name = "DiffType")
    protected DiffTypes diffType;
    @XmlElement(name = "IdRelatedNodes", nillable = true)
    protected ArrayOfint idRelatedNodes;
    @XmlElement(name = "TipoFascDiffId", nillable = true)
    protected TipoFascDiffIdentifier tipoFascDiffId;
    @XmlElement(name = "TipoFascId", nillable = true)
    protected TipoFascicoloIdentifier tipoFascId;
    @XmlElement(name = "TitItemId", nillable = true)
    protected TitolarioItemIdentifier titItemId;

    /**
     * Gets the value of the diffType property.
     * 
     * @return
     *     possible object is
     *     {@link DiffTypes }
     *     
     */
    public DiffTypes getDiffType() {
        return diffType;
    }

    /**
     * Sets the value of the diffType property.
     * 
     * @param value
     *     allowed object is
     *     {@link DiffTypes }
     *     
     */
    public void setDiffType(DiffTypes value) {
        this.diffType = value;
    }

    /**
     * Gets the value of the idRelatedNodes property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfint }
     *     
     */
    public ArrayOfint getIdRelatedNodes() {
        return idRelatedNodes;
    }

    /**
     * Sets the value of the idRelatedNodes property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfint }
     *     
     */
    public void setIdRelatedNodes(ArrayOfint value) {
        this.idRelatedNodes = value;
    }

    /**
     * Gets the value of the tipoFascDiffId property.
     * 
     * @return
     *     possible object is
     *     {@link TipoFascDiffIdentifier }
     *     
     */
    public TipoFascDiffIdentifier getTipoFascDiffId() {
        return tipoFascDiffId;
    }

    /**
     * Sets the value of the tipoFascDiffId property.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoFascDiffIdentifier }
     *     
     */
    public void setTipoFascDiffId(TipoFascDiffIdentifier value) {
        this.tipoFascDiffId = value;
    }

    /**
     * Gets the value of the tipoFascId property.
     * 
     * @return
     *     possible object is
     *     {@link TipoFascicoloIdentifier }
     *     
     */
    public TipoFascicoloIdentifier getTipoFascId() {
        return tipoFascId;
    }

    /**
     * Sets the value of the tipoFascId property.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoFascicoloIdentifier }
     *     
     */
    public void setTipoFascId(TipoFascicoloIdentifier value) {
        this.tipoFascId = value;
    }

    /**
     * Gets the value of the titItemId property.
     * 
     * @return
     *     possible object is
     *     {@link TitolarioItemIdentifier }
     *     
     */
    public TitolarioItemIdentifier getTitItemId() {
        return titItemId;
    }

    /**
     * Sets the value of the titItemId property.
     * 
     * @param value
     *     allowed object is
     *     {@link TitolarioItemIdentifier }
     *     
     */
    public void setTitItemId(TitolarioItemIdentifier value) {
        this.titItemId = value;
    }

}
