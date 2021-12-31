
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
 *         &lt;element name="Dm_AllegatiDoc_DeleteResult" type="{http://www.w3.org/2001/XMLSchema}int"/>
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
    "dmAllegatiDocDeleteResult"
})
@XmlRootElement(name = "Dm_AllegatiDoc_DeleteResponse")
public class DmAllegatiDocDeleteResponse {

    @XmlElement(name = "Dm_AllegatiDoc_DeleteResult")
    protected int dmAllegatiDocDeleteResult;

    /**
     * Gets the value of the dmAllegatiDocDeleteResult property.
     * 
     */
    public int getDmAllegatiDocDeleteResult() {
        return dmAllegatiDocDeleteResult;
    }

    /**
     * Sets the value of the dmAllegatiDocDeleteResult property.
     * 
     */
    public void setDmAllegatiDocDeleteResult(int value) {
        this.dmAllegatiDocDeleteResult = value;
    }

}
