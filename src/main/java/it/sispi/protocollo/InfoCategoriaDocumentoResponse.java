
package it.sispi.protocollo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for infoCategoriaDocumentoResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="infoCategoriaDocumentoResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="rispInfoCategoriaDocumento" type="{http://protocollo.sispi.it}WsProtRispostaInfoCategoriaDocumento" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "infoCategoriaDocumentoResponse", propOrder = {
    "rispInfoCategoriaDocumento"
})
public class InfoCategoriaDocumentoResponse {

    protected WsProtRispostaInfoCategoriaDocumento rispInfoCategoriaDocumento;

    /**
     * Gets the value of the rispInfoCategoriaDocumento property.
     * 
     * @return
     *     possible object is
     *     {@link WsProtRispostaInfoCategoriaDocumento }
     *     
     */
    public WsProtRispostaInfoCategoriaDocumento getRispInfoCategoriaDocumento() {
        return rispInfoCategoriaDocumento;
    }

    /**
     * Sets the value of the rispInfoCategoriaDocumento property.
     * 
     * @param value
     *     allowed object is
     *     {@link WsProtRispostaInfoCategoriaDocumento }
     *     
     */
    public void setRispInfoCategoriaDocumento(WsProtRispostaInfoCategoriaDocumento value) {
        this.rispInfoCategoriaDocumento = value;
    }

}
