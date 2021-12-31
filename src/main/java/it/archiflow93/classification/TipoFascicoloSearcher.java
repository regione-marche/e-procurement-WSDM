
package it.archiflow93.classification;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TipoFascicoloSearcher complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TipoFascicoloSearcher">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/SIAV.Classification.Entities.Common.BaseClass}ClassificazioneBaseSearcher">
 *       &lt;sequence>
 *         &lt;element name="Label" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OrderBy" type="{http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Types}SortingTypes" minOccurs="0"/>
 *         &lt;element name="QueryType" type="{http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Types}EntityQueryType" minOccurs="0"/>
 *         &lt;element name="TipoFascicoloId" type="{http://schemas.datacontract.org/2004/07/SIAV.Classification.Entities.TipoFascicolo.Identifier}TipoFascicoloIdentifier" minOccurs="0"/>
 *         &lt;element name="UtenteId" type="{http://schemas.datacontract.org/2004/07/SIAV.Common.BaseClass.ValueObject}BaseIdentifier" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TipoFascicoloSearcher", namespace = "http://schemas.datacontract.org/2004/07/SIAV.Classification.Entities.TipoFascicolo.Searcher", propOrder = {
    "label",
    "orderBy",
    "queryType",
    "tipoFascicoloId",
    "utenteId"
})
public class TipoFascicoloSearcher
    extends ClassificazioneBaseSearcher
{

    @XmlElement(name = "Label", nillable = true)
    protected String label;
    @XmlElement(name = "OrderBy")
    protected SortingTypes orderBy;
    @XmlElement(name = "QueryType")
    protected EntityQueryType queryType;
    @XmlElement(name = "TipoFascicoloId", nillable = true)
    protected TipoFascicoloIdentifier tipoFascicoloId;
    @XmlElement(name = "UtenteId", nillable = true)
    protected BaseIdentifier utenteId;

    /**
     * Gets the value of the label property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLabel() {
        return label;
    }

    /**
     * Sets the value of the label property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLabel(String value) {
        this.label = value;
    }

    /**
     * Gets the value of the orderBy property.
     * 
     * @return
     *     possible object is
     *     {@link SortingTypes }
     *     
     */
    public SortingTypes getOrderBy() {
        return orderBy;
    }

    /**
     * Sets the value of the orderBy property.
     * 
     * @param value
     *     allowed object is
     *     {@link SortingTypes }
     *     
     */
    public void setOrderBy(SortingTypes value) {
        this.orderBy = value;
    }

    /**
     * Gets the value of the queryType property.
     * 
     * @return
     *     possible object is
     *     {@link EntityQueryType }
     *     
     */
    public EntityQueryType getQueryType() {
        return queryType;
    }

    /**
     * Sets the value of the queryType property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityQueryType }
     *     
     */
    public void setQueryType(EntityQueryType value) {
        this.queryType = value;
    }

    /**
     * Gets the value of the tipoFascicoloId property.
     * 
     * @return
     *     possible object is
     *     {@link TipoFascicoloIdentifier }
     *     
     */
    public TipoFascicoloIdentifier getTipoFascicoloId() {
        return tipoFascicoloId;
    }

    /**
     * Sets the value of the tipoFascicoloId property.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoFascicoloIdentifier }
     *     
     */
    public void setTipoFascicoloId(TipoFascicoloIdentifier value) {
        this.tipoFascicoloId = value;
    }

    /**
     * Gets the value of the utenteId property.
     * 
     * @return
     *     possible object is
     *     {@link BaseIdentifier }
     *     
     */
    public BaseIdentifier getUtenteId() {
        return utenteId;
    }

    /**
     * Sets the value of the utenteId property.
     * 
     * @param value
     *     allowed object is
     *     {@link BaseIdentifier }
     *     
     */
    public void setUtenteId(BaseIdentifier value) {
        this.utenteId = value;
    }

}
