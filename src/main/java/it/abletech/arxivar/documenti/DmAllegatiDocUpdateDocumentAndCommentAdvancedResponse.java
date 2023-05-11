
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
 *         &lt;element name="Dm_AllegatiDoc_Update_Document_And_Comment_AdvancedResult" type="{http://www.Abletech.it/Arxivar}ArxGenericException" minOccurs="0"/>
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
    "dmAllegatiDocUpdateDocumentAndCommentAdvancedResult"
})
@XmlRootElement(name = "Dm_AllegatiDoc_Update_Document_And_Comment_AdvancedResponse")
public class DmAllegatiDocUpdateDocumentAndCommentAdvancedResponse {

    @XmlElement(name = "Dm_AllegatiDoc_Update_Document_And_Comment_AdvancedResult")
    protected ArxGenericException dmAllegatiDocUpdateDocumentAndCommentAdvancedResult;

    /**
     * Gets the value of the dmAllegatiDocUpdateDocumentAndCommentAdvancedResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArxGenericException }
     *     
     */
    public ArxGenericException getDmAllegatiDocUpdateDocumentAndCommentAdvancedResult() {
        return dmAllegatiDocUpdateDocumentAndCommentAdvancedResult;
    }

    /**
     * Sets the value of the dmAllegatiDocUpdateDocumentAndCommentAdvancedResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArxGenericException }
     *     
     */
    public void setDmAllegatiDocUpdateDocumentAndCommentAdvancedResult(ArxGenericException value) {
        this.dmAllegatiDocUpdateDocumentAndCommentAdvancedResult = value;
    }

}
