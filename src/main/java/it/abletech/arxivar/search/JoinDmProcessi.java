
package it.abletech.arxivar.search;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Join_Dm_Processi complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Join_Dm_Processi">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.Abletech.it/Arxivar}Join_Abstract">
 *       &lt;sequence>
 *         &lt;element name="ID" type="{http://www.Abletech.it/Arxivar}Field_Int" minOccurs="0"/>
 *         &lt;element name="NOTE" type="{http://www.Abletech.it/Arxivar}Field_Int" minOccurs="0"/>
 *         &lt;element name="ALLEGATI" type="{http://www.Abletech.it/Arxivar}Field_Int" minOccurs="0"/>
 *         &lt;element name="STATO" type="{http://www.Abletech.it/Arxivar}Field_Int" minOccurs="0"/>
 *         &lt;element name="WORKFLOW" type="{http://www.Abletech.it/Arxivar}Field_Int" minOccurs="0"/>
 *         &lt;element name="INIZIO" type="{http://www.Abletech.it/Arxivar}Field_DateTime" minOccurs="0"/>
 *         &lt;element name="CONCLUSO" type="{http://www.Abletech.it/Arxivar}Field_DateTime" minOccurs="0"/>
 *         &lt;element name="DATA_SCADENZA" type="{http://www.Abletech.it/Arxivar}Field_DateTime" minOccurs="0"/>
 *         &lt;element name="REVISIONE" type="{http://www.Abletech.it/Arxivar}Field_Int" minOccurs="0"/>
 *         &lt;element name="UTENTE" type="{http://www.Abletech.it/Arxivar}Field_Int" minOccurs="0"/>
 *         &lt;element name="RELAZIONE" type="{http://www.Abletech.it/Arxivar}Field_Int" minOccurs="0"/>
 *         &lt;element name="DESCRIZIONE" type="{http://www.Abletech.it/Arxivar}Field_String_Traduzioni_Pkg" minOccurs="0"/>
 *         &lt;element name="ORGANIGRAMMA" type="{http://www.Abletech.it/Arxivar}Field_Int" minOccurs="0"/>
 *         &lt;element name="AOO" type="{http://www.Abletech.it/Arxivar}Field_String" minOccurs="0"/>
 *         &lt;element name="COLORE" type="{http://www.Abletech.it/Arxivar}Field_Int" minOccurs="0"/>
 *         &lt;element name="ALLOWOTHERWF" type="{http://www.Abletech.it/Arxivar}Field_Int" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Join_Dm_Processi", propOrder = {
    "id",
    "note",
    "allegati",
    "stato",
    "workflow",
    "inizio",
    "concluso",
    "datascadenza",
    "revisione",
    "utente",
    "relazione",
    "descrizione",
    "organigramma",
    "aoo",
    "colore",
    "allowotherwf"
})
public class JoinDmProcessi
    extends JoinAbstract
{

    @XmlElement(name = "ID")
    protected FieldInt id;
    @XmlElement(name = "NOTE")
    protected FieldInt note;
    @XmlElement(name = "ALLEGATI")
    protected FieldInt allegati;
    @XmlElement(name = "STATO")
    protected FieldInt stato;
    @XmlElement(name = "WORKFLOW")
    protected FieldInt workflow;
    @XmlElement(name = "INIZIO")
    protected FieldDateTime inizio;
    @XmlElement(name = "CONCLUSO")
    protected FieldDateTime concluso;
    @XmlElement(name = "DATA_SCADENZA")
    protected FieldDateTime datascadenza;
    @XmlElement(name = "REVISIONE")
    protected FieldInt revisione;
    @XmlElement(name = "UTENTE")
    protected FieldInt utente;
    @XmlElement(name = "RELAZIONE")
    protected FieldInt relazione;
    @XmlElement(name = "DESCRIZIONE")
    protected FieldStringTraduzioniPkg descrizione;
    @XmlElement(name = "ORGANIGRAMMA")
    protected FieldInt organigramma;
    @XmlElement(name = "AOO")
    protected FieldString aoo;
    @XmlElement(name = "COLORE")
    protected FieldInt colore;
    @XmlElement(name = "ALLOWOTHERWF")
    protected FieldInt allowotherwf;

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link FieldInt }
     *     
     */
    public FieldInt getID() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldInt }
     *     
     */
    public void setID(FieldInt value) {
        this.id = value;
    }

    /**
     * Gets the value of the note property.
     * 
     * @return
     *     possible object is
     *     {@link FieldInt }
     *     
     */
    public FieldInt getNOTE() {
        return note;
    }

    /**
     * Sets the value of the note property.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldInt }
     *     
     */
    public void setNOTE(FieldInt value) {
        this.note = value;
    }

    /**
     * Gets the value of the allegati property.
     * 
     * @return
     *     possible object is
     *     {@link FieldInt }
     *     
     */
    public FieldInt getALLEGATI() {
        return allegati;
    }

    /**
     * Sets the value of the allegati property.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldInt }
     *     
     */
    public void setALLEGATI(FieldInt value) {
        this.allegati = value;
    }

    /**
     * Gets the value of the stato property.
     * 
     * @return
     *     possible object is
     *     {@link FieldInt }
     *     
     */
    public FieldInt getSTATO() {
        return stato;
    }

    /**
     * Sets the value of the stato property.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldInt }
     *     
     */
    public void setSTATO(FieldInt value) {
        this.stato = value;
    }

    /**
     * Gets the value of the workflow property.
     * 
     * @return
     *     possible object is
     *     {@link FieldInt }
     *     
     */
    public FieldInt getWORKFLOW() {
        return workflow;
    }

    /**
     * Sets the value of the workflow property.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldInt }
     *     
     */
    public void setWORKFLOW(FieldInt value) {
        this.workflow = value;
    }

    /**
     * Gets the value of the inizio property.
     * 
     * @return
     *     possible object is
     *     {@link FieldDateTime }
     *     
     */
    public FieldDateTime getINIZIO() {
        return inizio;
    }

    /**
     * Sets the value of the inizio property.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldDateTime }
     *     
     */
    public void setINIZIO(FieldDateTime value) {
        this.inizio = value;
    }

    /**
     * Gets the value of the concluso property.
     * 
     * @return
     *     possible object is
     *     {@link FieldDateTime }
     *     
     */
    public FieldDateTime getCONCLUSO() {
        return concluso;
    }

    /**
     * Sets the value of the concluso property.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldDateTime }
     *     
     */
    public void setCONCLUSO(FieldDateTime value) {
        this.concluso = value;
    }

    /**
     * Gets the value of the datascadenza property.
     * 
     * @return
     *     possible object is
     *     {@link FieldDateTime }
     *     
     */
    public FieldDateTime getDATASCADENZA() {
        return datascadenza;
    }

    /**
     * Sets the value of the datascadenza property.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldDateTime }
     *     
     */
    public void setDATASCADENZA(FieldDateTime value) {
        this.datascadenza = value;
    }

    /**
     * Gets the value of the revisione property.
     * 
     * @return
     *     possible object is
     *     {@link FieldInt }
     *     
     */
    public FieldInt getREVISIONE() {
        return revisione;
    }

    /**
     * Sets the value of the revisione property.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldInt }
     *     
     */
    public void setREVISIONE(FieldInt value) {
        this.revisione = value;
    }

    /**
     * Gets the value of the utente property.
     * 
     * @return
     *     possible object is
     *     {@link FieldInt }
     *     
     */
    public FieldInt getUTENTE() {
        return utente;
    }

    /**
     * Sets the value of the utente property.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldInt }
     *     
     */
    public void setUTENTE(FieldInt value) {
        this.utente = value;
    }

    /**
     * Gets the value of the relazione property.
     * 
     * @return
     *     possible object is
     *     {@link FieldInt }
     *     
     */
    public FieldInt getRELAZIONE() {
        return relazione;
    }

    /**
     * Sets the value of the relazione property.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldInt }
     *     
     */
    public void setRELAZIONE(FieldInt value) {
        this.relazione = value;
    }

    /**
     * Gets the value of the descrizione property.
     * 
     * @return
     *     possible object is
     *     {@link FieldStringTraduzioniPkg }
     *     
     */
    public FieldStringTraduzioniPkg getDESCRIZIONE() {
        return descrizione;
    }

    /**
     * Sets the value of the descrizione property.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldStringTraduzioniPkg }
     *     
     */
    public void setDESCRIZIONE(FieldStringTraduzioniPkg value) {
        this.descrizione = value;
    }

    /**
     * Gets the value of the organigramma property.
     * 
     * @return
     *     possible object is
     *     {@link FieldInt }
     *     
     */
    public FieldInt getORGANIGRAMMA() {
        return organigramma;
    }

    /**
     * Sets the value of the organigramma property.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldInt }
     *     
     */
    public void setORGANIGRAMMA(FieldInt value) {
        this.organigramma = value;
    }

    /**
     * Gets the value of the aoo property.
     * 
     * @return
     *     possible object is
     *     {@link FieldString }
     *     
     */
    public FieldString getAOO() {
        return aoo;
    }

    /**
     * Sets the value of the aoo property.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldString }
     *     
     */
    public void setAOO(FieldString value) {
        this.aoo = value;
    }

    /**
     * Gets the value of the colore property.
     * 
     * @return
     *     possible object is
     *     {@link FieldInt }
     *     
     */
    public FieldInt getCOLORE() {
        return colore;
    }

    /**
     * Sets the value of the colore property.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldInt }
     *     
     */
    public void setCOLORE(FieldInt value) {
        this.colore = value;
    }

    /**
     * Gets the value of the allowotherwf property.
     * 
     * @return
     *     possible object is
     *     {@link FieldInt }
     *     
     */
    public FieldInt getALLOWOTHERWF() {
        return allowotherwf;
    }

    /**
     * Sets the value of the allowotherwf property.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldInt }
     *     
     */
    public void setALLOWOTHERWF(FieldInt value) {
        this.allowotherwf = value;
    }

}
