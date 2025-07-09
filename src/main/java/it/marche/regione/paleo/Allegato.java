
package it.marche.regione.paleo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Allegato complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Allegato">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Descrizione" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Documento" type="{http://paleo.regione.marche.it/services/}File" minOccurs="0"/>
 *         &lt;element name="DocumentoPrincipaleConformitaCopieImmagineSuSupportoInformatico" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="DocumentoPrincipaleFirmatoDigitalmente" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="DocumentoPrincipaleMarcaturaTemporale" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="DocumentoPrincipaleSigillatoElettronicamente" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="NumeroPagine" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="Originale" type="{http://paleo.regione.marche.it/services/}TipoOriginale" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Allegato", propOrder = {
    "descrizione",
    "documento",
    "documentoPrincipaleConformitaCopieImmagineSuSupportoInformatico",
    "documentoPrincipaleFirmatoDigitalmente",
    "documentoPrincipaleMarcaturaTemporale",
    "documentoPrincipaleSigillatoElettronicamente",
    "numeroPagine",
    "originale"
})
public class Allegato {

    @XmlElement(name = "Descrizione", required = true, nillable = true)
    protected String descrizione;
    @XmlElement(name = "Documento", nillable = true)
    protected File documento;
    @XmlElement(name = "DocumentoPrincipaleConformitaCopieImmagineSuSupportoInformatico", nillable = true)
    protected Boolean documentoPrincipaleConformitaCopieImmagineSuSupportoInformatico;
    @XmlElement(name = "DocumentoPrincipaleFirmatoDigitalmente", nillable = true)
    protected Boolean documentoPrincipaleFirmatoDigitalmente;
    @XmlElement(name = "DocumentoPrincipaleMarcaturaTemporale", nillable = true)
    protected Boolean documentoPrincipaleMarcaturaTemporale;
    @XmlElement(name = "DocumentoPrincipaleSigillatoElettronicamente", nillable = true)
    protected Boolean documentoPrincipaleSigillatoElettronicamente;
    @XmlElement(name = "NumeroPagine", nillable = true)
    protected Integer numeroPagine;
    @XmlElement(name = "Originale")
    protected TipoOriginale originale;

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
     * Gets the value of the documento property.
     * 
     * @return
     *     possible object is
     *     {@link File }
     *     
     */
    public File getDocumento() {
        return documento;
    }

    /**
     * Sets the value of the documento property.
     * 
     * @param value
     *     allowed object is
     *     {@link File }
     *     
     */
    public void setDocumento(File value) {
        this.documento = value;
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
     * Gets the value of the numeroPagine property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNumeroPagine() {
        return numeroPagine;
    }

    /**
     * Sets the value of the numeroPagine property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNumeroPagine(Integer value) {
        this.numeroPagine = value;
    }

    /**
     * Gets the value of the originale property.
     * 
     * @return
     *     possible object is
     *     {@link TipoOriginale }
     *     
     */
    public TipoOriginale getOriginale() {
        return originale;
    }

    /**
     * Sets the value of the originale property.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoOriginale }
     *     
     */
    public void setOriginale(TipoOriginale value) {
        this.originale = value;
    }

}
