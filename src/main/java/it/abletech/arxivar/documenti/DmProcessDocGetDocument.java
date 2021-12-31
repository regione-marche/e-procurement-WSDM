
package it.abletech.arxivar.documenti;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="sessionId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="processDocId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="taskWorkId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "sessionId",
    "processDocId",
    "taskWorkId"
})
@XmlRootElement(name = "Dm_ProcessDoc_GetDocument")
public class DmProcessDocGetDocument {

    protected String sessionId;
    protected int processDocId;
    protected int taskWorkId;

    /**
     * Gets the value of the sessionId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSessionId() {
        return sessionId;
    }

    /**
     * Sets the value of the sessionId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSessionId(String value) {
        this.sessionId = value;
    }

    /**
     * Gets the value of the processDocId property.
     * 
     */
    public int getProcessDocId() {
        return processDocId;
    }

    /**
     * Sets the value of the processDocId property.
     * 
     */
    public void setProcessDocId(int value) {
        this.processDocId = value;
    }

    /**
     * Gets the value of the taskWorkId property.
     * 
     */
    public int getTaskWorkId() {
        return taskWorkId;
    }

    /**
     * Sets the value of the taskWorkId property.
     * 
     */
    public void setTaskWorkId(int value) {
        this.taskWorkId = value;
    }

}
