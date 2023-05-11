/**
 * ItemEsitoFirma.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package it.italprot.prowsprotocollo;

public class ItemEsitoFirma  implements java.io.Serializable {
    private java.lang.String esitoFirma;

    private java.lang.String annoProtocollo;

    private java.lang.String dataProtocollo;

    private java.lang.String numeroProtocollo;

    private java.lang.String tipoProtocollo;

    public ItemEsitoFirma() {
    }

    public ItemEsitoFirma(
           java.lang.String esitoFirma,
           java.lang.String annoProtocollo,
           java.lang.String dataProtocollo,
           java.lang.String numeroProtocollo,
           java.lang.String tipoProtocollo) {
           this.esitoFirma = esitoFirma;
           this.annoProtocollo = annoProtocollo;
           this.dataProtocollo = dataProtocollo;
           this.numeroProtocollo = numeroProtocollo;
           this.tipoProtocollo = tipoProtocollo;
    }


    /**
     * Gets the esitoFirma value for this ItemEsitoFirma.
     * 
     * @return esitoFirma
     */
    public java.lang.String getEsitoFirma() {
        return esitoFirma;
    }


    /**
     * Sets the esitoFirma value for this ItemEsitoFirma.
     * 
     * @param esitoFirma
     */
    public void setEsitoFirma(java.lang.String esitoFirma) {
        this.esitoFirma = esitoFirma;
    }


    /**
     * Gets the annoProtocollo value for this ItemEsitoFirma.
     * 
     * @return annoProtocollo
     */
    public java.lang.String getAnnoProtocollo() {
        return annoProtocollo;
    }


    /**
     * Sets the annoProtocollo value for this ItemEsitoFirma.
     * 
     * @param annoProtocollo
     */
    public void setAnnoProtocollo(java.lang.String annoProtocollo) {
        this.annoProtocollo = annoProtocollo;
    }


    /**
     * Gets the dataProtocollo value for this ItemEsitoFirma.
     * 
     * @return dataProtocollo
     */
    public java.lang.String getDataProtocollo() {
        return dataProtocollo;
    }


    /**
     * Sets the dataProtocollo value for this ItemEsitoFirma.
     * 
     * @param dataProtocollo
     */
    public void setDataProtocollo(java.lang.String dataProtocollo) {
        this.dataProtocollo = dataProtocollo;
    }


    /**
     * Gets the numeroProtocollo value for this ItemEsitoFirma.
     * 
     * @return numeroProtocollo
     */
    public java.lang.String getNumeroProtocollo() {
        return numeroProtocollo;
    }


    /**
     * Sets the numeroProtocollo value for this ItemEsitoFirma.
     * 
     * @param numeroProtocollo
     */
    public void setNumeroProtocollo(java.lang.String numeroProtocollo) {
        this.numeroProtocollo = numeroProtocollo;
    }


    /**
     * Gets the tipoProtocollo value for this ItemEsitoFirma.
     * 
     * @return tipoProtocollo
     */
    public java.lang.String getTipoProtocollo() {
        return tipoProtocollo;
    }


    /**
     * Sets the tipoProtocollo value for this ItemEsitoFirma.
     * 
     * @param tipoProtocollo
     */
    public void setTipoProtocollo(java.lang.String tipoProtocollo) {
        this.tipoProtocollo = tipoProtocollo;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ItemEsitoFirma)) return false;
        ItemEsitoFirma other = (ItemEsitoFirma) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.esitoFirma==null && other.getEsitoFirma()==null) || 
             (this.esitoFirma!=null &&
              this.esitoFirma.equals(other.getEsitoFirma()))) &&
            ((this.annoProtocollo==null && other.getAnnoProtocollo()==null) || 
             (this.annoProtocollo!=null &&
              this.annoProtocollo.equals(other.getAnnoProtocollo()))) &&
            ((this.dataProtocollo==null && other.getDataProtocollo()==null) || 
             (this.dataProtocollo!=null &&
              this.dataProtocollo.equals(other.getDataProtocollo()))) &&
            ((this.numeroProtocollo==null && other.getNumeroProtocollo()==null) || 
             (this.numeroProtocollo!=null &&
              this.numeroProtocollo.equals(other.getNumeroProtocollo()))) &&
            ((this.tipoProtocollo==null && other.getTipoProtocollo()==null) || 
             (this.tipoProtocollo!=null &&
              this.tipoProtocollo.equals(other.getTipoProtocollo())));
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
        if (getEsitoFirma() != null) {
            _hashCode += getEsitoFirma().hashCode();
        }
        if (getAnnoProtocollo() != null) {
            _hashCode += getAnnoProtocollo().hashCode();
        }
        if (getDataProtocollo() != null) {
            _hashCode += getDataProtocollo().hashCode();
        }
        if (getNumeroProtocollo() != null) {
            _hashCode += getNumeroProtocollo().hashCode();
        }
        if (getTipoProtocollo() != null) {
            _hashCode += getTipoProtocollo().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ItemEsitoFirma.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:proWsProtocollo", "itemEsitoFirma"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("esitoFirma");
        elemField.setXmlName(new javax.xml.namespace.QName("", "esitoFirma"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("annoProtocollo");
        elemField.setXmlName(new javax.xml.namespace.QName("", "annoProtocollo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dataProtocollo");
        elemField.setXmlName(new javax.xml.namespace.QName("", "dataProtocollo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numeroProtocollo");
        elemField.setXmlName(new javax.xml.namespace.QName("", "numeroProtocollo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tipoProtocollo");
        elemField.setXmlName(new javax.xml.namespace.QName("", "tipoProtocollo"));
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
