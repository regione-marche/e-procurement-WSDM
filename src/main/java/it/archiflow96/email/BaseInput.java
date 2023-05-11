
package it.archiflow96.email;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BaseInput complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BaseInput">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SessionInfo" type="{http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Login.ValueObject}SessionInfo"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BaseInput", namespace = "http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities", propOrder = {
    "sessionInfo"
})
@XmlSeeAlso({
    DeleteMailServerInput.class,
    InsModProxyInput.class,
    SendFolderByExternalMailInput.class,
    GetEmailAttInChunkInput.class,
    SendExtendedMailInput.class,
    GetProxiesInput.class,
    GetCustomMailFieldsInput.class,
    SendExternalMailInput.class,
    GetMailBoxesInput.class,
    DeleteMailBoxInput.class,
    StoreEmailInput.class,
    SendEMailMsgInput.class,
    InsModMailServerInput.class,
    GetMailServersInput.class,
    RemoveEmailsInput.class,
    SetMailboxPasswordsInput.class,
    GetExtMailSettingsInput.class,
    DeleteProxyInput.class,
    GetIndexesToStoreEmailInput.class,
    InsModMailBoxInput.class,
    SendHiddenExtEMailInput.class,
    TestMailboxConnectionInput.class,
    RetrieveEmailsInput.class,
    RetrieveEmailInput.class
})
public class BaseInput {

    @XmlElement(name = "SessionInfo", required = true, nillable = true)
    protected SessionInfo sessionInfo;

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

}
