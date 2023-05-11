
package it.datagraph;

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
 *         &lt;element name="GetVociTitolarioResult" type="{http://tempuri.org/}VociTitolarioRet" minOccurs="0"/>
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
    "getVociTitolarioResult"
})
@XmlRootElement(name = "GetVociTitolarioResponse")
public class GetVociTitolarioResponse {

    @XmlElement(name = "GetVociTitolarioResult")
    protected VociTitolarioRet getVociTitolarioResult;

    /**
     * Gets the value of the getVociTitolarioResult property.
     * 
     * @return
     *     possible object is
     *     {@link VociTitolarioRet }
     *     
     */
    public VociTitolarioRet getGetVociTitolarioResult() {
        return getVociTitolarioResult;
    }

    /**
     * Sets the value of the getVociTitolarioResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link VociTitolarioRet }
     *     
     */
    public void setGetVociTitolarioResult(VociTitolarioRet value) {
        this.getVociTitolarioResult = value;
    }

}
