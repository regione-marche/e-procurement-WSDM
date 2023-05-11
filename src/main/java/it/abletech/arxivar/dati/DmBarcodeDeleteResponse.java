
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
 *         &lt;element name="Dm_Barcode_DeleteResult" type="{http://www.w3.org/2001/XMLSchema}int"/>
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
    "dmBarcodeDeleteResult"
})
@XmlRootElement(name = "Dm_Barcode_DeleteResponse")
public class DmBarcodeDeleteResponse {

    @XmlElement(name = "Dm_Barcode_DeleteResult")
    protected int dmBarcodeDeleteResult;

    /**
     * Gets the value of the dmBarcodeDeleteResult property.
     * 
     */
    public int getDmBarcodeDeleteResult() {
        return dmBarcodeDeleteResult;
    }

    /**
     * Sets the value of the dmBarcodeDeleteResult property.
     * 
     */
    public void setDmBarcodeDeleteResult(int value) {
        this.dmBarcodeDeleteResult = value;
    }

}
