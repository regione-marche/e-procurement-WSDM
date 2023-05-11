
package it.sispi.protocollo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for infoRegistroAnnoCorrente complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="infoRegistroAnnoCorrente">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="richInfoRegistroAnnoCorrente" type="{http://protocollo.sispi.it}WsProtRichInfoRegistroAnnoCorrente" minOccurs="0"/>
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
@XmlType(name = "infoRegistroAnnoCorrente", propOrder = {
    "richInfoRegistroAnnoCorrente",
    "client"
})
public class InfoRegistroAnnoCorrente {

    protected WsProtRichInfoRegistroAnnoCorrente richInfoRegistroAnnoCorrente;
    protected WsProtClient client;

    /**
     * Gets the value of the richInfoRegistroAnnoCorrente property.
     * 
     * @return
     *     possible object is
     *     {@link WsProtRichInfoRegistroAnnoCorrente }
     *     
     */
    public WsProtRichInfoRegistroAnnoCorrente getRichInfoRegistroAnnoCorrente() {
        return richInfoRegistroAnnoCorrente;
    }

    /**
     * Sets the value of the richInfoRegistroAnnoCorrente property.
     * 
     * @param value
     *     allowed object is
     *     {@link WsProtRichInfoRegistroAnnoCorrente }
     *     
     */
    public void setRichInfoRegistroAnnoCorrente(WsProtRichInfoRegistroAnnoCorrente value) {
        this.richInfoRegistroAnnoCorrente = value;
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
