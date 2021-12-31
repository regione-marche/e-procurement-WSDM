
package it.sispi.protocollo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for infoAOO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="infoAOO">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="richInfoAOO" type="{http://protocollo.sispi.it}WsProtRichInfoAOO" minOccurs="0"/>
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
@XmlType(name = "infoAOO", propOrder = {
    "richInfoAOO",
    "client"
})
public class InfoAOO {

    protected WsProtRichInfoAOO richInfoAOO;
    protected WsProtClient client;

    /**
     * Gets the value of the richInfoAOO property.
     * 
     * @return
     *     possible object is
     *     {@link WsProtRichInfoAOO }
     *     
     */
    public WsProtRichInfoAOO getRichInfoAOO() {
        return richInfoAOO;
    }

    /**
     * Sets the value of the richInfoAOO property.
     * 
     * @param value
     *     allowed object is
     *     {@link WsProtRichInfoAOO }
     *     
     */
    public void setRichInfoAOO(WsProtRichInfoAOO value) {
        this.richInfoAOO = value;
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
