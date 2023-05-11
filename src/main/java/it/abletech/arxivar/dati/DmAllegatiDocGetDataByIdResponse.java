
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
 *         &lt;element name="Dm_AllegatiDoc_GetData_By_IdResult" type="{http://www.Abletech.it/Arxivar}Dm_AllegatiDoc" minOccurs="0"/>
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
    "dmAllegatiDocGetDataByIdResult"
})
@XmlRootElement(name = "Dm_AllegatiDoc_GetData_By_IdResponse")
public class DmAllegatiDocGetDataByIdResponse {

    @XmlElement(name = "Dm_AllegatiDoc_GetData_By_IdResult")
    protected DmAllegatiDoc dmAllegatiDocGetDataByIdResult;

    /**
     * Gets the value of the dmAllegatiDocGetDataByIdResult property.
     * 
     * @return
     *     possible object is
     *     {@link DmAllegatiDoc }
     *     
     */
    public DmAllegatiDoc getDmAllegatiDocGetDataByIdResult() {
        return dmAllegatiDocGetDataByIdResult;
    }

    /**
     * Sets the value of the dmAllegatiDocGetDataByIdResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link DmAllegatiDoc }
     *     
     */
    public void setDmAllegatiDocGetDataByIdResult(DmAllegatiDoc value) {
        this.dmAllegatiDocGetDataByIdResult = value;
    }

}
