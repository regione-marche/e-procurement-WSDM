
package it.marche.regione.paleo2;

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
 *         &lt;element name="ConformitaCopieImmagineSuSupportoInformatico" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Descrizione" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Documento" type="{http://paleo.regione.marche.it/services2/}File" minOccurs="0"/>
 *         &lt;element name="FirmatoDigitalmente" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="MarcaturaTemporale" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="ModalitaFormazione" type="{http://paleo.regione.marche.it/services/}TipoOriginale" minOccurs="0"/>
 *         &lt;element name="NumeroPagine" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="SigillatoElettronicamente" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
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
    "conformitaCopieImmagineSuSupportoInformatico",
    "descrizione",
    "documento",
    "firmatoDigitalmente",
    "marcaturaTemporale",
    "modalitaFormazione",
    "numeroPagine",
    "sigillatoElettronicamente"
})
public class Allegato {

    @XmlElement(name = "ConformitaCopieImmagineSuSupportoInformatico", nillable = true)
    protected Boolean conformitaCopieImmagineSuSupportoInformatico;
    @XmlElement(name = "Descrizione", nillable = true)
    protected String descrizione;
    @XmlElement(name = "Documento", nillable = true)
    protected File documento;
    @XmlElement(name = "FirmatoDigitalmente", nillable = true)
    protected Boolean firmatoDigitalmente;
    @XmlElement(name = "MarcaturaTemporale", nillable = true)
    protected Boolean marcaturaTemporale;
    @XmlElement(name = "ModalitaFormazione")
    protected TipoOriginale modalitaFormazione;
    @XmlElement(name = "NumeroPagine", nillable = true)
    protected Integer numeroPagine;
    @XmlElement(name = "SigillatoElettronicamente", nillable = true)
    protected Boolean sigillatoElettronicamente;

    /**
     * Gets the value of the conformitaCopieImmagineSuSupportoInformatico property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isConformitaCopieImmagineSuSupportoInformatico() {
        return conformitaCopieImmagineSuSupportoInformatico;
    }

    /**
     * Sets the value of the conformitaCopieImmagineSuSupportoInformatico property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setConformitaCopieImmagineSuSupportoInformatico(Boolean value) {
        this.conformitaCopieImmagineSuSupportoInformatico = value;
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
     * Gets the value of the firmatoDigitalmente property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isFirmatoDigitalmente() {
        return firmatoDigitalmente;
    }

    /**
     * Sets the value of the firmatoDigitalmente property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setFirmatoDigitalmente(Boolean value) {
        this.firmatoDigitalmente = value;
    }

    /**
     * Gets the value of the marcaturaTemporale property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMarcaturaTemporale() {
        return marcaturaTemporale;
    }

    /**
     * Sets the value of the marcaturaTemporale property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMarcaturaTemporale(Boolean value) {
        this.marcaturaTemporale = value;
    }

    /**
     * Gets the value of the modalitaFormazione property.
     * 
     * @return
     *     possible object is
     *     {@link TipoOriginale }
     *     
     */
    public TipoOriginale getModalitaFormazione() {
        return modalitaFormazione;
    }

    /**
     * Sets the value of the modalitaFormazione property.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoOriginale }
     *     
     */
    public void setModalitaFormazione(TipoOriginale value) {
        this.modalitaFormazione = value;
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
     * Gets the value of the sigillatoElettronicamente property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSigillatoElettronicamente() {
        return sigillatoElettronicamente;
    }

    /**
     * Sets the value of the sigillatoElettronicamente property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSigillatoElettronicamente(Boolean value) {
        this.sigillatoElettronicamente = value;
    }

}
