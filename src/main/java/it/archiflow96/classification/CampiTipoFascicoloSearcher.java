
package it.archiflow96.classification;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CampiTipoFascicoloSearcher complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CampiTipoFascicoloSearcher">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/SIAV.Classification.Entities.Common.BaseClass}ClassificazioneBaseSearcher">
 *       &lt;sequence>
 *         &lt;element name="CampoId" type="{http://schemas.datacontract.org/2004/07/SIAV.Classification.Entities.TipoFascicolo.Identifier}CampiTipoFascicoloIdentifier" minOccurs="0"/>
 *         &lt;element name="FascicoloId" type="{http://schemas.datacontract.org/2004/07/SIAV.Classification.Entities.Fascicoli.Identifier}FascicoloIdentifier" minOccurs="0"/>
 *         &lt;element name="FieldType" type="{http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Types}FieldTypeDefinition" minOccurs="0"/>
 *         &lt;element name="OrderBy" type="{http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Types}SortingTypes" minOccurs="0"/>
 *         &lt;element name="QueryType" type="{http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Types}EntityQueryType" minOccurs="0"/>
 *         &lt;element name="TipoFascicolo" type="{http://schemas.datacontract.org/2004/07/SIAV.Classification.Entities.TipoFascicolo.Identifier}TipoFascicoloIdentifier" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CampiTipoFascicoloSearcher", namespace = "http://schemas.datacontract.org/2004/07/SIAV.Classification.Entities.TipoFascicolo.Searcher", propOrder = {
    "campoId",
    "fascicoloId",
    "fieldType",
    "orderBy",
    "queryType",
    "tipoFascicolo"
})
public class CampiTipoFascicoloSearcher
    extends ClassificazioneBaseSearcher
{

    @XmlElement(name = "CampoId", nillable = true)
    protected CampiTipoFascicoloIdentifier campoId;
    @XmlElement(name = "FascicoloId", nillable = true)
    protected FascicoloIdentifier fascicoloId;
    @XmlElement(name = "FieldType")
    protected FieldTypeDefinition fieldType;
    @XmlElement(name = "OrderBy")
    protected SortingTypes orderBy;
    @XmlElement(name = "QueryType")
    protected EntityQueryType queryType;
    @XmlElement(name = "TipoFascicolo", nillable = true)
    protected TipoFascicoloIdentifier tipoFascicolo;

    /**
     * Gets the value of the campoId property.
     * 
     * @return
     *     possible object is
     *     {@link CampiTipoFascicoloIdentifier }
     *     
     */
    public CampiTipoFascicoloIdentifier getCampoId() {
        return campoId;
    }

    /**
     * Sets the value of the campoId property.
     * 
     * @param value
     *     allowed object is
     *     {@link CampiTipoFascicoloIdentifier }
     *     
     */
    public void setCampoId(CampiTipoFascicoloIdentifier value) {
        this.campoId = value;
    }

    /**
     * Gets the value of the fascicoloId property.
     * 
     * @return
     *     possible object is
     *     {@link FascicoloIdentifier }
     *     
     */
    public FascicoloIdentifier getFascicoloId() {
        return fascicoloId;
    }

    /**
     * Sets the value of the fascicoloId property.
     * 
     * @param value
     *     allowed object is
     *     {@link FascicoloIdentifier }
     *     
     */
    public void setFascicoloId(FascicoloIdentifier value) {
        this.fascicoloId = value;
    }

    /**
     * Gets the value of the fieldType property.
     * 
     * @return
     *     possible object is
     *     {@link FieldTypeDefinition }
     *     
     */
    public FieldTypeDefinition getFieldType() {
        return fieldType;
    }

    /**
     * Sets the value of the fieldType property.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldTypeDefinition }
     *     
     */
    public void setFieldType(FieldTypeDefinition value) {
        this.fieldType = value;
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
     * Gets the value of the tipoFascicolo property.
     * 
     * @return
     *     possible object is
     *     {@link TipoFascicoloIdentifier }
     *     
     */
    public TipoFascicoloIdentifier getTipoFascicolo() {
        return tipoFascicolo;
    }

    /**
     * Sets the value of the tipoFascicolo property.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoFascicoloIdentifier }
     *     
     */
    public void setTipoFascicolo(TipoFascicoloIdentifier value) {
        this.tipoFascicolo = value;
    }

}
