/**
 * SottoFascicolo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package it.italprot.prowsfascicolo;

public class SottoFascicolo  implements java.io.Serializable {
    private java.lang.String codiceSottofascicolo;

    private java.lang.String descrizioneSottofascicolo;

    private it.italprot.prowsfascicolo.SottoFascicolo[][] sottoFascicoli;

    public SottoFascicolo() {
    }

    public SottoFascicolo(
           java.lang.String codiceSottofascicolo,
           java.lang.String descrizioneSottofascicolo,
           it.italprot.prowsfascicolo.SottoFascicolo[][] sottoFascicoli) {
           this.codiceSottofascicolo = codiceSottofascicolo;
           this.descrizioneSottofascicolo = descrizioneSottofascicolo;
           this.sottoFascicoli = sottoFascicoli;
    }


    /**
     * Gets the codiceSottofascicolo value for this SottoFascicolo.
     * 
     * @return codiceSottofascicolo
     */
    public java.lang.String getCodiceSottofascicolo() {
        return codiceSottofascicolo;
    }


    /**
     * Sets the codiceSottofascicolo value for this SottoFascicolo.
     * 
     * @param codiceSottofascicolo
     */
    public void setCodiceSottofascicolo(java.lang.String codiceSottofascicolo) {
        this.codiceSottofascicolo = codiceSottofascicolo;
    }


    /**
     * Gets the descrizioneSottofascicolo value for this SottoFascicolo.
     * 
     * @return descrizioneSottofascicolo
     */
    public java.lang.String getDescrizioneSottofascicolo() {
        return descrizioneSottofascicolo;
    }


    /**
     * Sets the descrizioneSottofascicolo value for this SottoFascicolo.
     * 
     * @param descrizioneSottofascicolo
     */
    public void setDescrizioneSottofascicolo(java.lang.String descrizioneSottofascicolo) {
        this.descrizioneSottofascicolo = descrizioneSottofascicolo;
    }


    /**
     * Gets the sottoFascicoli value for this SottoFascicolo.
     * 
     * @return sottoFascicoli
     */
    public it.italprot.prowsfascicolo.SottoFascicolo[][] getSottoFascicoli() {
        return sottoFascicoli;
    }


    /**
     * Sets the sottoFascicoli value for this SottoFascicolo.
     * 
     * @param sottoFascicoli
     */
    public void setSottoFascicoli(it.italprot.prowsfascicolo.SottoFascicolo[][] sottoFascicoli) {
        this.sottoFascicoli = sottoFascicoli;
    }

    public it.italprot.prowsfascicolo.SottoFascicolo[] getSottoFascicoli(int i) {
        return this.sottoFascicoli[i];
    }

    public void setSottoFascicoli(int i, it.italprot.prowsfascicolo.SottoFascicolo[] _value) {
        this.sottoFascicoli[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SottoFascicolo)) return false;
        SottoFascicolo other = (SottoFascicolo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.codiceSottofascicolo==null && other.getCodiceSottofascicolo()==null) || 
             (this.codiceSottofascicolo!=null &&
              this.codiceSottofascicolo.equals(other.getCodiceSottofascicolo()))) &&
            ((this.descrizioneSottofascicolo==null && other.getDescrizioneSottofascicolo()==null) || 
             (this.descrizioneSottofascicolo!=null &&
              this.descrizioneSottofascicolo.equals(other.getDescrizioneSottofascicolo()))) &&
            ((this.sottoFascicoli==null && other.getSottoFascicoli()==null) || 
             (this.sottoFascicoli!=null &&
              java.util.Arrays.equals(this.sottoFascicoli, other.getSottoFascicoli())));
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
        if (getCodiceSottofascicolo() != null) {
            _hashCode += getCodiceSottofascicolo().hashCode();
        }
        if (getDescrizioneSottofascicolo() != null) {
            _hashCode += getDescrizioneSottofascicolo().hashCode();
        }
        if (getSottoFascicoli() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSottoFascicoli());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSottoFascicoli(), i);
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
        new org.apache.axis.description.TypeDesc(SottoFascicolo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:proWsFascicolo", "sottoFascicolo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codiceSottofascicolo");
        elemField.setXmlName(new javax.xml.namespace.QName("", "codiceSottofascicolo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("descrizioneSottofascicolo");
        elemField.setXmlName(new javax.xml.namespace.QName("", "descrizioneSottofascicolo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sottoFascicoli");
        elemField.setXmlName(new javax.xml.namespace.QName("", "sottoFascicoli"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:proWsFascicolo", "sottoFascicoli"));
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
