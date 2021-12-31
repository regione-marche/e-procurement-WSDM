
package it.archiflow93.classification;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CampiTipoFascicoloCfgValue complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CampiTipoFascicoloCfgValue">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CampoTipoFascCfgValueId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="IsDefault" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Sorting" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="ValueDate" type="{http://schemas.datacontract.org/2004/07/SIAV.Classification.Entities.Common.BaseClass}CustomDateTimeNullable" minOccurs="0"/>
 *         &lt;element name="ValueNum" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="ValueStr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CampiTipoFascicoloCfgValue", namespace = "http://schemas.datacontract.org/2004/07/SIAV.Classification.Entities.TipoFascicolo.ValueObject", propOrder = {
    "campoTipoFascCfgValueId",
    "isDefault",
    "sorting",
    "valueDate",
    "valueNum",
    "valueStr"
})
public class CampiTipoFascicoloCfgValue {

    @XmlElement(name = "CampoTipoFascCfgValueId")
    protected Integer campoTipoFascCfgValueId;
    @XmlElement(name = "IsDefault")
    protected Boolean isDefault;
    @XmlElement(name = "Sorting")
    protected Integer sorting;
    @XmlElement(name = "ValueDate", nillable = true)
    protected CustomDateTimeNullable valueDate;
    @XmlElement(name = "ValueNum")
    protected Integer valueNum;
    @XmlElement(name = "ValueStr", nillable = true)
    protected String valueStr;

    /**
     * Gets the value of the campoTipoFascCfgValueId property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCampoTipoFascCfgValueId() {
        return campoTipoFascCfgValueId;
    }

    /**
     * Sets the value of the campoTipoFascCfgValueId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCampoTipoFascCfgValueId(Integer value) {
        this.campoTipoFascCfgValueId = value;
    }

    /**
     * Gets the value of the isDefault property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsDefault() {
        return isDefault;
    }

    /**
     * Sets the value of the isDefault property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsDefault(Boolean value) {
        this.isDefault = value;
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
     * Gets the value of the valueDate property.
     * 
     * @return
     *     possible object is
     *     {@link CustomDateTimeNullable }
     *     
     */
    public CustomDateTimeNullable getValueDate() {
        return valueDate;
    }

    /**
     * Sets the value of the valueDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomDateTimeNullable }
     *     
     */
    public void setValueDate(CustomDateTimeNullable value) {
        this.valueDate = value;
    }

    /**
     * Gets the value of the valueNum property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getValueNum() {
        return valueNum;
    }

    /**
     * Sets the value of the valueNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setValueNum(Integer value) {
        this.valueNum = value;
    }

    /**
     * Gets the value of the valueStr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValueStr() {
        return valueStr;
    }

    /**
     * Sets the value of the valueStr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValueStr(String value) {
        this.valueStr = value;
    }

}
