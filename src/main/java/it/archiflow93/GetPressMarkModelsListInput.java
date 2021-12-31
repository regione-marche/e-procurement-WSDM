
package it.archiflow93;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetPressMarkModelsListInput complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetPressMarkModelsListInput">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities}BaseInput">
 *       &lt;sequence>
 *         &lt;element name="ArchiveType" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/>
 *         &lt;element name="DocumentType" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/>
 *         &lt;element name="PressMarkType" type="{http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Types}PressMarkType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetPressMarkModelsListInput", namespace = "http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Card.ValueObject", propOrder = {
    "archiveType",
    "documentType",
    "pressMarkType"
})
public class GetPressMarkModelsListInput
    extends BaseInput
{

    @XmlElement(name = "ArchiveType")
    protected Short archiveType;
    @XmlElement(name = "DocumentType")
    protected Short documentType;
    @XmlElement(name = "PressMarkType")
    protected PressMarkType pressMarkType;

    /**
     * Gets the value of the archiveType property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getArchiveType() {
        return archiveType;
    }

    /**
     * Sets the value of the archiveType property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setArchiveType(Short value) {
        this.archiveType = value;
    }

    /**
     * Gets the value of the documentType property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getDocumentType() {
        return documentType;
    }

    /**
     * Sets the value of the documentType property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setDocumentType(Short value) {
        this.documentType = value;
    }

    /**
     * Gets the value of the pressMarkType property.
     * 
     * @return
     *     possible object is
     *     {@link PressMarkType }
     *     
     */
    public PressMarkType getPressMarkType() {
        return pressMarkType;
    }

    /**
     * Sets the value of the pressMarkType property.
     * 
     * @param value
     *     allowed object is
     *     {@link PressMarkType }
     *     
     */
    public void setPressMarkType(PressMarkType value) {
        this.pressMarkType = value;
    }

}
