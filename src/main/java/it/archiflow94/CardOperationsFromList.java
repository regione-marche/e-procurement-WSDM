
package it.archiflow94;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CardOperationsFromList complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CardOperationsFromList">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ArchivalCollation" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Cancellation" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="DigitalSign" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="GraphometricSign" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="PdfNativeSign" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="RemoteSign" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="SendExtendedEmail" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="SendExternalEmail" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Sharing" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="StandardCollation" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="TimeStamp" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="WfForward" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="WfRefuse" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="WfTakeInCharge" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CardOperationsFromList", namespace = "http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Types", propOrder = {
    "archivalCollation",
    "cancellation",
    "digitalSign",
    "graphometricSign",
    "pdfNativeSign",
    "remoteSign",
    "sendExtendedEmail",
    "sendExternalEmail",
    "sharing",
    "standardCollation",
    "timeStamp",
    "wfForward",
    "wfRefuse",
    "wfTakeInCharge"
})
public class CardOperationsFromList {

    @XmlElement(name = "ArchivalCollation")
    protected Boolean archivalCollation;
    @XmlElement(name = "Cancellation")
    protected Boolean cancellation;
    @XmlElement(name = "DigitalSign")
    protected Boolean digitalSign;
    @XmlElement(name = "GraphometricSign")
    protected Boolean graphometricSign;
    @XmlElement(name = "PdfNativeSign")
    protected Boolean pdfNativeSign;
    @XmlElement(name = "RemoteSign")
    protected Boolean remoteSign;
    @XmlElement(name = "SendExtendedEmail")
    protected Boolean sendExtendedEmail;
    @XmlElement(name = "SendExternalEmail")
    protected Boolean sendExternalEmail;
    @XmlElement(name = "Sharing")
    protected Boolean sharing;
    @XmlElement(name = "StandardCollation")
    protected Boolean standardCollation;
    @XmlElement(name = "TimeStamp")
    protected Boolean timeStamp;
    @XmlElement(name = "WfForward")
    protected Boolean wfForward;
    @XmlElement(name = "WfRefuse")
    protected Boolean wfRefuse;
    @XmlElement(name = "WfTakeInCharge")
    protected Boolean wfTakeInCharge;

    /**
     * Gets the value of the archivalCollation property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isArchivalCollation() {
        return archivalCollation;
    }

    /**
     * Sets the value of the archivalCollation property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setArchivalCollation(Boolean value) {
        this.archivalCollation = value;
    }

    /**
     * Gets the value of the cancellation property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCancellation() {
        return cancellation;
    }

    /**
     * Sets the value of the cancellation property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCancellation(Boolean value) {
        this.cancellation = value;
    }

    /**
     * Gets the value of the digitalSign property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDigitalSign() {
        return digitalSign;
    }

    /**
     * Sets the value of the digitalSign property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDigitalSign(Boolean value) {
        this.digitalSign = value;
    }

    /**
     * Gets the value of the graphometricSign property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isGraphometricSign() {
        return graphometricSign;
    }

    /**
     * Sets the value of the graphometricSign property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setGraphometricSign(Boolean value) {
        this.graphometricSign = value;
    }

    /**
     * Gets the value of the pdfNativeSign property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPdfNativeSign() {
        return pdfNativeSign;
    }

    /**
     * Sets the value of the pdfNativeSign property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPdfNativeSign(Boolean value) {
        this.pdfNativeSign = value;
    }

    /**
     * Gets the value of the remoteSign property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRemoteSign() {
        return remoteSign;
    }

    /**
     * Sets the value of the remoteSign property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRemoteSign(Boolean value) {
        this.remoteSign = value;
    }

    /**
     * Gets the value of the sendExtendedEmail property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSendExtendedEmail() {
        return sendExtendedEmail;
    }

    /**
     * Sets the value of the sendExtendedEmail property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSendExtendedEmail(Boolean value) {
        this.sendExtendedEmail = value;
    }

    /**
     * Gets the value of the sendExternalEmail property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSendExternalEmail() {
        return sendExternalEmail;
    }

    /**
     * Sets the value of the sendExternalEmail property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSendExternalEmail(Boolean value) {
        this.sendExternalEmail = value;
    }

    /**
     * Gets the value of the sharing property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSharing() {
        return sharing;
    }

    /**
     * Sets the value of the sharing property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSharing(Boolean value) {
        this.sharing = value;
    }

    /**
     * Gets the value of the standardCollation property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isStandardCollation() {
        return standardCollation;
    }

    /**
     * Sets the value of the standardCollation property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setStandardCollation(Boolean value) {
        this.standardCollation = value;
    }

    /**
     * Gets the value of the timeStamp property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isTimeStamp() {
        return timeStamp;
    }

    /**
     * Sets the value of the timeStamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTimeStamp(Boolean value) {
        this.timeStamp = value;
    }

    /**
     * Gets the value of the wfForward property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isWfForward() {
        return wfForward;
    }

    /**
     * Sets the value of the wfForward property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setWfForward(Boolean value) {
        this.wfForward = value;
    }

    /**
     * Gets the value of the wfRefuse property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isWfRefuse() {
        return wfRefuse;
    }

    /**
     * Sets the value of the wfRefuse property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setWfRefuse(Boolean value) {
        this.wfRefuse = value;
    }

    /**
     * Gets the value of the wfTakeInCharge property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isWfTakeInCharge() {
        return wfTakeInCharge;
    }

    /**
     * Sets the value of the wfTakeInCharge property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setWfTakeInCharge(Boolean value) {
        this.wfTakeInCharge = value;
    }

}
