
package it.marche.regione.paleo2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for reqProtocollo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="reqProtocollo">
 *   &lt;complexContent>
 *     &lt;extension base="{http://paleo.regione.marche.it/services2/}reqDocumento">
 *       &lt;sequence>
 *         &lt;element name="CodiceRegistro" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Emergenza" type="{http://paleo.regione.marche.it/services2/}DatiEmergenza" minOccurs="0"/>
 *         &lt;element name="SegnaturaProtocolloPrecedente" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "reqProtocollo", propOrder = {
    "codiceRegistro",
    "emergenza",
    "segnaturaProtocolloPrecedente"
})
@XmlSeeAlso({
    ReqProtocolloArrivo.class,
    ReqProtocolloPartenza.class
})
public class ReqProtocollo
    extends ReqDocumento
{

    @XmlElement(name = "CodiceRegistro", nillable = true)
    protected String codiceRegistro;
    @XmlElement(name = "Emergenza", nillable = true)
    protected DatiEmergenza emergenza;
    @XmlElement(name = "SegnaturaProtocolloPrecedente", nillable = true)
    protected String segnaturaProtocolloPrecedente;

    /**
     * Gets the value of the codiceRegistro property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodiceRegistro() {
        return codiceRegistro;
    }

    /**
     * Sets the value of the codiceRegistro property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodiceRegistro(String value) {
        this.codiceRegistro = value;
    }

    /**
     * Gets the value of the emergenza property.
     * 
     * @return
     *     possible object is
     *     {@link DatiEmergenza }
     *     
     */
    public DatiEmergenza getEmergenza() {
        return emergenza;
    }

    /**
     * Sets the value of the emergenza property.
     * 
     * @param value
     *     allowed object is
     *     {@link DatiEmergenza }
     *     
     */
    public void setEmergenza(DatiEmergenza value) {
        this.emergenza = value;
    }

    /**
     * Gets the value of the segnaturaProtocolloPrecedente property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSegnaturaProtocolloPrecedente() {
        return segnaturaProtocolloPrecedente;
    }

    /**
     * Sets the value of the segnaturaProtocolloPrecedente property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSegnaturaProtocolloPrecedente(String value) {
        this.segnaturaProtocolloPrecedente = value;
    }

}
