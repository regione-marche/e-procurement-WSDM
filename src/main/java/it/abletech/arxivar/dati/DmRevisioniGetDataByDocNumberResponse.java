
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
 *         &lt;element name="Dm_Revisioni_GetDataByDocNumberResult" type="{http://www.Abletech.it/Arxivar}ArrayOfDm_Revisioni" minOccurs="0"/>
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
    "dmRevisioniGetDataByDocNumberResult"
})
@XmlRootElement(name = "Dm_Revisioni_GetDataByDocNumberResponse")
public class DmRevisioniGetDataByDocNumberResponse {

    @XmlElement(name = "Dm_Revisioni_GetDataByDocNumberResult")
    protected ArrayOfDmRevisioni dmRevisioniGetDataByDocNumberResult;

    /**
     * Gets the value of the dmRevisioniGetDataByDocNumberResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDmRevisioni }
     *     
     */
    public ArrayOfDmRevisioni getDmRevisioniGetDataByDocNumberResult() {
        return dmRevisioniGetDataByDocNumberResult;
    }

    /**
     * Sets the value of the dmRevisioniGetDataByDocNumberResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDmRevisioni }
     *     
     */
    public void setDmRevisioniGetDataByDocNumberResult(ArrayOfDmRevisioni value) {
        this.dmRevisioniGetDataByDocNumberResult = value;
    }

}
