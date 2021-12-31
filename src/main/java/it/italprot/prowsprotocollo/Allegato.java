/**
 * Allegato.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package it.italprot.prowsprotocollo;

public class Allegato  implements java.io.Serializable {
    private java.lang.String id;

    private java.lang.String tipoFile;

    private java.lang.String nomeFile;

    private java.lang.String estensione;

    private java.lang.String stream;

    private java.lang.String note;

    private java.lang.String marcaDocumento;

    private java.lang.String mettiAllaFirma;

    public Allegato() {
    }

    public Allegato(
           java.lang.String id,
           java.lang.String tipoFile,
           java.lang.String nomeFile,
           java.lang.String estensione,
           java.lang.String stream,
           java.lang.String note,
           java.lang.String marcaDocumento,
           java.lang.String mettiAllaFirma) {
           this.id = id;
           this.tipoFile = tipoFile;
           this.nomeFile = nomeFile;
           this.estensione = estensione;
           this.stream = stream;
           this.note = note;
           this.marcaDocumento = marcaDocumento;
           this.mettiAllaFirma = mettiAllaFirma;
    }


    /**
     * Gets the id value for this Allegato.
     * 
     * @return id
     */
    public java.lang.String getId() {
        return id;
    }


    /**
     * Sets the id value for this Allegato.
     * 
     * @param id
     */
    public void setId(java.lang.String id) {
        this.id = id;
    }


    /**
     * Gets the tipoFile value for this Allegato.
     * 
     * @return tipoFile
     */
    public java.lang.String getTipoFile() {
        return tipoFile;
    }


    /**
     * Sets the tipoFile value for this Allegato.
     * 
     * @param tipoFile
     */
    public void setTipoFile(java.lang.String tipoFile) {
        this.tipoFile = tipoFile;
    }


    /**
     * Gets the nomeFile value for this Allegato.
     * 
     * @return nomeFile
     */
    public java.lang.String getNomeFile() {
        return nomeFile;
    }


    /**
     * Sets the nomeFile value for this Allegato.
     * 
     * @param nomeFile
     */
    public void setNomeFile(java.lang.String nomeFile) {
        this.nomeFile = nomeFile;
    }


    /**
     * Gets the estensione value for this Allegato.
     * 
     * @return estensione
     */
    public java.lang.String getEstensione() {
        return estensione;
    }


    /**
     * Sets the estensione value for this Allegato.
     * 
     * @param estensione
     */
    public void setEstensione(java.lang.String estensione) {
        this.estensione = estensione;
    }


    /**
     * Gets the stream value for this Allegato.
     * 
     * @return stream
     */
    public java.lang.String getStream() {
        return stream;
    }


    /**
     * Sets the stream value for this Allegato.
     * 
     * @param stream
     */
    public void setStream(java.lang.String stream) {
        this.stream = stream;
    }


    /**
     * Gets the note value for this Allegato.
     * 
     * @return note
     */
    public java.lang.String getNote() {
        return note;
    }


    /**
     * Sets the note value for this Allegato.
     * 
     * @param note
     */
    public void setNote(java.lang.String note) {
        this.note = note;
    }


    /**
     * Gets the marcaDocumento value for this Allegato.
     * 
     * @return marcaDocumento
     */
    public java.lang.String getMarcaDocumento() {
        return marcaDocumento;
    }


    /**
     * Sets the marcaDocumento value for this Allegato.
     * 
     * @param marcaDocumento
     */
    public void setMarcaDocumento(java.lang.String marcaDocumento) {
        this.marcaDocumento = marcaDocumento;
    }


    /**
     * Gets the mettiAllaFirma value for this Allegato.
     * 
     * @return mettiAllaFirma
     */
    public java.lang.String getMettiAllaFirma() {
        return mettiAllaFirma;
    }


    /**
     * Sets the mettiAllaFirma value for this Allegato.
     * 
     * @param mettiAllaFirma
     */
    public void setMettiAllaFirma(java.lang.String mettiAllaFirma) {
        this.mettiAllaFirma = mettiAllaFirma;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Allegato)) return false;
        Allegato other = (Allegato) obj;
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
            ((this.tipoFile==null && other.getTipoFile()==null) || 
             (this.tipoFile!=null &&
              this.tipoFile.equals(other.getTipoFile()))) &&
            ((this.nomeFile==null && other.getNomeFile()==null) || 
             (this.nomeFile!=null &&
              this.nomeFile.equals(other.getNomeFile()))) &&
            ((this.estensione==null && other.getEstensione()==null) || 
             (this.estensione!=null &&
              this.estensione.equals(other.getEstensione()))) &&
            ((this.stream==null && other.getStream()==null) || 
             (this.stream!=null &&
              this.stream.equals(other.getStream()))) &&
            ((this.note==null && other.getNote()==null) || 
             (this.note!=null &&
              this.note.equals(other.getNote()))) &&
            ((this.marcaDocumento==null && other.getMarcaDocumento()==null) || 
             (this.marcaDocumento!=null &&
              this.marcaDocumento.equals(other.getMarcaDocumento()))) &&
            ((this.mettiAllaFirma==null && other.getMettiAllaFirma()==null) || 
             (this.mettiAllaFirma!=null &&
              this.mettiAllaFirma.equals(other.getMettiAllaFirma())));
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
        if (getTipoFile() != null) {
            _hashCode += getTipoFile().hashCode();
        }
        if (getNomeFile() != null) {
            _hashCode += getNomeFile().hashCode();
        }
        if (getEstensione() != null) {
            _hashCode += getEstensione().hashCode();
        }
        if (getStream() != null) {
            _hashCode += getStream().hashCode();
        }
        if (getNote() != null) {
            _hashCode += getNote().hashCode();
        }
        if (getMarcaDocumento() != null) {
            _hashCode += getMarcaDocumento().hashCode();
        }
        if (getMettiAllaFirma() != null) {
            _hashCode += getMettiAllaFirma().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Allegato.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:proWsProtocollo", "allegato"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("id");
        elemField.setXmlName(new javax.xml.namespace.QName("", "id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tipoFile");
        elemField.setXmlName(new javax.xml.namespace.QName("", "tipoFile"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nomeFile");
        elemField.setXmlName(new javax.xml.namespace.QName("", "nomeFile"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("estensione");
        elemField.setXmlName(new javax.xml.namespace.QName("", "estensione"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("stream");
        elemField.setXmlName(new javax.xml.namespace.QName("", "stream"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("note");
        elemField.setXmlName(new javax.xml.namespace.QName("", "note"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("marcaDocumento");
        elemField.setXmlName(new javax.xml.namespace.QName("", "marcaDocumento"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mettiAllaFirma");
        elemField.setXmlName(new javax.xml.namespace.QName("", "mettiAllaFirma"));
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
