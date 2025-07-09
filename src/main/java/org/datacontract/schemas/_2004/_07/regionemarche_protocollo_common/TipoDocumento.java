
package org.datacontract.schemas._2004._07.regionemarche_protocollo_common;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import it.marche.regione.paleo.Messaggio;


/**
 * <p>Java class for TipoDocumento complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TipoDocumento">
 *   &lt;complexContent>
 *     &lt;extension base="{http://paleo.regione.marche.it/services/}Messaggio">
 *       &lt;sequence>
 *         &lt;element name="_Descrizione" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="_IdTipoDocumento" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="_x003C_CodiceRepertorio_x003E_k__BackingField" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="_x003C_Codice_x003E_k__BackingField" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="_x003C_IdRepertorio_x003E_k__BackingField" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/extension>
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
    "x003CCodiceRepertorioX003EKBackingField",
    "x003CCodiceX003EKBackingField",
    "x003CIdRepertorioX003EKBackingField"
})
public class TipoDocumento
    extends Messaggio
{

    @XmlElement(name = "_Descrizione", required = true, nillable = true)
    protected String descrizione;
    @XmlElement(name = "_IdTipoDocumento", required = true, type = Integer.class, nillable = true)
    protected Integer idTipoDocumento;
    @XmlElement(name = "_x003C_CodiceRepertorio_x003E_k__BackingField", required = true, nillable = true)
    protected String x003CCodiceRepertorioX003EKBackingField;
    @XmlElement(name = "_x003C_Codice_x003E_k__BackingField", required = true, nillable = true)
    protected String x003CCodiceX003EKBackingField;
    @XmlElement(name = "_x003C_IdRepertorio_x003E_k__BackingField", required = true, type = Integer.class, nillable = true)
    protected Integer x003CIdRepertorioX003EKBackingField;

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
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getIdTipoDocumento() {
        return idTipoDocumento;
    }

    /**
     * Sets the value of the idTipoDocumento property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setIdTipoDocumento(Integer value) {
        this.idTipoDocumento = value;
    }

    /**
     * Gets the value of the x003CCodiceRepertorioX003EKBackingField property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getX003CCodiceRepertorioX003EKBackingField() {
        return x003CCodiceRepertorioX003EKBackingField;
    }

    /**
     * Sets the value of the x003CCodiceRepertorioX003EKBackingField property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setX003CCodiceRepertorioX003EKBackingField(String value) {
        this.x003CCodiceRepertorioX003EKBackingField = value;
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
     * Gets the value of the x003CIdRepertorioX003EKBackingField property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getX003CIdRepertorioX003EKBackingField() {
        return x003CIdRepertorioX003EKBackingField;
    }

    /**
     * Sets the value of the x003CIdRepertorioX003EKBackingField property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setX003CIdRepertorioX003EKBackingField(Integer value) {
        this.x003CIdRepertorioX003EKBackingField = value;
    }

}
