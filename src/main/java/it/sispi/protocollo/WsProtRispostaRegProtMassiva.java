
package it.sispi.protocollo;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for wsProtRispostaRegProtMassiva complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="wsProtRispostaRegProtMassiva">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="pmsCod" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element ref="{http://protocollo.sispi.it}wsProtRisposta" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "wsProtRispostaRegProtMassiva", propOrder = {
    "pmsCod",
    "wsProtRisposta"
})
public class WsProtRispostaRegProtMassiva {

    protected long pmsCod;
    @XmlElement(namespace = "http://protocollo.sispi.it", required = true)
    protected List<WsProtRisposta> wsProtRisposta;

    /**
     * Gets the value of the pmsCod property.
     * 
     */
    public long getPmsCod() {
        return pmsCod;
    }

    /**
     * Sets the value of the pmsCod property.
     * 
     */
    public void setPmsCod(long value) {
        this.pmsCod = value;
    }

    /**
     * Gets the value of the wsProtRisposta property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the wsProtRisposta property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getWsProtRisposta().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link WsProtRisposta }
     * 
     * 
     */
    public List<WsProtRisposta> getWsProtRisposta() {
        if (wsProtRisposta == null) {
            wsProtRisposta = new ArrayList<WsProtRisposta>();
        }
        return this.wsProtRisposta;
    }

}
