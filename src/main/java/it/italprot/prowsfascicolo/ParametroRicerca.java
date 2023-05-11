/**
 * ParametroRicerca.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package it.italprot.prowsfascicolo;

public class ParametroRicerca  implements java.io.Serializable {
    private java.lang.String chiave;

    private java.lang.String valore;

    public ParametroRicerca() {
    }

    public ParametroRicerca(
           java.lang.String chiave,
           java.lang.String valore) {
           this.chiave = chiave;
           this.valore = valore;
    }


    /**
     * Gets the chiave value for this ParametroRicerca.
     * 
     * @return chiave
     */
    public java.lang.String getChiave() {
        return chiave;
    }


    /**
     * Sets the chiave value for this ParametroRicerca.
     * 
     * @param chiave
     */
    public void setChiave(java.lang.String chiave) {
        this.chiave = chiave;
    }


    /**
     * Gets the valore value for this ParametroRicerca.
     * 
     * @return valore
     */
    public java.lang.String getValore() {
        return valore;
    }


    /**
     * Sets the valore value for this ParametroRicerca.
     * 
     * @param valore
     */
    public void setValore(java.lang.String valore) {
        this.valore = valore;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ParametroRicerca)) return false;
        ParametroRicerca other = (ParametroRicerca) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.chiave==null && other.getChiave()==null) || 
             (this.chiave!=null &&
              this.chiave.equals(other.getChiave()))) &&
            ((this.valore==null && other.getValore()==null) || 
             (this.valore!=null &&
              this.valore.equals(other.getValore())));
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
        if (getChiave() != null) {
            _hashCode += getChiave().hashCode();
        }
        if (getValore() != null) {
            _hashCode += getValore().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ParametroRicerca.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:proWsFascicolo", "parametroRicerca"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("chiave");
        elemField.setXmlName(new javax.xml.namespace.QName("", "chiave"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("valore");
        elemField.setXmlName(new javax.xml.namespace.QName("", "valore"));
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
