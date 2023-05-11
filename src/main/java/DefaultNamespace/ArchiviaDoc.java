/**
 * ArchiviaDoc.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package DefaultNamespace;

public interface ArchiviaDoc extends java.rmi.Remote {
    public DefaultNamespace.DOCRESPONSE ADDNEWDOC(java.lang.String ARCHIVIA, java.lang.String DATA, java.lang.String MITTENTE, java.lang.String DESTINATARIO, java.lang.String FASCICOLO, java.lang.String OGGETTO, java.lang.String PROTOCOLLA, java.lang.String INVIA, java.lang.String TIPO, java.lang.String NOTE, java.lang.String[] NOMEFILE, byte[][] BASE64FILE) throws java.rmi.RemoteException;
}
