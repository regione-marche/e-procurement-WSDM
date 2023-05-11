
package it.marche.regione.paleowssec;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for reqDocumento complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="reqDocumento">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Classificazioni" type="{http://paleo.regione.marche.it/services/}ArrayOfClassificazione" minOccurs="0"/>
 *         &lt;element name="DocumentiAllegati" type="{http://paleo.regione.marche.it/services/}ArrayOfAllegato" minOccurs="0"/>
 *         &lt;element name="DocumentoPrincipale" type="{http://paleo.regione.marche.it/services/}File" minOccurs="0"/>
 *         &lt;element name="DocumentoPrincipaleAcquisitoIntegralmente" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="DocumentoPrincipaleOriginale" type="{http://paleo.regione.marche.it/services/}TipoOriginale" minOccurs="0"/>
 *         &lt;element name="Note" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Oggetto" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Operatore" type="{http://paleo.regione.marche.it/services/}OperatorePaleo"/>
 *         &lt;element name="Privato" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="Procedimento" type="{http://paleo.regione.marche.it/services/}DatiProcedimento" minOccurs="0"/>
 *         &lt;element name="TipoDocumento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Trasmissione" type="{http://paleo.regione.marche.it/services/}Trasmissione" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "reqDocumento", propOrder = {
    "classificazioni",
    "documentiAllegati",
    "documentoPrincipale",
    "documentoPrincipaleAcquisitoIntegralmente",
    "documentoPrincipaleOriginale",
    "note",
    "oggetto",
    "operatore",
    "privato",
    "procedimento",
    "tipoDocumento",
    "trasmissione"
})
@XmlSeeAlso({
    ReqProtocollo.class
})
public class ReqDocumento {

    @XmlElement(name = "Classificazioni", nillable = true)
    protected ArrayOfClassificazione classificazioni;
    @XmlElement(name = "DocumentiAllegati", nillable = true)
    protected ArrayOfAllegato documentiAllegati;
    @XmlElement(name = "DocumentoPrincipale", nillable = true)
    protected File documentoPrincipale;
    @XmlElement(name = "DocumentoPrincipaleAcquisitoIntegralmente")
    protected boolean documentoPrincipaleAcquisitoIntegralmente;
    @XmlElement(name = "DocumentoPrincipaleOriginale")
    protected TipoOriginale documentoPrincipaleOriginale;
    @XmlElement(name = "Note", nillable = true)
    protected String note;
    @XmlElement(name = "Oggetto", required = true, nillable = true)
    protected String oggetto;
    @XmlElement(name = "Operatore", required = true, nillable = true)
    protected OperatorePaleo operatore;
    @XmlElement(name = "Privato")
    protected boolean privato;
    @XmlElement(name = "Procedimento", nillable = true)
    protected DatiProcedimento procedimento;
    @XmlElement(name = "TipoDocumento", nillable = true)
    protected String tipoDocumento;
    @XmlElement(name = "Trasmissione", nillable = true)
    protected Trasmissione trasmissione;

    /**
     * Gets the value of the classificazioni property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfClassificazione }
     *     
     */
    public ArrayOfClassificazione getClassificazioni() {
        return classificazioni;
    }

    /**
     * Sets the value of the classificazioni property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfClassificazione }
     *     
     */
    public void setClassificazioni(ArrayOfClassificazione value) {
        this.classificazioni = value;
    }

    /**
     * Gets the value of the documentiAllegati property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfAllegato }
     *     
     */
    public ArrayOfAllegato getDocumentiAllegati() {
        return documentiAllegati;
    }

    /**
     * Sets the value of the documentiAllegati property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfAllegato }
     *     
     */
    public void setDocumentiAllegati(ArrayOfAllegato value) {
        this.documentiAllegati = value;
    }

    /**
     * Gets the value of the documentoPrincipale property.
     * 
     * @return
     *     possible object is
     *     {@link File }
     *     
     */
    public File getDocumentoPrincipale() {
        return documentoPrincipale;
    }

    /**
     * Sets the value of the documentoPrincipale property.
     * 
     * @param value
     *     allowed object is
     *     {@link File }
     *     
     */
    public void setDocumentoPrincipale(File value) {
        this.documentoPrincipale = value;
    }

    /**
     * Gets the value of the documentoPrincipaleAcquisitoIntegralmente property.
     * 
     */
    public boolean isDocumentoPrincipaleAcquisitoIntegralmente() {
        return documentoPrincipaleAcquisitoIntegralmente;
    }

    /**
     * Sets the value of the documentoPrincipaleAcquisitoIntegralmente property.
     * 
     */
    public void setDocumentoPrincipaleAcquisitoIntegralmente(boolean value) {
        this.documentoPrincipaleAcquisitoIntegralmente = value;
    }

    /**
     * Gets the value of the documentoPrincipaleOriginale property.
     * 
     * @return
     *     possible object is
     *     {@link TipoOriginale }
     *     
     */
    public TipoOriginale getDocumentoPrincipaleOriginale() {
        return documentoPrincipaleOriginale;
    }

    /**
     * Sets the value of the documentoPrincipaleOriginale property.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoOriginale }
     *     
     */
    public void setDocumentoPrincipaleOriginale(TipoOriginale value) {
        this.documentoPrincipaleOriginale = value;
    }

    /**
     * Gets the value of the note property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNote() {
        return note;
    }

    /**
     * Sets the value of the note property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNote(String value) {
        this.note = value;
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
     * Gets the value of the operatore property.
     * 
     * @return
     *     possible object is
     *     {@link OperatorePaleo }
     *     
     */
    public OperatorePaleo getOperatore() {
        return operatore;
    }

    /**
     * Sets the value of the operatore property.
     * 
     * @param value
     *     allowed object is
     *     {@link OperatorePaleo }
     *     
     */
    public void setOperatore(OperatorePaleo value) {
        this.operatore = value;
    }

    /**
     * Gets the value of the privato property.
     * 
     */
    public boolean isPrivato() {
        return privato;
    }

    /**
     * Sets the value of the privato property.
     * 
     */
    public void setPrivato(boolean value) {
        this.privato = value;
    }

    /**
     * Gets the value of the procedimento property.
     * 
     * @return
     *     possible object is
     *     {@link DatiProcedimento }
     *     
     */
    public DatiProcedimento getProcedimento() {
        return procedimento;
    }

    /**
     * Sets the value of the procedimento property.
     * 
     * @param value
     *     allowed object is
     *     {@link DatiProcedimento }
     *     
     */
    public void setProcedimento(DatiProcedimento value) {
        this.procedimento = value;
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
     * Gets the value of the trasmissione property.
     * 
     * @return
     *     possible object is
     *     {@link Trasmissione }
     *     
     */
    public Trasmissione getTrasmissione() {
        return trasmissione;
    }

    /**
     * Sets the value of the trasmissione property.
     * 
     * @param value
     *     allowed object is
     *     {@link Trasmissione }
     *     
     */
    public void setTrasmissione(Trasmissione value) {
        this.trasmissione = value;
    }

}
