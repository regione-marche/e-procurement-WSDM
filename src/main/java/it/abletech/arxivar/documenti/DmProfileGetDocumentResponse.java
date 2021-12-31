
package it.abletech.arxivar.documenti;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Dm_Profile_GetDocumentResult" type="{http://www.Abletech.it/Arxivar}Arx_File" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "dmProfileGetDocumentResult"
})
@XmlRootElement(name = "Dm_Profile_GetDocumentResponse")
public class DmProfileGetDocumentResponse {

    @XmlElement(name = "Dm_Profile_GetDocumentResult")
    protected ArxFile dmProfileGetDocumentResult;

    /**
     * Gets the value of the dmProfileGetDocumentResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArxFile }
     *     
     */
    public ArxFile getDmProfileGetDocumentResult() {
        return dmProfileGetDocumentResult;
    }

    /**
     * Sets the value of the dmProfileGetDocumentResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArxFile }
     *     
     */
    public void setDmProfileGetDocumentResult(ArxFile value) {
        this.dmProfileGetDocumentResult = value;
    }

}
