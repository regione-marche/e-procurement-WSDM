
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
 *         &lt;element name="Dm_ElencoPratiche_Insert_Get_New_Instance_By_DmTipiPraticheIdResult" type="{http://www.Abletech.it/Arxivar}Dm_ElencoPratiche_Insert" minOccurs="0"/>
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
    "dmElencoPraticheInsertGetNewInstanceByDmTipiPraticheIdResult"
})
@XmlRootElement(name = "Dm_ElencoPratiche_Insert_Get_New_Instance_By_DmTipiPraticheIdResponse")
public class DmElencoPraticheInsertGetNewInstanceByDmTipiPraticheIdResponse {

    @XmlElement(name = "Dm_ElencoPratiche_Insert_Get_New_Instance_By_DmTipiPraticheIdResult")
    protected DmElencoPraticheInsert dmElencoPraticheInsertGetNewInstanceByDmTipiPraticheIdResult;

    /**
     * Gets the value of the dmElencoPraticheInsertGetNewInstanceByDmTipiPraticheIdResult property.
     * 
     * @return
     *     possible object is
     *     {@link DmElencoPraticheInsert }
     *     
     */
    public DmElencoPraticheInsert getDmElencoPraticheInsertGetNewInstanceByDmTipiPraticheIdResult() {
        return dmElencoPraticheInsertGetNewInstanceByDmTipiPraticheIdResult;
    }

    /**
     * Sets the value of the dmElencoPraticheInsertGetNewInstanceByDmTipiPraticheIdResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link DmElencoPraticheInsert }
     *     
     */
    public void setDmElencoPraticheInsertGetNewInstanceByDmTipiPraticheIdResult(DmElencoPraticheInsert value) {
        this.dmElencoPraticheInsertGetNewInstanceByDmTipiPraticheIdResult = value;
    }

}
