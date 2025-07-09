
package it.marche.regione.paleo2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for reqProtocolloPartenza complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="reqProtocolloPartenza">
 *   &lt;complexContent>
 *     &lt;extension base="{http://paleo.regione.marche.it/services2/}reqProtocollo">
 *       &lt;sequence>
 *         &lt;element name="CodiceGruppoRubricaDestinatari" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DestinatariRubrica" type="{http://paleo.regione.marche.it/services2/}ArrayOfDestinatario" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "reqProtocolloPartenza", propOrder = {
    "codiceGruppoRubricaDestinatari",
    "destinatariRubrica"
})
public class ReqProtocolloPartenza
    extends ReqProtocollo
{

    @XmlElement(name = "CodiceGruppoRubricaDestinatari", nillable = true)
    protected String codiceGruppoRubricaDestinatari;
    @XmlElement(name = "DestinatariRubrica", nillable = true)
    protected ArrayOfDestinatario destinatariRubrica;

    /**
     * Gets the value of the codiceGruppoRubricaDestinatari property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodiceGruppoRubricaDestinatari() {
        return codiceGruppoRubricaDestinatari;
    }

    /**
     * Sets the value of the codiceGruppoRubricaDestinatari property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodiceGruppoRubricaDestinatari(String value) {
        this.codiceGruppoRubricaDestinatari = value;
    }

    /**
     * Gets the value of the destinatariRubrica property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDestinatario }
     *     
     */
    public ArrayOfDestinatario getDestinatariRubrica() {
        return destinatariRubrica;
    }

    /**
     * Sets the value of the destinatariRubrica property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDestinatario }
     *     
     */
    public void setDestinatariRubrica(ArrayOfDestinatario value) {
        this.destinatariRubrica = value;
    }

}
