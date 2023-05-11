
package it.sispi.protocollo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for regProtMappata complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="regProtMappata">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="richRegProtMappata" type="{http://protocollo.sispi.it}WsProtRichMappata" minOccurs="0"/>
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
@XmlType(name = "regProtMappata", propOrder = {
    "richRegProtMappata",
    "client"
})
public class RegProtMappata {

    protected WsProtRichMappata richRegProtMappata;
    protected WsProtClient client;

    /**
     * Gets the value of the richRegProtMappata property.
     * 
     * @return
     *     possible object is
     *     {@link WsProtRichMappata }
     *     
     */
    public WsProtRichMappata getRichRegProtMappata() {
        return richRegProtMappata;
    }

    /**
     * Sets the value of the richRegProtMappata property.
     * 
     * @param value
     *     allowed object is
     *     {@link WsProtRichMappata }
     *     
     */
    public void setRichRegProtMappata(WsProtRichMappata value) {
        this.richRegProtMappata = value;
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
