
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
 *         &lt;element name="AggiungiDocumentoBase64Result" type="{http://tempuri.org/}InserimentoRet" minOccurs="0"/>
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
    "aggiungiDocumentoBase64Result"
})
@XmlRootElement(name = "AggiungiDocumentoBase64Response")
public class AggiungiDocumentoBase64Response {

    @XmlElement(name = "AggiungiDocumentoBase64Result")
    protected InserimentoRet aggiungiDocumentoBase64Result;

    /**
     * Gets the value of the aggiungiDocumentoBase64Result property.
     * 
     * @return
     *     possible object is
     *     {@link InserimentoRet }
     *     
     */
    public InserimentoRet getAggiungiDocumentoBase64Result() {
        return aggiungiDocumentoBase64Result;
    }

    /**
     * Sets the value of the aggiungiDocumentoBase64Result property.
     * 
     * @param value
     *     allowed object is
     *     {@link InserimentoRet }
     *     
     */
    public void setAggiungiDocumentoBase64Result(InserimentoRet value) {
        this.aggiungiDocumentoBase64Result = value;
    }

}
