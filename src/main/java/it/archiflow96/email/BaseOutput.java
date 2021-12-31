
package it.archiflow96.email;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BaseOutput complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BaseOutput">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BaseOutput", namespace = "http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities")
@XmlSeeAlso({
    SendHiddenExtEMailOutput.class,
    GetIndexesToStoreEmailOutput.class,
    InsModProxyOutput.class,
    TestMailboxConnectionOutput.class,
    SetMailboxPasswordsOutput.class,
    SendExtendedMailOutput.class,
    SendFolderByExternalMailOutput.class,
    DeleteMailServerOutput.class,
    RetrieveEmailsOutput.class,
    GetEmailAttInChunkOutput.class,
    InsModMailServerOutput.class,
    DeleteProxyOutput.class,
    SendEMailMsgOutput.class,
    RemoveEmailsOutput.class,
    InsModMailBoxOutput.class,
    SendExternalMailOutput.class,
    GetMailServersOutput.class,
    GetMailBoxesOutput.class,
    RetrieveEmailOutput.class,
    GetProxiesOutput.class,
    DeleteMailBoxOutput.class,
    GetExtMailSettingsOutput.class,
    GetCustomMailFieldsOutput.class,
    StoreEmailOutput.class
})
public class BaseOutput {


}
