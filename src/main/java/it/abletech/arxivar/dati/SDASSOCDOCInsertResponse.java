
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
 *         &lt;element name="SD_ASSOCDOC_InsertResult" type="{http://www.Abletech.it/Arxivar}Sd_AssocDoc" minOccurs="0"/>
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
    "sdassocdocInsertResult"
})
@XmlRootElement(name = "SD_ASSOCDOC_InsertResponse")
public class SDASSOCDOCInsertResponse {

    @XmlElement(name = "SD_ASSOCDOC_InsertResult")
    protected SdAssocDoc sdassocdocInsertResult;

    /**
     * Gets the value of the sdassocdocInsertResult property.
     * 
     * @return
     *     possible object is
     *     {@link SdAssocDoc }
     *     
     */
    public SdAssocDoc getSDASSOCDOCInsertResult() {
        return sdassocdocInsertResult;
    }

    /**
     * Sets the value of the sdassocdocInsertResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link SdAssocDoc }
     *     
     */
    public void setSDASSOCDOCInsertResult(SdAssocDoc value) {
        this.sdassocdocInsertResult = value;
    }

}
