/**
 * RetFascicolo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package it.italprot.prowsfascicolo;

public class RetFascicolo  implements java.io.Serializable {
    private java.lang.String codiceProtocollo;

    private java.lang.String codiceFascicolo;

    private java.lang.String codiceSottoFascicolo;

    public RetFascicolo() {
    }

    public RetFascicolo(
           java.lang.String codiceProtocollo,
           java.lang.String codiceFascicolo,
           java.lang.String codiceSottoFascicolo) {
           this.codiceProtocollo = codiceProtocollo;
           this.codiceFascicolo = codiceFascicolo;
           this.codiceSottoFascicolo = codiceSottoFascicolo;
    }


    /**
     * Gets the codiceProtocollo value for this RetFascicolo.
     * 
     * @return codiceProtocollo
     */
    public java.lang.String getCodiceProtocollo() {
        return codiceProtocollo;
    }


    /**
     * Sets the codiceProtocollo value for this RetFascicolo.
     * 
     * @param codiceProtocollo
     */
    public void setCodiceProtocollo(java.lang.String codiceProtocollo) {
        this.codiceProtocollo = codiceProtocollo;
    }


    /**
     * Gets the codiceFascicolo value for this RetFascicolo.
     * 
     * @return codiceFascicolo
     */
    public java.lang.String getCodiceFascicolo() {
        return codiceFascicolo;
    }


    /**
     * Sets the codiceFascicolo value for this RetFascicolo.
     * 
     * @param codiceFascicolo
     */
    public void setCodiceFascicolo(java.lang.String codiceFascicolo) {
        this.codiceFascicolo = codiceFascicolo;
    }


    /**
     * Gets the codiceSottoFascicolo value for this RetFascicolo.
     * 
     * @return codiceSottoFascicolo
     */
    public java.lang.String getCodiceSottoFascicolo() {
        return codiceSottoFascicolo;
    }


    /**
     * Sets the codiceSottoFascicolo value for this RetFascicolo.
     * 
     * @param codiceSottoFascicolo
     */
    public void setCodiceSottoFascicolo(java.lang.String codiceSottoFascicolo) {
        this.codiceSottoFascicolo = codiceSottoFascicolo;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof RetFascicolo)) return false;
        RetFascicolo other = (RetFascicolo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.codiceProtocollo==null && other.getCodiceProtocollo()==null) || 
             (this.codiceProtocollo!=null &&
              this.codiceProtocollo.equals(other.getCodiceProtocollo()))) &&
            ((this.codiceFascicolo==null && other.getCodiceFascicolo()==null) || 
             (this.codiceFascicolo!=null &&
              this.codiceFascicolo.equals(other.getCodiceFascicolo()))) &&
            ((this.codiceSottoFascicolo==null && other.getCodiceSottoFascicolo()==null) || 
             (this.codiceSottoFascicolo!=null &&
              this.codiceSottoFascicolo.equals(other.getCodiceSottoFascicolo())));
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
        if (getCodiceProtocollo() != null) {
            _hashCode += getCodiceProtocollo().hashCode();
        }
        if (getCodiceFascicolo() != null) {
            _hashCode += getCodiceFascicolo().hashCode();
        }
        if (getCodiceSottoFascicolo() != null) {
            _hashCode += getCodiceSottoFascicolo().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(RetFascicolo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:proWsFascicolo", "retFascicolo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codiceProtocollo");
        elemField.setXmlName(new javax.xml.namespace.QName("", "codiceProtocollo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codiceFascicolo");
        elemField.setXmlName(new javax.xml.namespace.QName("", "codiceFascicolo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codiceSottoFascicolo");
        elemField.setXmlName(new javax.xml.namespace.QName("", "codiceSottoFascicolo"));
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
