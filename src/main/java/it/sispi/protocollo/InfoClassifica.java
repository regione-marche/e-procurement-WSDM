
package it.sispi.protocollo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for infoClassifica complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="infoClassifica">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="richInfoClassifica" type="{http://protocollo.sispi.it}WsProtRichInfoClassifica" minOccurs="0"/>
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
@XmlType(name = "infoClassifica", propOrder = {
    "richInfoClassifica",
    "client"
})
public class InfoClassifica {

    protected WsProtRichInfoClassifica richInfoClassifica;
    protected WsProtClient client;

    /**
     * Gets the value of the richInfoClassifica property.
     * 
     * @return
     *     possible object is
     *     {@link WsProtRichInfoClassifica }
     *     
     */
    public WsProtRichInfoClassifica getRichInfoClassifica() {
        return richInfoClassifica;
    }

    /**
     * Sets the value of the richInfoClassifica property.
     * 
     * @param value
     *     allowed object is
     *     {@link WsProtRichInfoClassifica }
     *     
     */
    public void setRichInfoClassifica(WsProtRichInfoClassifica value) {
        this.richInfoClassifica = value;
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
