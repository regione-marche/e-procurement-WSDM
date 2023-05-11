
package it.abletech.arxivar.dati;

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
 *         &lt;element name="Dm_Profile_InsertResult" type="{http://www.Abletech.it/Arxivar}Dm_Profile_Result" minOccurs="0"/>
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
    "dmProfileInsertResult"
})
@XmlRootElement(name = "Dm_Profile_InsertResponse")
public class DmProfileInsertResponse {

    @XmlElement(name = "Dm_Profile_InsertResult")
    protected DmProfileResult dmProfileInsertResult;

    /**
     * Gets the value of the dmProfileInsertResult property.
     * 
     * @return
     *     possible object is
     *     {@link DmProfileResult }
     *     
     */
    public DmProfileResult getDmProfileInsertResult() {
        return dmProfileInsertResult;
    }

    /**
     * Sets the value of the dmProfileInsertResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link DmProfileResult }
     *     
     */
    public void setDmProfileInsertResult(DmProfileResult value) {
        this.dmProfileInsertResult = value;
    }

}
