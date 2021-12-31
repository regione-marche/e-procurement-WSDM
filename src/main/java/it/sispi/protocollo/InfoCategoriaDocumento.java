
package it.sispi.protocollo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for infoCategoriaDocumento complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="infoCategoriaDocumento">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="richInfoCategoriaDocumento" type="{http://protocollo.sispi.it}WsProtRichInfoCategoriaDocumento" minOccurs="0"/>
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
@XmlType(name = "infoCategoriaDocumento", propOrder = {
    "richInfoCategoriaDocumento",
    "client"
})
public class InfoCategoriaDocumento {

    protected WsProtRichInfoCategoriaDocumento richInfoCategoriaDocumento;
    protected WsProtClient client;

    /**
     * Gets the value of the richInfoCategoriaDocumento property.
     * 
     * @return
     *     possible object is
     *     {@link WsProtRichInfoCategoriaDocumento }
     *     
     */
    public WsProtRichInfoCategoriaDocumento getRichInfoCategoriaDocumento() {
        return richInfoCategoriaDocumento;
    }

    /**
     * Sets the value of the richInfoCategoriaDocumento property.
     * 
     * @param value
     *     allowed object is
     *     {@link WsProtRichInfoCategoriaDocumento }
     *     
     */
    public void setRichInfoCategoriaDocumento(WsProtRichInfoCategoriaDocumento value) {
        this.richInfoCategoriaDocumento = value;
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
