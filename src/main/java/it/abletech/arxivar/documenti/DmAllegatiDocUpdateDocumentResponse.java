
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
 *         &lt;element name="Dm_AllegatiDoc_Update_DocumentResult" type="{http://www.Abletech.it/Arxivar}Security_Exception"/>
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
    "dmAllegatiDocUpdateDocumentResult"
})
@XmlRootElement(name = "Dm_AllegatiDoc_Update_DocumentResponse")
public class DmAllegatiDocUpdateDocumentResponse {

    @XmlElement(name = "Dm_AllegatiDoc_Update_DocumentResult", required = true)
    protected SecurityException dmAllegatiDocUpdateDocumentResult;

    /**
     * Gets the value of the dmAllegatiDocUpdateDocumentResult property.
     * 
     * @return
     *     possible object is
     *     {@link SecurityException }
     *     
     */
    public SecurityException getDmAllegatiDocUpdateDocumentResult() {
        return dmAllegatiDocUpdateDocumentResult;
    }

    /**
     * Sets the value of the dmAllegatiDocUpdateDocumentResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecurityException }
     *     
     */
    public void setDmAllegatiDocUpdateDocumentResult(SecurityException value) {
        this.dmAllegatiDocUpdateDocumentResult = value;
    }

}
