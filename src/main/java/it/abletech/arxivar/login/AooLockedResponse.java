
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
 *         &lt;element name="AooLockedResult" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
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
    "aooLockedResult"
})
@XmlRootElement(name = "AooLockedResponse")
public class AooLockedResponse {

    @XmlElement(name = "AooLockedResult")
    protected boolean aooLockedResult;

    /**
     * Gets the value of the aooLockedResult property.
     * 
     */
    public boolean isAooLockedResult() {
        return aooLockedResult;
    }

    /**
     * Sets the value of the aooLockedResult property.
     * 
     */
    public void setAooLockedResult(boolean value) {
        this.aooLockedResult = value;
    }

}
