package it.abletech.arxivar.login;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 2.7.10
 * 2015-01-29T17:05:53.751+01:00
 * Generated source version: 2.7.10
 * 
 */
@WebService(targetNamespace = "http://www.Abletech.it/Arxivar", name = "ARX_LoginSoap")
@XmlSeeAlso({ObjectFactory.class})
public interface ARXLoginSoap {

    @WebResult(name = "ChangePasswordRequiredResult", targetNamespace = "http://www.Abletech.it/Arxivar")
    @RequestWrapper(localName = "ChangePasswordRequired", targetNamespace = "http://www.Abletech.it/Arxivar", className = "it.abletech.arxivar.login.ChangePasswordRequired")
    @WebMethod(operationName = "ChangePasswordRequired", action = "http://www.Abletech.it/Arxivar/ChangePasswordRequired")
    @ResponseWrapper(localName = "ChangePasswordRequiredResponse", targetNamespace = "http://www.Abletech.it/Arxivar", className = "it.abletech.arxivar.login.ChangePasswordRequiredResponse")
    public boolean changePasswordRequired(
        @WebParam(name = "sessionId", targetNamespace = "http://www.Abletech.it/Arxivar")
        java.lang.String sessionId
    );

    @WebResult(name = "Impersonate_By_UserIdResult", targetNamespace = "http://www.Abletech.it/Arxivar")
    @RequestWrapper(localName = "Impersonate_By_UserId", targetNamespace = "http://www.Abletech.it/Arxivar", className = "it.abletech.arxivar.login.ImpersonateByUserId")
    @WebMethod(operationName = "Impersonate_By_UserId", action = "http://www.Abletech.it/Arxivar/Impersonate_By_UserId")
    @ResponseWrapper(localName = "Impersonate_By_UserIdResponse", targetNamespace = "http://www.Abletech.it/Arxivar", className = "it.abletech.arxivar.login.ImpersonateByUserIdResponse")
    public boolean impersonateByUserId(
        @WebParam(name = "sessionId", targetNamespace = "http://www.Abletech.it/Arxivar")
        java.lang.String sessionId,
        @WebParam(name = "userId", targetNamespace = "http://www.Abletech.it/Arxivar")
        int userId
    );

    @WebResult(name = "Login_with_SoftwareTypeResult", targetNamespace = "http://www.Abletech.it/Arxivar")
    @RequestWrapper(localName = "Login_with_SoftwareType", targetNamespace = "http://www.Abletech.it/Arxivar", className = "it.abletech.arxivar.login.LoginWithSoftwareType")
    @WebMethod(operationName = "Login_with_SoftwareType", action = "http://www.Abletech.it/Arxivar/Login_with_SoftwareType")
    @ResponseWrapper(localName = "Login_with_SoftwareTypeResponse", targetNamespace = "http://www.Abletech.it/Arxivar", className = "it.abletech.arxivar.login.LoginWithSoftwareTypeResponse")
    public it.abletech.arxivar.login.LoginModel loginWithSoftwareType(
        @WebParam(name = "userName", targetNamespace = "http://www.Abletech.it/Arxivar")
        java.lang.String userName,
        @WebParam(name = "password", targetNamespace = "http://www.Abletech.it/Arxivar")
        java.lang.String password,
        @WebParam(name = "lang", targetNamespace = "http://www.Abletech.it/Arxivar")
        java.lang.String lang,
        @WebParam(name = "softwareType", targetNamespace = "http://www.Abletech.it/Arxivar")
        java.lang.String softwareType,
        @WebParam(name = "softwareKey", targetNamespace = "http://www.Abletech.it/Arxivar")
        java.lang.String softwareKey
    );

    @WebResult(name = "LogOutResult", targetNamespace = "http://www.Abletech.it/Arxivar")
    @RequestWrapper(localName = "LogOut", targetNamespace = "http://www.Abletech.it/Arxivar", className = "it.abletech.arxivar.login.LogOut")
    @WebMethod(operationName = "LogOut", action = "http://www.Abletech.it/Arxivar/LogOut")
    @ResponseWrapper(localName = "LogOutResponse", targetNamespace = "http://www.Abletech.it/Arxivar", className = "it.abletech.arxivar.login.LogOutResponse")
    public boolean logOut(
        @WebParam(name = "sessionId", targetNamespace = "http://www.Abletech.it/Arxivar")
        java.lang.String sessionId
    );

    @WebResult(name = "IsActiveResult", targetNamespace = "http://www.Abletech.it/Arxivar")
    @RequestWrapper(localName = "IsActive", targetNamespace = "http://www.Abletech.it/Arxivar", className = "it.abletech.arxivar.login.IsActive")
    @WebMethod(operationName = "IsActive", action = "http://www.Abletech.it/Arxivar/IsActive")
    @ResponseWrapper(localName = "IsActiveResponse", targetNamespace = "http://www.Abletech.it/Arxivar", className = "it.abletech.arxivar.login.IsActiveResponse")
    public boolean isActive(
        @WebParam(name = "sessionId", targetNamespace = "http://www.Abletech.it/Arxivar")
        java.lang.String sessionId
    );

    @WebResult(name = "GetUsedLicenseResult", targetNamespace = "http://www.Abletech.it/Arxivar")
    @RequestWrapper(localName = "GetUsedLicense", targetNamespace = "http://www.Abletech.it/Arxivar", className = "it.abletech.arxivar.login.GetUsedLicense")
    @WebMethod(operationName = "GetUsedLicense", action = "http://www.Abletech.it/Arxivar/GetUsedLicense")
    @ResponseWrapper(localName = "GetUsedLicenseResponse", targetNamespace = "http://www.Abletech.it/Arxivar", className = "it.abletech.arxivar.login.GetUsedLicenseResponse")
    public it.abletech.arxivar.login.ArrayOfArxLicensingModule getUsedLicense(
        @WebParam(name = "sessionId", targetNamespace = "http://www.Abletech.it/Arxivar")
        java.lang.String sessionId
    );

    @WebResult(name = "Login_with_SoftwareType_For_DeviceResult", targetNamespace = "http://www.Abletech.it/Arxivar")
    @RequestWrapper(localName = "Login_with_SoftwareType_For_Device", targetNamespace = "http://www.Abletech.it/Arxivar", className = "it.abletech.arxivar.login.LoginWithSoftwareTypeForDevice")
    @WebMethod(operationName = "Login_with_SoftwareType_For_Device", action = "http://www.Abletech.it/Arxivar/Login_with_SoftwareType_For_Device")
    @ResponseWrapper(localName = "Login_with_SoftwareType_For_DeviceResponse", targetNamespace = "http://www.Abletech.it/Arxivar", className = "it.abletech.arxivar.login.LoginWithSoftwareTypeForDeviceResponse")
    public it.abletech.arxivar.login.LoginModel loginWithSoftwareTypeForDevice(
        @WebParam(name = "userName", targetNamespace = "http://www.Abletech.it/Arxivar")
        java.lang.String userName,
        @WebParam(name = "password", targetNamespace = "http://www.Abletech.it/Arxivar")
        java.lang.String password,
        @WebParam(name = "lang", targetNamespace = "http://www.Abletech.it/Arxivar")
        java.lang.String lang,
        @WebParam(name = "softwareType", targetNamespace = "http://www.Abletech.it/Arxivar")
        java.lang.String softwareType,
        @WebParam(name = "softwareKey", targetNamespace = "http://www.Abletech.it/Arxivar")
        java.lang.String softwareKey,
        @WebParam(name = "deviceId", targetNamespace = "http://www.Abletech.it/Arxivar")
        java.lang.String deviceId
    );

    @WebResult(name = "GetInfoUserImpersonatedResult", targetNamespace = "http://www.Abletech.it/Arxivar")
    @RequestWrapper(localName = "GetInfoUserImpersonated", targetNamespace = "http://www.Abletech.it/Arxivar", className = "it.abletech.arxivar.login.GetInfoUserImpersonated")
    @WebMethod(operationName = "GetInfoUserImpersonated", action = "http://www.Abletech.it/Arxivar/GetInfoUserImpersonated")
    @ResponseWrapper(localName = "GetInfoUserImpersonatedResponse", targetNamespace = "http://www.Abletech.it/Arxivar", className = "it.abletech.arxivar.login.GetInfoUserImpersonatedResponse")
    public it.abletech.arxivar.login.DmUtentiBase getInfoUserImpersonated(
        @WebParam(name = "sessionId", targetNamespace = "http://www.Abletech.it/Arxivar")
        java.lang.String sessionId
    );

    @WebResult(name = "Impersonate_By_UserNameResult", targetNamespace = "http://www.Abletech.it/Arxivar")
    @RequestWrapper(localName = "Impersonate_By_UserName", targetNamespace = "http://www.Abletech.it/Arxivar", className = "it.abletech.arxivar.login.ImpersonateByUserName")
    @WebMethod(operationName = "Impersonate_By_UserName", action = "http://www.Abletech.it/Arxivar/Impersonate_By_UserName")
    @ResponseWrapper(localName = "Impersonate_By_UserNameResponse", targetNamespace = "http://www.Abletech.it/Arxivar", className = "it.abletech.arxivar.login.ImpersonateByUserNameResponse")
    public boolean impersonateByUserName(
        @WebParam(name = "sessionId", targetNamespace = "http://www.Abletech.it/Arxivar")
        java.lang.String sessionId,
        @WebParam(name = "userName", targetNamespace = "http://www.Abletech.it/Arxivar")
        java.lang.String userName
    );

    @WebResult(name = "AutoChunkResult", targetNamespace = "http://www.Abletech.it/Arxivar")
    @RequestWrapper(localName = "AutoChunk", targetNamespace = "http://www.Abletech.it/Arxivar", className = "it.abletech.arxivar.login.AutoChunk")
    @WebMethod(operationName = "AutoChunk", action = "http://www.Abletech.it/Arxivar/AutoChunk")
    @ResponseWrapper(localName = "AutoChunkResponse", targetNamespace = "http://www.Abletech.it/Arxivar", className = "it.abletech.arxivar.login.AutoChunkResponse")
    public boolean autoChunk(
        @WebParam(name = "sessionId", targetNamespace = "http://www.Abletech.it/Arxivar")
        java.lang.String sessionId,
        @WebParam(name = "enable", targetNamespace = "http://www.Abletech.it/Arxivar")
        boolean enable
    );

    @WebResult(name = "Impersonate_By_ExternalIdResult", targetNamespace = "http://www.Abletech.it/Arxivar")
    @RequestWrapper(localName = "Impersonate_By_ExternalId", targetNamespace = "http://www.Abletech.it/Arxivar", className = "it.abletech.arxivar.login.ImpersonateByExternalId")
    @WebMethod(operationName = "Impersonate_By_ExternalId", action = "http://www.Abletech.it/Arxivar/Impersonate_By_ExternalId")
    @ResponseWrapper(localName = "Impersonate_By_ExternalIdResponse", targetNamespace = "http://www.Abletech.it/Arxivar", className = "it.abletech.arxivar.login.ImpersonateByExternalIdResponse")
    public boolean impersonateByExternalId(
        @WebParam(name = "sessionId", targetNamespace = "http://www.Abletech.it/Arxivar")
        java.lang.String sessionId,
        @WebParam(name = "externalId", targetNamespace = "http://www.Abletech.it/Arxivar")
        java.lang.String externalId
    );

    @RequestWrapper(localName = "LockAoo", targetNamespace = "http://www.Abletech.it/Arxivar", className = "it.abletech.arxivar.login.LockAoo")
    @WebMethod(operationName = "LockAoo", action = "http://www.Abletech.it/Arxivar/LockAoo")
    @ResponseWrapper(localName = "LockAooResponse", targetNamespace = "http://www.Abletech.it/Arxivar", className = "it.abletech.arxivar.login.LockAooResponse")
    public void lockAoo(
        @WebParam(name = "sessionId", targetNamespace = "http://www.Abletech.it/Arxivar")
        java.lang.String sessionId,
        @WebParam(name = "aoo", targetNamespace = "http://www.Abletech.it/Arxivar")
        java.lang.String aoo
    );

    @WebResult(name = "GetInfoUserConnectedResult", targetNamespace = "http://www.Abletech.it/Arxivar")
    @RequestWrapper(localName = "GetInfoUserConnected", targetNamespace = "http://www.Abletech.it/Arxivar", className = "it.abletech.arxivar.login.GetInfoUserConnected")
    @WebMethod(operationName = "GetInfoUserConnected", action = "http://www.Abletech.it/Arxivar/GetInfoUserConnected")
    @ResponseWrapper(localName = "GetInfoUserConnectedResponse", targetNamespace = "http://www.Abletech.it/Arxivar", className = "it.abletech.arxivar.login.GetInfoUserConnectedResponse")
    public it.abletech.arxivar.login.DmUtenti getInfoUserConnected(
        @WebParam(name = "sessionId", targetNamespace = "http://www.Abletech.it/Arxivar")
        java.lang.String sessionId
    );

    @WebResult(name = "Login_with_language_For_DeviceResult", targetNamespace = "http://www.Abletech.it/Arxivar")
    @RequestWrapper(localName = "Login_with_language_For_Device", targetNamespace = "http://www.Abletech.it/Arxivar", className = "it.abletech.arxivar.login.LoginWithLanguageForDevice")
    @WebMethod(operationName = "Login_with_language_For_Device", action = "http://www.Abletech.it/Arxivar/Login_with_language_For_Device")
    @ResponseWrapper(localName = "Login_with_language_For_DeviceResponse", targetNamespace = "http://www.Abletech.it/Arxivar", className = "it.abletech.arxivar.login.LoginWithLanguageForDeviceResponse")
    public it.abletech.arxivar.login.LoginModel loginWithLanguageForDevice(
        @WebParam(name = "userName", targetNamespace = "http://www.Abletech.it/Arxivar")
        java.lang.String userName,
        @WebParam(name = "password", targetNamespace = "http://www.Abletech.it/Arxivar")
        java.lang.String password,
        @WebParam(name = "lang", targetNamespace = "http://www.Abletech.it/Arxivar")
        java.lang.String lang,
        @WebParam(name = "softwareName", targetNamespace = "http://www.Abletech.it/Arxivar")
        java.lang.String softwareName,
        @WebParam(name = "deviceId", targetNamespace = "http://www.Abletech.it/Arxivar")
        java.lang.String deviceId
    );

    @WebResult(name = "Login_with_languageResult", targetNamespace = "http://www.Abletech.it/Arxivar")
    @RequestWrapper(localName = "Login_with_language", targetNamespace = "http://www.Abletech.it/Arxivar", className = "it.abletech.arxivar.login.LoginWithLanguage")
    @WebMethod(operationName = "Login_with_language", action = "http://www.Abletech.it/Arxivar/Login_with_language")
    @ResponseWrapper(localName = "Login_with_languageResponse", targetNamespace = "http://www.Abletech.it/Arxivar", className = "it.abletech.arxivar.login.LoginWithLanguageResponse")
    public it.abletech.arxivar.login.LoginModel loginWithLanguage(
        @WebParam(name = "userName", targetNamespace = "http://www.Abletech.it/Arxivar")
        java.lang.String userName,
        @WebParam(name = "password", targetNamespace = "http://www.Abletech.it/Arxivar")
        java.lang.String password,
        @WebParam(name = "lang", targetNamespace = "http://www.Abletech.it/Arxivar")
        java.lang.String lang,
        @WebParam(name = "softwareName", targetNamespace = "http://www.Abletech.it/Arxivar")
        java.lang.String softwareName
    );

    @WebResult(name = "DeImpersonateResult", targetNamespace = "http://www.Abletech.it/Arxivar")
    @RequestWrapper(localName = "DeImpersonate", targetNamespace = "http://www.Abletech.it/Arxivar", className = "it.abletech.arxivar.login.DeImpersonate")
    @WebMethod(operationName = "DeImpersonate", action = "http://www.Abletech.it/Arxivar/DeImpersonate")
    @ResponseWrapper(localName = "DeImpersonateResponse", targetNamespace = "http://www.Abletech.it/Arxivar", className = "it.abletech.arxivar.login.DeImpersonateResponse")
    public boolean deImpersonate(
        @WebParam(name = "sessionId", targetNamespace = "http://www.Abletech.it/Arxivar")
        java.lang.String sessionId
    );

    @WebResult(name = "Impersonate_By_WindowsUsernameResult", targetNamespace = "http://www.Abletech.it/Arxivar")
    @RequestWrapper(localName = "Impersonate_By_WindowsUsername", targetNamespace = "http://www.Abletech.it/Arxivar", className = "it.abletech.arxivar.login.ImpersonateByWindowsUsername")
    @WebMethod(operationName = "Impersonate_By_WindowsUsername", action = "http://www.Abletech.it/Arxivar/Impersonate_By_WindowsUsername")
    @ResponseWrapper(localName = "Impersonate_By_WindowsUsernameResponse", targetNamespace = "http://www.Abletech.it/Arxivar", className = "it.abletech.arxivar.login.ImpersonateByWindowsUsernameResponse")
    public boolean impersonateByWindowsUsername(
        @WebParam(name = "sessionId", targetNamespace = "http://www.Abletech.it/Arxivar")
        java.lang.String sessionId,
        @WebParam(name = "windowsUsername", targetNamespace = "http://www.Abletech.it/Arxivar")
        java.lang.String windowsUsername
    );

    @WebResult(name = "LoginResult", targetNamespace = "http://www.Abletech.it/Arxivar")
    @RequestWrapper(localName = "Login", targetNamespace = "http://www.Abletech.it/Arxivar", className = "it.abletech.arxivar.login.Login")
    @WebMethod(operationName = "Login", action = "http://www.Abletech.it/Arxivar/Login")
    @ResponseWrapper(localName = "LoginResponse", targetNamespace = "http://www.Abletech.it/Arxivar", className = "it.abletech.arxivar.login.LoginResponse")
    public it.abletech.arxivar.login.LoginModel login(
        @WebParam(name = "userName", targetNamespace = "http://www.Abletech.it/Arxivar")
        java.lang.String userName,
        @WebParam(name = "password", targetNamespace = "http://www.Abletech.it/Arxivar")
        java.lang.String password,
        @WebParam(name = "softwareName", targetNamespace = "http://www.Abletech.it/Arxivar")
        java.lang.String softwareName
    );

    @WebResult(name = "AooLockedResult", targetNamespace = "http://www.Abletech.it/Arxivar")
    @RequestWrapper(localName = "AooLocked", targetNamespace = "http://www.Abletech.it/Arxivar", className = "it.abletech.arxivar.login.AooLocked")
    @WebMethod(operationName = "AooLocked", action = "http://www.Abletech.it/Arxivar/AooLocked")
    @ResponseWrapper(localName = "AooLockedResponse", targetNamespace = "http://www.Abletech.it/Arxivar", className = "it.abletech.arxivar.login.AooLockedResponse")
    public boolean aooLocked(
        @WebParam(name = "sessionId", targetNamespace = "http://www.Abletech.it/Arxivar")
        java.lang.String sessionId
    );
}
