
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
 *         &lt;element name="Dm_Relazioni_GetData_By_Docnumber_In_DocnumberFromResult" type="{http://www.Abletech.it/Arxivar}ArrayOfDm_Relazioni" minOccurs="0"/>
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
    "dmRelazioniGetDataByDocnumberInDocnumberFromResult"
})
@XmlRootElement(name = "Dm_Relazioni_GetData_By_Docnumber_In_DocnumberFromResponse")
public class DmRelazioniGetDataByDocnumberInDocnumberFromResponse {

    @XmlElement(name = "Dm_Relazioni_GetData_By_Docnumber_In_DocnumberFromResult")
    protected ArrayOfDmRelazioni dmRelazioniGetDataByDocnumberInDocnumberFromResult;

    /**
     * Gets the value of the dmRelazioniGetDataByDocnumberInDocnumberFromResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDmRelazioni }
     *     
     */
    public ArrayOfDmRelazioni getDmRelazioniGetDataByDocnumberInDocnumberFromResult() {
        return dmRelazioniGetDataByDocnumberInDocnumberFromResult;
    }

    /**
     * Sets the value of the dmRelazioniGetDataByDocnumberInDocnumberFromResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDmRelazioni }
     *     
     */
    public void setDmRelazioniGetDataByDocnumberInDocnumberFromResult(ArrayOfDmRelazioni value) {
        this.dmRelazioniGetDataByDocnumberInDocnumberFromResult = value;
    }

}
