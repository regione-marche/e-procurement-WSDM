
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
 *         &lt;element name="Dm_Elenco_Ricerche_GetDataResult" type="{http://www.Abletech.it/Arxivar}ArrayOfDm_Elenco_Ricerche" minOccurs="0"/>
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
    "dmElencoRicercheGetDataResult"
})
@XmlRootElement(name = "Dm_Elenco_Ricerche_GetDataResponse")
public class DmElencoRicercheGetDataResponse {

    @XmlElement(name = "Dm_Elenco_Ricerche_GetDataResult")
    protected ArrayOfDmElencoRicerche dmElencoRicercheGetDataResult;

    /**
     * Gets the value of the dmElencoRicercheGetDataResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDmElencoRicerche }
     *     
     */
    public ArrayOfDmElencoRicerche getDmElencoRicercheGetDataResult() {
        return dmElencoRicercheGetDataResult;
    }

    /**
     * Sets the value of the dmElencoRicercheGetDataResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDmElencoRicerche }
     *     
     */
    public void setDmElencoRicercheGetDataResult(ArrayOfDmElencoRicerche value) {
        this.dmElencoRicercheGetDataResult = value;
    }

}
