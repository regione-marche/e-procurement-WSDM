
package it.sispi.protocollo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for allegaDocumentiResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="allegaDocumentiResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="rispAllegaDocumenti" type="{http://protocollo.sispi.it}WsProtRispostaAllegaDocumenti" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "allegaDocumentiResponse", propOrder = {
    "rispAllegaDocumenti"
})
public class AllegaDocumentiResponse {

    protected WsProtRispostaAllegaDocumenti rispAllegaDocumenti;

    /**
     * Gets the value of the rispAllegaDocumenti property.
     * 
     * @return
     *     possible object is
     *     {@link WsProtRispostaAllegaDocumenti }
     *     
     */
    public WsProtRispostaAllegaDocumenti getRispAllegaDocumenti() {
        return rispAllegaDocumenti;
    }

    /**
     * Sets the value of the rispAllegaDocumenti property.
     * 
     * @param value
     *     allowed object is
     *     {@link WsProtRispostaAllegaDocumenti }
     *     
     */
    public void setRispAllegaDocumenti(WsProtRispostaAllegaDocumenti value) {
        this.rispAllegaDocumenti = value;
    }

}
