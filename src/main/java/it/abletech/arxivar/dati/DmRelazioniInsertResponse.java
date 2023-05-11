
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
 *         &lt;element name="Dm_Relazioni_InsertResult" type="{http://www.Abletech.it/Arxivar}Dm_Relazioni" minOccurs="0"/>
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
    "dmRelazioniInsertResult"
})
@XmlRootElement(name = "Dm_Relazioni_InsertResponse")
public class DmRelazioniInsertResponse {

    @XmlElement(name = "Dm_Relazioni_InsertResult")
    protected DmRelazioni dmRelazioniInsertResult;

    /**
     * Gets the value of the dmRelazioniInsertResult property.
     * 
     * @return
     *     possible object is
     *     {@link DmRelazioni }
     *     
     */
    public DmRelazioni getDmRelazioniInsertResult() {
        return dmRelazioniInsertResult;
    }

    /**
     * Sets the value of the dmRelazioniInsertResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link DmRelazioni }
     *     
     */
    public void setDmRelazioniInsertResult(DmRelazioni value) {
        this.dmRelazioniInsertResult = value;
    }

}
