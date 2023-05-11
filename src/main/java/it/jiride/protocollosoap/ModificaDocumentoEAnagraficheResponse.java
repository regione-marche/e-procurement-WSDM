
package it.jiride.protocollosoap;

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
 *         &lt;element name="ModificaDocumentoEAnagraficheResult" type="{http://tempuri.org/}ModificaProtocolloOut"/>
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
    "modificaDocumentoEAnagraficheResult"
})
@XmlRootElement(name = "ModificaDocumentoEAnagraficheResponse")
public class ModificaDocumentoEAnagraficheResponse {

    @XmlElement(name = "ModificaDocumentoEAnagraficheResult", required = true)
    protected ModificaProtocolloOut modificaDocumentoEAnagraficheResult;

    /**
     * Gets the value of the modificaDocumentoEAnagraficheResult property.
     * 
     * @return
     *     possible object is
     *     {@link ModificaProtocolloOut }
     *     
     */
    public ModificaProtocolloOut getModificaDocumentoEAnagraficheResult() {
        return modificaDocumentoEAnagraficheResult;
    }

    /**
     * Sets the value of the modificaDocumentoEAnagraficheResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ModificaProtocolloOut }
     *     
     */
    public void setModificaDocumentoEAnagraficheResult(ModificaProtocolloOut value) {
        this.modificaDocumentoEAnagraficheResult = value;
    }

}
