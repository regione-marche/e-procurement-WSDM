//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-833 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.11.29 at 03:01:05 PM CET 
//


package it.titulus.docpublished;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{}visibilita" minOccurs="0"/>
 *         &lt;element ref="{}prot_differito" minOccurs="0"/>
 *         &lt;element ref="{}repertorio" minOccurs="0"/>
 *         &lt;element ref="{}autore" minOccurs="0"/>
 *         &lt;element ref="{}minuta" minOccurs="0"/>
 *         &lt;element ref="{}oggetto"/>
 *         &lt;element ref="{}tipologia" minOccurs="0"/>
 *         &lt;element ref="{}conservazione" minOccurs="0"/>
 *         &lt;element ref="{}mezzo_trasmissione" minOccurs="0"/>
 *         &lt;element ref="{}classif" minOccurs="0"/>
 *         &lt;element ref="{}note" minOccurs="0"/>
 *         &lt;element ref="{}riferimenti" minOccurs="0"/>
 *         &lt;element ref="{}xlink" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{}keywords" minOccurs="0"/>
 *         &lt;element ref="{}allegato" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{}voce_indice" minOccurs="0"/>
 *         &lt;element ref="{}rif_interni" minOccurs="0"/>
 *         &lt;element ref="{}rif_esterni" minOccurs="0"/>
 *         &lt;element ref="{}originale" minOccurs="0"/>
 *         &lt;element ref="{}extra" minOccurs="0"/>
 *         &lt;element ref="{}link_interno" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{}info_conservazione" minOccurs="0"/>
 *         &lt;element ref="{}postit" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="tipo" use="required">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
 *             &lt;enumeration value="arrivo"/>
 *             &lt;enumeration value="partenza"/>
 *             &lt;enumeration value="interno"/>
 *             &lt;enumeration value="varie"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="nrecord" type="{http://www.w3.org/2001/XMLSchema}string" fixed="." />
 *       &lt;attribute name="agli_atti" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="sensibile">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
 *             &lt;enumeration value="true"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="personale">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
 *             &lt;enumeration value="si"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="annullato" default="no">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
 *             &lt;enumeration value="si"/>
 *             &lt;enumeration value="no"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="scarto" default="99">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
 *             &lt;enumeration value="01"/>
 *             &lt;enumeration value="05"/>
 *             &lt;enumeration value="10"/>
 *             &lt;enumeration value="99"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="data_valutazione_scarto" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="bozza">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
 *             &lt;enumeration value="si"/>
 *             &lt;enumeration value="no"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="data_seduta" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="applicativo_produttore_docid" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "visibilita",
    "protDifferito",
    "repertorio",
    "autore",
    "minuta",
    "oggetto",
    "tipologia",
    "conservazione",
    "mezzoTrasmissione",
    "classif",
    "note",
    "riferimenti",
    "xlink",
    "keywords",
    "allegato",
    "voceIndice",
    "rifInterni",
    "rifEsterni",
    "originale",
    "extra",
    "linkInterno",
    "infoConservazione",
    "postit"
})
@XmlRootElement(name = "doc")
public class Doc {

    protected Visibilita visibilita;
    @XmlElement(name = "prot_differito")
    protected ProtDifferito protDifferito;
    protected Repertorio repertorio;
    protected Autore autore;
    protected Minuta minuta;
    @XmlElement(required = true)
    protected Oggetto oggetto;
    protected Tipologia tipologia;
    protected Conservazione conservazione;
    @XmlElement(name = "mezzo_trasmissione")
    protected MezzoTrasmissione mezzoTrasmissione;
    protected Classif classif;
    protected Note note;
    protected Riferimenti riferimenti;
    protected List<Xlink> xlink;
    protected Keywords keywords;
    protected List<Allegato> allegato;
    @XmlElement(name = "voce_indice")
    protected VoceIndice voceIndice;
    @XmlElement(name = "rif_interni")
    protected RifInterni rifInterni;
    @XmlElement(name = "rif_esterni")
    protected RifEsterni rifEsterni;
    protected Originale originale;
    protected Extra extra;
    @XmlElement(name = "link_interno")
    protected List<LinkInterno> linkInterno;
    @XmlElement(name = "info_conservazione")
    protected InfoConservazione infoConservazione;
    protected List<Postit> postit;
    @XmlAttribute(required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String tipo;
    @XmlAttribute
    protected String nrecord;
    @XmlAttribute(name = "agli_atti")
    protected String agliAtti;
    @XmlAttribute
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String sensibile;
    @XmlAttribute
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String personale;
    @XmlAttribute
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String annullato;
    @XmlAttribute
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String scarto;
    @XmlAttribute(name = "data_valutazione_scarto")
    protected String dataValutazioneScarto;
    @XmlAttribute
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String bozza;
    @XmlAttribute(name = "data_seduta")
    protected String dataSeduta;
    @XmlAttribute(name = "applicativo_produttore_docid")
    protected String applicativoProduttoreDocid;

    /**
     * Gets the value of the visibilita property.
     * 
     * @return
     *     possible object is
     *     {@link Visibilita }
     *     
     */
    public Visibilita getVisibilita() {
        return visibilita;
    }

    /**
     * Sets the value of the visibilita property.
     * 
     * @param value
     *     allowed object is
     *     {@link Visibilita }
     *     
     */
    public void setVisibilita(Visibilita value) {
        this.visibilita = value;
    }

    /**
     * Gets the value of the protDifferito property.
     * 
     * @return
     *     possible object is
     *     {@link ProtDifferito }
     *     
     */
    public ProtDifferito getProtDifferito() {
        return protDifferito;
    }

    /**
     * Sets the value of the protDifferito property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProtDifferito }
     *     
     */
    public void setProtDifferito(ProtDifferito value) {
        this.protDifferito = value;
    }

    /**
     * Gets the value of the repertorio property.
     * 
     * @return
     *     possible object is
     *     {@link Repertorio }
     *     
     */
    public Repertorio getRepertorio() {
        return repertorio;
    }

    /**
     * Sets the value of the repertorio property.
     * 
     * @param value
     *     allowed object is
     *     {@link Repertorio }
     *     
     */
    public void setRepertorio(Repertorio value) {
        this.repertorio = value;
    }

    /**
     * Gets the value of the autore property.
     * 
     * @return
     *     possible object is
     *     {@link Autore }
     *     
     */
    public Autore getAutore() {
        return autore;
    }

    /**
     * Sets the value of the autore property.
     * 
     * @param value
     *     allowed object is
     *     {@link Autore }
     *     
     */
    public void setAutore(Autore value) {
        this.autore = value;
    }

    /**
     * Gets the value of the minuta property.
     * 
     * @return
     *     possible object is
     *     {@link Minuta }
     *     
     */
    public Minuta getMinuta() {
        return minuta;
    }

    /**
     * Sets the value of the minuta property.
     * 
     * @param value
     *     allowed object is
     *     {@link Minuta }
     *     
     */
    public void setMinuta(Minuta value) {
        this.minuta = value;
    }

    /**
     * Gets the value of the oggetto property.
     * 
     * @return
     *     possible object is
     *     {@link Oggetto }
     *     
     */
    public Oggetto getOggetto() {
        return oggetto;
    }

    /**
     * Sets the value of the oggetto property.
     * 
     * @param value
     *     allowed object is
     *     {@link Oggetto }
     *     
     */
    public void setOggetto(Oggetto value) {
        this.oggetto = value;
    }

    /**
     * Gets the value of the tipologia property.
     * 
     * @return
     *     possible object is
     *     {@link Tipologia }
     *     
     */
    public Tipologia getTipologia() {
        return tipologia;
    }

    /**
     * Sets the value of the tipologia property.
     * 
     * @param value
     *     allowed object is
     *     {@link Tipologia }
     *     
     */
    public void setTipologia(Tipologia value) {
        this.tipologia = value;
    }

    /**
     * Gets the value of the conservazione property.
     * 
     * @return
     *     possible object is
     *     {@link Conservazione }
     *     
     */
    public Conservazione getConservazione() {
        return conservazione;
    }

    /**
     * Sets the value of the conservazione property.
     * 
     * @param value
     *     allowed object is
     *     {@link Conservazione }
     *     
     */
    public void setConservazione(Conservazione value) {
        this.conservazione = value;
    }

    /**
     * Gets the value of the mezzoTrasmissione property.
     * 
     * @return
     *     possible object is
     *     {@link MezzoTrasmissione }
     *     
     */
    public MezzoTrasmissione getMezzoTrasmissione() {
        return mezzoTrasmissione;
    }

    /**
     * Sets the value of the mezzoTrasmissione property.
     * 
     * @param value
     *     allowed object is
     *     {@link MezzoTrasmissione }
     *     
     */
    public void setMezzoTrasmissione(MezzoTrasmissione value) {
        this.mezzoTrasmissione = value;
    }

    /**
     * Gets the value of the classif property.
     * 
     * @return
     *     possible object is
     *     {@link Classif }
     *     
     */
    public Classif getClassif() {
        return classif;
    }

    /**
     * Sets the value of the classif property.
     * 
     * @param value
     *     allowed object is
     *     {@link Classif }
     *     
     */
    public void setClassif(Classif value) {
        this.classif = value;
    }

    /**
     * Gets the value of the note property.
     * 
     * @return
     *     possible object is
     *     {@link Note }
     *     
     */
    public Note getNote() {
        return note;
    }

    /**
     * Sets the value of the note property.
     * 
     * @param value
     *     allowed object is
     *     {@link Note }
     *     
     */
    public void setNote(Note value) {
        this.note = value;
    }

    /**
     * Gets the value of the riferimenti property.
     * 
     * @return
     *     possible object is
     *     {@link Riferimenti }
     *     
     */
    public Riferimenti getRiferimenti() {
        return riferimenti;
    }

    /**
     * Sets the value of the riferimenti property.
     * 
     * @param value
     *     allowed object is
     *     {@link Riferimenti }
     *     
     */
    public void setRiferimenti(Riferimenti value) {
        this.riferimenti = value;
    }

    /**
     * Gets the value of the xlink property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the xlink property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getXlink().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Xlink }
     * 
     * 
     */
    public List<Xlink> getXlink() {
        if (xlink == null) {
            xlink = new ArrayList<Xlink>();
        }
        return this.xlink;
    }

    /**
     * Gets the value of the keywords property.
     * 
     * @return
     *     possible object is
     *     {@link Keywords }
     *     
     */
    public Keywords getKeywords() {
        return keywords;
    }

    /**
     * Sets the value of the keywords property.
     * 
     * @param value
     *     allowed object is
     *     {@link Keywords }
     *     
     */
    public void setKeywords(Keywords value) {
        this.keywords = value;
    }

    /**
     * Gets the value of the allegato property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the allegato property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAllegato().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Allegato }
     * 
     * 
     */
    public List<Allegato> getAllegato() {
        if (allegato == null) {
            allegato = new ArrayList<Allegato>();
        }
        return this.allegato;
    }

    /**
     * Gets the value of the voceIndice property.
     * 
     * @return
     *     possible object is
     *     {@link VoceIndice }
     *     
     */
    public VoceIndice getVoceIndice() {
        return voceIndice;
    }

    /**
     * Sets the value of the voceIndice property.
     * 
     * @param value
     *     allowed object is
     *     {@link VoceIndice }
     *     
     */
    public void setVoceIndice(VoceIndice value) {
        this.voceIndice = value;
    }

    /**
     * Gets the value of the rifInterni property.
     * 
     * @return
     *     possible object is
     *     {@link RifInterni }
     *     
     */
    public RifInterni getRifInterni() {
        return rifInterni;
    }

    /**
     * Sets the value of the rifInterni property.
     * 
     * @param value
     *     allowed object is
     *     {@link RifInterni }
     *     
     */
    public void setRifInterni(RifInterni value) {
        this.rifInterni = value;
    }

    /**
     * Gets the value of the rifEsterni property.
     * 
     * @return
     *     possible object is
     *     {@link RifEsterni }
     *     
     */
    public RifEsterni getRifEsterni() {
        return rifEsterni;
    }

    /**
     * Sets the value of the rifEsterni property.
     * 
     * @param value
     *     allowed object is
     *     {@link RifEsterni }
     *     
     */
    public void setRifEsterni(RifEsterni value) {
        this.rifEsterni = value;
    }

    /**
     * Gets the value of the originale property.
     * 
     * @return
     *     possible object is
     *     {@link Originale }
     *     
     */
    public Originale getOriginale() {
        return originale;
    }

    /**
     * Sets the value of the originale property.
     * 
     * @param value
     *     allowed object is
     *     {@link Originale }
     *     
     */
    public void setOriginale(Originale value) {
        this.originale = value;
    }

    /**
     * Gets the value of the extra property.
     * 
     * @return
     *     possible object is
     *     {@link Extra }
     *     
     */
    public Extra getExtra() {
        return extra;
    }

    /**
     * Sets the value of the extra property.
     * 
     * @param value
     *     allowed object is
     *     {@link Extra }
     *     
     */
    public void setExtra(Extra value) {
        this.extra = value;
    }

    /**
     * Gets the value of the linkInterno property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the linkInterno property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLinkInterno().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LinkInterno }
     * 
     * 
     */
    public List<LinkInterno> getLinkInterno() {
        if (linkInterno == null) {
            linkInterno = new ArrayList<LinkInterno>();
        }
        return this.linkInterno;
    }

    /**
     * Gets the value of the infoConservazione property.
     * 
     * @return
     *     possible object is
     *     {@link InfoConservazione }
     *     
     */
    public InfoConservazione getInfoConservazione() {
        return infoConservazione;
    }

    /**
     * Sets the value of the infoConservazione property.
     * 
     * @param value
     *     allowed object is
     *     {@link InfoConservazione }
     *     
     */
    public void setInfoConservazione(InfoConservazione value) {
        this.infoConservazione = value;
    }

    /**
     * Gets the value of the postit property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the postit property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPostit().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Postit }
     * 
     * 
     */
    public List<Postit> getPostit() {
        if (postit == null) {
            postit = new ArrayList<Postit>();
        }
        return this.postit;
    }

    /**
     * Gets the value of the tipo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipo() {
        return tipo;
    }

    /**
     * Sets the value of the tipo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipo(String value) {
        this.tipo = value;
    }

    /**
     * Gets the value of the nrecord property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNrecord() {
        if (nrecord == null) {
            return ".";
        } else {
            return nrecord;
        }
    }

    /**
     * Sets the value of the nrecord property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNrecord(String value) {
        this.nrecord = value;
    }

    /**
     * Gets the value of the agliAtti property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAgliAtti() {
        return agliAtti;
    }

    /**
     * Sets the value of the agliAtti property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAgliAtti(String value) {
        this.agliAtti = value;
    }

    /**
     * Gets the value of the sensibile property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSensibile() {
        return sensibile;
    }

    /**
     * Sets the value of the sensibile property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSensibile(String value) {
        this.sensibile = value;
    }

    /**
     * Gets the value of the personale property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPersonale() {
        return personale;
    }

    /**
     * Sets the value of the personale property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPersonale(String value) {
        this.personale = value;
    }

    /**
     * Gets the value of the annullato property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAnnullato() {
        if (annullato == null) {
            return "no";
        } else {
            return annullato;
        }
    }

    /**
     * Sets the value of the annullato property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAnnullato(String value) {
        this.annullato = value;
    }

    /**
     * Gets the value of the scarto property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getScarto() {
        if (scarto == null) {
            return "99";
        } else {
            return scarto;
        }
    }

    /**
     * Sets the value of the scarto property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setScarto(String value) {
        this.scarto = value;
    }

    /**
     * Gets the value of the dataValutazioneScarto property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDataValutazioneScarto() {
        return dataValutazioneScarto;
    }

    /**
     * Sets the value of the dataValutazioneScarto property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDataValutazioneScarto(String value) {
        this.dataValutazioneScarto = value;
    }

    /**
     * Gets the value of the bozza property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBozza() {
        return bozza;
    }

    /**
     * Sets the value of the bozza property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBozza(String value) {
        this.bozza = value;
    }

    /**
     * Gets the value of the dataSeduta property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDataSeduta() {
        return dataSeduta;
    }

    /**
     * Sets the value of the dataSeduta property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDataSeduta(String value) {
        this.dataSeduta = value;
    }

    /**
     * Gets the value of the applicativoProduttoreDocid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApplicativoProduttoreDocid() {
        return applicativoProduttoreDocid;
    }

    /**
     * Sets the value of the applicativoProduttoreDocid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApplicativoProduttoreDocid(String value) {
        this.applicativoProduttoreDocid = value;
    }

}
