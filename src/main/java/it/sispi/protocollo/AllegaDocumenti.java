
package it.sispi.protocollo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for allegaDocumenti complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="allegaDocumenti">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="richAllegaDocumenti" type="{http://protocollo.sispi.it}WsProtRichAllegaDocumenti" minOccurs="0"/>
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
@XmlType(name = "allegaDocumenti", propOrder = {
    "richAllegaDocumenti",
    "client"
})
public class AllegaDocumenti {

    protected WsProtRichAllegaDocumenti richAllegaDocumenti;
    protected WsProtClient client;

    /**
     * Gets the value of the richAllegaDocumenti property.
     * 
     * @return
     *     possible object is
     *     {@link WsProtRichAllegaDocumenti }
     *     
     */
    public WsProtRichAllegaDocumenti getRichAllegaDocumenti() {
        return richAllegaDocumenti;
    }

    /**
     * Sets the value of the richAllegaDocumenti property.
     * 
     * @param value
     *     allowed object is
     *     {@link WsProtRichAllegaDocumenti }
     *     
     */
    public void setRichAllegaDocumenti(WsProtRichAllegaDocumenti value) {
        this.richAllegaDocumenti = value;
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
