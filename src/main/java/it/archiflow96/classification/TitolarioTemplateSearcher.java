
package it.archiflow96.classification;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TitolarioTemplateSearcher complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TitolarioTemplateSearcher">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/SIAV.Classification.Entities.Common.BaseClass}ClassificazioneBaseSearcher">
 *       &lt;sequence>
 *         &lt;element name="QueryType" type="{http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Types}EntityQueryType" minOccurs="0"/>
 *         &lt;element name="TitolarioTemplate_Id" type="{http://schemas.datacontract.org/2004/07/SIAV.Classification.Entities.Titolario.Identifier}TitolarioTemplateIdentifier" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TitolarioTemplateSearcher", namespace = "http://schemas.datacontract.org/2004/07/SIAV.Classification.Entities.Titolario.Searcher", propOrder = {
    "queryType",
    "titolarioTemplateId"
})
public class TitolarioTemplateSearcher
    extends ClassificazioneBaseSearcher
{

    @XmlElement(name = "QueryType")
    protected EntityQueryType queryType;
    @XmlElement(name = "TitolarioTemplate_Id", nillable = true)
    protected TitolarioTemplateIdentifier titolarioTemplateId;

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
     * Gets the value of the titolarioTemplateId property.
     * 
     * @return
     *     possible object is
     *     {@link TitolarioTemplateIdentifier }
     *     
     */
    public TitolarioTemplateIdentifier getTitolarioTemplateId() {
        return titolarioTemplateId;
    }

    /**
     * Sets the value of the titolarioTemplateId property.
     * 
     * @param value
     *     allowed object is
     *     {@link TitolarioTemplateIdentifier }
     *     
     */
    public void setTitolarioTemplateId(TitolarioTemplateIdentifier value) {
        this.titolarioTemplateId = value;
    }

}
