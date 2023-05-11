
package it.sispi.protocollo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for regProtMassiva complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="regProtMassiva">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="richRegProtMassiva" type="{http://protocollo.sispi.it}WsProtRichRichiestaMassiva" minOccurs="0"/>
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
@XmlType(name = "regProtMassiva", propOrder = {
    "richRegProtMassiva",
    "client"
})
public class RegProtMassiva {

    protected WsProtRichRichiestaMassiva richRegProtMassiva;
    protected WsProtClient client;

    /**
     * Gets the value of the richRegProtMassiva property.
     * 
     * @return
     *     possible object is
     *     {@link WsProtRichRichiestaMassiva }
     *     
     */
    public WsProtRichRichiestaMassiva getRichRegProtMassiva() {
        return richRegProtMassiva;
    }

    /**
     * Sets the value of the richRegProtMassiva property.
     * 
     * @param value
     *     allowed object is
     *     {@link WsProtRichRichiestaMassiva }
     *     
     */
    public void setRichRegProtMassiva(WsProtRichRichiestaMassiva value) {
        this.richRegProtMassiva = value;
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
