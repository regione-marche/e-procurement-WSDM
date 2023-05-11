
package it.sispi.protocollo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for infoTipoTrasmissione complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="infoTipoTrasmissione">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="richInfoTipoTrasmissione" type="{http://protocollo.sispi.it}WsProtRichInfoTipoTrasmissione" minOccurs="0"/>
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
@XmlType(name = "infoTipoTrasmissione", propOrder = {
    "richInfoTipoTrasmissione",
    "client"
})
public class InfoTipoTrasmissione {

    protected WsProtRichInfoTipoTrasmissione richInfoTipoTrasmissione;
    protected WsProtClient client;

    /**
     * Gets the value of the richInfoTipoTrasmissione property.
     * 
     * @return
     *     possible object is
     *     {@link WsProtRichInfoTipoTrasmissione }
     *     
     */
    public WsProtRichInfoTipoTrasmissione getRichInfoTipoTrasmissione() {
        return richInfoTipoTrasmissione;
    }

    /**
     * Sets the value of the richInfoTipoTrasmissione property.
     * 
     * @param value
     *     allowed object is
     *     {@link WsProtRichInfoTipoTrasmissione }
     *     
     */
    public void setRichInfoTipoTrasmissione(WsProtRichInfoTipoTrasmissione value) {
        this.richInfoTipoTrasmissione = value;
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
