
package it.marche.regione.paleo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.regionemarche_protocollo.TipoOggettoIPA;


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
 *         &lt;element name="opp" type="{http://paleo.regione.marche.it/services/}OperatorePaleo" minOccurs="0"/>
 *         &lt;element name="descrizione" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tipoOggetto" type="{http://schemas.datacontract.org/2004/07/RegioneMarche.Protocollo.Providers}TipoOggettoIPA" minOccurs="0"/>
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
    "opp",
    "descrizione",
    "tipoOggetto"
})
@XmlRootElement(name = "FindIpa")
public class FindIpa {

    @XmlElement(nillable = true)
    protected OperatorePaleo opp;
    @XmlElement(nillable = true)
    protected String descrizione;
    @XmlElement(nillable = true)
    protected TipoOggettoIPA tipoOggetto;

    /**
     * Gets the value of the opp property.
     * 
     * @return
     *     possible object is
     *     {@link OperatorePaleo }
     *     
     */
    public OperatorePaleo getOpp() {
        return opp;
    }

    /**
     * Sets the value of the opp property.
     * 
     * @param value
     *     allowed object is
     *     {@link OperatorePaleo }
     *     
     */
    public void setOpp(OperatorePaleo value) {
        this.opp = value;
    }

    /**
     * Gets the value of the descrizione property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescrizione() {
        return descrizione;
    }

    /**
     * Sets the value of the descrizione property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescrizione(String value) {
        this.descrizione = value;
    }

    /**
     * Gets the value of the tipoOggetto property.
     * 
     * @return
     *     possible object is
     *     {@link TipoOggettoIPA }
     *     
     */
    public TipoOggettoIPA getTipoOggetto() {
        return tipoOggetto;
    }

    /**
     * Sets the value of the tipoOggetto property.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoOggettoIPA }
     *     
     */
    public void setTipoOggetto(TipoOggettoIPA value) {
        this.tipoOggetto = value;
    }

}
