
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
 *         &lt;element name="DeImpersonateResult" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
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
    "deImpersonateResult"
})
@XmlRootElement(name = "DeImpersonateResponse")
public class DeImpersonateResponse {

    @XmlElement(name = "DeImpersonateResult")
    protected boolean deImpersonateResult;

    /**
     * Gets the value of the deImpersonateResult property.
     * 
     */
    public boolean isDeImpersonateResult() {
        return deImpersonateResult;
    }

    /**
     * Sets the value of the deImpersonateResult property.
     * 
     */
    public void setDeImpersonateResult(boolean value) {
        this.deImpersonateResult = value;
    }

}
