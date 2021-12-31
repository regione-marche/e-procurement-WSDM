
package it.archiflow96;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DomainType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="DomainType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="WF_UNDEFINED"/>
 *     &lt;enumeration value="WF_NTUSER"/>
 *     &lt;enumeration value="WF_NTMACHINE"/>
 *     &lt;enumeration value="WF_NTGROUP"/>
 *     &lt;enumeration value="WF_NTDOMAIN"/>
 *     &lt;enumeration value="WF_NETWORK"/>
 *     &lt;enumeration value="WF_ARC_USER"/>
 *     &lt;enumeration value="WF_ARC_GROUP"/>
 *     &lt;enumeration value="WF_ARC_OFFICE"/>
 *     &lt;enumeration value="WF_ADSI_NAMESPACE"/>
 *     &lt;enumeration value="WF_LDAP_DOMAIN"/>
 *     &lt;enumeration value="WF_LDAP_OU"/>
 *     &lt;enumeration value="WF_LDAP_CONTAINER"/>
 *     &lt;enumeration value="WF_LDAP_GROUP"/>
 *     &lt;enumeration value="WF_LDAP_USER"/>
 *     &lt;enumeration value="WF_WINNT_USER"/>
 *     &lt;enumeration value="WF_WINNT_GROUP"/>
 *     &lt;enumeration value="WF_WINNT_DOMAIN"/>
 *     &lt;enumeration value="WF_AOL_USER"/>
 *     &lt;enumeration value="WF_AOL_GROUP"/>
 *     &lt;enumeration value="WF_AOL_OFFICE"/>
 *     &lt;enumeration value="WF_AOL_USER_SUPERVISOR"/>
 *     &lt;enumeration value="WF_AOL_USER_ADMINISTRATOR"/>
 *     &lt;enumeration value="WF_NTDOMAIN_USERS"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "DomainType", namespace = "http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Types")
@XmlEnum
public enum DomainType {

    WF_UNDEFINED,
    WF_NTUSER,
    WF_NTMACHINE,
    WF_NTGROUP,
    WF_NTDOMAIN,
    WF_NETWORK,
    WF_ARC_USER,
    WF_ARC_GROUP,
    WF_ARC_OFFICE,
    WF_ADSI_NAMESPACE,
    WF_LDAP_DOMAIN,
    WF_LDAP_OU,
    WF_LDAP_CONTAINER,
    WF_LDAP_GROUP,
    WF_LDAP_USER,
    WF_WINNT_USER,
    WF_WINNT_GROUP,
    WF_WINNT_DOMAIN,
    WF_AOL_USER,
    WF_AOL_GROUP,
    WF_AOL_OFFICE,
    WF_AOL_USER_SUPERVISOR,
    WF_AOL_USER_ADMINISTRATOR,
    WF_NTDOMAIN_USERS;

    public String value() {
        return name();
    }

    public static DomainType fromValue(String v) {
        return valueOf(v);
    }

}
