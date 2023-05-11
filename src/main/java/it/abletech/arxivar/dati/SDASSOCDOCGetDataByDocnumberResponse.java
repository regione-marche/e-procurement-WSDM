
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
 *         &lt;element name="SD_ASSOCDOC_Get_Data_By_DocnumberResult" type="{http://www.Abletech.it/Arxivar}ArrayOfSd_AssocDoc" minOccurs="0"/>
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
    "sdassocdocGetDataByDocnumberResult"
})
@XmlRootElement(name = "SD_ASSOCDOC_Get_Data_By_DocnumberResponse")
public class SDASSOCDOCGetDataByDocnumberResponse {

    @XmlElement(name = "SD_ASSOCDOC_Get_Data_By_DocnumberResult")
    protected ArrayOfSdAssocDoc sdassocdocGetDataByDocnumberResult;

    /**
     * Gets the value of the sdassocdocGetDataByDocnumberResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfSdAssocDoc }
     *     
     */
    public ArrayOfSdAssocDoc getSDASSOCDOCGetDataByDocnumberResult() {
        return sdassocdocGetDataByDocnumberResult;
    }

    /**
     * Sets the value of the sdassocdocGetDataByDocnumberResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfSdAssocDoc }
     *     
     */
    public void setSDASSOCDOCGetDataByDocnumberResult(ArrayOfSdAssocDoc value) {
        this.sdassocdocGetDataByDocnumberResult = value;
    }

}
