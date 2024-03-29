//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.10.27 at 02:58:47 PM CEST 
//


package it.engineering.xsd.inserimentofasc;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "idUoIn",
    "flgFSIn",
    "idFascicoloIn",
    "idTitolazioneIn",
    "txtOggIn",
    "noteIn",
    "flgRiservatezzaIn",
    "idUOInCaricoIn",
    "idFascicoloRifIn",
    "annoFascRifIn",
    "titoloFascRifIn",
    "classeFascRifIn",
    "sottoClasseFascRifIn",
    "liv4In",
    "liv5In",
    "progrFascRifIn",
    "numSottofascRifIn",
    "motiviRifIn",
    "paroleChiaveIn",
    "vAttrOpzIn",
    "flgPropagaAclDoc"
})
@XmlRootElement(name = "Dati")
public class Dati {

    @XmlElement(name = "IdUoIn", required = true)
    protected String idUoIn;
    @XmlElement(name = "FlgFSIn", required = true)
    protected String flgFSIn;
    @XmlElement(name = "IdFascicoloIn")
    protected String idFascicoloIn;
    @XmlElement(name = "IdTitolazioneIn")
    protected String idTitolazioneIn;
    @XmlElement(name = "TxtOggIn", required = true)
    protected String txtOggIn;
    @XmlElement(name = "NoteIn")
    protected String noteIn;
    @XmlElement(name = "FlgRiservatezzaIn")
    protected String flgRiservatezzaIn;
    @XmlElement(name = "IdUOInCaricoIn")
    protected String idUOInCaricoIn;
    @XmlElement(name = "IdFascicoloRifIn")
    protected String idFascicoloRifIn;
    @XmlElement(name = "AnnoFascRifIn")
    protected String annoFascRifIn;
    @XmlElement(name = "TitoloFascRifIn")
    protected String titoloFascRifIn;
    @XmlElement(name = "ClasseFascRifIn")
    protected String classeFascRifIn;
    @XmlElement(name = "SottoClasseFascRifIn")
    protected String sottoClasseFascRifIn;
    @XmlElement(name = "Liv4In")
    protected String liv4In;
    @XmlElement(name = "Liv5In")
    protected String liv5In;
    @XmlElement(name = "ProgrFascRifIn")
    protected String progrFascRifIn;
    @XmlElement(name = "NumSottofascRifIn")
    protected String numSottofascRifIn;
    @XmlElement(name = "MotiviRifIn")
    protected String motiviRifIn;
    @XmlElement(name = "ParoleChiaveIn")
    protected String paroleChiaveIn;
    protected VAttrOpzIn vAttrOpzIn;
    @XmlElement(name = "FlgPropagaAclDoc")
    protected String flgPropagaAclDoc;

    /**
     * Gets the value of the idUoIn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdUoIn() {
        return idUoIn;
    }

    /**
     * Sets the value of the idUoIn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdUoIn(String value) {
        this.idUoIn = value;
    }

    /**
     * Gets the value of the flgFSIn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFlgFSIn() {
        return flgFSIn;
    }

    /**
     * Sets the value of the flgFSIn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFlgFSIn(String value) {
        this.flgFSIn = value;
    }

    /**
     * Gets the value of the idFascicoloIn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdFascicoloIn() {
        return idFascicoloIn;
    }

    /**
     * Sets the value of the idFascicoloIn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdFascicoloIn(String value) {
        this.idFascicoloIn = value;
    }

    /**
     * Gets the value of the idTitolazioneIn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdTitolazioneIn() {
        return idTitolazioneIn;
    }

    /**
     * Sets the value of the idTitolazioneIn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdTitolazioneIn(String value) {
        this.idTitolazioneIn = value;
    }

    /**
     * Gets the value of the txtOggIn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTxtOggIn() {
        return txtOggIn;
    }

    /**
     * Sets the value of the txtOggIn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTxtOggIn(String value) {
        this.txtOggIn = value;
    }

    /**
     * Gets the value of the noteIn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNoteIn() {
        return noteIn;
    }

    /**
     * Sets the value of the noteIn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNoteIn(String value) {
        this.noteIn = value;
    }

    /**
     * Gets the value of the flgRiservatezzaIn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFlgRiservatezzaIn() {
        return flgRiservatezzaIn;
    }

    /**
     * Sets the value of the flgRiservatezzaIn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFlgRiservatezzaIn(String value) {
        this.flgRiservatezzaIn = value;
    }

    /**
     * Gets the value of the idUOInCaricoIn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdUOInCaricoIn() {
        return idUOInCaricoIn;
    }

    /**
     * Sets the value of the idUOInCaricoIn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdUOInCaricoIn(String value) {
        this.idUOInCaricoIn = value;
    }

    /**
     * Gets the value of the idFascicoloRifIn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdFascicoloRifIn() {
        return idFascicoloRifIn;
    }

    /**
     * Sets the value of the idFascicoloRifIn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdFascicoloRifIn(String value) {
        this.idFascicoloRifIn = value;
    }

    /**
     * Gets the value of the annoFascRifIn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAnnoFascRifIn() {
        return annoFascRifIn;
    }

    /**
     * Sets the value of the annoFascRifIn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAnnoFascRifIn(String value) {
        this.annoFascRifIn = value;
    }

    /**
     * Gets the value of the titoloFascRifIn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTitoloFascRifIn() {
        return titoloFascRifIn;
    }

    /**
     * Sets the value of the titoloFascRifIn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTitoloFascRifIn(String value) {
        this.titoloFascRifIn = value;
    }

    /**
     * Gets the value of the classeFascRifIn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClasseFascRifIn() {
        return classeFascRifIn;
    }

    /**
     * Sets the value of the classeFascRifIn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClasseFascRifIn(String value) {
        this.classeFascRifIn = value;
    }

    /**
     * Gets the value of the sottoClasseFascRifIn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSottoClasseFascRifIn() {
        return sottoClasseFascRifIn;
    }

    /**
     * Sets the value of the sottoClasseFascRifIn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSottoClasseFascRifIn(String value) {
        this.sottoClasseFascRifIn = value;
    }

    /**
     * Gets the value of the liv4In property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLiv4In() {
        return liv4In;
    }

    /**
     * Sets the value of the liv4In property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLiv4In(String value) {
        this.liv4In = value;
    }

    /**
     * Gets the value of the liv5In property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLiv5In() {
        return liv5In;
    }

    /**
     * Sets the value of the liv5In property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLiv5In(String value) {
        this.liv5In = value;
    }

    /**
     * Gets the value of the progrFascRifIn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProgrFascRifIn() {
        return progrFascRifIn;
    }

    /**
     * Sets the value of the progrFascRifIn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProgrFascRifIn(String value) {
        this.progrFascRifIn = value;
    }

    /**
     * Gets the value of the numSottofascRifIn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumSottofascRifIn() {
        return numSottofascRifIn;
    }

    /**
     * Sets the value of the numSottofascRifIn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumSottofascRifIn(String value) {
        this.numSottofascRifIn = value;
    }

    /**
     * Gets the value of the motiviRifIn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMotiviRifIn() {
        return motiviRifIn;
    }

    /**
     * Sets the value of the motiviRifIn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMotiviRifIn(String value) {
        this.motiviRifIn = value;
    }

    /**
     * Gets the value of the paroleChiaveIn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getParoleChiaveIn() {
        return paroleChiaveIn;
    }

    /**
     * Sets the value of the paroleChiaveIn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setParoleChiaveIn(String value) {
        this.paroleChiaveIn = value;
    }

    /**
     * Gets the value of the vAttrOpzIn property.
     * 
     * @return
     *     possible object is
     *     {@link VAttrOpzIn }
     *     
     */
    public VAttrOpzIn getVAttrOpzIn() {
        return vAttrOpzIn;
    }

    /**
     * Sets the value of the vAttrOpzIn property.
     * 
     * @param value
     *     allowed object is
     *     {@link VAttrOpzIn }
     *     
     */
    public void setVAttrOpzIn(VAttrOpzIn value) {
        this.vAttrOpzIn = value;
    }

    /**
     * Gets the value of the flgPropagaAclDoc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFlgPropagaAclDoc() {
        return flgPropagaAclDoc;
    }

    /**
     * Sets the value of the flgPropagaAclDoc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFlgPropagaAclDoc(String value) {
        this.flgPropagaAclDoc = value;
    }

}
