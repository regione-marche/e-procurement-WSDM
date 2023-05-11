
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
 *         &lt;element name="Dm_Profile_GetDocuments_By_IdErpResult" type="{http://www.Abletech.it/Arxivar}ArrayOfArx_File" minOccurs="0"/>
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
    "dmProfileGetDocumentsByIdErpResult"
})
@XmlRootElement(name = "Dm_Profile_GetDocuments_By_IdErpResponse")
public class DmProfileGetDocumentsByIdErpResponse {

    @XmlElement(name = "Dm_Profile_GetDocuments_By_IdErpResult")
    protected ArrayOfArxFile dmProfileGetDocumentsByIdErpResult;

    /**
     * Gets the value of the dmProfileGetDocumentsByIdErpResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfArxFile }
     *     
     */
    public ArrayOfArxFile getDmProfileGetDocumentsByIdErpResult() {
        return dmProfileGetDocumentsByIdErpResult;
    }

    /**
     * Sets the value of the dmProfileGetDocumentsByIdErpResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfArxFile }
     *     
     */
    public void setDmProfileGetDocumentsByIdErpResult(ArrayOfArxFile value) {
        this.dmProfileGetDocumentsByIdErpResult = value;
    }

}
