/**
 * Fascicolo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package agora.folium.ws.type;

public class Fascicolo  implements java.io.Serializable {
    private java.lang.String codiceUfficioProprietario;

    private java.lang.String dataApertura;

    private java.lang.String dataChiusura;

    private java.lang.String dataScadenza;

    private java.lang.String descrizione;

    private agora.folium.ws.WSEsito esito;

    private java.lang.Long idAcl;

    private java.lang.Long idFolder;

    private java.lang.String nome;

    private java.lang.String responsabile;

    private java.lang.String stato;

    private agora.folium.ws.type.VoceTitolario voceTitolario;

    private java.lang.String numero;

    private java.lang.String codiFiscaliIva;

    private java.lang.String descRichiedente;

    public Fascicolo() {
    }

    public Fascicolo(
           java.lang.String codiceUfficioProprietario,
           java.lang.String dataApertura,
           java.lang.String dataChiusura,
           java.lang.String dataScadenza,
           java.lang.String descrizione,
           agora.folium.ws.WSEsito esito,
           java.lang.Long idAcl,
           java.lang.Long idFolder,
           java.lang.String nome,
           java.lang.String responsabile,
           java.lang.String stato,
           agora.folium.ws.type.VoceTitolario voceTitolario,
           java.lang.String numero,
           java.lang.String codiFiscaliIva,
           java.lang.String descRichiedente) {
           this.codiceUfficioProprietario = codiceUfficioProprietario;
           this.dataApertura = dataApertura;
           this.dataChiusura = dataChiusura;
           this.dataScadenza = dataScadenza;
           this.descrizione = descrizione;
           this.esito = esito;
           this.idAcl = idAcl;
           this.idFolder = idFolder;
           this.nome = nome;
           this.responsabile = responsabile;
           this.stato = stato;
           this.voceTitolario = voceTitolario;
           this.numero = numero;
           this.codiFiscaliIva = codiFiscaliIva;
           this.descRichiedente = descRichiedente;
    }


    /**
     * Gets the codiceUfficioProprietario value for this Fascicolo.
     * 
     * @return codiceUfficioProprietario
     */
    public java.lang.String getCodiceUfficioProprietario() {
        return codiceUfficioProprietario;
    }


    /**
     * Sets the codiceUfficioProprietario value for this Fascicolo.
     * 
     * @param codiceUfficioProprietario
     */
    public void setCodiceUfficioProprietario(java.lang.String codiceUfficioProprietario) {
        this.codiceUfficioProprietario = codiceUfficioProprietario;
    }


    /**
     * Gets the dataApertura value for this Fascicolo.
     * 
     * @return dataApertura
     */
    public java.lang.String getDataApertura() {
        return dataApertura;
    }


    /**
     * Sets the dataApertura value for this Fascicolo.
     * 
     * @param dataApertura
     */
    public void setDataApertura(java.lang.String dataApertura) {
        this.dataApertura = dataApertura;
    }


    /**
     * Gets the dataChiusura value for this Fascicolo.
     * 
     * @return dataChiusura
     */
    public java.lang.String getDataChiusura() {
        return dataChiusura;
    }


    /**
     * Sets the dataChiusura value for this Fascicolo.
     * 
     * @param dataChiusura
     */
    public void setDataChiusura(java.lang.String dataChiusura) {
        this.dataChiusura = dataChiusura;
    }


    /**
     * Gets the dataScadenza value for this Fascicolo.
     * 
     * @return dataScadenza
     */
    public java.lang.String getDataScadenza() {
        return dataScadenza;
    }


    /**
     * Sets the dataScadenza value for this Fascicolo.
     * 
     * @param dataScadenza
     */
    public void setDataScadenza(java.lang.String dataScadenza) {
        this.dataScadenza = dataScadenza;
    }


    /**
     * Gets the descrizione value for this Fascicolo.
     * 
     * @return descrizione
     */
    public java.lang.String getDescrizione() {
        return descrizione;
    }


    /**
     * Sets the descrizione value for this Fascicolo.
     * 
     * @param descrizione
     */
    public void setDescrizione(java.lang.String descrizione) {
        this.descrizione = descrizione;
    }


    /**
     * Gets the esito value for this Fascicolo.
     * 
     * @return esito
     */
    public agora.folium.ws.WSEsito getEsito() {
        return esito;
    }


    /**
     * Sets the esito value for this Fascicolo.
     * 
     * @param esito
     */
    public void setEsito(agora.folium.ws.WSEsito esito) {
        this.esito = esito;
    }


    /**
     * Gets the idAcl value for this Fascicolo.
     * 
     * @return idAcl
     */
    public java.lang.Long getIdAcl() {
        return idAcl;
    }


    /**
     * Sets the idAcl value for this Fascicolo.
     * 
     * @param idAcl
     */
    public void setIdAcl(java.lang.Long idAcl) {
        this.idAcl = idAcl;
    }


    /**
     * Gets the idFolder value for this Fascicolo.
     * 
     * @return idFolder
     */
    public java.lang.Long getIdFolder() {
        return idFolder;
    }


    /**
     * Sets the idFolder value for this Fascicolo.
     * 
     * @param idFolder
     */
    public void setIdFolder(java.lang.Long idFolder) {
        this.idFolder = idFolder;
    }


    /**
     * Gets the nome value for this Fascicolo.
     * 
     * @return nome
     */
    public java.lang.String getNome() {
        return nome;
    }


    /**
     * Sets the nome value for this Fascicolo.
     * 
     * @param nome
     */
    public void setNome(java.lang.String nome) {
        this.nome = nome;
    }


    /**
     * Gets the responsabile value for this Fascicolo.
     * 
     * @return responsabile
     */
    public java.lang.String getResponsabile() {
        return responsabile;
    }


    /**
     * Sets the responsabile value for this Fascicolo.
     * 
     * @param responsabile
     */
    public void setResponsabile(java.lang.String responsabile) {
        this.responsabile = responsabile;
    }


    /**
     * Gets the stato value for this Fascicolo.
     * 
     * @return stato
     */
    public java.lang.String getStato() {
        return stato;
    }


    /**
     * Sets the stato value for this Fascicolo.
     * 
     * @param stato
     */
    public void setStato(java.lang.String stato) {
        this.stato = stato;
    }


    /**
     * Gets the voceTitolario value for this Fascicolo.
     * 
     * @return voceTitolario
     */
    public agora.folium.ws.type.VoceTitolario getVoceTitolario() {
        return voceTitolario;
    }


    /**
     * Sets the voceTitolario value for this Fascicolo.
     * 
     * @param voceTitolario
     */
    public void setVoceTitolario(agora.folium.ws.type.VoceTitolario voceTitolario) {
        this.voceTitolario = voceTitolario;
    }


    /**
     * Gets the numero value for this Fascicolo.
     * 
     * @return numero
     */
    public java.lang.String getNumero() {
        return numero;
    }


    /**
     * Sets the numero value for this Fascicolo.
     * 
     * @param numero
     */
    public void setNumero(java.lang.String numero) {
        this.numero = numero;
    }


    /**
     * Gets the codiFiscaliIva value for this Fascicolo.
     * 
     * @return codiFiscaliIva
     */
    public java.lang.String getCodiFiscaliIva() {
        return codiFiscaliIva;
    }


    /**
     * Sets the codiFiscaliIva value for this Fascicolo.
     * 
     * @param codiFiscaliIva
     */
    public void setCodiFiscaliIva(java.lang.String codiFiscaliIva) {
        this.codiFiscaliIva = codiFiscaliIva;
    }


    /**
     * Gets the descRichiedente value for this Fascicolo.
     * 
     * @return descRichiedente
     */
    public java.lang.String getDescRichiedente() {
        return descRichiedente;
    }


    /**
     * Sets the descRichiedente value for this Fascicolo.
     * 
     * @param descRichiedente
     */
    public void setDescRichiedente(java.lang.String descRichiedente) {
        this.descRichiedente = descRichiedente;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Fascicolo)) return false;
        Fascicolo other = (Fascicolo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.codiceUfficioProprietario==null && other.getCodiceUfficioProprietario()==null) || 
             (this.codiceUfficioProprietario!=null &&
              this.codiceUfficioProprietario.equals(other.getCodiceUfficioProprietario()))) &&
            ((this.dataApertura==null && other.getDataApertura()==null) || 
             (this.dataApertura!=null &&
              this.dataApertura.equals(other.getDataApertura()))) &&
            ((this.dataChiusura==null && other.getDataChiusura()==null) || 
             (this.dataChiusura!=null &&
              this.dataChiusura.equals(other.getDataChiusura()))) &&
            ((this.dataScadenza==null && other.getDataScadenza()==null) || 
             (this.dataScadenza!=null &&
              this.dataScadenza.equals(other.getDataScadenza()))) &&
            ((this.descrizione==null && other.getDescrizione()==null) || 
             (this.descrizione!=null &&
              this.descrizione.equals(other.getDescrizione()))) &&
            ((this.esito==null && other.getEsito()==null) || 
             (this.esito!=null &&
              this.esito.equals(other.getEsito()))) &&
            ((this.idAcl==null && other.getIdAcl()==null) || 
             (this.idAcl!=null &&
              this.idAcl.equals(other.getIdAcl()))) &&
            ((this.idFolder==null && other.getIdFolder()==null) || 
             (this.idFolder!=null &&
              this.idFolder.equals(other.getIdFolder()))) &&
            ((this.nome==null && other.getNome()==null) || 
             (this.nome!=null &&
              this.nome.equals(other.getNome()))) &&
            ((this.responsabile==null && other.getResponsabile()==null) || 
             (this.responsabile!=null &&
              this.responsabile.equals(other.getResponsabile()))) &&
            ((this.stato==null && other.getStato()==null) || 
             (this.stato!=null &&
              this.stato.equals(other.getStato()))) &&
            ((this.voceTitolario==null && other.getVoceTitolario()==null) || 
             (this.voceTitolario!=null &&
              this.voceTitolario.equals(other.getVoceTitolario()))) &&
            ((this.numero==null && other.getNumero()==null) || 
             (this.numero!=null &&
              this.numero.equals(other.getNumero()))) &&
            ((this.codiFiscaliIva==null && other.getCodiFiscaliIva()==null) || 
             (this.codiFiscaliIva!=null &&
              this.codiFiscaliIva.equals(other.getCodiFiscaliIva()))) &&
            ((this.descRichiedente==null && other.getDescRichiedente()==null) || 
             (this.descRichiedente!=null &&
              this.descRichiedente.equals(other.getDescRichiedente())));
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
        if (getCodiceUfficioProprietario() != null) {
            _hashCode += getCodiceUfficioProprietario().hashCode();
        }
        if (getDataApertura() != null) {
            _hashCode += getDataApertura().hashCode();
        }
        if (getDataChiusura() != null) {
            _hashCode += getDataChiusura().hashCode();
        }
        if (getDataScadenza() != null) {
            _hashCode += getDataScadenza().hashCode();
        }
        if (getDescrizione() != null) {
            _hashCode += getDescrizione().hashCode();
        }
        if (getEsito() != null) {
            _hashCode += getEsito().hashCode();
        }
        if (getIdAcl() != null) {
            _hashCode += getIdAcl().hashCode();
        }
        if (getIdFolder() != null) {
            _hashCode += getIdFolder().hashCode();
        }
        if (getNome() != null) {
            _hashCode += getNome().hashCode();
        }
        if (getResponsabile() != null) {
            _hashCode += getResponsabile().hashCode();
        }
        if (getStato() != null) {
            _hashCode += getStato().hashCode();
        }
        if (getVoceTitolario() != null) {
            _hashCode += getVoceTitolario().hashCode();
        }
        if (getNumero() != null) {
            _hashCode += getNumero().hashCode();
        }
        if (getCodiFiscaliIva() != null) {
            _hashCode += getCodiFiscaliIva().hashCode();
        }
        if (getDescRichiedente() != null) {
            _hashCode += getDescRichiedente().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Fascicolo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://type.ws.folium.agora", "Fascicolo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codiceUfficioProprietario");
        elemField.setXmlName(new javax.xml.namespace.QName("", "codiceUfficioProprietario"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dataApertura");
        elemField.setXmlName(new javax.xml.namespace.QName("", "dataApertura"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dataChiusura");
        elemField.setXmlName(new javax.xml.namespace.QName("", "dataChiusura"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dataScadenza");
        elemField.setXmlName(new javax.xml.namespace.QName("", "dataScadenza"));
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
        elemField.setFieldName("idAcl");
        elemField.setXmlName(new javax.xml.namespace.QName("", "idAcl"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "long"));
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
        elemField.setFieldName("responsabile");
        elemField.setXmlName(new javax.xml.namespace.QName("", "responsabile"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("stato");
        elemField.setXmlName(new javax.xml.namespace.QName("", "stato"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("voceTitolario");
        elemField.setXmlName(new javax.xml.namespace.QName("", "voceTitolario"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://type.ws.folium.agora", "VoceTitolario"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numero");
        elemField.setXmlName(new javax.xml.namespace.QName("", "numero"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codiFiscaliIva");
        elemField.setXmlName(new javax.xml.namespace.QName("", "codiFiscaliIva"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("descRichiedente");
        elemField.setXmlName(new javax.xml.namespace.QName("", "descRichiedente"));
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
