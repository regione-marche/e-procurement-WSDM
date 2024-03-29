
package it.marche.regione.paleowssec;

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
 *         &lt;element name="AddAllegatiDocumentoProtocolloResult" type="{http://paleo.regione.marche.it/services/}respAddAllegati" minOccurs="0"/>
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
    "addAllegatiDocumentoProtocolloResult"
})
@XmlRootElement(name = "AddAllegatiDocumentoProtocolloResponse")
public class AddAllegatiDocumentoProtocolloResponse {

    @XmlElement(name = "AddAllegatiDocumentoProtocolloResult", nillable = true)
    protected RespAddAllegati addAllegatiDocumentoProtocolloResult;

    /**
     * Gets the value of the addAllegatiDocumentoProtocolloResult property.
     * 
     * @return
     *     possible object is
     *     {@link RespAddAllegati }
     *     
     */
    public RespAddAllegati getAddAllegatiDocumentoProtocolloResult() {
        return addAllegatiDocumentoProtocolloResult;
    }

    /**
     * Sets the value of the addAllegatiDocumentoProtocolloResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link RespAddAllegati }
     *     
     */
    public void setAddAllegatiDocumentoProtocolloResult(RespAddAllegati value) {
        this.addAllegatiDocumentoProtocolloResult = value;
    }

}
