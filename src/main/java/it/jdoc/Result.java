
package it.jdoc;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Result complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Result">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ErrorList" type="{http://schemas.datacontract.org/2004/07/WS_Operazioni}ArrayOfError" minOccurs="0"/>
 *         &lt;element name="IsOk" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Result", namespace = "http://schemas.datacontract.org/2004/07/WS_Operazioni", propOrder = {
    "errorList",
    "isOk"
})
@XmlSeeAlso({
    DocumentResult.class,
    AddAttachmentResult.class,
    ArchiveResult.class,
    ScanResult.class,
    UserResult.class,
    DocResultCondition.class,
    TestResult.class,
    LinkResult.class,
    DocResultStatus.class
})
public class Result {

    @XmlElement(name = "ErrorList", nillable = true)
    protected ArrayOfError errorList;
    @XmlElement(name = "IsOk")
    protected Boolean isOk;

    /**
     * Gets the value of the errorList property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfError }
     *     
     */
    public ArrayOfError getErrorList() {
        return errorList;
    }

    /**
     * Sets the value of the errorList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfError }
     *     
     */
    public void setErrorList(ArrayOfError value) {
        this.errorList = value;
    }

    /**
     * Gets the value of the isOk property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsOk() {
        return isOk;
    }

    /**
     * Sets the value of the isOk property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsOk(Boolean value) {
        this.isOk = value;
    }

}
