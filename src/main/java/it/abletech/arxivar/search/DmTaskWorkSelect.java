
package it.abletech.arxivar.search;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Dm_TaskWork_Select complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Dm_TaskWork_Select">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ID" type="{http://www.Abletech.it/Arxivar}Base_Selected" minOccurs="0"/>
 *         &lt;element name="ID_PROCESSO" type="{http://www.Abletech.it/Arxivar}Base_Selected" minOccurs="0"/>
 *         &lt;element name="NOTE" type="{http://www.Abletech.it/Arxivar}Base_Selected" minOccurs="0"/>
 *         &lt;element name="ALLEGATI" type="{http://www.Abletech.it/Arxivar}Base_Selected" minOccurs="0"/>
 *         &lt;element name="DOCNUMBER" type="{http://www.Abletech.it/Arxivar}Base_Selected" minOccurs="0"/>
 *         &lt;element name="REVISIONE" type="{http://www.Abletech.it/Arxivar}Base_Selected" minOccurs="0"/>
 *         &lt;element name="DATAINIZIO" type="{http://www.Abletech.it/Arxivar}Base_Selected" minOccurs="0"/>
 *         &lt;element name="NOMETASK" type="{http://www.Abletech.it/Arxivar}Base_Selected" minOccurs="0"/>
 *         &lt;element name="DESCTASK" type="{http://www.Abletech.it/Arxivar}Base_Selected" minOccurs="0"/>
 *         &lt;element name="UTENTE" type="{http://www.Abletech.it/Arxivar}Base_Selected" minOccurs="0"/>
 *         &lt;element name="CONCLUSO" type="{http://www.Abletech.it/Arxivar}Base_Selected" minOccurs="0"/>
 *         &lt;element name="STATO" type="{http://www.Abletech.it/Arxivar}Base_Selected" minOccurs="0"/>
 *         &lt;element name="DATA_SCADENZA" type="{http://www.Abletech.it/Arxivar}Base_Selected" minOccurs="0"/>
 *         &lt;element name="ABILITAEXPORT" type="{http://www.Abletech.it/Arxivar}Base_Selected" minOccurs="0"/>
 *         &lt;element name="ID_NODO" type="{http://www.Abletech.it/Arxivar}Base_Selected" minOccurs="0"/>
 *         &lt;element name="ISTRUZIONI" type="{http://www.Abletech.it/Arxivar}Base_Selected" minOccurs="0"/>
 *         &lt;element name="SELECTUSER" type="{http://www.Abletech.it/Arxivar}Base_Selected" minOccurs="0"/>
 *         &lt;element name="INPUTNEWDOC" type="{http://www.Abletech.it/Arxivar}Base_Selected" minOccurs="0"/>
 *         &lt;element name="INPUT_TYPE" type="{http://www.Abletech.it/Arxivar}Base_Selected" minOccurs="0"/>
 *         &lt;element name="EDITPROFILO" type="{http://www.Abletech.it/Arxivar}Base_Selected" minOccurs="0"/>
 *         &lt;element name="INSERTFOLDER" type="{http://www.Abletech.it/Arxivar}Base_Selected" minOccurs="0"/>
 *         &lt;element name="ASSOCIA" type="{http://www.Abletech.it/Arxivar}Base_Selected" minOccurs="0"/>
 *         &lt;element name="MODULO" type="{http://www.Abletech.it/Arxivar}Base_Selected" minOccurs="0"/>
 *         &lt;element name="TIPOTASK" type="{http://www.Abletech.it/Arxivar}Base_Selected" minOccurs="0"/>
 *         &lt;element name="MODESEC" type="{http://www.Abletech.it/Arxivar}Base_Selected" minOccurs="0"/>
 *         &lt;element name="NOTIFICAMAIL" type="{http://www.Abletech.it/Arxivar}Base_Selected" minOccurs="0"/>
 *         &lt;element name="AVANZATASK" type="{http://www.Abletech.it/Arxivar}Base_Selected" minOccurs="0"/>
 *         &lt;element name="PSWREQUIRED" type="{http://www.Abletech.it/Arxivar}Base_Selected" minOccurs="0"/>
 *         &lt;element name="NEWMEMO" type="{http://www.Abletech.it/Arxivar}Base_Selected" minOccurs="0"/>
 *         &lt;element name="LETTO" type="{http://www.Abletech.it/Arxivar}Base_Selected" minOccurs="0"/>
 *         &lt;element name="COMASINCRONO" type="{http://www.Abletech.it/Arxivar}Base_Selected" minOccurs="0"/>
 *         &lt;element name="COPIAEDIT" type="{http://www.Abletech.it/Arxivar}Base_Selected" minOccurs="0"/>
 *         &lt;element name="OBBCOM" type="{http://www.Abletech.it/Arxivar}Base_Selected" minOccurs="0"/>
 *         &lt;element name="SCADTASK" type="{http://www.Abletech.it/Arxivar}Base_Selected" minOccurs="0"/>
 *         &lt;element name="ATTIVATASK" type="{http://www.Abletech.it/Arxivar}Base_Selected" minOccurs="0"/>
 *         &lt;element name="DESCFIGURE" type="{http://www.Abletech.it/Arxivar}Base_Selected" minOccurs="0"/>
 *         &lt;element name="DESCVARIABILI" type="{http://www.Abletech.it/Arxivar}Base_Selected" minOccurs="0"/>
 *         &lt;element name="ID_ORG" type="{http://www.Abletech.it/Arxivar}Base_Selected" minOccurs="0"/>
 *         &lt;element name="ID_DELEGA" type="{http://www.Abletech.it/Arxivar}Base_Selected" minOccurs="0"/>
 *         &lt;element name="TASKAPERTO" type="{http://www.Abletech.it/Arxivar}Base_Selected" minOccurs="0"/>
 *         &lt;element name="ESITO" type="{http://www.Abletech.it/Arxivar}Base_Selected" minOccurs="0"/>
 *         &lt;element name="TASKDIGRUPPO" type="{http://www.Abletech.it/Arxivar}Base_Selected" minOccurs="0"/>
 *         &lt;element name="TIPO1" type="{http://www.Abletech.it/Arxivar}Base_Selected" minOccurs="0"/>
 *         &lt;element name="TIPO2" type="{http://www.Abletech.it/Arxivar}Base_Selected" minOccurs="0"/>
 *         &lt;element name="TIPO3" type="{http://www.Abletech.it/Arxivar}Base_Selected" minOccurs="0"/>
 *         &lt;element name="SELECTDOC" type="{http://www.Abletech.it/Arxivar}Base_Selected" minOccurs="0"/>
 *         &lt;element name="DM_WORKFLOW_DETTAGLIO" type="{http://www.Abletech.it/Arxivar}Base_Selected" minOccurs="0"/>
 *         &lt;element name="DM_WORKFLOW_NOME" type="{http://www.Abletech.it/Arxivar}Base_Selected" minOccurs="0"/>
 *         &lt;element name="DM_WORKFLOW_FILEFLW" type="{http://www.Abletech.it/Arxivar}Base_Selected" minOccurs="0"/>
 *         &lt;element name="DM_WORKFLOW_PERCORSO" type="{http://www.Abletech.it/Arxivar}Base_Selected" minOccurs="0"/>
 *         &lt;element name="DM_WORKFLOW_DESCRIZIONE" type="{http://www.Abletech.it/Arxivar}Base_Selected" minOccurs="0"/>
 *         &lt;element name="DM_WORKFLOW_STATO" type="{http://www.Abletech.it/Arxivar}Base_Selected" minOccurs="0"/>
 *         &lt;element name="DM_WORKFLOW_ORGANIGRAMMA" type="{http://www.Abletech.it/Arxivar}Base_Selected" minOccurs="0"/>
 *         &lt;element name="DM_WORKFLOW_AOO" type="{http://www.Abletech.it/Arxivar}Base_Selected" minOccurs="0"/>
 *         &lt;element name="DM_WORKFLOW_COLORE" type="{http://www.Abletech.it/Arxivar}Base_Selected" minOccurs="0"/>
 *         &lt;element name="DM_WORKFLOW_DOCNUMBER" type="{http://www.Abletech.it/Arxivar}Base_Selected" minOccurs="0"/>
 *         &lt;element name="DM_PROCESSI_NOTE" type="{http://www.Abletech.it/Arxivar}Base_Selected" minOccurs="0"/>
 *         &lt;element name="DM_PROCESSI_ALLEGATI" type="{http://www.Abletech.it/Arxivar}Base_Selected" minOccurs="0"/>
 *         &lt;element name="DM_PROCESSI_STATO" type="{http://www.Abletech.it/Arxivar}Base_Selected" minOccurs="0"/>
 *         &lt;element name="DM_PROCESSI_WORKFLOW" type="{http://www.Abletech.it/Arxivar}Base_Selected" minOccurs="0"/>
 *         &lt;element name="DM_PROCESSI_INIZIO" type="{http://www.Abletech.it/Arxivar}Base_Selected" minOccurs="0"/>
 *         &lt;element name="DM_PROCESSI_CONCLUSO" type="{http://www.Abletech.it/Arxivar}Base_Selected" minOccurs="0"/>
 *         &lt;element name="DM_PROCESSI_DATA_SCADENZA" type="{http://www.Abletech.it/Arxivar}Base_Selected" minOccurs="0"/>
 *         &lt;element name="DM_PROCESSI_COLORE" type="{http://www.Abletech.it/Arxivar}Base_Selected" minOccurs="0"/>
 *         &lt;element name="DM_PROCESSI_DESCRIZIONE" type="{http://www.Abletech.it/Arxivar}Base_Selected" minOccurs="0"/>
 *         &lt;element name="DM_UTENTI_DESCRIPTION" type="{http://www.Abletech.it/Arxivar}Base_Selected" minOccurs="0"/>
 *         &lt;element name="DM_TASKDOC_DESCRIZIONE" type="{http://www.Abletech.it/Arxivar}Base_Selected" minOccurs="0"/>
 *         &lt;element name="DM_TASKDOC_INPUTNEWDOC" type="{http://www.Abletech.it/Arxivar}Base_Selected" minOccurs="0"/>
 *         &lt;element name="DM_TASKDOC_DOCOBBLIGATORIO" type="{http://www.Abletech.it/Arxivar}Base_Selected" minOccurs="0"/>
 *         &lt;element name="DM_TASKDOC_TIPO1" type="{http://www.Abletech.it/Arxivar}Base_Selected" minOccurs="0"/>
 *         &lt;element name="DM_TASKDOC_TIPO2" type="{http://www.Abletech.it/Arxivar}Base_Selected" minOccurs="0"/>
 *         &lt;element name="DM_TASKDOC_TIPO3" type="{http://www.Abletech.it/Arxivar}Base_Selected" minOccurs="0"/>
 *         &lt;element name="DM_TASKDOC_OP_ESEGUITA" type="{http://www.Abletech.it/Arxivar}Base_Selected" minOccurs="0"/>
 *         &lt;element name="DM_TASKDOC_INPUT_TYPE" type="{http://www.Abletech.it/Arxivar}Base_Selected" minOccurs="0"/>
 *         &lt;element name="DM_PROFILE_DOCNUMBER" type="{http://www.Abletech.it/Arxivar}Base_Selected" minOccurs="0"/>
 *         &lt;element name="DM_PROFILE_DOCNAME" type="{http://www.Abletech.it/Arxivar}Base_Selected" minOccurs="0"/>
 *         &lt;element name="DM_PROFILE_DOCUMENTTYPE" type="{http://www.Abletech.it/Arxivar}Base_Selected" minOccurs="0"/>
 *         &lt;element name="DM_PROFILE_TIPO2" type="{http://www.Abletech.it/Arxivar}Base_Selected" minOccurs="0"/>
 *         &lt;element name="DM_PROFILE_TIPO3" type="{http://www.Abletech.it/Arxivar}Base_Selected" minOccurs="0"/>
 *         &lt;element name="DM_PROFILE_PATH" type="{http://www.Abletech.it/Arxivar}Base_Selected" minOccurs="0"/>
 *         &lt;element name="DM_PROFILE_FILENAME" type="{http://www.Abletech.it/Arxivar}Base_Selected" minOccurs="0"/>
 *         &lt;element name="DM_PROFILE_NUMERO" type="{http://www.Abletech.it/Arxivar}Base_Selected" minOccurs="0"/>
 *         &lt;element name="DM_PROFILE_DATADOC" type="{http://www.Abletech.it/Arxivar}Base_Selected" minOccurs="0"/>
 *         &lt;element name="DM_PROFILE_CC" type="{http://www.Abletech.it/Arxivar}Base_Selected" minOccurs="0"/>
 *         &lt;element name="DM_PROFILE_PROFILATO" type="{http://www.Abletech.it/Arxivar}Base_Selected" minOccurs="0"/>
 *         &lt;element name="DM_PROFILE_CREATION_DATE" type="{http://www.Abletech.it/Arxivar}Base_Selected" minOccurs="0"/>
 *         &lt;element name="DM_PROFILE_IMPORTANTE" type="{http://www.Abletech.it/Arxivar}Base_Selected" minOccurs="0"/>
 *         &lt;element name="DM_PROFILE_REVISIONE" type="{http://www.Abletech.it/Arxivar}Base_Selected" minOccurs="0"/>
 *         &lt;element name="DM_PROFILE_AUTORE" type="{http://www.Abletech.it/Arxivar}Base_Selected" minOccurs="0"/>
 *         &lt;element name="DM_PROFILE_NOTE" type="{http://www.Abletech.it/Arxivar}Base_Selected" minOccurs="0"/>
 *         &lt;element name="DM_PROFILE_PROTOCOLLO" type="{http://www.Abletech.it/Arxivar}Base_Selected" minOccurs="0"/>
 *         &lt;element name="DM_PROFILE_ANNO" type="{http://www.Abletech.it/Arxivar}Base_Selected" minOccurs="0"/>
 *         &lt;element name="DM_PROFILE_BLOCCATO" type="{http://www.Abletech.it/Arxivar}Base_Selected" minOccurs="0"/>
 *         &lt;element name="DM_PROFILE_STATO" type="{http://www.Abletech.it/Arxivar}Base_Selected" minOccurs="0"/>
 *         &lt;element name="DM_PROFILE_INOUT" type="{http://www.Abletech.it/Arxivar}Base_Selected" minOccurs="0"/>
 *         &lt;element name="DM_PROFILE_SCADENZA" type="{http://www.Abletech.it/Arxivar}Base_Selected" minOccurs="0"/>
 *         &lt;element name="DM_PROFILE_FLAG" type="{http://www.Abletech.it/Arxivar}Base_Selected" minOccurs="0"/>
 *         &lt;element name="DM_PROFILE_WORKFLOW" type="{http://www.Abletech.it/Arxivar}Base_Selected" minOccurs="0"/>
 *         &lt;element name="DM_PROFILE_ORIGINALE" type="{http://www.Abletech.it/Arxivar}Base_Selected" minOccurs="0"/>
 *         &lt;element name="DM_PROFILE_DATAFILE" type="{http://www.Abletech.it/Arxivar}Base_Selected" minOccurs="0"/>
 *         &lt;element name="DM_PROFILE_GESTREV" type="{http://www.Abletech.it/Arxivar}Base_Selected" minOccurs="0"/>
 *         &lt;element name="DM_PROFILE_DEVICE" type="{http://www.Abletech.it/Arxivar}Base_Selected" minOccurs="0"/>
 *         &lt;element name="DM_PROFILE_ALLEGATI" type="{http://www.Abletech.it/Arxivar}Base_Selected" minOccurs="0"/>
 *         &lt;element name="DM_PROFILE_OPENDOC" type="{http://www.Abletech.it/Arxivar}Base_Selected" minOccurs="0"/>
 *         &lt;element name="DM_PROFILE_ASSOCIAZIONI" type="{http://www.Abletech.it/Arxivar}Base_Selected" minOccurs="0"/>
 *         &lt;element name="DM_PROFILE_IMPRONTA" type="{http://www.Abletech.it/Arxivar}Base_Selected" minOccurs="0"/>
 *         &lt;element name="DM_PROFILE_EMERGENZA" type="{http://www.Abletech.it/Arxivar}Base_Selected" minOccurs="0"/>
 *         &lt;element name="DM_PROFILE_AOO" type="{http://www.Abletech.it/Arxivar}Base_Selected" minOccurs="0"/>
 *         &lt;element name="DM_PROFILE_WEBVISIBLE" type="{http://www.Abletech.it/Arxivar}Base_Selected" minOccurs="0"/>
 *         &lt;element name="DM_PROFILE_ISAOS" type="{http://www.Abletech.it/Arxivar}Base_Selected" minOccurs="0"/>
 *         &lt;element name="DM_PROFILE_INVOICE" type="{http://www.Abletech.it/Arxivar}Base_Selected" minOccurs="0"/>
 *         &lt;element name="DM_PROFILE_SCADAOS" type="{http://www.Abletech.it/Arxivar}Base_Selected" minOccurs="0"/>
 *         &lt;element name="DM_PROFILE_ETICHETTACD" type="{http://www.Abletech.it/Arxivar}Base_Selected" minOccurs="0"/>
 *         &lt;element name="DM_PROFILE_ETI_READER" type="{http://www.Abletech.it/Arxivar}Base_Selected" minOccurs="0"/>
 *         &lt;element name="DM_PROFILE_DATAPROT" type="{http://www.Abletech.it/Arxivar}Base_Selected" minOccurs="0"/>
 *         &lt;element name="DM_PROFILE_AGGIUNTIVI" type="{http://www.Abletech.it/Arxivar}ArrayOfAggiuntivo_Selected" minOccurs="0"/>
 *         &lt;element name="DM_PROFILE_PRATICHE" type="{http://www.Abletech.it/Arxivar}Base_Selected" minOccurs="0"/>
 *         &lt;element name="DM_PROFILE_STATOPROCDESC" type="{http://www.Abletech.it/Arxivar}Base_Selected" minOccurs="0"/>
 *         &lt;element name="DM_PROFILE_MITTENTE" type="{http://www.Abletech.it/Arxivar}Base_Selected" minOccurs="0"/>
 *         &lt;element name="DM_PROFILE_DESTINATARIO" type="{http://www.Abletech.it/Arxivar}Base_Selected" minOccurs="0"/>
 *         &lt;element name="DM_FASCICOLI_NOME" type="{http://www.Abletech.it/Arxivar}Base_Selected" minOccurs="0"/>
 *         &lt;element name="DM_TASKEXECUTE_IDUTENTE" type="{http://www.Abletech.it/Arxivar}Base_Selected" minOccurs="0"/>
 *         &lt;element name="DM_TASKEXECUTE_AOO" type="{http://www.Abletech.it/Arxivar}Base_Selected" minOccurs="0"/>
 *         &lt;element name="DM_TASKEXECUTE_UTENTECOMPLETO" type="{http://www.Abletech.it/Arxivar}Base_Selected" minOccurs="0"/>
 *         &lt;element name="DM_TASKEXECUTE_GRUPPOUTENTE" type="{http://www.Abletech.it/Arxivar}Base_Selected" minOccurs="0"/>
 *         &lt;element name="DM_TASKEXECUTE_ESITO_TASK" type="{http://www.Abletech.it/Arxivar}Base_Selected" minOccurs="0"/>
 *         &lt;element name="DM_TASKEXECUTE_METODO" type="{http://www.Abletech.it/Arxivar}Base_Selected" minOccurs="0"/>
 *         &lt;element name="DM_TASKEXECUTE_DATA" type="{http://www.Abletech.it/Arxivar}Base_Selected" minOccurs="0"/>
 *         &lt;element name="DM_TASKEXECUTE_NOTATASK" type="{http://www.Abletech.it/Arxivar}Base_Selected" minOccurs="0"/>
 *         &lt;element name="DM_TASKEXECUTE_INELABORAZIONE" type="{http://www.Abletech.it/Arxivar}Base_Selected" minOccurs="0"/>
 *         &lt;element name="DM_UTENTI_AOO" type="{http://www.Abletech.it/Arxivar}Base_Selected" minOccurs="0"/>
 *         &lt;element name="DM_PROFILE_AUTOREDESCRIPTION" type="{http://www.Abletech.it/Arxivar}Base_Selected" minOccurs="0"/>
 *         &lt;element name="DM_PROFILE_SENDERS" type="{http://www.Abletech.it/Arxivar}Base_Selected" minOccurs="0"/>
 *         &lt;element name="MaxRowCount" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="GetRowCount" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="Distinct" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Dm_TaskWork_Select", propOrder = {
    "id",
    "idprocesso",
    "note",
    "allegati",
    "docnumber",
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
    "dmworkflowdettaglio",
    "dmworkflownome",
    "dmworkflowfileflw",
    "dmworkflowpercorso",
    "dmworkflowdescrizione",
    "dmworkflowstato",
    "dmworkfloworganigramma",
    "dmworkflowaoo",
    "dmworkflowcolore",
    "dmworkflowdocnumber",
    "dmprocessinote",
    "dmprocessiallegati",
    "dmprocessistato",
    "dmprocessiworkflow",
    "dmprocessiinizio",
    "dmprocessiconcluso",
    "dmprocessidatascadenza",
    "dmprocessicolore",
    "dmprocessidescrizione",
    "dmutentidescription",
    "dmtaskdocdescrizione",
    "dmtaskdocinputnewdoc",
    "dmtaskdocdocobbligatorio",
    "dmtaskdoctipo1",
    "dmtaskdoctipo2",
    "dmtaskdoctipo3",
    "dmtaskdocopeseguita",
    "dmtaskdocinputtype",
    "dmprofiledocnumber",
    "dmprofiledocname",
    "dmprofiledocumenttype",
    "dmprofiletipo2",
    "dmprofiletipo3",
    "dmprofilepath",
    "dmprofilefilename",
    "dmprofilenumero",
    "dmprofiledatadoc",
    "dmprofilecc",
    "dmprofileprofilato",
    "dmprofilecreationdate",
    "dmprofileimportante",
    "dmprofilerevisione",
    "dmprofileautore",
    "dmprofilenote",
    "dmprofileprotocollo",
    "dmprofileanno",
    "dmprofilebloccato",
    "dmprofilestato",
    "dmprofileinout",
    "dmprofilescadenza",
    "dmprofileflag",
    "dmprofileworkflow",
    "dmprofileoriginale",
    "dmprofiledatafile",
    "dmprofilegestrev",
    "dmprofiledevice",
    "dmprofileallegati",
    "dmprofileopendoc",
    "dmprofileassociazioni",
    "dmprofileimpronta",
    "dmprofileemergenza",
    "dmprofileaoo",
    "dmprofilewebvisible",
    "dmprofileisaos",
    "dmprofileinvoice",
    "dmprofilescadaos",
    "dmprofileetichettacd",
    "dmprofileetireader",
    "dmprofiledataprot",
    "dmprofileaggiuntivi",
    "dmprofilepratiche",
    "dmprofilestatoprocdesc",
    "dmprofilemittente",
    "dmprofiledestinatario",
    "dmfascicolinome",
    "dmtaskexecuteidutente",
    "dmtaskexecuteaoo",
    "dmtaskexecuteutentecompleto",
    "dmtaskexecutegruppoutente",
    "dmtaskexecuteesitotask",
    "dmtaskexecutemetodo",
    "dmtaskexecutedata",
    "dmtaskexecutenotatask",
    "dmtaskexecuteinelaborazione",
    "dmutentiaoo",
    "dmprofileautoredescription",
    "dmprofilesenders",
    "maxRowCount",
    "getRowCount",
    "distinct"
})
public class DmTaskWorkSelect {

    @XmlElement(name = "ID")
    protected BaseSelected id;
    @XmlElement(name = "ID_PROCESSO")
    protected BaseSelected idprocesso;
    @XmlElement(name = "NOTE")
    protected BaseSelected note;
    @XmlElement(name = "ALLEGATI")
    protected BaseSelected allegati;
    @XmlElement(name = "DOCNUMBER")
    protected BaseSelected docnumber;
    @XmlElement(name = "REVISIONE")
    protected BaseSelected revisione;
    @XmlElement(name = "DATAINIZIO")
    protected BaseSelected datainizio;
    @XmlElement(name = "NOMETASK")
    protected BaseSelected nometask;
    @XmlElement(name = "DESCTASK")
    protected BaseSelected desctask;
    @XmlElement(name = "UTENTE")
    protected BaseSelected utente;
    @XmlElement(name = "CONCLUSO")
    protected BaseSelected concluso;
    @XmlElement(name = "STATO")
    protected BaseSelected stato;
    @XmlElement(name = "DATA_SCADENZA")
    protected BaseSelected datascadenza;
    @XmlElement(name = "ABILITAEXPORT")
    protected BaseSelected abilitaexport;
    @XmlElement(name = "ID_NODO")
    protected BaseSelected idnodo;
    @XmlElement(name = "ISTRUZIONI")
    protected BaseSelected istruzioni;
    @XmlElement(name = "SELECTUSER")
    protected BaseSelected selectuser;
    @XmlElement(name = "INPUTNEWDOC")
    protected BaseSelected inputnewdoc;
    @XmlElement(name = "INPUT_TYPE")
    protected BaseSelected inputtype;
    @XmlElement(name = "EDITPROFILO")
    protected BaseSelected editprofilo;
    @XmlElement(name = "INSERTFOLDER")
    protected BaseSelected insertfolder;
    @XmlElement(name = "ASSOCIA")
    protected BaseSelected associa;
    @XmlElement(name = "MODULO")
    protected BaseSelected modulo;
    @XmlElement(name = "TIPOTASK")
    protected BaseSelected tipotask;
    @XmlElement(name = "MODESEC")
    protected BaseSelected modesec;
    @XmlElement(name = "NOTIFICAMAIL")
    protected BaseSelected notificamail;
    @XmlElement(name = "AVANZATASK")
    protected BaseSelected avanzatask;
    @XmlElement(name = "PSWREQUIRED")
    protected BaseSelected pswrequired;
    @XmlElement(name = "NEWMEMO")
    protected BaseSelected newmemo;
    @XmlElement(name = "LETTO")
    protected BaseSelected letto;
    @XmlElement(name = "COMASINCRONO")
    protected BaseSelected comasincrono;
    @XmlElement(name = "COPIAEDIT")
    protected BaseSelected copiaedit;
    @XmlElement(name = "OBBCOM")
    protected BaseSelected obbcom;
    @XmlElement(name = "SCADTASK")
    protected BaseSelected scadtask;
    @XmlElement(name = "ATTIVATASK")
    protected BaseSelected attivatask;
    @XmlElement(name = "DESCFIGURE")
    protected BaseSelected descfigure;
    @XmlElement(name = "DESCVARIABILI")
    protected BaseSelected descvariabili;
    @XmlElement(name = "ID_ORG")
    protected BaseSelected idorg;
    @XmlElement(name = "ID_DELEGA")
    protected BaseSelected iddelega;
    @XmlElement(name = "TASKAPERTO")
    protected BaseSelected taskaperto;
    @XmlElement(name = "ESITO")
    protected BaseSelected esito;
    @XmlElement(name = "TASKDIGRUPPO")
    protected BaseSelected taskdigruppo;
    @XmlElement(name = "TIPO1")
    protected BaseSelected tipo1;
    @XmlElement(name = "TIPO2")
    protected BaseSelected tipo2;
    @XmlElement(name = "TIPO3")
    protected BaseSelected tipo3;
    @XmlElement(name = "SELECTDOC")
    protected BaseSelected selectdoc;
    @XmlElement(name = "DM_WORKFLOW_DETTAGLIO")
    protected BaseSelected dmworkflowdettaglio;
    @XmlElement(name = "DM_WORKFLOW_NOME")
    protected BaseSelected dmworkflownome;
    @XmlElement(name = "DM_WORKFLOW_FILEFLW")
    protected BaseSelected dmworkflowfileflw;
    @XmlElement(name = "DM_WORKFLOW_PERCORSO")
    protected BaseSelected dmworkflowpercorso;
    @XmlElement(name = "DM_WORKFLOW_DESCRIZIONE")
    protected BaseSelected dmworkflowdescrizione;
    @XmlElement(name = "DM_WORKFLOW_STATO")
    protected BaseSelected dmworkflowstato;
    @XmlElement(name = "DM_WORKFLOW_ORGANIGRAMMA")
    protected BaseSelected dmworkfloworganigramma;
    @XmlElement(name = "DM_WORKFLOW_AOO")
    protected BaseSelected dmworkflowaoo;
    @XmlElement(name = "DM_WORKFLOW_COLORE")
    protected BaseSelected dmworkflowcolore;
    @XmlElement(name = "DM_WORKFLOW_DOCNUMBER")
    protected BaseSelected dmworkflowdocnumber;
    @XmlElement(name = "DM_PROCESSI_NOTE")
    protected BaseSelected dmprocessinote;
    @XmlElement(name = "DM_PROCESSI_ALLEGATI")
    protected BaseSelected dmprocessiallegati;
    @XmlElement(name = "DM_PROCESSI_STATO")
    protected BaseSelected dmprocessistato;
    @XmlElement(name = "DM_PROCESSI_WORKFLOW")
    protected BaseSelected dmprocessiworkflow;
    @XmlElement(name = "DM_PROCESSI_INIZIO")
    protected BaseSelected dmprocessiinizio;
    @XmlElement(name = "DM_PROCESSI_CONCLUSO")
    protected BaseSelected dmprocessiconcluso;
    @XmlElement(name = "DM_PROCESSI_DATA_SCADENZA")
    protected BaseSelected dmprocessidatascadenza;
    @XmlElement(name = "DM_PROCESSI_COLORE")
    protected BaseSelected dmprocessicolore;
    @XmlElement(name = "DM_PROCESSI_DESCRIZIONE")
    protected BaseSelected dmprocessidescrizione;
    @XmlElement(name = "DM_UTENTI_DESCRIPTION")
    protected BaseSelected dmutentidescription;
    @XmlElement(name = "DM_TASKDOC_DESCRIZIONE")
    protected BaseSelected dmtaskdocdescrizione;
    @XmlElement(name = "DM_TASKDOC_INPUTNEWDOC")
    protected BaseSelected dmtaskdocinputnewdoc;
    @XmlElement(name = "DM_TASKDOC_DOCOBBLIGATORIO")
    protected BaseSelected dmtaskdocdocobbligatorio;
    @XmlElement(name = "DM_TASKDOC_TIPO1")
    protected BaseSelected dmtaskdoctipo1;
    @XmlElement(name = "DM_TASKDOC_TIPO2")
    protected BaseSelected dmtaskdoctipo2;
    @XmlElement(name = "DM_TASKDOC_TIPO3")
    protected BaseSelected dmtaskdoctipo3;
    @XmlElement(name = "DM_TASKDOC_OP_ESEGUITA")
    protected BaseSelected dmtaskdocopeseguita;
    @XmlElement(name = "DM_TASKDOC_INPUT_TYPE")
    protected BaseSelected dmtaskdocinputtype;
    @XmlElement(name = "DM_PROFILE_DOCNUMBER")
    protected BaseSelected dmprofiledocnumber;
    @XmlElement(name = "DM_PROFILE_DOCNAME")
    protected BaseSelected dmprofiledocname;
    @XmlElement(name = "DM_PROFILE_DOCUMENTTYPE")
    protected BaseSelected dmprofiledocumenttype;
    @XmlElement(name = "DM_PROFILE_TIPO2")
    protected BaseSelected dmprofiletipo2;
    @XmlElement(name = "DM_PROFILE_TIPO3")
    protected BaseSelected dmprofiletipo3;
    @XmlElement(name = "DM_PROFILE_PATH")
    protected BaseSelected dmprofilepath;
    @XmlElement(name = "DM_PROFILE_FILENAME")
    protected BaseSelected dmprofilefilename;
    @XmlElement(name = "DM_PROFILE_NUMERO")
    protected BaseSelected dmprofilenumero;
    @XmlElement(name = "DM_PROFILE_DATADOC")
    protected BaseSelected dmprofiledatadoc;
    @XmlElement(name = "DM_PROFILE_CC")
    protected BaseSelected dmprofilecc;
    @XmlElement(name = "DM_PROFILE_PROFILATO")
    protected BaseSelected dmprofileprofilato;
    @XmlElement(name = "DM_PROFILE_CREATION_DATE")
    protected BaseSelected dmprofilecreationdate;
    @XmlElement(name = "DM_PROFILE_IMPORTANTE")
    protected BaseSelected dmprofileimportante;
    @XmlElement(name = "DM_PROFILE_REVISIONE")
    protected BaseSelected dmprofilerevisione;
    @XmlElement(name = "DM_PROFILE_AUTORE")
    protected BaseSelected dmprofileautore;
    @XmlElement(name = "DM_PROFILE_NOTE")
    protected BaseSelected dmprofilenote;
    @XmlElement(name = "DM_PROFILE_PROTOCOLLO")
    protected BaseSelected dmprofileprotocollo;
    @XmlElement(name = "DM_PROFILE_ANNO")
    protected BaseSelected dmprofileanno;
    @XmlElement(name = "DM_PROFILE_BLOCCATO")
    protected BaseSelected dmprofilebloccato;
    @XmlElement(name = "DM_PROFILE_STATO")
    protected BaseSelected dmprofilestato;
    @XmlElement(name = "DM_PROFILE_INOUT")
    protected BaseSelected dmprofileinout;
    @XmlElement(name = "DM_PROFILE_SCADENZA")
    protected BaseSelected dmprofilescadenza;
    @XmlElement(name = "DM_PROFILE_FLAG")
    protected BaseSelected dmprofileflag;
    @XmlElement(name = "DM_PROFILE_WORKFLOW")
    protected BaseSelected dmprofileworkflow;
    @XmlElement(name = "DM_PROFILE_ORIGINALE")
    protected BaseSelected dmprofileoriginale;
    @XmlElement(name = "DM_PROFILE_DATAFILE")
    protected BaseSelected dmprofiledatafile;
    @XmlElement(name = "DM_PROFILE_GESTREV")
    protected BaseSelected dmprofilegestrev;
    @XmlElement(name = "DM_PROFILE_DEVICE")
    protected BaseSelected dmprofiledevice;
    @XmlElement(name = "DM_PROFILE_ALLEGATI")
    protected BaseSelected dmprofileallegati;
    @XmlElement(name = "DM_PROFILE_OPENDOC")
    protected BaseSelected dmprofileopendoc;
    @XmlElement(name = "DM_PROFILE_ASSOCIAZIONI")
    protected BaseSelected dmprofileassociazioni;
    @XmlElement(name = "DM_PROFILE_IMPRONTA")
    protected BaseSelected dmprofileimpronta;
    @XmlElement(name = "DM_PROFILE_EMERGENZA")
    protected BaseSelected dmprofileemergenza;
    @XmlElement(name = "DM_PROFILE_AOO")
    protected BaseSelected dmprofileaoo;
    @XmlElement(name = "DM_PROFILE_WEBVISIBLE")
    protected BaseSelected dmprofilewebvisible;
    @XmlElement(name = "DM_PROFILE_ISAOS")
    protected BaseSelected dmprofileisaos;
    @XmlElement(name = "DM_PROFILE_INVOICE")
    protected BaseSelected dmprofileinvoice;
    @XmlElement(name = "DM_PROFILE_SCADAOS")
    protected BaseSelected dmprofilescadaos;
    @XmlElement(name = "DM_PROFILE_ETICHETTACD")
    protected BaseSelected dmprofileetichettacd;
    @XmlElement(name = "DM_PROFILE_ETI_READER")
    protected BaseSelected dmprofileetireader;
    @XmlElement(name = "DM_PROFILE_DATAPROT")
    protected BaseSelected dmprofiledataprot;
    @XmlElement(name = "DM_PROFILE_AGGIUNTIVI")
    protected ArrayOfAggiuntivoSelected dmprofileaggiuntivi;
    @XmlElement(name = "DM_PROFILE_PRATICHE")
    protected BaseSelected dmprofilepratiche;
    @XmlElement(name = "DM_PROFILE_STATOPROCDESC")
    protected BaseSelected dmprofilestatoprocdesc;
    @XmlElement(name = "DM_PROFILE_MITTENTE")
    protected BaseSelected dmprofilemittente;
    @XmlElement(name = "DM_PROFILE_DESTINATARIO")
    protected BaseSelected dmprofiledestinatario;
    @XmlElement(name = "DM_FASCICOLI_NOME")
    protected BaseSelected dmfascicolinome;
    @XmlElement(name = "DM_TASKEXECUTE_IDUTENTE")
    protected BaseSelected dmtaskexecuteidutente;
    @XmlElement(name = "DM_TASKEXECUTE_AOO")
    protected BaseSelected dmtaskexecuteaoo;
    @XmlElement(name = "DM_TASKEXECUTE_UTENTECOMPLETO")
    protected BaseSelected dmtaskexecuteutentecompleto;
    @XmlElement(name = "DM_TASKEXECUTE_GRUPPOUTENTE")
    protected BaseSelected dmtaskexecutegruppoutente;
    @XmlElement(name = "DM_TASKEXECUTE_ESITO_TASK")
    protected BaseSelected dmtaskexecuteesitotask;
    @XmlElement(name = "DM_TASKEXECUTE_METODO")
    protected BaseSelected dmtaskexecutemetodo;
    @XmlElement(name = "DM_TASKEXECUTE_DATA")
    protected BaseSelected dmtaskexecutedata;
    @XmlElement(name = "DM_TASKEXECUTE_NOTATASK")
    protected BaseSelected dmtaskexecutenotatask;
    @XmlElement(name = "DM_TASKEXECUTE_INELABORAZIONE")
    protected BaseSelected dmtaskexecuteinelaborazione;
    @XmlElement(name = "DM_UTENTI_AOO")
    protected BaseSelected dmutentiaoo;
    @XmlElement(name = "DM_PROFILE_AUTOREDESCRIPTION")
    protected BaseSelected dmprofileautoredescription;
    @XmlElement(name = "DM_PROFILE_SENDERS")
    protected BaseSelected dmprofilesenders;
    @XmlElement(name = "MaxRowCount")
    protected int maxRowCount;
    @XmlElement(name = "GetRowCount")
    protected boolean getRowCount;
    @XmlElement(name = "Distinct")
    protected boolean distinct;

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link BaseSelected }
     *     
     */
    public BaseSelected getID() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link BaseSelected }
     *     
     */
    public void setID(BaseSelected value) {
        this.id = value;
    }

    /**
     * Gets the value of the idprocesso property.
     * 
     * @return
     *     possible object is
     *     {@link BaseSelected }
     *     
     */
    public BaseSelected getIDPROCESSO() {
        return idprocesso;
    }

    /**
     * Sets the value of the idprocesso property.
     * 
     * @param value
     *     allowed object is
     *     {@link BaseSelected }
     *     
     */
    public void setIDPROCESSO(BaseSelected value) {
        this.idprocesso = value;
    }

    /**
     * Gets the value of the note property.
     * 
     * @return
     *     possible object is
     *     {@link BaseSelected }
     *     
     */
    public BaseSelected getNOTE() {
        return note;
    }

    /**
     * Sets the value of the note property.
     * 
     * @param value
     *     allowed object is
     *     {@link BaseSelected }
     *     
     */
    public void setNOTE(BaseSelected value) {
        this.note = value;
    }

    /**
     * Gets the value of the allegati property.
     * 
     * @return
     *     possible object is
     *     {@link BaseSelected }
     *     
     */
    public BaseSelected getALLEGATI() {
        return allegati;
    }

    /**
     * Sets the value of the allegati property.
     * 
     * @param value
     *     allowed object is
     *     {@link BaseSelected }
     *     
     */
    public void setALLEGATI(BaseSelected value) {
        this.allegati = value;
    }

    /**
     * Gets the value of the docnumber property.
     * 
     * @return
     *     possible object is
     *     {@link BaseSelected }
     *     
     */
    public BaseSelected getDOCNUMBER() {
        return docnumber;
    }

    /**
     * Sets the value of the docnumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link BaseSelected }
     *     
     */
    public void setDOCNUMBER(BaseSelected value) {
        this.docnumber = value;
    }

    /**
     * Gets the value of the revisione property.
     * 
     * @return
     *     possible object is
     *     {@link BaseSelected }
     *     
     */
    public BaseSelected getREVISIONE() {
        return revisione;
    }

    /**
     * Sets the value of the revisione property.
     * 
     * @param value
     *     allowed object is
     *     {@link BaseSelected }
     *     
     */
    public void setREVISIONE(BaseSelected value) {
        this.revisione = value;
    }

    /**
     * Gets the value of the datainizio property.
     * 
     * @return
     *     possible object is
     *     {@link BaseSelected }
     *     
     */
    public BaseSelected getDATAINIZIO() {
        return datainizio;
    }

    /**
     * Sets the value of the datainizio property.
     * 
     * @param value
     *     allowed object is
     *     {@link BaseSelected }
     *     
     */
    public void setDATAINIZIO(BaseSelected value) {
        this.datainizio = value;
    }

    /**
     * Gets the value of the nometask property.
     * 
     * @return
     *     possible object is
     *     {@link BaseSelected }
     *     
     */
    public BaseSelected getNOMETASK() {
        return nometask;
    }

    /**
     * Sets the value of the nometask property.
     * 
     * @param value
     *     allowed object is
     *     {@link BaseSelected }
     *     
     */
    public void setNOMETASK(BaseSelected value) {
        this.nometask = value;
    }

    /**
     * Gets the value of the desctask property.
     * 
     * @return
     *     possible object is
     *     {@link BaseSelected }
     *     
     */
    public BaseSelected getDESCTASK() {
        return desctask;
    }

    /**
     * Sets the value of the desctask property.
     * 
     * @param value
     *     allowed object is
     *     {@link BaseSelected }
     *     
     */
    public void setDESCTASK(BaseSelected value) {
        this.desctask = value;
    }

    /**
     * Gets the value of the utente property.
     * 
     * @return
     *     possible object is
     *     {@link BaseSelected }
     *     
     */
    public BaseSelected getUTENTE() {
        return utente;
    }

    /**
     * Sets the value of the utente property.
     * 
     * @param value
     *     allowed object is
     *     {@link BaseSelected }
     *     
     */
    public void setUTENTE(BaseSelected value) {
        this.utente = value;
    }

    /**
     * Gets the value of the concluso property.
     * 
     * @return
     *     possible object is
     *     {@link BaseSelected }
     *     
     */
    public BaseSelected getCONCLUSO() {
        return concluso;
    }

    /**
     * Sets the value of the concluso property.
     * 
     * @param value
     *     allowed object is
     *     {@link BaseSelected }
     *     
     */
    public void setCONCLUSO(BaseSelected value) {
        this.concluso = value;
    }

    /**
     * Gets the value of the stato property.
     * 
     * @return
     *     possible object is
     *     {@link BaseSelected }
     *     
     */
    public BaseSelected getSTATO() {
        return stato;
    }

    /**
     * Sets the value of the stato property.
     * 
     * @param value
     *     allowed object is
     *     {@link BaseSelected }
     *     
     */
    public void setSTATO(BaseSelected value) {
        this.stato = value;
    }

    /**
     * Gets the value of the datascadenza property.
     * 
     * @return
     *     possible object is
     *     {@link BaseSelected }
     *     
     */
    public BaseSelected getDATASCADENZA() {
        return datascadenza;
    }

    /**
     * Sets the value of the datascadenza property.
     * 
     * @param value
     *     allowed object is
     *     {@link BaseSelected }
     *     
     */
    public void setDATASCADENZA(BaseSelected value) {
        this.datascadenza = value;
    }

    /**
     * Gets the value of the abilitaexport property.
     * 
     * @return
     *     possible object is
     *     {@link BaseSelected }
     *     
     */
    public BaseSelected getABILITAEXPORT() {
        return abilitaexport;
    }

    /**
     * Sets the value of the abilitaexport property.
     * 
     * @param value
     *     allowed object is
     *     {@link BaseSelected }
     *     
     */
    public void setABILITAEXPORT(BaseSelected value) {
        this.abilitaexport = value;
    }

    /**
     * Gets the value of the idnodo property.
     * 
     * @return
     *     possible object is
     *     {@link BaseSelected }
     *     
     */
    public BaseSelected getIDNODO() {
        return idnodo;
    }

    /**
     * Sets the value of the idnodo property.
     * 
     * @param value
     *     allowed object is
     *     {@link BaseSelected }
     *     
     */
    public void setIDNODO(BaseSelected value) {
        this.idnodo = value;
    }

    /**
     * Gets the value of the istruzioni property.
     * 
     * @return
     *     possible object is
     *     {@link BaseSelected }
     *     
     */
    public BaseSelected getISTRUZIONI() {
        return istruzioni;
    }

    /**
     * Sets the value of the istruzioni property.
     * 
     * @param value
     *     allowed object is
     *     {@link BaseSelected }
     *     
     */
    public void setISTRUZIONI(BaseSelected value) {
        this.istruzioni = value;
    }

    /**
     * Gets the value of the selectuser property.
     * 
     * @return
     *     possible object is
     *     {@link BaseSelected }
     *     
     */
    public BaseSelected getSELECTUSER() {
        return selectuser;
    }

    /**
     * Sets the value of the selectuser property.
     * 
     * @param value
     *     allowed object is
     *     {@link BaseSelected }
     *     
     */
    public void setSELECTUSER(BaseSelected value) {
        this.selectuser = value;
    }

    /**
     * Gets the value of the inputnewdoc property.
     * 
     * @return
     *     possible object is
     *     {@link BaseSelected }
     *     
     */
    public BaseSelected getINPUTNEWDOC() {
        return inputnewdoc;
    }

    /**
     * Sets the value of the inputnewdoc property.
     * 
     * @param value
     *     allowed object is
     *     {@link BaseSelected }
     *     
     */
    public void setINPUTNEWDOC(BaseSelected value) {
        this.inputnewdoc = value;
    }

    /**
     * Gets the value of the inputtype property.
     * 
     * @return
     *     possible object is
     *     {@link BaseSelected }
     *     
     */
    public BaseSelected getINPUTTYPE() {
        return inputtype;
    }

    /**
     * Sets the value of the inputtype property.
     * 
     * @param value
     *     allowed object is
     *     {@link BaseSelected }
     *     
     */
    public void setINPUTTYPE(BaseSelected value) {
        this.inputtype = value;
    }

    /**
     * Gets the value of the editprofilo property.
     * 
     * @return
     *     possible object is
     *     {@link BaseSelected }
     *     
     */
    public BaseSelected getEDITPROFILO() {
        return editprofilo;
    }

    /**
     * Sets the value of the editprofilo property.
     * 
     * @param value
     *     allowed object is
     *     {@link BaseSelected }
     *     
     */
    public void setEDITPROFILO(BaseSelected value) {
        this.editprofilo = value;
    }

    /**
     * Gets the value of the insertfolder property.
     * 
     * @return
     *     possible object is
     *     {@link BaseSelected }
     *     
     */
    public BaseSelected getINSERTFOLDER() {
        return insertfolder;
    }

    /**
     * Sets the value of the insertfolder property.
     * 
     * @param value
     *     allowed object is
     *     {@link BaseSelected }
     *     
     */
    public void setINSERTFOLDER(BaseSelected value) {
        this.insertfolder = value;
    }

    /**
     * Gets the value of the associa property.
     * 
     * @return
     *     possible object is
     *     {@link BaseSelected }
     *     
     */
    public BaseSelected getASSOCIA() {
        return associa;
    }

    /**
     * Sets the value of the associa property.
     * 
     * @param value
     *     allowed object is
     *     {@link BaseSelected }
     *     
     */
    public void setASSOCIA(BaseSelected value) {
        this.associa = value;
    }

    /**
     * Gets the value of the modulo property.
     * 
     * @return
     *     possible object is
     *     {@link BaseSelected }
     *     
     */
    public BaseSelected getMODULO() {
        return modulo;
    }

    /**
     * Sets the value of the modulo property.
     * 
     * @param value
     *     allowed object is
     *     {@link BaseSelected }
     *     
     */
    public void setMODULO(BaseSelected value) {
        this.modulo = value;
    }

    /**
     * Gets the value of the tipotask property.
     * 
     * @return
     *     possible object is
     *     {@link BaseSelected }
     *     
     */
    public BaseSelected getTIPOTASK() {
        return tipotask;
    }

    /**
     * Sets the value of the tipotask property.
     * 
     * @param value
     *     allowed object is
     *     {@link BaseSelected }
     *     
     */
    public void setTIPOTASK(BaseSelected value) {
        this.tipotask = value;
    }

    /**
     * Gets the value of the modesec property.
     * 
     * @return
     *     possible object is
     *     {@link BaseSelected }
     *     
     */
    public BaseSelected getMODESEC() {
        return modesec;
    }

    /**
     * Sets the value of the modesec property.
     * 
     * @param value
     *     allowed object is
     *     {@link BaseSelected }
     *     
     */
    public void setMODESEC(BaseSelected value) {
        this.modesec = value;
    }

    /**
     * Gets the value of the notificamail property.
     * 
     * @return
     *     possible object is
     *     {@link BaseSelected }
     *     
     */
    public BaseSelected getNOTIFICAMAIL() {
        return notificamail;
    }

    /**
     * Sets the value of the notificamail property.
     * 
     * @param value
     *     allowed object is
     *     {@link BaseSelected }
     *     
     */
    public void setNOTIFICAMAIL(BaseSelected value) {
        this.notificamail = value;
    }

    /**
     * Gets the value of the avanzatask property.
     * 
     * @return
     *     possible object is
     *     {@link BaseSelected }
     *     
     */
    public BaseSelected getAVANZATASK() {
        return avanzatask;
    }

    /**
     * Sets the value of the avanzatask property.
     * 
     * @param value
     *     allowed object is
     *     {@link BaseSelected }
     *     
     */
    public void setAVANZATASK(BaseSelected value) {
        this.avanzatask = value;
    }

    /**
     * Gets the value of the pswrequired property.
     * 
     * @return
     *     possible object is
     *     {@link BaseSelected }
     *     
     */
    public BaseSelected getPSWREQUIRED() {
        return pswrequired;
    }

    /**
     * Sets the value of the pswrequired property.
     * 
     * @param value
     *     allowed object is
     *     {@link BaseSelected }
     *     
     */
    public void setPSWREQUIRED(BaseSelected value) {
        this.pswrequired = value;
    }

    /**
     * Gets the value of the newmemo property.
     * 
     * @return
     *     possible object is
     *     {@link BaseSelected }
     *     
     */
    public BaseSelected getNEWMEMO() {
        return newmemo;
    }

    /**
     * Sets the value of the newmemo property.
     * 
     * @param value
     *     allowed object is
     *     {@link BaseSelected }
     *     
     */
    public void setNEWMEMO(BaseSelected value) {
        this.newmemo = value;
    }

    /**
     * Gets the value of the letto property.
     * 
     * @return
     *     possible object is
     *     {@link BaseSelected }
     *     
     */
    public BaseSelected getLETTO() {
        return letto;
    }

    /**
     * Sets the value of the letto property.
     * 
     * @param value
     *     allowed object is
     *     {@link BaseSelected }
     *     
     */
    public void setLETTO(BaseSelected value) {
        this.letto = value;
    }

    /**
     * Gets the value of the comasincrono property.
     * 
     * @return
     *     possible object is
     *     {@link BaseSelected }
     *     
     */
    public BaseSelected getCOMASINCRONO() {
        return comasincrono;
    }

    /**
     * Sets the value of the comasincrono property.
     * 
     * @param value
     *     allowed object is
     *     {@link BaseSelected }
     *     
     */
    public void setCOMASINCRONO(BaseSelected value) {
        this.comasincrono = value;
    }

    /**
     * Gets the value of the copiaedit property.
     * 
     * @return
     *     possible object is
     *     {@link BaseSelected }
     *     
     */
    public BaseSelected getCOPIAEDIT() {
        return copiaedit;
    }

    /**
     * Sets the value of the copiaedit property.
     * 
     * @param value
     *     allowed object is
     *     {@link BaseSelected }
     *     
     */
    public void setCOPIAEDIT(BaseSelected value) {
        this.copiaedit = value;
    }

    /**
     * Gets the value of the obbcom property.
     * 
     * @return
     *     possible object is
     *     {@link BaseSelected }
     *     
     */
    public BaseSelected getOBBCOM() {
        return obbcom;
    }

    /**
     * Sets the value of the obbcom property.
     * 
     * @param value
     *     allowed object is
     *     {@link BaseSelected }
     *     
     */
    public void setOBBCOM(BaseSelected value) {
        this.obbcom = value;
    }

    /**
     * Gets the value of the scadtask property.
     * 
     * @return
     *     possible object is
     *     {@link BaseSelected }
     *     
     */
    public BaseSelected getSCADTASK() {
        return scadtask;
    }

    /**
     * Sets the value of the scadtask property.
     * 
     * @param value
     *     allowed object is
     *     {@link BaseSelected }
     *     
     */
    public void setSCADTASK(BaseSelected value) {
        this.scadtask = value;
    }

    /**
     * Gets the value of the attivatask property.
     * 
     * @return
     *     possible object is
     *     {@link BaseSelected }
     *     
     */
    public BaseSelected getATTIVATASK() {
        return attivatask;
    }

    /**
     * Sets the value of the attivatask property.
     * 
     * @param value
     *     allowed object is
     *     {@link BaseSelected }
     *     
     */
    public void setATTIVATASK(BaseSelected value) {
        this.attivatask = value;
    }

    /**
     * Gets the value of the descfigure property.
     * 
     * @return
     *     possible object is
     *     {@link BaseSelected }
     *     
     */
    public BaseSelected getDESCFIGURE() {
        return descfigure;
    }

    /**
     * Sets the value of the descfigure property.
     * 
     * @param value
     *     allowed object is
     *     {@link BaseSelected }
     *     
     */
    public void setDESCFIGURE(BaseSelected value) {
        this.descfigure = value;
    }

    /**
     * Gets the value of the descvariabili property.
     * 
     * @return
     *     possible object is
     *     {@link BaseSelected }
     *     
     */
    public BaseSelected getDESCVARIABILI() {
        return descvariabili;
    }

    /**
     * Sets the value of the descvariabili property.
     * 
     * @param value
     *     allowed object is
     *     {@link BaseSelected }
     *     
     */
    public void setDESCVARIABILI(BaseSelected value) {
        this.descvariabili = value;
    }

    /**
     * Gets the value of the idorg property.
     * 
     * @return
     *     possible object is
     *     {@link BaseSelected }
     *     
     */
    public BaseSelected getIDORG() {
        return idorg;
    }

    /**
     * Sets the value of the idorg property.
     * 
     * @param value
     *     allowed object is
     *     {@link BaseSelected }
     *     
     */
    public void setIDORG(BaseSelected value) {
        this.idorg = value;
    }

    /**
     * Gets the value of the iddelega property.
     * 
     * @return
     *     possible object is
     *     {@link BaseSelected }
     *     
     */
    public BaseSelected getIDDELEGA() {
        return iddelega;
    }

    /**
     * Sets the value of the iddelega property.
     * 
     * @param value
     *     allowed object is
     *     {@link BaseSelected }
     *     
     */
    public void setIDDELEGA(BaseSelected value) {
        this.iddelega = value;
    }

    /**
     * Gets the value of the taskaperto property.
     * 
     * @return
     *     possible object is
     *     {@link BaseSelected }
     *     
     */
    public BaseSelected getTASKAPERTO() {
        return taskaperto;
    }

    /**
     * Sets the value of the taskaperto property.
     * 
     * @param value
     *     allowed object is
     *     {@link BaseSelected }
     *     
     */
    public void setTASKAPERTO(BaseSelected value) {
        this.taskaperto = value;
    }

    /**
     * Gets the value of the esito property.
     * 
     * @return
     *     possible object is
     *     {@link BaseSelected }
     *     
     */
    public BaseSelected getESITO() {
        return esito;
    }

    /**
     * Sets the value of the esito property.
     * 
     * @param value
     *     allowed object is
     *     {@link BaseSelected }
     *     
     */
    public void setESITO(BaseSelected value) {
        this.esito = value;
    }

    /**
     * Gets the value of the taskdigruppo property.
     * 
     * @return
     *     possible object is
     *     {@link BaseSelected }
     *     
     */
    public BaseSelected getTASKDIGRUPPO() {
        return taskdigruppo;
    }

    /**
     * Sets the value of the taskdigruppo property.
     * 
     * @param value
     *     allowed object is
     *     {@link BaseSelected }
     *     
     */
    public void setTASKDIGRUPPO(BaseSelected value) {
        this.taskdigruppo = value;
    }

    /**
     * Gets the value of the tipo1 property.
     * 
     * @return
     *     possible object is
     *     {@link BaseSelected }
     *     
     */
    public BaseSelected getTIPO1() {
        return tipo1;
    }

    /**
     * Sets the value of the tipo1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BaseSelected }
     *     
     */
    public void setTIPO1(BaseSelected value) {
        this.tipo1 = value;
    }

    /**
     * Gets the value of the tipo2 property.
     * 
     * @return
     *     possible object is
     *     {@link BaseSelected }
     *     
     */
    public BaseSelected getTIPO2() {
        return tipo2;
    }

    /**
     * Sets the value of the tipo2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BaseSelected }
     *     
     */
    public void setTIPO2(BaseSelected value) {
        this.tipo2 = value;
    }

    /**
     * Gets the value of the tipo3 property.
     * 
     * @return
     *     possible object is
     *     {@link BaseSelected }
     *     
     */
    public BaseSelected getTIPO3() {
        return tipo3;
    }

    /**
     * Sets the value of the tipo3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BaseSelected }
     *     
     */
    public void setTIPO3(BaseSelected value) {
        this.tipo3 = value;
    }

    /**
     * Gets the value of the selectdoc property.
     * 
     * @return
     *     possible object is
     *     {@link BaseSelected }
     *     
     */
    public BaseSelected getSELECTDOC() {
        return selectdoc;
    }

    /**
     * Sets the value of the selectdoc property.
     * 
     * @param value
     *     allowed object is
     *     {@link BaseSelected }
     *     
     */
    public void setSELECTDOC(BaseSelected value) {
        this.selectdoc = value;
    }

    /**
     * Gets the value of the dmworkflowdettaglio property.
     * 
     * @return
     *     possible object is
     *     {@link BaseSelected }
     *     
     */
    public BaseSelected getDMWORKFLOWDETTAGLIO() {
        return dmworkflowdettaglio;
    }

    /**
     * Sets the value of the dmworkflowdettaglio property.
     * 
     * @param value
     *     allowed object is
     *     {@link BaseSelected }
     *     
     */
    public void setDMWORKFLOWDETTAGLIO(BaseSelected value) {
        this.dmworkflowdettaglio = value;
    }

    /**
     * Gets the value of the dmworkflownome property.
     * 
     * @return
     *     possible object is
     *     {@link BaseSelected }
     *     
     */
    public BaseSelected getDMWORKFLOWNOME() {
        return dmworkflownome;
    }

    /**
     * Sets the value of the dmworkflownome property.
     * 
     * @param value
     *     allowed object is
     *     {@link BaseSelected }
     *     
     */
    public void setDMWORKFLOWNOME(BaseSelected value) {
        this.dmworkflownome = value;
    }

    /**
     * Gets the value of the dmworkflowfileflw property.
     * 
     * @return
     *     possible object is
     *     {@link BaseSelected }
     *     
     */
    public BaseSelected getDMWORKFLOWFILEFLW() {
        return dmworkflowfileflw;
    }

    /**
     * Sets the value of the dmworkflowfileflw property.
     * 
     * @param value
     *     allowed object is
     *     {@link BaseSelected }
     *     
     */
    public void setDMWORKFLOWFILEFLW(BaseSelected value) {
        this.dmworkflowfileflw = value;
    }

    /**
     * Gets the value of the dmworkflowpercorso property.
     * 
     * @return
     *     possible object is
     *     {@link BaseSelected }
     *     
     */
    public BaseSelected getDMWORKFLOWPERCORSO() {
        return dmworkflowpercorso;
    }

    /**
     * Sets the value of the dmworkflowpercorso property.
     * 
     * @param value
     *     allowed object is
     *     {@link BaseSelected }
     *     
     */
    public void setDMWORKFLOWPERCORSO(BaseSelected value) {
        this.dmworkflowpercorso = value;
    }

    /**
     * Gets the value of the dmworkflowdescrizione property.
     * 
     * @return
     *     possible object is
     *     {@link BaseSelected }
     *     
     */
    public BaseSelected getDMWORKFLOWDESCRIZIONE() {
        return dmworkflowdescrizione;
    }

    /**
     * Sets the value of the dmworkflowdescrizione property.
     * 
     * @param value
     *     allowed object is
     *     {@link BaseSelected }
     *     
     */
    public void setDMWORKFLOWDESCRIZIONE(BaseSelected value) {
        this.dmworkflowdescrizione = value;
    }

    /**
     * Gets the value of the dmworkflowstato property.
     * 
     * @return
     *     possible object is
     *     {@link BaseSelected }
     *     
     */
    public BaseSelected getDMWORKFLOWSTATO() {
        return dmworkflowstato;
    }

    /**
     * Sets the value of the dmworkflowstato property.
     * 
     * @param value
     *     allowed object is
     *     {@link BaseSelected }
     *     
     */
    public void setDMWORKFLOWSTATO(BaseSelected value) {
        this.dmworkflowstato = value;
    }

    /**
     * Gets the value of the dmworkfloworganigramma property.
     * 
     * @return
     *     possible object is
     *     {@link BaseSelected }
     *     
     */
    public BaseSelected getDMWORKFLOWORGANIGRAMMA() {
        return dmworkfloworganigramma;
    }

    /**
     * Sets the value of the dmworkfloworganigramma property.
     * 
     * @param value
     *     allowed object is
     *     {@link BaseSelected }
     *     
     */
    public void setDMWORKFLOWORGANIGRAMMA(BaseSelected value) {
        this.dmworkfloworganigramma = value;
    }

    /**
     * Gets the value of the dmworkflowaoo property.
     * 
     * @return
     *     possible object is
     *     {@link BaseSelected }
     *     
     */
    public BaseSelected getDMWORKFLOWAOO() {
        return dmworkflowaoo;
    }

    /**
     * Sets the value of the dmworkflowaoo property.
     * 
     * @param value
     *     allowed object is
     *     {@link BaseSelected }
     *     
     */
    public void setDMWORKFLOWAOO(BaseSelected value) {
        this.dmworkflowaoo = value;
    }

    /**
     * Gets the value of the dmworkflowcolore property.
     * 
     * @return
     *     possible object is
     *     {@link BaseSelected }
     *     
     */
    public BaseSelected getDMWORKFLOWCOLORE() {
        return dmworkflowcolore;
    }

    /**
     * Sets the value of the dmworkflowcolore property.
     * 
     * @param value
     *     allowed object is
     *     {@link BaseSelected }
     *     
     */
    public void setDMWORKFLOWCOLORE(BaseSelected value) {
        this.dmworkflowcolore = value;
    }

    /**
     * Gets the value of the dmworkflowdocnumber property.
     * 
     * @return
     *     possible object is
     *     {@link BaseSelected }
     *     
     */
    public BaseSelected getDMWORKFLOWDOCNUMBER() {
        return dmworkflowdocnumber;
    }

    /**
     * Sets the value of the dmworkflowdocnumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link BaseSelected }
     *     
     */
    public void setDMWORKFLOWDOCNUMBER(BaseSelected value) {
        this.dmworkflowdocnumber = value;
    }

    /**
     * Gets the value of the dmprocessinote property.
     * 
     * @return
     *     possible object is
     *     {@link BaseSelected }
     *     
     */
    public BaseSelected getDMPROCESSINOTE() {
        return dmprocessinote;
    }

    /**
     * Sets the value of the dmprocessinote property.
     * 
     * @param value
     *     allowed object is
     *     {@link BaseSelected }
     *     
     */
    public void setDMPROCESSINOTE(BaseSelected value) {
        this.dmprocessinote = value;
    }

    /**
     * Gets the value of the dmprocessiallegati property.
     * 
     * @return
     *     possible object is
     *     {@link BaseSelected }
     *     
     */
    public BaseSelected getDMPROCESSIALLEGATI() {
        return dmprocessiallegati;
    }

    /**
     * Sets the value of the dmprocessiallegati property.
     * 
     * @param value
     *     allowed object is
     *     {@link BaseSelected }
     *     
     */
    public void setDMPROCESSIALLEGATI(BaseSelected value) {
        this.dmprocessiallegati = value;
    }

    /**
     * Gets the value of the dmprocessistato property.
     * 
     * @return
     *     possible object is
     *     {@link BaseSelected }
     *     
     */
    public BaseSelected getDMPROCESSISTATO() {
        return dmprocessistato;
    }

    /**
     * Sets the value of the dmprocessistato property.
     * 
     * @param value
     *     allowed object is
     *     {@link BaseSelected }
     *     
     */
    public void setDMPROCESSISTATO(BaseSelected value) {
        this.dmprocessistato = value;
    }

    /**
     * Gets the value of the dmprocessiworkflow property.
     * 
     * @return
     *     possible object is
     *     {@link BaseSelected }
     *     
     */
    public BaseSelected getDMPROCESSIWORKFLOW() {
        return dmprocessiworkflow;
    }

    /**
     * Sets the value of the dmprocessiworkflow property.
     * 
     * @param value
     *     allowed object is
     *     {@link BaseSelected }
     *     
     */
    public void setDMPROCESSIWORKFLOW(BaseSelected value) {
        this.dmprocessiworkflow = value;
    }

    /**
     * Gets the value of the dmprocessiinizio property.
     * 
     * @return
     *     possible object is
     *     {@link BaseSelected }
     *     
     */
    public BaseSelected getDMPROCESSIINIZIO() {
        return dmprocessiinizio;
    }

    /**
     * Sets the value of the dmprocessiinizio property.
     * 
     * @param value
     *     allowed object is
     *     {@link BaseSelected }
     *     
     */
    public void setDMPROCESSIINIZIO(BaseSelected value) {
        this.dmprocessiinizio = value;
    }

    /**
     * Gets the value of the dmprocessiconcluso property.
     * 
     * @return
     *     possible object is
     *     {@link BaseSelected }
     *     
     */
    public BaseSelected getDMPROCESSICONCLUSO() {
        return dmprocessiconcluso;
    }

    /**
     * Sets the value of the dmprocessiconcluso property.
     * 
     * @param value
     *     allowed object is
     *     {@link BaseSelected }
     *     
     */
    public void setDMPROCESSICONCLUSO(BaseSelected value) {
        this.dmprocessiconcluso = value;
    }

    /**
     * Gets the value of the dmprocessidatascadenza property.
     * 
     * @return
     *     possible object is
     *     {@link BaseSelected }
     *     
     */
    public BaseSelected getDMPROCESSIDATASCADENZA() {
        return dmprocessidatascadenza;
    }

    /**
     * Sets the value of the dmprocessidatascadenza property.
     * 
     * @param value
     *     allowed object is
     *     {@link BaseSelected }
     *     
     */
    public void setDMPROCESSIDATASCADENZA(BaseSelected value) {
        this.dmprocessidatascadenza = value;
    }

    /**
     * Gets the value of the dmprocessicolore property.
     * 
     * @return
     *     possible object is
     *     {@link BaseSelected }
     *     
     */
    public BaseSelected getDMPROCESSICOLORE() {
        return dmprocessicolore;
    }

    /**
     * Sets the value of the dmprocessicolore property.
     * 
     * @param value
     *     allowed object is
     *     {@link BaseSelected }
     *     
     */
    public void setDMPROCESSICOLORE(BaseSelected value) {
        this.dmprocessicolore = value;
    }

    /**
     * Gets the value of the dmprocessidescrizione property.
     * 
     * @return
     *     possible object is
     *     {@link BaseSelected }
     *     
     */
    public BaseSelected getDMPROCESSIDESCRIZIONE() {
        return dmprocessidescrizione;
    }

    /**
     * Sets the value of the dmprocessidescrizione property.
     * 
     * @param value
     *     allowed object is
     *     {@link BaseSelected }
     *     
     */
    public void setDMPROCESSIDESCRIZIONE(BaseSelected value) {
        this.dmprocessidescrizione = value;
    }

    /**
     * Gets the value of the dmutentidescription property.
     * 
     * @return
     *     possible object is
     *     {@link BaseSelected }
     *     
     */
    public BaseSelected getDMUTENTIDESCRIPTION() {
        return dmutentidescription;
    }

    /**
     * Sets the value of the dmutentidescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link BaseSelected }
     *     
     */
    public void setDMUTENTIDESCRIPTION(BaseSelected value) {
        this.dmutentidescription = value;
    }

    /**
     * Gets the value of the dmtaskdocdescrizione property.
     * 
     * @return
     *     possible object is
     *     {@link BaseSelected }
     *     
     */
    public BaseSelected getDMTASKDOCDESCRIZIONE() {
        return dmtaskdocdescrizione;
    }

    /**
     * Sets the value of the dmtaskdocdescrizione property.
     * 
     * @param value
     *     allowed object is
     *     {@link BaseSelected }
     *     
     */
    public void setDMTASKDOCDESCRIZIONE(BaseSelected value) {
        this.dmtaskdocdescrizione = value;
    }

    /**
     * Gets the value of the dmtaskdocinputnewdoc property.
     * 
     * @return
     *     possible object is
     *     {@link BaseSelected }
     *     
     */
    public BaseSelected getDMTASKDOCINPUTNEWDOC() {
        return dmtaskdocinputnewdoc;
    }

    /**
     * Sets the value of the dmtaskdocinputnewdoc property.
     * 
     * @param value
     *     allowed object is
     *     {@link BaseSelected }
     *     
     */
    public void setDMTASKDOCINPUTNEWDOC(BaseSelected value) {
        this.dmtaskdocinputnewdoc = value;
    }

    /**
     * Gets the value of the dmtaskdocdocobbligatorio property.
     * 
     * @return
     *     possible object is
     *     {@link BaseSelected }
     *     
     */
    public BaseSelected getDMTASKDOCDOCOBBLIGATORIO() {
        return dmtaskdocdocobbligatorio;
    }

    /**
     * Sets the value of the dmtaskdocdocobbligatorio property.
     * 
     * @param value
     *     allowed object is
     *     {@link BaseSelected }
     *     
     */
    public void setDMTASKDOCDOCOBBLIGATORIO(BaseSelected value) {
        this.dmtaskdocdocobbligatorio = value;
    }

    /**
     * Gets the value of the dmtaskdoctipo1 property.
     * 
     * @return
     *     possible object is
     *     {@link BaseSelected }
     *     
     */
    public BaseSelected getDMTASKDOCTIPO1() {
        return dmtaskdoctipo1;
    }

    /**
     * Sets the value of the dmtaskdoctipo1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BaseSelected }
     *     
     */
    public void setDMTASKDOCTIPO1(BaseSelected value) {
        this.dmtaskdoctipo1 = value;
    }

    /**
     * Gets the value of the dmtaskdoctipo2 property.
     * 
     * @return
     *     possible object is
     *     {@link BaseSelected }
     *     
     */
    public BaseSelected getDMTASKDOCTIPO2() {
        return dmtaskdoctipo2;
    }

    /**
     * Sets the value of the dmtaskdoctipo2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BaseSelected }
     *     
     */
    public void setDMTASKDOCTIPO2(BaseSelected value) {
        this.dmtaskdoctipo2 = value;
    }

    /**
     * Gets the value of the dmtaskdoctipo3 property.
     * 
     * @return
     *     possible object is
     *     {@link BaseSelected }
     *     
     */
    public BaseSelected getDMTASKDOCTIPO3() {
        return dmtaskdoctipo3;
    }

    /**
     * Sets the value of the dmtaskdoctipo3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BaseSelected }
     *     
     */
    public void setDMTASKDOCTIPO3(BaseSelected value) {
        this.dmtaskdoctipo3 = value;
    }

    /**
     * Gets the value of the dmtaskdocopeseguita property.
     * 
     * @return
     *     possible object is
     *     {@link BaseSelected }
     *     
     */
    public BaseSelected getDMTASKDOCOPESEGUITA() {
        return dmtaskdocopeseguita;
    }

    /**
     * Sets the value of the dmtaskdocopeseguita property.
     * 
     * @param value
     *     allowed object is
     *     {@link BaseSelected }
     *     
     */
    public void setDMTASKDOCOPESEGUITA(BaseSelected value) {
        this.dmtaskdocopeseguita = value;
    }

    /**
     * Gets the value of the dmtaskdocinputtype property.
     * 
     * @return
     *     possible object is
     *     {@link BaseSelected }
     *     
     */
    public BaseSelected getDMTASKDOCINPUTTYPE() {
        return dmtaskdocinputtype;
    }

    /**
     * Sets the value of the dmtaskdocinputtype property.
     * 
     * @param value
     *     allowed object is
     *     {@link BaseSelected }
     *     
     */
    public void setDMTASKDOCINPUTTYPE(BaseSelected value) {
        this.dmtaskdocinputtype = value;
    }

    /**
     * Gets the value of the dmprofiledocnumber property.
     * 
     * @return
     *     possible object is
     *     {@link BaseSelected }
     *     
     */
    public BaseSelected getDMPROFILEDOCNUMBER() {
        return dmprofiledocnumber;
    }

    /**
     * Sets the value of the dmprofiledocnumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link BaseSelected }
     *     
     */
    public void setDMPROFILEDOCNUMBER(BaseSelected value) {
        this.dmprofiledocnumber = value;
    }

    /**
     * Gets the value of the dmprofiledocname property.
     * 
     * @return
     *     possible object is
     *     {@link BaseSelected }
     *     
     */
    public BaseSelected getDMPROFILEDOCNAME() {
        return dmprofiledocname;
    }

    /**
     * Sets the value of the dmprofiledocname property.
     * 
     * @param value
     *     allowed object is
     *     {@link BaseSelected }
     *     
     */
    public void setDMPROFILEDOCNAME(BaseSelected value) {
        this.dmprofiledocname = value;
    }

    /**
     * Gets the value of the dmprofiledocumenttype property.
     * 
     * @return
     *     possible object is
     *     {@link BaseSelected }
     *     
     */
    public BaseSelected getDMPROFILEDOCUMENTTYPE() {
        return dmprofiledocumenttype;
    }

    /**
     * Sets the value of the dmprofiledocumenttype property.
     * 
     * @param value
     *     allowed object is
     *     {@link BaseSelected }
     *     
     */
    public void setDMPROFILEDOCUMENTTYPE(BaseSelected value) {
        this.dmprofiledocumenttype = value;
    }

    /**
     * Gets the value of the dmprofiletipo2 property.
     * 
     * @return
     *     possible object is
     *     {@link BaseSelected }
     *     
     */
    public BaseSelected getDMPROFILETIPO2() {
        return dmprofiletipo2;
    }

    /**
     * Sets the value of the dmprofiletipo2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BaseSelected }
     *     
     */
    public void setDMPROFILETIPO2(BaseSelected value) {
        this.dmprofiletipo2 = value;
    }

    /**
     * Gets the value of the dmprofiletipo3 property.
     * 
     * @return
     *     possible object is
     *     {@link BaseSelected }
     *     
     */
    public BaseSelected getDMPROFILETIPO3() {
        return dmprofiletipo3;
    }

    /**
     * Sets the value of the dmprofiletipo3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BaseSelected }
     *     
     */
    public void setDMPROFILETIPO3(BaseSelected value) {
        this.dmprofiletipo3 = value;
    }

    /**
     * Gets the value of the dmprofilepath property.
     * 
     * @return
     *     possible object is
     *     {@link BaseSelected }
     *     
     */
    public BaseSelected getDMPROFILEPATH() {
        return dmprofilepath;
    }

    /**
     * Sets the value of the dmprofilepath property.
     * 
     * @param value
     *     allowed object is
     *     {@link BaseSelected }
     *     
     */
    public void setDMPROFILEPATH(BaseSelected value) {
        this.dmprofilepath = value;
    }

    /**
     * Gets the value of the dmprofilefilename property.
     * 
     * @return
     *     possible object is
     *     {@link BaseSelected }
     *     
     */
    public BaseSelected getDMPROFILEFILENAME() {
        return dmprofilefilename;
    }

    /**
     * Sets the value of the dmprofilefilename property.
     * 
     * @param value
     *     allowed object is
     *     {@link BaseSelected }
     *     
     */
    public void setDMPROFILEFILENAME(BaseSelected value) {
        this.dmprofilefilename = value;
    }

    /**
     * Gets the value of the dmprofilenumero property.
     * 
     * @return
     *     possible object is
     *     {@link BaseSelected }
     *     
     */
    public BaseSelected getDMPROFILENUMERO() {
        return dmprofilenumero;
    }

    /**
     * Sets the value of the dmprofilenumero property.
     * 
     * @param value
     *     allowed object is
     *     {@link BaseSelected }
     *     
     */
    public void setDMPROFILENUMERO(BaseSelected value) {
        this.dmprofilenumero = value;
    }

    /**
     * Gets the value of the dmprofiledatadoc property.
     * 
     * @return
     *     possible object is
     *     {@link BaseSelected }
     *     
     */
    public BaseSelected getDMPROFILEDATADOC() {
        return dmprofiledatadoc;
    }

    /**
     * Sets the value of the dmprofiledatadoc property.
     * 
     * @param value
     *     allowed object is
     *     {@link BaseSelected }
     *     
     */
    public void setDMPROFILEDATADOC(BaseSelected value) {
        this.dmprofiledatadoc = value;
    }

    /**
     * Gets the value of the dmprofilecc property.
     * 
     * @return
     *     possible object is
     *     {@link BaseSelected }
     *     
     */
    public BaseSelected getDMPROFILECC() {
        return dmprofilecc;
    }

    /**
     * Sets the value of the dmprofilecc property.
     * 
     * @param value
     *     allowed object is
     *     {@link BaseSelected }
     *     
     */
    public void setDMPROFILECC(BaseSelected value) {
        this.dmprofilecc = value;
    }

    /**
     * Gets the value of the dmprofileprofilato property.
     * 
     * @return
     *     possible object is
     *     {@link BaseSelected }
     *     
     */
    public BaseSelected getDMPROFILEPROFILATO() {
        return dmprofileprofilato;
    }

    /**
     * Sets the value of the dmprofileprofilato property.
     * 
     * @param value
     *     allowed object is
     *     {@link BaseSelected }
     *     
     */
    public void setDMPROFILEPROFILATO(BaseSelected value) {
        this.dmprofileprofilato = value;
    }

    /**
     * Gets the value of the dmprofilecreationdate property.
     * 
     * @return
     *     possible object is
     *     {@link BaseSelected }
     *     
     */
    public BaseSelected getDMPROFILECREATIONDATE() {
        return dmprofilecreationdate;
    }

    /**
     * Sets the value of the dmprofilecreationdate property.
     * 
     * @param value
     *     allowed object is
     *     {@link BaseSelected }
     *     
     */
    public void setDMPROFILECREATIONDATE(BaseSelected value) {
        this.dmprofilecreationdate = value;
    }

    /**
     * Gets the value of the dmprofileimportante property.
     * 
     * @return
     *     possible object is
     *     {@link BaseSelected }
     *     
     */
    public BaseSelected getDMPROFILEIMPORTANTE() {
        return dmprofileimportante;
    }

    /**
     * Sets the value of the dmprofileimportante property.
     * 
     * @param value
     *     allowed object is
     *     {@link BaseSelected }
     *     
     */
    public void setDMPROFILEIMPORTANTE(BaseSelected value) {
        this.dmprofileimportante = value;
    }

    /**
     * Gets the value of the dmprofilerevisione property.
     * 
     * @return
     *     possible object is
     *     {@link BaseSelected }
     *     
     */
    public BaseSelected getDMPROFILEREVISIONE() {
        return dmprofilerevisione;
    }

    /**
     * Sets the value of the dmprofilerevisione property.
     * 
     * @param value
     *     allowed object is
     *     {@link BaseSelected }
     *     
     */
    public void setDMPROFILEREVISIONE(BaseSelected value) {
        this.dmprofilerevisione = value;
    }

    /**
     * Gets the value of the dmprofileautore property.
     * 
     * @return
     *     possible object is
     *     {@link BaseSelected }
     *     
     */
    public BaseSelected getDMPROFILEAUTORE() {
        return dmprofileautore;
    }

    /**
     * Sets the value of the dmprofileautore property.
     * 
     * @param value
     *     allowed object is
     *     {@link BaseSelected }
     *     
     */
    public void setDMPROFILEAUTORE(BaseSelected value) {
        this.dmprofileautore = value;
    }

    /**
     * Gets the value of the dmprofilenote property.
     * 
     * @return
     *     possible object is
     *     {@link BaseSelected }
     *     
     */
    public BaseSelected getDMPROFILENOTE() {
        return dmprofilenote;
    }

    /**
     * Sets the value of the dmprofilenote property.
     * 
     * @param value
     *     allowed object is
     *     {@link BaseSelected }
     *     
     */
    public void setDMPROFILENOTE(BaseSelected value) {
        this.dmprofilenote = value;
    }

    /**
     * Gets the value of the dmprofileprotocollo property.
     * 
     * @return
     *     possible object is
     *     {@link BaseSelected }
     *     
     */
    public BaseSelected getDMPROFILEPROTOCOLLO() {
        return dmprofileprotocollo;
    }

    /**
     * Sets the value of the dmprofileprotocollo property.
     * 
     * @param value
     *     allowed object is
     *     {@link BaseSelected }
     *     
     */
    public void setDMPROFILEPROTOCOLLO(BaseSelected value) {
        this.dmprofileprotocollo = value;
    }

    /**
     * Gets the value of the dmprofileanno property.
     * 
     * @return
     *     possible object is
     *     {@link BaseSelected }
     *     
     */
    public BaseSelected getDMPROFILEANNO() {
        return dmprofileanno;
    }

    /**
     * Sets the value of the dmprofileanno property.
     * 
     * @param value
     *     allowed object is
     *     {@link BaseSelected }
     *     
     */
    public void setDMPROFILEANNO(BaseSelected value) {
        this.dmprofileanno = value;
    }

    /**
     * Gets the value of the dmprofilebloccato property.
     * 
     * @return
     *     possible object is
     *     {@link BaseSelected }
     *     
     */
    public BaseSelected getDMPROFILEBLOCCATO() {
        return dmprofilebloccato;
    }

    /**
     * Sets the value of the dmprofilebloccato property.
     * 
     * @param value
     *     allowed object is
     *     {@link BaseSelected }
     *     
     */
    public void setDMPROFILEBLOCCATO(BaseSelected value) {
        this.dmprofilebloccato = value;
    }

    /**
     * Gets the value of the dmprofilestato property.
     * 
     * @return
     *     possible object is
     *     {@link BaseSelected }
     *     
     */
    public BaseSelected getDMPROFILESTATO() {
        return dmprofilestato;
    }

    /**
     * Sets the value of the dmprofilestato property.
     * 
     * @param value
     *     allowed object is
     *     {@link BaseSelected }
     *     
     */
    public void setDMPROFILESTATO(BaseSelected value) {
        this.dmprofilestato = value;
    }

    /**
     * Gets the value of the dmprofileinout property.
     * 
     * @return
     *     possible object is
     *     {@link BaseSelected }
     *     
     */
    public BaseSelected getDMPROFILEINOUT() {
        return dmprofileinout;
    }

    /**
     * Sets the value of the dmprofileinout property.
     * 
     * @param value
     *     allowed object is
     *     {@link BaseSelected }
     *     
     */
    public void setDMPROFILEINOUT(BaseSelected value) {
        this.dmprofileinout = value;
    }

    /**
     * Gets the value of the dmprofilescadenza property.
     * 
     * @return
     *     possible object is
     *     {@link BaseSelected }
     *     
     */
    public BaseSelected getDMPROFILESCADENZA() {
        return dmprofilescadenza;
    }

    /**
     * Sets the value of the dmprofilescadenza property.
     * 
     * @param value
     *     allowed object is
     *     {@link BaseSelected }
     *     
     */
    public void setDMPROFILESCADENZA(BaseSelected value) {
        this.dmprofilescadenza = value;
    }

    /**
     * Gets the value of the dmprofileflag property.
     * 
     * @return
     *     possible object is
     *     {@link BaseSelected }
     *     
     */
    public BaseSelected getDMPROFILEFLAG() {
        return dmprofileflag;
    }

    /**
     * Sets the value of the dmprofileflag property.
     * 
     * @param value
     *     allowed object is
     *     {@link BaseSelected }
     *     
     */
    public void setDMPROFILEFLAG(BaseSelected value) {
        this.dmprofileflag = value;
    }

    /**
     * Gets the value of the dmprofileworkflow property.
     * 
     * @return
     *     possible object is
     *     {@link BaseSelected }
     *     
     */
    public BaseSelected getDMPROFILEWORKFLOW() {
        return dmprofileworkflow;
    }

    /**
     * Sets the value of the dmprofileworkflow property.
     * 
     * @param value
     *     allowed object is
     *     {@link BaseSelected }
     *     
     */
    public void setDMPROFILEWORKFLOW(BaseSelected value) {
        this.dmprofileworkflow = value;
    }

    /**
     * Gets the value of the dmprofileoriginale property.
     * 
     * @return
     *     possible object is
     *     {@link BaseSelected }
     *     
     */
    public BaseSelected getDMPROFILEORIGINALE() {
        return dmprofileoriginale;
    }

    /**
     * Sets the value of the dmprofileoriginale property.
     * 
     * @param value
     *     allowed object is
     *     {@link BaseSelected }
     *     
     */
    public void setDMPROFILEORIGINALE(BaseSelected value) {
        this.dmprofileoriginale = value;
    }

    /**
     * Gets the value of the dmprofiledatafile property.
     * 
     * @return
     *     possible object is
     *     {@link BaseSelected }
     *     
     */
    public BaseSelected getDMPROFILEDATAFILE() {
        return dmprofiledatafile;
    }

    /**
     * Sets the value of the dmprofiledatafile property.
     * 
     * @param value
     *     allowed object is
     *     {@link BaseSelected }
     *     
     */
    public void setDMPROFILEDATAFILE(BaseSelected value) {
        this.dmprofiledatafile = value;
    }

    /**
     * Gets the value of the dmprofilegestrev property.
     * 
     * @return
     *     possible object is
     *     {@link BaseSelected }
     *     
     */
    public BaseSelected getDMPROFILEGESTREV() {
        return dmprofilegestrev;
    }

    /**
     * Sets the value of the dmprofilegestrev property.
     * 
     * @param value
     *     allowed object is
     *     {@link BaseSelected }
     *     
     */
    public void setDMPROFILEGESTREV(BaseSelected value) {
        this.dmprofilegestrev = value;
    }

    /**
     * Gets the value of the dmprofiledevice property.
     * 
     * @return
     *     possible object is
     *     {@link BaseSelected }
     *     
     */
    public BaseSelected getDMPROFILEDEVICE() {
        return dmprofiledevice;
    }

    /**
     * Sets the value of the dmprofiledevice property.
     * 
     * @param value
     *     allowed object is
     *     {@link BaseSelected }
     *     
     */
    public void setDMPROFILEDEVICE(BaseSelected value) {
        this.dmprofiledevice = value;
    }

    /**
     * Gets the value of the dmprofileallegati property.
     * 
     * @return
     *     possible object is
     *     {@link BaseSelected }
     *     
     */
    public BaseSelected getDMPROFILEALLEGATI() {
        return dmprofileallegati;
    }

    /**
     * Sets the value of the dmprofileallegati property.
     * 
     * @param value
     *     allowed object is
     *     {@link BaseSelected }
     *     
     */
    public void setDMPROFILEALLEGATI(BaseSelected value) {
        this.dmprofileallegati = value;
    }

    /**
     * Gets the value of the dmprofileopendoc property.
     * 
     * @return
     *     possible object is
     *     {@link BaseSelected }
     *     
     */
    public BaseSelected getDMPROFILEOPENDOC() {
        return dmprofileopendoc;
    }

    /**
     * Sets the value of the dmprofileopendoc property.
     * 
     * @param value
     *     allowed object is
     *     {@link BaseSelected }
     *     
     */
    public void setDMPROFILEOPENDOC(BaseSelected value) {
        this.dmprofileopendoc = value;
    }

    /**
     * Gets the value of the dmprofileassociazioni property.
     * 
     * @return
     *     possible object is
     *     {@link BaseSelected }
     *     
     */
    public BaseSelected getDMPROFILEASSOCIAZIONI() {
        return dmprofileassociazioni;
    }

    /**
     * Sets the value of the dmprofileassociazioni property.
     * 
     * @param value
     *     allowed object is
     *     {@link BaseSelected }
     *     
     */
    public void setDMPROFILEASSOCIAZIONI(BaseSelected value) {
        this.dmprofileassociazioni = value;
    }

    /**
     * Gets the value of the dmprofileimpronta property.
     * 
     * @return
     *     possible object is
     *     {@link BaseSelected }
     *     
     */
    public BaseSelected getDMPROFILEIMPRONTA() {
        return dmprofileimpronta;
    }

    /**
     * Sets the value of the dmprofileimpronta property.
     * 
     * @param value
     *     allowed object is
     *     {@link BaseSelected }
     *     
     */
    public void setDMPROFILEIMPRONTA(BaseSelected value) {
        this.dmprofileimpronta = value;
    }

    /**
     * Gets the value of the dmprofileemergenza property.
     * 
     * @return
     *     possible object is
     *     {@link BaseSelected }
     *     
     */
    public BaseSelected getDMPROFILEEMERGENZA() {
        return dmprofileemergenza;
    }

    /**
     * Sets the value of the dmprofileemergenza property.
     * 
     * @param value
     *     allowed object is
     *     {@link BaseSelected }
     *     
     */
    public void setDMPROFILEEMERGENZA(BaseSelected value) {
        this.dmprofileemergenza = value;
    }

    /**
     * Gets the value of the dmprofileaoo property.
     * 
     * @return
     *     possible object is
     *     {@link BaseSelected }
     *     
     */
    public BaseSelected getDMPROFILEAOO() {
        return dmprofileaoo;
    }

    /**
     * Sets the value of the dmprofileaoo property.
     * 
     * @param value
     *     allowed object is
     *     {@link BaseSelected }
     *     
     */
    public void setDMPROFILEAOO(BaseSelected value) {
        this.dmprofileaoo = value;
    }

    /**
     * Gets the value of the dmprofilewebvisible property.
     * 
     * @return
     *     possible object is
     *     {@link BaseSelected }
     *     
     */
    public BaseSelected getDMPROFILEWEBVISIBLE() {
        return dmprofilewebvisible;
    }

    /**
     * Sets the value of the dmprofilewebvisible property.
     * 
     * @param value
     *     allowed object is
     *     {@link BaseSelected }
     *     
     */
    public void setDMPROFILEWEBVISIBLE(BaseSelected value) {
        this.dmprofilewebvisible = value;
    }

    /**
     * Gets the value of the dmprofileisaos property.
     * 
     * @return
     *     possible object is
     *     {@link BaseSelected }
     *     
     */
    public BaseSelected getDMPROFILEISAOS() {
        return dmprofileisaos;
    }

    /**
     * Sets the value of the dmprofileisaos property.
     * 
     * @param value
     *     allowed object is
     *     {@link BaseSelected }
     *     
     */
    public void setDMPROFILEISAOS(BaseSelected value) {
        this.dmprofileisaos = value;
    }

    /**
     * Gets the value of the dmprofileinvoice property.
     * 
     * @return
     *     possible object is
     *     {@link BaseSelected }
     *     
     */
    public BaseSelected getDMPROFILEINVOICE() {
        return dmprofileinvoice;
    }

    /**
     * Sets the value of the dmprofileinvoice property.
     * 
     * @param value
     *     allowed object is
     *     {@link BaseSelected }
     *     
     */
    public void setDMPROFILEINVOICE(BaseSelected value) {
        this.dmprofileinvoice = value;
    }

    /**
     * Gets the value of the dmprofilescadaos property.
     * 
     * @return
     *     possible object is
     *     {@link BaseSelected }
     *     
     */
    public BaseSelected getDMPROFILESCADAOS() {
        return dmprofilescadaos;
    }

    /**
     * Sets the value of the dmprofilescadaos property.
     * 
     * @param value
     *     allowed object is
     *     {@link BaseSelected }
     *     
     */
    public void setDMPROFILESCADAOS(BaseSelected value) {
        this.dmprofilescadaos = value;
    }

    /**
     * Gets the value of the dmprofileetichettacd property.
     * 
     * @return
     *     possible object is
     *     {@link BaseSelected }
     *     
     */
    public BaseSelected getDMPROFILEETICHETTACD() {
        return dmprofileetichettacd;
    }

    /**
     * Sets the value of the dmprofileetichettacd property.
     * 
     * @param value
     *     allowed object is
     *     {@link BaseSelected }
     *     
     */
    public void setDMPROFILEETICHETTACD(BaseSelected value) {
        this.dmprofileetichettacd = value;
    }

    /**
     * Gets the value of the dmprofileetireader property.
     * 
     * @return
     *     possible object is
     *     {@link BaseSelected }
     *     
     */
    public BaseSelected getDMPROFILEETIREADER() {
        return dmprofileetireader;
    }

    /**
     * Sets the value of the dmprofileetireader property.
     * 
     * @param value
     *     allowed object is
     *     {@link BaseSelected }
     *     
     */
    public void setDMPROFILEETIREADER(BaseSelected value) {
        this.dmprofileetireader = value;
    }

    /**
     * Gets the value of the dmprofiledataprot property.
     * 
     * @return
     *     possible object is
     *     {@link BaseSelected }
     *     
     */
    public BaseSelected getDMPROFILEDATAPROT() {
        return dmprofiledataprot;
    }

    /**
     * Sets the value of the dmprofiledataprot property.
     * 
     * @param value
     *     allowed object is
     *     {@link BaseSelected }
     *     
     */
    public void setDMPROFILEDATAPROT(BaseSelected value) {
        this.dmprofiledataprot = value;
    }

    /**
     * Gets the value of the dmprofileaggiuntivi property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfAggiuntivoSelected }
     *     
     */
    public ArrayOfAggiuntivoSelected getDMPROFILEAGGIUNTIVI() {
        return dmprofileaggiuntivi;
    }

    /**
     * Sets the value of the dmprofileaggiuntivi property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfAggiuntivoSelected }
     *     
     */
    public void setDMPROFILEAGGIUNTIVI(ArrayOfAggiuntivoSelected value) {
        this.dmprofileaggiuntivi = value;
    }

    /**
     * Gets the value of the dmprofilepratiche property.
     * 
     * @return
     *     possible object is
     *     {@link BaseSelected }
     *     
     */
    public BaseSelected getDMPROFILEPRATICHE() {
        return dmprofilepratiche;
    }

    /**
     * Sets the value of the dmprofilepratiche property.
     * 
     * @param value
     *     allowed object is
     *     {@link BaseSelected }
     *     
     */
    public void setDMPROFILEPRATICHE(BaseSelected value) {
        this.dmprofilepratiche = value;
    }

    /**
     * Gets the value of the dmprofilestatoprocdesc property.
     * 
     * @return
     *     possible object is
     *     {@link BaseSelected }
     *     
     */
    public BaseSelected getDMPROFILESTATOPROCDESC() {
        return dmprofilestatoprocdesc;
    }

    /**
     * Sets the value of the dmprofilestatoprocdesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link BaseSelected }
     *     
     */
    public void setDMPROFILESTATOPROCDESC(BaseSelected value) {
        this.dmprofilestatoprocdesc = value;
    }

    /**
     * Gets the value of the dmprofilemittente property.
     * 
     * @return
     *     possible object is
     *     {@link BaseSelected }
     *     
     */
    public BaseSelected getDMPROFILEMITTENTE() {
        return dmprofilemittente;
    }

    /**
     * Sets the value of the dmprofilemittente property.
     * 
     * @param value
     *     allowed object is
     *     {@link BaseSelected }
     *     
     */
    public void setDMPROFILEMITTENTE(BaseSelected value) {
        this.dmprofilemittente = value;
    }

    /**
     * Gets the value of the dmprofiledestinatario property.
     * 
     * @return
     *     possible object is
     *     {@link BaseSelected }
     *     
     */
    public BaseSelected getDMPROFILEDESTINATARIO() {
        return dmprofiledestinatario;
    }

    /**
     * Sets the value of the dmprofiledestinatario property.
     * 
     * @param value
     *     allowed object is
     *     {@link BaseSelected }
     *     
     */
    public void setDMPROFILEDESTINATARIO(BaseSelected value) {
        this.dmprofiledestinatario = value;
    }

    /**
     * Gets the value of the dmfascicolinome property.
     * 
     * @return
     *     possible object is
     *     {@link BaseSelected }
     *     
     */
    public BaseSelected getDMFASCICOLINOME() {
        return dmfascicolinome;
    }

    /**
     * Sets the value of the dmfascicolinome property.
     * 
     * @param value
     *     allowed object is
     *     {@link BaseSelected }
     *     
     */
    public void setDMFASCICOLINOME(BaseSelected value) {
        this.dmfascicolinome = value;
    }

    /**
     * Gets the value of the dmtaskexecuteidutente property.
     * 
     * @return
     *     possible object is
     *     {@link BaseSelected }
     *     
     */
    public BaseSelected getDMTASKEXECUTEIDUTENTE() {
        return dmtaskexecuteidutente;
    }

    /**
     * Sets the value of the dmtaskexecuteidutente property.
     * 
     * @param value
     *     allowed object is
     *     {@link BaseSelected }
     *     
     */
    public void setDMTASKEXECUTEIDUTENTE(BaseSelected value) {
        this.dmtaskexecuteidutente = value;
    }

    /**
     * Gets the value of the dmtaskexecuteaoo property.
     * 
     * @return
     *     possible object is
     *     {@link BaseSelected }
     *     
     */
    public BaseSelected getDMTASKEXECUTEAOO() {
        return dmtaskexecuteaoo;
    }

    /**
     * Sets the value of the dmtaskexecuteaoo property.
     * 
     * @param value
     *     allowed object is
     *     {@link BaseSelected }
     *     
     */
    public void setDMTASKEXECUTEAOO(BaseSelected value) {
        this.dmtaskexecuteaoo = value;
    }

    /**
     * Gets the value of the dmtaskexecuteutentecompleto property.
     * 
     * @return
     *     possible object is
     *     {@link BaseSelected }
     *     
     */
    public BaseSelected getDMTASKEXECUTEUTENTECOMPLETO() {
        return dmtaskexecuteutentecompleto;
    }

    /**
     * Sets the value of the dmtaskexecuteutentecompleto property.
     * 
     * @param value
     *     allowed object is
     *     {@link BaseSelected }
     *     
     */
    public void setDMTASKEXECUTEUTENTECOMPLETO(BaseSelected value) {
        this.dmtaskexecuteutentecompleto = value;
    }

    /**
     * Gets the value of the dmtaskexecutegruppoutente property.
     * 
     * @return
     *     possible object is
     *     {@link BaseSelected }
     *     
     */
    public BaseSelected getDMTASKEXECUTEGRUPPOUTENTE() {
        return dmtaskexecutegruppoutente;
    }

    /**
     * Sets the value of the dmtaskexecutegruppoutente property.
     * 
     * @param value
     *     allowed object is
     *     {@link BaseSelected }
     *     
     */
    public void setDMTASKEXECUTEGRUPPOUTENTE(BaseSelected value) {
        this.dmtaskexecutegruppoutente = value;
    }

    /**
     * Gets the value of the dmtaskexecuteesitotask property.
     * 
     * @return
     *     possible object is
     *     {@link BaseSelected }
     *     
     */
    public BaseSelected getDMTASKEXECUTEESITOTASK() {
        return dmtaskexecuteesitotask;
    }

    /**
     * Sets the value of the dmtaskexecuteesitotask property.
     * 
     * @param value
     *     allowed object is
     *     {@link BaseSelected }
     *     
     */
    public void setDMTASKEXECUTEESITOTASK(BaseSelected value) {
        this.dmtaskexecuteesitotask = value;
    }

    /**
     * Gets the value of the dmtaskexecutemetodo property.
     * 
     * @return
     *     possible object is
     *     {@link BaseSelected }
     *     
     */
    public BaseSelected getDMTASKEXECUTEMETODO() {
        return dmtaskexecutemetodo;
    }

    /**
     * Sets the value of the dmtaskexecutemetodo property.
     * 
     * @param value
     *     allowed object is
     *     {@link BaseSelected }
     *     
     */
    public void setDMTASKEXECUTEMETODO(BaseSelected value) {
        this.dmtaskexecutemetodo = value;
    }

    /**
     * Gets the value of the dmtaskexecutedata property.
     * 
     * @return
     *     possible object is
     *     {@link BaseSelected }
     *     
     */
    public BaseSelected getDMTASKEXECUTEDATA() {
        return dmtaskexecutedata;
    }

    /**
     * Sets the value of the dmtaskexecutedata property.
     * 
     * @param value
     *     allowed object is
     *     {@link BaseSelected }
     *     
     */
    public void setDMTASKEXECUTEDATA(BaseSelected value) {
        this.dmtaskexecutedata = value;
    }

    /**
     * Gets the value of the dmtaskexecutenotatask property.
     * 
     * @return
     *     possible object is
     *     {@link BaseSelected }
     *     
     */
    public BaseSelected getDMTASKEXECUTENOTATASK() {
        return dmtaskexecutenotatask;
    }

    /**
     * Sets the value of the dmtaskexecutenotatask property.
     * 
     * @param value
     *     allowed object is
     *     {@link BaseSelected }
     *     
     */
    public void setDMTASKEXECUTENOTATASK(BaseSelected value) {
        this.dmtaskexecutenotatask = value;
    }

    /**
     * Gets the value of the dmtaskexecuteinelaborazione property.
     * 
     * @return
     *     possible object is
     *     {@link BaseSelected }
     *     
     */
    public BaseSelected getDMTASKEXECUTEINELABORAZIONE() {
        return dmtaskexecuteinelaborazione;
    }

    /**
     * Sets the value of the dmtaskexecuteinelaborazione property.
     * 
     * @param value
     *     allowed object is
     *     {@link BaseSelected }
     *     
     */
    public void setDMTASKEXECUTEINELABORAZIONE(BaseSelected value) {
        this.dmtaskexecuteinelaborazione = value;
    }

    /**
     * Gets the value of the dmutentiaoo property.
     * 
     * @return
     *     possible object is
     *     {@link BaseSelected }
     *     
     */
    public BaseSelected getDMUTENTIAOO() {
        return dmutentiaoo;
    }

    /**
     * Sets the value of the dmutentiaoo property.
     * 
     * @param value
     *     allowed object is
     *     {@link BaseSelected }
     *     
     */
    public void setDMUTENTIAOO(BaseSelected value) {
        this.dmutentiaoo = value;
    }

    /**
     * Gets the value of the dmprofileautoredescription property.
     * 
     * @return
     *     possible object is
     *     {@link BaseSelected }
     *     
     */
    public BaseSelected getDMPROFILEAUTOREDESCRIPTION() {
        return dmprofileautoredescription;
    }

    /**
     * Sets the value of the dmprofileautoredescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link BaseSelected }
     *     
     */
    public void setDMPROFILEAUTOREDESCRIPTION(BaseSelected value) {
        this.dmprofileautoredescription = value;
    }

    /**
     * Gets the value of the dmprofilesenders property.
     * 
     * @return
     *     possible object is
     *     {@link BaseSelected }
     *     
     */
    public BaseSelected getDMPROFILESENDERS() {
        return dmprofilesenders;
    }

    /**
     * Sets the value of the dmprofilesenders property.
     * 
     * @param value
     *     allowed object is
     *     {@link BaseSelected }
     *     
     */
    public void setDMPROFILESENDERS(BaseSelected value) {
        this.dmprofilesenders = value;
    }

    /**
     * Gets the value of the maxRowCount property.
     * 
     */
    public int getMaxRowCount() {
        return maxRowCount;
    }

    /**
     * Sets the value of the maxRowCount property.
     * 
     */
    public void setMaxRowCount(int value) {
        this.maxRowCount = value;
    }

    /**
     * Gets the value of the getRowCount property.
     * 
     */
    public boolean isGetRowCount() {
        return getRowCount;
    }

    /**
     * Sets the value of the getRowCount property.
     * 
     */
    public void setGetRowCount(boolean value) {
        this.getRowCount = value;
    }

    /**
     * Gets the value of the distinct property.
     * 
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * Sets the value of the distinct property.
     * 
     */
    public void setDistinct(boolean value) {
        this.distinct = value;
    }

}
