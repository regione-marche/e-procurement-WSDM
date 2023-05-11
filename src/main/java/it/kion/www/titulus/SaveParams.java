/**
 * SaveParams.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package it.kion.www.titulus;

public class SaveParams  implements java.io.Serializable {
    private boolean pdfConversion;

    private boolean sendEMail;

    public SaveParams() {
    }

    public SaveParams(
           boolean pdfConversion,
           boolean sendEMail) {
           this.pdfConversion = pdfConversion;
           this.sendEMail = sendEMail;
    }


    /**
     * Gets the pdfConversion value for this SaveParams.
     * 
     * @return pdfConversion
     */
    public boolean isPdfConversion() {
        return pdfConversion;
    }


    /**
     * Sets the pdfConversion value for this SaveParams.
     * 
     * @param pdfConversion
     */
    public void setPdfConversion(boolean pdfConversion) {
        this.pdfConversion = pdfConversion;
    }


    /**
     * Gets the sendEMail value for this SaveParams.
     * 
     * @return sendEMail
     */
    public boolean isSendEMail() {
        return sendEMail;
    }


    /**
     * Sets the sendEMail value for this SaveParams.
     * 
     * @param sendEMail
     */
    public void setSendEMail(boolean sendEMail) {
        this.sendEMail = sendEMail;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SaveParams)) return false;
        SaveParams other = (SaveParams) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.pdfConversion == other.isPdfConversion() &&
            this.sendEMail == other.isSendEMail();
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
        _hashCode += (isPdfConversion() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isSendEMail() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SaveParams.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.kion.it/titulus", "SaveParams"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pdfConversion");
        elemField.setXmlName(new javax.xml.namespace.QName("", "pdfConversion"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sendEMail");
        elemField.setXmlName(new javax.xml.namespace.QName("", "sendEMail"));
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
