
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
 *         &lt;element name="Dm_AllegatiDoc_GetData_By_DocnumberResult" type="{http://www.Abletech.it/Arxivar}ArrayOfDm_AllegatiDoc" minOccurs="0"/>
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
    "dmAllegatiDocGetDataByDocnumberResult"
})
@XmlRootElement(name = "Dm_AllegatiDoc_GetData_By_DocnumberResponse")
public class DmAllegatiDocGetDataByDocnumberResponse {

    @XmlElement(name = "Dm_AllegatiDoc_GetData_By_DocnumberResult")
    protected ArrayOfDmAllegatiDoc dmAllegatiDocGetDataByDocnumberResult;

    /**
     * Gets the value of the dmAllegatiDocGetDataByDocnumberResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDmAllegatiDoc }
     *     
     */
    public ArrayOfDmAllegatiDoc getDmAllegatiDocGetDataByDocnumberResult() {
        return dmAllegatiDocGetDataByDocnumberResult;
    }

    /**
     * Sets the value of the dmAllegatiDocGetDataByDocnumberResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDmAllegatiDoc }
     *     
     */
    public void setDmAllegatiDocGetDataByDocnumberResult(ArrayOfDmAllegatiDoc value) {
        this.dmAllegatiDocGetDataByDocnumberResult = value;
    }

}
