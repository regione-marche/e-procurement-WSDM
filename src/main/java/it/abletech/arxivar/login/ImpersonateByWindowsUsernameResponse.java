
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
 *         &lt;element name="Impersonate_By_WindowsUsernameResult" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
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
    "impersonateByWindowsUsernameResult"
})
@XmlRootElement(name = "Impersonate_By_WindowsUsernameResponse")
public class ImpersonateByWindowsUsernameResponse {

    @XmlElement(name = "Impersonate_By_WindowsUsernameResult")
    protected boolean impersonateByWindowsUsernameResult;

    /**
     * Gets the value of the impersonateByWindowsUsernameResult property.
     * 
     */
    public boolean isImpersonateByWindowsUsernameResult() {
        return impersonateByWindowsUsernameResult;
    }

    /**
     * Sets the value of the impersonateByWindowsUsernameResult property.
     * 
     */
    public void setImpersonateByWindowsUsernameResult(boolean value) {
        this.impersonateByWindowsUsernameResult = value;
    }

}
