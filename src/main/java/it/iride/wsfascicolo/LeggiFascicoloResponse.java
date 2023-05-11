
package it.iride.wsfascicolo;

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
 *         &lt;element name="FascicoloOut" type="{http://tempuri.org/}FascicoloOut"/>
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
    "fascicoloOut"
})
@XmlRootElement(name = "LeggiFascicoloResponse")
public class LeggiFascicoloResponse {

    @XmlElement(name = "FascicoloOut", required = true, nillable = true)
    protected FascicoloOut fascicoloOut;

    /**
     * Gets the value of the fascicoloOut property.
     * 
     * @return
     *     possible object is
     *     {@link FascicoloOut }
     *     
     */
    public FascicoloOut getFascicoloOut() {
        return fascicoloOut;
    }

    /**
     * Sets the value of the fascicoloOut property.
     * 
     * @param value
     *     allowed object is
     *     {@link FascicoloOut }
     *     
     */
    public void setFascicoloOut(FascicoloOut value) {
        this.fascicoloOut = value;
    }

}
