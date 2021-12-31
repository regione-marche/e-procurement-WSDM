/**
 * AllegatoPrecaricato.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package it.italprot.prowsprotocollo;

public class AllegatoPrecaricato  implements java.io.Serializable {
    private java.lang.String idunivoco;

    private java.lang.String hashfile;

    private java.lang.String nomeFile;

    private java.lang.String tipoFile;

    private java.lang.String estensione;

    private java.lang.String note;

    private java.lang.String marcaDocumento;

    private java.lang.String mettiAllaFirma;

    public AllegatoPrecaricato() {
    }

    public AllegatoPrecaricato(
           java.lang.String idunivoco,
           java.lang.String hashfile,
           java.lang.String nomeFile,
           java.lang.String tipoFile,
           java.lang.String estensione,
           java.lang.String note,
           java.lang.String marcaDocumento,
           java.lang.String mettiAllaFirma) {
           this.idunivoco = idunivoco;
           this.hashfile = hashfile;
           this.nomeFile = nomeFile;
           this.tipoFile = tipoFile;
           this.estensione = estensione;
           this.note = note;
           this.marcaDocumento = marcaDocumento;
           this.mettiAllaFirma = mettiAllaFirma;
    }


    /**
     * Gets the idunivoco value for this AllegatoPrecaricato.
     * 
     * @return idunivoco
     */
    public java.lang.String getIdunivoco() {
        return idunivoco;
    }


    /**
     * Sets the idunivoco value for this AllegatoPrecaricato.
     * 
     * @param idunivoco
     */
    public void setIdunivoco(java.lang.String idunivoco) {
        this.idunivoco = idunivoco;
    }


    /**
     * Gets the hashfile value for this AllegatoPrecaricato.
     * 
     * @return hashfile
     */
    public java.lang.String getHashfile() {
        return hashfile;
    }


    /**
     * Sets the hashfile value for this AllegatoPrecaricato.
     * 
     * @param hashfile
     */
    public void setHashfile(java.lang.String hashfile) {
        this.hashfile = hashfile;
    }


    /**
     * Gets the nomeFile value for this AllegatoPrecaricato.
     * 
     * @return nomeFile
     */
    public java.lang.String getNomeFile() {
        return nomeFile;
    }


    /**
     * Sets the nomeFile value for this AllegatoPrecaricato.
     * 
     * @param nomeFile
     */
    public void setNomeFile(java.lang.String nomeFile) {
        this.nomeFile = nomeFile;
    }


    /**
     * Gets the tipoFile value for this AllegatoPrecaricato.
     * 
     * @return tipoFile
     */
    public java.lang.String getTipoFile() {
        return tipoFile;
    }


    /**
     * Sets the tipoFile value for this AllegatoPrecaricato.
     * 
     * @param tipoFile
     */
    public void setTipoFile(java.lang.String tipoFile) {
        this.tipoFile = tipoFile;
    }


    /**
     * Gets the estensione value for this AllegatoPrecaricato.
     * 
     * @return estensione
     */
    public java.lang.String getEstensione() {
        return estensione;
    }


    /**
     * Sets the estensione value for this AllegatoPrecaricato.
     * 
     * @param estensione
     */
    public void setEstensione(java.lang.String estensione) {
        this.estensione = estensione;
    }


    /**
     * Gets the note value for this AllegatoPrecaricato.
     * 
     * @return note
     */
    public java.lang.String getNote() {
        return note;
    }


    /**
     * Sets the note value for this AllegatoPrecaricato.
     * 
     * @param note
     */
    public void setNote(java.lang.String note) {
        this.note = note;
    }


    /**
     * Gets the marcaDocumento value for this AllegatoPrecaricato.
     * 
     * @return marcaDocumento
     */
    public java.lang.String getMarcaDocumento() {
        return marcaDocumento;
    }


    /**
     * Sets the marcaDocumento value for this AllegatoPrecaricato.
     * 
     * @param marcaDocumento
     */
    public void setMarcaDocumento(java.lang.String marcaDocumento) {
        this.marcaDocumento = marcaDocumento;
    }


    /**
     * Gets the mettiAllaFirma value for this AllegatoPrecaricato.
     * 
     * @return mettiAllaFirma
     */
    public java.lang.String getMettiAllaFirma() {
        return mettiAllaFirma;
    }


    /**
     * Sets the mettiAllaFirma value for this AllegatoPrecaricato.
     * 
     * @param mettiAllaFirma
     */
    public void setMettiAllaFirma(java.lang.String mettiAllaFirma) {
        this.mettiAllaFirma = mettiAllaFirma;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AllegatoPrecaricato)) return false;
        AllegatoPrecaricato other = (AllegatoPrecaricato) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.idunivoco==null && other.getIdunivoco()==null) || 
             (this.idunivoco!=null &&
              this.idunivoco.equals(other.getIdunivoco()))) &&
            ((this.hashfile==null && other.getHashfile()==null) || 
             (this.hashfile!=null &&
              this.hashfile.equals(other.getHashfile()))) &&
            ((this.nomeFile==null && other.getNomeFile()==null) || 
             (this.nomeFile!=null &&
              this.nomeFile.equals(other.getNomeFile()))) &&
            ((this.tipoFile==null && other.getTipoFile()==null) || 
             (this.tipoFile!=null &&
              this.tipoFile.equals(other.getTipoFile()))) &&
            ((this.estensione==null && other.getEstensione()==null) || 
             (this.estensione!=null &&
              this.estensione.equals(other.getEstensione()))) &&
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
        if (getIdunivoco() != null) {
            _hashCode += getIdunivoco().hashCode();
        }
        if (getHashfile() != null) {
            _hashCode += getHashfile().hashCode();
        }
        if (getNomeFile() != null) {
            _hashCode += getNomeFile().hashCode();
        }
        if (getTipoFile() != null) {
            _hashCode += getTipoFile().hashCode();
        }
        if (getEstensione() != null) {
            _hashCode += getEstensione().hashCode();
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
        new org.apache.axis.description.TypeDesc(AllegatoPrecaricato.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:proWsProtocollo", "allegatoPrecaricato"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("idunivoco");
        elemField.setXmlName(new javax.xml.namespace.QName("", "idunivoco"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("hashfile");
        elemField.setXmlName(new javax.xml.namespace.QName("", "hashfile"));
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
        elemField.setFieldName("tipoFile");
        elemField.setXmlName(new javax.xml.namespace.QName("", "tipoFile"));
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
