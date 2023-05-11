
package it.archiflow93.classification;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CampiTipoFascicolo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CampiTipoFascicolo">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/SIAV.Common.BaseClass.ValueObject}BaseValueObject">
 *       &lt;sequence>
 *         &lt;element name="CampoId" type="{http://schemas.datacontract.org/2004/07/SIAV.Classification.Entities.TipoFascicolo.Identifier}CampiTipoFascicoloIdentifier" minOccurs="0"/>
 *         &lt;element name="FieldType" type="{http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Types}FieldTypeDefinition" minOccurs="0"/>
 *         &lt;element name="Label" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ListCampiValue" type="{http://schemas.datacontract.org/2004/07/SIAV.Classification.Entities.TipoFascicolo.ValueObject}ArrayOfCampiTipoFascicoloCfgValue" minOccurs="0"/>
 *         &lt;element name="Mandatory" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Sorting" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="Status" type="{http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Types}StatusType" minOccurs="0"/>
 *         &lt;element name="TipoFascicolo" type="{http://schemas.datacontract.org/2004/07/SIAV.Classification.Entities.TipoFascicolo.Identifier}TipoFascicoloIdentifier" minOccurs="0"/>
 *         &lt;element name="Visible" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CampiTipoFascicolo", namespace = "http://schemas.datacontract.org/2004/07/SIAV.Classification.Entities.TipoFascicolo.ValueObject", propOrder = {
    "campoId",
    "fieldType",
    "label",
    "listCampiValue",
    "mandatory",
    "sorting",
    "status",
    "tipoFascicolo",
    "visible"
})
public class CampiTipoFascicolo
    extends BaseValueObject
{

    @XmlElement(name = "CampoId", nillable = true)
    protected CampiTipoFascicoloIdentifier campoId;
    @XmlElement(name = "FieldType")
    protected FieldTypeDefinition fieldType;
    @XmlElement(name = "Label", nillable = true)
    protected String label;
    @XmlElement(name = "ListCampiValue", nillable = true)
    protected ArrayOfCampiTipoFascicoloCfgValue listCampiValue;
    @XmlElement(name = "Mandatory")
    protected Boolean mandatory;
    @XmlElement(name = "Sorting")
    protected Integer sorting;
    @XmlElement(name = "Status")
    protected StatusType status;
    @XmlElement(name = "TipoFascicolo", nillable = true)
    protected TipoFascicoloIdentifier tipoFascicolo;
    @XmlElement(name = "Visible")
    protected Boolean visible;

    /**
     * Gets the value of the campoId property.
     * 
     * @return
     *     possible object is
     *     {@link CampiTipoFascicoloIdentifier }
     *     
     */
    public CampiTipoFascicoloIdentifier getCampoId() {
        return campoId;
    }

    /**
     * Sets the value of the campoId property.
     * 
     * @param value
     *     allowed object is
     *     {@link CampiTipoFascicoloIdentifier }
     *     
     */
    public void setCampoId(CampiTipoFascicoloIdentifier value) {
        this.campoId = value;
    }

    /**
     * Gets the value of the fieldType property.
     * 
     * @return
     *     possible object is
     *     {@link FieldTypeDefinition }
     *     
     */
    public FieldTypeDefinition getFieldType() {
        return fieldType;
    }

    /**
     * Sets the value of the fieldType property.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldTypeDefinition }
     *     
     */
    public void setFieldType(FieldTypeDefinition value) {
        this.fieldType = value;
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

    /**
     * Gets the value of the listCampiValue property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfCampiTipoFascicoloCfgValue }
     *     
     */
    public ArrayOfCampiTipoFascicoloCfgValue getListCampiValue() {
        return listCampiValue;
    }

    /**
     * Sets the value of the listCampiValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfCampiTipoFascicoloCfgValue }
     *     
     */
    public void setListCampiValue(ArrayOfCampiTipoFascicoloCfgValue value) {
        this.listCampiValue = value;
    }

    /**
     * Gets the value of the mandatory property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMandatory() {
        return mandatory;
    }

    /**
     * Sets the value of the mandatory property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMandatory(Boolean value) {
        this.mandatory = value;
    }

    /**
     * Gets the value of the sorting property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getSorting() {
        return sorting;
    }

    /**
     * Sets the value of the sorting property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setSorting(Integer value) {
        this.sorting = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link StatusType }
     *     
     */
    public StatusType getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link StatusType }
     *     
     */
    public void setStatus(StatusType value) {
        this.status = value;
    }

    /**
     * Gets the value of the tipoFascicolo property.
     * 
     * @return
     *     possible object is
     *     {@link TipoFascicoloIdentifier }
     *     
     */
    public TipoFascicoloIdentifier getTipoFascicolo() {
        return tipoFascicolo;
    }

    /**
     * Sets the value of the tipoFascicolo property.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoFascicoloIdentifier }
     *     
     */
    public void setTipoFascicolo(TipoFascicoloIdentifier value) {
        this.tipoFascicolo = value;
    }

    /**
     * Gets the value of the visible property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isVisible() {
        return visible;
    }

    /**
     * Sets the value of the visible property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setVisible(Boolean value) {
        this.visible = value;
    }

}
