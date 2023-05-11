/**
 * FascicoloEsteso.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package agora.folium.ws.type;

public class FascicoloEsteso  implements java.io.Serializable {
    private agora.folium.ws.type.AttributoEsteso[] attributi;

    private agora.folium.ws.WSEsito esito;

    private agora.folium.ws.type.Fascicolo fascicolo;

    private java.lang.String tipo;

    public FascicoloEsteso() {
    }

    public FascicoloEsteso(
           agora.folium.ws.type.AttributoEsteso[] attributi,
           agora.folium.ws.WSEsito esito,
           agora.folium.ws.type.Fascicolo fascicolo,
           java.lang.String tipo) {
           this.attributi = attributi;
           this.esito = esito;
           this.fascicolo = fascicolo;
           this.tipo = tipo;
    }


    /**
     * Gets the attributi value for this FascicoloEsteso.
     * 
     * @return attributi
     */
    public agora.folium.ws.type.AttributoEsteso[] getAttributi() {
        return attributi;
    }


    /**
     * Sets the attributi value for this FascicoloEsteso.
     * 
     * @param attributi
     */
    public void setAttributi(agora.folium.ws.type.AttributoEsteso[] attributi) {
        this.attributi = attributi;
    }


    /**
     * Gets the esito value for this FascicoloEsteso.
     * 
     * @return esito
     */
    public agora.folium.ws.WSEsito getEsito() {
        return esito;
    }


    /**
     * Sets the esito value for this FascicoloEsteso.
     * 
     * @param esito
     */
    public void setEsito(agora.folium.ws.WSEsito esito) {
        this.esito = esito;
    }


    /**
     * Gets the fascicolo value for this FascicoloEsteso.
     * 
     * @return fascicolo
     */
    public agora.folium.ws.type.Fascicolo getFascicolo() {
        return fascicolo;
    }


    /**
     * Sets the fascicolo value for this FascicoloEsteso.
     * 
     * @param fascicolo
     */
    public void setFascicolo(agora.folium.ws.type.Fascicolo fascicolo) {
        this.fascicolo = fascicolo;
    }


    /**
     * Gets the tipo value for this FascicoloEsteso.
     * 
     * @return tipo
     */
    public java.lang.String getTipo() {
        return tipo;
    }


    /**
     * Sets the tipo value for this FascicoloEsteso.
     * 
     * @param tipo
     */
    public void setTipo(java.lang.String tipo) {
        this.tipo = tipo;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof FascicoloEsteso)) return false;
        FascicoloEsteso other = (FascicoloEsteso) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.attributi==null && other.getAttributi()==null) || 
             (this.attributi!=null &&
              java.util.Arrays.equals(this.attributi, other.getAttributi()))) &&
            ((this.esito==null && other.getEsito()==null) || 
             (this.esito!=null &&
              this.esito.equals(other.getEsito()))) &&
            ((this.fascicolo==null && other.getFascicolo()==null) || 
             (this.fascicolo!=null &&
              this.fascicolo.equals(other.getFascicolo()))) &&
            ((this.tipo==null && other.getTipo()==null) || 
             (this.tipo!=null &&
              this.tipo.equals(other.getTipo())));
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
        if (getAttributi() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAttributi());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAttributi(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getEsito() != null) {
            _hashCode += getEsito().hashCode();
        }
        if (getFascicolo() != null) {
            _hashCode += getFascicolo().hashCode();
        }
        if (getTipo() != null) {
            _hashCode += getTipo().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(FascicoloEsteso.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://type.ws.folium.agora", "FascicoloEsteso"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("attributi");
        elemField.setXmlName(new javax.xml.namespace.QName("", "attributi"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://type.ws.folium.agora", "AttributoEsteso"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("esito");
        elemField.setXmlName(new javax.xml.namespace.QName("", "esito"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.folium.agora", "WSEsito"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fascicolo");
        elemField.setXmlName(new javax.xml.namespace.QName("", "fascicolo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://type.ws.folium.agora", "Fascicolo"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tipo");
        elemField.setXmlName(new javax.xml.namespace.QName("", "tipo"));
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
