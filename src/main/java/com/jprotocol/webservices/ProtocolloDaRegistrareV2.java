
package com.jprotocol.webservices;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for protocolloDaRegistrareV2 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="protocolloDaRegistrareV2">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="allegati" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="catDoc" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="codTit" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="codUffMittInterno" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dataFinePub" type="{http://WebServices.jprotocol.com/}date" minOccurs="0"/>
 *         &lt;element name="dataInPub" type="{http://WebServices.jprotocol.com/}date" minOccurs="0"/>
 *         &lt;element name="descrizioneDocumento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="estensioneFile" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fileAllegati" type="{http://WebServices.jprotocol.com/}allegato" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="fileDocumento" type="{http://www.w3.org/2001/XMLSchema}base64Binary" minOccurs="0"/>
 *         &lt;element name="fileHASH" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="gradoRiservatezza" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="listaCorrispondenti" type="{http://WebServices.jprotocol.com/}mittDestEstesi" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="metodoSottomissione" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nomeFile" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="note" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="oggetto" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="protocollatore" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="serieRep" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tipoDoc" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="URL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="uffAss" type="{http://WebServices.jprotocol.com/}ufficiAssegnati" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="verso" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "protocolloDaRegistrareV2", propOrder = {
    "allegati",
    "catDoc",
    "codTit",
    "codUffMittInterno",
    "dataFinePub",
    "dataInPub",
    "descrizioneDocumento",
    "estensioneFile",
    "fileAllegati",
    "fileDocumento",
    "fileHASH",
    "gradoRiservatezza",
    "listaCorrispondenti",
    "metodoSottomissione",
    "nomeFile",
    "note",
    "oggetto",
    "protocollatore",
    "serieRep",
    "tipoDoc",
    "url",
    "uffAss",
    "verso"
})
public class ProtocolloDaRegistrareV2 {

    protected boolean allegati;
    protected int catDoc;
    protected String codTit;
    protected String codUffMittInterno;
    protected Date dataFinePub;
    protected Date dataInPub;
    protected String descrizioneDocumento;
    protected String estensioneFile;
    @XmlElement(nillable = true)
    protected List<Allegato> fileAllegati;
    protected byte[] fileDocumento;
    protected String fileHASH;
    protected int gradoRiservatezza;
    @XmlElement(nillable = true)
    protected List<MittDestEstesi> listaCorrispondenti;
    protected String metodoSottomissione;
    protected String nomeFile;
    protected String note;
    protected String oggetto;
    protected String protocollatore;
    protected String serieRep;
    protected int tipoDoc;
    @XmlElement(name = "URL")
    protected String url;
    @XmlElement(nillable = true)
    protected List<UfficiAssegnati> uffAss;
    protected String verso;

    /**
     * Gets the value of the allegati property.
     * 
     */
    public boolean isAllegati() {
        return allegati;
    }

    /**
     * Sets the value of the allegati property.
     * 
     */
    public void setAllegati(boolean value) {
        this.allegati = value;
    }

    /**
     * Gets the value of the catDoc property.
     * 
     */
    public int getCatDoc() {
        return catDoc;
    }

    /**
     * Sets the value of the catDoc property.
     * 
     */
    public void setCatDoc(int value) {
        this.catDoc = value;
    }

    /**
     * Gets the value of the codTit property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodTit() {
        return codTit;
    }

    /**
     * Sets the value of the codTit property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodTit(String value) {
        this.codTit = value;
    }

    /**
     * Gets the value of the codUffMittInterno property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodUffMittInterno() {
        return codUffMittInterno;
    }

    /**
     * Sets the value of the codUffMittInterno property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodUffMittInterno(String value) {
        this.codUffMittInterno = value;
    }

    /**
     * Gets the value of the dataFinePub property.
     * 
     * @return
     *     possible object is
     *     {@link Date }
     *     
     */
    public Date getDataFinePub() {
        return dataFinePub;
    }

    /**
     * Sets the value of the dataFinePub property.
     * 
     * @param value
     *     allowed object is
     *     {@link Date }
     *     
     */
    public void setDataFinePub(Date value) {
        this.dataFinePub = value;
    }

    /**
     * Gets the value of the dataInPub property.
     * 
     * @return
     *     possible object is
     *     {@link Date }
     *     
     */
    public Date getDataInPub() {
        return dataInPub;
    }

    /**
     * Sets the value of the dataInPub property.
     * 
     * @param value
     *     allowed object is
     *     {@link Date }
     *     
     */
    public void setDataInPub(Date value) {
        this.dataInPub = value;
    }

    /**
     * Gets the value of the descrizioneDocumento property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescrizioneDocumento() {
        return descrizioneDocumento;
    }

    /**
     * Sets the value of the descrizioneDocumento property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescrizioneDocumento(String value) {
        this.descrizioneDocumento = value;
    }

    /**
     * Gets the value of the estensioneFile property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEstensioneFile() {
        return estensioneFile;
    }

    /**
     * Sets the value of the estensioneFile property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEstensioneFile(String value) {
        this.estensioneFile = value;
    }

    /**
     * Gets the value of the fileAllegati property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the fileAllegati property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFileAllegati().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Allegato }
     * 
     * 
     */
    public List<Allegato> getFileAllegati() {
        if (fileAllegati == null) {
            fileAllegati = new ArrayList<Allegato>();
        }
        return this.fileAllegati;
    }

    /**
     * Gets the value of the fileDocumento property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getFileDocumento() {
        return fileDocumento;
    }

    /**
     * Sets the value of the fileDocumento property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setFileDocumento(byte[] value) {
        this.fileDocumento = ((byte[]) value);
    }

    /**
     * Gets the value of the fileHASH property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFileHASH() {
        return fileHASH;
    }

    /**
     * Sets the value of the fileHASH property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFileHASH(String value) {
        this.fileHASH = value;
    }

    /**
     * Gets the value of the gradoRiservatezza property.
     * 
     */
    public int getGradoRiservatezza() {
        return gradoRiservatezza;
    }

    /**
     * Sets the value of the gradoRiservatezza property.
     * 
     */
    public void setGradoRiservatezza(int value) {
        this.gradoRiservatezza = value;
    }

    /**
     * Gets the value of the listaCorrispondenti property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listaCorrispondenti property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getListaCorrispondenti().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MittDestEstesi }
     * 
     * 
     */
    public List<MittDestEstesi> getListaCorrispondenti() {
        if (listaCorrispondenti == null) {
            listaCorrispondenti = new ArrayList<MittDestEstesi>();
        }
        return this.listaCorrispondenti;
    }

    /**
     * Gets the value of the metodoSottomissione property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMetodoSottomissione() {
        return metodoSottomissione;
    }

    /**
     * Sets the value of the metodoSottomissione property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMetodoSottomissione(String value) {
        this.metodoSottomissione = value;
    }

    /**
     * Gets the value of the nomeFile property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNomeFile() {
        return nomeFile;
    }

    /**
     * Sets the value of the nomeFile property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNomeFile(String value) {
        this.nomeFile = value;
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
     * Gets the value of the protocollatore property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProtocollatore() {
        return protocollatore;
    }

    /**
     * Sets the value of the protocollatore property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProtocollatore(String value) {
        this.protocollatore = value;
    }

    /**
     * Gets the value of the serieRep property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSerieRep() {
        return serieRep;
    }

    /**
     * Sets the value of the serieRep property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSerieRep(String value) {
        this.serieRep = value;
    }

    /**
     * Gets the value of the tipoDoc property.
     * 
     */
    public int getTipoDoc() {
        return tipoDoc;
    }

    /**
     * Sets the value of the tipoDoc property.
     * 
     */
    public void setTipoDoc(int value) {
        this.tipoDoc = value;
    }

    /**
     * Gets the value of the url property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getURL() {
        return url;
    }

    /**
     * Sets the value of the url property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setURL(String value) {
        this.url = value;
    }

    /**
     * Gets the value of the uffAss property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the uffAss property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUffAss().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link UfficiAssegnati }
     * 
     * 
     */
    public List<UfficiAssegnati> getUffAss() {
        if (uffAss == null) {
            uffAss = new ArrayList<UfficiAssegnati>();
        }
        return this.uffAss;
    }

    /**
     * Gets the value of the verso property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVerso() {
        return verso;
    }

    /**
     * Sets the value of the verso property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVerso(String value) {
        this.verso = value;
    }

}
