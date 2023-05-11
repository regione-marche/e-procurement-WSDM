
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
 *         &lt;element name="Arx_FileChunkTiket_GetData_By_IdResult" type="{http://www.Abletech.it/Arxivar}Arx_FileChunkTiket" minOccurs="0"/>
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
    "arxFileChunkTiketGetDataByIdResult"
})
@XmlRootElement(name = "Arx_FileChunkTiket_GetData_By_IdResponse")
public class ArxFileChunkTiketGetDataByIdResponse {

    @XmlElement(name = "Arx_FileChunkTiket_GetData_By_IdResult")
    protected ArxFileChunkTiket arxFileChunkTiketGetDataByIdResult;

    /**
     * Gets the value of the arxFileChunkTiketGetDataByIdResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArxFileChunkTiket }
     *     
     */
    public ArxFileChunkTiket getArxFileChunkTiketGetDataByIdResult() {
        return arxFileChunkTiketGetDataByIdResult;
    }

    /**
     * Sets the value of the arxFileChunkTiketGetDataByIdResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArxFileChunkTiket }
     *     
     */
    public void setArxFileChunkTiketGetDataByIdResult(ArxFileChunkTiket value) {
        this.arxFileChunkTiketGetDataByIdResult = value;
    }

}
