
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
 *         &lt;element name="SD_ASSOCDOC_Delete_By_IdResult" type="{http://www.w3.org/2001/XMLSchema}int"/>
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
    "sdassocdocDeleteByIdResult"
})
@XmlRootElement(name = "SD_ASSOCDOC_Delete_By_IdResponse")
public class SDASSOCDOCDeleteByIdResponse {

    @XmlElement(name = "SD_ASSOCDOC_Delete_By_IdResult")
    protected int sdassocdocDeleteByIdResult;

    /**
     * Gets the value of the sdassocdocDeleteByIdResult property.
     * 
     */
    public int getSDASSOCDOCDeleteByIdResult() {
        return sdassocdocDeleteByIdResult;
    }

    /**
     * Sets the value of the sdassocdocDeleteByIdResult property.
     * 
     */
    public void setSDASSOCDOCDeleteByIdResult(int value) {
        this.sdassocdocDeleteByIdResult = value;
    }

}
