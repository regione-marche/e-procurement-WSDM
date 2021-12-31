package it.abletech.arxivar.search;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 2.7.10
 * 2015-01-29T17:05:55.811+01:00
 * Generated source version: 2.7.10
 * 
 */
@WebService(targetNamespace = "http://www.Abletech.it/Arxivar", name = "ARX_SearchSoap")
@XmlSeeAlso({ObjectFactory.class})
public interface ARXSearchSoap {

    @WebResult(name = "Dm_Profile_Select_Get_New_Instance_By_TipiDocumentoCodiceResult", targetNamespace = "http://www.Abletech.it/Arxivar")
    @RequestWrapper(localName = "Dm_Profile_Select_Get_New_Instance_By_TipiDocumentoCodice", targetNamespace = "http://www.Abletech.it/Arxivar", className = "it.abletech.arxivar.search.DmProfileSelectGetNewInstanceByTipiDocumentoCodice")
    @WebMethod(operationName = "Dm_Profile_Select_Get_New_Instance_By_TipiDocumentoCodice", action = "http://www.Abletech.it/Arxivar/Dm_Profile_Select_Get_New_Instance_By_TipiDocumentoCodice")
    @ResponseWrapper(localName = "Dm_Profile_Select_Get_New_Instance_By_TipiDocumentoCodiceResponse", targetNamespace = "http://www.Abletech.it/Arxivar", className = "it.abletech.arxivar.search.DmProfileSelectGetNewInstanceByTipiDocumentoCodiceResponse")
    public it.abletech.arxivar.search.DmProfileSelect dmProfileSelectGetNewInstanceByTipiDocumentoCodice(
        @WebParam(name = "sessionId", targetNamespace = "http://www.Abletech.it/Arxivar")
        java.lang.String sessionId,
        @WebParam(name = "dmTipiDocumentoCodice", targetNamespace = "http://www.Abletech.it/Arxivar")
        java.lang.String dmTipiDocumentoCodice
    );

    @WebResult(name = "Dm_Profile_Search_Get_New_Instance_By_TipiDocumentoCodiceResult", targetNamespace = "http://www.Abletech.it/Arxivar")
    @RequestWrapper(localName = "Dm_Profile_Search_Get_New_Instance_By_TipiDocumentoCodice", targetNamespace = "http://www.Abletech.it/Arxivar", className = "it.abletech.arxivar.search.DmProfileSearchGetNewInstanceByTipiDocumentoCodice")
    @WebMethod(operationName = "Dm_Profile_Search_Get_New_Instance_By_TipiDocumentoCodice", action = "http://www.Abletech.it/Arxivar/Dm_Profile_Search_Get_New_Instance_By_TipiDocumentoCodice")
    @ResponseWrapper(localName = "Dm_Profile_Search_Get_New_Instance_By_TipiDocumentoCodiceResponse", targetNamespace = "http://www.Abletech.it/Arxivar", className = "it.abletech.arxivar.search.DmProfileSearchGetNewInstanceByTipiDocumentoCodiceResponse")
    public it.abletech.arxivar.search.DmProfileSearch dmProfileSearchGetNewInstanceByTipiDocumentoCodice(
        @WebParam(name = "sessionId", targetNamespace = "http://www.Abletech.it/Arxivar")
        java.lang.String sessionId,
        @WebParam(name = "DmTipiDocumentoCodice", targetNamespace = "http://www.Abletech.it/Arxivar")
        java.lang.String dmTipiDocumentoCodice
    );

    @WebResult(name = "Dm_NoteWork_GetDataResult", targetNamespace = "http://www.Abletech.it/Arxivar")
    @RequestWrapper(localName = "Dm_NoteWork_GetData", targetNamespace = "http://www.Abletech.it/Arxivar", className = "it.abletech.arxivar.search.DmNoteWorkGetData")
    @WebMethod(operationName = "Dm_NoteWork_GetData", action = "http://www.Abletech.it/Arxivar/Dm_NoteWork_GetData")
    @ResponseWrapper(localName = "Dm_NoteWork_GetDataResponse", targetNamespace = "http://www.Abletech.it/Arxivar", className = "it.abletech.arxivar.search.DmNoteWorkGetDataResponse")
    public java.lang.String dmNoteWorkGetData(
        @WebParam(name = "sessionId", targetNamespace = "http://www.Abletech.it/Arxivar")
        java.lang.String sessionId,
        @WebParam(name = "select", targetNamespace = "http://www.Abletech.it/Arxivar")
        it.abletech.arxivar.search.DmNoteWorkSelect select,
        @WebParam(name = "search", targetNamespace = "http://www.Abletech.it/Arxivar")
        it.abletech.arxivar.search.DmNoteWorkSearch search
    );

    @WebResult(name = "Dm_TaskWork_Search_GetNewInstanceResult", targetNamespace = "http://www.Abletech.it/Arxivar")
    @RequestWrapper(localName = "Dm_TaskWork_Search_GetNewInstance", targetNamespace = "http://www.Abletech.it/Arxivar", className = "it.abletech.arxivar.search.DmTaskWorkSearchGetNewInstance")
    @WebMethod(operationName = "Dm_TaskWork_Search_GetNewInstance", action = "http://www.Abletech.it/Arxivar/Dm_TaskWork_Search_GetNewInstance")
    @ResponseWrapper(localName = "Dm_TaskWork_Search_GetNewInstanceResponse", targetNamespace = "http://www.Abletech.it/Arxivar", className = "it.abletech.arxivar.search.DmTaskWorkSearchGetNewInstanceResponse")
    public it.abletech.arxivar.search.DmTaskWorkSearch dmTaskWorkSearchGetNewInstance(
        @WebParam(name = "sessionId", targetNamespace = "http://www.Abletech.it/Arxivar")
        java.lang.String sessionId
    );

    @WebResult(name = "Dm_Contatti_Search_Get_New_InstanceResult", targetNamespace = "http://www.Abletech.it/Arxivar")
    @RequestWrapper(localName = "Dm_Contatti_Search_Get_New_Instance", targetNamespace = "http://www.Abletech.it/Arxivar", className = "it.abletech.arxivar.search.DmContattiSearchGetNewInstance")
    @WebMethod(operationName = "Dm_Contatti_Search_Get_New_Instance", action = "http://www.Abletech.it/Arxivar/Dm_Contatti_Search_Get_New_Instance")
    @ResponseWrapper(localName = "Dm_Contatti_Search_Get_New_InstanceResponse", targetNamespace = "http://www.Abletech.it/Arxivar", className = "it.abletech.arxivar.search.DmContattiSearchGetNewInstanceResponse")
    public it.abletech.arxivar.search.DmContattiSearch dmContattiSearchGetNewInstance(
        @WebParam(name = "sessionId", targetNamespace = "http://www.Abletech.it/Arxivar")
        java.lang.String sessionId
    );

    @WebResult(name = "Dm_AllegatiWork_Select_Get_New_InstanceResult", targetNamespace = "http://www.Abletech.it/Arxivar")
    @RequestWrapper(localName = "Dm_AllegatiWork_Select_Get_New_Instance", targetNamespace = "http://www.Abletech.it/Arxivar", className = "it.abletech.arxivar.search.DmAllegatiWorkSelectGetNewInstance")
    @WebMethod(operationName = "Dm_AllegatiWork_Select_Get_New_Instance", action = "http://www.Abletech.it/Arxivar/Dm_AllegatiWork_Select_Get_New_Instance")
    @ResponseWrapper(localName = "Dm_AllegatiWork_Select_Get_New_InstanceResponse", targetNamespace = "http://www.Abletech.it/Arxivar", className = "it.abletech.arxivar.search.DmAllegatiWorkSelectGetNewInstanceResponse")
    public it.abletech.arxivar.search.DmAllegatiWorkSelect dmAllegatiWorkSelectGetNewInstance(
        @WebParam(name = "sessionId", targetNamespace = "http://www.Abletech.it/Arxivar")
        java.lang.String sessionId
    );

    @WebResult(name = "Dm_Fascicoli_Search_Get_New_InstanceResult", targetNamespace = "http://www.Abletech.it/Arxivar")
    @RequestWrapper(localName = "Dm_Fascicoli_Search_Get_New_Instance", targetNamespace = "http://www.Abletech.it/Arxivar", className = "it.abletech.arxivar.search.DmFascicoliSearchGetNewInstance")
    @WebMethod(operationName = "Dm_Fascicoli_Search_Get_New_Instance", action = "http://www.Abletech.it/Arxivar/Dm_Fascicoli_Search_Get_New_Instance")
    @ResponseWrapper(localName = "Dm_Fascicoli_Search_Get_New_InstanceResponse", targetNamespace = "http://www.Abletech.it/Arxivar", className = "it.abletech.arxivar.search.DmFascicoliSearchGetNewInstanceResponse")
    public it.abletech.arxivar.search.DmFascicoliSearch dmFascicoliSearchGetNewInstance(
        @WebParam(name = "sessionId", targetNamespace = "http://www.Abletech.it/Arxivar")
        java.lang.String sessionId
    );

    @WebResult(name = "Dm_Contatti_GetDataResult", targetNamespace = "http://www.Abletech.it/Arxivar")
    @RequestWrapper(localName = "Dm_Contatti_GetData", targetNamespace = "http://www.Abletech.it/Arxivar", className = "it.abletech.arxivar.search.DmContattiGetData")
    @WebMethod(operationName = "Dm_Contatti_GetData", action = "http://www.Abletech.it/Arxivar/Dm_Contatti_GetData")
    @ResponseWrapper(localName = "Dm_Contatti_GetDataResponse", targetNamespace = "http://www.Abletech.it/Arxivar", className = "it.abletech.arxivar.search.DmContattiGetDataResponse")
    public java.lang.String dmContattiGetData(
        @WebParam(name = "sessionId", targetNamespace = "http://www.Abletech.it/Arxivar")
        java.lang.String sessionId,
        @WebParam(name = "select", targetNamespace = "http://www.Abletech.it/Arxivar")
        it.abletech.arxivar.search.DmContattiSelect select,
        @WebParam(name = "search", targetNamespace = "http://www.Abletech.it/Arxivar")
        it.abletech.arxivar.search.DmContattiSearch search
    );

    @WebResult(name = "Dm_Profile_Search_Get_New_Instance_By_TipiDocumentoSystemIdResult", targetNamespace = "http://www.Abletech.it/Arxivar")
    @RequestWrapper(localName = "Dm_Profile_Search_Get_New_Instance_By_TipiDocumentoSystemId", targetNamespace = "http://www.Abletech.it/Arxivar", className = "it.abletech.arxivar.search.DmProfileSearchGetNewInstanceByTipiDocumentoSystemId")
    @WebMethod(operationName = "Dm_Profile_Search_Get_New_Instance_By_TipiDocumentoSystemId", action = "http://www.Abletech.it/Arxivar/Dm_Profile_Search_Get_New_Instance_By_TipiDocumentoSystemId")
    @ResponseWrapper(localName = "Dm_Profile_Search_Get_New_Instance_By_TipiDocumentoSystemIdResponse", targetNamespace = "http://www.Abletech.it/Arxivar", className = "it.abletech.arxivar.search.DmProfileSearchGetNewInstanceByTipiDocumentoSystemIdResponse")
    public it.abletech.arxivar.search.DmProfileSearch dmProfileSearchGetNewInstanceByTipiDocumentoSystemId(
        @WebParam(name = "sessionId", targetNamespace = "http://www.Abletech.it/Arxivar")
        java.lang.String sessionId,
        @WebParam(name = "dmTipiDocumentoSystemId", targetNamespace = "http://www.Abletech.it/Arxivar")
        int dmTipiDocumentoSystemId
    );

    @WebResult(name = "Dm_NoteWork_Select_Get_New_InstanceResult", targetNamespace = "http://www.Abletech.it/Arxivar")
    @RequestWrapper(localName = "Dm_NoteWork_Select_Get_New_Instance", targetNamespace = "http://www.Abletech.it/Arxivar", className = "it.abletech.arxivar.search.DmNoteWorkSelectGetNewInstance")
    @WebMethod(operationName = "Dm_NoteWork_Select_Get_New_Instance", action = "http://www.Abletech.it/Arxivar/Dm_NoteWork_Select_Get_New_Instance")
    @ResponseWrapper(localName = "Dm_NoteWork_Select_Get_New_InstanceResponse", targetNamespace = "http://www.Abletech.it/Arxivar", className = "it.abletech.arxivar.search.DmNoteWorkSelectGetNewInstanceResponse")
    public it.abletech.arxivar.search.DmNoteWorkSelect dmNoteWorkSelectGetNewInstance(
        @WebParam(name = "sessionId", targetNamespace = "http://www.Abletech.it/Arxivar")
        java.lang.String sessionId
    );

    @WebResult(name = "Dm_Profile_Search_Get_New_Instance_From_ElencoRicerche_CampiDefResult", targetNamespace = "http://www.Abletech.it/Arxivar")
    @RequestWrapper(localName = "Dm_Profile_Search_Get_New_Instance_From_ElencoRicerche_CampiDef", targetNamespace = "http://www.Abletech.it/Arxivar", className = "it.abletech.arxivar.search.DmProfileSearchGetNewInstanceFromElencoRicercheCampiDef")
    @WebMethod(operationName = "Dm_Profile_Search_Get_New_Instance_From_ElencoRicerche_CampiDef", action = "http://www.Abletech.it/Arxivar/Dm_Profile_Search_Get_New_Instance_From_ElencoRicerche_CampiDef")
    @ResponseWrapper(localName = "Dm_Profile_Search_Get_New_Instance_From_ElencoRicerche_CampiDefResponse", targetNamespace = "http://www.Abletech.it/Arxivar", className = "it.abletech.arxivar.search.DmProfileSearchGetNewInstanceFromElencoRicercheCampiDefResponse")
    public it.abletech.arxivar.search.DmProfileSearch dmProfileSearchGetNewInstanceFromElencoRicercheCampiDef(
        @WebParam(name = "sessionId", targetNamespace = "http://www.Abletech.it/Arxivar")
        java.lang.String sessionId,
        @WebParam(name = "idRicerca", targetNamespace = "http://www.Abletech.it/Arxivar")
        java.lang.String idRicerca
    );

    @WebResult(name = "Dm_Profile_Select_Get_New_Instance_By_TipiDocumentoSystemIdResult", targetNamespace = "http://www.Abletech.it/Arxivar")
    @RequestWrapper(localName = "Dm_Profile_Select_Get_New_Instance_By_TipiDocumentoSystemId", targetNamespace = "http://www.Abletech.it/Arxivar", className = "it.abletech.arxivar.search.DmProfileSelectGetNewInstanceByTipiDocumentoSystemId")
    @WebMethod(operationName = "Dm_Profile_Select_Get_New_Instance_By_TipiDocumentoSystemId", action = "http://www.Abletech.it/Arxivar/Dm_Profile_Select_Get_New_Instance_By_TipiDocumentoSystemId")
    @ResponseWrapper(localName = "Dm_Profile_Select_Get_New_Instance_By_TipiDocumentoSystemIdResponse", targetNamespace = "http://www.Abletech.it/Arxivar", className = "it.abletech.arxivar.search.DmProfileSelectGetNewInstanceByTipiDocumentoSystemIdResponse")
    public it.abletech.arxivar.search.DmProfileSelect dmProfileSelectGetNewInstanceByTipiDocumentoSystemId(
        @WebParam(name = "sessionId", targetNamespace = "http://www.Abletech.it/Arxivar")
        java.lang.String sessionId,
        @WebParam(name = "dmTipiDocumentoSystemId", targetNamespace = "http://www.Abletech.it/Arxivar")
        int dmTipiDocumentoSystemId
    );

    @WebResult(name = "Dm_TaskWork_Select_GetNewInstanceResult", targetNamespace = "http://www.Abletech.it/Arxivar")
    @RequestWrapper(localName = "Dm_TaskWork_Select_GetNewInstance", targetNamespace = "http://www.Abletech.it/Arxivar", className = "it.abletech.arxivar.search.DmTaskWorkSelectGetNewInstance")
    @WebMethod(operationName = "Dm_TaskWork_Select_GetNewInstance", action = "http://www.Abletech.it/Arxivar/Dm_TaskWork_Select_GetNewInstance")
    @ResponseWrapper(localName = "Dm_TaskWork_Select_GetNewInstanceResponse", targetNamespace = "http://www.Abletech.it/Arxivar", className = "it.abletech.arxivar.search.DmTaskWorkSelectGetNewInstanceResponse")
    public it.abletech.arxivar.search.DmTaskWorkSelect dmTaskWorkSelectGetNewInstance(
        @WebParam(name = "sessionId", targetNamespace = "http://www.Abletech.it/Arxivar")
        java.lang.String sessionId
    );

    @WebResult(name = "Dm_Profile_Select_Get_New_InstanceResult", targetNamespace = "http://www.Abletech.it/Arxivar")
    @RequestWrapper(localName = "Dm_Profile_Select_Get_New_Instance", targetNamespace = "http://www.Abletech.it/Arxivar", className = "it.abletech.arxivar.search.DmProfileSelectGetNewInstance")
    @WebMethod(operationName = "Dm_Profile_Select_Get_New_Instance", action = "http://www.Abletech.it/Arxivar/Dm_Profile_Select_Get_New_Instance")
    @ResponseWrapper(localName = "Dm_Profile_Select_Get_New_InstanceResponse", targetNamespace = "http://www.Abletech.it/Arxivar", className = "it.abletech.arxivar.search.DmProfileSelectGetNewInstanceResponse")
    public it.abletech.arxivar.search.DmProfileSelect dmProfileSelectGetNewInstance(
        @WebParam(name = "sessionId", targetNamespace = "http://www.Abletech.it/Arxivar")
        java.lang.String sessionId
    );

    @WebResult(name = "Dm_AllegatiWork_Search_Get_New_InstanceResult", targetNamespace = "http://www.Abletech.it/Arxivar")
    @RequestWrapper(localName = "Dm_AllegatiWork_Search_Get_New_Instance", targetNamespace = "http://www.Abletech.it/Arxivar", className = "it.abletech.arxivar.search.DmAllegatiWorkSearchGetNewInstance")
    @WebMethod(operationName = "Dm_AllegatiWork_Search_Get_New_Instance", action = "http://www.Abletech.it/Arxivar/Dm_AllegatiWork_Search_Get_New_Instance")
    @ResponseWrapper(localName = "Dm_AllegatiWork_Search_Get_New_InstanceResponse", targetNamespace = "http://www.Abletech.it/Arxivar", className = "it.abletech.arxivar.search.DmAllegatiWorkSearchGetNewInstanceResponse")
    public it.abletech.arxivar.search.DmAllegatiWorkSearch dmAllegatiWorkSearchGetNewInstance(
        @WebParam(name = "sessionId", targetNamespace = "http://www.Abletech.it/Arxivar")
        java.lang.String sessionId
    );

    @WebResult(name = "Dm_Profile_Select_Get_New_Instance_By_ElencoRicerche_IdResult", targetNamespace = "http://www.Abletech.it/Arxivar")
    @RequestWrapper(localName = "Dm_Profile_Select_Get_New_Instance_By_ElencoRicerche_Id", targetNamespace = "http://www.Abletech.it/Arxivar", className = "it.abletech.arxivar.search.DmProfileSelectGetNewInstanceByElencoRicercheId")
    @WebMethod(operationName = "Dm_Profile_Select_Get_New_Instance_By_ElencoRicerche_Id", action = "http://www.Abletech.it/Arxivar/Dm_Profile_Select_Get_New_Instance_By_ElencoRicerche_Id")
    @ResponseWrapper(localName = "Dm_Profile_Select_Get_New_Instance_By_ElencoRicerche_IdResponse", targetNamespace = "http://www.Abletech.it/Arxivar", className = "it.abletech.arxivar.search.DmProfileSelectGetNewInstanceByElencoRicercheIdResponse")
    public it.abletech.arxivar.search.DmProfileSelect dmProfileSelectGetNewInstanceByElencoRicercheId(
        @WebParam(name = "sessionId", targetNamespace = "http://www.Abletech.it/Arxivar")
        java.lang.String sessionId,
        @WebParam(name = "dmElencoRicercheId", targetNamespace = "http://www.Abletech.it/Arxivar")
        java.lang.String dmElencoRicercheId
    );

    @WebResult(name = "Dm_Profile_GetData_ByCheckOutResult", targetNamespace = "http://www.Abletech.it/Arxivar")
    @RequestWrapper(localName = "Dm_Profile_GetData_ByCheckOut", targetNamespace = "http://www.Abletech.it/Arxivar", className = "it.abletech.arxivar.search.DmProfileGetDataByCheckOut")
    @WebMethod(operationName = "Dm_Profile_GetData_ByCheckOut", action = "http://www.Abletech.it/Arxivar/Dm_Profile_GetData_ByCheckOut")
    @ResponseWrapper(localName = "Dm_Profile_GetData_ByCheckOutResponse", targetNamespace = "http://www.Abletech.it/Arxivar", className = "it.abletech.arxivar.search.DmProfileGetDataByCheckOutResponse")
    public java.lang.String dmProfileGetDataByCheckOut(
        @WebParam(name = "sessionId", targetNamespace = "http://www.Abletech.it/Arxivar")
        java.lang.String sessionId,
        @WebParam(name = "select", targetNamespace = "http://www.Abletech.it/Arxivar")
        it.abletech.arxivar.search.DmProfileSelect select,
        @WebParam(name = "stationId", targetNamespace = "http://www.Abletech.it/Arxivar")
        java.lang.String stationId
    );

    @WebResult(name = "Dm_Profile_Search_Get_New_InstanceResult", targetNamespace = "http://www.Abletech.it/Arxivar")
    @RequestWrapper(localName = "Dm_Profile_Search_Get_New_Instance", targetNamespace = "http://www.Abletech.it/Arxivar", className = "it.abletech.arxivar.search.DmProfileSearchGetNewInstance")
    @WebMethod(operationName = "Dm_Profile_Search_Get_New_Instance", action = "http://www.Abletech.it/Arxivar/Dm_Profile_Search_Get_New_Instance")
    @ResponseWrapper(localName = "Dm_Profile_Search_Get_New_InstanceResponse", targetNamespace = "http://www.Abletech.it/Arxivar", className = "it.abletech.arxivar.search.DmProfileSearchGetNewInstanceResponse")
    public it.abletech.arxivar.search.DmProfileSearch dmProfileSearchGetNewInstance(
        @WebParam(name = "sessionId", targetNamespace = "http://www.Abletech.it/Arxivar")
        java.lang.String sessionId,
        @WebParam(name = "dmElencoRicercheId", targetNamespace = "http://www.Abletech.it/Arxivar")
        java.lang.String dmElencoRicercheId
    );

    @WebResult(name = "Dm_NoteWork_Search_Get_New_InstanceResult", targetNamespace = "http://www.Abletech.it/Arxivar")
    @RequestWrapper(localName = "Dm_NoteWork_Search_Get_New_Instance", targetNamespace = "http://www.Abletech.it/Arxivar", className = "it.abletech.arxivar.search.DmNoteWorkSearchGetNewInstance")
    @WebMethod(operationName = "Dm_NoteWork_Search_Get_New_Instance", action = "http://www.Abletech.it/Arxivar/Dm_NoteWork_Search_Get_New_Instance")
    @ResponseWrapper(localName = "Dm_NoteWork_Search_Get_New_InstanceResponse", targetNamespace = "http://www.Abletech.it/Arxivar", className = "it.abletech.arxivar.search.DmNoteWorkSearchGetNewInstanceResponse")
    public it.abletech.arxivar.search.DmNoteWorkSearch dmNoteWorkSearchGetNewInstance(
        @WebParam(name = "sessionId", targetNamespace = "http://www.Abletech.it/Arxivar")
        java.lang.String sessionId
    );

    @WebResult(name = "Dm_TaskWork_GetDataResult", targetNamespace = "http://www.Abletech.it/Arxivar")
    @RequestWrapper(localName = "Dm_TaskWork_GetData", targetNamespace = "http://www.Abletech.it/Arxivar", className = "it.abletech.arxivar.search.DmTaskWorkGetData")
    @WebMethod(operationName = "Dm_TaskWork_GetData", action = "http://www.Abletech.it/Arxivar/Dm_TaskWork_GetData")
    @ResponseWrapper(localName = "Dm_TaskWork_GetDataResponse", targetNamespace = "http://www.Abletech.it/Arxivar", className = "it.abletech.arxivar.search.DmTaskWorkGetDataResponse")
    public java.lang.String dmTaskWorkGetData(
        @WebParam(name = "sessionId", targetNamespace = "http://www.Abletech.it/Arxivar")
        java.lang.String sessionId,
        @WebParam(name = "select", targetNamespace = "http://www.Abletech.it/Arxivar")
        it.abletech.arxivar.search.DmTaskWorkSelect select,
        @WebParam(name = "search", targetNamespace = "http://www.Abletech.it/Arxivar")
        it.abletech.arxivar.search.DmTaskWorkSearch search
    );

    @WebResult(name = "Dm_Profile_GetData_For_Viste_And_SelectResult", targetNamespace = "http://www.Abletech.it/Arxivar")
    @RequestWrapper(localName = "Dm_Profile_GetData_For_Viste_And_Select", targetNamespace = "http://www.Abletech.it/Arxivar", className = "it.abletech.arxivar.search.DmProfileGetDataForVisteAndSelect")
    @WebMethod(operationName = "Dm_Profile_GetData_For_Viste_And_Select", action = "http://www.Abletech.it/Arxivar/Dm_Profile_GetData_For_Viste_And_Select")
    @ResponseWrapper(localName = "Dm_Profile_GetData_For_Viste_And_SelectResponse", targetNamespace = "http://www.Abletech.it/Arxivar", className = "it.abletech.arxivar.search.DmProfileGetDataForVisteAndSelectResponse")
    public java.lang.String dmProfileGetDataForVisteAndSelect(
        @WebParam(name = "sessionId", targetNamespace = "http://www.Abletech.it/Arxivar")
        java.lang.String sessionId,
        @WebParam(name = "select", targetNamespace = "http://www.Abletech.it/Arxivar")
        it.abletech.arxivar.search.DmProfileSelect select,
        @WebParam(name = "search", targetNamespace = "http://www.Abletech.it/Arxivar")
        it.abletech.arxivar.search.DmProfileSearch search,
        @WebParam(name = "idView", targetNamespace = "http://www.Abletech.it/Arxivar")
        java.lang.String idView
    );

    @WebResult(name = "Dm_Profile_GetDataResult", targetNamespace = "http://www.Abletech.it/Arxivar")
    @RequestWrapper(localName = "Dm_Profile_GetData", targetNamespace = "http://www.Abletech.it/Arxivar", className = "it.abletech.arxivar.search.DmProfileGetData")
    @WebMethod(operationName = "Dm_Profile_GetData", action = "http://www.Abletech.it/Arxivar/Dm_Profile_GetData")
    @ResponseWrapper(localName = "Dm_Profile_GetDataResponse", targetNamespace = "http://www.Abletech.it/Arxivar", className = "it.abletech.arxivar.search.DmProfileGetDataResponse")
    public java.lang.String dmProfileGetData(
        @WebParam(name = "sessionId", targetNamespace = "http://www.Abletech.it/Arxivar")
        java.lang.String sessionId,
        @WebParam(name = "select", targetNamespace = "http://www.Abletech.it/Arxivar")
        it.abletech.arxivar.search.DmProfileSelect select,
        @WebParam(name = "search", targetNamespace = "http://www.Abletech.it/Arxivar")
        it.abletech.arxivar.search.DmProfileSearch search
    );

    @WebResult(name = "Dm_Contatti_Select_Get_New_InstanceResult", targetNamespace = "http://www.Abletech.it/Arxivar")
    @RequestWrapper(localName = "Dm_Contatti_Select_Get_New_Instance", targetNamespace = "http://www.Abletech.it/Arxivar", className = "it.abletech.arxivar.search.DmContattiSelectGetNewInstance")
    @WebMethod(operationName = "Dm_Contatti_Select_Get_New_Instance", action = "http://www.Abletech.it/Arxivar/Dm_Contatti_Select_Get_New_Instance")
    @ResponseWrapper(localName = "Dm_Contatti_Select_Get_New_InstanceResponse", targetNamespace = "http://www.Abletech.it/Arxivar", className = "it.abletech.arxivar.search.DmContattiSelectGetNewInstanceResponse")
    public it.abletech.arxivar.search.DmContattiSelect dmContattiSelectGetNewInstance(
        @WebParam(name = "sessionId", targetNamespace = "http://www.Abletech.it/Arxivar")
        java.lang.String sessionId
    );

    @WebResult(name = "Dm_Fascicoli_Select_Get_New_InstanceResult", targetNamespace = "http://www.Abletech.it/Arxivar")
    @RequestWrapper(localName = "Dm_Fascicoli_Select_Get_New_Instance", targetNamespace = "http://www.Abletech.it/Arxivar", className = "it.abletech.arxivar.search.DmFascicoliSelectGetNewInstance")
    @WebMethod(operationName = "Dm_Fascicoli_Select_Get_New_Instance", action = "http://www.Abletech.it/Arxivar/Dm_Fascicoli_Select_Get_New_Instance")
    @ResponseWrapper(localName = "Dm_Fascicoli_Select_Get_New_InstanceResponse", targetNamespace = "http://www.Abletech.it/Arxivar", className = "it.abletech.arxivar.search.DmFascicoliSelectGetNewInstanceResponse")
    public it.abletech.arxivar.search.DmFascicoliSelect dmFascicoliSelectGetNewInstance(
        @WebParam(name = "sessionId", targetNamespace = "http://www.Abletech.it/Arxivar")
        java.lang.String sessionId
    );

    @WebResult(name = "Dm_AllegatiWork_GetDataResult", targetNamespace = "http://www.Abletech.it/Arxivar")
    @RequestWrapper(localName = "Dm_AllegatiWork_GetData", targetNamespace = "http://www.Abletech.it/Arxivar", className = "it.abletech.arxivar.search.DmAllegatiWorkGetData")
    @WebMethod(operationName = "Dm_AllegatiWork_GetData", action = "http://www.Abletech.it/Arxivar/Dm_AllegatiWork_GetData")
    @ResponseWrapper(localName = "Dm_AllegatiWork_GetDataResponse", targetNamespace = "http://www.Abletech.it/Arxivar", className = "it.abletech.arxivar.search.DmAllegatiWorkGetDataResponse")
    public java.lang.String dmAllegatiWorkGetData(
        @WebParam(name = "sessionId", targetNamespace = "http://www.Abletech.it/Arxivar")
        java.lang.String sessionId,
        @WebParam(name = "select", targetNamespace = "http://www.Abletech.it/Arxivar")
        it.abletech.arxivar.search.DmAllegatiWorkSelect select,
        @WebParam(name = "search", targetNamespace = "http://www.Abletech.it/Arxivar")
        it.abletech.arxivar.search.DmAllegatiWorkSearch search
    );

    @WebResult(name = "Dm_TaskWork_GetData_ActiveResult", targetNamespace = "http://www.Abletech.it/Arxivar")
    @RequestWrapper(localName = "Dm_TaskWork_GetData_Active", targetNamespace = "http://www.Abletech.it/Arxivar", className = "it.abletech.arxivar.search.DmTaskWorkGetDataActive")
    @WebMethod(operationName = "Dm_TaskWork_GetData_Active", action = "http://www.Abletech.it/Arxivar/Dm_TaskWork_GetData_Active")
    @ResponseWrapper(localName = "Dm_TaskWork_GetData_ActiveResponse", targetNamespace = "http://www.Abletech.it/Arxivar", className = "it.abletech.arxivar.search.DmTaskWorkGetDataActiveResponse")
    public java.lang.String dmTaskWorkGetDataActive(
        @WebParam(name = "sessionId", targetNamespace = "http://www.Abletech.it/Arxivar")
        java.lang.String sessionId,
        @WebParam(name = "select", targetNamespace = "http://www.Abletech.it/Arxivar")
        it.abletech.arxivar.search.DmTaskWorkSelect select
    );
}
