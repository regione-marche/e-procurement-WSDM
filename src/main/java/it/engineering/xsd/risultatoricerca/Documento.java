//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.10.27 at 02:58:49 PM CEST 
//


package it.engineering.xsd.risultatoricerca;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.NormalizedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "idDoc",
    "numCopia",
    "regPrimaria",
    "dtReg",
    "regSecondaria",
    "regEmergenza",
    "dtArrivo",
    "oggetto",
    "mittenti",
    "destinatari",
    "uoAssegnataria",
    "idIndice",
    "desIndice",
    "annoFasc",
    "titolo",
    "classe",
    "sottoClasse",
    "livello4",
    "livello5",
    "progrFasc",
    "idFascicolo",
    "numSottofasc",
    "oggettoFasc",
    "dtAperturaFasc",
    "dtChiusuraFasc",
    "oggettoSottofasc",
    "dtAperturaSottofasc",
    "dtChiusuraSottofasc",
    "nroAlleg",
    "rifProv",
    "protProv",
    "dtProv",
    "docPrec",
    "nominativo"
})
@XmlRootElement(name = "Documento")
public class Documento {

    @XmlAttribute(name = "TipoReg", required = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String tipoReg;
    @XmlAttribute(name = "FlgPresoIncarico", required = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String flgPresoIncarico;
    @XmlAttribute(name = "FlgEvd", required = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String flgEvd;
    @XmlAttribute(name = "FlgRsv", required = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String flgRsv;
    @XmlAttribute(name = "FlgScartato", required = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String flgScartato;
    @XmlAttribute(name = "FlgRegAnnullata", required = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String flgRegAnnullata;
    @XmlAttribute(name = "FlgCopiaAnnullata", required = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String flgCopiaAnnullata;
    @XmlElement(name = "IdDoc", required = true)
    protected String idDoc;
    @XmlElement(name = "NumCopia", required = true)
    protected String numCopia;
    @XmlElement(name = "RegPrimaria", required = true)
    protected RegPrimaria regPrimaria;
    @XmlElement(name = "DtReg", required = true)
    protected String dtReg;
    @XmlElement(name = "RegSecondaria", required = true)
    protected RegSecondaria regSecondaria;
    @XmlElement(name = "RegEmergenza", required = true)
    protected RegEmergenza regEmergenza;
    @XmlElement(name = "DtArrivo", required = true)
    protected String dtArrivo;
    @XmlElement(name = "Oggetto", required = true)
    protected String oggetto;
    @XmlElement(name = "Mittenti", required = true)
    protected String mittenti;
    @XmlElement(name = "Destinatari", required = true)
    protected String destinatari;
    @XmlElement(name = "UoAssegnataria", required = true)
    protected String uoAssegnataria;
    @XmlElement(name = "IdIndice", required = true)
    protected String idIndice;
    @XmlElement(name = "DesIndice", required = true)
    protected String desIndice;
    @XmlElement(name = "AnnoFasc", required = true)
    protected String annoFasc;
    @XmlElement(name = "Titolo", required = true)
    protected String titolo;
    @XmlElement(name = "Classe", required = true)
    protected String classe;
    @XmlElement(name = "SottoClasse", required = true)
    protected String sottoClasse;
    @XmlElement(name = "Livello4", required = true)
    protected String livello4;
    @XmlElement(name = "Livello5", required = true)
    protected String livello5;
    @XmlElement(name = "ProgrFasc", required = true)
    protected String progrFasc;
    @XmlElement(name = "IdFascicolo", required = true)
    protected String idFascicolo;
    @XmlElement(name = "NumSottofasc", required = true)
    protected String numSottofasc;
    @XmlElement(name = "OggettoFasc", required = true)
    protected String oggettoFasc;
    @XmlElement(name = "DtAperturaFasc", required = true)
    protected String dtAperturaFasc;
    @XmlElement(name = "DtChiusuraFasc", required = true)
    protected String dtChiusuraFasc;
    @XmlElement(name = "OggettoSottofasc", required = true)
    protected String oggettoSottofasc;
    @XmlElement(name = "DtAperturaSottofasc", required = true)
    protected String dtAperturaSottofasc;
    @XmlElement(name = "DtChiusuraSottofasc", required = true)
    protected String dtChiusuraSottofasc;
    @XmlElement(name = "NroAlleg", required = true)
    protected String nroAlleg;
    @XmlElement(name = "RifProv", required = true)
    protected String rifProv;
    @XmlElement(name = "ProtProv", required = true)
    protected String protProv;
    @XmlElement(name = "DtProv", required = true)
    protected String dtProv;
    @XmlElement(name = "DocPrec", required = true)
    protected DocPrec docPrec;
    @XmlElement(name = "Nominativo")
    protected List<Nominativo> nominativo;

    /**
     * Gets the value of the tipoReg property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipoReg() {
        return tipoReg;
    }

    /**
     * Sets the value of the tipoReg property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipoReg(String value) {
        this.tipoReg = value;
    }

    /**
     * Gets the value of the flgPresoIncarico property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFlgPresoIncarico() {
        return flgPresoIncarico;
    }

    /**
     * Sets the value of the flgPresoIncarico property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFlgPresoIncarico(String value) {
        this.flgPresoIncarico = value;
    }

    /**
     * Gets the value of the flgEvd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFlgEvd() {
        return flgEvd;
    }

    /**
     * Sets the value of the flgEvd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFlgEvd(String value) {
        this.flgEvd = value;
    }

    /**
     * Gets the value of the flgRsv property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFlgRsv() {
        return flgRsv;
    }

    /**
     * Sets the value of the flgRsv property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFlgRsv(String value) {
        this.flgRsv = value;
    }

    /**
     * Gets the value of the flgScartato property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFlgScartato() {
        return flgScartato;
    }

    /**
     * Sets the value of the flgScartato property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFlgScartato(String value) {
        this.flgScartato = value;
    }

    /**
     * Gets the value of the flgRegAnnullata property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFlgRegAnnullata() {
        return flgRegAnnullata;
    }

    /**
     * Sets the value of the flgRegAnnullata property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFlgRegAnnullata(String value) {
        this.flgRegAnnullata = value;
    }

    /**
     * Gets the value of the flgCopiaAnnullata property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFlgCopiaAnnullata() {
        return flgCopiaAnnullata;
    }

    /**
     * Sets the value of the flgCopiaAnnullata property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFlgCopiaAnnullata(String value) {
        this.flgCopiaAnnullata = value;
    }

    /**
     * Gets the value of the idDoc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdDoc() {
        return idDoc;
    }

    /**
     * Sets the value of the idDoc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdDoc(String value) {
        this.idDoc = value;
    }

    /**
     * Gets the value of the numCopia property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumCopia() {
        return numCopia;
    }

    /**
     * Sets the value of the numCopia property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumCopia(String value) {
        this.numCopia = value;
    }

    /**
     * Gets the value of the regPrimaria property.
     * 
     * @return
     *     possible object is
     *     {@link RegPrimaria }
     *     
     */
    public RegPrimaria getRegPrimaria() {
        return regPrimaria;
    }

    /**
     * Sets the value of the regPrimaria property.
     * 
     * @param value
     *     allowed object is
     *     {@link RegPrimaria }
     *     
     */
    public void setRegPrimaria(RegPrimaria value) {
        this.regPrimaria = value;
    }

    /**
     * Gets the value of the dtReg property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDtReg() {
        return dtReg;
    }

    /**
     * Sets the value of the dtReg property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDtReg(String value) {
        this.dtReg = value;
    }

    /**
     * Gets the value of the regSecondaria property.
     * 
     * @return
     *     possible object is
     *     {@link RegSecondaria }
     *     
     */
    public RegSecondaria getRegSecondaria() {
        return regSecondaria;
    }

    /**
     * Sets the value of the regSecondaria property.
     * 
     * @param value
     *     allowed object is
     *     {@link RegSecondaria }
     *     
     */
    public void setRegSecondaria(RegSecondaria value) {
        this.regSecondaria = value;
    }

    /**
     * Gets the value of the regEmergenza property.
     * 
     * @return
     *     possible object is
     *     {@link RegEmergenza }
     *     
     */
    public RegEmergenza getRegEmergenza() {
        return regEmergenza;
    }

    /**
     * Sets the value of the regEmergenza property.
     * 
     * @param value
     *     allowed object is
     *     {@link RegEmergenza }
     *     
     */
    public void setRegEmergenza(RegEmergenza value) {
        this.regEmergenza = value;
    }

    /**
     * Gets the value of the dtArrivo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDtArrivo() {
        return dtArrivo;
    }

    /**
     * Sets the value of the dtArrivo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDtArrivo(String value) {
        this.dtArrivo = value;
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
     * Gets the value of the mittenti property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMittenti() {
        return mittenti;
    }

    /**
     * Sets the value of the mittenti property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMittenti(String value) {
        this.mittenti = value;
    }

    /**
     * Gets the value of the destinatari property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDestinatari() {
        return destinatari;
    }

    /**
     * Sets the value of the destinatari property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDestinatari(String value) {
        this.destinatari = value;
    }

    /**
     * Gets the value of the uoAssegnataria property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUoAssegnataria() {
        return uoAssegnataria;
    }

    /**
     * Sets the value of the uoAssegnataria property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUoAssegnataria(String value) {
        this.uoAssegnataria = value;
    }

    /**
     * Gets the value of the idIndice property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdIndice() {
        return idIndice;
    }

    /**
     * Sets the value of the idIndice property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdIndice(String value) {
        this.idIndice = value;
    }

    /**
     * Gets the value of the desIndice property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDesIndice() {
        return desIndice;
    }

    /**
     * Sets the value of the desIndice property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDesIndice(String value) {
        this.desIndice = value;
    }

    /**
     * Gets the value of the annoFasc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAnnoFasc() {
        return annoFasc;
    }

    /**
     * Sets the value of the annoFasc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAnnoFasc(String value) {
        this.annoFasc = value;
    }

    /**
     * Gets the value of the titolo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTitolo() {
        return titolo;
    }

    /**
     * Sets the value of the titolo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTitolo(String value) {
        this.titolo = value;
    }

    /**
     * Gets the value of the classe property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClasse() {
        return classe;
    }

    /**
     * Sets the value of the classe property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClasse(String value) {
        this.classe = value;
    }

    /**
     * Gets the value of the sottoClasse property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSottoClasse() {
        return sottoClasse;
    }

    /**
     * Sets the value of the sottoClasse property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSottoClasse(String value) {
        this.sottoClasse = value;
    }

    /**
     * Gets the value of the livello4 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLivello4() {
        return livello4;
    }

    /**
     * Sets the value of the livello4 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLivello4(String value) {
        this.livello4 = value;
    }

    /**
     * Gets the value of the livello5 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLivello5() {
        return livello5;
    }

    /**
     * Sets the value of the livello5 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLivello5(String value) {
        this.livello5 = value;
    }

    /**
     * Gets the value of the progrFasc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProgrFasc() {
        return progrFasc;
    }

    /**
     * Sets the value of the progrFasc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProgrFasc(String value) {
        this.progrFasc = value;
    }

    /**
     * Gets the value of the idFascicolo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdFascicolo() {
        return idFascicolo;
    }

    /**
     * Sets the value of the idFascicolo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdFascicolo(String value) {
        this.idFascicolo = value;
    }

    /**
     * Gets the value of the numSottofasc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumSottofasc() {
        return numSottofasc;
    }

    /**
     * Sets the value of the numSottofasc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumSottofasc(String value) {
        this.numSottofasc = value;
    }

    /**
     * Gets the value of the oggettoFasc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOggettoFasc() {
        return oggettoFasc;
    }

    /**
     * Sets the value of the oggettoFasc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOggettoFasc(String value) {
        this.oggettoFasc = value;
    }

    /**
     * Gets the value of the dtAperturaFasc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDtAperturaFasc() {
        return dtAperturaFasc;
    }

    /**
     * Sets the value of the dtAperturaFasc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDtAperturaFasc(String value) {
        this.dtAperturaFasc = value;
    }

    /**
     * Gets the value of the dtChiusuraFasc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDtChiusuraFasc() {
        return dtChiusuraFasc;
    }

    /**
     * Sets the value of the dtChiusuraFasc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDtChiusuraFasc(String value) {
        this.dtChiusuraFasc = value;
    }

    /**
     * Gets the value of the oggettoSottofasc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOggettoSottofasc() {
        return oggettoSottofasc;
    }

    /**
     * Sets the value of the oggettoSottofasc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOggettoSottofasc(String value) {
        this.oggettoSottofasc = value;
    }

    /**
     * Gets the value of the dtAperturaSottofasc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDtAperturaSottofasc() {
        return dtAperturaSottofasc;
    }

    /**
     * Sets the value of the dtAperturaSottofasc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDtAperturaSottofasc(String value) {
        this.dtAperturaSottofasc = value;
    }

    /**
     * Gets the value of the dtChiusuraSottofasc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDtChiusuraSottofasc() {
        return dtChiusuraSottofasc;
    }

    /**
     * Sets the value of the dtChiusuraSottofasc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDtChiusuraSottofasc(String value) {
        this.dtChiusuraSottofasc = value;
    }

    /**
     * Gets the value of the nroAlleg property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNroAlleg() {
        return nroAlleg;
    }

    /**
     * Sets the value of the nroAlleg property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNroAlleg(String value) {
        this.nroAlleg = value;
    }

    /**
     * Gets the value of the rifProv property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRifProv() {
        return rifProv;
    }

    /**
     * Sets the value of the rifProv property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRifProv(String value) {
        this.rifProv = value;
    }

    /**
     * Gets the value of the protProv property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProtProv() {
        return protProv;
    }

    /**
     * Sets the value of the protProv property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProtProv(String value) {
        this.protProv = value;
    }

    /**
     * Gets the value of the dtProv property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDtProv() {
        return dtProv;
    }

    /**
     * Sets the value of the dtProv property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDtProv(String value) {
        this.dtProv = value;
    }

    /**
     * Gets the value of the docPrec property.
     * 
     * @return
     *     possible object is
     *     {@link DocPrec }
     *     
     */
    public DocPrec getDocPrec() {
        return docPrec;
    }

    /**
     * Sets the value of the docPrec property.
     * 
     * @param value
     *     allowed object is
     *     {@link DocPrec }
     *     
     */
    public void setDocPrec(DocPrec value) {
        this.docPrec = value;
    }

    /**
     * Gets the value of the nominativo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the nominativo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNominativo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Nominativo }
     * 
     * 
     */
    public List<Nominativo> getNominativo() {
        if (nominativo == null) {
            nominativo = new ArrayList<Nominativo>();
        }
        return this.nominativo;
    }

}
