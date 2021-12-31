
package it.archiflow96;

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
 *         &lt;element name="SendFatturaPAArrayResult" type="{http://schemas.datacontract.org/2004/07/SIAV.Common.BaseClass.Types}ResultInfo" minOccurs="0"/>
 *         &lt;element name="checkInfo" type="{http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Posting.ValueObject}ArrayOfCheckInfoFatturaPA" minOccurs="0"/>
 *         &lt;element name="numSent" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
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
    "sendFatturaPAArrayResult",
    "checkInfo",
    "numSent"
})
@XmlRootElement(name = "SendFatturaPAArrayResponse")
public class SendFatturaPAArrayResponse {

    @XmlElement(name = "SendFatturaPAArrayResult")
    protected ResultInfo sendFatturaPAArrayResult;
    @XmlElement(nillable = true)
    protected ArrayOfCheckInfoFatturaPA checkInfo;
    protected Integer numSent;

    /**
     * Gets the value of the sendFatturaPAArrayResult property.
     * 
     * @return
     *     possible object is
     *     {@link ResultInfo }
     *     
     */
    public ResultInfo getSendFatturaPAArrayResult() {
        return sendFatturaPAArrayResult;
    }

    /**
     * Sets the value of the sendFatturaPAArrayResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResultInfo }
     *     
     */
    public void setSendFatturaPAArrayResult(ResultInfo value) {
        this.sendFatturaPAArrayResult = value;
    }

    /**
     * Gets the value of the checkInfo property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfCheckInfoFatturaPA }
     *     
     */
    public ArrayOfCheckInfoFatturaPA getCheckInfo() {
        return checkInfo;
    }

    /**
     * Sets the value of the checkInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfCheckInfoFatturaPA }
     *     
     */
    public void setCheckInfo(ArrayOfCheckInfoFatturaPA value) {
        this.checkInfo = value;
    }

    /**
     * Gets the value of the numSent property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNumSent() {
        return numSent;
    }

    /**
     * Sets the value of the numSent property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNumSent(Integer value) {
        this.numSent = value;
    }

}
