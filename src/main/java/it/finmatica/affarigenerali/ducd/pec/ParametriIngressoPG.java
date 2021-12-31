/**
 * ParametriIngressoPG.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package it.finmatica.affarigenerali.ducd.pec;

public class ParametriIngressoPG  implements java.io.Serializable {
    private int anno;

    private java.lang.String listaDestinatari;

    private int numero;

    private java.lang.String tipoRegistro;

    private java.lang.String utente_creazione;

    private boolean invioSingolo;

    private boolean segnaturaCompleta;

    private boolean senzaSegnatura;

    public ParametriIngressoPG() {
    }

    public ParametriIngressoPG(
           int anno,
           java.lang.String listaDestinatari,
           int numero,
           java.lang.String tipoRegistro,
           java.lang.String utente_creazione,
           boolean invioSingolo,
           boolean segnaturaCompleta,
           boolean senzaSegnatura) {
           this.anno = anno;
           this.listaDestinatari = listaDestinatari;
           this.numero = numero;
           this.tipoRegistro = tipoRegistro;
           this.utente_creazione = utente_creazione;
           this.invioSingolo = invioSingolo;
           this.segnaturaCompleta = segnaturaCompleta;
           this.senzaSegnatura = senzaSegnatura;
    }


    /**
     * Gets the anno value for this ParametriIngressoPG.
     * 
     * @return anno
     */
    public int getAnno() {
        return anno;
    }


    /**
     * Sets the anno value for this ParametriIngressoPG.
     * 
     * @param anno
     */
    public void setAnno(int anno) {
        this.anno = anno;
    }


    /**
     * Gets the listaDestinatari value for this ParametriIngressoPG.
     * 
     * @return listaDestinatari
     */
    public java.lang.String getListaDestinatari() {
        return listaDestinatari;
    }


    /**
     * Sets the listaDestinatari value for this ParametriIngressoPG.
     * 
     * @param listaDestinatari
     */
    public void setListaDestinatari(java.lang.String listaDestinatari) {
        this.listaDestinatari = listaDestinatari;
    }


    /**
     * Gets the numero value for this ParametriIngressoPG.
     * 
     * @return numero
     */
    public int getNumero() {
        return numero;
    }


    /**
     * Sets the numero value for this ParametriIngressoPG.
     * 
     * @param numero
     */
    public void setNumero(int numero) {
        this.numero = numero;
    }


    /**
     * Gets the tipoRegistro value for this ParametriIngressoPG.
     * 
     * @return tipoRegistro
     */
    public java.lang.String getTipoRegistro() {
        return tipoRegistro;
    }


    /**
     * Sets the tipoRegistro value for this ParametriIngressoPG.
     * 
     * @param tipoRegistro
     */
    public void setTipoRegistro(java.lang.String tipoRegistro) {
        this.tipoRegistro = tipoRegistro;
    }


    /**
     * Gets the utente_creazione value for this ParametriIngressoPG.
     * 
     * @return utente_creazione
     */
    public java.lang.String getUtente_creazione() {
        return utente_creazione;
    }


    /**
     * Sets the utente_creazione value for this ParametriIngressoPG.
     * 
     * @param utente_creazione
     */
    public void setUtente_creazione(java.lang.String utente_creazione) {
        this.utente_creazione = utente_creazione;
    }


    /**
     * Gets the invioSingolo value for this ParametriIngressoPG.
     * 
     * @return invioSingolo
     */
    public boolean isInvioSingolo() {
        return invioSingolo;
    }


    /**
     * Sets the invioSingolo value for this ParametriIngressoPG.
     * 
     * @param invioSingolo
     */
    public void setInvioSingolo(boolean invioSingolo) {
        this.invioSingolo = invioSingolo;
    }


    /**
     * Gets the segnaturaCompleta value for this ParametriIngressoPG.
     * 
     * @return segnaturaCompleta
     */
    public boolean isSegnaturaCompleta() {
        return segnaturaCompleta;
    }


    /**
     * Sets the segnaturaCompleta value for this ParametriIngressoPG.
     * 
     * @param segnaturaCompleta
     */
    public void setSegnaturaCompleta(boolean segnaturaCompleta) {
        this.segnaturaCompleta = segnaturaCompleta;
    }


    /**
     * Gets the senzaSegnatura value for this ParametriIngressoPG.
     * 
     * @return senzaSegnatura
     */
    public boolean isSenzaSegnatura() {
        return senzaSegnatura;
    }


    /**
     * Sets the senzaSegnatura value for this ParametriIngressoPG.
     * 
     * @param senzaSegnatura
     */
    public void setSenzaSegnatura(boolean senzaSegnatura) {
        this.senzaSegnatura = senzaSegnatura;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ParametriIngressoPG)) return false;
        ParametriIngressoPG other = (ParametriIngressoPG) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.anno == other.getAnno() &&
            ((this.listaDestinatari==null && other.getListaDestinatari()==null) || 
             (this.listaDestinatari!=null &&
              this.listaDestinatari.equals(other.getListaDestinatari()))) &&
            this.numero == other.getNumero() &&
            ((this.tipoRegistro==null && other.getTipoRegistro()==null) || 
             (this.tipoRegistro!=null &&
              this.tipoRegistro.equals(other.getTipoRegistro()))) &&
            ((this.utente_creazione==null && other.getUtente_creazione()==null) || 
             (this.utente_creazione!=null &&
              this.utente_creazione.equals(other.getUtente_creazione()))) &&
            this.invioSingolo == other.isInvioSingolo() &&
            this.segnaturaCompleta == other.isSegnaturaCompleta() &&
            this.senzaSegnatura == other.isSenzaSegnatura();
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        _hashCode += getAnno();
        if (getListaDestinatari() != null) {
            _hashCode += getListaDestinatari().hashCode();
        }
        _hashCode += getNumero();
        if (getTipoRegistro() != null) {
            _hashCode += getTipoRegistro().hashCode();
        }
        if (getUtente_creazione() != null) {
            _hashCode += getUtente_creazione().hashCode();
        }
        _hashCode += (isInvioSingolo() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isSegnaturaCompleta() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isSenzaSegnatura() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ParametriIngressoPG.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://pec.ducd.affarigenerali.finmatica.it", "ParametriIngressoPG"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("anno");
        elemField.setXmlName(new javax.xml.namespace.QName("http://pec.ducd.affarigenerali.finmatica.it", "anno"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("listaDestinatari");
        elemField.setXmlName(new javax.xml.namespace.QName("http://pec.ducd.affarigenerali.finmatica.it", "listaDestinatari"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numero");
        elemField.setXmlName(new javax.xml.namespace.QName("http://pec.ducd.affarigenerali.finmatica.it", "numero"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tipoRegistro");
        elemField.setXmlName(new javax.xml.namespace.QName("http://pec.ducd.affarigenerali.finmatica.it", "tipoRegistro"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("utente_creazione");
        elemField.setXmlName(new javax.xml.namespace.QName("http://pec.ducd.affarigenerali.finmatica.it", "utente_creazione"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("invioSingolo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://pec.ducd.affarigenerali.finmatica.it", "invioSingolo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("segnaturaCompleta");
        elemField.setXmlName(new javax.xml.namespace.QName("http://pec.ducd.affarigenerali.finmatica.it", "segnaturaCompleta"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("senzaSegnatura");
        elemField.setXmlName(new javax.xml.namespace.QName("http://pec.ducd.affarigenerali.finmatica.it", "senzaSegnatura"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
