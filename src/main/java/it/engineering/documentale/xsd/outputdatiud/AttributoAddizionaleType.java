//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-833 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.06.01 at 11:53:11 AM CEST 
//


package it.engineering.documentale.xsd.outputdatiud;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;


/**
 * <p>Java class for AttributoAddizionaleType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AttributoAddizionaleType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Nome" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;choice>
 *           &lt;element name="ValoreSemplice" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *           &lt;element name="Lista">
 *             &lt;complexType>
 *               &lt;complexContent>
 *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                   &lt;sequence>
 *                     &lt;element name="Riga" maxOccurs="unbounded" minOccurs="0">
 *                       &lt;complexType>
 *                         &lt;complexContent>
 *                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                             &lt;sequence>
 *                               &lt;element name="Colonna" maxOccurs="unbounded">
 *                                 &lt;complexType>
 *                                   &lt;complexContent>
 *                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                       &lt;attribute name="Nro" use="required" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
 *                                     &lt;/restriction>
 *                                   &lt;/complexContent>
 *                                 &lt;/complexType>
 *                               &lt;/element>
 *                             &lt;/sequence>
 *                           &lt;/restriction>
 *                         &lt;/complexContent>
 *                       &lt;/complexType>
 *                     &lt;/element>
 *                   &lt;/sequence>
 *                 &lt;/restriction>
 *               &lt;/complexContent>
 *             &lt;/complexType>
 *           &lt;/element>
 *         &lt;/choice>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AttributoAddizionaleType", propOrder = {
    "nome",
    "valoreSemplice",
    "lista"
})
public class AttributoAddizionaleType {

    @XmlElement(name = "Nome", required = true)
    protected String nome;
    @XmlElement(name = "ValoreSemplice")
    protected String valoreSemplice;
    @XmlElement(name = "Lista")
    protected AttributoAddizionaleType.Lista lista;

    /**
     * Gets the value of the nome property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNome() {
        return nome;
    }

    /**
     * Sets the value of the nome property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNome(String value) {
        this.nome = value;
    }

    /**
     * Gets the value of the valoreSemplice property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValoreSemplice() {
        return valoreSemplice;
    }

    /**
     * Sets the value of the valoreSemplice property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValoreSemplice(String value) {
        this.valoreSemplice = value;
    }

    /**
     * Gets the value of the lista property.
     * 
     * @return
     *     possible object is
     *     {@link AttributoAddizionaleType.Lista }
     *     
     */
    public AttributoAddizionaleType.Lista getLista() {
        return lista;
    }

    /**
     * Sets the value of the lista property.
     * 
     * @param value
     *     allowed object is
     *     {@link AttributoAddizionaleType.Lista }
     *     
     */
    public void setLista(AttributoAddizionaleType.Lista value) {
        this.lista = value;
    }


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
     *         &lt;element name="Riga" maxOccurs="unbounded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="Colonna" maxOccurs="unbounded">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;attribute name="Nro" use="required" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
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
        "riga"
    })
    public static class Lista {

        @XmlElement(name = "Riga")
        protected List<AttributoAddizionaleType.Lista.Riga> riga;

        /**
         * Gets the value of the riga property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the riga property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getRiga().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link AttributoAddizionaleType.Lista.Riga }
         * 
         * 
         */
        public List<AttributoAddizionaleType.Lista.Riga> getRiga() {
            if (riga == null) {
                riga = new ArrayList<AttributoAddizionaleType.Lista.Riga>();
            }
            return this.riga;
        }


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
         *         &lt;element name="Colonna" maxOccurs="unbounded">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;attribute name="Nro" use="required" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
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
            "colonna"
        })
        public static class Riga {

            @XmlElement(name = "Colonna", required = true)
            protected List<AttributoAddizionaleType.Lista.Riga.Colonna> colonna;

            /**
             * Gets the value of the colonna property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the colonna property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getColonna().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link AttributoAddizionaleType.Lista.Riga.Colonna }
             * 
             * 
             */
            public List<AttributoAddizionaleType.Lista.Riga.Colonna> getColonna() {
                if (colonna == null) {
                    colonna = new ArrayList<AttributoAddizionaleType.Lista.Riga.Colonna>();
                }
                return this.colonna;
            }


            /**
             * <p>Java class for anonymous complex type.
             * 
             * <p>The following schema fragment specifies the expected content contained within this class.
             * 
             * <pre>
             * &lt;complexType>
             *   &lt;complexContent>
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *       &lt;attribute name="Nro" use="required" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "content"
            })
            public static class Colonna {

                @XmlValue
                protected String content;
                @XmlAttribute(name = "Nro", required = true)
                @XmlSchemaType(name = "positiveInteger")
                protected BigInteger nro;

                /**
                 * Gets the value of the content property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getContent() {
                    return content;
                }

                /**
                 * Sets the value of the content property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setContent(String value) {
                    this.content = value;
                }

                /**
                 * Gets the value of the nro property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link BigInteger }
                 *     
                 */
                public BigInteger getNro() {
                    return nro;
                }

                /**
                 * Sets the value of the nro property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link BigInteger }
                 *     
                 */
                public void setNro(BigInteger value) {
                    this.nro = value;
                }

            }

        }

    }

}
