
package it.jiride.docwsfascicolisoap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for DocumentoFascicoloOut complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DocumentoFascicoloOut">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="IdDocumento" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="TipoDocumento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DataInserimento" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="DestinatarioInterno" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DataInvioDestinatario" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="Copia" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="AnnoProtocollo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NumeroProtocollo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IterAttivo" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="Oggetto" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DataAnnullamento" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="Origine" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DocumentoFascicoloOut", propOrder = {
    "idDocumento",
    "tipoDocumento",
    "dataInserimento",
    "destinatarioInterno",
    "dataInvioDestinatario",
    "copia",
    "annoProtocollo",
    "numeroProtocollo",
    "iterAttivo",
    "oggetto",
    "dataAnnullamento",
    "origine"
})
public class DocumentoFascicoloOut {

    @XmlElement(name = "IdDocumento")
    protected int idDocumento;
    @XmlElement(name = "TipoDocumento", nillable = true)
    protected String tipoDocumento;
    @XmlElement(name = "DataInserimento", required = true, nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dataInserimento;
    @XmlElement(name = "DestinatarioInterno", nillable = true)
    protected String destinatarioInterno;
    @XmlElement(name = "DataInvioDestinatario", required = true, nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dataInvioDestinatario;
    @XmlElement(name = "Copia")
    protected boolean copia;
    @XmlElement(name = "AnnoProtocollo", nillable = true)
    protected String annoProtocollo;
    @XmlElement(name = "NumeroProtocollo", nillable = true)
    protected String numeroProtocollo;
    @XmlElement(name = "IterAttivo")
    protected boolean iterAttivo;
    @XmlElement(name = "Oggetto", nillable = true)
    protected String oggetto;
    @XmlElement(name = "DataAnnullamento", required = true, nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dataAnnullamento;
    @XmlElement(name = "Origine", nillable = true)
    protected String origine;

    /**
     * Gets the value of the idDocumento property.
     * 
     */
    public int getIdDocumento() {
        return idDocumento;
    }

    /**
     * Sets the value of the idDocumento property.
     * 
     */
    public void setIdDocumento(int value) {
        this.idDocumento = value;
    }

    /**
     * Gets the value of the tipoDocumento property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipoDocumento() {
        return tipoDocumento;
    }

    /**
     * Sets the value of the tipoDocumento property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipoDocumento(String value) {
        this.tipoDocumento = value;
    }

    /**
     * Gets the value of the dataInserimento property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDataInserimento() {
        return dataInserimento;
    }

    /**
     * Sets the value of the dataInserimento property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDataInserimento(XMLGregorianCalendar value) {
        this.dataInserimento = value;
    }

    /**
     * Gets the value of the destinatarioInterno property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDestinatarioInterno() {
        return destinatarioInterno;
    }

    /**
     * Sets the value of the destinatarioInterno property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDestinatarioInterno(String value) {
        this.destinatarioInterno = value;
    }

    /**
     * Gets the value of the dataInvioDestinatario property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDataInvioDestinatario() {
        return dataInvioDestinatario;
    }

    /**
     * Sets the value of the dataInvioDestinatario property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDataInvioDestinatario(XMLGregorianCalendar value) {
        this.dataInvioDestinatario = value;
    }

    /**
     * Gets the value of the copia property.
     * 
     */
    public boolean isCopia() {
        return copia;
    }

    /**
     * Sets the value of the copia property.
     * 
     */
    public void setCopia(boolean value) {
        this.copia = value;
    }

    /**
     * Gets the value of the annoProtocollo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAnnoProtocollo() {
        return annoProtocollo;
    }

    /**
     * Sets the value of the annoProtocollo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAnnoProtocollo(String value) {
        this.annoProtocollo = value;
    }

    /**
     * Gets the value of the numeroProtocollo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumeroProtocollo() {
        return numeroProtocollo;
    }

    /**
     * Sets the value of the numeroProtocollo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumeroProtocollo(String value) {
        this.numeroProtocollo = value;
    }

    /**
     * Gets the value of the iterAttivo property.
     * 
     */
    public boolean isIterAttivo() {
        return iterAttivo;
    }

    /**
     * Sets the value of the iterAttivo property.
     * 
     */
    public void setIterAttivo(boolean value) {
        this.iterAttivo = value;
    }

    /**
     * Gets the value of the oggetto property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOggetto() {
        return oggetto;
    }

    /**
     * Sets the value of the oggetto property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOggetto(String value) {
        this.oggetto = value;
    }

    /**
     * Gets the value of the dataAnnullamento property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDataAnnullamento() {
        return dataAnnullamento;
    }

    /**
     * Sets the value of the dataAnnullamento property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDataAnnullamento(XMLGregorianCalendar value) {
        this.dataAnnullamento = value;
    }

    /**
     * Gets the value of the origine property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrigine() {
        return origine;
    }

    /**
     * Sets the value of the origine property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrigine(String value) {
        this.origine = value;
    }

}
