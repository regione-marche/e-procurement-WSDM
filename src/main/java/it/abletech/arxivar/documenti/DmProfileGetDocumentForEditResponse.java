
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
 *         &lt;element name="Dm_Profile_GetDocument_For_EditResult" type="{http://www.Abletech.it/Arxivar}Arx_File" minOccurs="0"/>
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
    "dmProfileGetDocumentForEditResult"
})
@XmlRootElement(name = "Dm_Profile_GetDocument_For_EditResponse")
public class DmProfileGetDocumentForEditResponse {

    @XmlElement(name = "Dm_Profile_GetDocument_For_EditResult")
    protected ArxFile dmProfileGetDocumentForEditResult;

    /**
     * Gets the value of the dmProfileGetDocumentForEditResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArxFile }
     *     
     */
    public ArxFile getDmProfileGetDocumentForEditResult() {
        return dmProfileGetDocumentForEditResult;
    }

    /**
     * Sets the value of the dmProfileGetDocumentForEditResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArxFile }
     *     
     */
    public void setDmProfileGetDocumentForEditResult(ArxFile value) {
        this.dmProfileGetDocumentForEditResult = value;
    }

}
