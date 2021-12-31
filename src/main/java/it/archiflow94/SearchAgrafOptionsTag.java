
package it.archiflow94;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SearchAgrafOptionsTag complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SearchAgrafOptionsTag">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AgrafNoteSearch" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EnableGroupSearch" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="MatchMode" type="{http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Types}AgrafMatchMode" minOccurs="0"/>
 *         &lt;element name="TagId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SearchAgrafOptionsTag", namespace = "http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Agraf.ValueObject", propOrder = {
    "agrafNoteSearch",
    "enableGroupSearch",
    "matchMode",
    "tagId"
})
public class SearchAgrafOptionsTag {

    @XmlElement(name = "AgrafNoteSearch", nillable = true)
    protected String agrafNoteSearch;
    @XmlElement(name = "EnableGroupSearch")
    protected Boolean enableGroupSearch;
    @XmlElement(name = "MatchMode")
    protected AgrafMatchMode matchMode;
    @XmlElement(name = "TagId", nillable = true)
    protected String tagId;

    /**
     * Gets the value of the agrafNoteSearch property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAgrafNoteSearch() {
        return agrafNoteSearch;
    }

    /**
     * Sets the value of the agrafNoteSearch property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAgrafNoteSearch(String value) {
        this.agrafNoteSearch = value;
    }

    /**
     * Gets the value of the enableGroupSearch property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEnableGroupSearch() {
        return enableGroupSearch;
    }

    /**
     * Sets the value of the enableGroupSearch property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEnableGroupSearch(Boolean value) {
        this.enableGroupSearch = value;
    }

    /**
     * Gets the value of the matchMode property.
     * 
     * @return
     *     possible object is
     *     {@link AgrafMatchMode }
     *     
     */
    public AgrafMatchMode getMatchMode() {
        return matchMode;
    }

    /**
     * Sets the value of the matchMode property.
     * 
     * @param value
     *     allowed object is
     *     {@link AgrafMatchMode }
     *     
     */
    public void setMatchMode(AgrafMatchMode value) {
        this.matchMode = value;
    }

    /**
     * Gets the value of the tagId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTagId() {
        return tagId;
    }

    /**
     * Sets the value of the tagId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTagId(String value) {
        this.tagId = value;
    }

}
