/**
 * DettaglioFascicolo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package it.italprot.prowsfascicolo;

public class DettaglioFascicolo  implements java.io.Serializable {
    private java.lang.String codiceFascicolo;

    private java.lang.String descrizioneFascicolo;

    private java.lang.String titolario;

    private java.lang.String titolarioDescrizione;

    private java.lang.String dataFascicolo;

    private java.lang.String dataChiusuraFascicolo;

    private java.lang.String responsabile;

    private java.lang.String nomeResponsabile;

    private java.lang.String ufficioResopnsabile;

    private java.lang.String descUfficioResponsabile;

    private java.lang.String naturaFascicolo;

    private java.lang.String codiceSerie;

    private java.lang.String progressivoSerie;

    private java.lang.String segnatura;

    private it.italprot.prowsfascicolo.SottoFascicolo[] sottoFascicoli;

    public DettaglioFascicolo() {
    }

    public DettaglioFascicolo(
           java.lang.String codiceFascicolo,
           java.lang.String descrizioneFascicolo,
           java.lang.String titolario,
           java.lang.String titolarioDescrizione,
           java.lang.String dataFascicolo,
           java.lang.String dataChiusuraFascicolo,
           java.lang.String responsabile,
           java.lang.String nomeResponsabile,
           java.lang.String ufficioResopnsabile,
           java.lang.String descUfficioResponsabile,
           java.lang.String naturaFascicolo,
           java.lang.String codiceSerie,
           java.lang.String progressivoSerie,
           java.lang.String segnatura,
           it.italprot.prowsfascicolo.SottoFascicolo[] sottoFascicoli) {
           this.codiceFascicolo = codiceFascicolo;
           this.descrizioneFascicolo = descrizioneFascicolo;
           this.titolario = titolario;
           this.titolarioDescrizione = titolarioDescrizione;
           this.dataFascicolo = dataFascicolo;
           this.dataChiusuraFascicolo = dataChiusuraFascicolo;
           this.responsabile = responsabile;
           this.nomeResponsabile = nomeResponsabile;
           this.ufficioResopnsabile = ufficioResopnsabile;
           this.descUfficioResponsabile = descUfficioResponsabile;
           this.naturaFascicolo = naturaFascicolo;
           this.codiceSerie = codiceSerie;
           this.progressivoSerie = progressivoSerie;
           this.segnatura = segnatura;
           this.sottoFascicoli = sottoFascicoli;
    }


    /**
     * Gets the codiceFascicolo value for this DettaglioFascicolo.
     * 
     * @return codiceFascicolo
     */
    public java.lang.String getCodiceFascicolo() {
        return codiceFascicolo;
    }


    /**
     * Sets the codiceFascicolo value for this DettaglioFascicolo.
     * 
     * @param codiceFascicolo
     */
    public void setCodiceFascicolo(java.lang.String codiceFascicolo) {
        this.codiceFascicolo = codiceFascicolo;
    }


    /**
     * Gets the descrizioneFascicolo value for this DettaglioFascicolo.
     * 
     * @return descrizioneFascicolo
     */
    public java.lang.String getDescrizioneFascicolo() {
        return descrizioneFascicolo;
    }


    /**
     * Sets the descrizioneFascicolo value for this DettaglioFascicolo.
     * 
     * @param descrizioneFascicolo
     */
    public void setDescrizioneFascicolo(java.lang.String descrizioneFascicolo) {
        this.descrizioneFascicolo = descrizioneFascicolo;
    }


    /**
     * Gets the titolario value for this DettaglioFascicolo.
     * 
     * @return titolario
     */
    public java.lang.String getTitolario() {
        return titolario;
    }


    /**
     * Sets the titolario value for this DettaglioFascicolo.
     * 
     * @param titolario
     */
    public void setTitolario(java.lang.String titolario) {
        this.titolario = titolario;
    }


    /**
     * Gets the titolarioDescrizione value for this DettaglioFascicolo.
     * 
     * @return titolarioDescrizione
     */
    public java.lang.String getTitolarioDescrizione() {
        return titolarioDescrizione;
    }


    /**
     * Sets the titolarioDescrizione value for this DettaglioFascicolo.
     * 
     * @param titolarioDescrizione
     */
    public void setTitolarioDescrizione(java.lang.String titolarioDescrizione) {
        this.titolarioDescrizione = titolarioDescrizione;
    }


    /**
     * Gets the dataFascicolo value for this DettaglioFascicolo.
     * 
     * @return dataFascicolo
     */
    public java.lang.String getDataFascicolo() {
        return dataFascicolo;
    }


    /**
     * Sets the dataFascicolo value for this DettaglioFascicolo.
     * 
     * @param dataFascicolo
     */
    public void setDataFascicolo(java.lang.String dataFascicolo) {
        this.dataFascicolo = dataFascicolo;
    }


    /**
     * Gets the dataChiusuraFascicolo value for this DettaglioFascicolo.
     * 
     * @return dataChiusuraFascicolo
     */
    public java.lang.String getDataChiusuraFascicolo() {
        return dataChiusuraFascicolo;
    }


    /**
     * Sets the dataChiusuraFascicolo value for this DettaglioFascicolo.
     * 
     * @param dataChiusuraFascicolo
     */
    public void setDataChiusuraFascicolo(java.lang.String dataChiusuraFascicolo) {
        this.dataChiusuraFascicolo = dataChiusuraFascicolo;
    }


    /**
     * Gets the responsabile value for this DettaglioFascicolo.
     * 
     * @return responsabile
     */
    public java.lang.String getResponsabile() {
        return responsabile;
    }


    /**
     * Sets the responsabile value for this DettaglioFascicolo.
     * 
     * @param responsabile
     */
    public void setResponsabile(java.lang.String responsabile) {
        this.responsabile = responsabile;
    }


    /**
     * Gets the nomeResponsabile value for this DettaglioFascicolo.
     * 
     * @return nomeResponsabile
     */
    public java.lang.String getNomeResponsabile() {
        return nomeResponsabile;
    }


    /**
     * Sets the nomeResponsabile value for this DettaglioFascicolo.
     * 
     * @param nomeResponsabile
     */
    public void setNomeResponsabile(java.lang.String nomeResponsabile) {
        this.nomeResponsabile = nomeResponsabile;
    }


    /**
     * Gets the ufficioResopnsabile value for this DettaglioFascicolo.
     * 
     * @return ufficioResopnsabile
     */
    public java.lang.String getUfficioResopnsabile() {
        return ufficioResopnsabile;
    }


    /**
     * Sets the ufficioResopnsabile value for this DettaglioFascicolo.
     * 
     * @param ufficioResopnsabile
     */
    public void setUfficioResopnsabile(java.lang.String ufficioResopnsabile) {
        this.ufficioResopnsabile = ufficioResopnsabile;
    }


    /**
     * Gets the descUfficioResponsabile value for this DettaglioFascicolo.
     * 
     * @return descUfficioResponsabile
     */
    public java.lang.String getDescUfficioResponsabile() {
        return descUfficioResponsabile;
    }


    /**
     * Sets the descUfficioResponsabile value for this DettaglioFascicolo.
     * 
     * @param descUfficioResponsabile
     */
    public void setDescUfficioResponsabile(java.lang.String descUfficioResponsabile) {
        this.descUfficioResponsabile = descUfficioResponsabile;
    }


    /**
     * Gets the naturaFascicolo value for this DettaglioFascicolo.
     * 
     * @return naturaFascicolo
     */
    public java.lang.String getNaturaFascicolo() {
        return naturaFascicolo;
    }


    /**
     * Sets the naturaFascicolo value for this DettaglioFascicolo.
     * 
     * @param naturaFascicolo
     */
    public void setNaturaFascicolo(java.lang.String naturaFascicolo) {
        this.naturaFascicolo = naturaFascicolo;
    }


    /**
     * Gets the codiceSerie value for this DettaglioFascicolo.
     * 
     * @return codiceSerie
     */
    public java.lang.String getCodiceSerie() {
        return codiceSerie;
    }


    /**
     * Sets the codiceSerie value for this DettaglioFascicolo.
     * 
     * @param codiceSerie
     */
    public void setCodiceSerie(java.lang.String codiceSerie) {
        this.codiceSerie = codiceSerie;
    }


    /**
     * Gets the progressivoSerie value for this DettaglioFascicolo.
     * 
     * @return progressivoSerie
     */
    public java.lang.String getProgressivoSerie() {
        return progressivoSerie;
    }


    /**
     * Sets the progressivoSerie value for this DettaglioFascicolo.
     * 
     * @param progressivoSerie
     */
    public void setProgressivoSerie(java.lang.String progressivoSerie) {
        this.progressivoSerie = progressivoSerie;
    }


    /**
     * Gets the segnatura value for this DettaglioFascicolo.
     * 
     * @return segnatura
     */
    public java.lang.String getSegnatura() {
        return segnatura;
    }


    /**
     * Sets the segnatura value for this DettaglioFascicolo.
     * 
     * @param segnatura
     */
    public void setSegnatura(java.lang.String segnatura) {
        this.segnatura = segnatura;
    }


    /**
     * Gets the sottoFascicoli value for this DettaglioFascicolo.
     * 
     * @return sottoFascicoli
     */
    public it.italprot.prowsfascicolo.SottoFascicolo[] getSottoFascicoli() {
        return sottoFascicoli;
    }


    /**
     * Sets the sottoFascicoli value for this DettaglioFascicolo.
     * 
     * @param sottoFascicoli
     */
    public void setSottoFascicoli(it.italprot.prowsfascicolo.SottoFascicolo[] sottoFascicoli) {
        this.sottoFascicoli = sottoFascicoli;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DettaglioFascicolo)) return false;
        DettaglioFascicolo other = (DettaglioFascicolo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.codiceFascicolo==null && other.getCodiceFascicolo()==null) || 
             (this.codiceFascicolo!=null &&
              this.codiceFascicolo.equals(other.getCodiceFascicolo()))) &&
            ((this.descrizioneFascicolo==null && other.getDescrizioneFascicolo()==null) || 
             (this.descrizioneFascicolo!=null &&
              this.descrizioneFascicolo.equals(other.getDescrizioneFascicolo()))) &&
            ((this.titolario==null && other.getTitolario()==null) || 
             (this.titolario!=null &&
              this.titolario.equals(other.getTitolario()))) &&
            ((this.titolarioDescrizione==null && other.getTitolarioDescrizione()==null) || 
             (this.titolarioDescrizione!=null &&
              this.titolarioDescrizione.equals(other.getTitolarioDescrizione()))) &&
            ((this.dataFascicolo==null && other.getDataFascicolo()==null) || 
             (this.dataFascicolo!=null &&
              this.dataFascicolo.equals(other.getDataFascicolo()))) &&
            ((this.dataChiusuraFascicolo==null && other.getDataChiusuraFascicolo()==null) || 
             (this.dataChiusuraFascicolo!=null &&
              this.dataChiusuraFascicolo.equals(other.getDataChiusuraFascicolo()))) &&
            ((this.responsabile==null && other.getResponsabile()==null) || 
             (this.responsabile!=null &&
              this.responsabile.equals(other.getResponsabile()))) &&
            ((this.nomeResponsabile==null && other.getNomeResponsabile()==null) || 
             (this.nomeResponsabile!=null &&
              this.nomeResponsabile.equals(other.getNomeResponsabile()))) &&
            ((this.ufficioResopnsabile==null && other.getUfficioResopnsabile()==null) || 
             (this.ufficioResopnsabile!=null &&
              this.ufficioResopnsabile.equals(other.getUfficioResopnsabile()))) &&
            ((this.descUfficioResponsabile==null && other.getDescUfficioResponsabile()==null) || 
             (this.descUfficioResponsabile!=null &&
              this.descUfficioResponsabile.equals(other.getDescUfficioResponsabile()))) &&
            ((this.naturaFascicolo==null && other.getNaturaFascicolo()==null) || 
             (this.naturaFascicolo!=null &&
              this.naturaFascicolo.equals(other.getNaturaFascicolo()))) &&
            ((this.codiceSerie==null && other.getCodiceSerie()==null) || 
             (this.codiceSerie!=null &&
              this.codiceSerie.equals(other.getCodiceSerie()))) &&
            ((this.progressivoSerie==null && other.getProgressivoSerie()==null) || 
             (this.progressivoSerie!=null &&
              this.progressivoSerie.equals(other.getProgressivoSerie()))) &&
            ((this.segnatura==null && other.getSegnatura()==null) || 
             (this.segnatura!=null &&
              this.segnatura.equals(other.getSegnatura()))) &&
            ((this.sottoFascicoli==null && other.getSottoFascicoli()==null) || 
             (this.sottoFascicoli!=null &&
              java.util.Arrays.equals(this.sottoFascicoli, other.getSottoFascicoli())));
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
        if (getCodiceFascicolo() != null) {
            _hashCode += getCodiceFascicolo().hashCode();
        }
        if (getDescrizioneFascicolo() != null) {
            _hashCode += getDescrizioneFascicolo().hashCode();
        }
        if (getTitolario() != null) {
            _hashCode += getTitolario().hashCode();
        }
        if (getTitolarioDescrizione() != null) {
            _hashCode += getTitolarioDescrizione().hashCode();
        }
        if (getDataFascicolo() != null) {
            _hashCode += getDataFascicolo().hashCode();
        }
        if (getDataChiusuraFascicolo() != null) {
            _hashCode += getDataChiusuraFascicolo().hashCode();
        }
        if (getResponsabile() != null) {
            _hashCode += getResponsabile().hashCode();
        }
        if (getNomeResponsabile() != null) {
            _hashCode += getNomeResponsabile().hashCode();
        }
        if (getUfficioResopnsabile() != null) {
            _hashCode += getUfficioResopnsabile().hashCode();
        }
        if (getDescUfficioResponsabile() != null) {
            _hashCode += getDescUfficioResponsabile().hashCode();
        }
        if (getNaturaFascicolo() != null) {
            _hashCode += getNaturaFascicolo().hashCode();
        }
        if (getCodiceSerie() != null) {
            _hashCode += getCodiceSerie().hashCode();
        }
        if (getProgressivoSerie() != null) {
            _hashCode += getProgressivoSerie().hashCode();
        }
        if (getSegnatura() != null) {
            _hashCode += getSegnatura().hashCode();
        }
        if (getSottoFascicoli() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSottoFascicoli());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSottoFascicoli(), i);
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
        new org.apache.axis.description.TypeDesc(DettaglioFascicolo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:proWsFascicolo", "dettaglioFascicolo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codiceFascicolo");
        elemField.setXmlName(new javax.xml.namespace.QName("", "codiceFascicolo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("descrizioneFascicolo");
        elemField.setXmlName(new javax.xml.namespace.QName("", "descrizioneFascicolo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("titolario");
        elemField.setXmlName(new javax.xml.namespace.QName("", "titolario"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("titolarioDescrizione");
        elemField.setXmlName(new javax.xml.namespace.QName("", "titolarioDescrizione"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dataFascicolo");
        elemField.setXmlName(new javax.xml.namespace.QName("", "dataFascicolo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dataChiusuraFascicolo");
        elemField.setXmlName(new javax.xml.namespace.QName("", "dataChiusuraFascicolo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("responsabile");
        elemField.setXmlName(new javax.xml.namespace.QName("", "responsabile"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nomeResponsabile");
        elemField.setXmlName(new javax.xml.namespace.QName("", "nomeResponsabile"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ufficioResopnsabile");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ufficioResopnsabile"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("descUfficioResponsabile");
        elemField.setXmlName(new javax.xml.namespace.QName("", "descUfficioResponsabile"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("naturaFascicolo");
        elemField.setXmlName(new javax.xml.namespace.QName("", "naturaFascicolo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codiceSerie");
        elemField.setXmlName(new javax.xml.namespace.QName("", "codiceSerie"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("progressivoSerie");
        elemField.setXmlName(new javax.xml.namespace.QName("", "progressivoSerie"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("segnatura");
        elemField.setXmlName(new javax.xml.namespace.QName("", "segnatura"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sottoFascicoli");
        elemField.setXmlName(new javax.xml.namespace.QName("", "sottoFascicoli"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:proWsFascicolo", "sottoFascicolo"));
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
