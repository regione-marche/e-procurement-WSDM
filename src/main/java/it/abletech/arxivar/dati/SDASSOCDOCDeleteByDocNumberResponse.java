
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
 *         &lt;element name="SD_ASSOCDOC_Delete_By_DocNumberResult" type="{http://www.w3.org/2001/XMLSchema}int"/>
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
    "sdassocdocDeleteByDocNumberResult"
})
@XmlRootElement(name = "SD_ASSOCDOC_Delete_By_DocNumberResponse")
public class SDASSOCDOCDeleteByDocNumberResponse {

    @XmlElement(name = "SD_ASSOCDOC_Delete_By_DocNumberResult")
    protected int sdassocdocDeleteByDocNumberResult;

    /**
     * Gets the value of the sdassocdocDeleteByDocNumberResult property.
     * 
     */
    public int getSDASSOCDOCDeleteByDocNumberResult() {
        return sdassocdocDeleteByDocNumberResult;
    }

    /**
     * Sets the value of the sdassocdocDeleteByDocNumberResult property.
     * 
     */
    public void setSDASSOCDOCDeleteByDocNumberResult(int value) {
        this.sdassocdocDeleteByDocNumberResult = value;
    }

}
