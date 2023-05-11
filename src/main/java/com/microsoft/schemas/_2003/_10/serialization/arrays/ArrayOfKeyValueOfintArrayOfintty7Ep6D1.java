
package com.microsoft.schemas._2003._10.serialization.arrays;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per ArrayOfKeyValueOfintArrayOfintty7Ep6D1 complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfKeyValueOfintArrayOfintty7Ep6D1"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="KeyValueOfintArrayOfintty7Ep6D1" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="Key" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *                   &lt;element name="Value" type="{http://schemas.microsoft.com/2003/10/Serialization/Arrays}ArrayOfint"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfKeyValueOfintArrayOfintty7Ep6D1", propOrder = {
    "keyValueOfintArrayOfintty7Ep6D1"
})
public class ArrayOfKeyValueOfintArrayOfintty7Ep6D1 {

    @XmlElement(name = "KeyValueOfintArrayOfintty7Ep6D1")
    protected List<ArrayOfKeyValueOfintArrayOfintty7Ep6D1 .KeyValueOfintArrayOfintty7Ep6D1> keyValueOfintArrayOfintty7Ep6D1;

    /**
     * Gets the value of the keyValueOfintArrayOfintty7Ep6D1 property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the keyValueOfintArrayOfintty7Ep6D1 property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getKeyValueOfintArrayOfintty7Ep6D1().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ArrayOfKeyValueOfintArrayOfintty7Ep6D1 .KeyValueOfintArrayOfintty7Ep6D1 }
     * 
     * 
     */
    public List<ArrayOfKeyValueOfintArrayOfintty7Ep6D1 .KeyValueOfintArrayOfintty7Ep6D1> getKeyValueOfintArrayOfintty7Ep6D1() {
        if (keyValueOfintArrayOfintty7Ep6D1 == null) {
            keyValueOfintArrayOfintty7Ep6D1 = new ArrayList<ArrayOfKeyValueOfintArrayOfintty7Ep6D1 .KeyValueOfintArrayOfintty7Ep6D1>();
        }
        return this.keyValueOfintArrayOfintty7Ep6D1;
    }


    /**
     * <p>Classe Java per anonymous complex type.
     * 
     * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="Key" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
     *         &lt;element name="Value" type="{http://schemas.microsoft.com/2003/10/Serialization/Arrays}ArrayOfint"/&gt;
     *       &lt;/sequence&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "key",
        "value"
    })
    public static class KeyValueOfintArrayOfintty7Ep6D1 {

        @XmlElement(name = "Key")
        protected int key;
        @XmlElement(name = "Value", required = true, nillable = true)
        protected ArrayOfint value;

        /**
         * Recupera il valore della propriet� key.
         * 
         */
        public int getKey() {
            return key;
        }

        /**
         * Imposta il valore della propriet� key.
         * 
         */
        public void setKey(int value) {
            this.key = value;
        }

        /**
         * Recupera il valore della propriet� value.
         * 
         * @return
         *     possible object is
         *     {@link ArrayOfint }
         *     
         */
        public ArrayOfint getValue() {
            return value;
        }

        /**
         * Imposta il valore della propriet� value.
         * 
         * @param value
         *     allowed object is
         *     {@link ArrayOfint }
         *     
         */
        public void setValue(ArrayOfint value) {
            this.value = value;
        }

    }

}
