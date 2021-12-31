
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
 *         &lt;element name="Dm_UtentiBase_GetData_By_Categoria_StatoResult" type="{http://www.Abletech.it/Arxivar}ArrayOfDm_UtentiBase" minOccurs="0"/>
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
    "dmUtentiBaseGetDataByCategoriaStatoResult"
})
@XmlRootElement(name = "Dm_UtentiBase_GetData_By_Categoria_StatoResponse")
public class DmUtentiBaseGetDataByCategoriaStatoResponse {

    @XmlElement(name = "Dm_UtentiBase_GetData_By_Categoria_StatoResult")
    protected ArrayOfDmUtentiBase dmUtentiBaseGetDataByCategoriaStatoResult;

    /**
     * Gets the value of the dmUtentiBaseGetDataByCategoriaStatoResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDmUtentiBase }
     *     
     */
    public ArrayOfDmUtentiBase getDmUtentiBaseGetDataByCategoriaStatoResult() {
        return dmUtentiBaseGetDataByCategoriaStatoResult;
    }

    /**
     * Sets the value of the dmUtentiBaseGetDataByCategoriaStatoResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDmUtentiBase }
     *     
     */
    public void setDmUtentiBaseGetDataByCategoriaStatoResult(ArrayOfDmUtentiBase value) {
        this.dmUtentiBaseGetDataByCategoriaStatoResult = value;
    }

}
