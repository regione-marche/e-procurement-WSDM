
package it.abletech.arxivar.search;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Base_Selected complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Base_Selected">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.Abletech.it/Arxivar}Base">
 *       &lt;sequence>
 *         &lt;element name="SqlSelectCampo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Index" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Selected" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="OrderBy" type="{http://www.Abletech.it/Arxivar}OrderBy" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Base_Selected", propOrder = {
    "sqlSelectCampo",
    "index",
    "selected",
    "orderBy"
})
@XmlSeeAlso({
    AggiuntivoSelected.class
})
public class BaseSelected
    extends Base
{

    @XmlElement(name = "SqlSelectCampo")
    protected String sqlSelectCampo;
    @XmlElement(name = "Index")
    protected int index;
    @XmlElement(name = "Selected")
    protected boolean selected;
    @XmlElement(name = "OrderBy")
    protected OrderBy orderBy;

    /**
     * Gets the value of the sqlSelectCampo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSqlSelectCampo() {
        return sqlSelectCampo;
    }

    /**
     * Sets the value of the sqlSelectCampo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSqlSelectCampo(String value) {
        this.sqlSelectCampo = value;
    }

    /**
     * Gets the value of the index property.
     * 
     */
    public int getIndex() {
        return index;
    }

    /**
     * Sets the value of the index property.
     * 
     */
    public void setIndex(int value) {
        this.index = value;
    }

    /**
     * Gets the value of the selected property.
     * 
     */
    public boolean isSelected() {
        return selected;
    }

    /**
     * Sets the value of the selected property.
     * 
     */
    public void setSelected(boolean value) {
        this.selected = value;
    }

    /**
     * Gets the value of the orderBy property.
     * 
     * @return
     *     possible object is
     *     {@link OrderBy }
     *     
     */
    public OrderBy getOrderBy() {
        return orderBy;
    }

    /**
     * Sets the value of the orderBy property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrderBy }
     *     
     */
    public void setOrderBy(OrderBy value) {
        this.orderBy = value;
    }

}
