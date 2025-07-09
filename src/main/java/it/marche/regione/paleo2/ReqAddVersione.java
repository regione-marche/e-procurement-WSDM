
package it.marche.regione.paleo2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for reqAddVersione complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="reqAddVersione">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DocNumber" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="DocumentoPrincipale" type="{http://paleo.regione.marche.it/services2/}File" minOccurs="0"/>
 *         &lt;element name="DocumentoPrincipaleConformitaCopieImmagineSuSupportoInformatico" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="DocumentoPrincipaleFirmatoDigitalmente" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="DocumentoPrincipaleMarcaturaTemporale" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="DocumentoPrincipaleModalitaFormazione" type="{http://paleo.regione.marche.it/services/}TipoOriginale" minOccurs="0"/>
 *         &lt;element name="DocumentoPrincipaleSigillatoElettronicamente" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="NoteVersione" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Operatore" type="{http://paleo.regione.marche.it/services2/}OperatorePaleo" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "reqAddVersione", propOrder = {
    "docNumber",
    "documentoPrincipale",
    "documentoPrincipaleConformitaCopieImmagineSuSupportoInformatico",
    "documentoPrincipaleFirmatoDigitalmente",
    "documentoPrincipaleMarcaturaTemporale",
    "documentoPrincipaleModalitaFormazione",
    "documentoPrincipaleSigillatoElettronicamente",
    "noteVersione",
    "operatore"
})
public class ReqAddVersione {

    @XmlElement(name = "DocNumber")
    protected Integer docNumber;
    @XmlElement(name = "DocumentoPrincipale", nillable = true)
    protected File documentoPrincipale;
    @XmlElement(name = "DocumentoPrincipaleConformitaCopieImmagineSuSupportoInformatico", nillable = true)
    protected Boolean documentoPrincipaleConformitaCopieImmagineSuSupportoInformatico;
    @XmlElement(name = "DocumentoPrincipaleFirmatoDigitalmente", nillable = true)
    protected Boolean documentoPrincipaleFirmatoDigitalmente;
    @XmlElement(name = "DocumentoPrincipaleMarcaturaTemporale", nillable = true)
    protected Boolean documentoPrincipaleMarcaturaTemporale;
    @XmlElement(name = "DocumentoPrincipaleModalitaFormazione")
    protected TipoOriginale documentoPrincipaleModalitaFormazione;
    @XmlElement(name = "DocumentoPrincipaleSigillatoElettronicamente", nillable = true)
    protected Boolean documentoPrincipaleSigillatoElettronicamente;
    @XmlElement(name = "NoteVersione", nillable = true)
    protected String noteVersione;
    @XmlElement(name = "Operatore", nillable = true)
    protected OperatorePaleo operatore;

    /**
     * Gets the value of the docNumber property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getDocNumber() {
        return docNumber;
    }

    /**
     * Sets the value of the docNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setDocNumber(Integer value) {
        this.docNumber = value;
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
     * Gets the value of the documentoPrincipaleConformitaCopieImmagineSuSupportoInformatico property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDocumentoPrincipaleConformitaCopieImmagineSuSupportoInformatico() {
        return documentoPrincipaleConformitaCopieImmagineSuSupportoInformatico;
    }

    /**
     * Sets the value of the documentoPrincipaleConformitaCopieImmagineSuSupportoInformatico property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDocumentoPrincipaleConformitaCopieImmagineSuSupportoInformatico(Boolean value) {
        this.documentoPrincipaleConformitaCopieImmagineSuSupportoInformatico = value;
    }

    /**
     * Gets the value of the documentoPrincipaleFirmatoDigitalmente property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDocumentoPrincipaleFirmatoDigitalmente() {
        return documentoPrincipaleFirmatoDigitalmente;
    }

    /**
     * Sets the value of the documentoPrincipaleFirmatoDigitalmente property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDocumentoPrincipaleFirmatoDigitalmente(Boolean value) {
        this.documentoPrincipaleFirmatoDigitalmente = value;
    }

    /**
     * Gets the value of the documentoPrincipaleMarcaturaTemporale property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDocumentoPrincipaleMarcaturaTemporale() {
        return documentoPrincipaleMarcaturaTemporale;
    }

    /**
     * Sets the value of the documentoPrincipaleMarcaturaTemporale property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDocumentoPrincipaleMarcaturaTemporale(Boolean value) {
        this.documentoPrincipaleMarcaturaTemporale = value;
    }

    /**
     * Gets the value of the documentoPrincipaleModalitaFormazione property.
     * 
     * @return
     *     possible object is
     *     {@link TipoOriginale }
     *     
     */
    public TipoOriginale getDocumentoPrincipaleModalitaFormazione() {
        return documentoPrincipaleModalitaFormazione;
    }

    /**
     * Sets the value of the documentoPrincipaleModalitaFormazione property.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoOriginale }
     *     
     */
    public void setDocumentoPrincipaleModalitaFormazione(TipoOriginale value) {
        this.documentoPrincipaleModalitaFormazione = value;
    }

    /**
     * Gets the value of the documentoPrincipaleSigillatoElettronicamente property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDocumentoPrincipaleSigillatoElettronicamente() {
        return documentoPrincipaleSigillatoElettronicamente;
    }

    /**
     * Sets the value of the documentoPrincipaleSigillatoElettronicamente property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDocumentoPrincipaleSigillatoElettronicamente(Boolean value) {
        this.documentoPrincipaleSigillatoElettronicamente = value;
    }

    /**
     * Gets the value of the noteVersione property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNoteVersione() {
        return noteVersione;
    }

    /**
     * Sets the value of the noteVersione property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNoteVersione(String value) {
        this.noteVersione = value;
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

}
