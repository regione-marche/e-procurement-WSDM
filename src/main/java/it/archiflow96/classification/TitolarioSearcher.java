
package it.archiflow96.classification;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TitolarioSearcher complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TitolarioSearcher">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/SIAV.Classification.Entities.Common.BaseClass}ClassificazioneBaseSearcher">
 *       &lt;sequence>
 *         &lt;element name="QueryType" type="{http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Types}EntityQueryType" minOccurs="0"/>
 *         &lt;element name="Titolario_Id" type="{http://schemas.datacontract.org/2004/07/SIAV.Classification.Entities.Titolario.Identifier}TitolarioIdentifier" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TitolarioSearcher", namespace = "http://schemas.datacontract.org/2004/07/SIAV.Classification.Entities.Titolario.Searcher", propOrder = {
    "queryType",
    "titolarioId"
})
public class TitolarioSearcher
    extends ClassificazioneBaseSearcher
{

    @XmlElement(name = "QueryType")
    protected EntityQueryType queryType;
    @XmlElement(name = "Titolario_Id", nillable = true)
    protected TitolarioIdentifier titolarioId;

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
     * Gets the value of the titolarioId property.
     * 
     * @return
     *     possible object is
     *     {@link TitolarioIdentifier }
     *     
     */
    public TitolarioIdentifier getTitolarioId() {
        return titolarioId;
    }

    /**
     * Sets the value of the titolarioId property.
     * 
     * @param value
     *     allowed object is
     *     {@link TitolarioIdentifier }
     *     
     */
    public void setTitolarioId(TitolarioIdentifier value) {
        this.titolarioId = value;
    }

}
