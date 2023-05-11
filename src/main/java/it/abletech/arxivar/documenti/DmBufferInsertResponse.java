
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
 *         &lt;element name="Dm_Buffer_InsertResult" type="{http://www.Abletech.it/Arxivar}ArxGenericException" minOccurs="0"/>
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
    "dmBufferInsertResult"
})
@XmlRootElement(name = "Dm_Buffer_InsertResponse")
public class DmBufferInsertResponse {

    @XmlElement(name = "Dm_Buffer_InsertResult")
    protected ArxGenericException dmBufferInsertResult;

    /**
     * Gets the value of the dmBufferInsertResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArxGenericException }
     *     
     */
    public ArxGenericException getDmBufferInsertResult() {
        return dmBufferInsertResult;
    }

    /**
     * Sets the value of the dmBufferInsertResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArxGenericException }
     *     
     */
    public void setDmBufferInsertResult(ArxGenericException value) {
        this.dmBufferInsertResult = value;
    }

}
