/**
 * CorrispondenteDaRicerca.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package folium2.protocollowebservice;

public class CorrispondenteDaRicerca  implements java.io.Serializable {
    private java.lang.Long id;

    private java.lang.String codiceMezzoSpedizione;

    private java.lang.String denominazione;

    private java.lang.String codiceMittenteDestinatario;

    private java.lang.String cognome;

    private java.lang.String nome;

    private java.lang.String tipo;

    private folium2.protocollowebservice.IndirizzoFisico[] indirizzi;

    private folium2.protocollowebservice.IndirizzoEmail[] email;

    private agora.folium2.ws.WSEsito esito;

    public CorrispondenteDaRicerca() {
    }

    public CorrispondenteDaRicerca(
           java.lang.Long id,
           java.lang.String codiceMezzoSpedizione,
           java.lang.String denominazione,
           java.lang.String codiceMittenteDestinatario,
           java.lang.String cognome,
           java.lang.String nome,
           java.lang.String tipo,
           folium2.protocollowebservice.IndirizzoFisico[] indirizzi,
           folium2.protocollowebservice.IndirizzoEmail[] email,
           agora.folium2.ws.WSEsito esito) {
           this.id = id;
           this.codiceMezzoSpedizione = codiceMezzoSpedizione;
           this.denominazione = denominazione;
           this.codiceMittenteDestinatario = codiceMittenteDestinatario;
           this.cognome = cognome;
           this.nome = nome;
           this.tipo = tipo;
           this.indirizzi = indirizzi;
           this.email = email;
           this.esito = esito;
    }


    /**
     * Gets the id value for this CorrispondenteDaRicerca.
     * 
     * @return id
     */
    public java.lang.Long getId() {
        return id;
    }


    /**
     * Sets the id value for this CorrispondenteDaRicerca.
     * 
     * @param id
     */
    public void setId(java.lang.Long id) {
        this.id = id;
    }


    /**
     * Gets the codiceMezzoSpedizione value for this CorrispondenteDaRicerca.
     * 
     * @return codiceMezzoSpedizione
     */
    public java.lang.String getCodiceMezzoSpedizione() {
        return codiceMezzoSpedizione;
    }


    /**
     * Sets the codiceMezzoSpedizione value for this CorrispondenteDaRicerca.
     * 
     * @param codiceMezzoSpedizione
     */
    public void setCodiceMezzoSpedizione(java.lang.String codiceMezzoSpedizione) {
        this.codiceMezzoSpedizione = codiceMezzoSpedizione;
    }


    /**
     * Gets the denominazione value for this CorrispondenteDaRicerca.
     * 
     * @return denominazione
     */
    public java.lang.String getDenominazione() {
        return denominazione;
    }


    /**
     * Sets the denominazione value for this CorrispondenteDaRicerca.
     * 
     * @param denominazione
     */
    public void setDenominazione(java.lang.String denominazione) {
        this.denominazione = denominazione;
    }


    /**
     * Gets the codiceMittenteDestinatario value for this CorrispondenteDaRicerca.
     * 
     * @return codiceMittenteDestinatario
     */
    public java.lang.String getCodiceMittenteDestinatario() {
        return codiceMittenteDestinatario;
    }


    /**
     * Sets the codiceMittenteDestinatario value for this CorrispondenteDaRicerca.
     * 
     * @param codiceMittenteDestinatario
     */
    public void setCodiceMittenteDestinatario(java.lang.String codiceMittenteDestinatario) {
        this.codiceMittenteDestinatario = codiceMittenteDestinatario;
    }


    /**
     * Gets the cognome value for this CorrispondenteDaRicerca.
     * 
     * @return cognome
     */
    public java.lang.String getCognome() {
        return cognome;
    }


    /**
     * Sets the cognome value for this CorrispondenteDaRicerca.
     * 
     * @param cognome
     */
    public void setCognome(java.lang.String cognome) {
        this.cognome = cognome;
    }


    /**
     * Gets the nome value for this CorrispondenteDaRicerca.
     * 
     * @return nome
     */
    public java.lang.String getNome() {
        return nome;
    }


    /**
     * Sets the nome value for this CorrispondenteDaRicerca.
     * 
     * @param nome
     */
    public void setNome(java.lang.String nome) {
        this.nome = nome;
    }


    /**
     * Gets the tipo value for this CorrispondenteDaRicerca.
     * 
     * @return tipo
     */
    public java.lang.String getTipo() {
        return tipo;
    }


    /**
     * Sets the tipo value for this CorrispondenteDaRicerca.
     * 
     * @param tipo
     */
    public void setTipo(java.lang.String tipo) {
        this.tipo = tipo;
    }


    /**
     * Gets the indirizzi value for this CorrispondenteDaRicerca.
     * 
     * @return indirizzi
     */
    public folium2.protocollowebservice.IndirizzoFisico[] getIndirizzi() {
        return indirizzi;
    }


    /**
     * Sets the indirizzi value for this CorrispondenteDaRicerca.
     * 
     * @param indirizzi
     */
    public void setIndirizzi(folium2.protocollowebservice.IndirizzoFisico[] indirizzi) {
        this.indirizzi = indirizzi;
    }


    /**
     * Gets the email value for this CorrispondenteDaRicerca.
     * 
     * @return email
     */
    public folium2.protocollowebservice.IndirizzoEmail[] getEmail() {
        return email;
    }


    /**
     * Sets the email value for this CorrispondenteDaRicerca.
     * 
     * @param email
     */
    public void setEmail(folium2.protocollowebservice.IndirizzoEmail[] email) {
        this.email = email;
    }


    /**
     * Gets the esito value for this CorrispondenteDaRicerca.
     * 
     * @return esito
     */
    public agora.folium2.ws.WSEsito getEsito() {
        return esito;
    }


    /**
     * Sets the esito value for this CorrispondenteDaRicerca.
     * 
     * @param esito
     */
    public void setEsito(agora.folium2.ws.WSEsito esito) {
        this.esito = esito;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CorrispondenteDaRicerca)) return false;
        CorrispondenteDaRicerca other = (CorrispondenteDaRicerca) obj;
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
            ((this.codiceMezzoSpedizione==null && other.getCodiceMezzoSpedizione()==null) || 
             (this.codiceMezzoSpedizione!=null &&
              this.codiceMezzoSpedizione.equals(other.getCodiceMezzoSpedizione()))) &&
            ((this.denominazione==null && other.getDenominazione()==null) || 
             (this.denominazione!=null &&
              this.denominazione.equals(other.getDenominazione()))) &&
            ((this.codiceMittenteDestinatario==null && other.getCodiceMittenteDestinatario()==null) || 
             (this.codiceMittenteDestinatario!=null &&
              this.codiceMittenteDestinatario.equals(other.getCodiceMittenteDestinatario()))) &&
            ((this.cognome==null && other.getCognome()==null) || 
             (this.cognome!=null &&
              this.cognome.equals(other.getCognome()))) &&
            ((this.nome==null && other.getNome()==null) || 
             (this.nome!=null &&
              this.nome.equals(other.getNome()))) &&
            ((this.tipo==null && other.getTipo()==null) || 
             (this.tipo!=null &&
              this.tipo.equals(other.getTipo()))) &&
            ((this.indirizzi==null && other.getIndirizzi()==null) || 
             (this.indirizzi!=null &&
              java.util.Arrays.equals(this.indirizzi, other.getIndirizzi()))) &&
            ((this.email==null && other.getEmail()==null) || 
             (this.email!=null &&
              java.util.Arrays.equals(this.email, other.getEmail()))) &&
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
        if (getCodiceMezzoSpedizione() != null) {
            _hashCode += getCodiceMezzoSpedizione().hashCode();
        }
        if (getDenominazione() != null) {
            _hashCode += getDenominazione().hashCode();
        }
        if (getCodiceMittenteDestinatario() != null) {
            _hashCode += getCodiceMittenteDestinatario().hashCode();
        }
        if (getCognome() != null) {
            _hashCode += getCognome().hashCode();
        }
        if (getNome() != null) {
            _hashCode += getNome().hashCode();
        }
        if (getTipo() != null) {
            _hashCode += getTipo().hashCode();
        }
        if (getIndirizzi() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getIndirizzi());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getIndirizzi(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getEmail() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getEmail());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getEmail(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getEsito() != null) {
            _hashCode += getEsito().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CorrispondenteDaRicerca.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://type.ws.folium.agora", "CorrispondenteDaRicerca"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("id");
        elemField.setXmlName(new javax.xml.namespace.QName("", "id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "long"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codiceMezzoSpedizione");
        elemField.setXmlName(new javax.xml.namespace.QName("", "codiceMezzoSpedizione"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("denominazione");
        elemField.setXmlName(new javax.xml.namespace.QName("", "denominazione"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codiceMittenteDestinatario");
        elemField.setXmlName(new javax.xml.namespace.QName("", "codiceMittenteDestinatario"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cognome");
        elemField.setXmlName(new javax.xml.namespace.QName("", "cognome"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nome");
        elemField.setXmlName(new javax.xml.namespace.QName("", "nome"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tipo");
        elemField.setXmlName(new javax.xml.namespace.QName("", "tipo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("indirizzi");
        elemField.setXmlName(new javax.xml.namespace.QName("", "indirizzi"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://type.ws.folium.agora", "IndirizzoFisico"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("email");
        elemField.setXmlName(new javax.xml.namespace.QName("", "email"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://type.ws.folium.agora", "IndirizzoEmail"));
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
