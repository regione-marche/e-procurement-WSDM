
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
 *         &lt;element name="InserimentoBase64Result" type="{http://tempuri.org/}InserimentoRet" minOccurs="0"/>
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
    "inserimentoBase64Result"
})
@XmlRootElement(name = "InserimentoBase64Response")
public class InserimentoBase64Response {

    @XmlElement(name = "InserimentoBase64Result")
    protected InserimentoRet inserimentoBase64Result;

    /**
     * Gets the value of the inserimentoBase64Result property.
     * 
     * @return
     *     possible object is
     *     {@link InserimentoRet }
     *     
     */
    public InserimentoRet getInserimentoBase64Result() {
        return inserimentoBase64Result;
    }

    /**
     * Sets the value of the inserimentoBase64Result property.
     * 
     * @param value
     *     allowed object is
     *     {@link InserimentoRet }
     *     
     */
    public void setInserimentoBase64Result(InserimentoRet value) {
        this.inserimentoBase64Result = value;
    }

}
