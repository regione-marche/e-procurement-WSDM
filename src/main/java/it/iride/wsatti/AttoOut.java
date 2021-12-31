
package it.iride.wsatti;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for AttoOut complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AttoOut">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="IdDocumento" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="TipoDocumento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TipoDocumento_Descrizione" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Oggetto" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OggettoBilingue" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Classifica" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Classifica_Descrizione" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DataDocumento" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="NumeroProtocollo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Proposta" type="{http://tempuri.org/}PropostaOut" minOccurs="0"/>
 *         &lt;element name="Delibera" type="{http://tempuri.org/}DeliberaOut" minOccurs="0"/>
 *         &lt;element name="Determina" type="{http://tempuri.org/}DeterminaOut" minOccurs="0"/>
 *         &lt;element name="Allegati" type="{http://tempuri.org/}ArrayOfAllegatoOut" minOccurs="0"/>
 *         &lt;element name="Impegni" type="{http://tempuri.org/}ArrayOfImpegnoOut" minOccurs="0"/>
 *         &lt;element name="Accertamenti" type="{http://tempuri.org/}ArrayOfAccertamentoOut" minOccurs="0"/>
 *         &lt;element name="CentriDiCosto" type="{http://tempuri.org/}ArrayOfCentriDiCostoOut" minOccurs="0"/>
 *         &lt;element name="Registri" type="{http://tempuri.org/}ArrayOfRegistroAssegnatoOut" minOccurs="0"/>
 *         &lt;element name="Messaggio" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Errore" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AttoOut", propOrder = {
    "idDocumento",
    "tipoDocumento",
    "tipoDocumentoDescrizione",
    "oggetto",
    "oggettoBilingue",
    "classifica",
    "classificaDescrizione",
    "dataDocumento",
    "numeroProtocollo",
    "proposta",
    "delibera",
    "determina",
    "allegati",
    "impegni",
    "accertamenti",
    "centriDiCosto",
    "registri",
    "messaggio",
    "errore"
})
@XmlRootElement(name="AttoOut")
public class AttoOut {

    @XmlElement(name = "IdDocumento")
    protected int idDocumento;
    @XmlElement(name = "TipoDocumento")
    protected String tipoDocumento;
    @XmlElement(name = "TipoDocumento_Descrizione")
    protected String tipoDocumentoDescrizione;
    @XmlElement(name = "Oggetto")
    protected String oggetto;
    @XmlElement(name = "OggettoBilingue")
    protected String oggettoBilingue;
    @XmlElement(name = "Classifica")
    protected String classifica;
    @XmlElement(name = "Classifica_Descrizione")
    protected String classificaDescrizione;
    @XmlElement(name = "DataDocumento", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dataDocumento;
    @XmlElement(name = "NumeroProtocollo")
    protected String numeroProtocollo;
    @XmlElement(name = "Proposta")
    protected PropostaOut proposta;
    @XmlElement(name = "Delibera")
    protected DeliberaOut delibera;
    @XmlElement(name = "Determina")
    protected DeterminaOut determina;
    @XmlElement(name = "Allegati")
    protected ArrayOfAllegatoOut allegati;
    @XmlElement(name = "Impegni")
    protected ArrayOfImpegnoOut impegni;
    @XmlElement(name = "Accertamenti")
    protected ArrayOfAccertamentoOut accertamenti;
    @XmlElement(name = "CentriDiCosto")
    protected ArrayOfCentriDiCostoOut centriDiCosto;
    @XmlElement(name = "Registri")
    protected ArrayOfRegistroAssegnatoOut registri;
    @XmlElement(name = "Messaggio")
    protected String messaggio;
    @XmlElement(name = "Errore")
    protected String errore;

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
     * Gets the value of the tipoDocumentoDescrizione property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipoDocumentoDescrizione() {
        return tipoDocumentoDescrizione;
    }

    /**
     * Sets the value of the tipoDocumentoDescrizione property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipoDocumentoDescrizione(String value) {
        this.tipoDocumentoDescrizione = value;
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
     * Gets the value of the oggettoBilingue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOggettoBilingue() {
        return oggettoBilingue;
    }

    /**
     * Sets the value of the oggettoBilingue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOggettoBilingue(String value) {
        this.oggettoBilingue = value;
    }

    /**
     * Gets the value of the classifica property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClassifica() {
        return classifica;
    }

    /**
     * Sets the value of the classifica property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClassifica(String value) {
        this.classifica = value;
    }

    /**
     * Gets the value of the classificaDescrizione property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClassificaDescrizione() {
        return classificaDescrizione;
    }

    /**
     * Sets the value of the classificaDescrizione property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClassificaDescrizione(String value) {
        this.classificaDescrizione = value;
    }

    /**
     * Gets the value of the dataDocumento property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDataDocumento() {
        return dataDocumento;
    }

    /**
     * Sets the value of the dataDocumento property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDataDocumento(XMLGregorianCalendar value) {
        this.dataDocumento = value;
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
     * Gets the value of the proposta property.
     * 
     * @return
     *     possible object is
     *     {@link PropostaOut }
     *     
     */
    public PropostaOut getProposta() {
        return proposta;
    }

    /**
     * Sets the value of the proposta property.
     * 
     * @param value
     *     allowed object is
     *     {@link PropostaOut }
     *     
     */
    public void setProposta(PropostaOut value) {
        this.proposta = value;
    }

    /**
     * Gets the value of the delibera property.
     * 
     * @return
     *     possible object is
     *     {@link DeliberaOut }
     *     
     */
    public DeliberaOut getDelibera() {
        return delibera;
    }

    /**
     * Sets the value of the delibera property.
     * 
     * @param value
     *     allowed object is
     *     {@link DeliberaOut }
     *     
     */
    public void setDelibera(DeliberaOut value) {
        this.delibera = value;
    }

    /**
     * Gets the value of the determina property.
     * 
     * @return
     *     possible object is
     *     {@link DeterminaOut }
     *     
     */
    public DeterminaOut getDetermina() {
        return determina;
    }

    /**
     * Sets the value of the determina property.
     * 
     * @param value
     *     allowed object is
     *     {@link DeterminaOut }
     *     
     */
    public void setDetermina(DeterminaOut value) {
        this.determina = value;
    }

    /**
     * Gets the value of the allegati property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfAllegatoOut }
     *     
     */
    public ArrayOfAllegatoOut getAllegati() {
        return allegati;
    }

    /**
     * Sets the value of the allegati property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfAllegatoOut }
     *     
     */
    public void setAllegati(ArrayOfAllegatoOut value) {
        this.allegati = value;
    }

    /**
     * Gets the value of the impegni property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfImpegnoOut }
     *     
     */
    public ArrayOfImpegnoOut getImpegni() {
        return impegni;
    }

    /**
     * Sets the value of the impegni property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfImpegnoOut }
     *     
     */
    public void setImpegni(ArrayOfImpegnoOut value) {
        this.impegni = value;
    }

    /**
     * Gets the value of the accertamenti property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfAccertamentoOut }
     *     
     */
    public ArrayOfAccertamentoOut getAccertamenti() {
        return accertamenti;
    }

    /**
     * Sets the value of the accertamenti property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfAccertamentoOut }
     *     
     */
    public void setAccertamenti(ArrayOfAccertamentoOut value) {
        this.accertamenti = value;
    }

    /**
     * Gets the value of the centriDiCosto property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfCentriDiCostoOut }
     *     
     */
    public ArrayOfCentriDiCostoOut getCentriDiCosto() {
        return centriDiCosto;
    }

    /**
     * Sets the value of the centriDiCosto property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfCentriDiCostoOut }
     *     
     */
    public void setCentriDiCosto(ArrayOfCentriDiCostoOut value) {
        this.centriDiCosto = value;
    }

    /**
     * Gets the value of the registri property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfRegistroAssegnatoOut }
     *     
     */
    public ArrayOfRegistroAssegnatoOut getRegistri() {
        return registri;
    }

    /**
     * Sets the value of the registri property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfRegistroAssegnatoOut }
     *     
     */
    public void setRegistri(ArrayOfRegistroAssegnatoOut value) {
        this.registri = value;
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
     * Gets the value of the errore property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getErrore() {
        return errore;
    }

    /**
     * Sets the value of the errore property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setErrore(String value) {
        this.errore = value;
    }

}
