
package it.jiride.docwsfascicolisoap;

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
 *         &lt;element name="CreaSottoFascicoloStringResult" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
    "creaSottoFascicoloStringResult"
})
@XmlRootElement(name = "CreaSottoFascicoloStringResponse")
public class CreaSottoFascicoloStringResponse {

    @XmlElement(name = "CreaSottoFascicoloStringResult", required = true)
    protected String creaSottoFascicoloStringResult;

    /**
     * Gets the value of the creaSottoFascicoloStringResult property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreaSottoFascicoloStringResult() {
        return creaSottoFascicoloStringResult;
    }

    /**
     * Sets the value of the creaSottoFascicoloStringResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreaSottoFascicoloStringResult(String value) {
        this.creaSottoFascicoloStringResult = value;
    }

}