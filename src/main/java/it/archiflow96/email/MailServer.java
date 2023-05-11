
package it.archiflow96.email;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MailServer complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MailServer">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AnonymousAccess" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="AuthMechanism" type="{http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Types}AuthMechanism" minOccurs="0"/>
 *         &lt;element name="Id" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="IsPEC" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PECRecType" type="{http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Types}PECReceiptType" minOccurs="0"/>
 *         &lt;element name="Port" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="Protocol" type="{http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Types}MailServerProtocol" minOccurs="0"/>
 *         &lt;element name="ProxyId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="SSLStartMode" type="{http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Types}SSLStartModes" minOccurs="0"/>
 *         &lt;element name="Server" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UrlWS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MailServer", namespace = "http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.MailBox.ValueObject", propOrder = {
    "anonymousAccess",
    "authMechanism",
    "id",
    "isPEC",
    "name",
    "pecRecType",
    "port",
    "protocol",
    "proxyId",
    "sslStartMode",
    "server",
    "urlWS"
})
public class MailServer {

    @XmlElement(name = "AnonymousAccess")
    protected Boolean anonymousAccess;
    @XmlElement(name = "AuthMechanism")
    protected AuthMechanism authMechanism;
    @XmlElement(name = "Id")
    protected Integer id;
    @XmlElement(name = "IsPEC")
    protected Boolean isPEC;
    @XmlElement(name = "Name", nillable = true)
    protected String name;
    @XmlElement(name = "PECRecType")
    protected PECReceiptType pecRecType;
    @XmlElement(name = "Port")
    protected Integer port;
    @XmlElement(name = "Protocol")
    protected MailServerProtocol protocol;
    @XmlElement(name = "ProxyId")
    protected Integer proxyId;
    @XmlElement(name = "SSLStartMode")
    protected SSLStartModes sslStartMode;
    @XmlElement(name = "Server", nillable = true)
    protected String server;
    @XmlElement(name = "UrlWS", nillable = true)
    protected String urlWS;

    /**
     * Gets the value of the anonymousAccess property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAnonymousAccess() {
        return anonymousAccess;
    }

    /**
     * Sets the value of the anonymousAccess property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAnonymousAccess(Boolean value) {
        this.anonymousAccess = value;
    }

    /**
     * Gets the value of the authMechanism property.
     * 
     * @return
     *     possible object is
     *     {@link AuthMechanism }
     *     
     */
    public AuthMechanism getAuthMechanism() {
        return authMechanism;
    }

    /**
     * Sets the value of the authMechanism property.
     * 
     * @param value
     *     allowed object is
     *     {@link AuthMechanism }
     *     
     */
    public void setAuthMechanism(AuthMechanism value) {
        this.authMechanism = value;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setId(Integer value) {
        this.id = value;
    }

    /**
     * Gets the value of the isPEC property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsPEC() {
        return isPEC;
    }

    /**
     * Sets the value of the isPEC property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsPEC(Boolean value) {
        this.isPEC = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the pecRecType property.
     * 
     * @return
     *     possible object is
     *     {@link PECReceiptType }
     *     
     */
    public PECReceiptType getPECRecType() {
        return pecRecType;
    }

    /**
     * Sets the value of the pecRecType property.
     * 
     * @param value
     *     allowed object is
     *     {@link PECReceiptType }
     *     
     */
    public void setPECRecType(PECReceiptType value) {
        this.pecRecType = value;
    }

    /**
     * Gets the value of the port property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPort() {
        return port;
    }

    /**
     * Sets the value of the port property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPort(Integer value) {
        this.port = value;
    }

    /**
     * Gets the value of the protocol property.
     * 
     * @return
     *     possible object is
     *     {@link MailServerProtocol }
     *     
     */
    public MailServerProtocol getProtocol() {
        return protocol;
    }

    /**
     * Sets the value of the protocol property.
     * 
     * @param value
     *     allowed object is
     *     {@link MailServerProtocol }
     *     
     */
    public void setProtocol(MailServerProtocol value) {
        this.protocol = value;
    }

    /**
     * Gets the value of the proxyId property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getProxyId() {
        return proxyId;
    }

    /**
     * Sets the value of the proxyId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setProxyId(Integer value) {
        this.proxyId = value;
    }

    /**
     * Gets the value of the sslStartMode property.
     * 
     * @return
     *     possible object is
     *     {@link SSLStartModes }
     *     
     */
    public SSLStartModes getSSLStartMode() {
        return sslStartMode;
    }

    /**
     * Sets the value of the sslStartMode property.
     * 
     * @param value
     *     allowed object is
     *     {@link SSLStartModes }
     *     
     */
    public void setSSLStartMode(SSLStartModes value) {
        this.sslStartMode = value;
    }

    /**
     * Gets the value of the server property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServer() {
        return server;
    }

    /**
     * Sets the value of the server property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServer(String value) {
        this.server = value;
    }

    /**
     * Gets the value of the urlWS property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUrlWS() {
        return urlWS;
    }

    /**
     * Sets the value of the urlWS property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUrlWS(String value) {
        this.urlWS = value;
    }

}
