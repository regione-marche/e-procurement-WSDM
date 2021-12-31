
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
 *         &lt;element name="Dm_Relazioni_Delete_By_DocNumberFrom_DocNumberToResult" type="{http://www.w3.org/2001/XMLSchema}int"/>
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
    "dmRelazioniDeleteByDocNumberFromDocNumberToResult"
})
@XmlRootElement(name = "Dm_Relazioni_Delete_By_DocNumberFrom_DocNumberToResponse")
public class DmRelazioniDeleteByDocNumberFromDocNumberToResponse {

    @XmlElement(name = "Dm_Relazioni_Delete_By_DocNumberFrom_DocNumberToResult")
    protected int dmRelazioniDeleteByDocNumberFromDocNumberToResult;

    /**
     * Gets the value of the dmRelazioniDeleteByDocNumberFromDocNumberToResult property.
     * 
     */
    public int getDmRelazioniDeleteByDocNumberFromDocNumberToResult() {
        return dmRelazioniDeleteByDocNumberFromDocNumberToResult;
    }

    /**
     * Sets the value of the dmRelazioniDeleteByDocNumberFromDocNumberToResult property.
     * 
     */
    public void setDmRelazioniDeleteByDocNumberFromDocNumberToResult(int value) {
        this.dmRelazioniDeleteByDocNumberFromDocNumberToResult = value;
    }

}
