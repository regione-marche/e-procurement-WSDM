
package it.archiflow96;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CheckCreateZipCardsDataOutput complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CheckCreateZipCardsDataOutput">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities}BaseOutput">
 *       &lt;sequence>
 *         &lt;element name="ErrorCardId" type="{http://schemas.microsoft.com/2003/10/Serialization/}guid" minOccurs="0"/>
 *         &lt;element name="ErrorCode" type="{http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Types}CreatingZipError" minOccurs="0"/>
 *         &lt;element name="ErrorDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Status" type="{http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Types}AsynchOperationStatus" minOccurs="0"/>
 *         &lt;element name="ZipFileId" type="{http://schemas.microsoft.com/2003/10/Serialization/}guid" minOccurs="0"/>
 *         &lt;element name="ZipFileName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ZipFileSize" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CheckCreateZipCardsDataOutput", namespace = "http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Card.ValueObject", propOrder = {
    "errorCardId",
    "errorCode",
    "errorDescription",
    "status",
    "zipFileId",
    "zipFileName",
    "zipFileSize"
})
public class CheckCreateZipCardsDataOutput
    extends BaseOutput
{

    @XmlElement(name = "ErrorCardId")
    protected String errorCardId;
    @XmlElement(name = "ErrorCode")
    protected CreatingZipError errorCode;
    @XmlElement(name = "ErrorDescription", nillable = true)
    protected String errorDescription;
    @XmlElement(name = "Status")
    protected AsynchOperationStatus status;
    @XmlElement(name = "ZipFileId")
    protected String zipFileId;
    @XmlElement(name = "ZipFileName", nillable = true)
    protected String zipFileName;
    @XmlElement(name = "ZipFileSize")
    protected Long zipFileSize;

    /**
     * Gets the value of the errorCardId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getErrorCardId() {
        return errorCardId;
    }

    /**
     * Sets the value of the errorCardId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setErrorCardId(String value) {
        this.errorCardId = value;
    }

    /**
     * Gets the value of the errorCode property.
     * 
     * @return
     *     possible object is
     *     {@link CreatingZipError }
     *     
     */
    public CreatingZipError getErrorCode() {
        return errorCode;
    }

    /**
     * Sets the value of the errorCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link CreatingZipError }
     *     
     */
    public void setErrorCode(CreatingZipError value) {
        this.errorCode = value;
    }

    /**
     * Gets the value of the errorDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getErrorDescription() {
        return errorDescription;
    }

    /**
     * Sets the value of the errorDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setErrorDescription(String value) {
        this.errorDescription = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link AsynchOperationStatus }
     *     
     */
    public AsynchOperationStatus getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link AsynchOperationStatus }
     *     
     */
    public void setStatus(AsynchOperationStatus value) {
        this.status = value;
    }

    /**
     * Gets the value of the zipFileId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getZipFileId() {
        return zipFileId;
    }

    /**
     * Sets the value of the zipFileId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setZipFileId(String value) {
        this.zipFileId = value;
    }

    /**
     * Gets the value of the zipFileName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getZipFileName() {
        return zipFileName;
    }

    /**
     * Sets the value of the zipFileName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setZipFileName(String value) {
        this.zipFileName = value;
    }

    /**
     * Gets the value of the zipFileSize property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getZipFileSize() {
        return zipFileSize;
    }

    /**
     * Sets the value of the zipFileSize property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setZipFileSize(Long value) {
        this.zipFileSize = value;
    }

}
