
package it.abletech.arxivar.dati;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="sessionId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dmSqlId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="arxKeyValues" type="{http://www.Abletech.it/Arxivar}ArrayOfArx_KeyValue" minOccurs="0"/>
 *         &lt;element name="filters" type="{http://www.Abletech.it/Arxivar}ArrayOfField_Abstract" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "sessionId",
    "dmSqlId",
    "arxKeyValues",
    "filters"
})
@XmlRootElement(name = "Dm_Sql_GetValues")
public class DmSqlGetValues {

    protected String sessionId;
    protected String dmSqlId;
    protected ArrayOfArxKeyValue arxKeyValues;
    protected ArrayOfFieldAbstract filters;

    /**
     * Gets the value of the sessionId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSessionId() {
        return sessionId;
    }

    /**
     * Sets the value of the sessionId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSessionId(String value) {
        this.sessionId = value;
    }

    /**
     * Gets the value of the dmSqlId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDmSqlId() {
        return dmSqlId;
    }

    /**
     * Sets the value of the dmSqlId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDmSqlId(String value) {
        this.dmSqlId = value;
    }

    /**
     * Gets the value of the arxKeyValues property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfArxKeyValue }
     *     
     */
    public ArrayOfArxKeyValue getArxKeyValues() {
        return arxKeyValues;
    }

    /**
     * Sets the value of the arxKeyValues property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfArxKeyValue }
     *     
     */
    public void setArxKeyValues(ArrayOfArxKeyValue value) {
        this.arxKeyValues = value;
    }

    /**
     * Gets the value of the filters property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfFieldAbstract }
     *     
     */
    public ArrayOfFieldAbstract getFilters() {
        return filters;
    }

    /**
     * Sets the value of the filters property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfFieldAbstract }
     *     
     */
    public void setFilters(ArrayOfFieldAbstract value) {
        this.filters = value;
    }

}
