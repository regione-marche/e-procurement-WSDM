
package it.abletech.arxivar.dati;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Security_Exception.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="Security_Exception">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Nothing"/>
 *     &lt;enumeration value="Document_Not_Exist"/>
 *     &lt;enumeration value="Document_Not_Avaiable"/>
 *     &lt;enumeration value="Document_Is_Archived"/>
 *     &lt;enumeration value="Document_Has_Running_Process"/>
 *     &lt;enumeration value="Document_Opened_By_Another_User"/>
 *     &lt;enumeration value="Document_Pa"/>
 *     &lt;enumeration value="User_Cannot_Write_In_This_Class"/>
 *     &lt;enumeration value="User_Cannot_Write_In_This_Document"/>
 *     &lt;enumeration value="State_Cannot_Permit_Edit"/>
 *     &lt;enumeration value="Document_as_been_Extracted"/>
 *     &lt;enumeration value="Cannot_Edit_For_Task_Associated"/>
 *     &lt;enumeration value="Cannot_Find_ProcessDoc"/>
 *     &lt;enumeration value="User_Not_Exist"/>
 *     &lt;enumeration value="User_Cannot_Delete_Documents"/>
 *     &lt;enumeration value="User_Cannot_Delete_This_Document"/>
 *     &lt;enumeration value="User_IsNotInAutoreMittenteDestinatari"/>
 *     &lt;enumeration value="Mail_Address_Is_Not_Unique"/>
 *     &lt;enumeration value="Mail_Address_NotFound"/>
 *     &lt;enumeration value="UserName_Is_Not_Unique"/>
 *     &lt;enumeration value="UserName_Not_Exist"/>
 *     &lt;enumeration value="UserName_Mail_Is_Not_Unique"/>
 *     &lt;enumeration value="User_AlreadyExist"/>
 *     &lt;enumeration value="User_AlreadyExist_In_HiddenState"/>
 *     &lt;enumeration value="User_AlreadyExist_Not_Active"/>
 *     &lt;enumeration value="Dm_StringaConnessione_Fail"/>
 *     &lt;enumeration value="Dm_AssociaFolder_UsedIn_SRP"/>
 *     &lt;enumeration value="Dm_AssociaFolder_UsedIn_Folders"/>
 *     &lt;enumeration value="Dm_AssociaFolder_UsedIn_DefaultProfile"/>
 *     &lt;enumeration value="Dm_AssociaFolder_UsedIn_Mask"/>
 *     &lt;enumeration value="Dm_StringaConnessione_UsedIn_Dm_VariabiliProcesso"/>
 *     &lt;enumeration value="Dm_StringaConnessione_UsedIn_Dm_CampiQuery"/>
 *     &lt;enumeration value="Dm_StringaConnessione_UsedIn_Dm_ElencoCampiTabella"/>
 *     &lt;enumeration value="Dm_Combo_Gruppi_UsedIn_Dm_CampiSpecifici"/>
 *     &lt;enumeration value="Dm_Combo_Gruppi_UsedIn_Dm_VariabiliProcesso"/>
 *     &lt;enumeration value="Dm_CampiSpecGrp_UsedIn_Dm_Campispecifici"/>
 *     &lt;enumeration value="Dm_Tipidocumento_Invalid_systemId"/>
 *     &lt;enumeration value="Dm_Tipidocumento_Is_Not_Leaf"/>
 *     &lt;enumeration value="Dm_Tipidocumento_Contains_Specific_Fields"/>
 *     &lt;enumeration value="Dm_Tipidocumento_Exist_Profiles"/>
 *     &lt;enumeration value="Dm_Tipidocumento_Dm_Links_Contains_SystemId"/>
 *     &lt;enumeration value="State_Cannot_Permit_Revision"/>
 *     &lt;enumeration value="State_Cannot_Permit_OverWrite"/>
 *     &lt;enumeration value="Dm_Utenti_Categoria_Must_Be_U"/>
 *     &lt;enumeration value="Dm_Utenti_User_Is_In_Org"/>
 *     &lt;enumeration value="Dm_Utenti_Invalid_Aoo"/>
 *     &lt;enumeration value="Dm_Aoo_Not_Exist"/>
 *     &lt;enumeration value="Profile_Is_Locked_By_Other_User"/>
 *     &lt;enumeration value="RenameDocument_Invalid_FileName"/>
 *     &lt;enumeration value="RenameDocument_Invalid_Extension"/>
 *     &lt;enumeration value="Dm_Files_Log_Acces_Denied"/>
 *     &lt;enumeration value="Dm_Emergenza_Tipo_Invalid"/>
 *     &lt;enumeration value="Dm_Emergenza_Default_DocumentType_Not_Set"/>
 *     &lt;enumeration value="Dm_TipiDocumento_Not_Found"/>
 *     &lt;enumeration value="Dm_TipiDocumento_Is_Not_Pa"/>
 *     &lt;enumeration value="User_Is_Not_In_Role"/>
 *     &lt;enumeration value="Dm_Sql_UsedIn_Dm_CampiQuery"/>
 *     &lt;enumeration value="Dm_Fascicoli_Id_Not_Found"/>
 *     &lt;enumeration value="Dm_Fascioli_Delete_Principale"/>
 *     &lt;enumeration value="Access_Is_Denied"/>
 *     &lt;enumeration value="Dm_Fascioli_Has_Childs"/>
 *     &lt;enumeration value="Dm_Fascicoli_Contains_Docs"/>
 *     &lt;enumeration value="Dm_Fileinfolde_Not_Found"/>
 *     &lt;enumeration value="Profile_Entity_Not_Validate"/>
 *     &lt;enumeration value="Profile_Duplicate_Field"/>
 *     &lt;enumeration value="Aoo_Null"/>
 *     &lt;enumeration value="Aoo_Not_Found"/>
 *     &lt;enumeration value="Dm_Tipidocumento_Invalid_State"/>
 *     &lt;enumeration value="Dm_Tipidocumento_User_Can_Not_Write"/>
 *     &lt;enumeration value="Dm_ElencoPratiche_Not_Found"/>
 *     &lt;enumeration value="Profile_Pa_CanNotModify_Field"/>
 *     &lt;enumeration value="Dm_CampiSpecifici_Required"/>
 *     &lt;enumeration value="Dm_CampiSpecifici_NotFound"/>
 *     &lt;enumeration value="File_Required"/>
 *     &lt;enumeration value="File_Name_Required"/>
 *     &lt;enumeration value="Dm_Profile_Insert_Barcode_Incompatible_Class"/>
 *     &lt;enumeration value="Uniqueness_Rule_Violate"/>
 *     &lt;enumeration value="Dm_Profile_Update_DATADOC_Greather_Than_DATAPROT"/>
 *     &lt;enumeration value="Dm_Profile_Update_UnderPa_CanNotModifyAoo"/>
 *     &lt;enumeration value="Dm_Profile_Update_UnderPa_CanNotModifyState"/>
 *     &lt;enumeration value="Dm_Profile_Update_UnderPa_CanNotModifyObject"/>
 *     &lt;enumeration value="Dm_Profile_Update_UnderPa_CanNotModifyInOut"/>
 *     &lt;enumeration value="Dm_Profile_Update_UnderPa_CanNotModifyDocumentType"/>
 *     &lt;enumeration value="Dm_Profile_Update_UnderPa_CanNotModifyFrom"/>
 *     &lt;enumeration value="Dm_Profile_Update_UnderPa_CanNotModifyTo"/>
 *     &lt;enumeration value="DatiEnte_Spedizione_Invalid"/>
 *     &lt;enumeration value="Profile_DataProt_Invalid"/>
 *     &lt;enumeration value="Dm_Profile_Insert_Ivalid_InOut"/>
 *     &lt;enumeration value="Dm_Setup_Invalid_StatoRegistra"/>
 *     &lt;enumeration value="Dm_Profile_Insert_Barcode_AlreadyExist"/>
 *     &lt;enumeration value="Dm_TaskWork_Task_Not_In_Charge"/>
 *     &lt;enumeration value="Dm_TaskWork_Set_ReadOnly_To_Document"/>
 *     &lt;enumeration value="Dm_NoteWork_Does_Not_Exist"/>
 *     &lt;enumeration value="User_Is_Not_Owner"/>
 *     &lt;enumeration value="Dm_AllegatiWork_Id_Not_Found"/>
 *     &lt;enumeration value="Document_Is_Opened"/>
 *     &lt;enumeration value="DmComandiTask_Required"/>
 *     &lt;enumeration value="DmTaskDoc_Required"/>
 *     &lt;enumeration value="Dm_VariabiliTask_Required"/>
 *     &lt;enumeration value="Dm_FigureTask_Required"/>
 *     &lt;enumeration value="Password_Required"/>
 *     &lt;enumeration value="TCondEsiti_Execute"/>
 *     &lt;enumeration value="Dm_Links_Missing"/>
 *     &lt;enumeration value="Document_Is_Empty"/>
 *     &lt;enumeration value="Dm_ComandiTask_ClientSide"/>
 *     &lt;enumeration value="System_Diagnostic_Exception"/>
 *     &lt;enumeration value="Certificate_Not_Found"/>
 *     &lt;enumeration value="Sign_Exception"/>
 *     &lt;enumeration value="SIgn_Service_not_Found"/>
 *     &lt;enumeration value="Dm_Combo_Gruppi_UsedIn_Dm_VariabiliQuery"/>
 *     &lt;enumeration value="Dm_RicQuick_Campi_VB6ManageRicQuickFail"/>
 *     &lt;enumeration value="Dm_Processi_Can_Not_EditDoc"/>
 *     &lt;enumeration value="Stamps_Are_Not_Available"/>
 *     &lt;enumeration value="Dm_Profile_Has_No_File"/>
 *     &lt;enumeration value="Arx_Stamp_Apply_Error"/>
 *     &lt;enumeration value="FILE_NULL_AFTER_STAMP_APPLY"/>
 *     &lt;enumeration value="Profile_Pa_Reserved_FromIsRequire"/>
 *     &lt;enumeration value="Profile_Pa_Reserved_ToIsRequire"/>
 *     &lt;enumeration value="Profile_Pa_Reserved_AooIsRequire"/>
 *     &lt;enumeration value="Profile_Pa_Reserved_DocNameIsRequire"/>
 *     &lt;enumeration value="Dm_Profile_Update_EvasionePa_ClassNoPaException"/>
 *     &lt;enumeration value="User_Is_Not_Admin"/>
 *     &lt;enumeration value="Dm_Rubrica_Used_In_AssociaFolder"/>
 *     &lt;enumeration value="Invalid_Task_Outcome"/>
 *     &lt;enumeration value="Profile_Insert_Error"/>
 *     &lt;enumeration value="Dm_Tipidocumento_NoFile"/>
 *     &lt;enumeration value="LicenseBaseMissing"/>
 *     &lt;enumeration value="File_Already_Present"/>
 *     &lt;enumeration value="Generic"/>
 *     &lt;enumeration value="Dm_Profile_Not_Found"/>
 *     &lt;enumeration value="Dm_Profile_Is_Not_CheckedOut"/>
 *     &lt;enumeration value="User_Cannot_Read_This_Document"/>
 *     &lt;enumeration value="State_Not_Exist"/>
 *     &lt;enumeration value="Sign_Not_Verified"/>
 *     &lt;enumeration value="Dm_Barcode_IdBarcode_Not_Found"/>
 *     &lt;enumeration value="User_Cannot_Use_Barcode"/>
 *     &lt;enumeration value="Dm_Rubrica_User_CanNotDelete"/>
 *     &lt;enumeration value="Dm_Rubrica_User_CanNotUpdate"/>
 *     &lt;enumeration value="Password_Faulted"/>
 *     &lt;enumeration value="User_Cannot_Read_Any_Document"/>
 *     &lt;enumeration value="User_Cannot_Read_Some_Document"/>
 *     &lt;enumeration value="Dm_TipiDocumento_Is_Not_Aos"/>
 *     &lt;enumeration value="Dm_Profile_IsAos"/>
 *     &lt;enumeration value="Certificate_LoginFailed"/>
 *     &lt;enumeration value="Dm_Tipidocumento_RequireFileMustBeOptional"/>
 *     &lt;enumeration value="Dm_Taskwork_User_Cannot_Lock_Task"/>
 *     &lt;enumeration value="Dm_Taskwork_Already_Locked_By_Another_User"/>
 *     &lt;enumeration value="Dm_Taskwork_Already_Locked_By_User_Other_Session"/>
 *     &lt;enumeration value="Dm_LogonProvider_Association_Missing"/>
 *     &lt;enumeration value="Dm_Links_Command_IsClient"/>
 *     &lt;enumeration value="Dm_Collaboration_Is_Read_Only"/>
 *     &lt;enumeration value="Dm_Collaboration_User_Is_Not_Detail"/>
 *     &lt;enumeration value="Dm_Collaboration_Not_Have_Master"/>
 *     &lt;enumeration value="Dm_Collaboration_Not_Exist"/>
 *     &lt;enumeration value="Ws_DocToIx_Cannot_Delete_Documents"/>
 *     &lt;enumeration value="Ws_DocToIxCe_Cannot_Delete_Documents"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "Security_Exception")
@XmlEnum
public enum SecurityException {

    @XmlEnumValue("Nothing")
    NOTHING("Nothing"),
    @XmlEnumValue("Document_Not_Exist")
    DOCUMENT_NOT_EXIST("Document_Not_Exist"),
    @XmlEnumValue("Document_Not_Avaiable")
    DOCUMENT_NOT_AVAIABLE("Document_Not_Avaiable"),
    @XmlEnumValue("Document_Is_Archived")
    DOCUMENT_IS_ARCHIVED("Document_Is_Archived"),
    @XmlEnumValue("Document_Has_Running_Process")
    DOCUMENT_HAS_RUNNING_PROCESS("Document_Has_Running_Process"),
    @XmlEnumValue("Document_Opened_By_Another_User")
    DOCUMENT_OPENED_BY_ANOTHER_USER("Document_Opened_By_Another_User"),
    @XmlEnumValue("Document_Pa")
    DOCUMENT_PA("Document_Pa"),
    @XmlEnumValue("User_Cannot_Write_In_This_Class")
    USER_CANNOT_WRITE_IN_THIS_CLASS("User_Cannot_Write_In_This_Class"),
    @XmlEnumValue("User_Cannot_Write_In_This_Document")
    USER_CANNOT_WRITE_IN_THIS_DOCUMENT("User_Cannot_Write_In_This_Document"),
    @XmlEnumValue("State_Cannot_Permit_Edit")
    STATE_CANNOT_PERMIT_EDIT("State_Cannot_Permit_Edit"),
    @XmlEnumValue("Document_as_been_Extracted")
    DOCUMENT_AS_BEEN_EXTRACTED("Document_as_been_Extracted"),
    @XmlEnumValue("Cannot_Edit_For_Task_Associated")
    CANNOT_EDIT_FOR_TASK_ASSOCIATED("Cannot_Edit_For_Task_Associated"),
    @XmlEnumValue("Cannot_Find_ProcessDoc")
    CANNOT_FIND_PROCESS_DOC("Cannot_Find_ProcessDoc"),
    @XmlEnumValue("User_Not_Exist")
    USER_NOT_EXIST("User_Not_Exist"),
    @XmlEnumValue("User_Cannot_Delete_Documents")
    USER_CANNOT_DELETE_DOCUMENTS("User_Cannot_Delete_Documents"),
    @XmlEnumValue("User_Cannot_Delete_This_Document")
    USER_CANNOT_DELETE_THIS_DOCUMENT("User_Cannot_Delete_This_Document"),
    @XmlEnumValue("User_IsNotInAutoreMittenteDestinatari")
    USER_IS_NOT_IN_AUTORE_MITTENTE_DESTINATARI("User_IsNotInAutoreMittenteDestinatari"),
    @XmlEnumValue("Mail_Address_Is_Not_Unique")
    MAIL_ADDRESS_IS_NOT_UNIQUE("Mail_Address_Is_Not_Unique"),
    @XmlEnumValue("Mail_Address_NotFound")
    MAIL_ADDRESS_NOT_FOUND("Mail_Address_NotFound"),
    @XmlEnumValue("UserName_Is_Not_Unique")
    USER_NAME_IS_NOT_UNIQUE("UserName_Is_Not_Unique"),
    @XmlEnumValue("UserName_Not_Exist")
    USER_NAME_NOT_EXIST("UserName_Not_Exist"),
    @XmlEnumValue("UserName_Mail_Is_Not_Unique")
    USER_NAME_MAIL_IS_NOT_UNIQUE("UserName_Mail_Is_Not_Unique"),
    @XmlEnumValue("User_AlreadyExist")
    USER_ALREADY_EXIST("User_AlreadyExist"),
    @XmlEnumValue("User_AlreadyExist_In_HiddenState")
    USER_ALREADY_EXIST_IN_HIDDEN_STATE("User_AlreadyExist_In_HiddenState"),
    @XmlEnumValue("User_AlreadyExist_Not_Active")
    USER_ALREADY_EXIST_NOT_ACTIVE("User_AlreadyExist_Not_Active"),
    @XmlEnumValue("Dm_StringaConnessione_Fail")
    DM_STRINGA_CONNESSIONE_FAIL("Dm_StringaConnessione_Fail"),
    @XmlEnumValue("Dm_AssociaFolder_UsedIn_SRP")
    DM_ASSOCIA_FOLDER_USED_IN_SRP("Dm_AssociaFolder_UsedIn_SRP"),
    @XmlEnumValue("Dm_AssociaFolder_UsedIn_Folders")
    DM_ASSOCIA_FOLDER_USED_IN_FOLDERS("Dm_AssociaFolder_UsedIn_Folders"),
    @XmlEnumValue("Dm_AssociaFolder_UsedIn_DefaultProfile")
    DM_ASSOCIA_FOLDER_USED_IN_DEFAULT_PROFILE("Dm_AssociaFolder_UsedIn_DefaultProfile"),
    @XmlEnumValue("Dm_AssociaFolder_UsedIn_Mask")
    DM_ASSOCIA_FOLDER_USED_IN_MASK("Dm_AssociaFolder_UsedIn_Mask"),
    @XmlEnumValue("Dm_StringaConnessione_UsedIn_Dm_VariabiliProcesso")
    DM_STRINGA_CONNESSIONE_USED_IN_DM_VARIABILI_PROCESSO("Dm_StringaConnessione_UsedIn_Dm_VariabiliProcesso"),
    @XmlEnumValue("Dm_StringaConnessione_UsedIn_Dm_CampiQuery")
    DM_STRINGA_CONNESSIONE_USED_IN_DM_CAMPI_QUERY("Dm_StringaConnessione_UsedIn_Dm_CampiQuery"),
    @XmlEnumValue("Dm_StringaConnessione_UsedIn_Dm_ElencoCampiTabella")
    DM_STRINGA_CONNESSIONE_USED_IN_DM_ELENCO_CAMPI_TABELLA("Dm_StringaConnessione_UsedIn_Dm_ElencoCampiTabella"),
    @XmlEnumValue("Dm_Combo_Gruppi_UsedIn_Dm_CampiSpecifici")
    DM_COMBO_GRUPPI_USED_IN_DM_CAMPI_SPECIFICI("Dm_Combo_Gruppi_UsedIn_Dm_CampiSpecifici"),
    @XmlEnumValue("Dm_Combo_Gruppi_UsedIn_Dm_VariabiliProcesso")
    DM_COMBO_GRUPPI_USED_IN_DM_VARIABILI_PROCESSO("Dm_Combo_Gruppi_UsedIn_Dm_VariabiliProcesso"),
    @XmlEnumValue("Dm_CampiSpecGrp_UsedIn_Dm_Campispecifici")
    DM_CAMPI_SPEC_GRP_USED_IN_DM_CAMPISPECIFICI("Dm_CampiSpecGrp_UsedIn_Dm_Campispecifici"),
    @XmlEnumValue("Dm_Tipidocumento_Invalid_systemId")
    DM_TIPIDOCUMENTO_INVALID_SYSTEM_ID("Dm_Tipidocumento_Invalid_systemId"),
    @XmlEnumValue("Dm_Tipidocumento_Is_Not_Leaf")
    DM_TIPIDOCUMENTO_IS_NOT_LEAF("Dm_Tipidocumento_Is_Not_Leaf"),
    @XmlEnumValue("Dm_Tipidocumento_Contains_Specific_Fields")
    DM_TIPIDOCUMENTO_CONTAINS_SPECIFIC_FIELDS("Dm_Tipidocumento_Contains_Specific_Fields"),
    @XmlEnumValue("Dm_Tipidocumento_Exist_Profiles")
    DM_TIPIDOCUMENTO_EXIST_PROFILES("Dm_Tipidocumento_Exist_Profiles"),
    @XmlEnumValue("Dm_Tipidocumento_Dm_Links_Contains_SystemId")
    DM_TIPIDOCUMENTO_DM_LINKS_CONTAINS_SYSTEM_ID("Dm_Tipidocumento_Dm_Links_Contains_SystemId"),
    @XmlEnumValue("State_Cannot_Permit_Revision")
    STATE_CANNOT_PERMIT_REVISION("State_Cannot_Permit_Revision"),
    @XmlEnumValue("State_Cannot_Permit_OverWrite")
    STATE_CANNOT_PERMIT_OVER_WRITE("State_Cannot_Permit_OverWrite"),
    @XmlEnumValue("Dm_Utenti_Categoria_Must_Be_U")
    DM_UTENTI_CATEGORIA_MUST_BE_U("Dm_Utenti_Categoria_Must_Be_U"),
    @XmlEnumValue("Dm_Utenti_User_Is_In_Org")
    DM_UTENTI_USER_IS_IN_ORG("Dm_Utenti_User_Is_In_Org"),
    @XmlEnumValue("Dm_Utenti_Invalid_Aoo")
    DM_UTENTI_INVALID_AOO("Dm_Utenti_Invalid_Aoo"),
    @XmlEnumValue("Dm_Aoo_Not_Exist")
    DM_AOO_NOT_EXIST("Dm_Aoo_Not_Exist"),
    @XmlEnumValue("Profile_Is_Locked_By_Other_User")
    PROFILE_IS_LOCKED_BY_OTHER_USER("Profile_Is_Locked_By_Other_User"),
    @XmlEnumValue("RenameDocument_Invalid_FileName")
    RENAME_DOCUMENT_INVALID_FILE_NAME("RenameDocument_Invalid_FileName"),
    @XmlEnumValue("RenameDocument_Invalid_Extension")
    RENAME_DOCUMENT_INVALID_EXTENSION("RenameDocument_Invalid_Extension"),
    @XmlEnumValue("Dm_Files_Log_Acces_Denied")
    DM_FILES_LOG_ACCES_DENIED("Dm_Files_Log_Acces_Denied"),
    @XmlEnumValue("Dm_Emergenza_Tipo_Invalid")
    DM_EMERGENZA_TIPO_INVALID("Dm_Emergenza_Tipo_Invalid"),
    @XmlEnumValue("Dm_Emergenza_Default_DocumentType_Not_Set")
    DM_EMERGENZA_DEFAULT_DOCUMENT_TYPE_NOT_SET("Dm_Emergenza_Default_DocumentType_Not_Set"),
    @XmlEnumValue("Dm_TipiDocumento_Not_Found")
    DM_TIPI_DOCUMENTO_NOT_FOUND("Dm_TipiDocumento_Not_Found"),
    @XmlEnumValue("Dm_TipiDocumento_Is_Not_Pa")
    DM_TIPI_DOCUMENTO_IS_NOT_PA("Dm_TipiDocumento_Is_Not_Pa"),
    @XmlEnumValue("User_Is_Not_In_Role")
    USER_IS_NOT_IN_ROLE("User_Is_Not_In_Role"),
    @XmlEnumValue("Dm_Sql_UsedIn_Dm_CampiQuery")
    DM_SQL_USED_IN_DM_CAMPI_QUERY("Dm_Sql_UsedIn_Dm_CampiQuery"),
    @XmlEnumValue("Dm_Fascicoli_Id_Not_Found")
    DM_FASCICOLI_ID_NOT_FOUND("Dm_Fascicoli_Id_Not_Found"),
    @XmlEnumValue("Dm_Fascioli_Delete_Principale")
    DM_FASCIOLI_DELETE_PRINCIPALE("Dm_Fascioli_Delete_Principale"),
    @XmlEnumValue("Access_Is_Denied")
    ACCESS_IS_DENIED("Access_Is_Denied"),
    @XmlEnumValue("Dm_Fascioli_Has_Childs")
    DM_FASCIOLI_HAS_CHILDS("Dm_Fascioli_Has_Childs"),
    @XmlEnumValue("Dm_Fascicoli_Contains_Docs")
    DM_FASCICOLI_CONTAINS_DOCS("Dm_Fascicoli_Contains_Docs"),
    @XmlEnumValue("Dm_Fileinfolde_Not_Found")
    DM_FILEINFOLDE_NOT_FOUND("Dm_Fileinfolde_Not_Found"),
    @XmlEnumValue("Profile_Entity_Not_Validate")
    PROFILE_ENTITY_NOT_VALIDATE("Profile_Entity_Not_Validate"),
    @XmlEnumValue("Profile_Duplicate_Field")
    PROFILE_DUPLICATE_FIELD("Profile_Duplicate_Field"),
    @XmlEnumValue("Aoo_Null")
    AOO_NULL("Aoo_Null"),
    @XmlEnumValue("Aoo_Not_Found")
    AOO_NOT_FOUND("Aoo_Not_Found"),
    @XmlEnumValue("Dm_Tipidocumento_Invalid_State")
    DM_TIPIDOCUMENTO_INVALID_STATE("Dm_Tipidocumento_Invalid_State"),
    @XmlEnumValue("Dm_Tipidocumento_User_Can_Not_Write")
    DM_TIPIDOCUMENTO_USER_CAN_NOT_WRITE("Dm_Tipidocumento_User_Can_Not_Write"),
    @XmlEnumValue("Dm_ElencoPratiche_Not_Found")
    DM_ELENCO_PRATICHE_NOT_FOUND("Dm_ElencoPratiche_Not_Found"),
    @XmlEnumValue("Profile_Pa_CanNotModify_Field")
    PROFILE_PA_CAN_NOT_MODIFY_FIELD("Profile_Pa_CanNotModify_Field"),
    @XmlEnumValue("Dm_CampiSpecifici_Required")
    DM_CAMPI_SPECIFICI_REQUIRED("Dm_CampiSpecifici_Required"),
    @XmlEnumValue("Dm_CampiSpecifici_NotFound")
    DM_CAMPI_SPECIFICI_NOT_FOUND("Dm_CampiSpecifici_NotFound"),
    @XmlEnumValue("File_Required")
    FILE_REQUIRED("File_Required"),
    @XmlEnumValue("File_Name_Required")
    FILE_NAME_REQUIRED("File_Name_Required"),
    @XmlEnumValue("Dm_Profile_Insert_Barcode_Incompatible_Class")
    DM_PROFILE_INSERT_BARCODE_INCOMPATIBLE_CLASS("Dm_Profile_Insert_Barcode_Incompatible_Class"),
    @XmlEnumValue("Uniqueness_Rule_Violate")
    UNIQUENESS_RULE_VIOLATE("Uniqueness_Rule_Violate"),
    @XmlEnumValue("Dm_Profile_Update_DATADOC_Greather_Than_DATAPROT")
    DM_PROFILE_UPDATE_DATADOC_GREATHER_THAN_DATAPROT("Dm_Profile_Update_DATADOC_Greather_Than_DATAPROT"),
    @XmlEnumValue("Dm_Profile_Update_UnderPa_CanNotModifyAoo")
    DM_PROFILE_UPDATE_UNDER_PA_CAN_NOT_MODIFY_AOO("Dm_Profile_Update_UnderPa_CanNotModifyAoo"),
    @XmlEnumValue("Dm_Profile_Update_UnderPa_CanNotModifyState")
    DM_PROFILE_UPDATE_UNDER_PA_CAN_NOT_MODIFY_STATE("Dm_Profile_Update_UnderPa_CanNotModifyState"),
    @XmlEnumValue("Dm_Profile_Update_UnderPa_CanNotModifyObject")
    DM_PROFILE_UPDATE_UNDER_PA_CAN_NOT_MODIFY_OBJECT("Dm_Profile_Update_UnderPa_CanNotModifyObject"),
    @XmlEnumValue("Dm_Profile_Update_UnderPa_CanNotModifyInOut")
    DM_PROFILE_UPDATE_UNDER_PA_CAN_NOT_MODIFY_IN_OUT("Dm_Profile_Update_UnderPa_CanNotModifyInOut"),
    @XmlEnumValue("Dm_Profile_Update_UnderPa_CanNotModifyDocumentType")
    DM_PROFILE_UPDATE_UNDER_PA_CAN_NOT_MODIFY_DOCUMENT_TYPE("Dm_Profile_Update_UnderPa_CanNotModifyDocumentType"),
    @XmlEnumValue("Dm_Profile_Update_UnderPa_CanNotModifyFrom")
    DM_PROFILE_UPDATE_UNDER_PA_CAN_NOT_MODIFY_FROM("Dm_Profile_Update_UnderPa_CanNotModifyFrom"),
    @XmlEnumValue("Dm_Profile_Update_UnderPa_CanNotModifyTo")
    DM_PROFILE_UPDATE_UNDER_PA_CAN_NOT_MODIFY_TO("Dm_Profile_Update_UnderPa_CanNotModifyTo"),
    @XmlEnumValue("DatiEnte_Spedizione_Invalid")
    DATI_ENTE_SPEDIZIONE_INVALID("DatiEnte_Spedizione_Invalid"),
    @XmlEnumValue("Profile_DataProt_Invalid")
    PROFILE_DATA_PROT_INVALID("Profile_DataProt_Invalid"),
    @XmlEnumValue("Dm_Profile_Insert_Ivalid_InOut")
    DM_PROFILE_INSERT_IVALID_IN_OUT("Dm_Profile_Insert_Ivalid_InOut"),
    @XmlEnumValue("Dm_Setup_Invalid_StatoRegistra")
    DM_SETUP_INVALID_STATO_REGISTRA("Dm_Setup_Invalid_StatoRegistra"),
    @XmlEnumValue("Dm_Profile_Insert_Barcode_AlreadyExist")
    DM_PROFILE_INSERT_BARCODE_ALREADY_EXIST("Dm_Profile_Insert_Barcode_AlreadyExist"),
    @XmlEnumValue("Dm_TaskWork_Task_Not_In_Charge")
    DM_TASK_WORK_TASK_NOT_IN_CHARGE("Dm_TaskWork_Task_Not_In_Charge"),
    @XmlEnumValue("Dm_TaskWork_Set_ReadOnly_To_Document")
    DM_TASK_WORK_SET_READ_ONLY_TO_DOCUMENT("Dm_TaskWork_Set_ReadOnly_To_Document"),
    @XmlEnumValue("Dm_NoteWork_Does_Not_Exist")
    DM_NOTE_WORK_DOES_NOT_EXIST("Dm_NoteWork_Does_Not_Exist"),
    @XmlEnumValue("User_Is_Not_Owner")
    USER_IS_NOT_OWNER("User_Is_Not_Owner"),
    @XmlEnumValue("Dm_AllegatiWork_Id_Not_Found")
    DM_ALLEGATI_WORK_ID_NOT_FOUND("Dm_AllegatiWork_Id_Not_Found"),
    @XmlEnumValue("Document_Is_Opened")
    DOCUMENT_IS_OPENED("Document_Is_Opened"),
    @XmlEnumValue("DmComandiTask_Required")
    DM_COMANDI_TASK_REQUIRED("DmComandiTask_Required"),
    @XmlEnumValue("DmTaskDoc_Required")
    DM_TASK_DOC_REQUIRED("DmTaskDoc_Required"),
    @XmlEnumValue("Dm_VariabiliTask_Required")
    DM_VARIABILI_TASK_REQUIRED("Dm_VariabiliTask_Required"),
    @XmlEnumValue("Dm_FigureTask_Required")
    DM_FIGURE_TASK_REQUIRED("Dm_FigureTask_Required"),
    @XmlEnumValue("Password_Required")
    PASSWORD_REQUIRED("Password_Required"),
    @XmlEnumValue("TCondEsiti_Execute")
    T_COND_ESITI_EXECUTE("TCondEsiti_Execute"),
    @XmlEnumValue("Dm_Links_Missing")
    DM_LINKS_MISSING("Dm_Links_Missing"),
    @XmlEnumValue("Document_Is_Empty")
    DOCUMENT_IS_EMPTY("Document_Is_Empty"),
    @XmlEnumValue("Dm_ComandiTask_ClientSide")
    DM_COMANDI_TASK_CLIENT_SIDE("Dm_ComandiTask_ClientSide"),
    @XmlEnumValue("System_Diagnostic_Exception")
    SYSTEM_DIAGNOSTIC_EXCEPTION("System_Diagnostic_Exception"),
    @XmlEnumValue("Certificate_Not_Found")
    CERTIFICATE_NOT_FOUND("Certificate_Not_Found"),
    @XmlEnumValue("Sign_Exception")
    SIGN_EXCEPTION("Sign_Exception"),
    @XmlEnumValue("SIgn_Service_not_Found")
    S_IGN_SERVICE_NOT_FOUND("SIgn_Service_not_Found"),
    @XmlEnumValue("Dm_Combo_Gruppi_UsedIn_Dm_VariabiliQuery")
    DM_COMBO_GRUPPI_USED_IN_DM_VARIABILI_QUERY("Dm_Combo_Gruppi_UsedIn_Dm_VariabiliQuery"),
    @XmlEnumValue("Dm_RicQuick_Campi_VB6ManageRicQuickFail")
    DM_RIC_QUICK_CAMPI_VB_6_MANAGE_RIC_QUICK_FAIL("Dm_RicQuick_Campi_VB6ManageRicQuickFail"),
    @XmlEnumValue("Dm_Processi_Can_Not_EditDoc")
    DM_PROCESSI_CAN_NOT_EDIT_DOC("Dm_Processi_Can_Not_EditDoc"),
    @XmlEnumValue("Stamps_Are_Not_Available")
    STAMPS_ARE_NOT_AVAILABLE("Stamps_Are_Not_Available"),
    @XmlEnumValue("Dm_Profile_Has_No_File")
    DM_PROFILE_HAS_NO_FILE("Dm_Profile_Has_No_File"),
    @XmlEnumValue("Arx_Stamp_Apply_Error")
    ARX_STAMP_APPLY_ERROR("Arx_Stamp_Apply_Error"),
    FILE_NULL_AFTER_STAMP_APPLY("FILE_NULL_AFTER_STAMP_APPLY"),
    @XmlEnumValue("Profile_Pa_Reserved_FromIsRequire")
    PROFILE_PA_RESERVED_FROM_IS_REQUIRE("Profile_Pa_Reserved_FromIsRequire"),
    @XmlEnumValue("Profile_Pa_Reserved_ToIsRequire")
    PROFILE_PA_RESERVED_TO_IS_REQUIRE("Profile_Pa_Reserved_ToIsRequire"),
    @XmlEnumValue("Profile_Pa_Reserved_AooIsRequire")
    PROFILE_PA_RESERVED_AOO_IS_REQUIRE("Profile_Pa_Reserved_AooIsRequire"),
    @XmlEnumValue("Profile_Pa_Reserved_DocNameIsRequire")
    PROFILE_PA_RESERVED_DOC_NAME_IS_REQUIRE("Profile_Pa_Reserved_DocNameIsRequire"),
    @XmlEnumValue("Dm_Profile_Update_EvasionePa_ClassNoPaException")
    DM_PROFILE_UPDATE_EVASIONE_PA_CLASS_NO_PA_EXCEPTION("Dm_Profile_Update_EvasionePa_ClassNoPaException"),
    @XmlEnumValue("User_Is_Not_Admin")
    USER_IS_NOT_ADMIN("User_Is_Not_Admin"),
    @XmlEnumValue("Dm_Rubrica_Used_In_AssociaFolder")
    DM_RUBRICA_USED_IN_ASSOCIA_FOLDER("Dm_Rubrica_Used_In_AssociaFolder"),
    @XmlEnumValue("Invalid_Task_Outcome")
    INVALID_TASK_OUTCOME("Invalid_Task_Outcome"),
    @XmlEnumValue("Profile_Insert_Error")
    PROFILE_INSERT_ERROR("Profile_Insert_Error"),
    @XmlEnumValue("Dm_Tipidocumento_NoFile")
    DM_TIPIDOCUMENTO_NO_FILE("Dm_Tipidocumento_NoFile"),
    @XmlEnumValue("LicenseBaseMissing")
    LICENSE_BASE_MISSING("LicenseBaseMissing"),
    @XmlEnumValue("File_Already_Present")
    FILE_ALREADY_PRESENT("File_Already_Present"),
    @XmlEnumValue("Generic")
    GENERIC("Generic"),
    @XmlEnumValue("Dm_Profile_Not_Found")
    DM_PROFILE_NOT_FOUND("Dm_Profile_Not_Found"),
    @XmlEnumValue("Dm_Profile_Is_Not_CheckedOut")
    DM_PROFILE_IS_NOT_CHECKED_OUT("Dm_Profile_Is_Not_CheckedOut"),
    @XmlEnumValue("User_Cannot_Read_This_Document")
    USER_CANNOT_READ_THIS_DOCUMENT("User_Cannot_Read_This_Document"),
    @XmlEnumValue("State_Not_Exist")
    STATE_NOT_EXIST("State_Not_Exist"),
    @XmlEnumValue("Sign_Not_Verified")
    SIGN_NOT_VERIFIED("Sign_Not_Verified"),
    @XmlEnumValue("Dm_Barcode_IdBarcode_Not_Found")
    DM_BARCODE_ID_BARCODE_NOT_FOUND("Dm_Barcode_IdBarcode_Not_Found"),
    @XmlEnumValue("User_Cannot_Use_Barcode")
    USER_CANNOT_USE_BARCODE("User_Cannot_Use_Barcode"),
    @XmlEnumValue("Dm_Rubrica_User_CanNotDelete")
    DM_RUBRICA_USER_CAN_NOT_DELETE("Dm_Rubrica_User_CanNotDelete"),
    @XmlEnumValue("Dm_Rubrica_User_CanNotUpdate")
    DM_RUBRICA_USER_CAN_NOT_UPDATE("Dm_Rubrica_User_CanNotUpdate"),
    @XmlEnumValue("Password_Faulted")
    PASSWORD_FAULTED("Password_Faulted"),
    @XmlEnumValue("User_Cannot_Read_Any_Document")
    USER_CANNOT_READ_ANY_DOCUMENT("User_Cannot_Read_Any_Document"),
    @XmlEnumValue("User_Cannot_Read_Some_Document")
    USER_CANNOT_READ_SOME_DOCUMENT("User_Cannot_Read_Some_Document"),
    @XmlEnumValue("Dm_TipiDocumento_Is_Not_Aos")
    DM_TIPI_DOCUMENTO_IS_NOT_AOS("Dm_TipiDocumento_Is_Not_Aos"),
    @XmlEnumValue("Dm_Profile_IsAos")
    DM_PROFILE_IS_AOS("Dm_Profile_IsAos"),
    @XmlEnumValue("Certificate_LoginFailed")
    CERTIFICATE_LOGIN_FAILED("Certificate_LoginFailed"),
    @XmlEnumValue("Dm_Tipidocumento_RequireFileMustBeOptional")
    DM_TIPIDOCUMENTO_REQUIRE_FILE_MUST_BE_OPTIONAL("Dm_Tipidocumento_RequireFileMustBeOptional"),
    @XmlEnumValue("Dm_Taskwork_User_Cannot_Lock_Task")
    DM_TASKWORK_USER_CANNOT_LOCK_TASK("Dm_Taskwork_User_Cannot_Lock_Task"),
    @XmlEnumValue("Dm_Taskwork_Already_Locked_By_Another_User")
    DM_TASKWORK_ALREADY_LOCKED_BY_ANOTHER_USER("Dm_Taskwork_Already_Locked_By_Another_User"),
    @XmlEnumValue("Dm_Taskwork_Already_Locked_By_User_Other_Session")
    DM_TASKWORK_ALREADY_LOCKED_BY_USER_OTHER_SESSION("Dm_Taskwork_Already_Locked_By_User_Other_Session"),
    @XmlEnumValue("Dm_LogonProvider_Association_Missing")
    DM_LOGON_PROVIDER_ASSOCIATION_MISSING("Dm_LogonProvider_Association_Missing"),
    @XmlEnumValue("Dm_Links_Command_IsClient")
    DM_LINKS_COMMAND_IS_CLIENT("Dm_Links_Command_IsClient"),
    @XmlEnumValue("Dm_Collaboration_Is_Read_Only")
    DM_COLLABORATION_IS_READ_ONLY("Dm_Collaboration_Is_Read_Only"),
    @XmlEnumValue("Dm_Collaboration_User_Is_Not_Detail")
    DM_COLLABORATION_USER_IS_NOT_DETAIL("Dm_Collaboration_User_Is_Not_Detail"),
    @XmlEnumValue("Dm_Collaboration_Not_Have_Master")
    DM_COLLABORATION_NOT_HAVE_MASTER("Dm_Collaboration_Not_Have_Master"),
    @XmlEnumValue("Dm_Collaboration_Not_Exist")
    DM_COLLABORATION_NOT_EXIST("Dm_Collaboration_Not_Exist"),
    @XmlEnumValue("Ws_DocToIx_Cannot_Delete_Documents")
    WS_DOC_TO_IX_CANNOT_DELETE_DOCUMENTS("Ws_DocToIx_Cannot_Delete_Documents"),
    @XmlEnumValue("Ws_DocToIxCe_Cannot_Delete_Documents")
    WS_DOC_TO_IX_CE_CANNOT_DELETE_DOCUMENTS("Ws_DocToIxCe_Cannot_Delete_Documents");
    private final String value;

    SecurityException(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SecurityException fromValue(String v) {
        for (SecurityException c: SecurityException.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
