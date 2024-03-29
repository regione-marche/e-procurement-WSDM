package it.sispi.protocollo;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 2.7.10
 * 2018-10-12T15:01:02.982+02:00
 * Generated source version: 2.7.10
 * 
 */
@WebService(targetNamespace = "http://protocollo.sispi.it", name = "Protocollo")
@XmlSeeAlso({ObjectFactory.class})
public interface Protocollo {

    @WebResult(name = "rispInfoProt", targetNamespace = "")
    @RequestWrapper(localName = "infoProt", targetNamespace = "http://protocollo.sispi.it", className = "it.sispi.protocollo.InfoProt")
    @WebMethod(action = "infoProt")
    @ResponseWrapper(localName = "infoProtResponse", targetNamespace = "http://protocollo.sispi.it", className = "it.sispi.protocollo.InfoProtResponse")
    public it.sispi.protocollo.WsProtRispostaInfoProt infoProt(
        @WebParam(name = "richInfoProt", targetNamespace = "")
        it.sispi.protocollo.WsProtRichInfoProt richInfoProt,
        @WebParam(name = "client", targetNamespace = "")
        it.sispi.protocollo.WsProtClient client
    ) throws WsProtException_Exception;

    @WebResult(name = "rispInfoTipoDocumento", targetNamespace = "")
    @RequestWrapper(localName = "infoTipoDocumento", targetNamespace = "http://protocollo.sispi.it", className = "it.sispi.protocollo.InfoTipoDocumento")
    @WebMethod(action = "infoTipoDocumento")
    @ResponseWrapper(localName = "infoTipoDocumentoResponse", targetNamespace = "http://protocollo.sispi.it", className = "it.sispi.protocollo.InfoTipoDocumentoResponse")
    public it.sispi.protocollo.WsProtRispostaInfoTipoDocumento infoTipoDocumento(
        @WebParam(name = "richInfoTipoDocumento", targetNamespace = "")
        it.sispi.protocollo.WsProtRichInfoTipoDocumento richInfoTipoDocumento,
        @WebParam(name = "client", targetNamespace = "")
        it.sispi.protocollo.WsProtClient client
    ) throws WsProtException_Exception;

    @WebResult(name = "rispTipoTrasmissione", targetNamespace = "")
    @RequestWrapper(localName = "infoTipoTrasmissione", targetNamespace = "http://protocollo.sispi.it", className = "it.sispi.protocollo.InfoTipoTrasmissione")
    @WebMethod(action = "infoTipoTrasmissione")
    @ResponseWrapper(localName = "infoTipoTrasmissioneResponse", targetNamespace = "http://protocollo.sispi.it", className = "it.sispi.protocollo.InfoTipoTrasmissioneResponse")
    public it.sispi.protocollo.WsProtRispostaInfoTipoTrasmissione infoTipoTrasmissione(
        @WebParam(name = "richInfoTipoTrasmissione", targetNamespace = "")
        it.sispi.protocollo.WsProtRichInfoTipoTrasmissione richInfoTipoTrasmissione,
        @WebParam(name = "client", targetNamespace = "")
        it.sispi.protocollo.WsProtClient client
    ) throws WsProtException_Exception;

    @WebResult(name = "rispInfoTipoAllegato", targetNamespace = "")
    @RequestWrapper(localName = "infoTipoAllegato", targetNamespace = "http://protocollo.sispi.it", className = "it.sispi.protocollo.InfoTipoAllegato")
    @WebMethod(action = "infoTipoAllegato")
    @ResponseWrapper(localName = "infoTipoAllegatoResponse", targetNamespace = "http://protocollo.sispi.it", className = "it.sispi.protocollo.InfoTipoAllegatoResponse")
    public it.sispi.protocollo.WsProtRispostaInfoTipoAllegato infoTipoAllegato(
        @WebParam(name = "richInfoTipoAllegato", targetNamespace = "")
        it.sispi.protocollo.WsProtRichInfoTipoAllegato richInfoTipoAllegato,
        @WebParam(name = "client", targetNamespace = "")
        it.sispi.protocollo.WsProtClient client
    ) throws WsProtException_Exception;

    @WebResult(name = "rispInfoAOO", targetNamespace = "")
    @RequestWrapper(localName = "infoAOO", targetNamespace = "http://protocollo.sispi.it", className = "it.sispi.protocollo.InfoAOO")
    @WebMethod(action = "infoAOO")
    @ResponseWrapper(localName = "infoAOOResponse", targetNamespace = "http://protocollo.sispi.it", className = "it.sispi.protocollo.InfoAOOResponse")
    public it.sispi.protocollo.WsProtRispostaInfoAOO infoAOO(
        @WebParam(name = "richInfoAOO", targetNamespace = "")
        it.sispi.protocollo.WsProtRichInfoAOO richInfoAOO,
        @WebParam(name = "client", targetNamespace = "")
        it.sispi.protocollo.WsProtClient client
    ) throws WsProtException_Exception;

    @WebResult(name = "rispInfoCategoriaDocumento", targetNamespace = "")
    @RequestWrapper(localName = "infoCategoriaDocumento", targetNamespace = "http://protocollo.sispi.it", className = "it.sispi.protocollo.InfoCategoriaDocumento")
    @WebMethod(action = "infoCategoriaDocumento")
    @ResponseWrapper(localName = "infoCategoriaDocumentoResponse", targetNamespace = "http://protocollo.sispi.it", className = "it.sispi.protocollo.InfoCategoriaDocumentoResponse")
    public it.sispi.protocollo.WsProtRispostaInfoCategoriaDocumento infoCategoriaDocumento(
        @WebParam(name = "richInfoCategoriaDocumento", targetNamespace = "")
        it.sispi.protocollo.WsProtRichInfoCategoriaDocumento richInfoCategoriaDocumento,
        @WebParam(name = "client", targetNamespace = "")
        it.sispi.protocollo.WsProtClient client
    ) throws WsProtException_Exception;

    @WebResult(name = "rispAllegaDocumenti", targetNamespace = "")
    @RequestWrapper(localName = "allegaDocumenti", targetNamespace = "http://protocollo.sispi.it", className = "it.sispi.protocollo.AllegaDocumenti")
    @WebMethod(action = "allegaDocumenti")
    @ResponseWrapper(localName = "allegaDocumentiResponse", targetNamespace = "http://protocollo.sispi.it", className = "it.sispi.protocollo.AllegaDocumentiResponse")
    public it.sispi.protocollo.WsProtRispostaAllegaDocumenti allegaDocumenti(
        @WebParam(name = "richAllegaDocumenti", targetNamespace = "")
        it.sispi.protocollo.WsProtRichAllegaDocumenti richAllegaDocumenti,
        @WebParam(name = "client", targetNamespace = "")
        it.sispi.protocollo.WsProtClient client
    ) throws WsProtException_Exception;

    @WebResult(name = "rispInfoRegistroAnnoCorrente", targetNamespace = "")
    @RequestWrapper(localName = "infoRegistroAnnoCorrente", targetNamespace = "http://protocollo.sispi.it", className = "it.sispi.protocollo.InfoRegistroAnnoCorrente")
    @WebMethod(action = "infoRegistroAnnoCorrente")
    @ResponseWrapper(localName = "infoRegistroAnnoCorrenteResponse", targetNamespace = "http://protocollo.sispi.it", className = "it.sispi.protocollo.InfoRegistroAnnoCorrenteResponse")
    public it.sispi.protocollo.WsProtRispostaInfoRegistroAnnoCorrente infoRegistroAnnoCorrente(
        @WebParam(name = "richInfoRegistroAnnoCorrente", targetNamespace = "")
        it.sispi.protocollo.WsProtRichInfoRegistroAnnoCorrente richInfoRegistroAnnoCorrente,
        @WebParam(name = "client", targetNamespace = "")
        it.sispi.protocollo.WsProtClient client
    ) throws WsProtException_Exception;

    @WebResult(name = "rispInfoClassifica", targetNamespace = "")
    @RequestWrapper(localName = "infoClassifica", targetNamespace = "http://protocollo.sispi.it", className = "it.sispi.protocollo.InfoClassifica")
    @WebMethod(action = "infoClassifica")
    @ResponseWrapper(localName = "infoClassificaResponse", targetNamespace = "http://protocollo.sispi.it", className = "it.sispi.protocollo.InfoClassificaResponse")
    public it.sispi.protocollo.WsProtRispostaInfoClassifica infoClassifica(
        @WebParam(name = "richInfoClassifica", targetNamespace = "")
        it.sispi.protocollo.WsProtRichInfoClassifica richInfoClassifica,
        @WebParam(name = "client", targetNamespace = "")
        it.sispi.protocollo.WsProtClient client
    ) throws WsProtException_Exception;

    @WebResult(name = "rispInfoTitolario", targetNamespace = "")
    @RequestWrapper(localName = "infoTitolario", targetNamespace = "http://protocollo.sispi.it", className = "it.sispi.protocollo.InfoTitolario")
    @WebMethod(action = "infoTitolario")
    @ResponseWrapper(localName = "infoTitolarioResponse", targetNamespace = "http://protocollo.sispi.it", className = "it.sispi.protocollo.InfoTitolarioResponse")
    public it.sispi.protocollo.WsProtRispostaInfoTitolario infoTitolario(
        @WebParam(name = "richInfoTitolario", targetNamespace = "")
        it.sispi.protocollo.WsProtRichInfoTitolario richInfoTitolario,
        @WebParam(name = "client", targetNamespace = "")
        it.sispi.protocollo.WsProtClient client
    ) throws WsProtException_Exception;

    @WebResult(name = "rispRegProtMappata", targetNamespace = "")
    @RequestWrapper(localName = "regProtMappata", targetNamespace = "http://protocollo.sispi.it", className = "it.sispi.protocollo.RegProtMappata")
    @WebMethod(action = "regProtMappata")
    @ResponseWrapper(localName = "regProtMappataResponse", targetNamespace = "http://protocollo.sispi.it", className = "it.sispi.protocollo.RegProtMappataResponse")
    public it.sispi.protocollo.WsProtRisposta regProtMappata(
        @WebParam(name = "richRegProtMappata", targetNamespace = "")
        it.sispi.protocollo.WsProtRichMappata richRegProtMappata,
        @WebParam(name = "client", targetNamespace = "")
        it.sispi.protocollo.WsProtClient client
    ) throws WsProtException_Exception;
}
