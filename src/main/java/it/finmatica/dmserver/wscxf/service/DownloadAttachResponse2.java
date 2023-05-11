
package it.finmatica.dmserver.wscxf.service;

import javax.activation.DataHandler;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlMimeType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DownloadAttachResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DownloadAttachResponse">
 *   &lt;complexContent>
 *     &lt;extension base="{http://service.wscxf.dmServer.finmatica.it/}BaseResponse">
 *       &lt;sequence>
 *         &lt;element name="contentFile" type="{http://www.w3.org/2001/XMLSchema}base64Binary" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DownloadAttachResponse", propOrder = {
    "contentFile"
})
public class DownloadAttachResponse2
    extends BaseResponse
{

    @XmlMimeType("application/octet-stream")
    protected DataHandler contentFile;

    /**
     * Gets the value of the contentFile property.
     * 
     * @return
     *     possible object is
     *     {@link DataHandler }
     *     
     */
    public DataHandler getContentFile() {
        return contentFile;
    }

    /**
     * Sets the value of the contentFile property.
     * 
     * @param value
     *     allowed object is
     *     {@link DataHandler }
     *     
     */
    public void setContentFile(DataHandler value) {
        this.contentFile = value;
    }

}
