/**
 * RicercaSottoFascicoli.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package agora.folium.ws.type;

public class RicercaSottoFascicoli  implements java.io.Serializable {
    private java.lang.Long idFascicolo;

    private boolean like;

    private java.lang.String nome;

    public RicercaSottoFascicoli() {
    }

    public RicercaSottoFascicoli(
           java.lang.Long idFascicolo,
           boolean like,
           java.lang.String nome) {
           this.idFascicolo = idFascicolo;
           this.like = like;
           this.nome = nome;
    }


    /**
     * Gets the idFascicolo value for this RicercaSottoFascicoli.
     * 
     * @return idFascicolo
     */
    public java.lang.Long getIdFascicolo() {
        return idFascicolo;
    }


    /**
     * Sets the idFascicolo value for this RicercaSottoFascicoli.
     * 
     * @param idFascicolo
     */
    public void setIdFascicolo(java.lang.Long idFascicolo) {
        this.idFascicolo = idFascicolo;
    }


    /**
     * Gets the like value for this RicercaSottoFascicoli.
     * 
     * @return like
     */
    public boolean isLike() {
        return like;
    }


    /**
     * Sets the like value for this RicercaSottoFascicoli.
     * 
     * @param like
     */
    public void setLike(boolean like) {
        this.like = like;
    }


    /**
     * Gets the nome value for this RicercaSottoFascicoli.
     * 
     * @return nome
     */
    public java.lang.String getNome() {
        return nome;
    }


    /**
     * Sets the nome value for this RicercaSottoFascicoli.
     * 
     * @param nome
     */
    public void setNome(java.lang.String nome) {
        this.nome = nome;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof RicercaSottoFascicoli)) return false;
        RicercaSottoFascicoli other = (RicercaSottoFascicoli) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.idFascicolo==null && other.getIdFascicolo()==null) || 
             (this.idFascicolo!=null &&
              this.idFascicolo.equals(other.getIdFascicolo()))) &&
            this.like == other.isLike() &&
            ((this.nome==null && other.getNome()==null) || 
             (this.nome!=null &&
              this.nome.equals(other.getNome())));
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
        if (getIdFascicolo() != null) {
            _hashCode += getIdFascicolo().hashCode();
        }
        _hashCode += (isLike() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getNome() != null) {
            _hashCode += getNome().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(RicercaSottoFascicoli.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://type.ws.folium.agora", "RicercaSottoFascicoli"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("idFascicolo");
        elemField.setXmlName(new javax.xml.namespace.QName("", "idFascicolo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "long"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("like");
        elemField.setXmlName(new javax.xml.namespace.QName("", "like"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nome");
        elemField.setXmlName(new javax.xml.namespace.QName("", "nome"));
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
