
package it.archiflow94;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ClassificationSearchCriteria complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ClassificationSearchCriteria">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ClassificationOptions" type="{http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Types}SearchOptions" minOccurs="0"/>
 *         &lt;element name="ClassificationsId" type="{http://schemas.microsoft.com/2003/10/Serialization/Arrays}ArrayOfint" minOccurs="0"/>
 *         &lt;element name="StoreDossierOptions" type="{http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Types}SearchOptions" minOccurs="0"/>
 *         &lt;element name="StoreDossiersId" type="{http://schemas.microsoft.com/2003/10/Serialization/Arrays}ArrayOfint" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ClassificationSearchCriteria", namespace = "http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Card.ValueObject", propOrder = {
    "classificationOptions",
    "classificationsId",
    "storeDossierOptions",
    "storeDossiersId"
})
public class ClassificationSearchCriteria {

    @XmlElement(name = "ClassificationOptions")
    protected SearchOptions classificationOptions;
    @XmlElement(name = "ClassificationsId", nillable = true)
    protected ArrayOfint classificationsId;
    @XmlElement(name = "StoreDossierOptions")
    protected SearchOptions storeDossierOptions;
    @XmlElement(name = "StoreDossiersId", nillable = true)
    protected ArrayOfint storeDossiersId;

    /**
     * Gets the value of the classificationOptions property.
     * 
     * @return
     *     possible object is
     *     {@link SearchOptions }
     *     
     */
    public SearchOptions getClassificationOptions() {
        return classificationOptions;
    }

    /**
     * Sets the value of the classificationOptions property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchOptions }
     *     
     */
    public void setClassificationOptions(SearchOptions value) {
        this.classificationOptions = value;
    }

    /**
     * Gets the value of the classificationsId property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfint }
     *     
     */
    public ArrayOfint getClassificationsId() {
        return classificationsId;
    }

    /**
     * Sets the value of the classificationsId property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfint }
     *     
     */
    public void setClassificationsId(ArrayOfint value) {
        this.classificationsId = value;
    }

    /**
     * Gets the value of the storeDossierOptions property.
     * 
     * @return
     *     possible object is
     *     {@link SearchOptions }
     *     
     */
    public SearchOptions getStoreDossierOptions() {
        return storeDossierOptions;
    }

    /**
     * Sets the value of the storeDossierOptions property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchOptions }
     *     
     */
    public void setStoreDossierOptions(SearchOptions value) {
        this.storeDossierOptions = value;
    }

    /**
     * Gets the value of the storeDossiersId property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfint }
     *     
     */
    public ArrayOfint getStoreDossiersId() {
        return storeDossiersId;
    }

    /**
     * Sets the value of the storeDossiersId property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfint }
     *     
     */
    public void setStoreDossiersId(ArrayOfint value) {
        this.storeDossiersId = value;
    }

}
