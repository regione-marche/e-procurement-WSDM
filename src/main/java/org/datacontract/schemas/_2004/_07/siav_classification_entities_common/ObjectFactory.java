
package org.datacontract.schemas._2004._07.siav_classification_entities_common;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.datacontract.schemas._2004._07.siav_classification_entities_common package. 
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

    private final static QName _CustomNullableOfdateTime_QNAME = new QName("http://schemas.datacontract.org/2004/07/SIAV.Classification.Entities.Common.BaseClass", "CustomNullableOfdateTime");
    private final static QName _ArrayOfDocumentIdentifier_QNAME = new QName("http://schemas.datacontract.org/2004/07/SIAV.Classification.Entities.Common.Identifier", "ArrayOfDocumentIdentifier");
    private final static QName _DocumentIdentifier_QNAME = new QName("http://schemas.datacontract.org/2004/07/SIAV.Classification.Entities.Common.Identifier", "DocumentIdentifier");
    private final static QName _CustomDateTimeNullable_QNAME = new QName("http://schemas.datacontract.org/2004/07/SIAV.Classification.Entities.Common.BaseClass", "CustomDateTimeNullable");
    private final static QName _ClassificationExceptionSeverity_QNAME = new QName("http://schemas.datacontract.org/2004/07/SIAV.Classification.Entities.Common.ValueObject", "ClassificationExceptionSeverity");
    private final static QName _ClassificationExceptionDetail_QNAME = new QName("http://schemas.datacontract.org/2004/07/SIAV.Classification.Entities.Common.ValueObject", "ClassificationExceptionDetail");
    private final static QName _ClassificationExceptionDetailMessage_QNAME = new QName("http://schemas.datacontract.org/2004/07/SIAV.Classification.Entities.Common.ValueObject", "Message");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.datacontract.schemas._2004._07.siav_classification_entities_common
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link CustomDateTimeNullable }
     * 
     */
    public CustomDateTimeNullable createCustomDateTimeNullable() {
        return new CustomDateTimeNullable();
    }

    /**
     * Create an instance of {@link ArrayOfDocumentIdentifier }
     * 
     */
    public ArrayOfDocumentIdentifier createArrayOfDocumentIdentifier() {
        return new ArrayOfDocumentIdentifier();
    }

    /**
     * Create an instance of {@link DocumentIdentifier }
     * 
     */
    public DocumentIdentifier createDocumentIdentifier() {
        return new DocumentIdentifier();
    }

    /**
     * Create an instance of {@link CustomNullableOfdateTime }
     * 
     */
    public CustomNullableOfdateTime createCustomNullableOfdateTime() {
        return new CustomNullableOfdateTime();
    }

    /**
     * Create an instance of {@link ClassificationExceptionDetail }
     * 
     */
    public ClassificationExceptionDetail createClassificationExceptionDetail() {
        return new ClassificationExceptionDetail();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CustomNullableOfdateTime }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/SIAV.Classification.Entities.Common.BaseClass", name = "CustomNullableOfdateTime")
    public JAXBElement<CustomNullableOfdateTime> createCustomNullableOfdateTime(CustomNullableOfdateTime value) {
        return new JAXBElement<CustomNullableOfdateTime>(_CustomNullableOfdateTime_QNAME, CustomNullableOfdateTime.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfDocumentIdentifier }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/SIAV.Classification.Entities.Common.Identifier", name = "ArrayOfDocumentIdentifier")
    public JAXBElement<ArrayOfDocumentIdentifier> createArrayOfDocumentIdentifier(ArrayOfDocumentIdentifier value) {
        return new JAXBElement<ArrayOfDocumentIdentifier>(_ArrayOfDocumentIdentifier_QNAME, ArrayOfDocumentIdentifier.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DocumentIdentifier }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/SIAV.Classification.Entities.Common.Identifier", name = "DocumentIdentifier")
    public JAXBElement<DocumentIdentifier> createDocumentIdentifier(DocumentIdentifier value) {
        return new JAXBElement<DocumentIdentifier>(_DocumentIdentifier_QNAME, DocumentIdentifier.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CustomDateTimeNullable }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/SIAV.Classification.Entities.Common.BaseClass", name = "CustomDateTimeNullable")
    public JAXBElement<CustomDateTimeNullable> createCustomDateTimeNullable(CustomDateTimeNullable value) {
        return new JAXBElement<CustomDateTimeNullable>(_CustomDateTimeNullable_QNAME, CustomDateTimeNullable.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ClassificationExceptionSeverity }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/SIAV.Classification.Entities.Common.ValueObject", name = "ClassificationExceptionSeverity")
    public JAXBElement<ClassificationExceptionSeverity> createClassificationExceptionSeverity(ClassificationExceptionSeverity value) {
        return new JAXBElement<ClassificationExceptionSeverity>(_ClassificationExceptionSeverity_QNAME, ClassificationExceptionSeverity.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ClassificationExceptionDetail }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/SIAV.Classification.Entities.Common.ValueObject", name = "ClassificationExceptionDetail")
    public JAXBElement<ClassificationExceptionDetail> createClassificationExceptionDetail(ClassificationExceptionDetail value) {
        return new JAXBElement<ClassificationExceptionDetail>(_ClassificationExceptionDetail_QNAME, ClassificationExceptionDetail.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/SIAV.Classification.Entities.Common.ValueObject", name = "Message", scope = ClassificationExceptionDetail.class)
    public JAXBElement<String> createClassificationExceptionDetailMessage(String value) {
        return new JAXBElement<String>(_ClassificationExceptionDetailMessage_QNAME, String.class, ClassificationExceptionDetail.class, value);
    }

}
