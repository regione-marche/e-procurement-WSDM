
package it.jdoc;

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
 *         &lt;element name="DoScanResult" type="{http://schemas.datacontract.org/2004/07/WS_Operazioni}ScanResult" minOccurs="0"/>
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
    "doScanResult"
})
@XmlRootElement(name = "DoScanResponse")
public class DoScanResponse {

    @XmlElement(name = "DoScanResult", nillable = true)
    protected ScanResult doScanResult;

    /**
     * Gets the value of the doScanResult property.
     * 
     * @return
     *     possible object is
     *     {@link ScanResult }
     *     
     */
    public ScanResult getDoScanResult() {
        return doScanResult;
    }

    /**
     * Sets the value of the doScanResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ScanResult }
     *     
     */
    public void setDoScanResult(ScanResult value) {
        this.doScanResult = value;
    }

}
