/**
 * AssegnazioneDaRicerca.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package folium2.protocollowebservice;

public class AssegnazioneDaRicerca  implements java.io.Serializable {
    private java.lang.String assegnante;

    private java.lang.String data;

    private java.lang.String datascadenza;

    private agora.folium2.ws.WSEsito esito;

    private java.lang.Long id;

    private java.lang.String iddocumentale;

    private java.lang.Long idprofilo;

    private java.lang.String numeroProtocollo;

    private java.lang.String dataProtocollo;

    private java.lang.String registro;

    private java.lang.String note;

    private java.lang.Integer tipo;

    private java.lang.String ufficio;

    private java.lang.String utente;

    private java.lang.String oggetto;

    private java.lang.String segnatura;

    public AssegnazioneDaRicerca() {
    }

    public AssegnazioneDaRicerca(
           java.lang.String assegnante,
           java.lang.String data,
           java.lang.String datascadenza,
           agora.folium2.ws.WSEsito esito,
           java.lang.Long id,
           java.lang.String iddocumentale,
           java.lang.Long idprofilo,
           java.lang.String numeroProtocollo,
           java.lang.String dataProtocollo,
           java.lang.String registro,
           java.lang.String note,
           java.lang.Integer tipo,
           java.lang.String ufficio,
           java.lang.String utente,
           java.lang.String oggetto,
           java.lang.String segnatura) {
           this.assegnante = assegnante;
           this.data = data;
           this.datascadenza = datascadenza;
           this.esito = esito;
           this.id = id;
           this.iddocumentale = iddocumentale;
           this.idprofilo = idprofilo;
           this.numeroProtocollo = numeroProtocollo;
           this.dataProtocollo = dataProtocollo;
           this.registro = registro;
           this.note = note;
           this.tipo = tipo;
           this.ufficio = ufficio;
           this.utente = utente;
           this.oggetto = oggetto;
           this.segnatura = segnatura;
    }


    /**
     * Gets the assegnante value for this AssegnazioneDaRicerca.
     * 
     * @return assegnante
     */
    public java.lang.String getAssegnante() {
        return assegnante;
    }


    /**
     * Sets the assegnante value for this AssegnazioneDaRicerca.
     * 
     * @param assegnante
     */
    public void setAssegnante(java.lang.String assegnante) {
        this.assegnante = assegnante;
    }


    /**
     * Gets the data value for this AssegnazioneDaRicerca.
     * 
     * @return data
     */
    public java.lang.String getData() {
        return data;
    }


    /**
     * Sets the data value for this AssegnazioneDaRicerca.
     * 
     * @param data
     */
    public void setData(java.lang.String data) {
        this.data = data;
    }


    /**
     * Gets the datascadenza value for this AssegnazioneDaRicerca.
     * 
     * @return datascadenza
     */
    public java.lang.String getDatascadenza() {
        return datascadenza;
    }


    /**
     * Sets the datascadenza value for this AssegnazioneDaRicerca.
     * 
     * @param datascadenza
     */
    public void setDatascadenza(java.lang.String datascadenza) {
        this.datascadenza = datascadenza;
    }


    /**
     * Gets the esito value for this AssegnazioneDaRicerca.
     * 
     * @return esito
     */
    public agora.folium2.ws.WSEsito getEsito() {
        return esito;
    }


    /**
     * Sets the esito value for this AssegnazioneDaRicerca.
     * 
     * @param esito
     */
    public void setEsito(agora.folium2.ws.WSEsito esito) {
        this.esito = esito;
    }


    /**
     * Gets the id value for this AssegnazioneDaRicerca.
     * 
     * @return id
     */
    public java.lang.Long getId() {
        return id;
    }


    /**
     * Sets the id value for this AssegnazioneDaRicerca.
     * 
     * @param id
     */
    public void setId(java.lang.Long id) {
        this.id = id;
    }


    /**
     * Gets the iddocumentale value for this AssegnazioneDaRicerca.
     * 
     * @return iddocumentale
     */
    public java.lang.String getIddocumentale() {
        return iddocumentale;
    }


    /**
     * Sets the iddocumentale value for this AssegnazioneDaRicerca.
     * 
     * @param iddocumentale
     */
    public void setIddocumentale(java.lang.String iddocumentale) {
        this.iddocumentale = iddocumentale;
    }


    /**
     * Gets the idprofilo value for this AssegnazioneDaRicerca.
     * 
     * @return idprofilo
     */
    public java.lang.Long getIdprofilo() {
        return idprofilo;
    }


    /**
     * Sets the idprofilo value for this AssegnazioneDaRicerca.
     * 
     * @param idprofilo
     */
    public void setIdprofilo(java.lang.Long idprofilo) {
        this.idprofilo = idprofilo;
    }


    /**
     * Gets the numeroProtocollo value for this AssegnazioneDaRicerca.
     * 
     * @return numeroProtocollo
     */
    public java.lang.String getNumeroProtocollo() {
        return numeroProtocollo;
    }


    /**
     * Sets the numeroProtocollo value for this AssegnazioneDaRicerca.
     * 
     * @param numeroProtocollo
     */
    public void setNumeroProtocollo(java.lang.String numeroProtocollo) {
        this.numeroProtocollo = numeroProtocollo;
    }


    /**
     * Gets the dataProtocollo value for this AssegnazioneDaRicerca.
     * 
     * @return dataProtocollo
     */
    public java.lang.String getDataProtocollo() {
        return dataProtocollo;
    }


    /**
     * Sets the dataProtocollo value for this AssegnazioneDaRicerca.
     * 
     * @param dataProtocollo
     */
    public void setDataProtocollo(java.lang.String dataProtocollo) {
        this.dataProtocollo = dataProtocollo;
    }


    /**
     * Gets the registro value for this AssegnazioneDaRicerca.
     * 
     * @return registro
     */
    public java.lang.String getRegistro() {
        return registro;
    }


    /**
     * Sets the registro value for this AssegnazioneDaRicerca.
     * 
     * @param registro
     */
    public void setRegistro(java.lang.String registro) {
        this.registro = registro;
    }


    /**
     * Gets the note value for this AssegnazioneDaRicerca.
     * 
     * @return note
     */
    public java.lang.String getNote() {
        return note;
    }


    /**
     * Sets the note value for this AssegnazioneDaRicerca.
     * 
     * @param note
     */
    public void setNote(java.lang.String note) {
        this.note = note;
    }


    /**
     * Gets the tipo value for this AssegnazioneDaRicerca.
     * 
     * @return tipo
     */
    public java.lang.Integer getTipo() {
        return tipo;
    }


    /**
     * Sets the tipo value for this AssegnazioneDaRicerca.
     * 
     * @param tipo
     */
    public void setTipo(java.lang.Integer tipo) {
        this.tipo = tipo;
    }


    /**
     * Gets the ufficio value for this AssegnazioneDaRicerca.
     * 
     * @return ufficio
     */
    public java.lang.String getUfficio() {
        return ufficio;
    }


    /**
     * Sets the ufficio value for this AssegnazioneDaRicerca.
     * 
     * @param ufficio
     */
    public void setUfficio(java.lang.String ufficio) {
        this.ufficio = ufficio;
    }


    /**
     * Gets the utente value for this AssegnazioneDaRicerca.
     * 
     * @return utente
     */
    public java.lang.String getUtente() {
        return utente;
    }


    /**
     * Sets the utente value for this AssegnazioneDaRicerca.
     * 
     * @param utente
     */
    public void setUtente(java.lang.String utente) {
        this.utente = utente;
    }


    /**
     * Gets the oggetto value for this AssegnazioneDaRicerca.
     * 
     * @return oggetto
     */
    public java.lang.String getOggetto() {
        return oggetto;
    }


    /**
     * Sets the oggetto value for this AssegnazioneDaRicerca.
     * 
     * @param oggetto
     */
    public void setOggetto(java.lang.String oggetto) {
        this.oggetto = oggetto;
    }


    /**
     * Gets the segnatura value for this AssegnazioneDaRicerca.
     * 
     * @return segnatura
     */
    public java.lang.String getSegnatura() {
        return segnatura;
    }


    /**
     * Sets the segnatura value for this AssegnazioneDaRicerca.
     * 
     * @param segnatura
     */
    public void setSegnatura(java.lang.String segnatura) {
        this.segnatura = segnatura;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AssegnazioneDaRicerca)) return false;
        AssegnazioneDaRicerca other = (AssegnazioneDaRicerca) obj;
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
            ((this.data==null && other.getData()==null) || 
             (this.data!=null &&
              this.data.equals(other.getData()))) &&
            ((this.datascadenza==null && other.getDatascadenza()==null) || 
             (this.datascadenza!=null &&
              this.datascadenza.equals(other.getDatascadenza()))) &&
            ((this.esito==null && other.getEsito()==null) || 
             (this.esito!=null &&
              this.esito.equals(other.getEsito()))) &&
            ((this.id==null && other.getId()==null) || 
             (this.id!=null &&
              this.id.equals(other.getId()))) &&
            ((this.iddocumentale==null && other.getIddocumentale()==null) || 
             (this.iddocumentale!=null &&
              this.iddocumentale.equals(other.getIddocumentale()))) &&
            ((this.idprofilo==null && other.getIdprofilo()==null) || 
             (this.idprofilo!=null &&
              this.idprofilo.equals(other.getIdprofilo()))) &&
            ((this.numeroProtocollo==null && other.getNumeroProtocollo()==null) || 
             (this.numeroProtocollo!=null &&
              this.numeroProtocollo.equals(other.getNumeroProtocollo()))) &&
            ((this.dataProtocollo==null && other.getDataProtocollo()==null) || 
             (this.dataProtocollo!=null &&
              this.dataProtocollo.equals(other.getDataProtocollo()))) &&
            ((this.registro==null && other.getRegistro()==null) || 
             (this.registro!=null &&
              this.registro.equals(other.getRegistro()))) &&
            ((this.note==null && other.getNote()==null) || 
             (this.note!=null &&
              this.note.equals(other.getNote()))) &&
            ((this.tipo==null && other.getTipo()==null) || 
             (this.tipo!=null &&
              this.tipo.equals(other.getTipo()))) &&
            ((this.ufficio==null && other.getUfficio()==null) || 
             (this.ufficio!=null &&
              this.ufficio.equals(other.getUfficio()))) &&
            ((this.utente==null && other.getUtente()==null) || 
             (this.utente!=null &&
              this.utente.equals(other.getUtente()))) &&
            ((this.oggetto==null && other.getOggetto()==null) || 
             (this.oggetto!=null &&
              this.oggetto.equals(other.getOggetto()))) &&
            ((this.segnatura==null && other.getSegnatura()==null) || 
             (this.segnatura!=null &&
              this.segnatura.equals(other.getSegnatura())));
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
        if (getData() != null) {
            _hashCode += getData().hashCode();
        }
        if (getDatascadenza() != null) {
            _hashCode += getDatascadenza().hashCode();
        }
        if (getEsito() != null) {
            _hashCode += getEsito().hashCode();
        }
        if (getId() != null) {
            _hashCode += getId().hashCode();
        }
        if (getIddocumentale() != null) {
            _hashCode += getIddocumentale().hashCode();
        }
        if (getIdprofilo() != null) {
            _hashCode += getIdprofilo().hashCode();
        }
        if (getNumeroProtocollo() != null) {
            _hashCode += getNumeroProtocollo().hashCode();
        }
        if (getDataProtocollo() != null) {
            _hashCode += getDataProtocollo().hashCode();
        }
        if (getRegistro() != null) {
            _hashCode += getRegistro().hashCode();
        }
        if (getNote() != null) {
            _hashCode += getNote().hashCode();
        }
        if (getTipo() != null) {
            _hashCode += getTipo().hashCode();
        }
        if (getUfficio() != null) {
            _hashCode += getUfficio().hashCode();
        }
        if (getUtente() != null) {
            _hashCode += getUtente().hashCode();
        }
        if (getOggetto() != null) {
            _hashCode += getOggetto().hashCode();
        }
        if (getSegnatura() != null) {
            _hashCode += getSegnatura().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(AssegnazioneDaRicerca.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://type.ws.folium.agora", "AssegnazioneDaRicerca"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("assegnante");
        elemField.setXmlName(new javax.xml.namespace.QName("", "assegnante"));
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
        elemField.setFieldName("datascadenza");
        elemField.setXmlName(new javax.xml.namespace.QName("", "datascadenza"));
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
        elemField.setFieldName("id");
        elemField.setXmlName(new javax.xml.namespace.QName("", "id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "long"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("iddocumentale");
        elemField.setXmlName(new javax.xml.namespace.QName("", "iddocumentale"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("idprofilo");
        elemField.setXmlName(new javax.xml.namespace.QName("", "idprofilo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "long"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numeroProtocollo");
        elemField.setXmlName(new javax.xml.namespace.QName("", "numeroProtocollo"));
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
        elemField.setFieldName("registro");
        elemField.setXmlName(new javax.xml.namespace.QName("", "registro"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("note");
        elemField.setXmlName(new javax.xml.namespace.QName("", "note"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tipo");
        elemField.setXmlName(new javax.xml.namespace.QName("", "tipo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ufficio");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ufficio"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("utente");
        elemField.setXmlName(new javax.xml.namespace.QName("", "utente"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("oggetto");
        elemField.setXmlName(new javax.xml.namespace.QName("", "oggetto"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("segnatura");
        elemField.setXmlName(new javax.xml.namespace.QName("", "segnatura"));
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
