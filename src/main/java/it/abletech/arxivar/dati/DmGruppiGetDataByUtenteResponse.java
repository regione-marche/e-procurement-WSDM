
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
 *         &lt;element name="Dm_Gruppi_GetData_By_UtenteResult" type="{http://www.Abletech.it/Arxivar}ArrayOfDm_Gruppi" minOccurs="0"/>
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
    "dmGruppiGetDataByUtenteResult"
})
@XmlRootElement(name = "Dm_Gruppi_GetData_By_UtenteResponse")
public class DmGruppiGetDataByUtenteResponse {

    @XmlElement(name = "Dm_Gruppi_GetData_By_UtenteResult")
    protected ArrayOfDmGruppi dmGruppiGetDataByUtenteResult;

    /**
     * Gets the value of the dmGruppiGetDataByUtenteResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDmGruppi }
     *     
     */
    public ArrayOfDmGruppi getDmGruppiGetDataByUtenteResult() {
        return dmGruppiGetDataByUtenteResult;
    }

    /**
     * Sets the value of the dmGruppiGetDataByUtenteResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDmGruppi }
     *     
     */
    public void setDmGruppiGetDataByUtenteResult(ArrayOfDmGruppi value) {
        this.dmGruppiGetDataByUtenteResult = value;
    }

}
