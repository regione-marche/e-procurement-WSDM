/**
 * ParametriIngresso.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package it.finmatica.affarigenerali.ducd.pec;

public class ParametriIngresso  implements java.io.Serializable {
    private int idDocumento;

    private java.lang.String listaDestinatari;

    private java.lang.String utente_creazione;

    private java.lang.String anno;

    private java.lang.String numero;

    private java.lang.String tipo_registro;

    private boolean invioSingolo;

    private boolean segnaturaCompleta;

    private boolean senzaSegnatura;

    public ParametriIngresso() {
    }

    public ParametriIngresso(
           int idDocumento,
           java.lang.String listaDestinatari,
           java.lang.String utente_creazione,
           java.lang.String anno,
           java.lang.String numero,
           java.lang.String tipo_registro,
           boolean invioSingolo,
           boolean segnaturaCompleta,
           boolean senzaSegnatura) {
           this.idDocumento = idDocumento;
           this.listaDestinatari = listaDestinatari;
           this.utente_creazione = utente_creazione;
           this.anno = anno;
           this.numero = numero;
           this.tipo_registro = tipo_registro;
           this.invioSingolo = invioSingolo;
           this.segnaturaCompleta = segnaturaCompleta;
           this.senzaSegnatura = senzaSegnatura;
    }


    /**
     * Gets the idDocumento value for this ParametriIngresso.
     * 
     * @return idDocumento
     */
    public int getIdDocumento() {
        return idDocumento;
    }


    /**
     * Sets the idDocumento value for this ParametriIngresso.
     * 
     * @param idDocumento
     */
    public void setIdDocumento(int idDocumento) {
        this.idDocumento = idDocumento;
    }


    /**
     * Gets the listaDestinatari value for this ParametriIngresso.
     * 
     * @return listaDestinatari
     */
    public java.lang.String getListaDestinatari() {
        return listaDestinatari;
    }


    /**
     * Sets the listaDestinatari value for this ParametriIngresso.
     * 
     * @param listaDestinatari
     */
    public void setListaDestinatari(java.lang.String listaDestinatari) {
        this.listaDestinatari = listaDestinatari;
    }


    /**
     * Gets the utente_creazione value for this ParametriIngresso.
     * 
     * @return utente_creazione
     */
    public java.lang.String getUtente_creazione() {
        return utente_creazione;
    }


    /**
     * Sets the utente_creazione value for this ParametriIngresso.
     * 
     * @param utente_creazione
     */
    public void setUtente_creazione(java.lang.String utente_creazione) {
        this.utente_creazione = utente_creazione;
    }


    /**
     * Gets the anno value for this ParametriIngresso.
     * 
     * @return anno
     */
    public java.lang.String getAnno() {
        return anno;
    }


    /**
     * Sets the anno value for this ParametriIngresso.
     * 
     * @param anno
     */
    public void setAnno(java.lang.String anno) {
        this.anno = anno;
    }


    /**
     * Gets the numero value for this ParametriIngresso.
     * 
     * @return numero
     */
    public java.lang.String getNumero() {
        return numero;
    }


    /**
     * Sets the numero value for this ParametriIngresso.
     * 
     * @param numero
     */
    public void setNumero(java.lang.String numero) {
        this.numero = numero;
    }


    /**
     * Gets the tipo_registro value for this ParametriIngresso.
     * 
     * @return tipo_registro
     */
    public java.lang.String getTipo_registro() {
        return tipo_registro;
    }


    /**
     * Sets the tipo_registro value for this ParametriIngresso.
     * 
     * @param tipo_registro
     */
    public void setTipo_registro(java.lang.String tipo_registro) {
        this.tipo_registro = tipo_registro;
    }


    /**
     * Gets the invioSingolo value for this ParametriIngresso.
     * 
     * @return invioSingolo
     */
    public boolean isInvioSingolo() {
        return invioSingolo;
    }


    /**
     * Sets the invioSingolo value for this ParametriIngresso.
     * 
     * @param invioSingolo
     */
    public void setInvioSingolo(boolean invioSingolo) {
        this.invioSingolo = invioSingolo;
    }


    /**
     * Gets the segnaturaCompleta value for this ParametriIngresso.
     * 
     * @return segnaturaCompleta
     */
    public boolean isSegnaturaCompleta() {
        return segnaturaCompleta;
    }


    /**
     * Sets the segnaturaCompleta value for this ParametriIngresso.
     * 
     * @param segnaturaCompleta
     */
    public void setSegnaturaCompleta(boolean segnaturaCompleta) {
        this.segnaturaCompleta = segnaturaCompleta;
    }


    /**
     * Gets the senzaSegnatura value for this ParametriIngresso.
     * 
     * @return senzaSegnatura
     */
    public boolean isSenzaSegnatura() {
        return senzaSegnatura;
    }


    /**
     * Sets the senzaSegnatura value for this ParametriIngresso.
     * 
     * @param senzaSegnatura
     */
    public void setSenzaSegnatura(boolean senzaSegnatura) {
        this.senzaSegnatura = senzaSegnatura;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ParametriIngresso)) return false;
        ParametriIngresso other = (ParametriIngresso) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.idDocumento == other.getIdDocumento() &&
            ((this.listaDestinatari==null && other.getListaDestinatari()==null) || 
             (this.listaDestinatari!=null &&
              this.listaDestinatari.equals(other.getListaDestinatari()))) &&
            ((this.utente_creazione==null && other.getUtente_creazione()==null) || 
             (this.utente_creazione!=null &&
              this.utente_creazione.equals(other.getUtente_creazione()))) &&
            ((this.anno==null && other.getAnno()==null) || 
             (this.anno!=null &&
              this.anno.equals(other.getAnno()))) &&
            ((this.numero==null && other.getNumero()==null) || 
             (this.numero!=null &&
              this.numero.equals(other.getNumero()))) &&
            ((this.tipo_registro==null && other.getTipo_registro()==null) || 
             (this.tipo_registro!=null &&
              this.tipo_registro.equals(other.getTipo_registro()))) &&
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
        _hashCode += getIdDocumento();
        if (getListaDestinatari() != null) {
            _hashCode += getListaDestinatari().hashCode();
        }
        if (getUtente_creazione() != null) {
            _hashCode += getUtente_creazione().hashCode();
        }
        if (getAnno() != null) {
            _hashCode += getAnno().hashCode();
        }
        if (getNumero() != null) {
            _hashCode += getNumero().hashCode();
        }
        if (getTipo_registro() != null) {
            _hashCode += getTipo_registro().hashCode();
        }
        _hashCode += (isInvioSingolo() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isSegnaturaCompleta() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isSenzaSegnatura() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ParametriIngresso.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://pec.ducd.affarigenerali.finmatica.it", "ParametriIngresso"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("idDocumento");
        elemField.setXmlName(new javax.xml.namespace.QName("http://pec.ducd.affarigenerali.finmatica.it", "idDocumento"));
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
        elemField.setFieldName("utente_creazione");
        elemField.setXmlName(new javax.xml.namespace.QName("http://pec.ducd.affarigenerali.finmatica.it", "utente_creazione"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("anno");
        elemField.setXmlName(new javax.xml.namespace.QName("http://pec.ducd.affarigenerali.finmatica.it", "anno"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numero");
        elemField.setXmlName(new javax.xml.namespace.QName("http://pec.ducd.affarigenerali.finmatica.it", "numero"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tipo_registro");
        elemField.setXmlName(new javax.xml.namespace.QName("http://pec.ducd.affarigenerali.finmatica.it", "tipo_registro"));
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
