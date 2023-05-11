/**
 * SottoFascicolo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package agora.folium.ws.type;

public class SottoFascicolo  implements java.io.Serializable {
    private java.lang.Long id;

    private java.lang.String nome;

    private java.lang.Long idParent;

    private java.lang.Long idFascicolo;

    private agora.folium.ws.type.SottoFascicolo[] sublist;

    private java.lang.String descrizione;

    private agora.folium.ws.WSEsito esito;

    public SottoFascicolo() {
    }

    public SottoFascicolo(
           java.lang.Long id,
           java.lang.String nome,
           java.lang.Long idParent,
           java.lang.Long idFascicolo,
           agora.folium.ws.type.SottoFascicolo[] sublist,
           java.lang.String descrizione,
           agora.folium.ws.WSEsito esito) {
           this.id = id;
           this.nome = nome;
           this.idParent = idParent;
           this.idFascicolo = idFascicolo;
           this.sublist = sublist;
           this.descrizione = descrizione;
           this.esito = esito;
    }


    /**
     * Gets the id value for this SottoFascicolo.
     * 
     * @return id
     */
    public java.lang.Long getId() {
        return id;
    }


    /**
     * Sets the id value for this SottoFascicolo.
     * 
     * @param id
     */
    public void setId(java.lang.Long id) {
        this.id = id;
    }


    /**
     * Gets the nome value for this SottoFascicolo.
     * 
     * @return nome
     */
    public java.lang.String getNome() {
        return nome;
    }


    /**
     * Sets the nome value for this SottoFascicolo.
     * 
     * @param nome
     */
    public void setNome(java.lang.String nome) {
        this.nome = nome;
    }


    /**
     * Gets the idParent value for this SottoFascicolo.
     * 
     * @return idParent
     */
    public java.lang.Long getIdParent() {
        return idParent;
    }


    /**
     * Sets the idParent value for this SottoFascicolo.
     * 
     * @param idParent
     */
    public void setIdParent(java.lang.Long idParent) {
        this.idParent = idParent;
    }


    /**
     * Gets the idFascicolo value for this SottoFascicolo.
     * 
     * @return idFascicolo
     */
    public java.lang.Long getIdFascicolo() {
        return idFascicolo;
    }


    /**
     * Sets the idFascicolo value for this SottoFascicolo.
     * 
     * @param idFascicolo
     */
    public void setIdFascicolo(java.lang.Long idFascicolo) {
        this.idFascicolo = idFascicolo;
    }


    /**
     * Gets the sublist value for this SottoFascicolo.
     * 
     * @return sublist
     */
    public agora.folium.ws.type.SottoFascicolo[] getSublist() {
        return sublist;
    }


    /**
     * Sets the sublist value for this SottoFascicolo.
     * 
     * @param sublist
     */
    public void setSublist(agora.folium.ws.type.SottoFascicolo[] sublist) {
        this.sublist = sublist;
    }


    /**
     * Gets the descrizione value for this SottoFascicolo.
     * 
     * @return descrizione
     */
    public java.lang.String getDescrizione() {
        return descrizione;
    }


    /**
     * Sets the descrizione value for this SottoFascicolo.
     * 
     * @param descrizione
     */
    public void setDescrizione(java.lang.String descrizione) {
        this.descrizione = descrizione;
    }


    /**
     * Gets the esito value for this SottoFascicolo.
     * 
     * @return esito
     */
    public agora.folium.ws.WSEsito getEsito() {
        return esito;
    }


    /**
     * Sets the esito value for this SottoFascicolo.
     * 
     * @param esito
     */
    public void setEsito(agora.folium.ws.WSEsito esito) {
        this.esito = esito;
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
            ((this.id==null && other.getId()==null) || 
             (this.id!=null &&
              this.id.equals(other.getId()))) &&
            ((this.nome==null && other.getNome()==null) || 
             (this.nome!=null &&
              this.nome.equals(other.getNome()))) &&
            ((this.idParent==null && other.getIdParent()==null) || 
             (this.idParent!=null &&
              this.idParent.equals(other.getIdParent()))) &&
            ((this.idFascicolo==null && other.getIdFascicolo()==null) || 
             (this.idFascicolo!=null &&
              this.idFascicolo.equals(other.getIdFascicolo()))) &&
            ((this.sublist==null && other.getSublist()==null) || 
             (this.sublist!=null &&
              java.util.Arrays.equals(this.sublist, other.getSublist()))) &&
            ((this.descrizione==null && other.getDescrizione()==null) || 
             (this.descrizione!=null &&
              this.descrizione.equals(other.getDescrizione()))) &&
            ((this.esito==null && other.getEsito()==null) || 
             (this.esito!=null &&
              this.esito.equals(other.getEsito())));
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
        if (getId() != null) {
            _hashCode += getId().hashCode();
        }
        if (getNome() != null) {
            _hashCode += getNome().hashCode();
        }
        if (getIdParent() != null) {
            _hashCode += getIdParent().hashCode();
        }
        if (getIdFascicolo() != null) {
            _hashCode += getIdFascicolo().hashCode();
        }
        if (getSublist() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSublist());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSublist(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getDescrizione() != null) {
            _hashCode += getDescrizione().hashCode();
        }
        if (getEsito() != null) {
            _hashCode += getEsito().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SottoFascicolo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://type.ws.folium.agora", "SottoFascicolo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("id");
        elemField.setXmlName(new javax.xml.namespace.QName("", "id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nome");
        elemField.setXmlName(new javax.xml.namespace.QName("", "nome"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("idParent");
        elemField.setXmlName(new javax.xml.namespace.QName("", "idParent"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("idFascicolo");
        elemField.setXmlName(new javax.xml.namespace.QName("", "idFascicolo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sublist");
        elemField.setXmlName(new javax.xml.namespace.QName("", "sublist"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://type.ws.folium.agora", "SottoFascicolo"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("descrizione");
        elemField.setXmlName(new javax.xml.namespace.QName("", "descrizione"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("esito");
        elemField.setXmlName(new javax.xml.namespace.QName("", "esito"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.folium.agora", "WSEsito"));
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
