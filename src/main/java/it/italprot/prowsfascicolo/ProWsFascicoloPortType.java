/**
 * ProWsFascicoloPortType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package it.italprot.prowsfascicolo;

public interface ProWsFascicoloPortType extends java.rmi.Remote {
    public java.lang.String getItaEngineContextToken(java.lang.String userName, java.lang.String userPassword, java.lang.String domainCode) throws java.rmi.RemoteException;
    public void getItaEngineContextTokenInfo(java.lang.String token, java.lang.String domainCode, javax.xml.rpc.holders.StringHolder userName, javax.xml.rpc.holders.StringHolder userCode) throws java.rmi.RemoteException;
    public java.lang.String checkItaEngineContextToken(java.lang.String token, java.lang.String domainCode) throws java.rmi.RemoteException;
    public java.lang.String destroyItaEngineContextToken(java.lang.String token, java.lang.String domainCode) throws java.rmi.RemoteException;
    public void creaFascicolo(java.lang.String token, it.italprot.prowsfascicolo.DatiFascicolo datiFascicolo, it.italprot.prowsfascicolo.holders.DettaglioFascicoloHolder datiFascicolo2, it.italprot.prowsfascicolo.holders.MessageResultHolder messageResult) throws java.rmi.RemoteException;
    public void fascicolaProtocollo(java.lang.String token, java.lang.String annoProtocollo, java.lang.String numeroProtocollo, java.lang.String tipoProtocollo, java.lang.String codiceFascicolo, java.lang.String codiceSottoFascicolo, it.italprot.prowsfascicolo.holders.RetFascicoloHolder retDatiFascicolo, it.italprot.prowsfascicolo.holders.MessageResultHolder messageResult) throws java.rmi.RemoteException;
    public void getFascicoliProtocollo(java.lang.String token, java.lang.String annoProtocollo, java.lang.String numeroProtocollo, java.lang.String tipoProtocollo, it.italprot.prowsfascicolo.holders.ListaFascicoliHolder elencoFascicoli, it.italprot.prowsfascicolo.holders.MessageResultHolder messageResult) throws java.rmi.RemoteException;
    public void getElencoFascicoli(java.lang.String token, it.italprot.prowsfascicolo.ParametroRicerca[] arrayParamRicerca, it.italprot.prowsfascicolo.holders.ElencoFascicoliHolder elencoFascicoli, it.italprot.prowsfascicolo.holders.MessageResultHolder messageResult) throws java.rmi.RemoteException;
}
