
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
 *         &lt;element name="Dm_Fascicoli_DeleteResult" type="{http://www.w3.org/2001/XMLSchema}int"/>
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
    "dmFascicoliDeleteResult"
})
@XmlRootElement(name = "Dm_Fascicoli_DeleteResponse")
public class DmFascicoliDeleteResponse {

    @XmlElement(name = "Dm_Fascicoli_DeleteResult")
    protected int dmFascicoliDeleteResult;

    /**
     * Gets the value of the dmFascicoliDeleteResult property.
     * 
     */
    public int getDmFascicoliDeleteResult() {
        return dmFascicoliDeleteResult;
    }

    /**
     * Sets the value of the dmFascicoliDeleteResult property.
     * 
     */
    public void setDmFascicoliDeleteResult(int value) {
        this.dmFascicoliDeleteResult = value;
    }

}
