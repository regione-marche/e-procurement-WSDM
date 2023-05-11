
package it.sispi.protocollo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for infoTitolario complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="infoTitolario">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="richInfoTitolario" type="{http://protocollo.sispi.it}WsProtRichInfoTitolario" minOccurs="0"/>
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
@XmlType(name = "infoTitolario", propOrder = {
    "richInfoTitolario",
    "client"
})
public class InfoTitolario {

    protected WsProtRichInfoTitolario richInfoTitolario;
    protected WsProtClient client;

    /**
     * Gets the value of the richInfoTitolario property.
     * 
     * @return
     *     possible object is
     *     {@link WsProtRichInfoTitolario }
     *     
     */
    public WsProtRichInfoTitolario getRichInfoTitolario() {
        return richInfoTitolario;
    }

    /**
     * Sets the value of the richInfoTitolario property.
     * 
     * @param value
     *     allowed object is
     *     {@link WsProtRichInfoTitolario }
     *     
     */
    public void setRichInfoTitolario(WsProtRichInfoTitolario value) {
        this.richInfoTitolario = value;
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
