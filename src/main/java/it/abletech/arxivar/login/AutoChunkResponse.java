
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
 *         &lt;element name="AutoChunkResult" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
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
    "autoChunkResult"
})
@XmlRootElement(name = "AutoChunkResponse")
public class AutoChunkResponse {

    @XmlElement(name = "AutoChunkResult")
    protected boolean autoChunkResult;

    /**
     * Gets the value of the autoChunkResult property.
     * 
     */
    public boolean isAutoChunkResult() {
        return autoChunkResult;
    }

    /**
     * Sets the value of the autoChunkResult property.
     * 
     */
    public void setAutoChunkResult(boolean value) {
        this.autoChunkResult = value;
    }

}
