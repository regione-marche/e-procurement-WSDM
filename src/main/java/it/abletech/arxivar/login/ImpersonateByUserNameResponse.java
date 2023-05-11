
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
 *         &lt;element name="Impersonate_By_UserNameResult" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
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
    "impersonateByUserNameResult"
})
@XmlRootElement(name = "Impersonate_By_UserNameResponse")
public class ImpersonateByUserNameResponse {

    @XmlElement(name = "Impersonate_By_UserNameResult")
    protected boolean impersonateByUserNameResult;

    /**
     * Gets the value of the impersonateByUserNameResult property.
     * 
     */
    public boolean isImpersonateByUserNameResult() {
        return impersonateByUserNameResult;
    }

    /**
     * Sets the value of the impersonateByUserNameResult property.
     * 
     */
    public void setImpersonateByUserNameResult(boolean value) {
        this.impersonateByUserNameResult = value;
    }

}
