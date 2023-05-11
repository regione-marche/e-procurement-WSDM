
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
 *         &lt;element name="Dm_Aoo_GetDataResult" type="{http://www.Abletech.it/Arxivar}ArrayOfDm_Aoo" minOccurs="0"/>
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
    "dmAooGetDataResult"
})
@XmlRootElement(name = "Dm_Aoo_GetDataResponse")
public class DmAooGetDataResponse {

    @XmlElement(name = "Dm_Aoo_GetDataResult")
    protected ArrayOfDmAoo dmAooGetDataResult;

    /**
     * Gets the value of the dmAooGetDataResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDmAoo }
     *     
     */
    public ArrayOfDmAoo getDmAooGetDataResult() {
        return dmAooGetDataResult;
    }

    /**
     * Sets the value of the dmAooGetDataResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDmAoo }
     *     
     */
    public void setDmAooGetDataResult(ArrayOfDmAoo value) {
        this.dmAooGetDataResult = value;
    }

}
