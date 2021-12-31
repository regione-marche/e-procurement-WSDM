
package it.archiflow94;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
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
 *         &lt;element name="sessionInfo" type="{http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Login.ValueObject}SessionInfo" minOccurs="0"/>
 *         &lt;element name="contRep" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="docId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="compId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "sessionInfo",
    "contRep",
    "docId",
    "compId"
})
@XmlRootElement(name = "GetCardFromSapDocId")
public class GetCardFromSapDocId {

    @XmlElement(nillable = true)
    protected SessionInfo sessionInfo;
    @XmlElement(nillable = true)
    protected String contRep;
    @XmlElement(nillable = true)
    protected String docId;
    @XmlElement(nillable = true)
    protected String compId;

    /**
     * Gets the value of the sessionInfo property.
     * 
     * @return
     *     possible object is
     *     {@link SessionInfo }
     *     
     */
    public SessionInfo getSessionInfo() {
        return sessionInfo;
    }

    /**
     * Sets the value of the sessionInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link SessionInfo }
     *     
     */
    public void setSessionInfo(SessionInfo value) {
        this.sessionInfo = value;
    }

    /**
     * Gets the value of the contRep property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContRep() {
        return contRep;
    }

    /**
     * Sets the value of the contRep property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContRep(String value) {
        this.contRep = value;
    }

    /**
     * Gets the value of the docId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDocId() {
        return docId;
    }

    /**
     * Sets the value of the docId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDocId(String value) {
        this.docId = value;
    }

    /**
     * Gets the value of the compId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCompId() {
        return compId;
    }

    /**
     * Sets the value of the compId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCompId(String value) {
        this.compId = value;
    }

}
