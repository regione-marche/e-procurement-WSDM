/**
 * LoginRet.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package it.prisma.docarea.protosoap;

public class LoginRet  implements java.io.Serializable {
    private java.lang.String strDST;

    private long lngErrNumber;

    private java.lang.String strErrString;

    public LoginRet() {
    }

    public LoginRet(
           java.lang.String strDST,
           long lngErrNumber,
           java.lang.String strErrString) {
           this.strDST = strDST;
           this.lngErrNumber = lngErrNumber;
           this.strErrString = strErrString;
    }


    /**
     * Gets the strDST value for this LoginRet.
     * 
     * @return strDST
     */
    public java.lang.String getStrDST() {
        return strDST;
    }


    /**
     * Sets the strDST value for this LoginRet.
     * 
     * @param strDST
     */
    public void setStrDST(java.lang.String strDST) {
        this.strDST = strDST;
    }


    /**
     * Gets the lngErrNumber value for this LoginRet.
     * 
     * @return lngErrNumber
     */
    public long getLngErrNumber() {
        return lngErrNumber;
    }


    /**
     * Sets the lngErrNumber value for this LoginRet.
     * 
     * @param lngErrNumber
     */
    public void setLngErrNumber(long lngErrNumber) {
        this.lngErrNumber = lngErrNumber;
    }


    /**
     * Gets the strErrString value for this LoginRet.
     * 
     * @return strErrString
     */
    public java.lang.String getStrErrString() {
        return strErrString;
    }


    /**
     * Sets the strErrString value for this LoginRet.
     * 
     * @param strErrString
     */
    public void setStrErrString(java.lang.String strErrString) {
        this.strErrString = strErrString;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof LoginRet)) return false;
        LoginRet other = (LoginRet) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.strDST==null && other.getStrDST()==null) || 
             (this.strDST!=null &&
              this.strDST.equals(other.getStrDST()))) &&
            this.lngErrNumber == other.getLngErrNumber() &&
            ((this.strErrString==null && other.getStrErrString()==null) || 
             (this.strErrString!=null &&
              this.strErrString.equals(other.getStrErrString())));
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
        if (getStrDST() != null) {
            _hashCode += getStrDST().hashCode();
        }
        _hashCode += new Long(getLngErrNumber()).hashCode();
        if (getStrErrString() != null) {
            _hashCode += getStrErrString().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(LoginRet.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", "LoginRet"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("strDST");
        elemField.setXmlName(new javax.xml.namespace.QName("", "strDST"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lngErrNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("", "lngErrNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("strErrString");
        elemField.setXmlName(new javax.xml.namespace.QName("", "strErrString"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
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
