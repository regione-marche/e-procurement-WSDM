
package it.sispi.protocollo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for infoTipoDocumento complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="infoTipoDocumento">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="richInfoTipoDocumento" type="{http://protocollo.sispi.it}WsProtRichInfoTipoDocumento" minOccurs="0"/>
 *         &lt;element name="client" type="{http://protocollo.sispi.it}WsProtClient" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "infoTipoDocumento", propOrder = {
    "richInfoTipoDocumento",
    "client"
})
public class InfoTipoDocumento {

    protected WsProtRichInfoTipoDocumento richInfoTipoDocumento;
    protected WsProtClient client;

    /**
     * Gets the value of the richInfoTipoDocumento property.
     * 
     * @return
     *     possible object is
     *     {@link WsProtRichInfoTipoDocumento }
     *     
     */
    public WsProtRichInfoTipoDocumento getRichInfoTipoDocumento() {
        return richInfoTipoDocumento;
    }

    /**
     * Sets the value of the richInfoTipoDocumento property.
     * 
     * @param value
     *     allowed object is
     *     {@link WsProtRichInfoTipoDocumento }
     *     
     */
    public void setRichInfoTipoDocumento(WsProtRichInfoTipoDocumento value) {
        this.richInfoTipoDocumento = value;
    }

    /**
     * Gets the value of the client property.
     * 
     * @return
     *     possible object is
     *     {@link WsProtClient }
     *     
     */
    public WsProtClient getClient() {
        return client;
    }

    /**
     * Sets the value of the client property.
     * 
     * @param value
     *     allowed object is
     *     {@link WsProtClient }
     *     
     */
    public void setClient(WsProtClient value) {
        this.client = value;
    }

}
