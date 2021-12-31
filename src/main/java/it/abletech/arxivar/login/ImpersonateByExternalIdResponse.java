
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
 *         &lt;element name="Impersonate_By_ExternalIdResult" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
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
    "impersonateByExternalIdResult"
})
@XmlRootElement(name = "Impersonate_By_ExternalIdResponse")
public class ImpersonateByExternalIdResponse {

    @XmlElement(name = "Impersonate_By_ExternalIdResult")
    protected boolean impersonateByExternalIdResult;

    /**
     * Gets the value of the impersonateByExternalIdResult property.
     * 
     */
    public boolean isImpersonateByExternalIdResult() {
        return impersonateByExternalIdResult;
    }

    /**
     * Sets the value of the impersonateByExternalIdResult property.
     * 
     */
    public void setImpersonateByExternalIdResult(boolean value) {
        this.impersonateByExternalIdResult = value;
    }

}
