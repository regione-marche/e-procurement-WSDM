package it.jdoc;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 2.7.10
 * 2020-09-08T16:05:30.674+02:00
 * Generated source version: 2.7.10
 * 
 */
@WebService(targetNamespace = "http://tempuri.org/", name = "IWS_Operazioni")
@XmlSeeAlso({ObjectFactory.class})
public interface IWSOperazioni {

    @WebResult(name = "GetDocumentConditionByIdDocResult", targetNamespace = "http://tempuri.org/")
    @Action(input = "http://tempuri.org/IWS_Operazioni/GetDocumentConditionByIdDoc", output = "http://tempuri.org/IWS_Operazioni/GetDocumentConditionByIdDocResponse")
    @RequestWrapper(localName = "GetDocumentConditionByIdDoc", targetNamespace = "http://tempuri.org/", className = "it.jdoc.GetDocumentConditionByIdDoc")
    @WebMethod(operationName = "GetDocumentConditionByIdDoc", action = "http://tempuri.org/IWS_Operazioni/GetDocumentConditionByIdDoc")
    @ResponseWrapper(localName = "GetDocumentConditionByIdDocResponse", targetNamespace = "http://tempuri.org/", className = "it.jdoc.GetDocumentConditionByIdDocResponse")
    public it.jdoc.DocResultCondition getDocumentConditionByIdDoc(
        @WebParam(name = "param", targetNamespace = "http://tempuri.org/")
        it.jdoc.InputByIdDoc param
    );

    @WebResult(name = "GetDocumentByBarCodeResult", targetNamespace = "http://tempuri.org/")
    @Action(input = "http://tempuri.org/IWS_Operazioni/GetDocumentByBarCode", output = "http://tempuri.org/IWS_Operazioni/GetDocumentByBarCodeResponse")
    @RequestWrapper(localName = "GetDocumentByBarCode", targetNamespace = "http://tempuri.org/", className = "it.jdoc.GetDocumentByBarCode")
    @WebMethod(operationName = "GetDocumentByBarCode", action = "http://tempuri.org/IWS_Operazioni/GetDocumentByBarCode")
    @ResponseWrapper(localName = "GetDocumentByBarCodeResponse", targetNamespace = "http://tempuri.org/", className = "it.jdoc.GetDocumentByBarCodeResponse")
    public it.jdoc.DocumentResult getDocumentByBarCode(
        @WebParam(name = "param", targetNamespace = "http://tempuri.org/")
        it.jdoc.InputGetBarcode param
    );

    @WebResult(name = "GetDocumentConditionByKeysResult", targetNamespace = "http://tempuri.org/")
    @Action(input = "http://tempuri.org/IWS_Operazioni/GetDocumentConditionByKeys", output = "http://tempuri.org/IWS_Operazioni/GetDocumentConditionByKeysResponse")
    @RequestWrapper(localName = "GetDocumentConditionByKeys", targetNamespace = "http://tempuri.org/", className = "it.jdoc.GetDocumentConditionByKeys")
    @WebMethod(operationName = "GetDocumentConditionByKeys", action = "http://tempuri.org/IWS_Operazioni/GetDocumentConditionByKeys")
    @ResponseWrapper(localName = "GetDocumentConditionByKeysResponse", targetNamespace = "http://tempuri.org/", className = "it.jdoc.GetDocumentConditionByKeysResponse")
    public it.jdoc.DocResultCondition getDocumentConditionByKeys(
        @WebParam(name = "param", targetNamespace = "http://tempuri.org/")
        it.jdoc.InputByKeys param
    );

    @WebResult(name = "GetDocumentConditionByBarCodeResult", targetNamespace = "http://tempuri.org/")
    @Action(input = "http://tempuri.org/IWS_Operazioni/GetDocumentConditionByBarCode", output = "http://tempuri.org/IWS_Operazioni/GetDocumentConditionByBarCodeResponse")
    @RequestWrapper(localName = "GetDocumentConditionByBarCode", targetNamespace = "http://tempuri.org/", className = "it.jdoc.GetDocumentConditionByBarCode")
    @WebMethod(operationName = "GetDocumentConditionByBarCode", action = "http://tempuri.org/IWS_Operazioni/GetDocumentConditionByBarCode")
    @ResponseWrapper(localName = "GetDocumentConditionByBarCodeResponse", targetNamespace = "http://tempuri.org/", className = "it.jdoc.GetDocumentConditionByBarCodeResponse")
    public it.jdoc.DocResultCondition getDocumentConditionByBarCode(
        @WebParam(name = "param", targetNamespace = "http://tempuri.org/")
        it.jdoc.InputByBarcode param
    );

    @WebResult(name = "GetDocumentStatusByKeysResult", targetNamespace = "http://tempuri.org/")
    @Action(input = "http://tempuri.org/IWS_Operazioni/GetDocumentStatusByKeys", output = "http://tempuri.org/IWS_Operazioni/GetDocumentStatusByKeysResponse")
    @RequestWrapper(localName = "GetDocumentStatusByKeys", targetNamespace = "http://tempuri.org/", className = "it.jdoc.GetDocumentStatusByKeys")
    @WebMethod(operationName = "GetDocumentStatusByKeys", action = "http://tempuri.org/IWS_Operazioni/GetDocumentStatusByKeys")
    @ResponseWrapper(localName = "GetDocumentStatusByKeysResponse", targetNamespace = "http://tempuri.org/", className = "it.jdoc.GetDocumentStatusByKeysResponse")
    public it.jdoc.DocResultStatus getDocumentStatusByKeys(
        @WebParam(name = "param", targetNamespace = "http://tempuri.org/")
        it.jdoc.InputByKeys param
    );

    @WebResult(name = "DoUpdateResult", targetNamespace = "http://tempuri.org/")
    @Action(input = "http://tempuri.org/IWS_Operazioni/DoUpdate", output = "http://tempuri.org/IWS_Operazioni/DoUpdateResponse")
    @RequestWrapper(localName = "DoUpdate", targetNamespace = "http://tempuri.org/", className = "it.jdoc.DoUpdate")
    @WebMethod(operationName = "DoUpdate", action = "http://tempuri.org/IWS_Operazioni/DoUpdate")
    @ResponseWrapper(localName = "DoUpdateResponse", targetNamespace = "http://tempuri.org/", className = "it.jdoc.DoUpdateResponse")
    public it.jdoc.ArchiveResult doUpdate(
        @WebParam(name = "param", targetNamespace = "http://tempuri.org/")
        it.jdoc.InputUpdate param
    );

    @WebResult(name = "TestResult", targetNamespace = "http://tempuri.org/")
    @Action(input = "http://tempuri.org/IWS_Operazioni/Test", output = "http://tempuri.org/IWS_Operazioni/TestResponse")
    @RequestWrapper(localName = "Test", targetNamespace = "http://tempuri.org/", className = "it.jdoc.Test")
    @WebMethod(operationName = "Test", action = "http://tempuri.org/IWS_Operazioni/Test")
    @ResponseWrapper(localName = "TestResponse", targetNamespace = "http://tempuri.org/", className = "it.jdoc.TestResponse")
    public it.jdoc.TestResult test();

    @WebResult(name = "GetDocumentStatusByBarCodeResult", targetNamespace = "http://tempuri.org/")
    @Action(input = "http://tempuri.org/IWS_Operazioni/GetDocumentStatusByBarCode", output = "http://tempuri.org/IWS_Operazioni/GetDocumentStatusByBarCodeResponse")
    @RequestWrapper(localName = "GetDocumentStatusByBarCode", targetNamespace = "http://tempuri.org/", className = "it.jdoc.GetDocumentStatusByBarCode")
    @WebMethod(operationName = "GetDocumentStatusByBarCode", action = "http://tempuri.org/IWS_Operazioni/GetDocumentStatusByBarCode")
    @ResponseWrapper(localName = "GetDocumentStatusByBarCodeResponse", targetNamespace = "http://tempuri.org/", className = "it.jdoc.GetDocumentStatusByBarCodeResponse")
    public it.jdoc.DocResultStatus getDocumentStatusByBarCode(
        @WebParam(name = "param", targetNamespace = "http://tempuri.org/")
        it.jdoc.InputByBarcode param
    );

    @WebResult(name = "GetDocumentByIdDocResult", targetNamespace = "http://tempuri.org/")
    @Action(input = "http://tempuri.org/IWS_Operazioni/GetDocumentByIdDoc", output = "http://tempuri.org/IWS_Operazioni/GetDocumentByIdDocResponse")
    @RequestWrapper(localName = "GetDocumentByIdDoc", targetNamespace = "http://tempuri.org/", className = "it.jdoc.GetDocumentByIdDoc")
    @WebMethod(operationName = "GetDocumentByIdDoc", action = "http://tempuri.org/IWS_Operazioni/GetDocumentByIdDoc")
    @ResponseWrapper(localName = "GetDocumentByIdDocResponse", targetNamespace = "http://tempuri.org/", className = "it.jdoc.GetDocumentByIdDocResponse")
    public it.jdoc.DocumentResult getDocumentByIdDoc(
        @WebParam(name = "param", targetNamespace = "http://tempuri.org/")
        it.jdoc.InputGetIdDoc param
    );

    @WebResult(name = "GetDocumentByKeysResult", targetNamespace = "http://tempuri.org/")
    @Action(input = "http://tempuri.org/IWS_Operazioni/GetDocumentByKeys", output = "http://tempuri.org/IWS_Operazioni/GetDocumentByKeysResponse")
    @RequestWrapper(localName = "GetDocumentByKeys", targetNamespace = "http://tempuri.org/", className = "it.jdoc.GetDocumentByKeys")
    @WebMethod(operationName = "GetDocumentByKeys", action = "http://tempuri.org/IWS_Operazioni/GetDocumentByKeys")
    @ResponseWrapper(localName = "GetDocumentByKeysResponse", targetNamespace = "http://tempuri.org/", className = "it.jdoc.GetDocumentByKeysResponse")
    public it.jdoc.DocumentResult getDocumentByKeys(
        @WebParam(name = "param", targetNamespace = "http://tempuri.org/")
        it.jdoc.InputGetKeys param
    );

    @WebResult(name = "DoLoginResult", targetNamespace = "http://tempuri.org/")
    @Action(input = "http://tempuri.org/IWS_Operazioni/DoLogin", output = "http://tempuri.org/IWS_Operazioni/DoLoginResponse")
    @RequestWrapper(localName = "DoLogin", targetNamespace = "http://tempuri.org/", className = "it.jdoc.DoLogin")
    @WebMethod(operationName = "DoLogin", action = "http://tempuri.org/IWS_Operazioni/DoLogin")
    @ResponseWrapper(localName = "DoLoginResponse", targetNamespace = "http://tempuri.org/", className = "it.jdoc.DoLoginResponse")
    public it.jdoc.UserResult doLogin(
        @WebParam(name = "param", targetNamespace = "http://tempuri.org/")
        it.jdoc.InputParameter param
    );

    @WebResult(name = "GetDocumentStatusByIdDocResult", targetNamespace = "http://tempuri.org/")
    @Action(input = "http://tempuri.org/IWS_Operazioni/GetDocumentStatusByIdDoc", output = "http://tempuri.org/IWS_Operazioni/GetDocumentStatusByIdDocResponse")
    @RequestWrapper(localName = "GetDocumentStatusByIdDoc", targetNamespace = "http://tempuri.org/", className = "it.jdoc.GetDocumentStatusByIdDoc")
    @WebMethod(operationName = "GetDocumentStatusByIdDoc", action = "http://tempuri.org/IWS_Operazioni/GetDocumentStatusByIdDoc")
    @ResponseWrapper(localName = "GetDocumentStatusByIdDocResponse", targetNamespace = "http://tempuri.org/", className = "it.jdoc.GetDocumentStatusByIdDocResponse")
    public it.jdoc.DocResultStatus getDocumentStatusByIdDoc(
        @WebParam(name = "param", targetNamespace = "http://tempuri.org/")
        it.jdoc.InputByIdDoc param
    );

    @WebResult(name = "DoLinkResult", targetNamespace = "http://tempuri.org/")
    @Action(input = "http://tempuri.org/IWS_Operazioni/DoLink", output = "http://tempuri.org/IWS_Operazioni/DoLinkResponse")
    @RequestWrapper(localName = "DoLink", targetNamespace = "http://tempuri.org/", className = "it.jdoc.DoLink")
    @WebMethod(operationName = "DoLink", action = "http://tempuri.org/IWS_Operazioni/DoLink")
    @ResponseWrapper(localName = "DoLinkResponse", targetNamespace = "http://tempuri.org/", className = "it.jdoc.DoLinkResponse")
    public it.jdoc.LinkResult doLink(
        @WebParam(name = "param", targetNamespace = "http://tempuri.org/")
        it.jdoc.InputLink param
    );

    @WebResult(name = "DoScanResult", targetNamespace = "http://tempuri.org/")
    @Action(input = "http://tempuri.org/IWS_Operazioni/DoScan", output = "http://tempuri.org/IWS_Operazioni/DoScanResponse")
    @RequestWrapper(localName = "DoScan", targetNamespace = "http://tempuri.org/", className = "it.jdoc.DoScan")
    @WebMethod(operationName = "DoScan", action = "http://tempuri.org/IWS_Operazioni/DoScan")
    @ResponseWrapper(localName = "DoScanResponse", targetNamespace = "http://tempuri.org/", className = "it.jdoc.DoScanResponse")
    public it.jdoc.ScanResult doScan(
        @WebParam(name = "param", targetNamespace = "http://tempuri.org/")
        it.jdoc.InputScan param
    );

    @WebResult(name = "DoDeleteResult", targetNamespace = "http://tempuri.org/")
    @Action(input = "http://tempuri.org/IWS_Operazioni/DoDelete", output = "http://tempuri.org/IWS_Operazioni/DoDeleteResponse")
    @RequestWrapper(localName = "DoDelete", targetNamespace = "http://tempuri.org/", className = "it.jdoc.DoDelete")
    @WebMethod(operationName = "DoDelete", action = "http://tempuri.org/IWS_Operazioni/DoDelete")
    @ResponseWrapper(localName = "DoDeleteResponse", targetNamespace = "http://tempuri.org/", className = "it.jdoc.DoDeleteResponse")
    public it.jdoc.ArchiveResult doDelete(
        @WebParam(name = "param", targetNamespace = "http://tempuri.org/")
        it.jdoc.InputDelete param
    );

    @WebResult(name = "DoArchiveResult", targetNamespace = "http://tempuri.org/")
    @Action(input = "http://tempuri.org/IWS_Operazioni/DoArchive", output = "http://tempuri.org/IWS_Operazioni/DoArchiveResponse")
    @RequestWrapper(localName = "DoArchive", targetNamespace = "http://tempuri.org/", className = "it.jdoc.DoArchive")
    @WebMethod(operationName = "DoArchive", action = "http://tempuri.org/IWS_Operazioni/DoArchive")
    @ResponseWrapper(localName = "DoArchiveResponse", targetNamespace = "http://tempuri.org/", className = "it.jdoc.DoArchiveResponse")
    public it.jdoc.ArchiveResult doArchive(
        @WebParam(name = "param", targetNamespace = "http://tempuri.org/")
        it.jdoc.InputArchive param
    );

    @WebResult(name = "AddAttachmentResult", targetNamespace = "http://tempuri.org/")
    @Action(input = "http://tempuri.org/IWS_Operazioni/AddAttachment", output = "http://tempuri.org/IWS_Operazioni/AddAttachmentResponse")
    @RequestWrapper(localName = "AddAttachment", targetNamespace = "http://tempuri.org/", className = "it.jdoc.AddAttachment")
    @WebMethod(operationName = "AddAttachment", action = "http://tempuri.org/IWS_Operazioni/AddAttachment")
    @ResponseWrapper(localName = "AddAttachmentResponse", targetNamespace = "http://tempuri.org/", className = "it.jdoc.AddAttachmentResponse")
    public it.jdoc.AddAttachmentResult addAttachment(
        @WebParam(name = "param", targetNamespace = "http://tempuri.org/")
        it.jdoc.InputAddAttachment param
    );
}
