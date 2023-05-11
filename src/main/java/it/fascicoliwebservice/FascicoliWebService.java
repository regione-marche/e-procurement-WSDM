/**
 * FascicoliWebService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package it.fascicoliwebservice;

public interface FascicoliWebService extends java.rmi.Remote {
    public agora.folium.ws.type.FascicoloEsteso recuperaFascicoloEsteso(agora.folium.ws.WSAuthentication in0, java.lang.Long in1) throws java.rmi.RemoteException;
    public agora.folium.ws.type.FascicoloEsteso creaFascicoloEsteso(agora.folium.ws.WSAuthentication in0, agora.folium.ws.type.FascicoloEsteso in1) throws java.rmi.RemoteException;
    public agora.folium.ws.type.FascicoloEsteso[] ricercaFascicoliEstesi(agora.folium.ws.WSAuthentication in0, agora.folium.ws.type.RicercaFascicoli in1, java.lang.String in2) throws java.rmi.RemoteException;
    public agora.folium.ws.type.Fascicolo recuperaFascicolo(agora.folium.ws.WSAuthentication in0, java.lang.Long in1) throws java.rmi.RemoteException;
    public agora.folium.ws.type.DocumentoProtocollato recuperaDocumento(agora.folium.ws.WSAuthentication in0, java.lang.Long in1) throws java.rmi.RemoteException;
    public agora.folium.ws.type.Fascicolo modificaFascicolo(agora.folium.ws.WSAuthentication in0, agora.folium.ws.type.Fascicolo in1) throws java.rmi.RemoteException;
    public agora.folium.ws.WSEsito cancellaFascicolo(agora.folium.ws.WSAuthentication in0, java.lang.Long in1) throws java.rmi.RemoteException;
    public agora.folium.ws.type.Allegato recuperaFileZipDocumenti(agora.folium.ws.WSAuthentication in0, java.lang.Long in1) throws java.rmi.RemoteException;
    public agora.folium.ws.type.Allegato recuperaFileZipDocumentiAttachment(agora.folium.ws.WSAuthentication in0, java.lang.Long in1) throws java.rmi.RemoteException;
    public agora.folium.ws.WSEsito inserisciDocumentoNelFascicoloAttachment(agora.folium.ws.WSAuthentication in0, agora.folium.ws.type.DocumentoProtocollato in1, java.lang.Long in2) throws java.rmi.RemoteException;
    public agora.folium.ws.type.Fascicolo[] ricercaFascicoli(agora.folium.ws.WSAuthentication in0, agora.folium.ws.type.RicercaFascicoli in1) throws java.rmi.RemoteException;
    public agora.folium.ws.type.Fascicolo creaFascicolo(agora.folium.ws.WSAuthentication in0, agora.folium.ws.type.Fascicolo in1) throws java.rmi.RemoteException;
    public agora.folium.ws.WSEsito copiaElementoNelFascicolo(agora.folium.ws.WSAuthentication in0, java.lang.Long in1, java.lang.Long in2, java.lang.Long in3) throws java.rmi.RemoteException;
    public agora.folium.ws.type.Allegato recuperaFileZipFoldersAttachment(agora.folium.ws.WSAuthentication in0, java.lang.Long[] in1) throws java.rmi.RemoteException;
    public agora.folium.ws.WSEsito inserisciDocumentoNelFascicolo(agora.folium.ws.WSAuthentication in0, agora.folium.ws.type.DocumentoProtocollato in1, java.lang.Long in2) throws java.rmi.RemoteException;
    public agora.folium.ws.WSEsito spostaElementoDalFascicolo(agora.folium.ws.WSAuthentication in0, java.lang.Long in1, java.lang.Long in2, java.lang.Long in3) throws java.rmi.RemoteException;
    public agora.folium.ws.type.SottoFascicolo[] ricercaFascicoliESottoFascicoli(agora.folium.ws.WSAuthentication in0, agora.folium.ws.type.RicercaSottoFascicoli in1) throws java.rmi.RemoteException;
    public agora.folium.ws.WSEsito rimuoviElementoDalFascicolo(agora.folium.ws.WSAuthentication in0, agora.folium.ws.type.ElementoNelFascicolo in1) throws java.rmi.RemoteException;
    public agora.folium.ws.type.Allegato recuperaPdfElencoDocumenti(agora.folium.ws.WSAuthentication in0, java.lang.Long in1) throws java.rmi.RemoteException;
    public agora.folium.ws.type.FascicoloTree recuperaStrutturaFascicolo(agora.folium.ws.WSAuthentication in0, java.lang.Long in1) throws java.rmi.RemoteException;
    public agora.folium.ws.type.Fascicolo[] recuperaFascicoliDocumento(agora.folium.ws.WSAuthentication in0, java.lang.Long in1) throws java.rmi.RemoteException;
    public agora.folium.ws.type.DocumentoProtocollato recuperaDocumentoAttachment(agora.folium.ws.WSAuthentication in0, java.lang.Long in1) throws java.rmi.RemoteException;
    public agora.folium.ws.type.ElementoNelFascicolo[] elencoElementiNelFascicolo(agora.folium.ws.WSAuthentication in0, java.lang.Long in1) throws java.rmi.RemoteException;
    public agora.folium.ws.type.Allegato zipElencoDocumentiAttachment(agora.folium.ws.WSAuthentication in0, java.lang.Long[] in1) throws java.rmi.RemoteException;
    public agora.folium.ws.WSEsito inserisciProtocolloNelFascicolo(agora.folium.ws.WSAuthentication in0, java.lang.Long in1, java.lang.Long in2) throws java.rmi.RemoteException;
}
