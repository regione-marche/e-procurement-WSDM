
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
 *         &lt;element name="Arx_FileChunkTiket_DeleteAll_By_IdResult" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
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
    "arxFileChunkTiketDeleteAllByIdResult"
})
@XmlRootElement(name = "Arx_FileChunkTiket_DeleteAll_By_IdResponse")
public class ArxFileChunkTiketDeleteAllByIdResponse {

    @XmlElement(name = "Arx_FileChunkTiket_DeleteAll_By_IdResult")
    protected boolean arxFileChunkTiketDeleteAllByIdResult;

    /**
     * Gets the value of the arxFileChunkTiketDeleteAllByIdResult property.
     * 
     */
    public boolean isArxFileChunkTiketDeleteAllByIdResult() {
        return arxFileChunkTiketDeleteAllByIdResult;
    }

    /**
     * Sets the value of the arxFileChunkTiketDeleteAllByIdResult property.
     * 
     */
    public void setArxFileChunkTiketDeleteAllByIdResult(boolean value) {
        this.arxFileChunkTiketDeleteAllByIdResult = value;
    }

}
