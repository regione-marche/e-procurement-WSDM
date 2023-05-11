
package it.abletech.arxivar.search;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Dm_TaskWork_Search complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Dm_TaskWork_Search">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.Abletech.it/Arxivar}Dm_Base_Search">
 *       &lt;sequence>
 *         &lt;element name="ID" type="{http://www.Abletech.it/Arxivar}Field_Int" minOccurs="0"/>
 *         &lt;element name="ID_WORKFLOW" type="{http://www.Abletech.it/Arxivar}Field_Int" minOccurs="0"/>
 *         &lt;element name="ID_PROCESSO" type="{http://www.Abletech.it/Arxivar}Field_Int" minOccurs="0"/>
 *         &lt;element name="NOTE" type="{http://www.Abletech.it/Arxivar}Field_Int" minOccurs="0"/>
 *         &lt;element name="ALLEGATI" type="{http://www.Abletech.it/Arxivar}Field_Int" minOccurs="0"/>
 *         &lt;element name="NUMDOC" type="{http://www.Abletech.it/Arxivar}Field_Int" minOccurs="0"/>
 *         &lt;element name="REVISIONE" type="{http://www.Abletech.it/Arxivar}Field_Int" minOccurs="0"/>
 *         &lt;element name="DATAINIZIO" type="{http://www.Abletech.it/Arxivar}Field_DateTime" minOccurs="0"/>
 *         &lt;element name="NOMETASK" type="{http://www.Abletech.it/Arxivar}Field_String_Traduzioni_Pkg" minOccurs="0"/>
 *         &lt;element name="DESCTASK" type="{http://www.Abletech.it/Arxivar}Field_String_Traduzioni_Pkg" minOccurs="0"/>
 *         &lt;element name="UTENTE" type="{http://www.Abletech.it/Arxivar}Field_Int" minOccurs="0"/>
 *         &lt;element name="CONCLUSO" type="{http://www.Abletech.it/Arxivar}Field_DateTime" minOccurs="0"/>
 *         &lt;element name="STATO" type="{http://www.Abletech.it/Arxivar}Field_Int" minOccurs="0"/>
 *         &lt;element name="DATA_SCADENZA" type="{http://www.Abletech.it/Arxivar}Field_DateTime" minOccurs="0"/>
 *         &lt;element name="ABILITAEXPORT" type="{http://www.Abletech.it/Arxivar}Field_Int" minOccurs="0"/>
 *         &lt;element name="ID_NODO" type="{http://www.Abletech.it/Arxivar}Field_Int" minOccurs="0"/>
 *         &lt;element name="ISTRUZIONI" type="{http://www.Abletech.it/Arxivar}Field_Int" minOccurs="0"/>
 *         &lt;element name="SELECTUSER" type="{http://www.Abletech.it/Arxivar}Field_Int" minOccurs="0"/>
 *         &lt;element name="INPUTNEWDOC" type="{http://www.Abletech.it/Arxivar}Field_Int" minOccurs="0"/>
 *         &lt;element name="INPUT_TYPE" type="{http://www.Abletech.it/Arxivar}Field_Int" minOccurs="0"/>
 *         &lt;element name="EDITPROFILO" type="{http://www.Abletech.it/Arxivar}Field_Int" minOccurs="0"/>
 *         &lt;element name="INSERTFOLDER" type="{http://www.Abletech.it/Arxivar}Field_Int" minOccurs="0"/>
 *         &lt;element name="ASSOCIA" type="{http://www.Abletech.it/Arxivar}Field_Int" minOccurs="0"/>
 *         &lt;element name="MODULO" type="{http://www.Abletech.it/Arxivar}Field_Int" minOccurs="0"/>
 *         &lt;element name="TIPOTASK" type="{http://www.Abletech.it/Arxivar}Field_Int" minOccurs="0"/>
 *         &lt;element name="MODESEC" type="{http://www.Abletech.it/Arxivar}Field_Int" minOccurs="0"/>
 *         &lt;element name="NOTIFICAMAIL" type="{http://www.Abletech.it/Arxivar}Field_Int" minOccurs="0"/>
 *         &lt;element name="AVANZATASK" type="{http://www.Abletech.it/Arxivar}Field_DateTime" minOccurs="0"/>
 *         &lt;element name="PSWREQUIRED" type="{http://www.Abletech.it/Arxivar}Field_Int" minOccurs="0"/>
 *         &lt;element name="NEWMEMO" type="{http://www.Abletech.it/Arxivar}Field_Int" minOccurs="0"/>
 *         &lt;element name="LETTO" type="{http://www.Abletech.it/Arxivar}Field_String" minOccurs="0"/>
 *         &lt;element name="COMASINCRONO" type="{http://www.Abletech.it/Arxivar}Field_Int" minOccurs="0"/>
 *         &lt;element name="COPIAEDIT" type="{http://www.Abletech.it/Arxivar}Field_Int" minOccurs="0"/>
 *         &lt;element name="OBBCOM" type="{http://www.Abletech.it/Arxivar}Field_Int" minOccurs="0"/>
 *         &lt;element name="SCADTASK" type="{http://www.Abletech.it/Arxivar}Field_DateTime" minOccurs="0"/>
 *         &lt;element name="ATTIVATASK" type="{http://www.Abletech.it/Arxivar}Field_DateTime" minOccurs="0"/>
 *         &lt;element name="DESCFIGURE" type="{http://www.Abletech.it/Arxivar}Field_String" minOccurs="0"/>
 *         &lt;element name="DESCVARIABILI" type="{http://www.Abletech.it/Arxivar}Field_String" minOccurs="0"/>
 *         &lt;element name="ID_ORG" type="{http://www.Abletech.it/Arxivar}Field_Int" minOccurs="0"/>
 *         &lt;element name="ID_DELEGA" type="{http://www.Abletech.it/Arxivar}Field_Int" minOccurs="0"/>
 *         &lt;element name="TASKAPERTO" type="{http://www.Abletech.it/Arxivar}Field_DateTime" minOccurs="0"/>
 *         &lt;element name="ESITO" type="{http://www.Abletech.it/Arxivar}Field_String" minOccurs="0"/>
 *         &lt;element name="TASKDIGRUPPO" type="{http://www.Abletech.it/Arxivar}Field_String" minOccurs="0"/>
 *         &lt;element name="TIPO1" type="{http://www.Abletech.it/Arxivar}Field_Int" minOccurs="0"/>
 *         &lt;element name="TIPO2" type="{http://www.Abletech.it/Arxivar}Field_Int" minOccurs="0"/>
 *         &lt;element name="TIPO3" type="{http://www.Abletech.it/Arxivar}Field_Int" minOccurs="0"/>
 *         &lt;element name="SELECTDOC" type="{http://www.Abletech.it/Arxivar}Field_Int" minOccurs="0"/>
 *         &lt;element name="Dm_Utenti" type="{http://www.Abletech.it/Arxivar}Join_Dm_Utenti" minOccurs="0"/>
 *         &lt;element name="Dm_Workflow" type="{http://www.Abletech.it/Arxivar}Join_Dm_Workflow" minOccurs="0"/>
 *         &lt;element name="Dm_Processi" type="{http://www.Abletech.it/Arxivar}Join_Dm_Processi" minOccurs="0"/>
 *         &lt;element name="Dm_VariabiliProcesso" type="{http://www.Abletech.it/Arxivar}Join_Dm_VariabiliProcesso" minOccurs="0"/>
 *         &lt;element name="Dm_TaskDoc" type="{http://www.Abletech.it/Arxivar}Join_Dm_TaskDoc" minOccurs="0"/>
 *         &lt;element name="Dm_Profile" type="{http://www.Abletech.it/Arxivar}Join_Dm_Profile" minOccurs="0"/>
 *         &lt;element name="Dm_Fascicoli" type="{http://www.Abletech.it/Arxivar}Join_Dm_Fascicoli" minOccurs="0"/>
 *         &lt;element name="Dm_TaskExecute" type="{http://www.Abletech.it/Arxivar}Join_Dm_TaskExecute" minOccurs="0"/>
 *         &lt;element name="SearchMode" type="{http://www.Abletech.it/Arxivar}TaskWorork_SearchMode"/>
 *         &lt;element name="Dm_VariabiliProcessoVal" type="{http://www.Abletech.it/Arxivar}Join_Dm_VariabiliProcessoVal" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Dm_TaskWork_Search", propOrder = {
    "id",
    "idworkflow",
    "idprocesso",
    "note",
    "allegati",
    "numdoc",
    "revisione",
    "datainizio",
    "nometask",
    "desctask",
    "utente",
    "concluso",
    "stato",
    "datascadenza",
    "abilitaexport",
    "idnodo",
    "istruzioni",
    "selectuser",
    "inputnewdoc",
    "inputtype",
    "editprofilo",
    "insertfolder",
    "associa",
    "modulo",
    "tipotask",
    "modesec",
    "notificamail",
    "avanzatask",
    "pswrequired",
    "newmemo",
    "letto",
    "comasincrono",
    "copiaedit",
    "obbcom",
    "scadtask",
    "attivatask",
    "descfigure",
    "descvariabili",
    "idorg",
    "iddelega",
    "taskaperto",
    "esito",
    "taskdigruppo",
    "tipo1",
    "tipo2",
    "tipo3",
    "selectdoc",
    "dmUtenti",
    "dmWorkflow",
    "dmProcessi",
    "dmVariabiliProcesso",
    "dmTaskDoc",
    "dmProfile",
    "dmFascicoli",
    "dmTaskExecute",
    "searchMode",
    "dmVariabiliProcessoVal"
})
public class DmTaskWorkSearch
    extends DmBaseSearch
{

    @XmlElement(name = "ID")
    protected FieldInt id;
    @XmlElement(name = "ID_WORKFLOW")
    protected FieldInt idworkflow;
    @XmlElement(name = "ID_PROCESSO")
    protected FieldInt idprocesso;
    @XmlElement(name = "NOTE")
    protected FieldInt note;
    @XmlElement(name = "ALLEGATI")
    protected FieldInt allegati;
    @XmlElement(name = "NUMDOC")
    protected FieldInt numdoc;
    @XmlElement(name = "REVISIONE")
    protected FieldInt revisione;
    @XmlElement(name = "DATAINIZIO")
    protected FieldDateTime datainizio;
    @XmlElement(name = "NOMETASK")
    protected FieldStringTraduzioniPkg nometask;
    @XmlElement(name = "DESCTASK")
    protected FieldStringTraduzioniPkg desctask;
    @XmlElement(name = "UTENTE")
    protected FieldInt utente;
    @XmlElement(name = "CONCLUSO")
    protected FieldDateTime concluso;
    @XmlElement(name = "STATO")
    protected FieldInt stato;
    @XmlElement(name = "DATA_SCADENZA")
    protected FieldDateTime datascadenza;
    @XmlElement(name = "ABILITAEXPORT")
    protected FieldInt abilitaexport;
    @XmlElement(name = "ID_NODO")
    protected FieldInt idnodo;
    @XmlElement(name = "ISTRUZIONI")
    protected FieldInt istruzioni;
    @XmlElement(name = "SELECTUSER")
    protected FieldInt selectuser;
    @XmlElement(name = "INPUTNEWDOC")
    protected FieldInt inputnewdoc;
    @XmlElement(name = "INPUT_TYPE")
    protected FieldInt inputtype;
    @XmlElement(name = "EDITPROFILO")
    protected FieldInt editprofilo;
    @XmlElement(name = "INSERTFOLDER")
    protected FieldInt insertfolder;
    @XmlElement(name = "ASSOCIA")
    protected FieldInt associa;
    @XmlElement(name = "MODULO")
    protected FieldInt modulo;
    @XmlElement(name = "TIPOTASK")
    protected FieldInt tipotask;
    @XmlElement(name = "MODESEC")
    protected FieldInt modesec;
    @XmlElement(name = "NOTIFICAMAIL")
    protected FieldInt notificamail;
    @XmlElement(name = "AVANZATASK")
    protected FieldDateTime avanzatask;
    @XmlElement(name = "PSWREQUIRED")
    protected FieldInt pswrequired;
    @XmlElement(name = "NEWMEMO")
    protected FieldInt newmemo;
    @XmlElement(name = "LETTO")
    protected FieldString letto;
    @XmlElement(name = "COMASINCRONO")
    protected FieldInt comasincrono;
    @XmlElement(name = "COPIAEDIT")
    protected FieldInt copiaedit;
    @XmlElement(name = "OBBCOM")
    protected FieldInt obbcom;
    @XmlElement(name = "SCADTASK")
    protected FieldDateTime scadtask;
    @XmlElement(name = "ATTIVATASK")
    protected FieldDateTime attivatask;
    @XmlElement(name = "DESCFIGURE")
    protected FieldString descfigure;
    @XmlElement(name = "DESCVARIABILI")
    protected FieldString descvariabili;
    @XmlElement(name = "ID_ORG")
    protected FieldInt idorg;
    @XmlElement(name = "ID_DELEGA")
    protected FieldInt iddelega;
    @XmlElement(name = "TASKAPERTO")
    protected FieldDateTime taskaperto;
    @XmlElement(name = "ESITO")
    protected FieldString esito;
    @XmlElement(name = "TASKDIGRUPPO")
    protected FieldString taskdigruppo;
    @XmlElement(name = "TIPO1")
    protected FieldInt tipo1;
    @XmlElement(name = "TIPO2")
    protected FieldInt tipo2;
    @XmlElement(name = "TIPO3")
    protected FieldInt tipo3;
    @XmlElement(name = "SELECTDOC")
    protected FieldInt selectdoc;
    @XmlElement(name = "Dm_Utenti")
    protected JoinDmUtenti dmUtenti;
    @XmlElement(name = "Dm_Workflow")
    protected JoinDmWorkflow dmWorkflow;
    @XmlElement(name = "Dm_Processi")
    protected JoinDmProcessi dmProcessi;
    @XmlElement(name = "Dm_VariabiliProcesso")
    protected JoinDmVariabiliProcesso dmVariabiliProcesso;
    @XmlElement(name = "Dm_TaskDoc")
    protected JoinDmTaskDoc dmTaskDoc;
    @XmlElement(name = "Dm_Profile")
    protected JoinDmProfile dmProfile;
    @XmlElement(name = "Dm_Fascicoli")
    protected JoinDmFascicoli dmFascicoli;
    @XmlElement(name = "Dm_TaskExecute")
    protected JoinDmTaskExecute dmTaskExecute;
    @XmlElement(name = "SearchMode", required = true)
    protected TaskWororkSearchMode searchMode;
    @XmlElement(name = "Dm_VariabiliProcessoVal")
    protected JoinDmVariabiliProcessoVal dmVariabiliProcessoVal;

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
     * Gets the value of the idworkflow property.
     * 
     * @return
     *     possible object is
     *     {@link FieldInt }
     *     
     */
    public FieldInt getIDWORKFLOW() {
        return idworkflow;
    }

    /**
     * Sets the value of the idworkflow property.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldInt }
     *     
     */
    public void setIDWORKFLOW(FieldInt value) {
        this.idworkflow = value;
    }

    /**
     * Gets the value of the idprocesso property.
     * 
     * @return
     *     possible object is
     *     {@link FieldInt }
     *     
     */
    public FieldInt getIDPROCESSO() {
        return idprocesso;
    }

    /**
     * Sets the value of the idprocesso property.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldInt }
     *     
     */
    public void setIDPROCESSO(FieldInt value) {
        this.idprocesso = value;
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
     * Gets the value of the numdoc property.
     * 
     * @return
     *     possible object is
     *     {@link FieldInt }
     *     
     */
    public FieldInt getNUMDOC() {
        return numdoc;
    }

    /**
     * Sets the value of the numdoc property.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldInt }
     *     
     */
    public void setNUMDOC(FieldInt value) {
        this.numdoc = value;
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
     * Gets the value of the datainizio property.
     * 
     * @return
     *     possible object is
     *     {@link FieldDateTime }
     *     
     */
    public FieldDateTime getDATAINIZIO() {
        return datainizio;
    }

    /**
     * Sets the value of the datainizio property.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldDateTime }
     *     
     */
    public void setDATAINIZIO(FieldDateTime value) {
        this.datainizio = value;
    }

    /**
     * Gets the value of the nometask property.
     * 
     * @return
     *     possible object is
     *     {@link FieldStringTraduzioniPkg }
     *     
     */
    public FieldStringTraduzioniPkg getNOMETASK() {
        return nometask;
    }

    /**
     * Sets the value of the nometask property.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldStringTraduzioniPkg }
     *     
     */
    public void setNOMETASK(FieldStringTraduzioniPkg value) {
        this.nometask = value;
    }

    /**
     * Gets the value of the desctask property.
     * 
     * @return
     *     possible object is
     *     {@link FieldStringTraduzioniPkg }
     *     
     */
    public FieldStringTraduzioniPkg getDESCTASK() {
        return desctask;
    }

    /**
     * Sets the value of the desctask property.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldStringTraduzioniPkg }
     *     
     */
    public void setDESCTASK(FieldStringTraduzioniPkg value) {
        this.desctask = value;
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
     * Gets the value of the abilitaexport property.
     * 
     * @return
     *     possible object is
     *     {@link FieldInt }
     *     
     */
    public FieldInt getABILITAEXPORT() {
        return abilitaexport;
    }

    /**
     * Sets the value of the abilitaexport property.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldInt }
     *     
     */
    public void setABILITAEXPORT(FieldInt value) {
        this.abilitaexport = value;
    }

    /**
     * Gets the value of the idnodo property.
     * 
     * @return
     *     possible object is
     *     {@link FieldInt }
     *     
     */
    public FieldInt getIDNODO() {
        return idnodo;
    }

    /**
     * Sets the value of the idnodo property.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldInt }
     *     
     */
    public void setIDNODO(FieldInt value) {
        this.idnodo = value;
    }

    /**
     * Gets the value of the istruzioni property.
     * 
     * @return
     *     possible object is
     *     {@link FieldInt }
     *     
     */
    public FieldInt getISTRUZIONI() {
        return istruzioni;
    }

    /**
     * Sets the value of the istruzioni property.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldInt }
     *     
     */
    public void setISTRUZIONI(FieldInt value) {
        this.istruzioni = value;
    }

    /**
     * Gets the value of the selectuser property.
     * 
     * @return
     *     possible object is
     *     {@link FieldInt }
     *     
     */
    public FieldInt getSELECTUSER() {
        return selectuser;
    }

    /**
     * Sets the value of the selectuser property.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldInt }
     *     
     */
    public void setSELECTUSER(FieldInt value) {
        this.selectuser = value;
    }

    /**
     * Gets the value of the inputnewdoc property.
     * 
     * @return
     *     possible object is
     *     {@link FieldInt }
     *     
     */
    public FieldInt getINPUTNEWDOC() {
        return inputnewdoc;
    }

    /**
     * Sets the value of the inputnewdoc property.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldInt }
     *     
     */
    public void setINPUTNEWDOC(FieldInt value) {
        this.inputnewdoc = value;
    }

    /**
     * Gets the value of the inputtype property.
     * 
     * @return
     *     possible object is
     *     {@link FieldInt }
     *     
     */
    public FieldInt getINPUTTYPE() {
        return inputtype;
    }

    /**
     * Sets the value of the inputtype property.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldInt }
     *     
     */
    public void setINPUTTYPE(FieldInt value) {
        this.inputtype = value;
    }

    /**
     * Gets the value of the editprofilo property.
     * 
     * @return
     *     possible object is
     *     {@link FieldInt }
     *     
     */
    public FieldInt getEDITPROFILO() {
        return editprofilo;
    }

    /**
     * Sets the value of the editprofilo property.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldInt }
     *     
     */
    public void setEDITPROFILO(FieldInt value) {
        this.editprofilo = value;
    }

    /**
     * Gets the value of the insertfolder property.
     * 
     * @return
     *     possible object is
     *     {@link FieldInt }
     *     
     */
    public FieldInt getINSERTFOLDER() {
        return insertfolder;
    }

    /**
     * Sets the value of the insertfolder property.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldInt }
     *     
     */
    public void setINSERTFOLDER(FieldInt value) {
        this.insertfolder = value;
    }

    /**
     * Gets the value of the associa property.
     * 
     * @return
     *     possible object is
     *     {@link FieldInt }
     *     
     */
    public FieldInt getASSOCIA() {
        return associa;
    }

    /**
     * Sets the value of the associa property.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldInt }
     *     
     */
    public void setASSOCIA(FieldInt value) {
        this.associa = value;
    }

    /**
     * Gets the value of the modulo property.
     * 
     * @return
     *     possible object is
     *     {@link FieldInt }
     *     
     */
    public FieldInt getMODULO() {
        return modulo;
    }

    /**
     * Sets the value of the modulo property.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldInt }
     *     
     */
    public void setMODULO(FieldInt value) {
        this.modulo = value;
    }

    /**
     * Gets the value of the tipotask property.
     * 
     * @return
     *     possible object is
     *     {@link FieldInt }
     *     
     */
    public FieldInt getTIPOTASK() {
        return tipotask;
    }

    /**
     * Sets the value of the tipotask property.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldInt }
     *     
     */
    public void setTIPOTASK(FieldInt value) {
        this.tipotask = value;
    }

    /**
     * Gets the value of the modesec property.
     * 
     * @return
     *     possible object is
     *     {@link FieldInt }
     *     
     */
    public FieldInt getMODESEC() {
        return modesec;
    }

    /**
     * Sets the value of the modesec property.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldInt }
     *     
     */
    public void setMODESEC(FieldInt value) {
        this.modesec = value;
    }

    /**
     * Gets the value of the notificamail property.
     * 
     * @return
     *     possible object is
     *     {@link FieldInt }
     *     
     */
    public FieldInt getNOTIFICAMAIL() {
        return notificamail;
    }

    /**
     * Sets the value of the notificamail property.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldInt }
     *     
     */
    public void setNOTIFICAMAIL(FieldInt value) {
        this.notificamail = value;
    }

    /**
     * Gets the value of the avanzatask property.
     * 
     * @return
     *     possible object is
     *     {@link FieldDateTime }
     *     
     */
    public FieldDateTime getAVANZATASK() {
        return avanzatask;
    }

    /**
     * Sets the value of the avanzatask property.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldDateTime }
     *     
     */
    public void setAVANZATASK(FieldDateTime value) {
        this.avanzatask = value;
    }

    /**
     * Gets the value of the pswrequired property.
     * 
     * @return
     *     possible object is
     *     {@link FieldInt }
     *     
     */
    public FieldInt getPSWREQUIRED() {
        return pswrequired;
    }

    /**
     * Sets the value of the pswrequired property.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldInt }
     *     
     */
    public void setPSWREQUIRED(FieldInt value) {
        this.pswrequired = value;
    }

    /**
     * Gets the value of the newmemo property.
     * 
     * @return
     *     possible object is
     *     {@link FieldInt }
     *     
     */
    public FieldInt getNEWMEMO() {
        return newmemo;
    }

    /**
     * Sets the value of the newmemo property.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldInt }
     *     
     */
    public void setNEWMEMO(FieldInt value) {
        this.newmemo = value;
    }

    /**
     * Gets the value of the letto property.
     * 
     * @return
     *     possible object is
     *     {@link FieldString }
     *     
     */
    public FieldString getLETTO() {
        return letto;
    }

    /**
     * Sets the value of the letto property.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldString }
     *     
     */
    public void setLETTO(FieldString value) {
        this.letto = value;
    }

    /**
     * Gets the value of the comasincrono property.
     * 
     * @return
     *     possible object is
     *     {@link FieldInt }
     *     
     */
    public FieldInt getCOMASINCRONO() {
        return comasincrono;
    }

    /**
     * Sets the value of the comasincrono property.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldInt }
     *     
     */
    public void setCOMASINCRONO(FieldInt value) {
        this.comasincrono = value;
    }

    /**
     * Gets the value of the copiaedit property.
     * 
     * @return
     *     possible object is
     *     {@link FieldInt }
     *     
     */
    public FieldInt getCOPIAEDIT() {
        return copiaedit;
    }

    /**
     * Sets the value of the copiaedit property.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldInt }
     *     
     */
    public void setCOPIAEDIT(FieldInt value) {
        this.copiaedit = value;
    }

    /**
     * Gets the value of the obbcom property.
     * 
     * @return
     *     possible object is
     *     {@link FieldInt }
     *     
     */
    public FieldInt getOBBCOM() {
        return obbcom;
    }

    /**
     * Sets the value of the obbcom property.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldInt }
     *     
     */
    public void setOBBCOM(FieldInt value) {
        this.obbcom = value;
    }

    /**
     * Gets the value of the scadtask property.
     * 
     * @return
     *     possible object is
     *     {@link FieldDateTime }
     *     
     */
    public FieldDateTime getSCADTASK() {
        return scadtask;
    }

    /**
     * Sets the value of the scadtask property.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldDateTime }
     *     
     */
    public void setSCADTASK(FieldDateTime value) {
        this.scadtask = value;
    }

    /**
     * Gets the value of the attivatask property.
     * 
     * @return
     *     possible object is
     *     {@link FieldDateTime }
     *     
     */
    public FieldDateTime getATTIVATASK() {
        return attivatask;
    }

    /**
     * Sets the value of the attivatask property.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldDateTime }
     *     
     */
    public void setATTIVATASK(FieldDateTime value) {
        this.attivatask = value;
    }

    /**
     * Gets the value of the descfigure property.
     * 
     * @return
     *     possible object is
     *     {@link FieldString }
     *     
     */
    public FieldString getDESCFIGURE() {
        return descfigure;
    }

    /**
     * Sets the value of the descfigure property.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldString }
     *     
     */
    public void setDESCFIGURE(FieldString value) {
        this.descfigure = value;
    }

    /**
     * Gets the value of the descvariabili property.
     * 
     * @return
     *     possible object is
     *     {@link FieldString }
     *     
     */
    public FieldString getDESCVARIABILI() {
        return descvariabili;
    }

    /**
     * Sets the value of the descvariabili property.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldString }
     *     
     */
    public void setDESCVARIABILI(FieldString value) {
        this.descvariabili = value;
    }

    /**
     * Gets the value of the idorg property.
     * 
     * @return
     *     possible object is
     *     {@link FieldInt }
     *     
     */
    public FieldInt getIDORG() {
        return idorg;
    }

    /**
     * Sets the value of the idorg property.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldInt }
     *     
     */
    public void setIDORG(FieldInt value) {
        this.idorg = value;
    }

    /**
     * Gets the value of the iddelega property.
     * 
     * @return
     *     possible object is
     *     {@link FieldInt }
     *     
     */
    public FieldInt getIDDELEGA() {
        return iddelega;
    }

    /**
     * Sets the value of the iddelega property.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldInt }
     *     
     */
    public void setIDDELEGA(FieldInt value) {
        this.iddelega = value;
    }

    /**
     * Gets the value of the taskaperto property.
     * 
     * @return
     *     possible object is
     *     {@link FieldDateTime }
     *     
     */
    public FieldDateTime getTASKAPERTO() {
        return taskaperto;
    }

    /**
     * Sets the value of the taskaperto property.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldDateTime }
     *     
     */
    public void setTASKAPERTO(FieldDateTime value) {
        this.taskaperto = value;
    }

    /**
     * Gets the value of the esito property.
     * 
     * @return
     *     possible object is
     *     {@link FieldString }
     *     
     */
    public FieldString getESITO() {
        return esito;
    }

    /**
     * Sets the value of the esito property.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldString }
     *     
     */
    public void setESITO(FieldString value) {
        this.esito = value;
    }

    /**
     * Gets the value of the taskdigruppo property.
     * 
     * @return
     *     possible object is
     *     {@link FieldString }
     *     
     */
    public FieldString getTASKDIGRUPPO() {
        return taskdigruppo;
    }

    /**
     * Sets the value of the taskdigruppo property.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldString }
     *     
     */
    public void setTASKDIGRUPPO(FieldString value) {
        this.taskdigruppo = value;
    }

    /**
     * Gets the value of the tipo1 property.
     * 
     * @return
     *     possible object is
     *     {@link FieldInt }
     *     
     */
    public FieldInt getTIPO1() {
        return tipo1;
    }

    /**
     * Sets the value of the tipo1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldInt }
     *     
     */
    public void setTIPO1(FieldInt value) {
        this.tipo1 = value;
    }

    /**
     * Gets the value of the tipo2 property.
     * 
     * @return
     *     possible object is
     *     {@link FieldInt }
     *     
     */
    public FieldInt getTIPO2() {
        return tipo2;
    }

    /**
     * Sets the value of the tipo2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldInt }
     *     
     */
    public void setTIPO2(FieldInt value) {
        this.tipo2 = value;
    }

    /**
     * Gets the value of the tipo3 property.
     * 
     * @return
     *     possible object is
     *     {@link FieldInt }
     *     
     */
    public FieldInt getTIPO3() {
        return tipo3;
    }

    /**
     * Sets the value of the tipo3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldInt }
     *     
     */
    public void setTIPO3(FieldInt value) {
        this.tipo3 = value;
    }

    /**
     * Gets the value of the selectdoc property.
     * 
     * @return
     *     possible object is
     *     {@link FieldInt }
     *     
     */
    public FieldInt getSELECTDOC() {
        return selectdoc;
    }

    /**
     * Sets the value of the selectdoc property.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldInt }
     *     
     */
    public void setSELECTDOC(FieldInt value) {
        this.selectdoc = value;
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
     * Gets the value of the dmProcessi property.
     * 
     * @return
     *     possible object is
     *     {@link JoinDmProcessi }
     *     
     */
    public JoinDmProcessi getDmProcessi() {
        return dmProcessi;
    }

    /**
     * Sets the value of the dmProcessi property.
     * 
     * @param value
     *     allowed object is
     *     {@link JoinDmProcessi }
     *     
     */
    public void setDmProcessi(JoinDmProcessi value) {
        this.dmProcessi = value;
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
     * Gets the value of the dmTaskDoc property.
     * 
     * @return
     *     possible object is
     *     {@link JoinDmTaskDoc }
     *     
     */
    public JoinDmTaskDoc getDmTaskDoc() {
        return dmTaskDoc;
    }

    /**
     * Sets the value of the dmTaskDoc property.
     * 
     * @param value
     *     allowed object is
     *     {@link JoinDmTaskDoc }
     *     
     */
    public void setDmTaskDoc(JoinDmTaskDoc value) {
        this.dmTaskDoc = value;
    }

    /**
     * Gets the value of the dmProfile property.
     * 
     * @return
     *     possible object is
     *     {@link JoinDmProfile }
     *     
     */
    public JoinDmProfile getDmProfile() {
        return dmProfile;
    }

    /**
     * Sets the value of the dmProfile property.
     * 
     * @param value
     *     allowed object is
     *     {@link JoinDmProfile }
     *     
     */
    public void setDmProfile(JoinDmProfile value) {
        this.dmProfile = value;
    }

    /**
     * Gets the value of the dmFascicoli property.
     * 
     * @return
     *     possible object is
     *     {@link JoinDmFascicoli }
     *     
     */
    public JoinDmFascicoli getDmFascicoli() {
        return dmFascicoli;
    }

    /**
     * Sets the value of the dmFascicoli property.
     * 
     * @param value
     *     allowed object is
     *     {@link JoinDmFascicoli }
     *     
     */
    public void setDmFascicoli(JoinDmFascicoli value) {
        this.dmFascicoli = value;
    }

    /**
     * Gets the value of the dmTaskExecute property.
     * 
     * @return
     *     possible object is
     *     {@link JoinDmTaskExecute }
     *     
     */
    public JoinDmTaskExecute getDmTaskExecute() {
        return dmTaskExecute;
    }

    /**
     * Sets the value of the dmTaskExecute property.
     * 
     * @param value
     *     allowed object is
     *     {@link JoinDmTaskExecute }
     *     
     */
    public void setDmTaskExecute(JoinDmTaskExecute value) {
        this.dmTaskExecute = value;
    }

    /**
     * Gets the value of the searchMode property.
     * 
     * @return
     *     possible object is
     *     {@link TaskWororkSearchMode }
     *     
     */
    public TaskWororkSearchMode getSearchMode() {
        return searchMode;
    }

    /**
     * Sets the value of the searchMode property.
     * 
     * @param value
     *     allowed object is
     *     {@link TaskWororkSearchMode }
     *     
     */
    public void setSearchMode(TaskWororkSearchMode value) {
        this.searchMode = value;
    }

    /**
     * Gets the value of the dmVariabiliProcessoVal property.
     * 
     * @return
     *     possible object is
     *     {@link JoinDmVariabiliProcessoVal }
     *     
     */
    public JoinDmVariabiliProcessoVal getDmVariabiliProcessoVal() {
        return dmVariabiliProcessoVal;
    }

    /**
     * Sets the value of the dmVariabiliProcessoVal property.
     * 
     * @param value
     *     allowed object is
     *     {@link JoinDmVariabiliProcessoVal }
     *     
     */
    public void setDmVariabiliProcessoVal(JoinDmVariabiliProcessoVal value) {
        this.dmVariabiliProcessoVal = value;
    }

}
