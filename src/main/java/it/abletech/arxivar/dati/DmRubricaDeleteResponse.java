
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
 *         &lt;element name="Dm_Rubrica_DeleteResult" type="{http://www.w3.org/2001/XMLSchema}int"/>
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
    "dmRubricaDeleteResult"
})
@XmlRootElement(name = "Dm_Rubrica_DeleteResponse")
public class DmRubricaDeleteResponse {

    @XmlElement(name = "Dm_Rubrica_DeleteResult")
    protected int dmRubricaDeleteResult;

    /**
     * Gets the value of the dmRubricaDeleteResult property.
     * 
     */
    public int getDmRubricaDeleteResult() {
        return dmRubricaDeleteResult;
    }

    /**
     * Sets the value of the dmRubricaDeleteResult property.
     * 
     */
    public void setDmRubricaDeleteResult(int value) {
        this.dmRubricaDeleteResult = value;
    }

}
