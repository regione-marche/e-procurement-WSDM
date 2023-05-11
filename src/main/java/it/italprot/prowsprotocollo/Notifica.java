/**
 * Notifica.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package it.italprot.prowsprotocollo;

public class Notifica  implements java.io.Serializable {
    private java.lang.String rowidmail;

    private java.lang.String tipomail;

    public Notifica() {
    }

    public Notifica(
           java.lang.String rowidmail,
           java.lang.String tipomail) {
           this.rowidmail = rowidmail;
           this.tipomail = tipomail;
    }


    /**
     * Gets the rowidmail value for this Notifica.
     * 
     * @return rowidmail
     */
    public java.lang.String getRowidmail() {
        return rowidmail;
    }


    /**
     * Sets the rowidmail value for this Notifica.
     * 
     * @param rowidmail
     */
    public void setRowidmail(java.lang.String rowidmail) {
        this.rowidmail = rowidmail;
    }


    /**
     * Gets the tipomail value for this Notifica.
     * 
     * @return tipomail
     */
    public java.lang.String getTipomail() {
        return tipomail;
    }


    /**
     * Sets the tipomail value for this Notifica.
     * 
     * @param tipomail
     */
    public void setTipomail(java.lang.String tipomail) {
        this.tipomail = tipomail;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Notifica)) return false;
        Notifica other = (Notifica) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.rowidmail==null && other.getRowidmail()==null) || 
             (this.rowidmail!=null &&
              this.rowidmail.equals(other.getRowidmail()))) &&
            ((this.tipomail==null && other.getTipomail()==null) || 
             (this.tipomail!=null &&
              this.tipomail.equals(other.getTipomail())));
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
        if (getRowidmail() != null) {
            _hashCode += getRowidmail().hashCode();
        }
        if (getTipomail() != null) {
            _hashCode += getTipomail().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Notifica.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:proWsProtocollo", "notifica"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rowidmail");
        elemField.setXmlName(new javax.xml.namespace.QName("", "rowidmail"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tipomail");
        elemField.setXmlName(new javax.xml.namespace.QName("", "tipomail"));
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
