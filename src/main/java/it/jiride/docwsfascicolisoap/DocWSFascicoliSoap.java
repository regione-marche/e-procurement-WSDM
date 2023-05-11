package it.jiride.docwsfascicolisoap;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 2.7.10
 * 2019-05-06T15:43:51.788+02:00
 * Generated source version: 2.7.10
 * 
 */
@WebService(targetNamespace = "http://tempuri.org/", name = "DocWSFascicoliSoap")
@XmlSeeAlso({ObjectFactory.class})
public interface DocWSFascicoliSoap {

    @WebResult(name = "InserisciMetadatiResult", targetNamespace = "http://tempuri.org/")
    @RequestWrapper(localName = "InserisciMetadati", targetNamespace = "http://tempuri.org/", className = "it.jiride.docwsfascicolisoap.InserisciMetadati")
    @WebMethod(operationName = "InserisciMetadati", action = "http://tempuri.org/InserisciMetadati")
    @ResponseWrapper(localName = "InserisciMetadatiResponse", targetNamespace = "http://tempuri.org/", className = "it.jiride.docwsfascicolisoap.InserisciMetadatiResponse")
    public it.jiride.docwsfascicolisoap.EsitoOperazione inserisciMetadati(
        @WebParam(name = "Contesto", targetNamespace = "http://tempuri.org/")
        java.lang.String contesto,
        @WebParam(name = "IDFascicolo", targetNamespace = "http://tempuri.org/")
        java.lang.String idFascicolo,
        @WebParam(name = "MetadatiStr", targetNamespace = "http://tempuri.org/")
        java.lang.String metadatiStr,
        @WebParam(name = "ConnectionString", targetNamespace = "http://tempuri.org/")
        java.lang.String connectionString
    );

    @WebResult(name = "CreaSottoFascicoloStringResult", targetNamespace = "http://tempuri.org/")
    @RequestWrapper(localName = "CreaSottoFascicoloString", targetNamespace = "http://tempuri.org/", className = "it.jiride.docwsfascicolisoap.CreaSottoFascicoloString")
    @WebMethod(operationName = "CreaSottoFascicoloString", action = "http://tempuri.org/CreaSottoFascicoloString")
    @ResponseWrapper(localName = "CreaSottoFascicoloStringResponse", targetNamespace = "http://tempuri.org/", className = "it.jiride.docwsfascicolisoap.CreaSottoFascicoloStringResponse")
    public java.lang.String creaSottoFascicoloString(
        @WebParam(name = "IDFascicolo", targetNamespace = "http://tempuri.org/")
        int idFascicolo,
        @WebParam(name = "Utente", targetNamespace = "http://tempuri.org/")
        java.lang.String utente,
        @WebParam(name = "Ruolo", targetNamespace = "http://tempuri.org/")
        java.lang.String ruolo,
        @WebParam(name = "CodiceAmministrazione", targetNamespace = "http://tempuri.org/")
        java.lang.String codiceAmministrazione,
        @WebParam(name = "CodiceAOO", targetNamespace = "http://tempuri.org/")
        java.lang.String codiceAOO,
        @WebParam(name = "FascicoloInStr", targetNamespace = "http://tempuri.org/")
        java.lang.String fascicoloInStr
    );

    @WebResult(name = "FascicoloOut", targetNamespace = "http://tempuri.org/")
    @RequestWrapper(localName = "LeggiFascicolo", targetNamespace = "http://tempuri.org/", className = "it.jiride.docwsfascicolisoap.LeggiFascicolo")
    @WebMethod(operationName = "LeggiFascicolo", action = "http://tempuri.org/LeggiFascicolo")
    @ResponseWrapper(localName = "LeggiFascicoloResponse", targetNamespace = "http://tempuri.org/", className = "it.jiride.docwsfascicolisoap.LeggiFascicoloResponse")
    public it.jiride.docwsfascicolisoap.FascicoloOut leggiFascicolo(
        @WebParam(name = "IDFascicolo", targetNamespace = "http://tempuri.org/")
        java.lang.String idFascicolo,
        @WebParam(name = "Anno", targetNamespace = "http://tempuri.org/")
        java.lang.String anno,
        @WebParam(name = "Numero", targetNamespace = "http://tempuri.org/")
        java.lang.String numero,
        @WebParam(name = "Utente", targetNamespace = "http://tempuri.org/")
        java.lang.String utente,
        @WebParam(name = "Ruolo", targetNamespace = "http://tempuri.org/")
        java.lang.String ruolo,
        @WebParam(name = "CodiceAmministrazione", targetNamespace = "http://tempuri.org/")
        java.lang.String codiceAmministrazione,
        @WebParam(name = "CodiceAOO", targetNamespace = "http://tempuri.org/")
        java.lang.String codiceAOO,
        @WebParam(name = "CodiceClassificazione", targetNamespace = "http://tempuri.org/")
        java.lang.String codiceClassificazione
    );

    @WebResult(name = "FascicolaDocumentoResult", targetNamespace = "http://tempuri.org/")
    @RequestWrapper(localName = "FascicolaDocumento", targetNamespace = "http://tempuri.org/", className = "it.jiride.docwsfascicolisoap.FascicolaDocumento")
    @WebMethod(operationName = "FascicolaDocumento", action = "http://tempuri.org/FascicolaDocumento")
    @ResponseWrapper(localName = "FascicolaDocumentoResponse", targetNamespace = "http://tempuri.org/", className = "it.jiride.docwsfascicolisoap.FascicolaDocumentoResponse")
    public it.jiride.docwsfascicolisoap.EsitoOperazione fascicolaDocumento(
        @WebParam(name = "IDFascicolo", targetNamespace = "http://tempuri.org/")
        int idFascicolo,
        @WebParam(name = "IDDocumento", targetNamespace = "http://tempuri.org/")
        int idDocumento,
        @WebParam(name = "AggiornaClassifica", targetNamespace = "http://tempuri.org/")
        java.lang.String aggiornaClassifica,
        @WebParam(name = "Utente", targetNamespace = "http://tempuri.org/")
        java.lang.String utente,
        @WebParam(name = "Ruolo", targetNamespace = "http://tempuri.org/")
        java.lang.String ruolo,
        @WebParam(name = "CodiceAmministrazione", targetNamespace = "http://tempuri.org/")
        java.lang.String codiceAmministrazione,
        @WebParam(name = "CodiceAOO", targetNamespace = "http://tempuri.org/")
        java.lang.String codiceAOO,
        @WebParam(name = "Principale", targetNamespace = "http://tempuri.org/")
        java.lang.String principale
    );

    @WebResult(name = "ModificaFascicoloResult", targetNamespace = "http://tempuri.org/")
    @RequestWrapper(localName = "ModificaFascicolo", targetNamespace = "http://tempuri.org/", className = "it.jiride.docwsfascicolisoap.ModificaFascicolo")
    @WebMethod(operationName = "ModificaFascicolo", action = "http://tempuri.org/ModificaFascicolo")
    @ResponseWrapper(localName = "ModificaFascicoloResponse", targetNamespace = "http://tempuri.org/", className = "it.jiride.docwsfascicolisoap.ModificaFascicoloResponse")
    public it.jiride.docwsfascicolisoap.EsitoOperazione modificaFascicolo(
        @WebParam(name = "FascicoloInStr", targetNamespace = "http://tempuri.org/")
        java.lang.String fascicoloInStr,
        @WebParam(name = "CodiceAmministrazione", targetNamespace = "http://tempuri.org/")
        java.lang.String codiceAmministrazione,
        @WebParam(name = "CodiceAOO", targetNamespace = "http://tempuri.org/")
        java.lang.String codiceAOO
    );

    @WebResult(name = "LeggiFascicoloStringResult", targetNamespace = "http://tempuri.org/")
    @RequestWrapper(localName = "LeggiFascicoloString", targetNamespace = "http://tempuri.org/", className = "it.jiride.docwsfascicolisoap.LeggiFascicoloString")
    @WebMethod(operationName = "LeggiFascicoloString", action = "http://tempuri.org/LeggiFascicoloString")
    @ResponseWrapper(localName = "LeggiFascicoloStringResponse", targetNamespace = "http://tempuri.org/", className = "it.jiride.docwsfascicolisoap.LeggiFascicoloStringResponse")
    public java.lang.String leggiFascicoloString(
        @WebParam(name = "IDFascicolo", targetNamespace = "http://tempuri.org/")
        java.lang.String idFascicolo,
        @WebParam(name = "Anno", targetNamespace = "http://tempuri.org/")
        java.lang.String anno,
        @WebParam(name = "Numero", targetNamespace = "http://tempuri.org/")
        java.lang.String numero,
        @WebParam(name = "Utente", targetNamespace = "http://tempuri.org/")
        java.lang.String utente,
        @WebParam(name = "Ruolo", targetNamespace = "http://tempuri.org/")
        java.lang.String ruolo,
        @WebParam(name = "CodiceAmministrazione", targetNamespace = "http://tempuri.org/")
        java.lang.String codiceAmministrazione,
        @WebParam(name = "CodiceAOO", targetNamespace = "http://tempuri.org/")
        java.lang.String codiceAOO,
        @WebParam(name = "CodiceClassificazione", targetNamespace = "http://tempuri.org/")
        java.lang.String codiceClassificazione
    );

    @WebResult(name = "CreaFascicoloStringResult", targetNamespace = "http://tempuri.org/")
    @RequestWrapper(localName = "CreaFascicoloString", targetNamespace = "http://tempuri.org/", className = "it.jiride.docwsfascicolisoap.CreaFascicoloString")
    @WebMethod(operationName = "CreaFascicoloString", action = "http://tempuri.org/CreaFascicoloString")
    @ResponseWrapper(localName = "CreaFascicoloStringResponse", targetNamespace = "http://tempuri.org/", className = "it.jiride.docwsfascicolisoap.CreaFascicoloStringResponse")
    public java.lang.String creaFascicoloString(
        @WebParam(name = "FascicoloInStr", targetNamespace = "http://tempuri.org/")
        java.lang.String fascicoloInStr,
        @WebParam(name = "CodiceAmministrazione", targetNamespace = "http://tempuri.org/")
        java.lang.String codiceAmministrazione,
        @WebParam(name = "CodiceAOO", targetNamespace = "http://tempuri.org/")
        java.lang.String codiceAOO
    );

    @WebResult(name = "FascicoloOut", targetNamespace = "http://tempuri.org/")
    @RequestWrapper(localName = "CreaSottoFascicolo", targetNamespace = "http://tempuri.org/", className = "it.jiride.docwsfascicolisoap.CreaSottoFascicolo")
    @WebMethod(operationName = "CreaSottoFascicolo", action = "http://tempuri.org/CreaSottoFascicolo")
    @ResponseWrapper(localName = "CreaSottoFascicoloResponse", targetNamespace = "http://tempuri.org/", className = "it.jiride.docwsfascicolisoap.CreaSottoFascicoloResponse")
    public it.jiride.docwsfascicolisoap.FascicoloOut creaSottoFascicolo(
        @WebParam(name = "IDFascicolo", targetNamespace = "http://tempuri.org/")
        int idFascicolo,
        @WebParam(name = "Utente", targetNamespace = "http://tempuri.org/")
        java.lang.String utente,
        @WebParam(name = "Ruolo", targetNamespace = "http://tempuri.org/")
        java.lang.String ruolo,
        @WebParam(name = "CodiceAmministrazione", targetNamespace = "http://tempuri.org/")
        java.lang.String codiceAmministrazione,
        @WebParam(name = "CodiceAOO", targetNamespace = "http://tempuri.org/")
        java.lang.String codiceAOO,
        @WebParam(name = "FascicoloIn", targetNamespace = "http://tempuri.org/")
        it.jiride.docwsfascicolisoap.FascicoloIn fascicoloIn
    );

    @WebResult(name = "FascicoloOut", targetNamespace = "http://tempuri.org/")
    @RequestWrapper(localName = "CreaFascicolo", targetNamespace = "http://tempuri.org/", className = "it.jiride.docwsfascicolisoap.CreaFascicolo")
    @WebMethod(operationName = "CreaFascicolo", action = "http://tempuri.org/CreaFascicolo")
    @ResponseWrapper(localName = "CreaFascicoloResponse", targetNamespace = "http://tempuri.org/", className = "it.jiride.docwsfascicolisoap.CreaFascicoloResponse")
    public it.jiride.docwsfascicolisoap.FascicoloOut creaFascicolo(
        @WebParam(name = "FascicoloIn", targetNamespace = "http://tempuri.org/")
        it.jiride.docwsfascicolisoap.FascicoloIn fascicoloIn,
        @WebParam(name = "CodiceAmministrazione", targetNamespace = "http://tempuri.org/")
        java.lang.String codiceAmministrazione,
        @WebParam(name = "CodiceAOO", targetNamespace = "http://tempuri.org/")
        java.lang.String codiceAOO
    );
}
