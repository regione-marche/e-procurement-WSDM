
package it.abletech.arxivar.dati;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Dm_Counters_Tables.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="Dm_Counters_Tables">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="DM_ALLEGATIDOC"/>
 *     &lt;enumeration value="DM_ALLEGATIFAX"/>
 *     &lt;enumeration value="DM_ALLEGATIWORK"/>
 *     &lt;enumeration value="DM_ASSOCIAZIONI"/>
 *     &lt;enumeration value="DM_CAMPIPRATICA"/>
 *     &lt;enumeration value="DM_CAMPIPRATICHECBO"/>
 *     &lt;enumeration value="DM_CAMPISPECGRP"/>
 *     &lt;enumeration value="DM_CONTATTI"/>
 *     &lt;enumeration value="DM_FASCICOLI"/>
 *     &lt;enumeration value="DM_FAXOUT"/>
 *     &lt;enumeration value="DM_NOTE"/>
 *     &lt;enumeration value="DM_OPZIONI"/>
 *     &lt;enumeration value="DM_PERMESSI_FOLDER"/>
 *     &lt;enumeration value="DM_PERMESSI_RUBRICA"/>
 *     &lt;enumeration value="DM_PROFILE"/>
 *     &lt;enumeration value="DM_GRUPPI"/>
 *     &lt;enumeration value="DM_RUBRICA"/>
 *     &lt;enumeration value="DM_UTENTI"/>
 *     &lt;enumeration value="DM_REVISIONI"/>
 *     &lt;enumeration value="DM_SECURITY"/>
 *     &lt;enumeration value="DM_STATOSECURITY"/>
 *     &lt;enumeration value="DM_TIPIPRATICHE"/>
 *     &lt;enumeration value="DM_TABELLE"/>
 *     &lt;enumeration value="DM_TIPI_UTENTI"/>
 *     &lt;enumeration value="DM_ELENCO_ORG"/>
 *     &lt;enumeration value="DM_ORGANIGRAMMA"/>
 *     &lt;enumeration value="DM_ORGDESIGN"/>
 *     &lt;enumeration value="DM_CATRUBRICHE"/>
 *     &lt;enumeration value="DM_CAMPI"/>
 *     &lt;enumeration value="DM_CAMPI_VALORI"/>
 *     &lt;enumeration value="DM_RUBRICA_OPZIONALI"/>
 *     &lt;enumeration value="DM_NOTECONTATTI"/>
 *     &lt;enumeration value="DM_SECURITY_DOC"/>
 *     &lt;enumeration value="DM_NPCE_OUT"/>
 *     &lt;enumeration value="DM_LOG"/>
 *     &lt;enumeration value="DM_NPCE_LOG"/>
 *     &lt;enumeration value="DM_DESKTOP"/>
 *     &lt;enumeration value="DM_VARIABILIPROCESSO"/>
 *     &lt;enumeration value="DM_DATIPROFILO"/>
 *     &lt;enumeration value="DM_AUTOPROFILO"/>
 *     &lt;enumeration value="DM_PROTOCOLLI"/>
 *     &lt;enumeration value="DM_DATI_ENTE"/>
 *     &lt;enumeration value="DM_NUMERAZIONE"/>
 *     &lt;enumeration value="DM_FILEINFOLDER"/>
 *     &lt;enumeration value="DM_INOLTRO"/>
 *     &lt;enumeration value="DM_DOCMOV"/>
 *     &lt;enumeration value="DM_CAMPIMESSAGGIO"/>
 *     &lt;enumeration value="DM_DETTAGLIMAIL"/>
 *     &lt;enumeration value="DM_MAILOUT"/>
 *     &lt;enumeration value="DM_DELEGATI"/>
 *     &lt;enumeration value="DM_MSG"/>
 *     &lt;enumeration value="DM_ACCOUNT"/>
 *     &lt;enumeration value="DM_FOLDERTYPE"/>
 *     &lt;enumeration value="SD_ASSOCDOC"/>
 *     &lt;enumeration value="DM_COMBO"/>
 *     &lt;enumeration value="DM_REGOLEUNIVOCITA"/>
 *     &lt;enumeration value="DM_BARCODE"/>
 *     &lt;enumeration value="DM_DOCALLEGATI"/>
 *     &lt;enumeration value="DM_STARTWORKFLOW"/>
 *     &lt;enumeration value="DM_FILTRO"/>
 *     &lt;enumeration value="DM_ELENCOPRATICHE"/>
 *     &lt;enumeration value="DM_TESTO"/>
 *     &lt;enumeration value="DM_PROCBATCH"/>
 *     &lt;enumeration value="DM_EVENTIFLOW"/>
 *     &lt;enumeration value="DM_TRADUZIONI"/>
 *     &lt;enumeration value="DM_TIPIDOCUMENTO"/>
 *     &lt;enumeration value="DM_GRUPPIMODELLI"/>
 *     &lt;enumeration value="DM_ASSOCIAFOLDER_DATIPROFILO"/>
 *     &lt;enumeration value="DM_ASSOCIAFOLDER"/>
 *     &lt;enumeration value="DM_MODULIOFFICE"/>
 *     &lt;enumeration value="DM_EMERGENZA"/>
 *     &lt;enumeration value="DM_TASKEXECUTE"/>
 *     &lt;enumeration value="DM_NOTEWORK"/>
 *     &lt;enumeration value="DM_PERMESSIALLEGATI"/>
 *     &lt;enumeration value="DM_PROCESSDOC"/>
 *     &lt;enumeration value="DM_MASSIVEUPDATES"/>
 *     &lt;enumeration value="DM_MASSIVEUPDATES_DATIPROFILO"/>
 *     &lt;enumeration value="DM_MASSIVEUPDATES_DATA"/>
 *     &lt;enumeration value="DM_COMANDITASK"/>
 *     &lt;enumeration value="DM_TRADUZIONI_PKG"/>
 *     &lt;enumeration value="DM_FIGUREPROCESSO"/>
 *     &lt;enumeration value="DM_PROMEMORIA"/>
 *     &lt;enumeration value="DM_ALLEGATIPROMO"/>
 *     &lt;enumeration value="DM_SIGNDELEGATE"/>
 *     &lt;enumeration value="DM_SIGNCERT"/>
 *     &lt;enumeration value="DM_SIGNCERTLOCATION"/>
 *     &lt;enumeration value="DM_VARIABILIQUERY"/>
 *     &lt;enumeration value="DM_ASSOCIAFOLDER_MAPPING"/>
 *     &lt;enumeration value="DM_PERMESSINOTE"/>
 *     &lt;enumeration value="DM_WORKFLOW_EXTRAGRANT"/>
 *     &lt;enumeration value="DM_QUEUE"/>
 *     &lt;enumeration value="DM_QUEUEDETAIL"/>
 *     &lt;enumeration value="NOTHING"/>
 *     &lt;enumeration value="DM_CACHE"/>
 *     &lt;enumeration value="DM_THUMBNAIL"/>
 *     &lt;enumeration value="DM_SMSACCOUNT"/>
 *     &lt;enumeration value="DM_SHARING"/>
 *     &lt;enumeration value="DM_SHARING_DEFINITION"/>
 *     &lt;enumeration value="DM_SHARING_DETAIL"/>
 *     &lt;enumeration value="DM_SHARING_RECEIVER"/>
 *     &lt;enumeration value="DM_SHARING_OPERATION"/>
 *     &lt;enumeration value="DM_TASKWORK"/>
 *     &lt;enumeration value="DM_TASKWORK_CLOSE"/>
 *     &lt;enumeration value="DM_INSTRUCTIONS"/>
 *     &lt;enumeration value="DM_TASKS"/>
 *     &lt;enumeration value="DM_WORKFLOW"/>
 *     &lt;enumeration value="DM_AOO"/>
 *     &lt;enumeration value="DM_LOGONPROVIDERS"/>
 *     &lt;enumeration value="DM_MASSIVEUPDATES_MAPPING"/>
 *     &lt;enumeration value="DM_STORAGE"/>
 *     &lt;enumeration value="DM_TIPIDOC_DEFMAIL"/>
 *     &lt;enumeration value="DM_LOGS"/>
 *     &lt;enumeration value="DM_PN_DEVICE"/>
 *     &lt;enumeration value="DM_PN_NOTIFICATIONS"/>
 *     &lt;enumeration value="DM_COLLABORATION"/>
 *     &lt;enumeration value="DM_COLLABORATION_MASTER"/>
 *     &lt;enumeration value="DM_COLLABORATION_DETAIL"/>
 *     &lt;enumeration value="WS_VERSAMENTI"/>
 *     &lt;enumeration value="WS_VERSAMENTI_DETT_ATT"/>
 *     &lt;enumeration value="WS_VERSAMENTI_DETT_NOTE"/>
 *     &lt;enumeration value="WS_VERSAMENTI_DETT_DOC"/>
 *     &lt;enumeration value="WS_AOS"/>
 *     &lt;enumeration value="WS_AOS_MAPPING"/>
 *     &lt;enumeration value="WS_DOCTOIX"/>
 *     &lt;enumeration value="WS_DOCTOIX_DETAIL"/>
 *     &lt;enumeration value="WS_TIPIDOCUMENTO"/>
 *     &lt;enumeration value="WS_CREDENTIAL"/>
 *     &lt;enumeration value="WS_CLASSINORM"/>
 *     &lt;enumeration value="WS_CLASSINORM_FILTER"/>
 *     &lt;enumeration value="WS_TIPIDOC_EXPORT"/>
 *     &lt;enumeration value="WS_TIPIDOC_ROTT"/>
 *     &lt;enumeration value="WS_NOTIFY"/>
 *     &lt;enumeration value="WS_NOTIFY_MAPPING"/>
 *     &lt;enumeration value="DM_COLLABORATION_TEMPLATE"/>
 *     &lt;enumeration value="DM_COLLABORATION_TAKEOFF"/>
 *     &lt;enumeration value="DM_COLLABORATION_TEMPLATE_M"/>
 *     &lt;enumeration value="WS_CONFCLASSEIXCE"/>
 *     &lt;enumeration value="WS_CAMPIMETADATIIXCE"/>
 *     &lt;enumeration value="WS_DOCTOIXCE"/>
 *     &lt;enumeration value="WS_DOCTOIXCE_DETAIL"/>
 *     &lt;enumeration value="WS_VERSAMENTO"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "Dm_Counters_Tables")
@XmlEnum
public enum DmCountersTables {

    DM_ALLEGATIDOC,
    DM_ALLEGATIFAX,
    DM_ALLEGATIWORK,
    DM_ASSOCIAZIONI,
    DM_CAMPIPRATICA,
    DM_CAMPIPRATICHECBO,
    DM_CAMPISPECGRP,
    DM_CONTATTI,
    DM_FASCICOLI,
    DM_FAXOUT,
    DM_NOTE,
    DM_OPZIONI,
    DM_PERMESSI_FOLDER,
    DM_PERMESSI_RUBRICA,
    DM_PROFILE,
    DM_GRUPPI,
    DM_RUBRICA,
    DM_UTENTI,
    DM_REVISIONI,
    DM_SECURITY,
    DM_STATOSECURITY,
    DM_TIPIPRATICHE,
    DM_TABELLE,
    DM_TIPI_UTENTI,
    DM_ELENCO_ORG,
    DM_ORGANIGRAMMA,
    DM_ORGDESIGN,
    DM_CATRUBRICHE,
    DM_CAMPI,
    DM_CAMPI_VALORI,
    DM_RUBRICA_OPZIONALI,
    DM_NOTECONTATTI,
    DM_SECURITY_DOC,
    DM_NPCE_OUT,
    DM_LOG,
    DM_NPCE_LOG,
    DM_DESKTOP,
    DM_VARIABILIPROCESSO,
    DM_DATIPROFILO,
    DM_AUTOPROFILO,
    DM_PROTOCOLLI,
    DM_DATI_ENTE,
    DM_NUMERAZIONE,
    DM_FILEINFOLDER,
    DM_INOLTRO,
    DM_DOCMOV,
    DM_CAMPIMESSAGGIO,
    DM_DETTAGLIMAIL,
    DM_MAILOUT,
    DM_DELEGATI,
    DM_MSG,
    DM_ACCOUNT,
    DM_FOLDERTYPE,
    SD_ASSOCDOC,
    DM_COMBO,
    DM_REGOLEUNIVOCITA,
    DM_BARCODE,
    DM_DOCALLEGATI,
    DM_STARTWORKFLOW,
    DM_FILTRO,
    DM_ELENCOPRATICHE,
    DM_TESTO,
    DM_PROCBATCH,
    DM_EVENTIFLOW,
    DM_TRADUZIONI,
    DM_TIPIDOCUMENTO,
    DM_GRUPPIMODELLI,
    DM_ASSOCIAFOLDER_DATIPROFILO,
    DM_ASSOCIAFOLDER,
    DM_MODULIOFFICE,
    DM_EMERGENZA,
    DM_TASKEXECUTE,
    DM_NOTEWORK,
    DM_PERMESSIALLEGATI,
    DM_PROCESSDOC,
    DM_MASSIVEUPDATES,
    DM_MASSIVEUPDATES_DATIPROFILO,
    DM_MASSIVEUPDATES_DATA,
    DM_COMANDITASK,
    DM_TRADUZIONI_PKG,
    DM_FIGUREPROCESSO,
    DM_PROMEMORIA,
    DM_ALLEGATIPROMO,
    DM_SIGNDELEGATE,
    DM_SIGNCERT,
    DM_SIGNCERTLOCATION,
    DM_VARIABILIQUERY,
    DM_ASSOCIAFOLDER_MAPPING,
    DM_PERMESSINOTE,
    DM_WORKFLOW_EXTRAGRANT,
    DM_QUEUE,
    DM_QUEUEDETAIL,
    NOTHING,
    DM_CACHE,
    DM_THUMBNAIL,
    DM_SMSACCOUNT,
    DM_SHARING,
    DM_SHARING_DEFINITION,
    DM_SHARING_DETAIL,
    DM_SHARING_RECEIVER,
    DM_SHARING_OPERATION,
    DM_TASKWORK,
    DM_TASKWORK_CLOSE,
    DM_INSTRUCTIONS,
    DM_TASKS,
    DM_WORKFLOW,
    DM_AOO,
    DM_LOGONPROVIDERS,
    DM_MASSIVEUPDATES_MAPPING,
    DM_STORAGE,
    DM_TIPIDOC_DEFMAIL,
    DM_LOGS,
    DM_PN_DEVICE,
    DM_PN_NOTIFICATIONS,
    DM_COLLABORATION,
    DM_COLLABORATION_MASTER,
    DM_COLLABORATION_DETAIL,
    WS_VERSAMENTI,
    WS_VERSAMENTI_DETT_ATT,
    WS_VERSAMENTI_DETT_NOTE,
    WS_VERSAMENTI_DETT_DOC,
    WS_AOS,
    WS_AOS_MAPPING,
    WS_DOCTOIX,
    WS_DOCTOIX_DETAIL,
    WS_TIPIDOCUMENTO,
    WS_CREDENTIAL,
    WS_CLASSINORM,
    WS_CLASSINORM_FILTER,
    WS_TIPIDOC_EXPORT,
    WS_TIPIDOC_ROTT,
    WS_NOTIFY,
    WS_NOTIFY_MAPPING,
    DM_COLLABORATION_TEMPLATE,
    DM_COLLABORATION_TAKEOFF,
    DM_COLLABORATION_TEMPLATE_M,
    WS_CONFCLASSEIXCE,
    WS_CAMPIMETADATIIXCE,
    WS_DOCTOIXCE,
    WS_DOCTOIXCE_DETAIL,
    WS_VERSAMENTO;

    public String value() {
        return name();
    }

    public static DmCountersTables fromValue(String v) {
        return valueOf(v);
    }

}
