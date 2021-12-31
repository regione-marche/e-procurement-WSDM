
package org.datacontract.schemas._2004._07.siav_classification_entities_fascicoli;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.siav_classification_entities_common.CustomDateTimeNullable;
import org.datacontract.schemas._2004._07.siav_classification_entities_tipofascicolo.CampiTipoFascicoloIdentifier;


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
@XmlType(name = "CampiTipoFascicoloValue", propOrder = {
    "campoId",
    "fascId",
    "valueDate",
    "valueNum",
    "valueStr"
})
public class CampiTipoFascicoloValue {

    @XmlElementRef(name = "CampoId", namespace = "http://schemas.datacontract.org/2004/07/SIAV.Classification.Entities.Fascicoli.ValueObject", type = JAXBElement.class)
    protected JAXBElement<CampiTipoFascicoloIdentifier> campoId;
    @XmlElementRef(name = "FascId", namespace = "http://schemas.datacontract.org/2004/07/SIAV.Classification.Entities.Fascicoli.ValueObject", type = JAXBElement.class)
    protected JAXBElement<FascicoloIdentifier> fascId;
    @XmlElementRef(name = "ValueDate", namespace = "http://schemas.datacontract.org/2004/07/SIAV.Classification.Entities.Fascicoli.ValueObject", type = JAXBElement.class)
    protected JAXBElement<CustomDateTimeNullable> valueDate;
    @XmlElement(name = "ValueNum")
    protected Integer valueNum;
    @XmlElementRef(name = "ValueStr", namespace = "http://schemas.datacontract.org/2004/07/SIAV.Classification.Entities.Fascicoli.ValueObject", type = JAXBElement.class)
    protected JAXBElement<String> valueStr;

    /**
     * Gets the value of the campoId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CampiTipoFascicoloIdentifier }{@code >}
     *     
     */
    public JAXBElement<CampiTipoFascicoloIdentifier> getCampoId() {
        return campoId;
    }

    /**
     * Sets the value of the campoId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CampiTipoFascicoloIdentifier }{@code >}
     *     
     */
    public void setCampoId(JAXBElement<CampiTipoFascicoloIdentifier> value) {
        this.campoId = ((JAXBElement<CampiTipoFascicoloIdentifier> ) value);
    }

    /**
     * Gets the value of the fascId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link FascicoloIdentifier }{@code >}
     *     
     */
    public JAXBElement<FascicoloIdentifier> getFascId() {
        return fascId;
    }

    /**
     * Sets the value of the fascId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link FascicoloIdentifier }{@code >}
     *     
     */
    public void setFascId(JAXBElement<FascicoloIdentifier> value) {
        this.fascId = ((JAXBElement<FascicoloIdentifier> ) value);
    }

    /**
     * Gets the value of the valueDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CustomDateTimeNullable }{@code >}
     *     
     */
    public JAXBElement<CustomDateTimeNullable> getValueDate() {
        return valueDate;
    }

    /**
     * Sets the value of the valueDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CustomDateTimeNullable }{@code >}
     *     
     */
    public void setValueDate(JAXBElement<CustomDateTimeNullable> value) {
        this.valueDate = ((JAXBElement<CustomDateTimeNullable> ) value);
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
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getValueStr() {
        return valueStr;
    }

    /**
     * Sets the value of the valueStr property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setValueStr(JAXBElement<String> value) {
        this.valueStr = ((JAXBElement<String> ) value);
    }

}
