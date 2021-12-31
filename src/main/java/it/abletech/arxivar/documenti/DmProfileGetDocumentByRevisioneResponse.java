
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
 *         &lt;element name="Dm_Profile_GetDocument_By_RevisioneResult" type="{http://www.Abletech.it/Arxivar}Arx_File" minOccurs="0"/>
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
    "dmProfileGetDocumentByRevisioneResult"
})
@XmlRootElement(name = "Dm_Profile_GetDocument_By_RevisioneResponse")
public class DmProfileGetDocumentByRevisioneResponse {

    @XmlElement(name = "Dm_Profile_GetDocument_By_RevisioneResult")
    protected ArxFile dmProfileGetDocumentByRevisioneResult;

    /**
     * Gets the value of the dmProfileGetDocumentByRevisioneResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArxFile }
     *     
     */
    public ArxFile getDmProfileGetDocumentByRevisioneResult() {
        return dmProfileGetDocumentByRevisioneResult;
    }

    /**
     * Sets the value of the dmProfileGetDocumentByRevisioneResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArxFile }
     *     
     */
    public void setDmProfileGetDocumentByRevisioneResult(ArxFile value) {
        this.dmProfileGetDocumentByRevisioneResult = value;
    }

}
