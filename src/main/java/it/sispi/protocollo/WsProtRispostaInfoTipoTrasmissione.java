
package it.sispi.protocollo;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for WsProtRispostaInfoTipoTrasmissione complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="WsProtRispostaInfoTipoTrasmissione">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="decodifica" type="{http://protocollo.sispi.it}WsProtDecodifica" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WsProtRispostaInfoTipoTrasmissione", propOrder = {
    "decodifica"
})
public class WsProtRispostaInfoTipoTrasmissione {

    protected List<WsProtDecodifica> decodifica;

    /**
     * Gets the value of the decodifica property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the decodifica property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDecodifica().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link WsProtDecodifica }
     * 
     * 
     */
    public List<WsProtDecodifica> getDecodifica() {
        if (decodifica == null) {
            decodifica = new ArrayList<WsProtDecodifica>();
        }
        return this.decodifica;
    }

}
