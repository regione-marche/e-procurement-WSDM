/**
 * PresaInCarico.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package folium2.protocollowebservice;

public class PresaInCarico  implements java.io.Serializable {
    private boolean accepted;

    private java.lang.Long assegnazioneId;

    private java.lang.String motivazione;

    private java.lang.String utenteAssegnatarioId;

    public PresaInCarico() {
    }

    public PresaInCarico(
           boolean accepted,
           java.lang.Long assegnazioneId,
           java.lang.String motivazione,
           java.lang.String utenteAssegnatarioId) {
           this.accepted = accepted;
           this.assegnazioneId = assegnazioneId;
           this.motivazione = motivazione;
           this.utenteAssegnatarioId = utenteAssegnatarioId;
    }


    /**
     * Gets the accepted value for this PresaInCarico.
     * 
     * @return accepted
     */
    public boolean isAccepted() {
        return accepted;
    }


    /**
     * Sets the accepted value for this PresaInCarico.
     * 
     * @param accepted
     */
    public void setAccepted(boolean accepted) {
        this.accepted = accepted;
    }


    /**
     * Gets the assegnazioneId value for this PresaInCarico.
     * 
     * @return assegnazioneId
     */
    public java.lang.Long getAssegnazioneId() {
        return assegnazioneId;
    }


    /**
     * Sets the assegnazioneId value for this PresaInCarico.
     * 
     * @param assegnazioneId
     */
    public void setAssegnazioneId(java.lang.Long assegnazioneId) {
        this.assegnazioneId = assegnazioneId;
    }


    /**
     * Gets the motivazione value for this PresaInCarico.
     * 
     * @return motivazione
     */
    public java.lang.String getMotivazione() {
        return motivazione;
    }


    /**
     * Sets the motivazione value for this PresaInCarico.
     * 
     * @param motivazione
     */
    public void setMotivazione(java.lang.String motivazione) {
        this.motivazione = motivazione;
    }


    /**
     * Gets the utenteAssegnatarioId value for this PresaInCarico.
     * 
     * @return utenteAssegnatarioId
     */
    public java.lang.String getUtenteAssegnatarioId() {
        return utenteAssegnatarioId;
    }


    /**
     * Sets the utenteAssegnatarioId value for this PresaInCarico.
     * 
     * @param utenteAssegnatarioId
     */
    public void setUtenteAssegnatarioId(java.lang.String utenteAssegnatarioId) {
        this.utenteAssegnatarioId = utenteAssegnatarioId;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PresaInCarico)) return false;
        PresaInCarico other = (PresaInCarico) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.accepted == other.isAccepted() &&
            ((this.assegnazioneId==null && other.getAssegnazioneId()==null) || 
             (this.assegnazioneId!=null &&
              this.assegnazioneId.equals(other.getAssegnazioneId()))) &&
            ((this.motivazione==null && other.getMotivazione()==null) || 
             (this.motivazione!=null &&
              this.motivazione.equals(other.getMotivazione()))) &&
            ((this.utenteAssegnatarioId==null && other.getUtenteAssegnatarioId()==null) || 
             (this.utenteAssegnatarioId!=null &&
              this.utenteAssegnatarioId.equals(other.getUtenteAssegnatarioId())));
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
        _hashCode += (isAccepted() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getAssegnazioneId() != null) {
            _hashCode += getAssegnazioneId().hashCode();
        }
        if (getMotivazione() != null) {
            _hashCode += getMotivazione().hashCode();
        }
        if (getUtenteAssegnatarioId() != null) {
            _hashCode += getUtenteAssegnatarioId().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(PresaInCarico.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://type.ws.folium.agora", "PresaInCarico"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("accepted");
        elemField.setXmlName(new javax.xml.namespace.QName("", "accepted"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("assegnazioneId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "assegnazioneId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "long"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("motivazione");
        elemField.setXmlName(new javax.xml.namespace.QName("", "motivazione"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("utenteAssegnatarioId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "utenteAssegnatarioId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
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
