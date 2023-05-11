/**
 * ProtocolloWebService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package folium2.protocollowebservice;

public interface ProtocolloWebService extends java.rmi.Remote {
    public agora.folium2.ws.WSEsito testLogin(agora.folium2.ws.WSAuthentication in0) throws java.rmi.RemoteException;
    public agora.folium2.ws.WSEsito testStato(agora.folium2.ws.WSAuthentication in0) throws java.rmi.RemoteException;
    public folium2.protocollowebservice.VoceTitolario[] ricercaTitolarioPerCodiceDescrizione(agora.folium2.ws.WSAuthentication in0, folium2.protocollowebservice.VoceTitolario in1) throws java.rmi.RemoteException;
    public folium2.protocollowebservice.DocumentoProtocollato[] ricercaProtocolli(agora.folium2.ws.WSAuthentication in0, folium2.protocollowebservice.Ricerca in1) throws java.rmi.RemoteException;
    public folium2.protocollowebservice.DocumentoProtocollato protocolla(agora.folium2.ws.WSAuthentication in0, folium2.protocollowebservice.DocumentoProtocollato in1) throws java.rmi.RemoteException;
    public folium2.protocollowebservice.ImmagineDocumentale inserisciContenuto(agora.folium2.ws.WSAuthentication in0, folium2.protocollowebservice.ImmagineDocumentale in1, boolean in2) throws java.rmi.RemoteException;
    public folium2.protocollowebservice.Assegnazione assegna(agora.folium2.ws.WSAuthentication in0, folium2.protocollowebservice.Assegnazione in1) throws java.rmi.RemoteException;
    public folium2.protocollowebservice.ImmagineDocumentale recuperaContenuto(agora.folium2.ws.WSAuthentication in0, long in1) throws java.rmi.RemoteException;
    public byte[] getContenutoDocumento(agora.folium2.ws.WSAuthentication in0, long in1) throws java.rmi.RemoteException;
    public folium2.protocollowebservice.Allegato inserisciAllegato(agora.folium2.ws.WSAuthentication in0, folium2.protocollowebservice.Allegato in1) throws java.rmi.RemoteException;
    public folium2.protocollowebservice.Allegato[] getAllegati(agora.folium2.ws.WSAuthentication in0, long in1) throws java.rmi.RemoteException;
    public folium2.protocollowebservice.Allegato getAllegato(agora.folium2.ws.WSAuthentication in0, long in1) throws java.rmi.RemoteException;
    public byte[] getContenutoAllegato(agora.folium2.ws.WSAuthentication in0, long in1) throws java.rmi.RemoteException;
    public folium2.protocollowebservice.Allegato rimuoviAllegato(agora.folium2.ws.WSAuthentication in0, long in1) throws java.rmi.RemoteException;
    public folium2.protocollowebservice.AssegnazioneDaRicerca[] elencoAssegnazioni(agora.folium2.ws.WSAuthentication authentication, folium2.protocollowebservice.RicercaAssegnazioni criteria) throws java.rmi.RemoteException;
    public agora.folium2.ws.WSEsito prendiInCarico(agora.folium2.ws.WSAuthentication authentication, folium2.protocollowebservice.PresaInCarico presaInCarico) throws java.rmi.RemoteException;
    public folium2.protocollowebservice.MezzoSpedizione[] getMezziSpedizione(agora.folium2.ws.WSAuthentication authentication) throws java.rmi.RemoteException;
    public folium2.protocollowebservice.CorrispondenteDaRicerca[] ricercaCorrispondenti(agora.folium2.ws.WSAuthentication authentication, folium2.protocollowebservice.RicercaCorrispondenti criteria) throws java.rmi.RemoteException;
}
