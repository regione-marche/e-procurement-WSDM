
package it.abletech.arxivar.login;

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
 *         &lt;element name="GetInfoUserImpersonatedResult" type="{http://www.Abletech.it/Arxivar}Dm_UtentiBase" minOccurs="0"/>
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
    "getInfoUserImpersonatedResult"
})
@XmlRootElement(name = "GetInfoUserImpersonatedResponse")
public class GetInfoUserImpersonatedResponse {

    @XmlElement(name = "GetInfoUserImpersonatedResult")
    protected DmUtentiBase getInfoUserImpersonatedResult;

    /**
     * Gets the value of the getInfoUserImpersonatedResult property.
     * 
     * @return
     *     possible object is
     *     {@link DmUtentiBase }
     *     
     */
    public DmUtentiBase getGetInfoUserImpersonatedResult() {
        return getInfoUserImpersonatedResult;
    }

    /**
     * Sets the value of the getInfoUserImpersonatedResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link DmUtentiBase }
     *     
     */
    public void setGetInfoUserImpersonatedResult(DmUtentiBase value) {
        this.getInfoUserImpersonatedResult = value;
    }

}
