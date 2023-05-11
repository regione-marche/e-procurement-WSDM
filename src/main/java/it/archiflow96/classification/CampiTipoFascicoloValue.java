
package it.archiflow96.classification;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CampiTipoFascicoloValue complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CampiTipoFascicoloValue">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CampoId" type="{http://schemas.datacontract.org/2004/07/SIAV.Classification.Entities.TipoFascicolo.Identifier}CampiTipoFascicoloIdentifier" minOccurs="0"/>
 *         &lt;element name="FascId" type="{http://schemas.datacontract.org/2004/07/SIAV.Classification.Entities.Fascicoli.Identifier}FascicoloIdentifier" minOccurs="0"/>
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
@XmlType(name = "CampiTipoFascicoloValue", namespace = "http://schemas.datacontract.org/2004/07/SIAV.Classification.Entities.Fascicoli.ValueObject", propOrder = {
    "campoId",
    "fascId",
    "valueDate",
    "valueNum",
    "valueStr"
})
public class CampiTipoFascicoloValue {

    @XmlElement(name = "CampoId", nillable = true)
    protected CampiTipoFascicoloIdentifier campoId;
    @XmlElement(name = "FascId", nillable = true)
    protected FascicoloIdentifier fascId;
    @XmlElement(name = "ValueDate", nillable = true)
    protected CustomDateTimeNullable valueDate;
    @XmlElement(name = "ValueNum")
    protected Integer valueNum;
    @XmlElement(name = "ValueStr", nillable = true)
    protected String valueStr;

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
     * Gets the value of the fascId property.
     * 
     * @return
     *     possible object is
     *     {@link FascicoloIdentifier }
     *     
     */
    public FascicoloIdentifier getFascId() {
        return fascId;
    }

    /**
     * Sets the value of the fascId property.
     * 
     * @param value
     *     allowed object is
     *     {@link FascicoloIdentifier }
     *     
     */
    public void setFascId(FascicoloIdentifier value) {
        this.fascId = value;
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
