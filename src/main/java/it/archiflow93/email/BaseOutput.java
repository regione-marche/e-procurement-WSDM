
package it.archiflow93.email;

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
    SendExtendedMailOutput.class,
    TestMailboxConnectionOutput.class,
    InsModMailServerOutput.class,
    GetExtMailSettingsOutput.class,
    GetEmailAttInChunkOutput.class,
    RetrieveEmailsOutput.class,
    GetProxiesOutput.class,
    DeleteProxyOutput.class,
    SendFolderByExternalMailOutput.class,
    DeleteMailServerOutput.class,
    RetrieveEmailOutput.class,
    GetMailBoxesOutput.class,
    StoreEmailOutput.class,
    DeleteMailBoxOutput.class,
    RemoveEmailsOutput.class,
    InsModMailBoxOutput.class,
    GetMailServersOutput.class,
    SetMailboxPasswordsOutput.class,
    InsModProxyOutput.class,
    SendExternalMailOutput.class,
    SendHiddenExtEMailOutput.class,
    SendEMailMsgOutput.class,
    GetCustomMailFieldsOutput.class,
    GetIndexesToStoreEmailOutput.class
})
public class BaseOutput {


}
