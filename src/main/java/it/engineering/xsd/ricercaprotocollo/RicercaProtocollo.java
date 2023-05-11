//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.10.27 at 02:58:48 PM CEST 
//


package it.engineering.xsd.ricercaprotocollo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "idPostazLavoro",
    "regPrimaria",
    "numCopia",
    "flgTpReg",
    "dtRegDa",
    "dtRegA",
    "regEmerg",
    "dtArrivoDa",
    "dtArrivoA",
    "uoReg",
    "siglaAttoAutProtDiff",
    "annoAttoAutProtDiff",
    "numAttoAutProtDiff",
    "nominativoEsterno",
    "dtProv",
    "rifProv",
    "protProv",
    "uoProv",
    "idTpFis",
    "dtRaccomandataDa",
    "dtRaccomandataA",
    "nroRaccomandata",
    "idTpLog",
    "idSttpLog",
    "idTpAlleg",
    "desAlleg",
    "docPrec",
    "oggetto",
    "uoPresso",
    "uo1Ass",
    "flgClassif",
    "flgFascicolazione",
    "idIndice",
    "classifFascApp",
    "noteCopia"
})
@XmlRootElement(name = "RicercaProtocollo")
public class RicercaProtocollo {

    @XmlAttribute
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String versione;
    @XmlAttribute(name = "xml:lang")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String xmlLang;
    @XmlAttribute(name = "FlgTpRegA")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String flgTpRegA;
    @XmlAttribute(name = "FlgClassifA")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String flgClassifA;
    @XmlAttribute(name = "FlgFascicolazioneA")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String flgFascicolazioneA;
    @XmlElement(name = "IdPostazLavoro", required = true)
    protected String idPostazLavoro;
    @XmlElement(name = "RegPrimaria")
    protected RegPrimaria regPrimaria;
    @XmlElement(name = "NumCopia")
    protected String numCopia;
    @XmlElement(name = "FlgTpReg")
    protected String flgTpReg;
    @XmlElement(name = "DtRegDa")
    protected String dtRegDa;
    @XmlElement(name = "DtRegA")
    protected String dtRegA;
    @XmlElement(name = "RegEmerg")
    protected RegEmerg regEmerg;
    @XmlElement(name = "DtArrivoDa")
    protected String dtArrivoDa;
    @XmlElement(name = "DtArrivoA")
    protected String dtArrivoA;
    @XmlElement(name = "UOReg")
    protected UOReg uoReg;
    @XmlElement(name = "SiglaAttoAutProtDiff")
    protected String siglaAttoAutProtDiff;
    @XmlElement(name = "AnnoAttoAutProtDiff")
    protected String annoAttoAutProtDiff;
    @XmlElement(name = "NumAttoAutProtDiff")
    protected String numAttoAutProtDiff;
    @XmlElement(name = "NominativoEsterno")
    protected NominativoEsterno nominativoEsterno;
    @XmlElement(name = "DtProv")
    protected String dtProv;
    @XmlElement(name = "RifProv")
    protected String rifProv;
    @XmlElement(name = "ProtProv")
    protected String protProv;
    @XmlElement(name = "UOProv")
    protected UOProv uoProv;
    @XmlElement(name = "IdTpFis")
    protected String idTpFis;
    @XmlElement(name = "DtRaccomandataDa")
    protected String dtRaccomandataDa;
    @XmlElement(name = "DtRaccomandataA")
    protected String dtRaccomandataA;
    @XmlElement(name = "NroRaccomandata")
    protected String nroRaccomandata;
    @XmlElement(name = "IdTpLog")
    protected String idTpLog;
    @XmlElement(name = "IdSttpLog")
    protected String idSttpLog;
    @XmlElement(name = "IdTpAlleg")
    protected String idTpAlleg;
    @XmlElement(name = "DesAlleg")
    protected String desAlleg;
    @XmlElement(name = "DocPrec")
    protected DocPrec docPrec;
    @XmlElement(name = "Oggetto")
    protected String oggetto;
    @XmlElement(name = "UOPresso")
    protected UOPresso uoPresso;
    @XmlElement(name = "UO1Ass")
    protected UO1Ass uo1Ass;
    @XmlElement(name = "FlgClassif")
    protected String flgClassif;
    @XmlElement(name = "FlgFascicolazione")
    protected String flgFascicolazione;
    @XmlElement(name = "IdIndice")
    protected String idIndice;
    @XmlElement(name = "Classif_FascApp")
    protected ClassifFascApp classifFascApp;
    @XmlElement(name = "NoteCopia")
    protected String noteCopia;

    /**
     * Gets the value of the versione property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVersione() {
        if (versione == null) {
            return "2005-01-31";
        } else {
            return versione;
        }
    }

    /**
     * Sets the value of the versione property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVersione(String value) {
        this.versione = value;
    }

    /**
     * Gets the value of the xmlLang property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getXmlLang() {
        if (xmlLang == null) {
            return "it";
        } else {
            return xmlLang;
        }
    }

    /**
     * Sets the value of the xmlLang property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setXmlLang(String value) {
        this.xmlLang = value;
    }

    /**
     * Gets the value of the flgTpRegA property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFlgTpRegA() {
        if (flgTpRegA == null) {
            return "T";
        } else {
            return flgTpRegA;
        }
    }

    /**
     * Sets the value of the flgTpRegA property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFlgTpRegA(String value) {
        this.flgTpRegA = value;
    }

    /**
     * Gets the value of the flgClassifA property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFlgClassifA() {
        if (flgClassifA == null) {
            return "T";
        } else {
            return flgClassifA;
        }
    }

    /**
     * Sets the value of the flgClassifA property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFlgClassifA(String value) {
        this.flgClassifA = value;
    }

    /**
     * Gets the value of the flgFascicolazioneA property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFlgFascicolazioneA() {
        if (flgFascicolazioneA == null) {
            return "T";
        } else {
            return flgFascicolazioneA;
        }
    }

    /**
     * Sets the value of the flgFascicolazioneA property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFlgFascicolazioneA(String value) {
        this.flgFascicolazioneA = value;
    }

    /**
     * Gets the value of the idPostazLavoro property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdPostazLavoro() {
        return idPostazLavoro;
    }

    /**
     * Sets the value of the idPostazLavoro property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdPostazLavoro(String value) {
        this.idPostazLavoro = value;
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
     * Gets the value of the flgTpReg property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFlgTpReg() {
        return flgTpReg;
    }

    /**
     * Sets the value of the flgTpReg property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFlgTpReg(String value) {
        this.flgTpReg = value;
    }

    /**
     * Gets the value of the dtRegDa property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDtRegDa() {
        return dtRegDa;
    }

    /**
     * Sets the value of the dtRegDa property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDtRegDa(String value) {
        this.dtRegDa = value;
    }

    /**
     * Gets the value of the dtRegA property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDtRegA() {
        return dtRegA;
    }

    /**
     * Sets the value of the dtRegA property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDtRegA(String value) {
        this.dtRegA = value;
    }

    /**
     * Gets the value of the regEmerg property.
     * 
     * @return
     *     possible object is
     *     {@link RegEmerg }
     *     
     */
    public RegEmerg getRegEmerg() {
        return regEmerg;
    }

    /**
     * Sets the value of the regEmerg property.
     * 
     * @param value
     *     allowed object is
     *     {@link RegEmerg }
     *     
     */
    public void setRegEmerg(RegEmerg value) {
        this.regEmerg = value;
    }

    /**
     * Gets the value of the dtArrivoDa property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDtArrivoDa() {
        return dtArrivoDa;
    }

    /**
     * Sets the value of the dtArrivoDa property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDtArrivoDa(String value) {
        this.dtArrivoDa = value;
    }

    /**
     * Gets the value of the dtArrivoA property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDtArrivoA() {
        return dtArrivoA;
    }

    /**
     * Sets the value of the dtArrivoA property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDtArrivoA(String value) {
        this.dtArrivoA = value;
    }

    /**
     * Gets the value of the uoReg property.
     * 
     * @return
     *     possible object is
     *     {@link UOReg }
     *     
     */
    public UOReg getUOReg() {
        return uoReg;
    }

    /**
     * Sets the value of the uoReg property.
     * 
     * @param value
     *     allowed object is
     *     {@link UOReg }
     *     
     */
    public void setUOReg(UOReg value) {
        this.uoReg = value;
    }

    /**
     * Gets the value of the siglaAttoAutProtDiff property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSiglaAttoAutProtDiff() {
        return siglaAttoAutProtDiff;
    }

    /**
     * Sets the value of the siglaAttoAutProtDiff property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSiglaAttoAutProtDiff(String value) {
        this.siglaAttoAutProtDiff = value;
    }

    /**
     * Gets the value of the annoAttoAutProtDiff property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAnnoAttoAutProtDiff() {
        return annoAttoAutProtDiff;
    }

    /**
     * Sets the value of the annoAttoAutProtDiff property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAnnoAttoAutProtDiff(String value) {
        this.annoAttoAutProtDiff = value;
    }

    /**
     * Gets the value of the numAttoAutProtDiff property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumAttoAutProtDiff() {
        return numAttoAutProtDiff;
    }

    /**
     * Sets the value of the numAttoAutProtDiff property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumAttoAutProtDiff(String value) {
        this.numAttoAutProtDiff = value;
    }

    /**
     * Gets the value of the nominativoEsterno property.
     * 
     * @return
     *     possible object is
     *     {@link NominativoEsterno }
     *     
     */
    public NominativoEsterno getNominativoEsterno() {
        return nominativoEsterno;
    }

    /**
     * Sets the value of the nominativoEsterno property.
     * 
     * @param value
     *     allowed object is
     *     {@link NominativoEsterno }
     *     
     */
    public void setNominativoEsterno(NominativoEsterno value) {
        this.nominativoEsterno = value;
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
     * Gets the value of the uoProv property.
     * 
     * @return
     *     possible object is
     *     {@link UOProv }
     *     
     */
    public UOProv getUOProv() {
        return uoProv;
    }

    /**
     * Sets the value of the uoProv property.
     * 
     * @param value
     *     allowed object is
     *     {@link UOProv }
     *     
     */
    public void setUOProv(UOProv value) {
        this.uoProv = value;
    }

    /**
     * Gets the value of the idTpFis property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdTpFis() {
        return idTpFis;
    }

    /**
     * Sets the value of the idTpFis property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdTpFis(String value) {
        this.idTpFis = value;
    }

    /**
     * Gets the value of the dtRaccomandataDa property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDtRaccomandataDa() {
        return dtRaccomandataDa;
    }

    /**
     * Sets the value of the dtRaccomandataDa property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDtRaccomandataDa(String value) {
        this.dtRaccomandataDa = value;
    }

    /**
     * Gets the value of the dtRaccomandataA property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDtRaccomandataA() {
        return dtRaccomandataA;
    }

    /**
     * Sets the value of the dtRaccomandataA property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDtRaccomandataA(String value) {
        this.dtRaccomandataA = value;
    }

    /**
     * Gets the value of the nroRaccomandata property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNroRaccomandata() {
        return nroRaccomandata;
    }

    /**
     * Sets the value of the nroRaccomandata property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNroRaccomandata(String value) {
        this.nroRaccomandata = value;
    }

    /**
     * Gets the value of the idTpLog property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdTpLog() {
        return idTpLog;
    }

    /**
     * Sets the value of the idTpLog property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdTpLog(String value) {
        this.idTpLog = value;
    }

    /**
     * Gets the value of the idSttpLog property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdSttpLog() {
        return idSttpLog;
    }

    /**
     * Sets the value of the idSttpLog property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdSttpLog(String value) {
        this.idSttpLog = value;
    }

    /**
     * Gets the value of the idTpAlleg property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdTpAlleg() {
        return idTpAlleg;
    }

    /**
     * Sets the value of the idTpAlleg property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdTpAlleg(String value) {
        this.idTpAlleg = value;
    }

    /**
     * Gets the value of the desAlleg property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDesAlleg() {
        return desAlleg;
    }

    /**
     * Sets the value of the desAlleg property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDesAlleg(String value) {
        this.desAlleg = value;
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
     * Gets the value of the uoPresso property.
     * 
     * @return
     *     possible object is
     *     {@link UOPresso }
     *     
     */
    public UOPresso getUOPresso() {
        return uoPresso;
    }

    /**
     * Sets the value of the uoPresso property.
     * 
     * @param value
     *     allowed object is
     *     {@link UOPresso }
     *     
     */
    public void setUOPresso(UOPresso value) {
        this.uoPresso = value;
    }

    /**
     * Gets the value of the uo1Ass property.
     * 
     * @return
     *     possible object is
     *     {@link UO1Ass }
     *     
     */
    public UO1Ass getUO1Ass() {
        return uo1Ass;
    }

    /**
     * Sets the value of the uo1Ass property.
     * 
     * @param value
     *     allowed object is
     *     {@link UO1Ass }
     *     
     */
    public void setUO1Ass(UO1Ass value) {
        this.uo1Ass = value;
    }

    /**
     * Gets the value of the flgClassif property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFlgClassif() {
        return flgClassif;
    }

    /**
     * Sets the value of the flgClassif property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFlgClassif(String value) {
        this.flgClassif = value;
    }

    /**
     * Gets the value of the flgFascicolazione property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFlgFascicolazione() {
        return flgFascicolazione;
    }

    /**
     * Sets the value of the flgFascicolazione property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFlgFascicolazione(String value) {
        this.flgFascicolazione = value;
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
     * Gets the value of the classifFascApp property.
     * 
     * @return
     *     possible object is
     *     {@link ClassifFascApp }
     *     
     */
    public ClassifFascApp getClassifFascApp() {
        return classifFascApp;
    }

    /**
     * Sets the value of the classifFascApp property.
     * 
     * @param value
     *     allowed object is
     *     {@link ClassifFascApp }
     *     
     */
    public void setClassifFascApp(ClassifFascApp value) {
        this.classifFascApp = value;
    }

    /**
     * Gets the value of the noteCopia property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNoteCopia() {
        return noteCopia;
    }

    /**
     * Sets the value of the noteCopia property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNoteCopia(String value) {
        this.noteCopia = value;
    }

}
