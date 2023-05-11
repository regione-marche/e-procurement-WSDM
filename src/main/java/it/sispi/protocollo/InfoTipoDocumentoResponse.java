
package it.sispi.protocollo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for infoTipoDocumentoResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="infoTipoDocumentoResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="rispInfoTipoDocumento" type="{http://protocollo.sispi.it}WsProtRispostaInfoTipoDocumento" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "infoTipoDocumentoResponse", propOrder = {
    "rispInfoTipoDocumento"
})
public class InfoTipoDocumentoResponse {

    protected WsProtRispostaInfoTipoDocumento rispInfoTipoDocumento;

    /**
     * Gets the value of the rispInfoTipoDocumento property.
     * 
     * @return
     *     possible object is
     *     {@link WsProtRispostaInfoTipoDocumento }
     *     
     */
    public WsProtRispostaInfoTipoDocumento getRispInfoTipoDocumento() {
        return rispInfoTipoDocumento;
    }

    /**
     * Sets the value of the rispInfoTipoDocumento property.
     * 
     * @param value
     *     allowed object is
     *     {@link WsProtRispostaInfoTipoDocumento }
     *     
     */
    public void setRispInfoTipoDocumento(WsProtRispostaInfoTipoDocumento value) {
        this.rispInfoTipoDocumento = value;
    }

}
