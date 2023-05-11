
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
 *         &lt;element name="Dm_Profile_GetPreview_By_DocNumber_PageResult" type="{http://www.Abletech.it/Arxivar}Arx_File" minOccurs="0"/>
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
    "dmProfileGetPreviewByDocNumberPageResult"
})
@XmlRootElement(name = "Dm_Profile_GetPreview_By_DocNumber_PageResponse")
public class DmProfileGetPreviewByDocNumberPageResponse {

    @XmlElement(name = "Dm_Profile_GetPreview_By_DocNumber_PageResult")
    protected ArxFile dmProfileGetPreviewByDocNumberPageResult;

    /**
     * Gets the value of the dmProfileGetPreviewByDocNumberPageResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArxFile }
     *     
     */
    public ArxFile getDmProfileGetPreviewByDocNumberPageResult() {
        return dmProfileGetPreviewByDocNumberPageResult;
    }

    /**
     * Sets the value of the dmProfileGetPreviewByDocNumberPageResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArxFile }
     *     
     */
    public void setDmProfileGetPreviewByDocNumberPageResult(ArxFile value) {
        this.dmProfileGetPreviewByDocNumberPageResult = value;
    }

}
