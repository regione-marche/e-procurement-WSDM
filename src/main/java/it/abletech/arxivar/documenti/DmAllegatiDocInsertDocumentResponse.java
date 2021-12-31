
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
 *         &lt;element name="Dm_AllegatiDoc_Insert_DocumentResult" type="{http://www.Abletech.it/Arxivar}Dm_AllegatiDoc" minOccurs="0"/>
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
    "dmAllegatiDocInsertDocumentResult"
})
@XmlRootElement(name = "Dm_AllegatiDoc_Insert_DocumentResponse")
public class DmAllegatiDocInsertDocumentResponse {

    @XmlElement(name = "Dm_AllegatiDoc_Insert_DocumentResult")
    protected DmAllegatiDoc dmAllegatiDocInsertDocumentResult;

    /**
     * Gets the value of the dmAllegatiDocInsertDocumentResult property.
     * 
     * @return
     *     possible object is
     *     {@link DmAllegatiDoc }
     *     
     */
    public DmAllegatiDoc getDmAllegatiDocInsertDocumentResult() {
        return dmAllegatiDocInsertDocumentResult;
    }

    /**
     * Sets the value of the dmAllegatiDocInsertDocumentResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link DmAllegatiDoc }
     *     
     */
    public void setDmAllegatiDocInsertDocumentResult(DmAllegatiDoc value) {
        this.dmAllegatiDocInsertDocumentResult = value;
    }

}
