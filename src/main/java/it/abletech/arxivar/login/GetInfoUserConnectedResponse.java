
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
 *         &lt;element name="GetInfoUserConnectedResult" type="{http://www.Abletech.it/Arxivar}Dm_Utenti" minOccurs="0"/>
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
    "getInfoUserConnectedResult"
})
@XmlRootElement(name = "GetInfoUserConnectedResponse")
public class GetInfoUserConnectedResponse {

    @XmlElement(name = "GetInfoUserConnectedResult")
    protected DmUtenti getInfoUserConnectedResult;

    /**
     * Gets the value of the getInfoUserConnectedResult property.
     * 
     * @return
     *     possible object is
     *     {@link DmUtenti }
     *     
     */
    public DmUtenti getGetInfoUserConnectedResult() {
        return getInfoUserConnectedResult;
    }

    /**
     * Sets the value of the getInfoUserConnectedResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link DmUtenti }
     *     
     */
    public void setGetInfoUserConnectedResult(DmUtenti value) {
        this.getInfoUserConnectedResult = value;
    }

}
