
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
 *         &lt;element name="AggiornaDocumentoResult" type="{http://tempuri.org/}InserimentoRet" minOccurs="0"/>
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
    "aggiornaDocumentoResult"
})
@XmlRootElement(name = "AggiornaDocumentoResponse")
public class AggiornaDocumentoResponse {

    @XmlElement(name = "AggiornaDocumentoResult")
    protected InserimentoRet aggiornaDocumentoResult;

    /**
     * Gets the value of the aggiornaDocumentoResult property.
     * 
     * @return
     *     possible object is
     *     {@link InserimentoRet }
     *     
     */
    public InserimentoRet getAggiornaDocumentoResult() {
        return aggiornaDocumentoResult;
    }

    /**
     * Sets the value of the aggiornaDocumentoResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link InserimentoRet }
     *     
     */
    public void setAggiornaDocumentoResult(InserimentoRet value) {
        this.aggiornaDocumentoResult = value;
    }

}
