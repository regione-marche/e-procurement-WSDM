/**
 * MittenteDestinatario.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package it.italprot.prowsprotocollo;

public class MittenteDestinatario  implements java.io.Serializable {
    private java.lang.String codice;

    private java.lang.String denominazione;

    private java.lang.String indirizzo;

    private java.lang.String cap;

    private java.lang.String citta;

    private java.lang.String prov;

    private java.lang.String email;

    private java.lang.String CC;

    private java.lang.String ufficio;

    private java.lang.String codiceFiscale;

    private it.italprot.prowsprotocollo.Notifica[] notificheMail;

    private java.lang.String tipoSoggetto;

    private java.lang.String codiceIPASoggetto;

    public MittenteDestinatario() {
    }

    public MittenteDestinatario(
           java.lang.String codice,
           java.lang.String denominazione,
           java.lang.String indirizzo,
           java.lang.String cap,
           java.lang.String citta,
           java.lang.String prov,
           java.lang.String email,
           java.lang.String CC,
           java.lang.String ufficio,
           java.lang.String codiceFiscale,
           it.italprot.prowsprotocollo.Notifica[] notificheMail,
           java.lang.String tipoSoggetto,
           java.lang.String codiceIPASoggetto) {
           this.codice = codice;
           this.denominazione = denominazione;
           this.indirizzo = indirizzo;
           this.cap = cap;
           this.citta = citta;
           this.prov = prov;
           this.email = email;
           this.CC = CC;
           this.ufficio = ufficio;
           this.codiceFiscale = codiceFiscale;
           this.notificheMail = notificheMail;
           this.tipoSoggetto = tipoSoggetto;
           this.codiceIPASoggetto = codiceIPASoggetto;
    }


    /**
     * Gets the codice value for this MittenteDestinatario.
     * 
     * @return codice
     */
    public java.lang.String getCodice() {
        return codice;
    }


    /**
     * Sets the codice value for this MittenteDestinatario.
     * 
     * @param codice
     */
    public void setCodice(java.lang.String codice) {
        this.codice = codice;
    }


    /**
     * Gets the denominazione value for this MittenteDestinatario.
     * 
     * @return denominazione
     */
    public java.lang.String getDenominazione() {
        return denominazione;
    }


    /**
     * Sets the denominazione value for this MittenteDestinatario.
     * 
     * @param denominazione
     */
    public void setDenominazione(java.lang.String denominazione) {
        this.denominazione = denominazione;
    }


    /**
     * Gets the indirizzo value for this MittenteDestinatario.
     * 
     * @return indirizzo
     */
    public java.lang.String getIndirizzo() {
        return indirizzo;
    }


    /**
     * Sets the indirizzo value for this MittenteDestinatario.
     * 
     * @param indirizzo
     */
    public void setIndirizzo(java.lang.String indirizzo) {
        this.indirizzo = indirizzo;
    }


    /**
     * Gets the cap value for this MittenteDestinatario.
     * 
     * @return cap
     */
    public java.lang.String getCap() {
        return cap;
    }


    /**
     * Sets the cap value for this MittenteDestinatario.
     * 
     * @param cap
     */
    public void setCap(java.lang.String cap) {
        this.cap = cap;
    }


    /**
     * Gets the citta value for this MittenteDestinatario.
     * 
     * @return citta
     */
    public java.lang.String getCitta() {
        return citta;
    }


    /**
     * Sets the citta value for this MittenteDestinatario.
     * 
     * @param citta
     */
    public void setCitta(java.lang.String citta) {
        this.citta = citta;
    }


    /**
     * Gets the prov value for this MittenteDestinatario.
     * 
     * @return prov
     */
    public java.lang.String getProv() {
        return prov;
    }


    /**
     * Sets the prov value for this MittenteDestinatario.
     * 
     * @param prov
     */
    public void setProv(java.lang.String prov) {
        this.prov = prov;
    }


    /**
     * Gets the email value for this MittenteDestinatario.
     * 
     * @return email
     */
    public java.lang.String getEmail() {
        return email;
    }


    /**
     * Sets the email value for this MittenteDestinatario.
     * 
     * @param email
     */
    public void setEmail(java.lang.String email) {
        this.email = email;
    }


    /**
     * Gets the CC value for this MittenteDestinatario.
     * 
     * @return CC
     */
    public java.lang.String getCC() {
        return CC;
    }


    /**
     * Sets the CC value for this MittenteDestinatario.
     * 
     * @param CC
     */
    public void setCC(java.lang.String CC) {
        this.CC = CC;
    }


    /**
     * Gets the ufficio value for this MittenteDestinatario.
     * 
     * @return ufficio
     */
    public java.lang.String getUfficio() {
        return ufficio;
    }


    /**
     * Sets the ufficio value for this MittenteDestinatario.
     * 
     * @param ufficio
     */
    public void setUfficio(java.lang.String ufficio) {
        this.ufficio = ufficio;
    }


    /**
     * Gets the codiceFiscale value for this MittenteDestinatario.
     * 
     * @return codiceFiscale
     */
    public java.lang.String getCodiceFiscale() {
        return codiceFiscale;
    }


    /**
     * Sets the codiceFiscale value for this MittenteDestinatario.
     * 
     * @param codiceFiscale
     */
    public void setCodiceFiscale(java.lang.String codiceFiscale) {
        this.codiceFiscale = codiceFiscale;
    }


    /**
     * Gets the notificheMail value for this MittenteDestinatario.
     * 
     * @return notificheMail
     */
    public it.italprot.prowsprotocollo.Notifica[] getNotificheMail() {
        return notificheMail;
    }


    /**
     * Sets the notificheMail value for this MittenteDestinatario.
     * 
     * @param notificheMail
     */
    public void setNotificheMail(it.italprot.prowsprotocollo.Notifica[] notificheMail) {
        this.notificheMail = notificheMail;
    }


    /**
     * Gets the tipoSoggetto value for this MittenteDestinatario.
     * 
     * @return tipoSoggetto
     */
    public java.lang.String getTipoSoggetto() {
        return tipoSoggetto;
    }


    /**
     * Sets the tipoSoggetto value for this MittenteDestinatario.
     * 
     * @param tipoSoggetto
     */
    public void setTipoSoggetto(java.lang.String tipoSoggetto) {
        this.tipoSoggetto = tipoSoggetto;
    }


    /**
     * Gets the codiceIPASoggetto value for this MittenteDestinatario.
     * 
     * @return codiceIPASoggetto
     */
    public java.lang.String getCodiceIPASoggetto() {
        return codiceIPASoggetto;
    }


    /**
     * Sets the codiceIPASoggetto value for this MittenteDestinatario.
     * 
     * @param codiceIPASoggetto
     */
    public void setCodiceIPASoggetto(java.lang.String codiceIPASoggetto) {
        this.codiceIPASoggetto = codiceIPASoggetto;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof MittenteDestinatario)) return false;
        MittenteDestinatario other = (MittenteDestinatario) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.codice==null && other.getCodice()==null) || 
             (this.codice!=null &&
              this.codice.equals(other.getCodice()))) &&
            ((this.denominazione==null && other.getDenominazione()==null) || 
             (this.denominazione!=null &&
              this.denominazione.equals(other.getDenominazione()))) &&
            ((this.indirizzo==null && other.getIndirizzo()==null) || 
             (this.indirizzo!=null &&
              this.indirizzo.equals(other.getIndirizzo()))) &&
            ((this.cap==null && other.getCap()==null) || 
             (this.cap!=null &&
              this.cap.equals(other.getCap()))) &&
            ((this.citta==null && other.getCitta()==null) || 
             (this.citta!=null &&
              this.citta.equals(other.getCitta()))) &&
            ((this.prov==null && other.getProv()==null) || 
             (this.prov!=null &&
              this.prov.equals(other.getProv()))) &&
            ((this.email==null && other.getEmail()==null) || 
             (this.email!=null &&
              this.email.equals(other.getEmail()))) &&
            ((this.CC==null && other.getCC()==null) || 
             (this.CC!=null &&
              this.CC.equals(other.getCC()))) &&
            ((this.ufficio==null && other.getUfficio()==null) || 
             (this.ufficio!=null &&
              this.ufficio.equals(other.getUfficio()))) &&
            ((this.codiceFiscale==null && other.getCodiceFiscale()==null) || 
             (this.codiceFiscale!=null &&
              this.codiceFiscale.equals(other.getCodiceFiscale()))) &&
            ((this.notificheMail==null && other.getNotificheMail()==null) || 
             (this.notificheMail!=null &&
              java.util.Arrays.equals(this.notificheMail, other.getNotificheMail()))) &&
            ((this.tipoSoggetto==null && other.getTipoSoggetto()==null) || 
             (this.tipoSoggetto!=null &&
              this.tipoSoggetto.equals(other.getTipoSoggetto()))) &&
            ((this.codiceIPASoggetto==null && other.getCodiceIPASoggetto()==null) || 
             (this.codiceIPASoggetto!=null &&
              this.codiceIPASoggetto.equals(other.getCodiceIPASoggetto())));
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
        if (getCodice() != null) {
            _hashCode += getCodice().hashCode();
        }
        if (getDenominazione() != null) {
            _hashCode += getDenominazione().hashCode();
        }
        if (getIndirizzo() != null) {
            _hashCode += getIndirizzo().hashCode();
        }
        if (getCap() != null) {
            _hashCode += getCap().hashCode();
        }
        if (getCitta() != null) {
            _hashCode += getCitta().hashCode();
        }
        if (getProv() != null) {
            _hashCode += getProv().hashCode();
        }
        if (getEmail() != null) {
            _hashCode += getEmail().hashCode();
        }
        if (getCC() != null) {
            _hashCode += getCC().hashCode();
        }
        if (getUfficio() != null) {
            _hashCode += getUfficio().hashCode();
        }
        if (getCodiceFiscale() != null) {
            _hashCode += getCodiceFiscale().hashCode();
        }
        if (getNotificheMail() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getNotificheMail());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getNotificheMail(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getTipoSoggetto() != null) {
            _hashCode += getTipoSoggetto().hashCode();
        }
        if (getCodiceIPASoggetto() != null) {
            _hashCode += getCodiceIPASoggetto().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(MittenteDestinatario.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:proWsProtocollo", "mittenteDestinatario"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codice");
        elemField.setXmlName(new javax.xml.namespace.QName("", "codice"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("denominazione");
        elemField.setXmlName(new javax.xml.namespace.QName("", "denominazione"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("indirizzo");
        elemField.setXmlName(new javax.xml.namespace.QName("", "indirizzo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cap");
        elemField.setXmlName(new javax.xml.namespace.QName("", "cap"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("citta");
        elemField.setXmlName(new javax.xml.namespace.QName("", "citta"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("prov");
        elemField.setXmlName(new javax.xml.namespace.QName("", "prov"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("email");
        elemField.setXmlName(new javax.xml.namespace.QName("", "email"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("CC");
        elemField.setXmlName(new javax.xml.namespace.QName("", "CC"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ufficio");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ufficio"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codiceFiscale");
        elemField.setXmlName(new javax.xml.namespace.QName("", "codiceFiscale"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("notificheMail");
        elemField.setXmlName(new javax.xml.namespace.QName("", "notificheMail"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:proWsProtocollo", "notifica"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tipoSoggetto");
        elemField.setXmlName(new javax.xml.namespace.QName("", "tipoSoggetto"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codiceIPASoggetto");
        elemField.setXmlName(new javax.xml.namespace.QName("", "codiceIPASoggetto"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
