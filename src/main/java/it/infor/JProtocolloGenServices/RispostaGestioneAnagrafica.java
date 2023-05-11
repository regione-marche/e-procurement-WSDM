
package it.infor.JProtocolloGenServices;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="esito" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="messaggio" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="anagrafica" type="{http://infor.arezzo.it/jente/jprotocollo/webservices/gen}anagraficaType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "esito",
    "messaggio",
    "anagrafica"
})
@XmlRootElement(name = "rispostaGestioneAnagrafica")
public class RispostaGestioneAnagrafica {

    @XmlElement(required = true)
    protected String esito;
    @XmlElement(required = true)
    protected String messaggio;
    @XmlElement(nillable = true)
    protected List<AnagraficaType> anagrafica;

    /**
     * Gets the value of the esito property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEsito() {
        return esito;
    }

    /**
     * Sets the value of the esito property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEsito(String value) {
        this.esito = value;
    }

    /**
     * Gets the value of the messaggio property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMessaggio() {
        return messaggio;
    }

    /**
     * Sets the value of the messaggio property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMessaggio(String value) {
        this.messaggio = value;
    }

    /**
     * Gets the value of the anagrafica property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the anagrafica property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAnagrafica().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AnagraficaType }
     * 
     * 
     */
    public List<AnagraficaType> getAnagrafica() {
        if (anagrafica == null) {
            anagrafica = new ArrayList<AnagraficaType>();
        }
        return this.anagrafica;
    }

}
