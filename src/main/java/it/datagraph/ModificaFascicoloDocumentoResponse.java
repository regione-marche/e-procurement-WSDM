
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
 *         &lt;element name="ModificaFascicoloDocumentoResult" type="{http://tempuri.org/}InserimentoRet" minOccurs="0"/>
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
    "modificaFascicoloDocumentoResult"
})
@XmlRootElement(name = "ModificaFascicoloDocumentoResponse")
public class ModificaFascicoloDocumentoResponse {

    @XmlElement(name = "ModificaFascicoloDocumentoResult")
    protected InserimentoRet modificaFascicoloDocumentoResult;

    /**
     * Gets the value of the modificaFascicoloDocumentoResult property.
     * 
     * @return
     *     possible object is
     *     {@link InserimentoRet }
     *     
     */
    public InserimentoRet getModificaFascicoloDocumentoResult() {
        return modificaFascicoloDocumentoResult;
    }

    /**
     * Sets the value of the modificaFascicoloDocumentoResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link InserimentoRet }
     *     
     */
    public void setModificaFascicoloDocumentoResult(InserimentoRet value) {
        this.modificaFascicoloDocumentoResult = value;
    }

}
