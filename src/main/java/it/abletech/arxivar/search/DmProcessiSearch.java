
package it.abletech.arxivar.search;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Dm_Processi_Search complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Dm_Processi_Search">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.Abletech.it/Arxivar}Dm_Base_Search">
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
 *         &lt;element name="Dm_ProcessDoc" type="{http://www.Abletech.it/Arxivar}Join_Dm_ProcessDoc" minOccurs="0"/>
 *         &lt;element name="Dm_TaskWork" type="{http://www.Abletech.it/Arxivar}Join_Dm_TaskWork" minOccurs="0"/>
 *         &lt;element name="Dm_Workflow" type="{http://www.Abletech.it/Arxivar}Join_Dm_Workflow" minOccurs="0"/>
 *         &lt;element name="Dm_Utenti" type="{http://www.Abletech.it/Arxivar}Join_Dm_Utenti" minOccurs="0"/>
 *         &lt;element name="Dm_AllegatiWork" type="{http://www.Abletech.it/Arxivar}Join_Dm_AllegatiWork" minOccurs="0"/>
 *         &lt;element name="Dm_VariabiliProcesso" type="{http://www.Abletech.it/Arxivar}Join_Dm_VariabiliProcesso" minOccurs="0"/>
 *         &lt;element name="Dm_MapWorkflow" type="{http://www.Abletech.it/Arxivar}Join_Dm_MapWorkflow" minOccurs="0"/>
 *         &lt;element name="Dm_UsersWork" type="{http://www.Abletech.it/Arxivar}Join_Dm_UsersWork" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Dm_Processi_Search", propOrder = {
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
    "allowotherwf",
    "dmProcessDoc",
    "dmTaskWork",
    "dmWorkflow",
    "dmUtenti",
    "dmAllegatiWork",
    "dmVariabiliProcesso",
    "dmMapWorkflow",
    "dmUsersWork"
})
public class DmProcessiSearch
    extends DmBaseSearch
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
    @XmlElement(name = "Dm_ProcessDoc")
    protected JoinDmProcessDoc dmProcessDoc;
    @XmlElement(name = "Dm_TaskWork")
    protected JoinDmTaskWork dmTaskWork;
    @XmlElement(name = "Dm_Workflow")
    protected JoinDmWorkflow dmWorkflow;
    @XmlElement(name = "Dm_Utenti")
    protected JoinDmUtenti dmUtenti;
    @XmlElement(name = "Dm_AllegatiWork")
    protected JoinDmAllegatiWork dmAllegatiWork;
    @XmlElement(name = "Dm_VariabiliProcesso")
    protected JoinDmVariabiliProcesso dmVariabiliProcesso;
    @XmlElement(name = "Dm_MapWorkflow")
    protected JoinDmMapWorkflow dmMapWorkflow;
    @XmlElement(name = "Dm_UsersWork")
    protected JoinDmUsersWork dmUsersWork;

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

    /**
     * Gets the value of the dmProcessDoc property.
     * 
     * @return
     *     possible object is
     *     {@link JoinDmProcessDoc }
     *     
     */
    public JoinDmProcessDoc getDmProcessDoc() {
        return dmProcessDoc;
    }

    /**
     * Sets the value of the dmProcessDoc property.
     * 
     * @param value
     *     allowed object is
     *     {@link JoinDmProcessDoc }
     *     
     */
    public void setDmProcessDoc(JoinDmProcessDoc value) {
        this.dmProcessDoc = value;
    }

    /**
     * Gets the value of the dmTaskWork property.
     * 
     * @return
     *     possible object is
     *     {@link JoinDmTaskWork }
     *     
     */
    public JoinDmTaskWork getDmTaskWork() {
        return dmTaskWork;
    }

    /**
     * Sets the value of the dmTaskWork property.
     * 
     * @param value
     *     allowed object is
     *     {@link JoinDmTaskWork }
     *     
     */
    public void setDmTaskWork(JoinDmTaskWork value) {
        this.dmTaskWork = value;
    }

    /**
     * Gets the value of the dmWorkflow property.
     * 
     * @return
     *     possible object is
     *     {@link JoinDmWorkflow }
     *     
     */
    public JoinDmWorkflow getDmWorkflow() {
        return dmWorkflow;
    }

    /**
     * Sets the value of the dmWorkflow property.
     * 
     * @param value
     *     allowed object is
     *     {@link JoinDmWorkflow }
     *     
     */
    public void setDmWorkflow(JoinDmWorkflow value) {
        this.dmWorkflow = value;
    }

    /**
     * Gets the value of the dmUtenti property.
     * 
     * @return
     *     possible object is
     *     {@link JoinDmUtenti }
     *     
     */
    public JoinDmUtenti getDmUtenti() {
        return dmUtenti;
    }

    /**
     * Sets the value of the dmUtenti property.
     * 
     * @param value
     *     allowed object is
     *     {@link JoinDmUtenti }
     *     
     */
    public void setDmUtenti(JoinDmUtenti value) {
        this.dmUtenti = value;
    }

    /**
     * Gets the value of the dmAllegatiWork property.
     * 
     * @return
     *     possible object is
     *     {@link JoinDmAllegatiWork }
     *     
     */
    public JoinDmAllegatiWork getDmAllegatiWork() {
        return dmAllegatiWork;
    }

    /**
     * Sets the value of the dmAllegatiWork property.
     * 
     * @param value
     *     allowed object is
     *     {@link JoinDmAllegatiWork }
     *     
     */
    public void setDmAllegatiWork(JoinDmAllegatiWork value) {
        this.dmAllegatiWork = value;
    }

    /**
     * Gets the value of the dmVariabiliProcesso property.
     * 
     * @return
     *     possible object is
     *     {@link JoinDmVariabiliProcesso }
     *     
     */
    public JoinDmVariabiliProcesso getDmVariabiliProcesso() {
        return dmVariabiliProcesso;
    }

    /**
     * Sets the value of the dmVariabiliProcesso property.
     * 
     * @param value
     *     allowed object is
     *     {@link JoinDmVariabiliProcesso }
     *     
     */
    public void setDmVariabiliProcesso(JoinDmVariabiliProcesso value) {
        this.dmVariabiliProcesso = value;
    }

    /**
     * Gets the value of the dmMapWorkflow property.
     * 
     * @return
     *     possible object is
     *     {@link JoinDmMapWorkflow }
     *     
     */
    public JoinDmMapWorkflow getDmMapWorkflow() {
        return dmMapWorkflow;
    }

    /**
     * Sets the value of the dmMapWorkflow property.
     * 
     * @param value
     *     allowed object is
     *     {@link JoinDmMapWorkflow }
     *     
     */
    public void setDmMapWorkflow(JoinDmMapWorkflow value) {
        this.dmMapWorkflow = value;
    }

    /**
     * Gets the value of the dmUsersWork property.
     * 
     * @return
     *     possible object is
     *     {@link JoinDmUsersWork }
     *     
     */
    public JoinDmUsersWork getDmUsersWork() {
        return dmUsersWork;
    }

    /**
     * Sets the value of the dmUsersWork property.
     * 
     * @param value
     *     allowed object is
     *     {@link JoinDmUsersWork }
     *     
     */
    public void setDmUsersWork(JoinDmUsersWork value) {
        this.dmUsersWork = value;
    }

}
