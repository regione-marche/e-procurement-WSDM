/**
 * RetDocumento.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package it.italprot.prowsprotocollo;

public class RetDocumento  implements java.io.Serializable {
    private java.lang.String rowidDocumento;

    private java.lang.String annoDocumento;

    private java.lang.String numeroDocumento;

    public RetDocumento() {
    }

    public RetDocumento(
           java.lang.String rowidDocumento,
           java.lang.String annoDocumento,
           java.lang.String numeroDocumento) {
           this.rowidDocumento = rowidDocumento;
           this.annoDocumento = annoDocumento;
           this.numeroDocumento = numeroDocumento;
    }


    /**
     * Gets the rowidDocumento value for this RetDocumento.
     * 
     * @return rowidDocumento
     */
    public java.lang.String getRowidDocumento() {
        return rowidDocumento;
    }


    /**
     * Sets the rowidDocumento value for this RetDocumento.
     * 
     * @param rowidDocumento
     */
    public void setRowidDocumento(java.lang.String rowidDocumento) {
        this.rowidDocumento = rowidDocumento;
    }


    /**
     * Gets the annoDocumento value for this RetDocumento.
     * 
     * @return annoDocumento
     */
    public java.lang.String getAnnoDocumento() {
        return annoDocumento;
    }


    /**
     * Sets the annoDocumento value for this RetDocumento.
     * 
     * @param annoDocumento
     */
    public void setAnnoDocumento(java.lang.String annoDocumento) {
        this.annoDocumento = annoDocumento;
    }


    /**
     * Gets the numeroDocumento value for this RetDocumento.
     * 
     * @return numeroDocumento
     */
    public java.lang.String getNumeroDocumento() {
        return numeroDocumento;
    }


    /**
     * Sets the numeroDocumento value for this RetDocumento.
     * 
     * @param numeroDocumento
     */
    public void setNumeroDocumento(java.lang.String numeroDocumento) {
        this.numeroDocumento = numeroDocumento;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof RetDocumento)) return false;
        RetDocumento other = (RetDocumento) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.rowidDocumento==null && other.getRowidDocumento()==null) || 
             (this.rowidDocumento!=null &&
              this.rowidDocumento.equals(other.getRowidDocumento()))) &&
            ((this.annoDocumento==null && other.getAnnoDocumento()==null) || 
             (this.annoDocumento!=null &&
              this.annoDocumento.equals(other.getAnnoDocumento()))) &&
            ((this.numeroDocumento==null && other.getNumeroDocumento()==null) || 
             (this.numeroDocumento!=null &&
              this.numeroDocumento.equals(other.getNumeroDocumento())));
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
        if (getRowidDocumento() != null) {
            _hashCode += getRowidDocumento().hashCode();
        }
        if (getAnnoDocumento() != null) {
            _hashCode += getAnnoDocumento().hashCode();
        }
        if (getNumeroDocumento() != null) {
            _hashCode += getNumeroDocumento().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(RetDocumento.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:proWsProtocollo", "retDocumento"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rowidDocumento");
        elemField.setXmlName(new javax.xml.namespace.QName("", "rowidDocumento"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("annoDocumento");
        elemField.setXmlName(new javax.xml.namespace.QName("", "annoDocumento"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numeroDocumento");
        elemField.setXmlName(new javax.xml.namespace.QName("", "numeroDocumento"));
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
