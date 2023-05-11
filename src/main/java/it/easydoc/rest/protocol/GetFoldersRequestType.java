
package it.easydoc.rest.protocol;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetFoldersRequestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetFoldersRequestType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.consorziocsa.it/easydoc/ws}ProtocollerUserProtocolServiceRequest">
 *       &lt;sequence>
 *         &lt;element name="AooCode" type="{http://www.consorziocsa.it/easydoc/ws}CodeType"/>
 *         &lt;element name="ArchiveType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="DomainCode" type="{http://www.consorziocsa.it/easydoc/ws}CodeType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetFoldersRequestType", propOrder = {
    "aooCode",
    "archiveType",
    "domainCode"
})
public class GetFoldersRequestType
    extends ProtocollerUserProtocolServiceRequest
{

    @XmlElement(name = "AooCode", required = true)
    protected String aooCode;
    @XmlElement(name = "ArchiveType", required = true)
    protected String archiveType;
    @XmlElement(name = "DomainCode")
    protected String domainCode;

    /**
     * Gets the value of the aooCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAooCode() {
        return aooCode;
    }

    /**
     * Sets the value of the aooCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAooCode(String value) {
        this.aooCode = value;
    }

    /**
     * Gets the value of the archiveType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getArchiveType() {
        return archiveType;
    }

    /**
     * Sets the value of the archiveType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setArchiveType(String value) {
        this.archiveType = value;
    }

    /**
     * Gets the value of the domainCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDomainCode() {
        return domainCode;
    }

    /**
     * Sets the value of the domainCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDomainCode(String value) {
        this.domainCode = value;
    }

}
