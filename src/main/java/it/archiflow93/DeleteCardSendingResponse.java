
package it.archiflow93;

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
 *         &lt;element name="DeleteCardSendingResult" type="{http://schemas.datacontract.org/2004/07/SIAV.Common.BaseClass.Types}ResultInfo" minOccurs="0"/>
 *         &lt;element name="numDeleted" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
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
    "deleteCardSendingResult",
    "numDeleted"
})
@XmlRootElement(name = "DeleteCardSendingResponse")
public class DeleteCardSendingResponse {

    @XmlElement(name = "DeleteCardSendingResult")
    protected ResultInfo deleteCardSendingResult;
    protected Integer numDeleted;

    /**
     * Gets the value of the deleteCardSendingResult property.
     * 
     * @return
     *     possible object is
     *     {@link ResultInfo }
     *     
     */
    public ResultInfo getDeleteCardSendingResult() {
        return deleteCardSendingResult;
    }

    /**
     * Sets the value of the deleteCardSendingResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResultInfo }
     *     
     */
    public void setDeleteCardSendingResult(ResultInfo value) {
        this.deleteCardSendingResult = value;
    }

    /**
     * Gets the value of the numDeleted property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNumDeleted() {
        return numDeleted;
    }

    /**
     * Sets the value of the numDeleted property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNumDeleted(Integer value) {
        this.numDeleted = value;
    }

}
