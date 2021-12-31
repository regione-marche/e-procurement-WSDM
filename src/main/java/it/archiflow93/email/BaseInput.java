
package it.archiflow93.email;

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
    DeleteMailBoxInput.class,
    SetMailboxPasswordsInput.class,
    GetEmailAttInChunkInput.class,
    InsModMailBoxInput.class,
    SendHiddenExtEMailInput.class,
    SendExternalMailInput.class,
    DeleteProxyInput.class,
    RemoveEmailsInput.class,
    GetMailServersInput.class,
    GetExtMailSettingsInput.class,
    RetrieveEmailInput.class,
    GetIndexesToStoreEmailInput.class,
    GetCustomMailFieldsInput.class,
    DeleteMailServerInput.class,
    GetMailBoxesInput.class,
    SendExtendedMailInput.class,
    InsModProxyInput.class,
    TestMailboxConnectionInput.class,
    StoreEmailInput.class,
    GetProxiesInput.class,
    RetrieveEmailsInput.class,
    SendEMailMsgInput.class,
    InsModMailServerInput.class,
    SendFolderByExternalMailInput.class
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
