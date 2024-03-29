
package it.easydoc.rest.protocol;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ProtocollerUserProtocolServiceRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ProtocollerUserProtocolServiceRequest">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.consorziocsa.it/easydoc/ws}RoledUserProtocolServiceRequest">
 *       &lt;sequence>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProtocollerUserProtocolServiceRequest")
@XmlSeeAlso({
    GetUsersDomainRequestType.class,
    GetChannelsRequestType.class,
    GetMetadatasRequestType.class,
    GetUsersCompanyRequestType.class,
    GetFoldersRequestType.class,
    GetCompaniesRequestType.class
})
public abstract class ProtocollerUserProtocolServiceRequest
    extends RoledUserProtocolServiceRequest
{


}
