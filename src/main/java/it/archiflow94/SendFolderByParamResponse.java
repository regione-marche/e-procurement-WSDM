
package it.archiflow94;

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
 *         &lt;element name="SendFolderByParamResult" type="{http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Folder.ValueObject}SendFolderOutput" minOccurs="0"/>
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
    "sendFolderByParamResult"
})
@XmlRootElement(name = "SendFolderByParamResponse")
public class SendFolderByParamResponse {

    @XmlElement(name = "SendFolderByParamResult", nillable = true)
    protected SendFolderOutput sendFolderByParamResult;

    /**
     * Gets the value of the sendFolderByParamResult property.
     * 
     * @return
     *     possible object is
     *     {@link SendFolderOutput }
     *     
     */
    public SendFolderOutput getSendFolderByParamResult() {
        return sendFolderByParamResult;
    }

    /**
     * Sets the value of the sendFolderByParamResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link SendFolderOutput }
     *     
     */
    public void setSendFolderByParamResult(SendFolderOutput value) {
        this.sendFolderByParamResult = value;
    }

}
