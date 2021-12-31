package it.abletech.arxivar.login;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;

/**
 * This class was generated by Apache CXF 2.7.10
 * 2015-01-29T17:05:53.801+01:00
 * Generated source version: 2.7.10
 * 
 */
@WebService(targetNamespace = "http://www.Abletech.it/Arxivar", name = "ARX_LoginHttpGet")
@XmlSeeAlso({ObjectFactory.class})
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
public interface ARXLoginHttpGet {

    @WebResult(name = "boolean", targetNamespace = "http://www.Abletech.it/Arxivar", partName = "Body")
    @WebMethod(operationName = "ChangePasswordRequired")
    public boolean changePasswordRequired(
        @WebParam(partName = "sessionId", name = "sessionId", targetNamespace = "http://www.Abletech.it/Arxivar")
        java.lang.String sessionId
    );

    @WebResult(name = "boolean", targetNamespace = "http://www.Abletech.it/Arxivar", partName = "Body")
    @WebMethod(operationName = "Impersonate_By_UserId")
    public boolean impersonateByUserId(
        @WebParam(partName = "sessionId", name = "sessionId", targetNamespace = "http://www.Abletech.it/Arxivar")
        java.lang.String sessionId,
        @WebParam(partName = "userId", name = "userId", targetNamespace = "http://www.Abletech.it/Arxivar")
        java.lang.String userId
    );

    @WebResult(name = "LoginModel", targetNamespace = "http://www.Abletech.it/Arxivar", partName = "Body")
    @WebMethod(operationName = "Login_with_SoftwareType")
    public LoginModel loginWithSoftwareType(
        @WebParam(partName = "userName", name = "userName", targetNamespace = "http://www.Abletech.it/Arxivar")
        java.lang.String userName,
        @WebParam(partName = "password", name = "password", targetNamespace = "http://www.Abletech.it/Arxivar")
        java.lang.String password,
        @WebParam(partName = "lang", name = "lang", targetNamespace = "http://www.Abletech.it/Arxivar")
        java.lang.String lang,
        @WebParam(partName = "softwareType", name = "softwareType", targetNamespace = "http://www.Abletech.it/Arxivar")
        java.lang.String softwareType,
        @WebParam(partName = "softwareKey", name = "softwareKey", targetNamespace = "http://www.Abletech.it/Arxivar")
        java.lang.String softwareKey
    );

    @WebResult(name = "boolean", targetNamespace = "http://www.Abletech.it/Arxivar", partName = "Body")
    @WebMethod(operationName = "LogOut")
    public boolean logOut(
        @WebParam(partName = "sessionId", name = "sessionId", targetNamespace = "http://www.Abletech.it/Arxivar")
        java.lang.String sessionId
    );

    @WebResult(name = "boolean", targetNamespace = "http://www.Abletech.it/Arxivar", partName = "Body")
    @WebMethod(operationName = "IsActive")
    public boolean isActive(
        @WebParam(partName = "sessionId", name = "sessionId", targetNamespace = "http://www.Abletech.it/Arxivar")
        java.lang.String sessionId
    );

    @WebResult(name = "ArrayOfArxLicensingModule", targetNamespace = "http://www.Abletech.it/Arxivar", partName = "Body")
    @WebMethod(operationName = "GetUsedLicense")
    public ArrayOfArxLicensingModule getUsedLicense(
        @WebParam(partName = "sessionId", name = "sessionId", targetNamespace = "http://www.Abletech.it/Arxivar")
        java.lang.String sessionId
    );

    @WebResult(name = "LoginModel", targetNamespace = "http://www.Abletech.it/Arxivar", partName = "Body")
    @WebMethod(operationName = "Login_with_SoftwareType_For_Device")
    public LoginModel loginWithSoftwareTypeForDevice(
        @WebParam(partName = "userName", name = "userName", targetNamespace = "http://www.Abletech.it/Arxivar")
        java.lang.String userName,
        @WebParam(partName = "password", name = "password", targetNamespace = "http://www.Abletech.it/Arxivar")
        java.lang.String password,
        @WebParam(partName = "lang", name = "lang", targetNamespace = "http://www.Abletech.it/Arxivar")
        java.lang.String lang,
        @WebParam(partName = "softwareType", name = "softwareType", targetNamespace = "http://www.Abletech.it/Arxivar")
        java.lang.String softwareType,
        @WebParam(partName = "softwareKey", name = "softwareKey", targetNamespace = "http://www.Abletech.it/Arxivar")
        java.lang.String softwareKey,
        @WebParam(partName = "deviceId", name = "deviceId", targetNamespace = "http://www.Abletech.it/Arxivar")
        java.lang.String deviceId
    );

    @WebResult(name = "Dm_UtentiBase", targetNamespace = "http://www.Abletech.it/Arxivar", partName = "Body")
    @WebMethod(operationName = "GetInfoUserImpersonated")
    public DmUtentiBase getInfoUserImpersonated(
        @WebParam(partName = "sessionId", name = "sessionId", targetNamespace = "http://www.Abletech.it/Arxivar")
        java.lang.String sessionId
    );

    @WebResult(name = "boolean", targetNamespace = "http://www.Abletech.it/Arxivar", partName = "Body")
    @WebMethod(operationName = "Impersonate_By_UserName")
    public boolean impersonateByUserName(
        @WebParam(partName = "sessionId", name = "sessionId", targetNamespace = "http://www.Abletech.it/Arxivar")
        java.lang.String sessionId,
        @WebParam(partName = "userName", name = "userName", targetNamespace = "http://www.Abletech.it/Arxivar")
        java.lang.String userName
    );

    @WebResult(name = "boolean", targetNamespace = "http://www.Abletech.it/Arxivar", partName = "Body")
    @WebMethod(operationName = "AutoChunk")
    public boolean autoChunk(
        @WebParam(partName = "sessionId", name = "sessionId", targetNamespace = "http://www.Abletech.it/Arxivar")
        java.lang.String sessionId,
        @WebParam(partName = "enable", name = "enable", targetNamespace = "http://www.Abletech.it/Arxivar")
        java.lang.String enable
    );

    @WebResult(name = "boolean", targetNamespace = "http://www.Abletech.it/Arxivar", partName = "Body")
    @WebMethod(operationName = "Impersonate_By_ExternalId")
    public boolean impersonateByExternalId(
        @WebParam(partName = "sessionId", name = "sessionId", targetNamespace = "http://www.Abletech.it/Arxivar")
        java.lang.String sessionId,
        @WebParam(partName = "externalId", name = "externalId", targetNamespace = "http://www.Abletech.it/Arxivar")
        java.lang.String externalId
    );

    @WebMethod(operationName = "LockAoo")
    public void lockAoo(
        @WebParam(partName = "sessionId", name = "sessionId", targetNamespace = "http://www.Abletech.it/Arxivar")
        java.lang.String sessionId,
        @WebParam(partName = "aoo", name = "aoo", targetNamespace = "http://www.Abletech.it/Arxivar")
        java.lang.String aoo
    );

    @WebResult(name = "Dm_Utenti", targetNamespace = "http://www.Abletech.it/Arxivar", partName = "Body")
    @WebMethod(operationName = "GetInfoUserConnected")
    public DmUtenti getInfoUserConnected(
        @WebParam(partName = "sessionId", name = "sessionId", targetNamespace = "http://www.Abletech.it/Arxivar")
        java.lang.String sessionId
    );

    @WebResult(name = "LoginModel", targetNamespace = "http://www.Abletech.it/Arxivar", partName = "Body")
    @WebMethod(operationName = "Login_with_language_For_Device")
    public LoginModel loginWithLanguageForDevice(
        @WebParam(partName = "userName", name = "userName", targetNamespace = "http://www.Abletech.it/Arxivar")
        java.lang.String userName,
        @WebParam(partName = "password", name = "password", targetNamespace = "http://www.Abletech.it/Arxivar")
        java.lang.String password,
        @WebParam(partName = "lang", name = "lang", targetNamespace = "http://www.Abletech.it/Arxivar")
        java.lang.String lang,
        @WebParam(partName = "softwareName", name = "softwareName", targetNamespace = "http://www.Abletech.it/Arxivar")
        java.lang.String softwareName,
        @WebParam(partName = "deviceId", name = "deviceId", targetNamespace = "http://www.Abletech.it/Arxivar")
        java.lang.String deviceId
    );

    @WebResult(name = "LoginModel", targetNamespace = "http://www.Abletech.it/Arxivar", partName = "Body")
    @WebMethod(operationName = "Login_with_language")
    public LoginModel loginWithLanguage(
        @WebParam(partName = "userName", name = "userName", targetNamespace = "http://www.Abletech.it/Arxivar")
        java.lang.String userName,
        @WebParam(partName = "password", name = "password", targetNamespace = "http://www.Abletech.it/Arxivar")
        java.lang.String password,
        @WebParam(partName = "lang", name = "lang", targetNamespace = "http://www.Abletech.it/Arxivar")
        java.lang.String lang,
        @WebParam(partName = "softwareName", name = "softwareName", targetNamespace = "http://www.Abletech.it/Arxivar")
        java.lang.String softwareName
    );

    @WebResult(name = "boolean", targetNamespace = "http://www.Abletech.it/Arxivar", partName = "Body")
    @WebMethod(operationName = "DeImpersonate")
    public boolean deImpersonate(
        @WebParam(partName = "sessionId", name = "sessionId", targetNamespace = "http://www.Abletech.it/Arxivar")
        java.lang.String sessionId
    );

    @WebResult(name = "boolean", targetNamespace = "http://www.Abletech.it/Arxivar", partName = "Body")
    @WebMethod(operationName = "Impersonate_By_WindowsUsername")
    public boolean impersonateByWindowsUsername(
        @WebParam(partName = "sessionId", name = "sessionId", targetNamespace = "http://www.Abletech.it/Arxivar")
        java.lang.String sessionId,
        @WebParam(partName = "windowsUsername", name = "windowsUsername", targetNamespace = "http://www.Abletech.it/Arxivar")
        java.lang.String windowsUsername
    );

    @WebResult(name = "LoginModel", targetNamespace = "http://www.Abletech.it/Arxivar", partName = "Body")
    @WebMethod(operationName = "Login")
    public LoginModel login(
        @WebParam(partName = "userName", name = "userName", targetNamespace = "http://www.Abletech.it/Arxivar")
        java.lang.String userName,
        @WebParam(partName = "password", name = "password", targetNamespace = "http://www.Abletech.it/Arxivar")
        java.lang.String password,
        @WebParam(partName = "softwareName", name = "softwareName", targetNamespace = "http://www.Abletech.it/Arxivar")
        java.lang.String softwareName
    );

    @WebResult(name = "boolean", targetNamespace = "http://www.Abletech.it/Arxivar", partName = "Body")
    @WebMethod(operationName = "AooLocked")
    public boolean aooLocked(
        @WebParam(partName = "sessionId", name = "sessionId", targetNamespace = "http://www.Abletech.it/Arxivar")
        java.lang.String sessionId
    );
}
