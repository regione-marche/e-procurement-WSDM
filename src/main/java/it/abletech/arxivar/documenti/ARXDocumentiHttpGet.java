package it.abletech.arxivar.documenti;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;

/**
 * This class was generated by Apache CXF 2.7.10
 * 2015-01-29T17:05:58.683+01:00
 * Generated source version: 2.7.10
 * 
 */
@WebService(targetNamespace = "http://www.Abletech.it/Arxivar", name = "ARX_DocumentiHttpGet")
@XmlSeeAlso({ObjectFactory.class, it.abletech.arxivar.abstracttypes.ObjectFactory.class})
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
public interface ARXDocumentiHttpGet {

    @WebResult(name = "Arx_File", targetNamespace = "http://www.Abletech.it/Arxivar", partName = "Body")
    @WebMethod(operationName = "Dm_ProcessDoc_GetDocument")
    public ArxFile dmProcessDocGetDocument(
        @WebParam(partName = "sessionId", name = "sessionId", targetNamespace = "http://www.Abletech.it/Arxivar")
        java.lang.String sessionId,
        @WebParam(partName = "processDocId", name = "processDocId", targetNamespace = "http://www.Abletech.it/Arxivar")
        java.lang.String processDocId,
        @WebParam(partName = "taskWorkId", name = "taskWorkId", targetNamespace = "http://www.Abletech.it/Arxivar")
        java.lang.String taskWorkId
    );

    @WebResult(name = "Arx_File", targetNamespace = "http://www.Abletech.it/Arxivar", partName = "Body")
    @WebMethod(operationName = "Dm_AllegatiDoc_GetDocument")
    public ArxFile dmAllegatiDocGetDocument(
        @WebParam(partName = "sessionId", name = "sessionId", targetNamespace = "http://www.Abletech.it/Arxivar")
        java.lang.String sessionId,
        @WebParam(partName = "dmAllegatiDocId", name = "dmAllegatiDocId", targetNamespace = "http://www.Abletech.it/Arxivar")
        java.lang.String dmAllegatiDocId
    );

    @WebResult(name = "boolean", targetNamespace = "http://www.Abletech.it/Arxivar", partName = "Body")
    @WebMethod(operationName = "Arx_FileChunkTiket_Detail_Upload")
    public boolean arxFileChunkTiketDetailUpload(
        @WebParam(partName = "sessionId", name = "sessionId", targetNamespace = "http://www.Abletech.it/Arxivar")
        java.lang.String sessionId,
        @WebParam(partName = "Arx_FileChunkTiketId", name = "Arx_FileChunkTiketId", targetNamespace = "http://www.Abletech.it/Arxivar")
        java.lang.String arxFileChunkTiketId,
        @WebParam(partName = "chunkIndex", name = "chunkIndex", targetNamespace = "http://www.Abletech.it/Arxivar")
        java.lang.String chunkIndex,
        @WebParam(partName = "chunkContent", name = "chunkContent", targetNamespace = "http://www.Abletech.it/Arxivar")
        it.abletech.arxivar.abstracttypes.StringArray chunkContent,
        @WebParam(partName = "isComplete", name = "isComplete", targetNamespace = "http://www.Abletech.it/Arxivar")
        java.lang.String isComplete
    );

    @WebResult(name = "ArrayOfArx_File_Indexed", targetNamespace = "http://www.Abletech.it/Arxivar", partName = "Body")
    @WebMethod(operationName = "Dm_Profile_GetPreview_By_DocNumber")
    public ArrayOfArxFileIndexed dmProfileGetPreviewByDocNumber(
        @WebParam(partName = "sessionId", name = "sessionId", targetNamespace = "http://www.Abletech.it/Arxivar")
        java.lang.String sessionId,
        @WebParam(partName = "docnumber", name = "docnumber", targetNamespace = "http://www.Abletech.it/Arxivar")
        java.lang.String docnumber,
        @WebParam(partName = "getDocumentIfPreviewNotExist", name = "getDocumentIfPreviewNotExist", targetNamespace = "http://www.Abletech.it/Arxivar")
        java.lang.String getDocumentIfPreviewNotExist
    );

    @WebResult(name = "ArrayOfArx_File", targetNamespace = "http://www.Abletech.it/Arxivar", partName = "Body")
    @WebMethod(operationName = "Dm_Profile_GetDocuments_By_IdErp")
    public ArrayOfArxFile dmProfileGetDocumentsByIdErp(
        @WebParam(partName = "sessionId", name = "sessionId", targetNamespace = "http://www.Abletech.it/Arxivar")
        java.lang.String sessionId,
        @WebParam(partName = "idErp", name = "idErp", targetNamespace = "http://www.Abletech.it/Arxivar")
        java.lang.String idErp
    );

    @WebResult(name = "Arx_File", targetNamespace = "http://www.Abletech.it/Arxivar", partName = "Body")
    @WebMethod(operationName = "Dm_Profile_GetDocument")
    public ArxFile dmProfileGetDocument(
        @WebParam(partName = "sessionId", name = "sessionId", targetNamespace = "http://www.Abletech.it/Arxivar")
        java.lang.String sessionId,
        @WebParam(partName = "docNumber", name = "docNumber", targetNamespace = "http://www.Abletech.it/Arxivar")
        java.lang.String docNumber
    );

    @WebResult(name = "Arx_FileChunkTiket", targetNamespace = "http://www.Abletech.it/Arxivar", partName = "Body")
    @WebMethod(operationName = "Arx_FileChunkTiket_GetData_By_Id")
    public ArxFileChunkTiket arxFileChunkTiketGetDataById(
        @WebParam(partName = "sessionId", name = "sessionId", targetNamespace = "http://www.Abletech.it/Arxivar")
        java.lang.String sessionId,
        @WebParam(partName = "id", name = "id", targetNamespace = "http://www.Abletech.it/Arxivar")
        java.lang.String id
    );

    @WebResult(name = "Security_Exception", targetNamespace = "http://www.Abletech.it/Arxivar", partName = "Body")
    @WebMethod(operationName = "Dm_Profile_CheckOut")
    public SecurityException dmProfileCheckOut(
        @WebParam(partName = "sessionId", name = "sessionId", targetNamespace = "http://www.Abletech.it/Arxivar")
        java.lang.String sessionId,
        @WebParam(partName = "docNumber", name = "docNumber", targetNamespace = "http://www.Abletech.it/Arxivar")
        java.lang.String docNumber,
        @WebParam(partName = "stationId", name = "stationId", targetNamespace = "http://www.Abletech.it/Arxivar")
        java.lang.String stationId
    );

    @WebResult(name = "Arx_File", targetNamespace = "http://www.Abletech.it/Arxivar", partName = "Body")
    @WebMethod(operationName = "Dm_Profile_GetDocument_By_Revisione")
    public ArxFile dmProfileGetDocumentByRevisione(
        @WebParam(partName = "sessionId", name = "sessionId", targetNamespace = "http://www.Abletech.it/Arxivar")
        java.lang.String sessionId,
        @WebParam(partName = "docNumber", name = "docNumber", targetNamespace = "http://www.Abletech.it/Arxivar")
        java.lang.String docNumber,
        @WebParam(partName = "revisione", name = "revisione", targetNamespace = "http://www.Abletech.it/Arxivar")
        java.lang.String revisione,
        @WebParam(partName = "autoSwitchToDmRevisioni", name = "autoSwitchToDmRevisioni", targetNamespace = "http://www.Abletech.it/Arxivar")
        java.lang.String autoSwitchToDmRevisioni
    );

    @WebResult(name = "Arx_File", targetNamespace = "http://www.Abletech.it/Arxivar", partName = "Body")
    @WebMethod(operationName = "Dm_Profile_GetDocument_For_Edit")
    public ArxFile dmProfileGetDocumentForEdit(
        @WebParam(partName = "sessionId", name = "sessionId", targetNamespace = "http://www.Abletech.it/Arxivar")
        java.lang.String sessionId,
        @WebParam(partName = "docNumber", name = "docNumber", targetNamespace = "http://www.Abletech.it/Arxivar")
        java.lang.String docNumber,
        @WebParam(partName = "revisione", name = "revisione", targetNamespace = "http://www.Abletech.it/Arxivar")
        java.lang.String revisione,
        @WebParam(partName = "autoSwitchToDmRevisioni", name = "autoSwitchToDmRevisioni", targetNamespace = "http://www.Abletech.it/Arxivar")
        java.lang.String autoSwitchToDmRevisioni
    );

    @WebResult(name = "Arx_File", targetNamespace = "http://www.Abletech.it/Arxivar", partName = "Body")
    @WebMethod(operationName = "Dm_AllegatiWork_GetDocument")
    public ArxFile dmAllegatiWorkGetDocument(
        @WebParam(partName = "sessionId", name = "sessionId", targetNamespace = "http://www.Abletech.it/Arxivar")
        java.lang.String sessionId,
        @WebParam(partName = "dmAllegatiWorkId", name = "dmAllegatiWorkId", targetNamespace = "http://www.Abletech.it/Arxivar")
        java.lang.String dmAllegatiWorkId
    );

    @WebResult(name = "Security_Exception", targetNamespace = "http://www.Abletech.it/Arxivar", partName = "Body")
    @WebMethod(operationName = "Dm_Profile_Undo_CheckOut")
    public SecurityException dmProfileUndoCheckOut(
        @WebParam(partName = "sessionId", name = "sessionId", targetNamespace = "http://www.Abletech.it/Arxivar")
        java.lang.String sessionId,
        @WebParam(partName = "docNumber", name = "docNumber", targetNamespace = "http://www.Abletech.it/Arxivar")
        java.lang.String docNumber,
        @WebParam(partName = "stationId", name = "stationId", targetNamespace = "http://www.Abletech.it/Arxivar")
        java.lang.String stationId
    );

    @WebResult(name = "base64Binary", targetNamespace = "http://www.Abletech.it/Arxivar", partName = "Body")
    @WebMethod(operationName = "Arx_FileChunkTiket_Detail_GetData_By_ChunkIndex")
    public byte[] arxFileChunkTiketDetailGetDataByChunkIndex(
        @WebParam(partName = "sessionId", name = "sessionId", targetNamespace = "http://www.Abletech.it/Arxivar")
        java.lang.String sessionId,
        @WebParam(partName = "id", name = "id", targetNamespace = "http://www.Abletech.it/Arxivar")
        java.lang.String id,
        @WebParam(partName = "chunkIndex", name = "chunkIndex", targetNamespace = "http://www.Abletech.it/Arxivar")
        java.lang.String chunkIndex
    );

    @WebResult(name = "boolean", targetNamespace = "http://www.Abletech.it/Arxivar", partName = "Body")
    @WebMethod(operationName = "Arx_FileChunkTiket_DeleteAll_By_Id")
    public boolean arxFileChunkTiketDeleteAllById(
        @WebParam(partName = "sessionId", name = "sessionId", targetNamespace = "http://www.Abletech.it/Arxivar")
        java.lang.String sessionId,
        @WebParam(partName = "id", name = "id", targetNamespace = "http://www.Abletech.it/Arxivar")
        java.lang.String id
    );

    @WebResult(name = "Arx_File", targetNamespace = "http://www.Abletech.it/Arxivar", partName = "Body")
    @WebMethod(operationName = "Dm_Profile_GetDocument_Xml")
    public ArxFile dmProfileGetDocumentXml(
        @WebParam(partName = "sessionId", name = "sessionId", targetNamespace = "http://www.Abletech.it/Arxivar")
        java.lang.String sessionId,
        @WebParam(partName = "docnumber", name = "docnumber", targetNamespace = "http://www.Abletech.it/Arxivar")
        java.lang.String docnumber
    );

    @WebResult(name = "Arx_FileChunkTiket", targetNamespace = "http://www.Abletech.it/Arxivar", partName = "Body")
    @WebMethod(operationName = "Arx_FileChunkTiket_Request")
    public ArxFileChunkTiket arxFileChunkTiketRequest(
        @WebParam(partName = "sessionId", name = "sessionId", targetNamespace = "http://www.Abletech.it/Arxivar")
        java.lang.String sessionId,
        @WebParam(partName = "nomeFile", name = "nomeFile", targetNamespace = "http://www.Abletech.it/Arxivar")
        java.lang.String nomeFile,
        @WebParam(partName = "sha1", name = "sha1", targetNamespace = "http://www.Abletech.it/Arxivar")
        java.lang.String sha1,
        @WebParam(partName = "fileSize", name = "fileSize", targetNamespace = "http://www.Abletech.it/Arxivar")
        java.lang.String fileSize,
        @WebParam(partName = "isCompressed", name = "isCompressed", targetNamespace = "http://www.Abletech.it/Arxivar")
        java.lang.String isCompressed
    );

    @WebResult(name = "Arx_File", targetNamespace = "http://www.Abletech.it/Arxivar", partName = "Body")
    @WebMethod(operationName = "Dm_Profile_GetPreview_By_DocNumber_Page")
    public ArxFile dmProfileGetPreviewByDocNumberPage(
        @WebParam(partName = "sessionId", name = "sessionId", targetNamespace = "http://www.Abletech.it/Arxivar")
        java.lang.String sessionId,
        @WebParam(partName = "docnumber", name = "docnumber", targetNamespace = "http://www.Abletech.it/Arxivar")
        java.lang.String docnumber,
        @WebParam(partName = "pageIndex", name = "pageIndex", targetNamespace = "http://www.Abletech.it/Arxivar")
        java.lang.String pageIndex,
        @WebParam(partName = "getDocumentIfPreviewNotExist", name = "getDocumentIfPreviewNotExist", targetNamespace = "http://www.Abletech.it/Arxivar")
        java.lang.String getDocumentIfPreviewNotExist
    );
}
