
package it.archiflow96;

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
 *         &lt;element name="sessionId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="docTypeId" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/>
 *         &lt;element name="archiveIds" type="{http://schemas.microsoft.com/2003/10/Serialization/Arrays}ArrayOfshort" minOccurs="0"/>
 *         &lt;element name="accessLevel" type="{http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Types}AccessLevel" minOccurs="0"/>
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
    "docTypeId",
    "archiveIds",
    "accessLevel"
})
@XmlRootElement(name = "GetDocTypesSameFields")
public class GetDocTypesSameFields {

    @XmlElement(nillable = true)
    protected String sessionId;
    protected Short docTypeId;
    @XmlElement(nillable = true)
    protected ArrayOfshort archiveIds;
    protected AccessLevel accessLevel;

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
     * Gets the value of the docTypeId property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getDocTypeId() {
        return docTypeId;
    }

    /**
     * Sets the value of the docTypeId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setDocTypeId(Short value) {
        this.docTypeId = value;
    }

    /**
     * Gets the value of the archiveIds property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfshort }
     *     
     */
    public ArrayOfshort getArchiveIds() {
        return archiveIds;
    }

    /**
     * Sets the value of the archiveIds property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfshort }
     *     
     */
    public void setArchiveIds(ArrayOfshort value) {
        this.archiveIds = value;
    }

    /**
     * Gets the value of the accessLevel property.
     * 
     * @return
     *     possible object is
     *     {@link AccessLevel }
     *     
     */
    public AccessLevel getAccessLevel() {
        return accessLevel;
    }

    /**
     * Sets the value of the accessLevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccessLevel }
     *     
     */
    public void setAccessLevel(AccessLevel value) {
        this.accessLevel = value;
    }

}
