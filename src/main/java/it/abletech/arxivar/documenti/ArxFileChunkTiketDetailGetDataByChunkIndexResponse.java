
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
 *         &lt;element name="Arx_FileChunkTiket_Detail_GetData_By_ChunkIndexResult" type="{http://www.w3.org/2001/XMLSchema}base64Binary" minOccurs="0"/>
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
    "arxFileChunkTiketDetailGetDataByChunkIndexResult"
})
@XmlRootElement(name = "Arx_FileChunkTiket_Detail_GetData_By_ChunkIndexResponse")
public class ArxFileChunkTiketDetailGetDataByChunkIndexResponse {

    @XmlElement(name = "Arx_FileChunkTiket_Detail_GetData_By_ChunkIndexResult")
    protected byte[] arxFileChunkTiketDetailGetDataByChunkIndexResult;

    /**
     * Gets the value of the arxFileChunkTiketDetailGetDataByChunkIndexResult property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getArxFileChunkTiketDetailGetDataByChunkIndexResult() {
        return arxFileChunkTiketDetailGetDataByChunkIndexResult;
    }

    /**
     * Sets the value of the arxFileChunkTiketDetailGetDataByChunkIndexResult property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setArxFileChunkTiketDetailGetDataByChunkIndexResult(byte[] value) {
        this.arxFileChunkTiketDetailGetDataByChunkIndexResult = ((byte[]) value);
    }

}
