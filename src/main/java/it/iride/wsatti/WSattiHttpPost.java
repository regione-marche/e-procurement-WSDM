package it.iride.wsatti;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;

/**
 * This class was generated by Apache CXF 2.7.10
 * 2015-02-06T15:37:00.449+01:00
 * Generated source version: 2.7.10
 * 
 */
@WebService(targetNamespace = "http://tempuri.org/", name = "WSattiHttpPost")
@XmlSeeAlso({ObjectFactory.class})
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
public interface WSattiHttpPost {

    /**
     * Assegna il numero alla determina in formato stringa
     */
    @WebResult(name = "string", targetNamespace = "http://tempuri.org/", partName = "Body")
    @WebMethod(operationName = "NumeraDeterminaString")
    public java.lang.String numeraDeterminaString(
        @WebParam(partName = "IdDocumento", name = "IdDocumento", targetNamespace = "http://tempuri.org/")
        java.lang.String idDocumento,
        @WebParam(partName = "Utente", name = "Utente", targetNamespace = "http://tempuri.org/")
        java.lang.String utente,
        @WebParam(partName = "Ruolo", name = "Ruolo", targetNamespace = "http://tempuri.org/")
        java.lang.String ruolo,
        @WebParam(partName = "CodiceAmministrazione", name = "CodiceAmministrazione", targetNamespace = "http://tempuri.org/")
        java.lang.String codiceAmministrazione,
        @WebParam(partName = "CodiceAOO", name = "CodiceAOO", targetNamespace = "http://tempuri.org/")
        java.lang.String codiceAOO
    );

    /**
     * Aggiunge uno o piu' allegati ad un documento o protocollo esistente in formato stringa
     */
    @WebResult(name = "string", targetNamespace = "http://tempuri.org/", partName = "Body")
    @WebMethod(operationName = "AggiungiAllegatiString")
    public java.lang.String aggiungiAllegatiString(
        @WebParam(partName = "NuoviAllegatiStr", name = "NuoviAllegatiStr", targetNamespace = "http://tempuri.org/")
        java.lang.String nuoviAllegatiStr,
        @WebParam(partName = "CodiceAmministrazione", name = "CodiceAmministrazione", targetNamespace = "http://tempuri.org/")
        java.lang.String codiceAmministrazione,
        @WebParam(partName = "CodiceAOO", name = "CodiceAOO", targetNamespace = "http://tempuri.org/")
        java.lang.String codiceAOO
    );

    /**
     * Restituisci i dati dell'atto richiesto
     */
    @WebResult(name = "AttoOut", targetNamespace = "http://tempuri.org/", partName = "Body")
    @WebMethod(operationName = "LeggiAtto")
    public AttoOut leggiAtto(
        @WebParam(partName = "IdDocumento", name = "IdDocumento", targetNamespace = "http://tempuri.org/")
        java.lang.String idDocumento,
        @WebParam(partName = "Tipo", name = "Tipo", targetNamespace = "http://tempuri.org/")
        java.lang.String tipo,
        @WebParam(partName = "Organo", name = "Organo", targetNamespace = "http://tempuri.org/")
        java.lang.String organo,
        @WebParam(partName = "Anno", name = "Anno", targetNamespace = "http://tempuri.org/")
        java.lang.String anno,
        @WebParam(partName = "Numero", name = "Numero", targetNamespace = "http://tempuri.org/")
        java.lang.String numero,
        @WebParam(partName = "Utente", name = "Utente", targetNamespace = "http://tempuri.org/")
        java.lang.String utente,
        @WebParam(partName = "Ruolo", name = "Ruolo", targetNamespace = "http://tempuri.org/")
        java.lang.String ruolo,
        @WebParam(partName = "CodiceAmministrazione", name = "CodiceAmministrazione", targetNamespace = "http://tempuri.org/")
        java.lang.String codiceAmministrazione,
        @WebParam(partName = "CodiceAOO", name = "CodiceAOO", targetNamespace = "http://tempuri.org/")
        java.lang.String codiceAOO
    );

    /**
     * Inserisce una proposta ed eventualmente esegue l'avvio dell'iter in formato stringa
     */
    @WebResult(name = "string", targetNamespace = "http://tempuri.org/", partName = "Body")
    @WebMethod(operationName = "InserisciPropostaString")
    public java.lang.String inserisciPropostaString(
        @WebParam(partName = "PropostaInStr", name = "PropostaInStr", targetNamespace = "http://tempuri.org/")
        java.lang.String propostaInStr,
        @WebParam(partName = "CodiceAmministrazione", name = "CodiceAmministrazione", targetNamespace = "http://tempuri.org/")
        java.lang.String codiceAmministrazione,
        @WebParam(partName = "CodiceAOO", name = "CodiceAOO", targetNamespace = "http://tempuri.org/")
        java.lang.String codiceAOO
    );

    /**
     * Inserisce una determina ed eventualmente esegue l'avvio dell'iter in formato stringa
     */
    @WebResult(name = "string", targetNamespace = "http://tempuri.org/", partName = "Body")
    @WebMethod(operationName = "InserisciDeterminaString")
    public java.lang.String inserisciDeterminaString(
        @WebParam(partName = "DeterminaInStr", name = "DeterminaInStr", targetNamespace = "http://tempuri.org/")
        java.lang.String determinaInStr,
        @WebParam(partName = "CodiceAmministrazione", name = "CodiceAmministrazione", targetNamespace = "http://tempuri.org/")
        java.lang.String codiceAmministrazione,
        @WebParam(partName = "CodiceAOO", name = "CodiceAOO", targetNamespace = "http://tempuri.org/")
        java.lang.String codiceAOO
    );

    /**
     * Assegna il numero alla determina
     */
    @WebResult(name = "NumerazioneDeterminaOut", targetNamespace = "http://tempuri.org/", partName = "Body")
    @WebMethod(operationName = "NumeraDetermina")
    public NumerazioneDeterminaOut numeraDetermina(
        @WebParam(partName = "IdDocumento", name = "IdDocumento", targetNamespace = "http://tempuri.org/")
        java.lang.String idDocumento,
        @WebParam(partName = "Utente", name = "Utente", targetNamespace = "http://tempuri.org/")
        java.lang.String utente,
        @WebParam(partName = "Ruolo", name = "Ruolo", targetNamespace = "http://tempuri.org/")
        java.lang.String ruolo,
        @WebParam(partName = "CodiceAmministrazione", name = "CodiceAmministrazione", targetNamespace = "http://tempuri.org/")
        java.lang.String codiceAmministrazione,
        @WebParam(partName = "CodiceAOO", name = "CodiceAOO", targetNamespace = "http://tempuri.org/")
        java.lang.String codiceAOO
    );

    /**
     * Restituisci i dati dell'atto richiesto in formato stringq
     */
    @WebResult(name = "string", targetNamespace = "http://tempuri.org/", partName = "Body")
    @WebMethod(operationName = "LeggiAttoPlus")
    public java.lang.String leggiAttoPlus(
        @WebParam(partName = "FiltroAtto", name = "FiltroAtto", targetNamespace = "http://tempuri.org/")
        java.lang.String filtroAtto,
        @WebParam(partName = "CodiceAmministrazione", name = "CodiceAmministrazione", targetNamespace = "http://tempuri.org/")
        java.lang.String codiceAmministrazione,
        @WebParam(partName = "CodiceAOO", name = "CodiceAOO", targetNamespace = "http://tempuri.org/")
        java.lang.String codiceAOO
    );

    /**
     * Annulla un atto a partire dall'identificativo
     */
    @WebResult(name = "string", targetNamespace = "http://tempuri.org/", partName = "Body")
    @WebMethod(operationName = "AnnullaAtto")
    public java.lang.String annullaAtto(
        @WebParam(partName = "AnnullaDocumentoIn", name = "AnnullaDocumentoIn", targetNamespace = "http://tempuri.org/")
        java.lang.String annullaDocumentoIn,
        @WebParam(partName = "CodiceAmministrazione", name = "CodiceAmministrazione", targetNamespace = "http://tempuri.org/")
        java.lang.String codiceAmministrazione,
        @WebParam(partName = "CodiceAOO", name = "CodiceAOO", targetNamespace = "http://tempuri.org/")
        java.lang.String codiceAOO
    );

    /**
     * Restituisci i dati dell'atto richiesto in formato stringq
     */
    @WebResult(name = "string", targetNamespace = "http://tempuri.org/", partName = "Body")
    @WebMethod(operationName = "LeggiAttoString")
    public java.lang.String leggiAttoString(
        @WebParam(partName = "IdDocumento", name = "IdDocumento", targetNamespace = "http://tempuri.org/")
        java.lang.String idDocumento,
        @WebParam(partName = "Tipo", name = "Tipo", targetNamespace = "http://tempuri.org/")
        java.lang.String tipo,
        @WebParam(partName = "Organo", name = "Organo", targetNamespace = "http://tempuri.org/")
        java.lang.String organo,
        @WebParam(partName = "Anno", name = "Anno", targetNamespace = "http://tempuri.org/")
        java.lang.String anno,
        @WebParam(partName = "Numero", name = "Numero", targetNamespace = "http://tempuri.org/")
        java.lang.String numero,
        @WebParam(partName = "Utente", name = "Utente", targetNamespace = "http://tempuri.org/")
        java.lang.String utente,
        @WebParam(partName = "Ruolo", name = "Ruolo", targetNamespace = "http://tempuri.org/")
        java.lang.String ruolo,
        @WebParam(partName = "CodiceAmministrazione", name = "CodiceAmministrazione", targetNamespace = "http://tempuri.org/")
        java.lang.String codiceAmministrazione,
        @WebParam(partName = "CodiceAOO", name = "CodiceAOO", targetNamespace = "http://tempuri.org/")
        java.lang.String codiceAOO
    );
}
