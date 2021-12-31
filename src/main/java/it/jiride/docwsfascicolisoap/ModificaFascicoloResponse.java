
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
 *         &lt;element name="ModificaFascicoloResult" type="{http://tempuri.org/}EsitoOperazione"/>
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
    "modificaFascicoloResult"
})
@XmlRootElement(name = "ModificaFascicoloResponse")
public class ModificaFascicoloResponse {

    @XmlElement(name = "ModificaFascicoloResult", required = true)
    protected EsitoOperazione modificaFascicoloResult;

    /**
     * Gets the value of the modificaFascicoloResult property.
     * 
     * @return
     *     possible object is
     *     {@link EsitoOperazione }
     *     
     */
    public EsitoOperazione getModificaFascicoloResult() {
        return modificaFascicoloResult;
    }

    /**
     * Sets the value of the modificaFascicoloResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link EsitoOperazione }
     *     
     */
    public void setModificaFascicoloResult(EsitoOperazione value) {
        this.modificaFascicoloResult = value;
    }

}
