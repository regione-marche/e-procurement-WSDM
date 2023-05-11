
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
 *         &lt;element name="IsActiveResult" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
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
    "isActiveResult"
})
@XmlRootElement(name = "IsActiveResponse")
public class IsActiveResponse {

    @XmlElement(name = "IsActiveResult")
    protected boolean isActiveResult;

    /**
     * Gets the value of the isActiveResult property.
     * 
     */
    public boolean isIsActiveResult() {
        return isActiveResult;
    }

    /**
     * Sets the value of the isActiveResult property.
     * 
     */
    public void setIsActiveResult(boolean value) {
        this.isActiveResult = value;
    }

}
