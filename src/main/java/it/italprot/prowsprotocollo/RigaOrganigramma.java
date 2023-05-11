/**
 * RigaOrganigramma.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package it.italprot.prowsprotocollo;

public class RigaOrganigramma  implements java.io.Serializable {
    private java.lang.String settore;

    private java.lang.String codiceUfficio;

    private java.lang.String descrizioneUfficio;

    private java.lang.String codiceUtente;

    private java.lang.String nominativo;

    private java.lang.String ruolo;

    public RigaOrganigramma() {
    }

    public RigaOrganigramma(
           java.lang.String settore,
           java.lang.String codiceUfficio,
           java.lang.String descrizioneUfficio,
           java.lang.String codiceUtente,
           java.lang.String nominativo,
           java.lang.String ruolo) {
           this.settore = settore;
           this.codiceUfficio = codiceUfficio;
           this.descrizioneUfficio = descrizioneUfficio;
           this.codiceUtente = codiceUtente;
           this.nominativo = nominativo;
           this.ruolo = ruolo;
    }


    /**
     * Gets the settore value for this RigaOrganigramma.
     * 
     * @return settore
     */
    public java.lang.String getSettore() {
        return settore;
    }


    /**
     * Sets the settore value for this RigaOrganigramma.
     * 
     * @param settore
     */
    public void setSettore(java.lang.String settore) {
        this.settore = settore;
    }


    /**
     * Gets the codiceUfficio value for this RigaOrganigramma.
     * 
     * @return codiceUfficio
     */
    public java.lang.String getCodiceUfficio() {
        return codiceUfficio;
    }


    /**
     * Sets the codiceUfficio value for this RigaOrganigramma.
     * 
     * @param codiceUfficio
     */
    public void setCodiceUfficio(java.lang.String codiceUfficio) {
        this.codiceUfficio = codiceUfficio;
    }


    /**
     * Gets the descrizioneUfficio value for this RigaOrganigramma.
     * 
     * @return descrizioneUfficio
     */
    public java.lang.String getDescrizioneUfficio() {
        return descrizioneUfficio;
    }


    /**
     * Sets the descrizioneUfficio value for this RigaOrganigramma.
     * 
     * @param descrizioneUfficio
     */
    public void setDescrizioneUfficio(java.lang.String descrizioneUfficio) {
        this.descrizioneUfficio = descrizioneUfficio;
    }


    /**
     * Gets the codiceUtente value for this RigaOrganigramma.
     * 
     * @return codiceUtente
     */
    public java.lang.String getCodiceUtente() {
        return codiceUtente;
    }


    /**
     * Sets the codiceUtente value for this RigaOrganigramma.
     * 
     * @param codiceUtente
     */
    public void setCodiceUtente(java.lang.String codiceUtente) {
        this.codiceUtente = codiceUtente;
    }


    /**
     * Gets the nominativo value for this RigaOrganigramma.
     * 
     * @return nominativo
     */
    public java.lang.String getNominativo() {
        return nominativo;
    }


    /**
     * Sets the nominativo value for this RigaOrganigramma.
     * 
     * @param nominativo
     */
    public void setNominativo(java.lang.String nominativo) {
        this.nominativo = nominativo;
    }


    /**
     * Gets the ruolo value for this RigaOrganigramma.
     * 
     * @return ruolo
     */
    public java.lang.String getRuolo() {
        return ruolo;
    }


    /**
     * Sets the ruolo value for this RigaOrganigramma.
     * 
     * @param ruolo
     */
    public void setRuolo(java.lang.String ruolo) {
        this.ruolo = ruolo;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof RigaOrganigramma)) return false;
        RigaOrganigramma other = (RigaOrganigramma) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.settore==null && other.getSettore()==null) || 
             (this.settore!=null &&
              this.settore.equals(other.getSettore()))) &&
            ((this.codiceUfficio==null && other.getCodiceUfficio()==null) || 
             (this.codiceUfficio!=null &&
              this.codiceUfficio.equals(other.getCodiceUfficio()))) &&
            ((this.descrizioneUfficio==null && other.getDescrizioneUfficio()==null) || 
             (this.descrizioneUfficio!=null &&
              this.descrizioneUfficio.equals(other.getDescrizioneUfficio()))) &&
            ((this.codiceUtente==null && other.getCodiceUtente()==null) || 
             (this.codiceUtente!=null &&
              this.codiceUtente.equals(other.getCodiceUtente()))) &&
            ((this.nominativo==null && other.getNominativo()==null) || 
             (this.nominativo!=null &&
              this.nominativo.equals(other.getNominativo()))) &&
            ((this.ruolo==null && other.getRuolo()==null) || 
             (this.ruolo!=null &&
              this.ruolo.equals(other.getRuolo())));
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
        if (getSettore() != null) {
            _hashCode += getSettore().hashCode();
        }
        if (getCodiceUfficio() != null) {
            _hashCode += getCodiceUfficio().hashCode();
        }
        if (getDescrizioneUfficio() != null) {
            _hashCode += getDescrizioneUfficio().hashCode();
        }
        if (getCodiceUtente() != null) {
            _hashCode += getCodiceUtente().hashCode();
        }
        if (getNominativo() != null) {
            _hashCode += getNominativo().hashCode();
        }
        if (getRuolo() != null) {
            _hashCode += getRuolo().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(RigaOrganigramma.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:proWsProtocollo", "rigaOrganigramma"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("settore");
        elemField.setXmlName(new javax.xml.namespace.QName("", "settore"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codiceUfficio");
        elemField.setXmlName(new javax.xml.namespace.QName("", "codiceUfficio"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("descrizioneUfficio");
        elemField.setXmlName(new javax.xml.namespace.QName("", "descrizioneUfficio"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codiceUtente");
        elemField.setXmlName(new javax.xml.namespace.QName("", "codiceUtente"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nominativo");
        elemField.setXmlName(new javax.xml.namespace.QName("", "nominativo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ruolo");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ruolo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
