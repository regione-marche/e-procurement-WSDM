
package it.sispi.protocollo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for WsProtRichInfoTipoTrasmissione complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="WsProtRichInfoTipoTrasmissione">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="userIdOperatore" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WsProtRichInfoTipoTrasmissione", propOrder = {
    "userIdOperatore"
})
public class WsProtRichInfoTipoTrasmissione {

    @XmlElement(required = true)
    protected String userIdOperatore;

    /**
     * Gets the value of the userIdOperatore property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserIdOperatore() {
        return userIdOperatore;
    }

    /**
     * Sets the value of the userIdOperatore property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserIdOperatore(String value) {
        this.userIdOperatore = value;
    }

}
