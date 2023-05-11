
package it.sispi.protocollo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for infoTipoAllegato complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="infoTipoAllegato">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="richInfoTipoAllegato" type="{http://protocollo.sispi.it}WsProtRichInfoTipoAllegato" minOccurs="0"/>
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
@XmlType(name = "infoTipoAllegato", propOrder = {
    "richInfoTipoAllegato",
    "client"
})
public class InfoTipoAllegato {

    protected WsProtRichInfoTipoAllegato richInfoTipoAllegato;
    protected WsProtClient client;

    /**
     * Gets the value of the richInfoTipoAllegato property.
     * 
     * @return
     *     possible object is
     *     {@link WsProtRichInfoTipoAllegato }
     *     
     */
    public WsProtRichInfoTipoAllegato getRichInfoTipoAllegato() {
        return richInfoTipoAllegato;
    }

    /**
     * Sets the value of the richInfoTipoAllegato property.
     * 
     * @param value
     *     allowed object is
     *     {@link WsProtRichInfoTipoAllegato }
     *     
     */
    public void setRichInfoTipoAllegato(WsProtRichInfoTipoAllegato value) {
        this.richInfoTipoAllegato = value;
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
