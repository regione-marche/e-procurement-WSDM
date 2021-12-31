
package it.archiflow93;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetDocumentTypesOutput complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetDocumentTypesOutput">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities}BaseOutput">
 *       &lt;sequence>
 *         &lt;element name="DocumentTypes" type="{http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Card.ValueObject}ArrayOfDocumentType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetDocumentTypesOutput", namespace = "http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Card.ValueObject", propOrder = {
    "documentTypes"
})
public class GetDocumentTypesOutput
    extends BaseOutput
{

    @XmlElement(name = "DocumentTypes", nillable = true)
    protected ArrayOfDocumentType documentTypes;

    /**
     * Gets the value of the documentTypes property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDocumentType }
     *     
     */
    public ArrayOfDocumentType getDocumentTypes() {
        return documentTypes;
    }

    /**
     * Sets the value of the documentTypes property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDocumentType }
     *     
     */
    public void setDocumentTypes(ArrayOfDocumentType value) {
        this.documentTypes = value;
    }

}
