package it.finmatica.dmserver.wscxf.service;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 2.7.10
 * 2019-02-21T09:20:55.368+01:00
 * Generated source version: 2.7.10
 * 
 */
@WebService(targetNamespace = "http://service.wscxf.dmServer.finmatica.it/", name = "AttachService")
@XmlSeeAlso({ObjectFactory.class})
public interface AttachService {

    @WebResult(name = "return", targetNamespace = "")
    @RequestWrapper(localName = "insertAttach", targetNamespace = "http://service.wscxf.dmServer.finmatica.it/", className = "it.finmatica.dmserver.wscxf.service.InsertAttach")
    @WebMethod(action = "InsertAttach")
    @ResponseWrapper(localName = "insertAttachResponse", targetNamespace = "http://service.wscxf.dmServer.finmatica.it/", className = "it.finmatica.dmserver.wscxf.service.InsertAttachResponse")
    public it.finmatica.dmserver.wscxf.service.InsertAttachResponse2 insertAttach(
        @WebParam(name = "idDocumento", targetNamespace = "")
        java.lang.String idDocumento,
        @WebParam(name = "file", targetNamespace = "")
        javax.activation.DataHandler file,
        @WebParam(name = "fileName", targetNamespace = "")
        java.lang.String fileName,
        @WebParam(name = "acls", targetNamespace = "")
        java.util.List<it.finmatica.dmserver.wscxf.service.Acl> acls,
        @WebParam(name = "utenteApplicativo", targetNamespace = "")
        java.lang.String utenteApplicativo
    );

    @WebResult(name = "return", targetNamespace = "")
    @RequestWrapper(localName = "updateAttach", targetNamespace = "http://service.wscxf.dmServer.finmatica.it/", className = "it.finmatica.dmserver.wscxf.service.UpdateAttach")
    @WebMethod(action = "UpdateAttach")
    @ResponseWrapper(localName = "updateAttachResponse", targetNamespace = "http://service.wscxf.dmServer.finmatica.it/", className = "it.finmatica.dmserver.wscxf.service.UpdateAttachResponse")
    public it.finmatica.dmserver.wscxf.service.BaseResponse updateAttach(
        @WebParam(name = "idDocumento", targetNamespace = "")
        java.lang.String idDocumento,
        @WebParam(name = "idObjFile", targetNamespace = "")
        java.lang.String idObjFile,
        @WebParam(name = "fileName", targetNamespace = "")
        java.lang.String fileName,
        @WebParam(name = "file", targetNamespace = "")
        javax.activation.DataHandler file,
        @WebParam(name = "newFileName", targetNamespace = "")
        java.lang.String newFileName,
        @WebParam(name = "acls", targetNamespace = "")
        java.util.List<it.finmatica.dmserver.wscxf.service.Acl> acls,
        @WebParam(name = "utenteApplicativo", targetNamespace = "")
        java.lang.String utenteApplicativo
    );

    @WebResult(name = "return", targetNamespace = "")
    @RequestWrapper(localName = "deleteAttach", targetNamespace = "http://service.wscxf.dmServer.finmatica.it/", className = "it.finmatica.dmserver.wscxf.service.DeleteAttach")
    @WebMethod(action = "DeleteAttach")
    @ResponseWrapper(localName = "deleteAttachResponse", targetNamespace = "http://service.wscxf.dmServer.finmatica.it/", className = "it.finmatica.dmserver.wscxf.service.DeleteAttachResponse")
    public it.finmatica.dmserver.wscxf.service.BaseResponse deleteAttach(
        @WebParam(name = "idDocumento", targetNamespace = "")
        java.lang.String idDocumento,
        @WebParam(name = "idObjFile", targetNamespace = "")
        java.lang.String idObjFile,
        @WebParam(name = "fileName", targetNamespace = "")
        java.lang.String fileName,
        @WebParam(name = "utenteApplicativo", targetNamespace = "")
        java.lang.String utenteApplicativo
    );

    @WebResult(name = "return", targetNamespace = "")
    @RequestWrapper(localName = "downloadAttach", targetNamespace = "http://service.wscxf.dmServer.finmatica.it/", className = "it.finmatica.dmserver.wscxf.service.DownloadAttach")
    @WebMethod(action = "DownloadAttach")
    @ResponseWrapper(localName = "downloadAttachResponse", targetNamespace = "http://service.wscxf.dmServer.finmatica.it/", className = "it.finmatica.dmserver.wscxf.service.DownloadAttachResponse")
    public it.finmatica.dmserver.wscxf.service.DownloadAttachResponse2 downloadAttach(
        @WebParam(name = "idDocumento", targetNamespace = "")
        java.lang.String idDocumento,
        @WebParam(name = "idObjFile", targetNamespace = "")
        java.lang.String idObjFile,
        @WebParam(name = "fileName", targetNamespace = "")
        java.lang.String fileName,
        @WebParam(name = "utenteApplicativo", targetNamespace = "")
        java.lang.String utenteApplicativo
    );
}