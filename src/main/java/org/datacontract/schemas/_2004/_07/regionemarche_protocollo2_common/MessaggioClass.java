
package org.datacontract.schemas._2004._07.regionemarche_protocollo2_common;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import it.marche.regione.paleo2.TipoRisultato;


/**
 * <p>Java class for MessaggioClass complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MessaggioClass">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="_NumeroRecordRestituiti" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="_x003C_Codice_x003E_k__BackingField" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="descrizione" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="nrec" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="tipoRisultato" type="{http://paleo.regione.marche.it/services/}TipoRisultato"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MessaggioClass", propOrder = {
    "numeroRecordRestituiti",
    "x003CCodiceX003EKBackingField",
    "descrizione",
    "nrec",
    "tipoRisultato"
})
public class MessaggioClass {

    @XmlElement(name = "_NumeroRecordRestituiti")
    protected int numeroRecordRestituiti;
    @XmlElement(name = "_x003C_Codice_x003E_k__BackingField", required = true, nillable = true)
    protected String x003CCodiceX003EKBackingField;
    @XmlElement(required = true, nillable = true)
    protected String descrizione;
    protected int nrec;
    @XmlElement(required = true)
    protected TipoRisultato tipoRisultato;

    /**
     * Gets the value of the numeroRecordRestituiti property.
     * 
     */
    public int getNumeroRecordRestituiti() {
        return numeroRecordRestituiti;
    }

    /**
     * Sets the value of the numeroRecordRestituiti property.
     * 
     */
    public void setNumeroRecordRestituiti(int value) {
        this.numeroRecordRestituiti = value;
    }

    /**
     * Gets the value of the x003CCodiceX003EKBackingField property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getX003CCodiceX003EKBackingField() {
        return x003CCodiceX003EKBackingField;
    }

    /**
     * Sets the value of the x003CCodiceX003EKBackingField property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setX003CCodiceX003EKBackingField(String value) {
        this.x003CCodiceX003EKBackingField = value;
    }

    /**
     * Gets the value of the descrizione property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescrizione() {
        return descrizione;
    }

    /**
     * Sets the value of the descrizione property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescrizione(String value) {
        this.descrizione = value;
    }

    /**
     * Gets the value of the nrec property.
     * 
     */
    public int getNrec() {
        return nrec;
    }

    /**
     * Sets the value of the nrec property.
     * 
     */
    public void setNrec(int value) {
        this.nrec = value;
    }

    /**
     * Gets the value of the tipoRisultato property.
     * 
     * @return
     *     possible object is
     *     {@link TipoRisultato }
     *     
     */
    public TipoRisultato getTipoRisultato() {
        return tipoRisultato;
    }

    /**
     * Sets the value of the tipoRisultato property.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoRisultato }
     *     
     */
    public void setTipoRisultato(TipoRisultato value) {
        this.tipoRisultato = value;
    }

}
