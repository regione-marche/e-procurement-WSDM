
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
 *         &lt;element name="Dm_Profile_SetDocumentResult" type="{http://www.Abletech.it/Arxivar}Security_Exception"/>
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
    "dmProfileSetDocumentResult"
})
@XmlRootElement(name = "Dm_Profile_SetDocumentResponse")
public class DmProfileSetDocumentResponse {

    @XmlElement(name = "Dm_Profile_SetDocumentResult", required = true)
    protected SecurityException dmProfileSetDocumentResult;

    /**
     * Gets the value of the dmProfileSetDocumentResult property.
     * 
     * @return
     *     possible object is
     *     {@link SecurityException }
     *     
     */
    public SecurityException getDmProfileSetDocumentResult() {
        return dmProfileSetDocumentResult;
    }

    /**
     * Sets the value of the dmProfileSetDocumentResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecurityException }
     *     
     */
    public void setDmProfileSetDocumentResult(SecurityException value) {
        this.dmProfileSetDocumentResult = value;
    }

}
