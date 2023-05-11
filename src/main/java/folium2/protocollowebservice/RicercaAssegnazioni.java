/**
 * RicercaAssegnazioni.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package folium2.protocollowebservice;

public class RicercaAssegnazioni  implements java.io.Serializable {
    private java.lang.String assegnante;

    private java.lang.String dataA;

    private java.lang.String dataDa;

    private agora.folium2.ws.WSEsito esito;

    private java.lang.Integer stato;

    private java.lang.Integer tipo;

    private java.lang.String utente;

    private java.lang.String dataProtocolloA;

    private java.lang.String dataProtocolloDa;

    private java.lang.String modalita;

    private java.lang.String numeroProtocolloA;

    private java.lang.String numeroProtocolloDa;

    public RicercaAssegnazioni() {
    }

    public RicercaAssegnazioni(
           java.lang.String assegnante,
           java.lang.String dataA,
           java.lang.String dataDa,
           agora.folium2.ws.WSEsito esito,
           java.lang.Integer stato,
           java.lang.Integer tipo,
           java.lang.String utente,
           java.lang.String dataProtocolloA,
           java.lang.String dataProtocolloDa,
           java.lang.String modalita,
           java.lang.String numeroProtocolloA,
           java.lang.String numeroProtocolloDa) {
           this.assegnante = assegnante;
           this.dataA = dataA;
           this.dataDa = dataDa;
           this.esito = esito;
           this.stato = stato;
           this.tipo = tipo;
           this.utente = utente;
           this.dataProtocolloA = dataProtocolloA;
           this.dataProtocolloDa = dataProtocolloDa;
           this.modalita = modalita;
           this.numeroProtocolloA = numeroProtocolloA;
           this.numeroProtocolloDa = numeroProtocolloDa;
    }


    /**
     * Gets the assegnante value for this RicercaAssegnazioni.
     * 
     * @return assegnante
     */
    public java.lang.String getAssegnante() {
        return assegnante;
    }


    /**
     * Sets the assegnante value for this RicercaAssegnazioni.
     * 
     * @param assegnante
     */
    public void setAssegnante(java.lang.String assegnante) {
        this.assegnante = assegnante;
    }


    /**
     * Gets the dataA value for this RicercaAssegnazioni.
     * 
     * @return dataA
     */
    public java.lang.String getDataA() {
        return dataA;
    }


    /**
     * Sets the dataA value for this RicercaAssegnazioni.
     * 
     * @param dataA
     */
    public void setDataA(java.lang.String dataA) {
        this.dataA = dataA;
    }


    /**
     * Gets the dataDa value for this RicercaAssegnazioni.
     * 
     * @return dataDa
     */
    public java.lang.String getDataDa() {
        return dataDa;
    }


    /**
     * Sets the dataDa value for this RicercaAssegnazioni.
     * 
     * @param dataDa
     */
    public void setDataDa(java.lang.String dataDa) {
        this.dataDa = dataDa;
    }


    /**
     * Gets the esito value for this RicercaAssegnazioni.
     * 
     * @return esito
     */
    public agora.folium2.ws.WSEsito getEsito() {
        return esito;
    }


    /**
     * Sets the esito value for this RicercaAssegnazioni.
     * 
     * @param esito
     */
    public void setEsito(agora.folium2.ws.WSEsito esito) {
        this.esito = esito;
    }


    /**
     * Gets the stato value for this RicercaAssegnazioni.
     * 
     * @return stato
     */
    public java.lang.Integer getStato() {
        return stato;
    }


    /**
     * Sets the stato value for this RicercaAssegnazioni.
     * 
     * @param stato
     */
    public void setStato(java.lang.Integer stato) {
        this.stato = stato;
    }


    /**
     * Gets the tipo value for this RicercaAssegnazioni.
     * 
     * @return tipo
     */
    public java.lang.Integer getTipo() {
        return tipo;
    }


    /**
     * Sets the tipo value for this RicercaAssegnazioni.
     * 
     * @param tipo
     */
    public void setTipo(java.lang.Integer tipo) {
        this.tipo = tipo;
    }


    /**
     * Gets the utente value for this RicercaAssegnazioni.
     * 
     * @return utente
     */
    public java.lang.String getUtente() {
        return utente;
    }


    /**
     * Sets the utente value for this RicercaAssegnazioni.
     * 
     * @param utente
     */
    public void setUtente(java.lang.String utente) {
        this.utente = utente;
    }


    /**
     * Gets the dataProtocolloA value for this RicercaAssegnazioni.
     * 
     * @return dataProtocolloA
     */
    public java.lang.String getDataProtocolloA() {
        return dataProtocolloA;
    }


    /**
     * Sets the dataProtocolloA value for this RicercaAssegnazioni.
     * 
     * @param dataProtocolloA
     */
    public void setDataProtocolloA(java.lang.String dataProtocolloA) {
        this.dataProtocolloA = dataProtocolloA;
    }


    /**
     * Gets the dataProtocolloDa value for this RicercaAssegnazioni.
     * 
     * @return dataProtocolloDa
     */
    public java.lang.String getDataProtocolloDa() {
        return dataProtocolloDa;
    }


    /**
     * Sets the dataProtocolloDa value for this RicercaAssegnazioni.
     * 
     * @param dataProtocolloDa
     */
    public void setDataProtocolloDa(java.lang.String dataProtocolloDa) {
        this.dataProtocolloDa = dataProtocolloDa;
    }


    /**
     * Gets the modalita value for this RicercaAssegnazioni.
     * 
     * @return modalita
     */
    public java.lang.String getModalita() {
        return modalita;
    }


    /**
     * Sets the modalita value for this RicercaAssegnazioni.
     * 
     * @param modalita
     */
    public void setModalita(java.lang.String modalita) {
        this.modalita = modalita;
    }


    /**
     * Gets the numeroProtocolloA value for this RicercaAssegnazioni.
     * 
     * @return numeroProtocolloA
     */
    public java.lang.String getNumeroProtocolloA() {
        return numeroProtocolloA;
    }


    /**
     * Sets the numeroProtocolloA value for this RicercaAssegnazioni.
     * 
     * @param numeroProtocolloA
     */
    public void setNumeroProtocolloA(java.lang.String numeroProtocolloA) {
        this.numeroProtocolloA = numeroProtocolloA;
    }


    /**
     * Gets the numeroProtocolloDa value for this RicercaAssegnazioni.
     * 
     * @return numeroProtocolloDa
     */
    public java.lang.String getNumeroProtocolloDa() {
        return numeroProtocolloDa;
    }


    /**
     * Sets the numeroProtocolloDa value for this RicercaAssegnazioni.
     * 
     * @param numeroProtocolloDa
     */
    public void setNumeroProtocolloDa(java.lang.String numeroProtocolloDa) {
        this.numeroProtocolloDa = numeroProtocolloDa;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof RicercaAssegnazioni)) return false;
        RicercaAssegnazioni other = (RicercaAssegnazioni) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.assegnante==null && other.getAssegnante()==null) || 
             (this.assegnante!=null &&
              this.assegnante.equals(other.getAssegnante()))) &&
            ((this.dataA==null && other.getDataA()==null) || 
             (this.dataA!=null &&
              this.dataA.equals(other.getDataA()))) &&
            ((this.dataDa==null && other.getDataDa()==null) || 
             (this.dataDa!=null &&
              this.dataDa.equals(other.getDataDa()))) &&
            ((this.esito==null && other.getEsito()==null) || 
             (this.esito!=null &&
              this.esito.equals(other.getEsito()))) &&
            ((this.stato==null && other.getStato()==null) || 
             (this.stato!=null &&
              this.stato.equals(other.getStato()))) &&
            ((this.tipo==null && other.getTipo()==null) || 
             (this.tipo!=null &&
              this.tipo.equals(other.getTipo()))) &&
            ((this.utente==null && other.getUtente()==null) || 
             (this.utente!=null &&
              this.utente.equals(other.getUtente()))) &&
            ((this.dataProtocolloA==null && other.getDataProtocolloA()==null) || 
             (this.dataProtocolloA!=null &&
              this.dataProtocolloA.equals(other.getDataProtocolloA()))) &&
            ((this.dataProtocolloDa==null && other.getDataProtocolloDa()==null) || 
             (this.dataProtocolloDa!=null &&
              this.dataProtocolloDa.equals(other.getDataProtocolloDa()))) &&
            ((this.modalita==null && other.getModalita()==null) || 
             (this.modalita!=null &&
              this.modalita.equals(other.getModalita()))) &&
            ((this.numeroProtocolloA==null && other.getNumeroProtocolloA()==null) || 
             (this.numeroProtocolloA!=null &&
              this.numeroProtocolloA.equals(other.getNumeroProtocolloA()))) &&
            ((this.numeroProtocolloDa==null && other.getNumeroProtocolloDa()==null) || 
             (this.numeroProtocolloDa!=null &&
              this.numeroProtocolloDa.equals(other.getNumeroProtocolloDa())));
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
        if (getAssegnante() != null) {
            _hashCode += getAssegnante().hashCode();
        }
        if (getDataA() != null) {
            _hashCode += getDataA().hashCode();
        }
        if (getDataDa() != null) {
            _hashCode += getDataDa().hashCode();
        }
        if (getEsito() != null) {
            _hashCode += getEsito().hashCode();
        }
        if (getStato() != null) {
            _hashCode += getStato().hashCode();
        }
        if (getTipo() != null) {
            _hashCode += getTipo().hashCode();
        }
        if (getUtente() != null) {
            _hashCode += getUtente().hashCode();
        }
        if (getDataProtocolloA() != null) {
            _hashCode += getDataProtocolloA().hashCode();
        }
        if (getDataProtocolloDa() != null) {
            _hashCode += getDataProtocolloDa().hashCode();
        }
        if (getModalita() != null) {
            _hashCode += getModalita().hashCode();
        }
        if (getNumeroProtocolloA() != null) {
            _hashCode += getNumeroProtocolloA().hashCode();
        }
        if (getNumeroProtocolloDa() != null) {
            _hashCode += getNumeroProtocolloDa().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(RicercaAssegnazioni.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://type.ws.folium.agora", "RicercaAssegnazioni"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("assegnante");
        elemField.setXmlName(new javax.xml.namespace.QName("", "assegnante"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dataA");
        elemField.setXmlName(new javax.xml.namespace.QName("", "dataA"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dataDa");
        elemField.setXmlName(new javax.xml.namespace.QName("", "dataDa"));
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
        elemField.setFieldName("stato");
        elemField.setXmlName(new javax.xml.namespace.QName("", "stato"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tipo");
        elemField.setXmlName(new javax.xml.namespace.QName("", "tipo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("utente");
        elemField.setXmlName(new javax.xml.namespace.QName("", "utente"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dataProtocolloA");
        elemField.setXmlName(new javax.xml.namespace.QName("", "dataProtocolloA"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dataProtocolloDa");
        elemField.setXmlName(new javax.xml.namespace.QName("", "dataProtocolloDa"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("modalita");
        elemField.setXmlName(new javax.xml.namespace.QName("", "modalita"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numeroProtocolloA");
        elemField.setXmlName(new javax.xml.namespace.QName("", "numeroProtocolloA"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numeroProtocolloDa");
        elemField.setXmlName(new javax.xml.namespace.QName("", "numeroProtocolloDa"));
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
