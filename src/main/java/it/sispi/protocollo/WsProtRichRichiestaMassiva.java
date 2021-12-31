
package it.sispi.protocollo;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for WsProtRichRichiestaMassiva complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="WsProtRichRichiestaMassiva">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="pmsCod" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="richRegProtMappata" type="{http://protocollo.sispi.it}WsProtRichMappata" maxOccurs="unbounded"/>
 *         &lt;element name="userIdOperatore" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WsProtRichRichiestaMassiva", propOrder = {
    "pmsCod",
    "richRegProtMappata",
    "userIdOperatore"
})
public class WsProtRichRichiestaMassiva {

    protected long pmsCod;
    @XmlElement(required = true)
    protected List<WsProtRichMappata> richRegProtMappata;
    protected String userIdOperatore;

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
     * Gets the value of the richRegProtMappata property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the richRegProtMappata property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRichRegProtMappata().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link WsProtRichMappata }
     * 
     * 
     */
    public List<WsProtRichMappata> getRichRegProtMappata() {
        if (richRegProtMappata == null) {
            richRegProtMappata = new ArrayList<WsProtRichMappata>();
        }
        return this.richRegProtMappata;
    }

    /**
     * Gets the value of the userIdOperatore property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserIdOperatore() {
        return userIdOperatore;
    }

    /**
     * Sets the value of the userIdOperatore property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserIdOperatore(String value) {
        this.userIdOperatore = value;
    }

}
