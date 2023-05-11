/**
 * DatiFascicolo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package it.italprot.prowsfascicolo;

public class DatiFascicolo  implements java.io.Serializable {
    private java.lang.String ufficioOperatore;

    private java.lang.String titolario;

    private java.lang.String descrizione;

    private java.lang.String natura;

    private java.lang.String responsabile;

    private java.lang.String ufficioResponsabile;

    private java.lang.String codiceSerie;

    private java.lang.String progressivoSerie;

    public DatiFascicolo() {
    }

    public DatiFascicolo(
           java.lang.String ufficioOperatore,
           java.lang.String titolario,
           java.lang.String descrizione,
           java.lang.String natura,
           java.lang.String responsabile,
           java.lang.String ufficioResponsabile,
           java.lang.String codiceSerie,
           java.lang.String progressivoSerie) {
           this.ufficioOperatore = ufficioOperatore;
           this.titolario = titolario;
           this.descrizione = descrizione;
           this.natura = natura;
           this.responsabile = responsabile;
           this.ufficioResponsabile = ufficioResponsabile;
           this.codiceSerie = codiceSerie;
           this.progressivoSerie = progressivoSerie;
    }


    /**
     * Gets the ufficioOperatore value for this DatiFascicolo.
     * 
     * @return ufficioOperatore
     */
    public java.lang.String getUfficioOperatore() {
        return ufficioOperatore;
    }


    /**
     * Sets the ufficioOperatore value for this DatiFascicolo.
     * 
     * @param ufficioOperatore
     */
    public void setUfficioOperatore(java.lang.String ufficioOperatore) {
        this.ufficioOperatore = ufficioOperatore;
    }


    /**
     * Gets the titolario value for this DatiFascicolo.
     * 
     * @return titolario
     */
    public java.lang.String getTitolario() {
        return titolario;
    }


    /**
     * Sets the titolario value for this DatiFascicolo.
     * 
     * @param titolario
     */
    public void setTitolario(java.lang.String titolario) {
        this.titolario = titolario;
    }


    /**
     * Gets the descrizione value for this DatiFascicolo.
     * 
     * @return descrizione
     */
    public java.lang.String getDescrizione() {
        return descrizione;
    }


    /**
     * Sets the descrizione value for this DatiFascicolo.
     * 
     * @param descrizione
     */
    public void setDescrizione(java.lang.String descrizione) {
        this.descrizione = descrizione;
    }


    /**
     * Gets the natura value for this DatiFascicolo.
     * 
     * @return natura
     */
    public java.lang.String getNatura() {
        return natura;
    }


    /**
     * Sets the natura value for this DatiFascicolo.
     * 
     * @param natura
     */
    public void setNatura(java.lang.String natura) {
        this.natura = natura;
    }


    /**
     * Gets the responsabile value for this DatiFascicolo.
     * 
     * @return responsabile
     */
    public java.lang.String getResponsabile() {
        return responsabile;
    }


    /**
     * Sets the responsabile value for this DatiFascicolo.
     * 
     * @param responsabile
     */
    public void setResponsabile(java.lang.String responsabile) {
        this.responsabile = responsabile;
    }


    /**
     * Gets the ufficioResponsabile value for this DatiFascicolo.
     * 
     * @return ufficioResponsabile
     */
    public java.lang.String getUfficioResponsabile() {
        return ufficioResponsabile;
    }


    /**
     * Sets the ufficioResponsabile value for this DatiFascicolo.
     * 
     * @param ufficioResponsabile
     */
    public void setUfficioResponsabile(java.lang.String ufficioResponsabile) {
        this.ufficioResponsabile = ufficioResponsabile;
    }


    /**
     * Gets the codiceSerie value for this DatiFascicolo.
     * 
     * @return codiceSerie
     */
    public java.lang.String getCodiceSerie() {
        return codiceSerie;
    }


    /**
     * Sets the codiceSerie value for this DatiFascicolo.
     * 
     * @param codiceSerie
     */
    public void setCodiceSerie(java.lang.String codiceSerie) {
        this.codiceSerie = codiceSerie;
    }


    /**
     * Gets the progressivoSerie value for this DatiFascicolo.
     * 
     * @return progressivoSerie
     */
    public java.lang.String getProgressivoSerie() {
        return progressivoSerie;
    }


    /**
     * Sets the progressivoSerie value for this DatiFascicolo.
     * 
     * @param progressivoSerie
     */
    public void setProgressivoSerie(java.lang.String progressivoSerie) {
        this.progressivoSerie = progressivoSerie;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DatiFascicolo)) return false;
        DatiFascicolo other = (DatiFascicolo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.ufficioOperatore==null && other.getUfficioOperatore()==null) || 
             (this.ufficioOperatore!=null &&
              this.ufficioOperatore.equals(other.getUfficioOperatore()))) &&
            ((this.titolario==null && other.getTitolario()==null) || 
             (this.titolario!=null &&
              this.titolario.equals(other.getTitolario()))) &&
            ((this.descrizione==null && other.getDescrizione()==null) || 
             (this.descrizione!=null &&
              this.descrizione.equals(other.getDescrizione()))) &&
            ((this.natura==null && other.getNatura()==null) || 
             (this.natura!=null &&
              this.natura.equals(other.getNatura()))) &&
            ((this.responsabile==null && other.getResponsabile()==null) || 
             (this.responsabile!=null &&
              this.responsabile.equals(other.getResponsabile()))) &&
            ((this.ufficioResponsabile==null && other.getUfficioResponsabile()==null) || 
             (this.ufficioResponsabile!=null &&
              this.ufficioResponsabile.equals(other.getUfficioResponsabile()))) &&
            ((this.codiceSerie==null && other.getCodiceSerie()==null) || 
             (this.codiceSerie!=null &&
              this.codiceSerie.equals(other.getCodiceSerie()))) &&
            ((this.progressivoSerie==null && other.getProgressivoSerie()==null) || 
             (this.progressivoSerie!=null &&
              this.progressivoSerie.equals(other.getProgressivoSerie())));
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
        if (getUfficioOperatore() != null) {
            _hashCode += getUfficioOperatore().hashCode();
        }
        if (getTitolario() != null) {
            _hashCode += getTitolario().hashCode();
        }
        if (getDescrizione() != null) {
            _hashCode += getDescrizione().hashCode();
        }
        if (getNatura() != null) {
            _hashCode += getNatura().hashCode();
        }
        if (getResponsabile() != null) {
            _hashCode += getResponsabile().hashCode();
        }
        if (getUfficioResponsabile() != null) {
            _hashCode += getUfficioResponsabile().hashCode();
        }
        if (getCodiceSerie() != null) {
            _hashCode += getCodiceSerie().hashCode();
        }
        if (getProgressivoSerie() != null) {
            _hashCode += getProgressivoSerie().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DatiFascicolo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:proWsFascicolo", "datiFascicolo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ufficioOperatore");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ufficioOperatore"));
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
        elemField.setFieldName("descrizione");
        elemField.setXmlName(new javax.xml.namespace.QName("", "descrizione"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("natura");
        elemField.setXmlName(new javax.xml.namespace.QName("", "natura"));
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
        elemField.setFieldName("ufficioResponsabile");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ufficioResponsabile"));
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
