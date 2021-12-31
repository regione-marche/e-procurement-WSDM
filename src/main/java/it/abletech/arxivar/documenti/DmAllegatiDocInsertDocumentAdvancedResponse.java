
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
 *         &lt;element name="Dm_AllegatiDoc_Insert_Document_AdvancedResult" type="{http://www.Abletech.it/Arxivar}ArxGenericException" minOccurs="0"/>
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
    "dmAllegatiDocInsertDocumentAdvancedResult"
})
@XmlRootElement(name = "Dm_AllegatiDoc_Insert_Document_AdvancedResponse")
public class DmAllegatiDocInsertDocumentAdvancedResponse {

    @XmlElement(name = "Dm_AllegatiDoc_Insert_Document_AdvancedResult")
    protected ArxGenericException dmAllegatiDocInsertDocumentAdvancedResult;

    /**
     * Gets the value of the dmAllegatiDocInsertDocumentAdvancedResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArxGenericException }
     *     
     */
    public ArxGenericException getDmAllegatiDocInsertDocumentAdvancedResult() {
        return dmAllegatiDocInsertDocumentAdvancedResult;
    }

    /**
     * Sets the value of the dmAllegatiDocInsertDocumentAdvancedResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArxGenericException }
     *     
     */
    public void setDmAllegatiDocInsertDocumentAdvancedResult(ArxGenericException value) {
        this.dmAllegatiDocInsertDocumentAdvancedResult = value;
    }

}
