/**
 * ElementoNelFascicolo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package agora.folium.ws.type;

public class ElementoNelFascicolo  implements java.io.Serializable {
    private java.lang.String corrispondenti;

    private java.lang.String data;

    private java.lang.String dataProtocollo;

    private java.lang.String descrizione;

    private agora.folium.ws.WSEsito esito;

    private java.lang.Long idFolder;

    private java.lang.String nome;

    private java.lang.Integer numeroProtocollo;

    private int tipo;

    private java.lang.Long idElemento;

    public ElementoNelFascicolo() {
    }

    public ElementoNelFascicolo(
           java.lang.String corrispondenti,
           java.lang.String data,
           java.lang.String dataProtocollo,
           java.lang.String descrizione,
           agora.folium.ws.WSEsito esito,
           java.lang.Long idFolder,
           java.lang.String nome,
           java.lang.Integer numeroProtocollo,
           int tipo,
           java.lang.Long idElemento) {
           this.corrispondenti = corrispondenti;
           this.data = data;
           this.dataProtocollo = dataProtocollo;
           this.descrizione = descrizione;
           this.esito = esito;
           this.idFolder = idFolder;
           this.nome = nome;
           this.numeroProtocollo = numeroProtocollo;
           this.tipo = tipo;
           this.idElemento = idElemento;
    }


    /**
     * Gets the corrispondenti value for this ElementoNelFascicolo.
     * 
     * @return corrispondenti
     */
    public java.lang.String getCorrispondenti() {
        return corrispondenti;
    }


    /**
     * Sets the corrispondenti value for this ElementoNelFascicolo.
     * 
     * @param corrispondenti
     */
    public void setCorrispondenti(java.lang.String corrispondenti) {
        this.corrispondenti = corrispondenti;
    }


    /**
     * Gets the data value for this ElementoNelFascicolo.
     * 
     * @return data
     */
    public java.lang.String getData() {
        return data;
    }


    /**
     * Sets the data value for this ElementoNelFascicolo.
     * 
     * @param data
     */
    public void setData(java.lang.String data) {
        this.data = data;
    }


    /**
     * Gets the dataProtocollo value for this ElementoNelFascicolo.
     * 
     * @return dataProtocollo
     */
    public java.lang.String getDataProtocollo() {
        return dataProtocollo;
    }


    /**
     * Sets the dataProtocollo value for this ElementoNelFascicolo.
     * 
     * @param dataProtocollo
     */
    public void setDataProtocollo(java.lang.String dataProtocollo) {
        this.dataProtocollo = dataProtocollo;
    }


    /**
     * Gets the descrizione value for this ElementoNelFascicolo.
     * 
     * @return descrizione
     */
    public java.lang.String getDescrizione() {
        return descrizione;
    }


    /**
     * Sets the descrizione value for this ElementoNelFascicolo.
     * 
     * @param descrizione
     */
    public void setDescrizione(java.lang.String descrizione) {
        this.descrizione = descrizione;
    }


    /**
     * Gets the esito value for this ElementoNelFascicolo.
     * 
     * @return esito
     */
    public agora.folium.ws.WSEsito getEsito() {
        return esito;
    }


    /**
     * Sets the esito value for this ElementoNelFascicolo.
     * 
     * @param esito
     */
    public void setEsito(agora.folium.ws.WSEsito esito) {
        this.esito = esito;
    }


    /**
     * Gets the idFolder value for this ElementoNelFascicolo.
     * 
     * @return idFolder
     */
    public java.lang.Long getIdFolder() {
        return idFolder;
    }


    /**
     * Sets the idFolder value for this ElementoNelFascicolo.
     * 
     * @param idFolder
     */
    public void setIdFolder(java.lang.Long idFolder) {
        this.idFolder = idFolder;
    }


    /**
     * Gets the nome value for this ElementoNelFascicolo.
     * 
     * @return nome
     */
    public java.lang.String getNome() {
        return nome;
    }


    /**
     * Sets the nome value for this ElementoNelFascicolo.
     * 
     * @param nome
     */
    public void setNome(java.lang.String nome) {
        this.nome = nome;
    }


    /**
     * Gets the numeroProtocollo value for this ElementoNelFascicolo.
     * 
     * @return numeroProtocollo
     */
    public java.lang.Integer getNumeroProtocollo() {
        return numeroProtocollo;
    }


    /**
     * Sets the numeroProtocollo value for this ElementoNelFascicolo.
     * 
     * @param numeroProtocollo
     */
    public void setNumeroProtocollo(java.lang.Integer numeroProtocollo) {
        this.numeroProtocollo = numeroProtocollo;
    }


    /**
     * Gets the tipo value for this ElementoNelFascicolo.
     * 
     * @return tipo
     */
    public int getTipo() {
        return tipo;
    }


    /**
     * Sets the tipo value for this ElementoNelFascicolo.
     * 
     * @param tipo
     */
    public void setTipo(int tipo) {
        this.tipo = tipo;
    }


    /**
     * Gets the idElemento value for this ElementoNelFascicolo.
     * 
     * @return idElemento
     */
    public java.lang.Long getIdElemento() {
        return idElemento;
    }


    /**
     * Sets the idElemento value for this ElementoNelFascicolo.
     * 
     * @param idElemento
     */
    public void setIdElemento(java.lang.Long idElemento) {
        this.idElemento = idElemento;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ElementoNelFascicolo)) return false;
        ElementoNelFascicolo other = (ElementoNelFascicolo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.corrispondenti==null && other.getCorrispondenti()==null) || 
             (this.corrispondenti!=null &&
              this.corrispondenti.equals(other.getCorrispondenti()))) &&
            ((this.data==null && other.getData()==null) || 
             (this.data!=null &&
              this.data.equals(other.getData()))) &&
            ((this.dataProtocollo==null && other.getDataProtocollo()==null) || 
             (this.dataProtocollo!=null &&
              this.dataProtocollo.equals(other.getDataProtocollo()))) &&
            ((this.descrizione==null && other.getDescrizione()==null) || 
             (this.descrizione!=null &&
              this.descrizione.equals(other.getDescrizione()))) &&
            ((this.esito==null && other.getEsito()==null) || 
             (this.esito!=null &&
              this.esito.equals(other.getEsito()))) &&
            ((this.idFolder==null && other.getIdFolder()==null) || 
             (this.idFolder!=null &&
              this.idFolder.equals(other.getIdFolder()))) &&
            ((this.nome==null && other.getNome()==null) || 
             (this.nome!=null &&
              this.nome.equals(other.getNome()))) &&
            ((this.numeroProtocollo==null && other.getNumeroProtocollo()==null) || 
             (this.numeroProtocollo!=null &&
              this.numeroProtocollo.equals(other.getNumeroProtocollo()))) &&
            this.tipo == other.getTipo() &&
            ((this.idElemento==null && other.getIdElemento()==null) || 
             (this.idElemento!=null &&
              this.idElemento.equals(other.getIdElemento())));
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
        if (getCorrispondenti() != null) {
            _hashCode += getCorrispondenti().hashCode();
        }
        if (getData() != null) {
            _hashCode += getData().hashCode();
        }
        if (getDataProtocollo() != null) {
            _hashCode += getDataProtocollo().hashCode();
        }
        if (getDescrizione() != null) {
            _hashCode += getDescrizione().hashCode();
        }
        if (getEsito() != null) {
            _hashCode += getEsito().hashCode();
        }
        if (getIdFolder() != null) {
            _hashCode += getIdFolder().hashCode();
        }
        if (getNome() != null) {
            _hashCode += getNome().hashCode();
        }
        if (getNumeroProtocollo() != null) {
            _hashCode += getNumeroProtocollo().hashCode();
        }
        _hashCode += getTipo();
        if (getIdElemento() != null) {
            _hashCode += getIdElemento().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ElementoNelFascicolo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://type.ws.folium.agora", "ElementoNelFascicolo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("corrispondenti");
        elemField.setXmlName(new javax.xml.namespace.QName("", "corrispondenti"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("data");
        elemField.setXmlName(new javax.xml.namespace.QName("", "data"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dataProtocollo");
        elemField.setXmlName(new javax.xml.namespace.QName("", "dataProtocollo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
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
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("idFolder");
        elemField.setXmlName(new javax.xml.namespace.QName("", "idFolder"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "long"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nome");
        elemField.setXmlName(new javax.xml.namespace.QName("", "nome"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numeroProtocollo");
        elemField.setXmlName(new javax.xml.namespace.QName("", "numeroProtocollo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tipo");
        elemField.setXmlName(new javax.xml.namespace.QName("", "tipo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("idElemento");
        elemField.setXmlName(new javax.xml.namespace.QName("", "idElemento"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "long"));
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
