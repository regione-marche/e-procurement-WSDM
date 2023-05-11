
package it.archiflow94;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CalculateCardExpirationInput complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CalculateCardExpirationInput">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities}BaseInput">
 *       &lt;sequence>
 *         &lt;element name="ArchiveId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="DocumentTypeId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="Duration" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="ExpirationMethod" type="{http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Types}ExpirationMethodType" minOccurs="0"/>
 *         &lt;element name="TitolarioItemIds" type="{http://schemas.microsoft.com/2003/10/Serialization/Arrays}ArrayOfint" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CalculateCardExpirationInput", namespace = "http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Card.ValueObject", propOrder = {
    "archiveId",
    "documentTypeId",
    "duration",
    "expirationMethod",
    "titolarioItemIds"
})
public class CalculateCardExpirationInput
    extends BaseInput
{

    @XmlElement(name = "ArchiveId")
    protected Integer archiveId;
    @XmlElement(name = "DocumentTypeId")
    protected Integer documentTypeId;
    @XmlElement(name = "Duration", nillable = true)
    protected Integer duration;
    @XmlElement(name = "ExpirationMethod")
    protected ExpirationMethodType expirationMethod;
    @XmlElement(name = "TitolarioItemIds", nillable = true)
    protected ArrayOfint titolarioItemIds;

    /**
     * Gets the value of the archiveId property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getArchiveId() {
        return archiveId;
    }

    /**
     * Sets the value of the archiveId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setArchiveId(Integer value) {
        this.archiveId = value;
    }

    /**
     * Gets the value of the documentTypeId property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getDocumentTypeId() {
        return documentTypeId;
    }

    /**
     * Sets the value of the documentTypeId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setDocumentTypeId(Integer value) {
        this.documentTypeId = value;
    }

    /**
     * Gets the value of the duration property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getDuration() {
        return duration;
    }

    /**
     * Sets the value of the duration property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setDuration(Integer value) {
        this.duration = value;
    }

    /**
     * Gets the value of the expirationMethod property.
     * 
     * @return
     *     possible object is
     *     {@link ExpirationMethodType }
     *     
     */
    public ExpirationMethodType getExpirationMethod() {
        return expirationMethod;
    }

    /**
     * Sets the value of the expirationMethod property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExpirationMethodType }
     *     
     */
    public void setExpirationMethod(ExpirationMethodType value) {
        this.expirationMethod = value;
    }

    /**
     * Gets the value of the titolarioItemIds property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfint }
     *     
     */
    public ArrayOfint getTitolarioItemIds() {
        return titolarioItemIds;
    }

    /**
     * Sets the value of the titolarioItemIds property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfint }
     *     
     */
    public void setTitolarioItemIds(ArrayOfint value) {
        this.titolarioItemIds = value;
    }

}
