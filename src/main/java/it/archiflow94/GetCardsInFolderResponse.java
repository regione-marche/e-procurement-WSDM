
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
 *         &lt;element name="GetCardsInFolderResult" type="{http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Folder.ValueObject}GetCardsInFolderOutput" minOccurs="0"/>
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
    "getCardsInFolderResult"
})
@XmlRootElement(name = "GetCardsInFolderResponse")
public class GetCardsInFolderResponse {

    @XmlElement(name = "GetCardsInFolderResult", nillable = true)
    protected GetCardsInFolderOutput getCardsInFolderResult;

    /**
     * Gets the value of the getCardsInFolderResult property.
     * 
     * @return
     *     possible object is
     *     {@link GetCardsInFolderOutput }
     *     
     */
    public GetCardsInFolderOutput getGetCardsInFolderResult() {
        return getCardsInFolderResult;
    }

    /**
     * Sets the value of the getCardsInFolderResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetCardsInFolderOutput }
     *     
     */
    public void setGetCardsInFolderResult(GetCardsInFolderOutput value) {
        this.getCardsInFolderResult = value;
    }

}
