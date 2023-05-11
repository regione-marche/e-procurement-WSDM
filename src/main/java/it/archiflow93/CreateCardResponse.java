
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
 *         &lt;element name="CreateCardResult" type="{http://schemas.datacontract.org/2004/07/SIAV.Common.BaseClass.Types}ResultInfo" minOccurs="0"/>
 *         &lt;element name="oCardRet" type="{http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Card.ValueObject}Card" minOccurs="0"/>
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
    "createCardResult",
    "oCardRet"
})
@XmlRootElement(name = "CreateCardResponse")
public class CreateCardResponse {

    @XmlElement(name = "CreateCardResult")
    protected ResultInfo createCardResult;
    @XmlElement(nillable = true)
    protected Card oCardRet;

    /**
     * Gets the value of the createCardResult property.
     * 
     * @return
     *     possible object is
     *     {@link ResultInfo }
     *     
     */
    public ResultInfo getCreateCardResult() {
        return createCardResult;
    }

    /**
     * Sets the value of the createCardResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResultInfo }
     *     
     */
    public void setCreateCardResult(ResultInfo value) {
        this.createCardResult = value;
    }

    /**
     * Gets the value of the oCardRet property.
     * 
     * @return
     *     possible object is
     *     {@link Card }
     *     
     */
    public Card getOCardRet() {
        return oCardRet;
    }

    /**
     * Sets the value of the oCardRet property.
     * 
     * @param value
     *     allowed object is
     *     {@link Card }
     *     
     */
    public void setOCardRet(Card value) {
        this.oCardRet = value;
    }

}
