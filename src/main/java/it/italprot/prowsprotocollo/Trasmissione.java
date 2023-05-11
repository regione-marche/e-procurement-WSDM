/**
 * Trasmissione.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package it.italprot.prowsprotocollo;

public class Trasmissione  implements java.io.Serializable {
    private java.lang.String codiceDestinatario;

    private java.lang.String descrizioneDestinatario;

    private java.lang.String codiceUfficio;

    private java.lang.String descrizioneUfficio;

    private java.lang.String oggettoTrasmissione;

    private java.lang.Boolean gestione;

    private java.lang.Boolean responsabile;

    private it.italprot.prowsprotocollo.Notifica[] notificheMail;

    public Trasmissione() {
    }

    public Trasmissione(
           java.lang.String codiceDestinatario,
           java.lang.String descrizioneDestinatario,
           java.lang.String codiceUfficio,
           java.lang.String descrizioneUfficio,
           java.lang.String oggettoTrasmissione,
           java.lang.Boolean gestione,
           java.lang.Boolean responsabile,
           it.italprot.prowsprotocollo.Notifica[] notificheMail) {
           this.codiceDestinatario = codiceDestinatario;
           this.descrizioneDestinatario = descrizioneDestinatario;
           this.codiceUfficio = codiceUfficio;
           this.descrizioneUfficio = descrizioneUfficio;
           this.oggettoTrasmissione = oggettoTrasmissione;
           this.gestione = gestione;
           this.responsabile = responsabile;
           this.notificheMail = notificheMail;
    }


    /**
     * Gets the codiceDestinatario value for this Trasmissione.
     * 
     * @return codiceDestinatario
     */
    public java.lang.String getCodiceDestinatario() {
        return codiceDestinatario;
    }


    /**
     * Sets the codiceDestinatario value for this Trasmissione.
     * 
     * @param codiceDestinatario
     */
    public void setCodiceDestinatario(java.lang.String codiceDestinatario) {
        this.codiceDestinatario = codiceDestinatario;
    }


    /**
     * Gets the descrizioneDestinatario value for this Trasmissione.
     * 
     * @return descrizioneDestinatario
     */
    public java.lang.String getDescrizioneDestinatario() {
        return descrizioneDestinatario;
    }


    /**
     * Sets the descrizioneDestinatario value for this Trasmissione.
     * 
     * @param descrizioneDestinatario
     */
    public void setDescrizioneDestinatario(java.lang.String descrizioneDestinatario) {
        this.descrizioneDestinatario = descrizioneDestinatario;
    }


    /**
     * Gets the codiceUfficio value for this Trasmissione.
     * 
     * @return codiceUfficio
     */
    public java.lang.String getCodiceUfficio() {
        return codiceUfficio;
    }


    /**
     * Sets the codiceUfficio value for this Trasmissione.
     * 
     * @param codiceUfficio
     */
    public void setCodiceUfficio(java.lang.String codiceUfficio) {
        this.codiceUfficio = codiceUfficio;
    }


    /**
     * Gets the descrizioneUfficio value for this Trasmissione.
     * 
     * @return descrizioneUfficio
     */
    public java.lang.String getDescrizioneUfficio() {
        return descrizioneUfficio;
    }


    /**
     * Sets the descrizioneUfficio value for this Trasmissione.
     * 
     * @param descrizioneUfficio
     */
    public void setDescrizioneUfficio(java.lang.String descrizioneUfficio) {
        this.descrizioneUfficio = descrizioneUfficio;
    }


    /**
     * Gets the oggettoTrasmissione value for this Trasmissione.
     * 
     * @return oggettoTrasmissione
     */
    public java.lang.String getOggettoTrasmissione() {
        return oggettoTrasmissione;
    }


    /**
     * Sets the oggettoTrasmissione value for this Trasmissione.
     * 
     * @param oggettoTrasmissione
     */
    public void setOggettoTrasmissione(java.lang.String oggettoTrasmissione) {
        this.oggettoTrasmissione = oggettoTrasmissione;
    }


    /**
     * Gets the gestione value for this Trasmissione.
     * 
     * @return gestione
     */
    public java.lang.Boolean getGestione() {
        return gestione;
    }


    /**
     * Sets the gestione value for this Trasmissione.
     * 
     * @param gestione
     */
    public void setGestione(java.lang.Boolean gestione) {
        this.gestione = gestione;
    }


    /**
     * Gets the responsabile value for this Trasmissione.
     * 
     * @return responsabile
     */
    public java.lang.Boolean getResponsabile() {
        return responsabile;
    }


    /**
     * Sets the responsabile value for this Trasmissione.
     * 
     * @param responsabile
     */
    public void setResponsabile(java.lang.Boolean responsabile) {
        this.responsabile = responsabile;
    }


    /**
     * Gets the notificheMail value for this Trasmissione.
     * 
     * @return notificheMail
     */
    public it.italprot.prowsprotocollo.Notifica[] getNotificheMail() {
        return notificheMail;
    }


    /**
     * Sets the notificheMail value for this Trasmissione.
     * 
     * @param notificheMail
     */
    public void setNotificheMail(it.italprot.prowsprotocollo.Notifica[] notificheMail) {
        this.notificheMail = notificheMail;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Trasmissione)) return false;
        Trasmissione other = (Trasmissione) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.codiceDestinatario==null && other.getCodiceDestinatario()==null) || 
             (this.codiceDestinatario!=null &&
              this.codiceDestinatario.equals(other.getCodiceDestinatario()))) &&
            ((this.descrizioneDestinatario==null && other.getDescrizioneDestinatario()==null) || 
             (this.descrizioneDestinatario!=null &&
              this.descrizioneDestinatario.equals(other.getDescrizioneDestinatario()))) &&
            ((this.codiceUfficio==null && other.getCodiceUfficio()==null) || 
             (this.codiceUfficio!=null &&
              this.codiceUfficio.equals(other.getCodiceUfficio()))) &&
            ((this.descrizioneUfficio==null && other.getDescrizioneUfficio()==null) || 
             (this.descrizioneUfficio!=null &&
              this.descrizioneUfficio.equals(other.getDescrizioneUfficio()))) &&
            ((this.oggettoTrasmissione==null && other.getOggettoTrasmissione()==null) || 
             (this.oggettoTrasmissione!=null &&
              this.oggettoTrasmissione.equals(other.getOggettoTrasmissione()))) &&
            ((this.gestione==null && other.getGestione()==null) || 
             (this.gestione!=null &&
              this.gestione.equals(other.getGestione()))) &&
            ((this.responsabile==null && other.getResponsabile()==null) || 
             (this.responsabile!=null &&
              this.responsabile.equals(other.getResponsabile()))) &&
            ((this.notificheMail==null && other.getNotificheMail()==null) || 
             (this.notificheMail!=null &&
              java.util.Arrays.equals(this.notificheMail, other.getNotificheMail())));
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
        if (getCodiceDestinatario() != null) {
            _hashCode += getCodiceDestinatario().hashCode();
        }
        if (getDescrizioneDestinatario() != null) {
            _hashCode += getDescrizioneDestinatario().hashCode();
        }
        if (getCodiceUfficio() != null) {
            _hashCode += getCodiceUfficio().hashCode();
        }
        if (getDescrizioneUfficio() != null) {
            _hashCode += getDescrizioneUfficio().hashCode();
        }
        if (getOggettoTrasmissione() != null) {
            _hashCode += getOggettoTrasmissione().hashCode();
        }
        if (getGestione() != null) {
            _hashCode += getGestione().hashCode();
        }
        if (getResponsabile() != null) {
            _hashCode += getResponsabile().hashCode();
        }
        if (getNotificheMail() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getNotificheMail());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getNotificheMail(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Trasmissione.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:proWsProtocollo", "trasmissione"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codiceDestinatario");
        elemField.setXmlName(new javax.xml.namespace.QName("", "codiceDestinatario"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("descrizioneDestinatario");
        elemField.setXmlName(new javax.xml.namespace.QName("", "descrizioneDestinatario"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
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
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("oggettoTrasmissione");
        elemField.setXmlName(new javax.xml.namespace.QName("", "oggettoTrasmissione"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("gestione");
        elemField.setXmlName(new javax.xml.namespace.QName("", "gestione"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("responsabile");
        elemField.setXmlName(new javax.xml.namespace.QName("", "responsabile"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("notificheMail");
        elemField.setXmlName(new javax.xml.namespace.QName("", "notificheMail"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:proWsProtocollo", "notifica"));
        elemField.setMinOccurs(0);
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
