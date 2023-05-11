
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
 *         &lt;element name="AggiungiDocumento2Result" type="{http://tempuri.org/}InserimentoRet" minOccurs="0"/>
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
    "aggiungiDocumento2Result"
})
@XmlRootElement(name = "AggiungiDocumento2Response")
public class AggiungiDocumento2Response {

    @XmlElement(name = "AggiungiDocumento2Result")
    protected InserimentoRet aggiungiDocumento2Result;

    /**
     * Gets the value of the aggiungiDocumento2Result property.
     * 
     * @return
     *     possible object is
     *     {@link InserimentoRet }
     *     
     */
    public InserimentoRet getAggiungiDocumento2Result() {
        return aggiungiDocumento2Result;
    }

    /**
     * Sets the value of the aggiungiDocumento2Result property.
     * 
     * @param value
     *     allowed object is
     *     {@link InserimentoRet }
     *     
     */
    public void setAggiungiDocumento2Result(InserimentoRet value) {
        this.aggiungiDocumento2Result = value;
    }

}
