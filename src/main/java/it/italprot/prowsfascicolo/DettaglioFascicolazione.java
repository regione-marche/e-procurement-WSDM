/**
 * DettaglioFascicolazione.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package it.italprot.prowsfascicolo;

public class DettaglioFascicolazione  implements java.io.Serializable {
    private java.lang.String codiceFascicolo;

    private java.lang.String descrizioneFascicolo;

    private java.lang.String titolario;

    private java.lang.String codiceSottofascicolo;

    private java.lang.String descrizioneSottofascicolo;

    private java.lang.String principale;

    public DettaglioFascicolazione() {
    }

    public DettaglioFascicolazione(
           java.lang.String codiceFascicolo,
           java.lang.String descrizioneFascicolo,
           java.lang.String titolario,
           java.lang.String codiceSottofascicolo,
           java.lang.String descrizioneSottofascicolo,
           java.lang.String principale) {
           this.codiceFascicolo = codiceFascicolo;
           this.descrizioneFascicolo = descrizioneFascicolo;
           this.titolario = titolario;
           this.codiceSottofascicolo = codiceSottofascicolo;
           this.descrizioneSottofascicolo = descrizioneSottofascicolo;
           this.principale = principale;
    }


    /**
     * Gets the codiceFascicolo value for this DettaglioFascicolazione.
     * 
     * @return codiceFascicolo
     */
    public java.lang.String getCodiceFascicolo() {
        return codiceFascicolo;
    }


    /**
     * Sets the codiceFascicolo value for this DettaglioFascicolazione.
     * 
     * @param codiceFascicolo
     */
    public void setCodiceFascicolo(java.lang.String codiceFascicolo) {
        this.codiceFascicolo = codiceFascicolo;
    }


    /**
     * Gets the descrizioneFascicolo value for this DettaglioFascicolazione.
     * 
     * @return descrizioneFascicolo
     */
    public java.lang.String getDescrizioneFascicolo() {
        return descrizioneFascicolo;
    }


    /**
     * Sets the descrizioneFascicolo value for this DettaglioFascicolazione.
     * 
     * @param descrizioneFascicolo
     */
    public void setDescrizioneFascicolo(java.lang.String descrizioneFascicolo) {
        this.descrizioneFascicolo = descrizioneFascicolo;
    }


    /**
     * Gets the titolario value for this DettaglioFascicolazione.
     * 
     * @return titolario
     */
    public java.lang.String getTitolario() {
        return titolario;
    }


    /**
     * Sets the titolario value for this DettaglioFascicolazione.
     * 
     * @param titolario
     */
    public void setTitolario(java.lang.String titolario) {
        this.titolario = titolario;
    }


    /**
     * Gets the codiceSottofascicolo value for this DettaglioFascicolazione.
     * 
     * @return codiceSottofascicolo
     */
    public java.lang.String getCodiceSottofascicolo() {
        return codiceSottofascicolo;
    }


    /**
     * Sets the codiceSottofascicolo value for this DettaglioFascicolazione.
     * 
     * @param codiceSottofascicolo
     */
    public void setCodiceSottofascicolo(java.lang.String codiceSottofascicolo) {
        this.codiceSottofascicolo = codiceSottofascicolo;
    }


    /**
     * Gets the descrizioneSottofascicolo value for this DettaglioFascicolazione.
     * 
     * @return descrizioneSottofascicolo
     */
    public java.lang.String getDescrizioneSottofascicolo() {
        return descrizioneSottofascicolo;
    }


    /**
     * Sets the descrizioneSottofascicolo value for this DettaglioFascicolazione.
     * 
     * @param descrizioneSottofascicolo
     */
    public void setDescrizioneSottofascicolo(java.lang.String descrizioneSottofascicolo) {
        this.descrizioneSottofascicolo = descrizioneSottofascicolo;
    }


    /**
     * Gets the principale value for this DettaglioFascicolazione.
     * 
     * @return principale
     */
    public java.lang.String getPrincipale() {
        return principale;
    }


    /**
     * Sets the principale value for this DettaglioFascicolazione.
     * 
     * @param principale
     */
    public void setPrincipale(java.lang.String principale) {
        this.principale = principale;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DettaglioFascicolazione)) return false;
        DettaglioFascicolazione other = (DettaglioFascicolazione) obj;
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
            ((this.codiceSottofascicolo==null && other.getCodiceSottofascicolo()==null) || 
             (this.codiceSottofascicolo!=null &&
              this.codiceSottofascicolo.equals(other.getCodiceSottofascicolo()))) &&
            ((this.descrizioneSottofascicolo==null && other.getDescrizioneSottofascicolo()==null) || 
             (this.descrizioneSottofascicolo!=null &&
              this.descrizioneSottofascicolo.equals(other.getDescrizioneSottofascicolo()))) &&
            ((this.principale==null && other.getPrincipale()==null) || 
             (this.principale!=null &&
              this.principale.equals(other.getPrincipale())));
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
        if (getCodiceSottofascicolo() != null) {
            _hashCode += getCodiceSottofascicolo().hashCode();
        }
        if (getDescrizioneSottofascicolo() != null) {
            _hashCode += getDescrizioneSottofascicolo().hashCode();
        }
        if (getPrincipale() != null) {
            _hashCode += getPrincipale().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DettaglioFascicolazione.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:proWsFascicolo", "dettaglioFascicolazione"));
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
        elemField.setFieldName("codiceSottofascicolo");
        elemField.setXmlName(new javax.xml.namespace.QName("", "codiceSottofascicolo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("descrizioneSottofascicolo");
        elemField.setXmlName(new javax.xml.namespace.QName("", "descrizioneSottofascicolo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("principale");
        elemField.setXmlName(new javax.xml.namespace.QName("", "principale"));
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
