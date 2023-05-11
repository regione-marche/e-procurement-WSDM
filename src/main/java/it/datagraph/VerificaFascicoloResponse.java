
package it.datagraph;

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
 *         &lt;element name="VerificaFascicoloResult" type="{http://tempuri.org/}InserimentoRet" minOccurs="0"/>
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
    "verificaFascicoloResult"
})
@XmlRootElement(name = "VerificaFascicoloResponse")
public class VerificaFascicoloResponse {

    @XmlElement(name = "VerificaFascicoloResult")
    protected InserimentoRet verificaFascicoloResult;

    /**
     * Gets the value of the verificaFascicoloResult property.
     * 
     * @return
     *     possible object is
     *     {@link InserimentoRet }
     *     
     */
    public InserimentoRet getVerificaFascicoloResult() {
        return verificaFascicoloResult;
    }

    /**
     * Sets the value of the verificaFascicoloResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link InserimentoRet }
     *     
     */
    public void setVerificaFascicoloResult(InserimentoRet value) {
        this.verificaFascicoloResult = value;
    }

}
