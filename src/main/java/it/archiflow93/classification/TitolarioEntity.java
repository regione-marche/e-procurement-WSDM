
package it.archiflow93.classification;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TitolarioEntity complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TitolarioEntity">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/SIAV.Classification.Entities.Titolario.ValueObject}BaseTitolario">
 *       &lt;sequence>
 *         &lt;element name="AOOKey" type="{http://schemas.datacontract.org/2004/07/SIAV.Common.BaseClass.ValueObject}CoupleIdentifier" minOccurs="0"/>
 *         &lt;element name="AutoCreateFirstSeries" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Edition" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EndValidationDate" type="{http://schemas.datacontract.org/2004/07/SIAV.Classification.Entities.Common.BaseClass}CustomDateTimeNullable" minOccurs="0"/>
 *         &lt;element name="StartValidationDate" type="{http://schemas.datacontract.org/2004/07/SIAV.Classification.Entities.Common.BaseClass}CustomDateTimeNullable" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TitolarioEntity", namespace = "http://schemas.datacontract.org/2004/07/SIAV.Classification.Entities.Titolario.ValueObject", propOrder = {
    "aooKey",
    "autoCreateFirstSeries",
    "edition",
    "endValidationDate",
    "startValidationDate"
})
public class TitolarioEntity
    extends BaseTitolario
{

    @XmlElement(name = "AOOKey", nillable = true)
    protected CoupleIdentifier aooKey;
    @XmlElement(name = "AutoCreateFirstSeries")
    protected Boolean autoCreateFirstSeries;
    @XmlElement(name = "Edition", nillable = true)
    protected String edition;
    @XmlElement(name = "EndValidationDate", nillable = true)
    protected CustomDateTimeNullable endValidationDate;
    @XmlElement(name = "StartValidationDate", nillable = true)
    protected CustomDateTimeNullable startValidationDate;

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
     * Gets the value of the autoCreateFirstSeries property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAutoCreateFirstSeries() {
        return autoCreateFirstSeries;
    }

    /**
     * Sets the value of the autoCreateFirstSeries property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAutoCreateFirstSeries(Boolean value) {
        this.autoCreateFirstSeries = value;
    }

    /**
     * Gets the value of the edition property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEdition() {
        return edition;
    }

    /**
     * Sets the value of the edition property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEdition(String value) {
        this.edition = value;
    }

    /**
     * Gets the value of the endValidationDate property.
     * 
     * @return
     *     possible object is
     *     {@link CustomDateTimeNullable }
     *     
     */
    public CustomDateTimeNullable getEndValidationDate() {
        return endValidationDate;
    }

    /**
     * Sets the value of the endValidationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomDateTimeNullable }
     *     
     */
    public void setEndValidationDate(CustomDateTimeNullable value) {
        this.endValidationDate = value;
    }

    /**
     * Gets the value of the startValidationDate property.
     * 
     * @return
     *     possible object is
     *     {@link CustomDateTimeNullable }
     *     
     */
    public CustomDateTimeNullable getStartValidationDate() {
        return startValidationDate;
    }

    /**
     * Sets the value of the startValidationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomDateTimeNullable }
     *     
     */
    public void setStartValidationDate(CustomDateTimeNullable value) {
        this.startValidationDate = value;
    }

}
