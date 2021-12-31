/**
 * DatiProtocollo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package it.italprot.prowsprotocollo;

public class DatiProtocollo  implements java.io.Serializable {
    private java.lang.String tipoProtocollo;

    private java.lang.String ufficioOperatore;

    private it.italprot.prowsprotocollo.Firmatario[] firmatari;

    private java.lang.String oggetto;

    private java.lang.String tipoDocumento;

    private java.lang.String numeroProtocolloAntecedente;

    private java.lang.String annoProtocolloAntecedente;

    private java.lang.String tipoProtocolloAntecedente;

    private java.lang.String numeroProtocolloMittente;

    private java.lang.String dataProtocolloMittente;

    private java.lang.String dataArrivo;

    private java.lang.String protocolloEmergenza;

    private it.italprot.prowsprotocollo.MittenteDestinatario[] mittenti;

    private it.italprot.prowsprotocollo.MittenteDestinatario[] destinatari;

    private java.lang.String classificazione;

    private it.italprot.prowsprotocollo.Trasmissione[] trasmissioniInterne;

    private it.italprot.prowsprotocollo.Allegato allegato;

    private it.italprot.prowsprotocollo.AllegatoPrecaricato[] allegatiPrecaricati;

    public DatiProtocollo() {
    }

    public DatiProtocollo(
           java.lang.String tipoProtocollo,
           java.lang.String ufficioOperatore,
           it.italprot.prowsprotocollo.Firmatario[] firmatari,
           java.lang.String oggetto,
           java.lang.String tipoDocumento,
           java.lang.String numeroProtocolloAntecedente,
           java.lang.String annoProtocolloAntecedente,
           java.lang.String tipoProtocolloAntecedente,
           java.lang.String numeroProtocolloMittente,
           java.lang.String dataProtocolloMittente,
           java.lang.String dataArrivo,
           java.lang.String protocolloEmergenza,
           it.italprot.prowsprotocollo.MittenteDestinatario[] mittenti,
           it.italprot.prowsprotocollo.MittenteDestinatario[] destinatari,
           java.lang.String classificazione,
           it.italprot.prowsprotocollo.Trasmissione[] trasmissioniInterne,
           it.italprot.prowsprotocollo.Allegato allegato,
           it.italprot.prowsprotocollo.AllegatoPrecaricato[] allegatiPrecaricati) {
           this.tipoProtocollo = tipoProtocollo;
           this.ufficioOperatore = ufficioOperatore;
           this.firmatari = firmatari;
           this.oggetto = oggetto;
           this.tipoDocumento = tipoDocumento;
           this.numeroProtocolloAntecedente = numeroProtocolloAntecedente;
           this.annoProtocolloAntecedente = annoProtocolloAntecedente;
           this.tipoProtocolloAntecedente = tipoProtocolloAntecedente;
           this.numeroProtocolloMittente = numeroProtocolloMittente;
           this.dataProtocolloMittente = dataProtocolloMittente;
           this.dataArrivo = dataArrivo;
           this.protocolloEmergenza = protocolloEmergenza;
           this.mittenti = mittenti;
           this.destinatari = destinatari;
           this.classificazione = classificazione;
           this.trasmissioniInterne = trasmissioniInterne;
           this.allegato = allegato;
           this.allegatiPrecaricati = allegatiPrecaricati;
    }


    /**
     * Gets the tipoProtocollo value for this DatiProtocollo.
     * 
     * @return tipoProtocollo
     */
    public java.lang.String getTipoProtocollo() {
        return tipoProtocollo;
    }


    /**
     * Sets the tipoProtocollo value for this DatiProtocollo.
     * 
     * @param tipoProtocollo
     */
    public void setTipoProtocollo(java.lang.String tipoProtocollo) {
        this.tipoProtocollo = tipoProtocollo;
    }


    /**
     * Gets the ufficioOperatore value for this DatiProtocollo.
     * 
     * @return ufficioOperatore
     */
    public java.lang.String getUfficioOperatore() {
        return ufficioOperatore;
    }


    /**
     * Sets the ufficioOperatore value for this DatiProtocollo.
     * 
     * @param ufficioOperatore
     */
    public void setUfficioOperatore(java.lang.String ufficioOperatore) {
        this.ufficioOperatore = ufficioOperatore;
    }


    /**
     * Gets the firmatari value for this DatiProtocollo.
     * 
     * @return firmatari
     */
    public it.italprot.prowsprotocollo.Firmatario[] getFirmatari() {
        return firmatari;
    }


    /**
     * Sets the firmatari value for this DatiProtocollo.
     * 
     * @param firmatari
     */
    public void setFirmatari(it.italprot.prowsprotocollo.Firmatario[] firmatari) {
        this.firmatari = firmatari;
    }


    /**
     * Gets the oggetto value for this DatiProtocollo.
     * 
     * @return oggetto
     */
    public java.lang.String getOggetto() {
        return oggetto;
    }


    /**
     * Sets the oggetto value for this DatiProtocollo.
     * 
     * @param oggetto
     */
    public void setOggetto(java.lang.String oggetto) {
        this.oggetto = oggetto;
    }


    /**
     * Gets the tipoDocumento value for this DatiProtocollo.
     * 
     * @return tipoDocumento
     */
    public java.lang.String getTipoDocumento() {
        return tipoDocumento;
    }


    /**
     * Sets the tipoDocumento value for this DatiProtocollo.
     * 
     * @param tipoDocumento
     */
    public void setTipoDocumento(java.lang.String tipoDocumento) {
        this.tipoDocumento = tipoDocumento;
    }


    /**
     * Gets the numeroProtocolloAntecedente value for this DatiProtocollo.
     * 
     * @return numeroProtocolloAntecedente
     */
    public java.lang.String getNumeroProtocolloAntecedente() {
        return numeroProtocolloAntecedente;
    }


    /**
     * Sets the numeroProtocolloAntecedente value for this DatiProtocollo.
     * 
     * @param numeroProtocolloAntecedente
     */
    public void setNumeroProtocolloAntecedente(java.lang.String numeroProtocolloAntecedente) {
        this.numeroProtocolloAntecedente = numeroProtocolloAntecedente;
    }


    /**
     * Gets the annoProtocolloAntecedente value for this DatiProtocollo.
     * 
     * @return annoProtocolloAntecedente
     */
    public java.lang.String getAnnoProtocolloAntecedente() {
        return annoProtocolloAntecedente;
    }


    /**
     * Sets the annoProtocolloAntecedente value for this DatiProtocollo.
     * 
     * @param annoProtocolloAntecedente
     */
    public void setAnnoProtocolloAntecedente(java.lang.String annoProtocolloAntecedente) {
        this.annoProtocolloAntecedente = annoProtocolloAntecedente;
    }


    /**
     * Gets the tipoProtocolloAntecedente value for this DatiProtocollo.
     * 
     * @return tipoProtocolloAntecedente
     */
    public java.lang.String getTipoProtocolloAntecedente() {
        return tipoProtocolloAntecedente;
    }


    /**
     * Sets the tipoProtocolloAntecedente value for this DatiProtocollo.
     * 
     * @param tipoProtocolloAntecedente
     */
    public void setTipoProtocolloAntecedente(java.lang.String tipoProtocolloAntecedente) {
        this.tipoProtocolloAntecedente = tipoProtocolloAntecedente;
    }


    /**
     * Gets the numeroProtocolloMittente value for this DatiProtocollo.
     * 
     * @return numeroProtocolloMittente
     */
    public java.lang.String getNumeroProtocolloMittente() {
        return numeroProtocolloMittente;
    }


    /**
     * Sets the numeroProtocolloMittente value for this DatiProtocollo.
     * 
     * @param numeroProtocolloMittente
     */
    public void setNumeroProtocolloMittente(java.lang.String numeroProtocolloMittente) {
        this.numeroProtocolloMittente = numeroProtocolloMittente;
    }


    /**
     * Gets the dataProtocolloMittente value for this DatiProtocollo.
     * 
     * @return dataProtocolloMittente
     */
    public java.lang.String getDataProtocolloMittente() {
        return dataProtocolloMittente;
    }


    /**
     * Sets the dataProtocolloMittente value for this DatiProtocollo.
     * 
     * @param dataProtocolloMittente
     */
    public void setDataProtocolloMittente(java.lang.String dataProtocolloMittente) {
        this.dataProtocolloMittente = dataProtocolloMittente;
    }


    /**
     * Gets the dataArrivo value for this DatiProtocollo.
     * 
     * @return dataArrivo
     */
    public java.lang.String getDataArrivo() {
        return dataArrivo;
    }


    /**
     * Sets the dataArrivo value for this DatiProtocollo.
     * 
     * @param dataArrivo
     */
    public void setDataArrivo(java.lang.String dataArrivo) {
        this.dataArrivo = dataArrivo;
    }


    /**
     * Gets the protocolloEmergenza value for this DatiProtocollo.
     * 
     * @return protocolloEmergenza
     */
    public java.lang.String getProtocolloEmergenza() {
        return protocolloEmergenza;
    }


    /**
     * Sets the protocolloEmergenza value for this DatiProtocollo.
     * 
     * @param protocolloEmergenza
     */
    public void setProtocolloEmergenza(java.lang.String protocolloEmergenza) {
        this.protocolloEmergenza = protocolloEmergenza;
    }


    /**
     * Gets the mittenti value for this DatiProtocollo.
     * 
     * @return mittenti
     */
    public it.italprot.prowsprotocollo.MittenteDestinatario[] getMittenti() {
        return mittenti;
    }


    /**
     * Sets the mittenti value for this DatiProtocollo.
     * 
     * @param mittenti
     */
    public void setMittenti(it.italprot.prowsprotocollo.MittenteDestinatario[] mittenti) {
        this.mittenti = mittenti;
    }


    /**
     * Gets the destinatari value for this DatiProtocollo.
     * 
     * @return destinatari
     */
    public it.italprot.prowsprotocollo.MittenteDestinatario[] getDestinatari() {
        return destinatari;
    }


    /**
     * Sets the destinatari value for this DatiProtocollo.
     * 
     * @param destinatari
     */
    public void setDestinatari(it.italprot.prowsprotocollo.MittenteDestinatario[] destinatari) {
        this.destinatari = destinatari;
    }


    /**
     * Gets the classificazione value for this DatiProtocollo.
     * 
     * @return classificazione
     */
    public java.lang.String getClassificazione() {
        return classificazione;
    }


    /**
     * Sets the classificazione value for this DatiProtocollo.
     * 
     * @param classificazione
     */
    public void setClassificazione(java.lang.String classificazione) {
        this.classificazione = classificazione;
    }


    /**
     * Gets the trasmissioniInterne value for this DatiProtocollo.
     * 
     * @return trasmissioniInterne
     */
    public it.italprot.prowsprotocollo.Trasmissione[] getTrasmissioniInterne() {
        return trasmissioniInterne;
    }


    /**
     * Sets the trasmissioniInterne value for this DatiProtocollo.
     * 
     * @param trasmissioniInterne
     */
    public void setTrasmissioniInterne(it.italprot.prowsprotocollo.Trasmissione[] trasmissioniInterne) {
        this.trasmissioniInterne = trasmissioniInterne;
    }


    /**
     * Gets the allegato value for this DatiProtocollo.
     * 
     * @return allegato
     */
    public it.italprot.prowsprotocollo.Allegato getAllegato() {
        return allegato;
    }


    /**
     * Sets the allegato value for this DatiProtocollo.
     * 
     * @param allegato
     */
    public void setAllegato(it.italprot.prowsprotocollo.Allegato allegato) {
        this.allegato = allegato;
    }


    /**
     * Gets the allegatiPrecaricati value for this DatiProtocollo.
     * 
     * @return allegatiPrecaricati
     */
    public it.italprot.prowsprotocollo.AllegatoPrecaricato[] getAllegatiPrecaricati() {
        return allegatiPrecaricati;
    }


    /**
     * Sets the allegatiPrecaricati value for this DatiProtocollo.
     * 
     * @param allegatiPrecaricati
     */
    public void setAllegatiPrecaricati(it.italprot.prowsprotocollo.AllegatoPrecaricato[] allegatiPrecaricati) {
        this.allegatiPrecaricati = allegatiPrecaricati;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DatiProtocollo)) return false;
        DatiProtocollo other = (DatiProtocollo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.tipoProtocollo==null && other.getTipoProtocollo()==null) || 
             (this.tipoProtocollo!=null &&
              this.tipoProtocollo.equals(other.getTipoProtocollo()))) &&
            ((this.ufficioOperatore==null && other.getUfficioOperatore()==null) || 
             (this.ufficioOperatore!=null &&
              this.ufficioOperatore.equals(other.getUfficioOperatore()))) &&
            ((this.firmatari==null && other.getFirmatari()==null) || 
             (this.firmatari!=null &&
              java.util.Arrays.equals(this.firmatari, other.getFirmatari()))) &&
            ((this.oggetto==null && other.getOggetto()==null) || 
             (this.oggetto!=null &&
              this.oggetto.equals(other.getOggetto()))) &&
            ((this.tipoDocumento==null && other.getTipoDocumento()==null) || 
             (this.tipoDocumento!=null &&
              this.tipoDocumento.equals(other.getTipoDocumento()))) &&
            ((this.numeroProtocolloAntecedente==null && other.getNumeroProtocolloAntecedente()==null) || 
             (this.numeroProtocolloAntecedente!=null &&
              this.numeroProtocolloAntecedente.equals(other.getNumeroProtocolloAntecedente()))) &&
            ((this.annoProtocolloAntecedente==null && other.getAnnoProtocolloAntecedente()==null) || 
             (this.annoProtocolloAntecedente!=null &&
              this.annoProtocolloAntecedente.equals(other.getAnnoProtocolloAntecedente()))) &&
            ((this.tipoProtocolloAntecedente==null && other.getTipoProtocolloAntecedente()==null) || 
             (this.tipoProtocolloAntecedente!=null &&
              this.tipoProtocolloAntecedente.equals(other.getTipoProtocolloAntecedente()))) &&
            ((this.numeroProtocolloMittente==null && other.getNumeroProtocolloMittente()==null) || 
             (this.numeroProtocolloMittente!=null &&
              this.numeroProtocolloMittente.equals(other.getNumeroProtocolloMittente()))) &&
            ((this.dataProtocolloMittente==null && other.getDataProtocolloMittente()==null) || 
             (this.dataProtocolloMittente!=null &&
              this.dataProtocolloMittente.equals(other.getDataProtocolloMittente()))) &&
            ((this.dataArrivo==null && other.getDataArrivo()==null) || 
             (this.dataArrivo!=null &&
              this.dataArrivo.equals(other.getDataArrivo()))) &&
            ((this.protocolloEmergenza==null && other.getProtocolloEmergenza()==null) || 
             (this.protocolloEmergenza!=null &&
              this.protocolloEmergenza.equals(other.getProtocolloEmergenza()))) &&
            ((this.mittenti==null && other.getMittenti()==null) || 
             (this.mittenti!=null &&
              java.util.Arrays.equals(this.mittenti, other.getMittenti()))) &&
            ((this.destinatari==null && other.getDestinatari()==null) || 
             (this.destinatari!=null &&
              java.util.Arrays.equals(this.destinatari, other.getDestinatari()))) &&
            ((this.classificazione==null && other.getClassificazione()==null) || 
             (this.classificazione!=null &&
              this.classificazione.equals(other.getClassificazione()))) &&
            ((this.trasmissioniInterne==null && other.getTrasmissioniInterne()==null) || 
             (this.trasmissioniInterne!=null &&
              java.util.Arrays.equals(this.trasmissioniInterne, other.getTrasmissioniInterne()))) &&
            ((this.allegato==null && other.getAllegato()==null) || 
             (this.allegato!=null &&
              this.allegato.equals(other.getAllegato()))) &&
            ((this.allegatiPrecaricati==null && other.getAllegatiPrecaricati()==null) || 
             (this.allegatiPrecaricati!=null &&
              java.util.Arrays.equals(this.allegatiPrecaricati, other.getAllegatiPrecaricati())));
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
        if (getTipoProtocollo() != null) {
            _hashCode += getTipoProtocollo().hashCode();
        }
        if (getUfficioOperatore() != null) {
            _hashCode += getUfficioOperatore().hashCode();
        }
        if (getFirmatari() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getFirmatari());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getFirmatari(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getOggetto() != null) {
            _hashCode += getOggetto().hashCode();
        }
        if (getTipoDocumento() != null) {
            _hashCode += getTipoDocumento().hashCode();
        }
        if (getNumeroProtocolloAntecedente() != null) {
            _hashCode += getNumeroProtocolloAntecedente().hashCode();
        }
        if (getAnnoProtocolloAntecedente() != null) {
            _hashCode += getAnnoProtocolloAntecedente().hashCode();
        }
        if (getTipoProtocolloAntecedente() != null) {
            _hashCode += getTipoProtocolloAntecedente().hashCode();
        }
        if (getNumeroProtocolloMittente() != null) {
            _hashCode += getNumeroProtocolloMittente().hashCode();
        }
        if (getDataProtocolloMittente() != null) {
            _hashCode += getDataProtocolloMittente().hashCode();
        }
        if (getDataArrivo() != null) {
            _hashCode += getDataArrivo().hashCode();
        }
        if (getProtocolloEmergenza() != null) {
            _hashCode += getProtocolloEmergenza().hashCode();
        }
        if (getMittenti() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getMittenti());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getMittenti(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getDestinatari() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDestinatari());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getDestinatari(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getClassificazione() != null) {
            _hashCode += getClassificazione().hashCode();
        }
        if (getTrasmissioniInterne() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getTrasmissioniInterne());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getTrasmissioniInterne(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getAllegato() != null) {
            _hashCode += getAllegato().hashCode();
        }
        if (getAllegatiPrecaricati() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAllegatiPrecaricati());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAllegatiPrecaricati(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DatiProtocollo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:proWsProtocollo", "datiProtocollo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tipoProtocollo");
        elemField.setXmlName(new javax.xml.namespace.QName("", "tipoProtocollo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ufficioOperatore");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ufficioOperatore"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("firmatari");
        elemField.setXmlName(new javax.xml.namespace.QName("", "firmatari"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:proWsProtocollo", "firmatario"));
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("", "firmatario"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("oggetto");
        elemField.setXmlName(new javax.xml.namespace.QName("", "oggetto"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tipoDocumento");
        elemField.setXmlName(new javax.xml.namespace.QName("", "tipoDocumento"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numeroProtocolloAntecedente");
        elemField.setXmlName(new javax.xml.namespace.QName("", "numeroProtocolloAntecedente"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("annoProtocolloAntecedente");
        elemField.setXmlName(new javax.xml.namespace.QName("", "annoProtocolloAntecedente"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tipoProtocolloAntecedente");
        elemField.setXmlName(new javax.xml.namespace.QName("", "tipoProtocolloAntecedente"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numeroProtocolloMittente");
        elemField.setXmlName(new javax.xml.namespace.QName("", "numeroProtocolloMittente"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dataProtocolloMittente");
        elemField.setXmlName(new javax.xml.namespace.QName("", "dataProtocolloMittente"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dataArrivo");
        elemField.setXmlName(new javax.xml.namespace.QName("", "dataArrivo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("protocolloEmergenza");
        elemField.setXmlName(new javax.xml.namespace.QName("", "protocolloEmergenza"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mittenti");
        elemField.setXmlName(new javax.xml.namespace.QName("", "mittenti"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:proWsProtocollo", "mittenteDestinatario"));
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("", "mittenteDestinatario"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("destinatari");
        elemField.setXmlName(new javax.xml.namespace.QName("", "destinatari"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:proWsProtocollo", "mittenteDestinatario"));
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("", "mittenteDestinatario"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("classificazione");
        elemField.setXmlName(new javax.xml.namespace.QName("", "classificazione"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("trasmissioniInterne");
        elemField.setXmlName(new javax.xml.namespace.QName("", "trasmissioniInterne"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:proWsProtocollo", "trasmissione"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("", "trasmissione"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("allegato");
        elemField.setXmlName(new javax.xml.namespace.QName("", "allegato"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:proWsProtocollo", "allegato"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("allegatiPrecaricati");
        elemField.setXmlName(new javax.xml.namespace.QName("", "allegatiPrecaricati"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:proWsProtocollo", "allegatoPrecaricato"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("", "allegatoPrecaricato"));
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
