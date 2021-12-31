
package it.archiflow93.classification;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for InsertTipoFascicoloOutput complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="InsertTipoFascicoloOutput">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities}BaseOutput">
 *       &lt;sequence>
 *         &lt;element name="DataCreazione" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="TipoFascId" type="{http://schemas.datacontract.org/2004/07/SIAV.Classification.Entities.TipoFascicolo.Identifier}TipoFascicoloIdentifier" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InsertTipoFascicoloOutput", propOrder = {
    "dataCreazione",
    "tipoFascId"
})
public class InsertTipoFascicoloOutput
    extends BaseOutput
{

    @XmlElement(name = "DataCreazione")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dataCreazione;
    @XmlElement(name = "TipoFascId", nillable = true)
    protected TipoFascicoloIdentifier tipoFascId;

    /**
     * Gets the value of the dataCreazione property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDataCreazione() {
        return dataCreazione;
    }

    /**
     * Sets the value of the dataCreazione property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDataCreazione(XMLGregorianCalendar value) {
        this.dataCreazione = value;
    }

    /**
     * Gets the value of the tipoFascId property.
     * 
     * @return
     *     possible object is
     *     {@link TipoFascicoloIdentifier }
     *     
     */
    public TipoFascicoloIdentifier getTipoFascId() {
        return tipoFascId;
    }

    /**
     * Sets the value of the tipoFascId property.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoFascicoloIdentifier }
     *     
     */
    public void setTipoFascId(TipoFascicoloIdentifier value) {
        this.tipoFascId = value;
    }

}
