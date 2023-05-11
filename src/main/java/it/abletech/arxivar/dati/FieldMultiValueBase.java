
package it.abletech.arxivar.dati;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Field_MultiValueBase complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Field_MultiValueBase">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.Abletech.it/Arxivar}Field_Abstract">
 *       &lt;sequence>
 *         &lt;element name="And" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="forceCaseInsensitive" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="DocNumberList" type="{http://www.Abletech.it/Arxivar}ArrayOfInt" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Field_MultiValueBase", propOrder = {
    "and",
    "forceCaseInsensitive",
    "docNumberList"
})
@XmlSeeAlso({
    FieldMultiValue.class,
    FieldMultiValueClassi.class
})
public abstract class FieldMultiValueBase
    extends FieldAbstract
{

    @XmlElement(name = "And")
    protected boolean and;
    protected boolean forceCaseInsensitive;
    @XmlElement(name = "DocNumberList")
    protected ArrayOfInt docNumberList;

    /**
     * Gets the value of the and property.
     * 
     */
    public boolean isAnd() {
        return and;
    }

    /**
     * Sets the value of the and property.
     * 
     */
    public void setAnd(boolean value) {
        this.and = value;
    }

    /**
     * Gets the value of the forceCaseInsensitive property.
     * 
     */
    public boolean isForceCaseInsensitive() {
        return forceCaseInsensitive;
    }

    /**
     * Sets the value of the forceCaseInsensitive property.
     * 
     */
    public void setForceCaseInsensitive(boolean value) {
        this.forceCaseInsensitive = value;
    }

    /**
     * Gets the value of the docNumberList property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfInt }
     *     
     */
    public ArrayOfInt getDocNumberList() {
        return docNumberList;
    }

    /**
     * Sets the value of the docNumberList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfInt }
     *     
     */
    public void setDocNumberList(ArrayOfInt value) {
        this.docNumberList = value;
    }

}
