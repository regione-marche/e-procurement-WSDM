/**
 * Acl4.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package it.cineca.titulus301.titulus_ws.services.Acl4;

public interface Acl4 extends java.rmi.Remote {
    public java.lang.String modify(java.lang.String id, java.lang.String xmlRecord) throws java.rmi.RemoteException;
    public java.lang.String setWSUser(java.lang.String user, java.lang.String pnumber) throws java.rmi.RemoteException;
    public java.lang.String titlePage(int pageIndex) throws java.rmi.RemoteException;
    public java.lang.String firstTitlePage() throws java.rmi.RemoteException;
    public java.lang.String nextTitlePage() throws java.rmi.RemoteException;
    public java.lang.String prevTitlePage() throws java.rmi.RemoteException;
    public java.lang.String lastTitlePage() throws java.rmi.RemoteException;
    public java.lang.String currentTitlePage() throws java.rmi.RemoteException;
    public boolean checkRight(java.lang.String code) throws java.rmi.RemoteException;
    public java.lang.String addInternalStructure(java.lang.String xmlStructure) throws java.rmi.RemoteException;
    public java.lang.String setUserProfile(java.lang.String id, java.lang.String keyProfile) throws java.rmi.RemoteException;
    public int updateUsersProfile(java.lang.String keyProfile) throws java.rmi.RemoteException;
    public java.lang.String addExternalStructure(java.lang.String xmlStructure) throws java.rmi.RemoteException;
    public java.lang.String addExternalUser(java.lang.String xmlUser) throws java.rmi.RemoteException;
    public java.lang.String addProfile(java.lang.String keyProfile, java.lang.String descProfile) throws java.rmi.RemoteException;
    public java.lang.String addUser(java.lang.String xmlUser) throws java.rmi.RemoteException;
    public boolean remove(java.lang.String id) throws java.rmi.RemoteException;
    public java.lang.String load(java.lang.String id, boolean lock) throws java.rmi.RemoteException;
    public java.lang.String lookup(java.lang.String nome_uff, java.lang.String nome_persona) throws java.rmi.RemoteException;
    public java.lang.String search(java.lang.String query, java.lang.String orderby, it.kion.www.titulus.QueryParams params) throws java.rmi.RemoteException;
    public boolean unlock(java.lang.String id) throws java.rmi.RemoteException;
}
