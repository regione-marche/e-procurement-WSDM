
package it.abletech.arxivar.login;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArxLogOnErrorType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ArxLogOnErrorType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="None"/>
 *     &lt;enumeration value="Wrong_UserName_Or_Password"/>
 *     &lt;enumeration value="Timeout"/>
 *     &lt;enumeration value="SoftwareName_Empty"/>
 *     &lt;enumeration value="License"/>
 *     &lt;enumeration value="Generic"/>
 *     &lt;enumeration value="BundleNameNotRecognized"/>
 *     &lt;enumeration value="BundleValidationFailed"/>
 *     &lt;enumeration value="PluginServerOnBeforeLoginFailed"/>
 *     &lt;enumeration value="PluginServerOnAfterLoginFailed"/>
 *     &lt;enumeration value="LogonProviderAssociationMissing"/>
 *     &lt;enumeration value="LogonProviderAssociationFailed"/>
 *     &lt;enumeration value="LogonWithTokenFailed"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ArxLogOnErrorType")
@XmlEnum
public enum ArxLogOnErrorType {

    @XmlEnumValue("None")
    NONE("None"),
    @XmlEnumValue("Wrong_UserName_Or_Password")
    WRONG_USER_NAME_OR_PASSWORD("Wrong_UserName_Or_Password"),
    @XmlEnumValue("Timeout")
    TIMEOUT("Timeout"),
    @XmlEnumValue("SoftwareName_Empty")
    SOFTWARE_NAME_EMPTY("SoftwareName_Empty"),
    @XmlEnumValue("License")
    LICENSE("License"),
    @XmlEnumValue("Generic")
    GENERIC("Generic"),
    @XmlEnumValue("BundleNameNotRecognized")
    BUNDLE_NAME_NOT_RECOGNIZED("BundleNameNotRecognized"),
    @XmlEnumValue("BundleValidationFailed")
    BUNDLE_VALIDATION_FAILED("BundleValidationFailed"),
    @XmlEnumValue("PluginServerOnBeforeLoginFailed")
    PLUGIN_SERVER_ON_BEFORE_LOGIN_FAILED("PluginServerOnBeforeLoginFailed"),
    @XmlEnumValue("PluginServerOnAfterLoginFailed")
    PLUGIN_SERVER_ON_AFTER_LOGIN_FAILED("PluginServerOnAfterLoginFailed"),
    @XmlEnumValue("LogonProviderAssociationMissing")
    LOGON_PROVIDER_ASSOCIATION_MISSING("LogonProviderAssociationMissing"),
    @XmlEnumValue("LogonProviderAssociationFailed")
    LOGON_PROVIDER_ASSOCIATION_FAILED("LogonProviderAssociationFailed"),
    @XmlEnumValue("LogonWithTokenFailed")
    LOGON_WITH_TOKEN_FAILED("LogonWithTokenFailed");
    private final String value;

    ArxLogOnErrorType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ArxLogOnErrorType fromValue(String v) {
        for (ArxLogOnErrorType c: ArxLogOnErrorType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
