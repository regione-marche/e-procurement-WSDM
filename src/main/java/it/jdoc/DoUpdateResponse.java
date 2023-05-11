
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
 *         &lt;element name="DoUpdateResult" type="{http://schemas.datacontract.org/2004/07/WS_Operazioni}ArchiveResult" minOccurs="0"/>
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
    "doUpdateResult"
})
@XmlRootElement(name = "DoUpdateResponse")
public class DoUpdateResponse {

    @XmlElement(name = "DoUpdateResult", nillable = true)
    protected ArchiveResult doUpdateResult;

    /**
     * Gets the value of the doUpdateResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArchiveResult }
     *     
     */
    public ArchiveResult getDoUpdateResult() {
        return doUpdateResult;
    }

    /**
     * Sets the value of the doUpdateResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArchiveResult }
     *     
     */
    public void setDoUpdateResult(ArchiveResult value) {
        this.doUpdateResult = value;
    }

}
