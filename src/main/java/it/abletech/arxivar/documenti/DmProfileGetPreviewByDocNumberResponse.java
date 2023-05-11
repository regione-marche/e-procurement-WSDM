
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
 *         &lt;element name="Dm_Profile_GetPreview_By_DocNumberResult" type="{http://www.Abletech.it/Arxivar}ArrayOfArx_File_Indexed" minOccurs="0"/>
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
    "dmProfileGetPreviewByDocNumberResult"
})
@XmlRootElement(name = "Dm_Profile_GetPreview_By_DocNumberResponse")
public class DmProfileGetPreviewByDocNumberResponse {

    @XmlElement(name = "Dm_Profile_GetPreview_By_DocNumberResult")
    protected ArrayOfArxFileIndexed dmProfileGetPreviewByDocNumberResult;

    /**
     * Gets the value of the dmProfileGetPreviewByDocNumberResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfArxFileIndexed }
     *     
     */
    public ArrayOfArxFileIndexed getDmProfileGetPreviewByDocNumberResult() {
        return dmProfileGetPreviewByDocNumberResult;
    }

    /**
     * Sets the value of the dmProfileGetPreviewByDocNumberResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfArxFileIndexed }
     *     
     */
    public void setDmProfileGetPreviewByDocNumberResult(ArrayOfArxFileIndexed value) {
        this.dmProfileGetPreviewByDocNumberResult = value;
    }

}
