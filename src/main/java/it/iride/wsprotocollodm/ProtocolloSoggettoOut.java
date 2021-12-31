
package it.iride.wsprotocollodm;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ProtocolloSoggettoOut complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ProtocolloSoggettoOut">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="IdDocumento" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="NumeroProtocollo" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="DataProtocollo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AnnoProtocollazione" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Origine" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Oggetto" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MittenteDestinatario" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IdSoggetto" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Cognome" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Nome" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProtocolloSoggettoOut", propOrder = {
    "idDocumento",
    "numeroProtocollo",
    "dataProtocollo",
    "annoProtocollazione",
    "origine",
    "oggetto",
    "mittenteDestinatario",
    "idSoggetto",
    "cognome",
    "nome"
})
public class ProtocolloSoggettoOut {

    @XmlElement(name = "IdDocumento")
    protected int idDocumento;
    @XmlElement(name = "NumeroProtocollo")
    protected int numeroProtocollo;
    @XmlElement(name = "DataProtocollo")
    protected String dataProtocollo;
    @XmlElement(name = "AnnoProtocollazione")
    protected int annoProtocollazione;
    @XmlElement(name = "Origine")
    protected String origine;
    @XmlElement(name = "Oggetto")
    protected String oggetto;
    @XmlElement(name = "MittenteDestinatario")
    protected String mittenteDestinatario;
    @XmlElement(name = "IdSoggetto")
    protected int idSoggetto;
    @XmlElement(name = "Cognome")
    protected String cognome;
    @XmlElement(name = "Nome")
    protected String nome;

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
     * Gets the value of the numeroProtocollo property.
     * 
     */
    public int getNumeroProtocollo() {
        return numeroProtocollo;
    }

    /**
     * Sets the value of the numeroProtocollo property.
     * 
     */
    public void setNumeroProtocollo(int value) {
        this.numeroProtocollo = value;
    }

    /**
     * Gets the value of the dataProtocollo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDataProtocollo() {
        return dataProtocollo;
    }

    /**
     * Sets the value of the dataProtocollo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDataProtocollo(String value) {
        this.dataProtocollo = value;
    }

    /**
     * Gets the value of the annoProtocollazione property.
     * 
     */
    public int getAnnoProtocollazione() {
        return annoProtocollazione;
    }

    /**
     * Sets the value of the annoProtocollazione property.
     * 
     */
    public void setAnnoProtocollazione(int value) {
        this.annoProtocollazione = value;
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
     * Gets the value of the mittenteDestinatario property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMittenteDestinatario() {
        return mittenteDestinatario;
    }

    /**
     * Sets the value of the mittenteDestinatario property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMittenteDestinatario(String value) {
        this.mittenteDestinatario = value;
    }

    /**
     * Gets the value of the idSoggetto property.
     * 
     */
    public int getIdSoggetto() {
        return idSoggetto;
    }

    /**
     * Sets the value of the idSoggetto property.
     * 
     */
    public void setIdSoggetto(int value) {
        this.idSoggetto = value;
    }

    /**
     * Gets the value of the cognome property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCognome() {
        return cognome;
    }

    /**
     * Sets the value of the cognome property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCognome(String value) {
        this.cognome = value;
    }

    /**
     * Gets the value of the nome property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNome() {
        return nome;
    }

    /**
     * Sets the value of the nome property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNome(String value) {
        this.nome = value;
    }

}
