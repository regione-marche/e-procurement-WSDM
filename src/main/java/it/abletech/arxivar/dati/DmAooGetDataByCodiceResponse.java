
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
 *         &lt;element name="Dm_Aoo_GetData_By_CodiceResult" type="{http://www.Abletech.it/Arxivar}Dm_Aoo" minOccurs="0"/>
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
    "dmAooGetDataByCodiceResult"
})
@XmlRootElement(name = "Dm_Aoo_GetData_By_CodiceResponse")
public class DmAooGetDataByCodiceResponse {

    @XmlElement(name = "Dm_Aoo_GetData_By_CodiceResult")
    protected DmAoo dmAooGetDataByCodiceResult;

    /**
     * Gets the value of the dmAooGetDataByCodiceResult property.
     * 
     * @return
     *     possible object is
     *     {@link DmAoo }
     *     
     */
    public DmAoo getDmAooGetDataByCodiceResult() {
        return dmAooGetDataByCodiceResult;
    }

    /**
     * Sets the value of the dmAooGetDataByCodiceResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link DmAoo }
     *     
     */
    public void setDmAooGetDataByCodiceResult(DmAoo value) {
        this.dmAooGetDataByCodiceResult = value;
    }

}
