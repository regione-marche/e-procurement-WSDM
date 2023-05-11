
package org.datacontract.schemas._2004._07.regionemarche_protocollo_common;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TipoDocumento complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TipoDocumento">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="_Descrizione" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="_IdTipoDocumento" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="_x003C_Codice_x003E_k__BackingField" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TipoDocumento", propOrder = {
    "descrizione",
    "idTipoDocumento",
    "x003CCodiceX003EKBackingField"
})
public class TipoDocumento {

    @XmlElement(name = "_Descrizione", required = true, nillable = true)
    protected String descrizione;
    @XmlElement(name = "_IdTipoDocumento")
    protected int idTipoDocumento;
    @XmlElement(name = "_x003C_Codice_x003E_k__BackingField", required = true, nillable = true)
    protected String x003CCodiceX003EKBackingField;

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
     * Gets the value of the idTipoDocumento property.
     * 
     */
    public int getIdTipoDocumento() {
        return idTipoDocumento;
    }

    /**
     * Sets the value of the idTipoDocumento property.
     * 
     */
    public void setIdTipoDocumento(int value) {
        this.idTipoDocumento = value;
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

}
