
package it.sispi.protocollo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for infoProt complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="infoProt">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="richInfoProt" type="{http://protocollo.sispi.it}WsProtRichInfoProt" minOccurs="0"/>
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
@XmlType(name = "infoProt", propOrder = {
    "richInfoProt",
    "client"
})
public class InfoProt {

    protected WsProtRichInfoProt richInfoProt;
    protected WsProtClient client;

    /**
     * Gets the value of the richInfoProt property.
     * 
     * @return
     *     possible object is
     *     {@link WsProtRichInfoProt }
     *     
     */
    public WsProtRichInfoProt getRichInfoProt() {
        return richInfoProt;
    }

    /**
     * Sets the value of the richInfoProt property.
     * 
     * @param value
     *     allowed object is
     *     {@link WsProtRichInfoProt }
     *     
     */
    public void setRichInfoProt(WsProtRichInfoProt value) {
        this.richInfoProt = value;
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
