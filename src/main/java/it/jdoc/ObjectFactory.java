
package it.jdoc;

import java.math.BigDecimal;
import java.math.BigInteger;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.datatype.Duration;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the it.jdoc package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _AnyURI_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "anyURI");
    private final static QName _DocumentResult_QNAME = new QName("http://schemas.datacontract.org/2004/07/WS_Operazioni", "DocumentResult");
    private final static QName _Char_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "char");
    private final static QName _InputScan_QNAME = new QName("http://schemas.datacontract.org/2004/07/WS_Operazioni", "InputScan");
    private final static QName _Float_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "float");
    private final static QName _Long_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "long");
    private final static QName _InputGetKeys_QNAME = new QName("http://schemas.datacontract.org/2004/07/WS_Operazioni", "InputGetKeys");
    private final static QName _DocConservation_QNAME = new QName("http://schemas.datacontract.org/2004/07/WS_Operazioni", "DocConservation");
    private final static QName _DocImages_QNAME = new QName("http://schemas.datacontract.org/2004/07/WS_Operazioni", "DocImages");
    private final static QName _Base64Binary_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "base64Binary");
    private final static QName _ScanResult_QNAME = new QName("http://schemas.datacontract.org/2004/07/WS_Operazioni", "ScanResult");
    private final static QName _Byte_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "byte");
    private final static QName _DocStatus_QNAME = new QName("http://schemas.datacontract.org/2004/07/WS_Operazioni", "DocStatus");
    private final static QName _Boolean_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "boolean");
    private final static QName _InputArchive_QNAME = new QName("http://schemas.datacontract.org/2004/07/WS_Operazioni", "InputArchive");
    private final static QName _InputGetBarcode_QNAME = new QName("http://schemas.datacontract.org/2004/07/WS_Operazioni", "InputGetBarcode");
    private final static QName _TestResult_QNAME = new QName("http://schemas.datacontract.org/2004/07/WS_Operazioni", "TestResult");
    private final static QName _UnsignedByte_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "unsignedByte");
    private final static QName _AnyType_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "anyType");
    private final static QName _DocPutRequestOptions_QNAME = new QName("http://schemas.datacontract.org/2004/07/WS_Operazioni", "DocPutRequestOptions");
    private final static QName _Result_QNAME = new QName("http://schemas.datacontract.org/2004/07/WS_Operazioni", "Result");
    private final static QName _Int_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "int");
    private final static QName _ArrayOfDocField_QNAME = new QName("http://schemas.datacontract.org/2004/07/WS_Operazioni", "ArrayOfDocField");
    private final static QName _DocStatusWorkflow_QNAME = new QName("http://schemas.datacontract.org/2004/07/WS_Operazioni", "DocStatusWorkflow");
    private final static QName _Double_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "double");
    private final static QName _InputGetIdDoc_QNAME = new QName("http://schemas.datacontract.org/2004/07/WS_Operazioni", "InputGetIdDoc");
    private final static QName _InputUpdate_QNAME = new QName("http://schemas.datacontract.org/2004/07/WS_Operazioni", "InputUpdate");
    private final static QName _InputLink_QNAME = new QName("http://schemas.datacontract.org/2004/07/WS_Operazioni", "InputLink");
    private final static QName _DocCondition_QNAME = new QName("http://schemas.datacontract.org/2004/07/WS_Operazioni", "DocCondition");
    private final static QName _InputByIdDoc_QNAME = new QName("http://schemas.datacontract.org/2004/07/WS_Operazioni", "InputByIdDoc");
    private final static QName _DocResultStatus_QNAME = new QName("http://schemas.datacontract.org/2004/07/WS_Operazioni", "DocResultStatus");
    private final static QName _InputByKeys_QNAME = new QName("http://schemas.datacontract.org/2004/07/WS_Operazioni", "InputByKeys");
    private final static QName _DateTime_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "dateTime");
    private final static QName _QName_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "QName");
    private final static QName _UnsignedShort_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "unsignedShort");
    private final static QName _AddAttachmentResult_QNAME = new QName("http://schemas.datacontract.org/2004/07/WS_Operazioni", "AddAttachmentResult");
    private final static QName _DocField_QNAME = new QName("http://schemas.datacontract.org/2004/07/WS_Operazioni", "DocField");
    private final static QName _ResultCodes_QNAME = new QName("http://schemas.datacontract.org/2004/07/WS_Operazioni", "ResultCodes");
    private final static QName _InputByBarcode_QNAME = new QName("http://schemas.datacontract.org/2004/07/WS_Operazioni", "InputByBarcode");
    private final static QName _Short_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "short");
    private final static QName _UserResult_QNAME = new QName("http://schemas.datacontract.org/2004/07/WS_Operazioni", "UserResult");
    private final static QName _ArchiveResult_QNAME = new QName("http://schemas.datacontract.org/2004/07/WS_Operazioni", "ArchiveResult");
    private final static QName _InputAddAttachment_QNAME = new QName("http://schemas.datacontract.org/2004/07/WS_Operazioni", "InputAddAttachment");
    private final static QName _InputParameter_QNAME = new QName("http://schemas.datacontract.org/2004/07/WS_Operazioni", "InputParameter");
    private final static QName _DocResultCondition_QNAME = new QName("http://schemas.datacontract.org/2004/07/WS_Operazioni", "DocResultCondition");
    private final static QName _ArrayOfError_QNAME = new QName("http://schemas.datacontract.org/2004/07/WS_Operazioni", "ArrayOfError");
    private final static QName _InputDelete_QNAME = new QName("http://schemas.datacontract.org/2004/07/WS_Operazioni", "InputDelete");
    private final static QName _UnsignedInt_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "unsignedInt");
    private final static QName _Error_QNAME = new QName("http://schemas.datacontract.org/2004/07/WS_Operazioni", "Error");
    private final static QName _Decimal_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "decimal");
    private final static QName _Guid_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "guid");
    private final static QName _Duration_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "duration");
    private final static QName _String_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "string");
    private final static QName _UnsignedLong_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "unsignedLong");
    private final static QName _LinkResult_QNAME = new QName("http://schemas.datacontract.org/2004/07/WS_Operazioni", "LinkResult");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: it.jdoc
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link DoLinkResponse }
     * 
     */
    public DoLinkResponse createDoLinkResponse() {
        return new DoLinkResponse();
    }

    /**
     * Create an instance of {@link Test }
     * 
     */
    public Test createTest() {
        return new Test();
    }

    /**
     * Create an instance of {@link GetDocumentByIdDoc }
     * 
     */
    public GetDocumentByIdDoc createGetDocumentByIdDoc() {
        return new GetDocumentByIdDoc();
    }

    /**
     * Create an instance of {@link DocResultCondition }
     * 
     */
    public DocResultCondition createDocResultCondition() {
        return new DocResultCondition();
    }

    /**
     * Create an instance of {@link AddAttachmentResponse }
     * 
     */
    public AddAttachmentResponse createAddAttachmentResponse() {
        return new AddAttachmentResponse();
    }

    /**
     * Create an instance of {@link DoUpdate }
     * 
     */
    public DoUpdate createDoUpdate() {
        return new DoUpdate();
    }

    /**
     * Create an instance of {@link InputGetKeys }
     * 
     */
    public InputGetKeys createInputGetKeys() {
        return new InputGetKeys();
    }

    /**
     * Create an instance of {@link ArchiveResult }
     * 
     */
    public ArchiveResult createArchiveResult() {
        return new ArchiveResult();
    }

    /**
     * Create an instance of {@link GetDocumentStatusByKeysResponse }
     * 
     */
    public GetDocumentStatusByKeysResponse createGetDocumentStatusByKeysResponse() {
        return new GetDocumentStatusByKeysResponse();
    }

    /**
     * Create an instance of {@link ArrayOfError }
     * 
     */
    public ArrayOfError createArrayOfError() {
        return new ArrayOfError();
    }

    /**
     * Create an instance of {@link GetDocumentByIdDocResponse }
     * 
     */
    public GetDocumentByIdDocResponse createGetDocumentByIdDocResponse() {
        return new GetDocumentByIdDocResponse();
    }

    /**
     * Create an instance of {@link DocStatusWorkflow }
     * 
     */
    public DocStatusWorkflow createDocStatusWorkflow() {
        return new DocStatusWorkflow();
    }

    /**
     * Create an instance of {@link DocConservation }
     * 
     */
    public DocConservation createDocConservation() {
        return new DocConservation();
    }

    /**
     * Create an instance of {@link DoUpdateResponse }
     * 
     */
    public DoUpdateResponse createDoUpdateResponse() {
        return new DoUpdateResponse();
    }

    /**
     * Create an instance of {@link DocField }
     * 
     */
    public DocField createDocField() {
        return new DocField();
    }

    /**
     * Create an instance of {@link InputUpdate }
     * 
     */
    public InputUpdate createInputUpdate() {
        return new InputUpdate();
    }

    /**
     * Create an instance of {@link DoArchiveResponse }
     * 
     */
    public DoArchiveResponse createDoArchiveResponse() {
        return new DoArchiveResponse();
    }

    /**
     * Create an instance of {@link ArrayOfDocField }
     * 
     */
    public ArrayOfDocField createArrayOfDocField() {
        return new ArrayOfDocField();
    }

    /**
     * Create an instance of {@link DoLoginResponse }
     * 
     */
    public DoLoginResponse createDoLoginResponse() {
        return new DoLoginResponse();
    }

    /**
     * Create an instance of {@link GetDocumentByKeys }
     * 
     */
    public GetDocumentByKeys createGetDocumentByKeys() {
        return new GetDocumentByKeys();
    }

    /**
     * Create an instance of {@link AddAttachmentResult }
     * 
     */
    public AddAttachmentResult createAddAttachmentResult() {
        return new AddAttachmentResult();
    }

    /**
     * Create an instance of {@link LinkResult }
     * 
     */
    public LinkResult createLinkResult() {
        return new LinkResult();
    }

    /**
     * Create an instance of {@link InputArchive }
     * 
     */
    public InputArchive createInputArchive() {
        return new InputArchive();
    }

    /**
     * Create an instance of {@link GetDocumentConditionByBarCode }
     * 
     */
    public GetDocumentConditionByBarCode createGetDocumentConditionByBarCode() {
        return new GetDocumentConditionByBarCode();
    }

    /**
     * Create an instance of {@link GetDocumentConditionByBarCodeResponse }
     * 
     */
    public GetDocumentConditionByBarCodeResponse createGetDocumentConditionByBarCodeResponse() {
        return new GetDocumentConditionByBarCodeResponse();
    }

    /**
     * Create an instance of {@link InputParameter }
     * 
     */
    public InputParameter createInputParameter() {
        return new InputParameter();
    }

    /**
     * Create an instance of {@link DoScan }
     * 
     */
    public DoScan createDoScan() {
        return new DoScan();
    }

    /**
     * Create an instance of {@link DocStatus }
     * 
     */
    public DocStatus createDocStatus() {
        return new DocStatus();
    }

    /**
     * Create an instance of {@link InputScan }
     * 
     */
    public InputScan createInputScan() {
        return new InputScan();
    }

    /**
     * Create an instance of {@link ScanResult }
     * 
     */
    public ScanResult createScanResult() {
        return new ScanResult();
    }

    /**
     * Create an instance of {@link GetDocumentConditionByKeysResponse }
     * 
     */
    public GetDocumentConditionByKeysResponse createGetDocumentConditionByKeysResponse() {
        return new GetDocumentConditionByKeysResponse();
    }

    /**
     * Create an instance of {@link DocImages }
     * 
     */
    public DocImages createDocImages() {
        return new DocImages();
    }

    /**
     * Create an instance of {@link AddAttachment }
     * 
     */
    public AddAttachment createAddAttachment() {
        return new AddAttachment();
    }

    /**
     * Create an instance of {@link GetDocumentStatusByBarCodeResponse }
     * 
     */
    public GetDocumentStatusByBarCodeResponse createGetDocumentStatusByBarCodeResponse() {
        return new GetDocumentStatusByBarCodeResponse();
    }

    /**
     * Create an instance of {@link DoLink }
     * 
     */
    public DoLink createDoLink() {
        return new DoLink();
    }

    /**
     * Create an instance of {@link Error }
     * 
     */
    public Error createError() {
        return new Error();
    }

    /**
     * Create an instance of {@link InputLink }
     * 
     */
    public InputLink createInputLink() {
        return new InputLink();
    }

    /**
     * Create an instance of {@link GetDocumentByBarCodeResponse }
     * 
     */
    public GetDocumentByBarCodeResponse createGetDocumentByBarCodeResponse() {
        return new GetDocumentByBarCodeResponse();
    }

    /**
     * Create an instance of {@link InputByIdDoc }
     * 
     */
    public InputByIdDoc createInputByIdDoc() {
        return new InputByIdDoc();
    }

    /**
     * Create an instance of {@link TestResponse }
     * 
     */
    public TestResponse createTestResponse() {
        return new TestResponse();
    }

    /**
     * Create an instance of {@link DoDeleteResponse }
     * 
     */
    public DoDeleteResponse createDoDeleteResponse() {
        return new DoDeleteResponse();
    }

    /**
     * Create an instance of {@link GetDocumentStatusByKeys }
     * 
     */
    public GetDocumentStatusByKeys createGetDocumentStatusByKeys() {
        return new GetDocumentStatusByKeys();
    }

    /**
     * Create an instance of {@link Result }
     * 
     */
    public Result createResult() {
        return new Result();
    }

    /**
     * Create an instance of {@link GetDocumentConditionByIdDocResponse }
     * 
     */
    public GetDocumentConditionByIdDocResponse createGetDocumentConditionByIdDocResponse() {
        return new GetDocumentConditionByIdDocResponse();
    }

    /**
     * Create an instance of {@link GetDocumentConditionByIdDoc }
     * 
     */
    public GetDocumentConditionByIdDoc createGetDocumentConditionByIdDoc() {
        return new GetDocumentConditionByIdDoc();
    }

    /**
     * Create an instance of {@link GetDocumentByKeysResponse }
     * 
     */
    public GetDocumentByKeysResponse createGetDocumentByKeysResponse() {
        return new GetDocumentByKeysResponse();
    }

    /**
     * Create an instance of {@link DoScanResponse }
     * 
     */
    public DoScanResponse createDoScanResponse() {
        return new DoScanResponse();
    }

    /**
     * Create an instance of {@link DocumentResult }
     * 
     */
    public DocumentResult createDocumentResult() {
        return new DocumentResult();
    }

    /**
     * Create an instance of {@link DocCondition }
     * 
     */
    public DocCondition createDocCondition() {
        return new DocCondition();
    }

    /**
     * Create an instance of {@link DoLogin }
     * 
     */
    public DoLogin createDoLogin() {
        return new DoLogin();
    }

    /**
     * Create an instance of {@link DocResultStatus }
     * 
     */
    public DocResultStatus createDocResultStatus() {
        return new DocResultStatus();
    }

    /**
     * Create an instance of {@link InputByBarcode }
     * 
     */
    public InputByBarcode createInputByBarcode() {
        return new InputByBarcode();
    }

    /**
     * Create an instance of {@link GetDocumentStatusByBarCode }
     * 
     */
    public GetDocumentStatusByBarCode createGetDocumentStatusByBarCode() {
        return new GetDocumentStatusByBarCode();
    }

    /**
     * Create an instance of {@link DocPutRequestOptions }
     * 
     */
    public DocPutRequestOptions createDocPutRequestOptions() {
        return new DocPutRequestOptions();
    }

    /**
     * Create an instance of {@link InputByKeys }
     * 
     */
    public InputByKeys createInputByKeys() {
        return new InputByKeys();
    }

    /**
     * Create an instance of {@link GetDocumentByBarCode }
     * 
     */
    public GetDocumentByBarCode createGetDocumentByBarCode() {
        return new GetDocumentByBarCode();
    }

    /**
     * Create an instance of {@link GetDocumentStatusByIdDoc }
     * 
     */
    public GetDocumentStatusByIdDoc createGetDocumentStatusByIdDoc() {
        return new GetDocumentStatusByIdDoc();
    }

    /**
     * Create an instance of {@link GetDocumentStatusByIdDocResponse }
     * 
     */
    public GetDocumentStatusByIdDocResponse createGetDocumentStatusByIdDocResponse() {
        return new GetDocumentStatusByIdDocResponse();
    }

    /**
     * Create an instance of {@link UserResult }
     * 
     */
    public UserResult createUserResult() {
        return new UserResult();
    }

    /**
     * Create an instance of {@link DoArchive }
     * 
     */
    public DoArchive createDoArchive() {
        return new DoArchive();
    }

    /**
     * Create an instance of {@link InputDelete }
     * 
     */
    public InputDelete createInputDelete() {
        return new InputDelete();
    }

    /**
     * Create an instance of {@link InputGetIdDoc }
     * 
     */
    public InputGetIdDoc createInputGetIdDoc() {
        return new InputGetIdDoc();
    }

    /**
     * Create an instance of {@link DoDelete }
     * 
     */
    public DoDelete createDoDelete() {
        return new DoDelete();
    }

    /**
     * Create an instance of {@link InputAddAttachment }
     * 
     */
    public InputAddAttachment createInputAddAttachment() {
        return new InputAddAttachment();
    }

    /**
     * Create an instance of {@link TestResult }
     * 
     */
    public TestResult createTestResult() {
        return new TestResult();
    }

    /**
     * Create an instance of {@link InputGetBarcode }
     * 
     */
    public InputGetBarcode createInputGetBarcode() {
        return new InputGetBarcode();
    }

    /**
     * Create an instance of {@link GetDocumentConditionByKeys }
     * 
     */
    public GetDocumentConditionByKeys createGetDocumentConditionByKeys() {
        return new GetDocumentConditionByKeys();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "anyURI")
    public JAXBElement<String> createAnyURI(String value) {
        return new JAXBElement<String>(_AnyURI_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DocumentResult }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/WS_Operazioni", name = "DocumentResult")
    public JAXBElement<DocumentResult> createDocumentResult(DocumentResult value) {
        return new JAXBElement<DocumentResult>(_DocumentResult_QNAME, DocumentResult.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "char")
    public JAXBElement<Integer> createChar(Integer value) {
        return new JAXBElement<Integer>(_Char_QNAME, Integer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InputScan }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/WS_Operazioni", name = "InputScan")
    public JAXBElement<InputScan> createInputScan(InputScan value) {
        return new JAXBElement<InputScan>(_InputScan_QNAME, InputScan.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Float }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "float")
    public JAXBElement<Float> createFloat(Float value) {
        return new JAXBElement<Float>(_Float_QNAME, Float.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "long")
    public JAXBElement<Long> createLong(Long value) {
        return new JAXBElement<Long>(_Long_QNAME, Long.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InputGetKeys }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/WS_Operazioni", name = "InputGetKeys")
    public JAXBElement<InputGetKeys> createInputGetKeys(InputGetKeys value) {
        return new JAXBElement<InputGetKeys>(_InputGetKeys_QNAME, InputGetKeys.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DocConservation }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/WS_Operazioni", name = "DocConservation")
    public JAXBElement<DocConservation> createDocConservation(DocConservation value) {
        return new JAXBElement<DocConservation>(_DocConservation_QNAME, DocConservation.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DocImages }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/WS_Operazioni", name = "DocImages")
    public JAXBElement<DocImages> createDocImages(DocImages value) {
        return new JAXBElement<DocImages>(_DocImages_QNAME, DocImages.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "base64Binary")
    public JAXBElement<byte[]> createBase64Binary(byte[] value) {
        return new JAXBElement<byte[]>(_Base64Binary_QNAME, byte[].class, null, ((byte[]) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ScanResult }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/WS_Operazioni", name = "ScanResult")
    public JAXBElement<ScanResult> createScanResult(ScanResult value) {
        return new JAXBElement<ScanResult>(_ScanResult_QNAME, ScanResult.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Byte }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "byte")
    public JAXBElement<Byte> createByte(Byte value) {
        return new JAXBElement<Byte>(_Byte_QNAME, Byte.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DocStatus }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/WS_Operazioni", name = "DocStatus")
    public JAXBElement<DocStatus> createDocStatus(DocStatus value) {
        return new JAXBElement<DocStatus>(_DocStatus_QNAME, DocStatus.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "boolean")
    public JAXBElement<Boolean> createBoolean(Boolean value) {
        return new JAXBElement<Boolean>(_Boolean_QNAME, Boolean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InputArchive }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/WS_Operazioni", name = "InputArchive")
    public JAXBElement<InputArchive> createInputArchive(InputArchive value) {
        return new JAXBElement<InputArchive>(_InputArchive_QNAME, InputArchive.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InputGetBarcode }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/WS_Operazioni", name = "InputGetBarcode")
    public JAXBElement<InputGetBarcode> createInputGetBarcode(InputGetBarcode value) {
        return new JAXBElement<InputGetBarcode>(_InputGetBarcode_QNAME, InputGetBarcode.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TestResult }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/WS_Operazioni", name = "TestResult")
    public JAXBElement<TestResult> createTestResult(TestResult value) {
        return new JAXBElement<TestResult>(_TestResult_QNAME, TestResult.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Short }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "unsignedByte")
    public JAXBElement<Short> createUnsignedByte(Short value) {
        return new JAXBElement<Short>(_UnsignedByte_QNAME, Short.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Object }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "anyType")
    public JAXBElement<Object> createAnyType(Object value) {
        return new JAXBElement<Object>(_AnyType_QNAME, Object.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DocPutRequestOptions }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/WS_Operazioni", name = "DocPutRequestOptions")
    public JAXBElement<DocPutRequestOptions> createDocPutRequestOptions(DocPutRequestOptions value) {
        return new JAXBElement<DocPutRequestOptions>(_DocPutRequestOptions_QNAME, DocPutRequestOptions.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Result }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/WS_Operazioni", name = "Result")
    public JAXBElement<Result> createResult(Result value) {
        return new JAXBElement<Result>(_Result_QNAME, Result.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "int")
    public JAXBElement<Integer> createInt(Integer value) {
        return new JAXBElement<Integer>(_Int_QNAME, Integer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfDocField }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/WS_Operazioni", name = "ArrayOfDocField")
    public JAXBElement<ArrayOfDocField> createArrayOfDocField(ArrayOfDocField value) {
        return new JAXBElement<ArrayOfDocField>(_ArrayOfDocField_QNAME, ArrayOfDocField.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DocStatusWorkflow }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/WS_Operazioni", name = "DocStatusWorkflow")
    public JAXBElement<DocStatusWorkflow> createDocStatusWorkflow(DocStatusWorkflow value) {
        return new JAXBElement<DocStatusWorkflow>(_DocStatusWorkflow_QNAME, DocStatusWorkflow.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Double }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "double")
    public JAXBElement<Double> createDouble(Double value) {
        return new JAXBElement<Double>(_Double_QNAME, Double.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InputGetIdDoc }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/WS_Operazioni", name = "InputGetIdDoc")
    public JAXBElement<InputGetIdDoc> createInputGetIdDoc(InputGetIdDoc value) {
        return new JAXBElement<InputGetIdDoc>(_InputGetIdDoc_QNAME, InputGetIdDoc.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InputUpdate }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/WS_Operazioni", name = "InputUpdate")
    public JAXBElement<InputUpdate> createInputUpdate(InputUpdate value) {
        return new JAXBElement<InputUpdate>(_InputUpdate_QNAME, InputUpdate.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InputLink }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/WS_Operazioni", name = "InputLink")
    public JAXBElement<InputLink> createInputLink(InputLink value) {
        return new JAXBElement<InputLink>(_InputLink_QNAME, InputLink.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DocCondition }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/WS_Operazioni", name = "DocCondition")
    public JAXBElement<DocCondition> createDocCondition(DocCondition value) {
        return new JAXBElement<DocCondition>(_DocCondition_QNAME, DocCondition.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InputByIdDoc }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/WS_Operazioni", name = "InputByIdDoc")
    public JAXBElement<InputByIdDoc> createInputByIdDoc(InputByIdDoc value) {
        return new JAXBElement<InputByIdDoc>(_InputByIdDoc_QNAME, InputByIdDoc.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DocResultStatus }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/WS_Operazioni", name = "DocResultStatus")
    public JAXBElement<DocResultStatus> createDocResultStatus(DocResultStatus value) {
        return new JAXBElement<DocResultStatus>(_DocResultStatus_QNAME, DocResultStatus.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InputByKeys }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/WS_Operazioni", name = "InputByKeys")
    public JAXBElement<InputByKeys> createInputByKeys(InputByKeys value) {
        return new JAXBElement<InputByKeys>(_InputByKeys_QNAME, InputByKeys.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "dateTime")
    public JAXBElement<XMLGregorianCalendar> createDateTime(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_DateTime_QNAME, XMLGregorianCalendar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link QName }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "QName")
    public JAXBElement<QName> createQName(QName value) {
        return new JAXBElement<QName>(_QName_QNAME, QName.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "unsignedShort")
    public JAXBElement<Integer> createUnsignedShort(Integer value) {
        return new JAXBElement<Integer>(_UnsignedShort_QNAME, Integer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddAttachmentResult }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/WS_Operazioni", name = "AddAttachmentResult")
    public JAXBElement<AddAttachmentResult> createAddAttachmentResult(AddAttachmentResult value) {
        return new JAXBElement<AddAttachmentResult>(_AddAttachmentResult_QNAME, AddAttachmentResult.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DocField }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/WS_Operazioni", name = "DocField")
    public JAXBElement<DocField> createDocField(DocField value) {
        return new JAXBElement<DocField>(_DocField_QNAME, DocField.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ResultCodes }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/WS_Operazioni", name = "ResultCodes")
    public JAXBElement<ResultCodes> createResultCodes(ResultCodes value) {
        return new JAXBElement<ResultCodes>(_ResultCodes_QNAME, ResultCodes.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InputByBarcode }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/WS_Operazioni", name = "InputByBarcode")
    public JAXBElement<InputByBarcode> createInputByBarcode(InputByBarcode value) {
        return new JAXBElement<InputByBarcode>(_InputByBarcode_QNAME, InputByBarcode.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Short }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "short")
    public JAXBElement<Short> createShort(Short value) {
        return new JAXBElement<Short>(_Short_QNAME, Short.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UserResult }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/WS_Operazioni", name = "UserResult")
    public JAXBElement<UserResult> createUserResult(UserResult value) {
        return new JAXBElement<UserResult>(_UserResult_QNAME, UserResult.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArchiveResult }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/WS_Operazioni", name = "ArchiveResult")
    public JAXBElement<ArchiveResult> createArchiveResult(ArchiveResult value) {
        return new JAXBElement<ArchiveResult>(_ArchiveResult_QNAME, ArchiveResult.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InputAddAttachment }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/WS_Operazioni", name = "InputAddAttachment")
    public JAXBElement<InputAddAttachment> createInputAddAttachment(InputAddAttachment value) {
        return new JAXBElement<InputAddAttachment>(_InputAddAttachment_QNAME, InputAddAttachment.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InputParameter }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/WS_Operazioni", name = "InputParameter")
    public JAXBElement<InputParameter> createInputParameter(InputParameter value) {
        return new JAXBElement<InputParameter>(_InputParameter_QNAME, InputParameter.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DocResultCondition }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/WS_Operazioni", name = "DocResultCondition")
    public JAXBElement<DocResultCondition> createDocResultCondition(DocResultCondition value) {
        return new JAXBElement<DocResultCondition>(_DocResultCondition_QNAME, DocResultCondition.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfError }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/WS_Operazioni", name = "ArrayOfError")
    public JAXBElement<ArrayOfError> createArrayOfError(ArrayOfError value) {
        return new JAXBElement<ArrayOfError>(_ArrayOfError_QNAME, ArrayOfError.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InputDelete }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/WS_Operazioni", name = "InputDelete")
    public JAXBElement<InputDelete> createInputDelete(InputDelete value) {
        return new JAXBElement<InputDelete>(_InputDelete_QNAME, InputDelete.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "unsignedInt")
    public JAXBElement<Long> createUnsignedInt(Long value) {
        return new JAXBElement<Long>(_UnsignedInt_QNAME, Long.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Error }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/WS_Operazioni", name = "Error")
    public JAXBElement<Error> createError(Error value) {
        return new JAXBElement<Error>(_Error_QNAME, Error.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "decimal")
    public JAXBElement<BigDecimal> createDecimal(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_Decimal_QNAME, BigDecimal.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "guid")
    public JAXBElement<String> createGuid(String value) {
        return new JAXBElement<String>(_Guid_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Duration }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "duration")
    public JAXBElement<Duration> createDuration(Duration value) {
        return new JAXBElement<Duration>(_Duration_QNAME, Duration.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "string")
    public JAXBElement<String> createString(String value) {
        return new JAXBElement<String>(_String_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "unsignedLong")
    public JAXBElement<BigInteger> createUnsignedLong(BigInteger value) {
        return new JAXBElement<BigInteger>(_UnsignedLong_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LinkResult }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/WS_Operazioni", name = "LinkResult")
    public JAXBElement<LinkResult> createLinkResult(LinkResult value) {
        return new JAXBElement<LinkResult>(_LinkResult_QNAME, LinkResult.class, null, value);
    }

}
