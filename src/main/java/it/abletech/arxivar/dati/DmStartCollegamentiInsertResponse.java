
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
 *         &lt;element name="Dm_StartCollegamenti_InsertResult" type="{http://www.Abletech.it/Arxivar}Dm_StartCollegamenti" minOccurs="0"/>
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
    "dmStartCollegamentiInsertResult"
})
@XmlRootElement(name = "Dm_StartCollegamenti_InsertResponse")
public class DmStartCollegamentiInsertResponse {

    @XmlElement(name = "Dm_StartCollegamenti_InsertResult")
    protected DmStartCollegamenti dmStartCollegamentiInsertResult;

    /**
     * Gets the value of the dmStartCollegamentiInsertResult property.
     * 
     * @return
     *     possible object is
     *     {@link DmStartCollegamenti }
     *     
     */
    public DmStartCollegamenti getDmStartCollegamentiInsertResult() {
        return dmStartCollegamentiInsertResult;
    }

    /**
     * Sets the value of the dmStartCollegamentiInsertResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link DmStartCollegamenti }
     *     
     */
    public void setDmStartCollegamentiInsertResult(DmStartCollegamenti value) {
        this.dmStartCollegamentiInsertResult = value;
    }

}
