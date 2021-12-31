
package it.abletech.arxivar.search;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Join_Dm_Utenti complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Join_Dm_Utenti">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.Abletech.it/Arxivar}Join_Abstract">
 *       &lt;sequence>
 *         &lt;element name="UTENTE" type="{http://www.Abletech.it/Arxivar}Field_Int" minOccurs="0"/>
 *         &lt;element name="GRUPPO" type="{http://www.Abletech.it/Arxivar}Field_Int" minOccurs="0"/>
 *         &lt;element name="DESCRIPTION" type="{http://www.Abletech.it/Arxivar}Field_String" minOccurs="0"/>
 *         &lt;element name="EMAIL" type="{http://www.Abletech.it/Arxivar}Field_String" minOccurs="0"/>
 *         &lt;element name="AOO" type="{http://www.Abletech.it/Arxivar}Field_String" minOccurs="0"/>
 *         &lt;element name="PASSWORD" type="{http://www.Abletech.it/Arxivar}Field_String" minOccurs="0"/>
 *         &lt;element name="TIPODEFAULT" type="{http://www.Abletech.it/Arxivar}Field_Int" minOccurs="0"/>
 *         &lt;element name="TIPO2" type="{http://www.Abletech.it/Arxivar}Field_Int" minOccurs="0"/>
 *         &lt;element name="TIPO3" type="{http://www.Abletech.it/Arxivar}Field_Int" minOccurs="0"/>
 *         &lt;element name="INTERNOFAX" type="{http://www.Abletech.it/Arxivar}Field_String" minOccurs="0"/>
 *         &lt;element name="LASTMAIL" type="{http://www.Abletech.it/Arxivar}Field_DateTime" minOccurs="0"/>
 *         &lt;element name="CATEGORIA" type="{http://www.Abletech.it/Arxivar}Field_String" minOccurs="0"/>
 *         &lt;element name="WORKFLOW" type="{http://www.Abletech.it/Arxivar}Field_Int" minOccurs="0"/>
 *         &lt;element name="STATODEFAULT" type="{http://www.Abletech.it/Arxivar}Field_String" minOccurs="0"/>
 *         &lt;element name="RUBRICA" type="{http://www.Abletech.it/Arxivar}Field_Int" minOccurs="0"/>
 *         &lt;element name="STATOUTENTE" type="{http://www.Abletech.it/Arxivar}Field_Int" minOccurs="0"/>
 *         &lt;element name="NOMECOMPLETO" type="{http://www.Abletech.it/Arxivar}Field_String" minOccurs="0"/>
 *         &lt;element name="SERVERPOSTA" type="{http://www.Abletech.it/Arxivar}Field_String" minOccurs="0"/>
 *         &lt;element name="ACCESSOWEB" type="{http://www.Abletech.it/Arxivar}Field_Int" minOccurs="0"/>
 *         &lt;element name="UPLOAD" type="{http://www.Abletech.it/Arxivar}Field_Int" minOccurs="0"/>
 *         &lt;element name="FASCICOLI" type="{http://www.Abletech.it/Arxivar}Field_Int" minOccurs="0"/>
 *         &lt;element name="FLOW" type="{http://www.Abletech.it/Arxivar}Field_Int" minOccurs="0"/>
 *         &lt;element name="SIGN" type="{http://www.Abletech.it/Arxivar}Field_Int" minOccurs="0"/>
 *         &lt;element name="VIEWER" type="{http://www.Abletech.it/Arxivar}Field_Int" minOccurs="0"/>
 *         &lt;element name="PROTOCOLLO" type="{http://www.Abletech.it/Arxivar}Field_Int" minOccurs="0"/>
 *         &lt;element name="MODULI" type="{http://www.Abletech.it/Arxivar}Field_Int" minOccurs="0"/>
 *         &lt;element name="DOMINIO" type="{http://www.Abletech.it/Arxivar}Field_String" minOccurs="0"/>
 *         &lt;element name="STATOOUT" type="{http://www.Abletech.it/Arxivar}Field_String" minOccurs="0"/>
 *         &lt;element name="TESTOMAIL" type="{http://www.Abletech.it/Arxivar}Field_String" minOccurs="0"/>
 *         &lt;element name="NOTIFICA" type="{http://www.Abletech.it/Arxivar}Field_Int" minOccurs="0"/>
 *         &lt;element name="CLIENTPOSTA" type="{http://www.Abletech.it/Arxivar}Field_String" minOccurs="0"/>
 *         &lt;element name="HTMLBODY" type="{http://www.Abletech.it/Arxivar}Field_Int" minOccurs="0"/>
 *         &lt;element name="RESPAOS" type="{http://www.Abletech.it/Arxivar}Field_Int" minOccurs="0"/>
 *         &lt;element name="ADDAOS" type="{http://www.Abletech.it/Arxivar}Field_Int" minOccurs="0"/>
 *         &lt;element name="CODFIS" type="{http://www.Abletech.it/Arxivar}Field_String" minOccurs="0"/>
 *         &lt;element name="PIN" type="{http://www.Abletech.it/Arxivar}Field_String" minOccurs="0"/>
 *         &lt;element name="GUEST" type="{http://www.Abletech.it/Arxivar}Field_Int" minOccurs="0"/>
 *         &lt;element name="CAMBIOPASSWORD" type="{http://www.Abletech.it/Arxivar}Field_Int" minOccurs="0"/>
 *         &lt;element name="TIPO" type="{http://www.Abletech.it/Arxivar}Field_Int" minOccurs="0"/>
 *         &lt;element name="MAILOUTDEFAULT" type="{http://www.Abletech.it/Arxivar}Field_Int" minOccurs="0"/>
 *         &lt;element name="ACCESSOBARCODE" type="{http://www.Abletech.it/Arxivar}Field_Int" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Join_Dm_Utenti", propOrder = {
    "utente",
    "gruppo",
    "description",
    "email",
    "aoo",
    "password",
    "tipodefault",
    "tipo2",
    "tipo3",
    "internofax",
    "lastmail",
    "categoria",
    "workflow",
    "statodefault",
    "rubrica",
    "statoutente",
    "nomecompleto",
    "serverposta",
    "accessoweb",
    "upload",
    "fascicoli",
    "flow",
    "sign",
    "viewer",
    "protocollo",
    "moduli",
    "dominio",
    "statoout",
    "testomail",
    "notifica",
    "clientposta",
    "htmlbody",
    "respaos",
    "addaos",
    "codfis",
    "pin",
    "guest",
    "cambiopassword",
    "tipo",
    "mailoutdefault",
    "accessobarcode"
})
public class JoinDmUtenti
    extends JoinAbstract
{

    @XmlElement(name = "UTENTE")
    protected FieldInt utente;
    @XmlElement(name = "GRUPPO")
    protected FieldInt gruppo;
    @XmlElement(name = "DESCRIPTION")
    protected FieldString description;
    @XmlElement(name = "EMAIL")
    protected FieldString email;
    @XmlElement(name = "AOO")
    protected FieldString aoo;
    @XmlElement(name = "PASSWORD")
    protected FieldString password;
    @XmlElement(name = "TIPODEFAULT")
    protected FieldInt tipodefault;
    @XmlElement(name = "TIPO2")
    protected FieldInt tipo2;
    @XmlElement(name = "TIPO3")
    protected FieldInt tipo3;
    @XmlElement(name = "INTERNOFAX")
    protected FieldString internofax;
    @XmlElement(name = "LASTMAIL")
    protected FieldDateTime lastmail;
    @XmlElement(name = "CATEGORIA")
    protected FieldString categoria;
    @XmlElement(name = "WORKFLOW")
    protected FieldInt workflow;
    @XmlElement(name = "STATODEFAULT")
    protected FieldString statodefault;
    @XmlElement(name = "RUBRICA")
    protected FieldInt rubrica;
    @XmlElement(name = "STATOUTENTE")
    protected FieldInt statoutente;
    @XmlElement(name = "NOMECOMPLETO")
    protected FieldString nomecompleto;
    @XmlElement(name = "SERVERPOSTA")
    protected FieldString serverposta;
    @XmlElement(name = "ACCESSOWEB")
    protected FieldInt accessoweb;
    @XmlElement(name = "UPLOAD")
    protected FieldInt upload;
    @XmlElement(name = "FASCICOLI")
    protected FieldInt fascicoli;
    @XmlElement(name = "FLOW")
    protected FieldInt flow;
    @XmlElement(name = "SIGN")
    protected FieldInt sign;
    @XmlElement(name = "VIEWER")
    protected FieldInt viewer;
    @XmlElement(name = "PROTOCOLLO")
    protected FieldInt protocollo;
    @XmlElement(name = "MODULI")
    protected FieldInt moduli;
    @XmlElement(name = "DOMINIO")
    protected FieldString dominio;
    @XmlElement(name = "STATOOUT")
    protected FieldString statoout;
    @XmlElement(name = "TESTOMAIL")
    protected FieldString testomail;
    @XmlElement(name = "NOTIFICA")
    protected FieldInt notifica;
    @XmlElement(name = "CLIENTPOSTA")
    protected FieldString clientposta;
    @XmlElement(name = "HTMLBODY")
    protected FieldInt htmlbody;
    @XmlElement(name = "RESPAOS")
    protected FieldInt respaos;
    @XmlElement(name = "ADDAOS")
    protected FieldInt addaos;
    @XmlElement(name = "CODFIS")
    protected FieldString codfis;
    @XmlElement(name = "PIN")
    protected FieldString pin;
    @XmlElement(name = "GUEST")
    protected FieldInt guest;
    @XmlElement(name = "CAMBIOPASSWORD")
    protected FieldInt cambiopassword;
    @XmlElement(name = "TIPO")
    protected FieldInt tipo;
    @XmlElement(name = "MAILOUTDEFAULT")
    protected FieldInt mailoutdefault;
    @XmlElement(name = "ACCESSOBARCODE")
    protected FieldInt accessobarcode;

    /**
     * Gets the value of the utente property.
     * 
     * @return
     *     possible object is
     *     {@link FieldInt }
     *     
     */
    public FieldInt getUTENTE() {
        return utente;
    }

    /**
     * Sets the value of the utente property.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldInt }
     *     
     */
    public void setUTENTE(FieldInt value) {
        this.utente = value;
    }

    /**
     * Gets the value of the gruppo property.
     * 
     * @return
     *     possible object is
     *     {@link FieldInt }
     *     
     */
    public FieldInt getGRUPPO() {
        return gruppo;
    }

    /**
     * Sets the value of the gruppo property.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldInt }
     *     
     */
    public void setGRUPPO(FieldInt value) {
        this.gruppo = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link FieldString }
     *     
     */
    public FieldString getDESCRIPTION() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldString }
     *     
     */
    public void setDESCRIPTION(FieldString value) {
        this.description = value;
    }

    /**
     * Gets the value of the email property.
     * 
     * @return
     *     possible object is
     *     {@link FieldString }
     *     
     */
    public FieldString getEMAIL() {
        return email;
    }

    /**
     * Sets the value of the email property.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldString }
     *     
     */
    public void setEMAIL(FieldString value) {
        this.email = value;
    }

    /**
     * Gets the value of the aoo property.
     * 
     * @return
     *     possible object is
     *     {@link FieldString }
     *     
     */
    public FieldString getAOO() {
        return aoo;
    }

    /**
     * Sets the value of the aoo property.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldString }
     *     
     */
    public void setAOO(FieldString value) {
        this.aoo = value;
    }

    /**
     * Gets the value of the password property.
     * 
     * @return
     *     possible object is
     *     {@link FieldString }
     *     
     */
    public FieldString getPASSWORD() {
        return password;
    }

    /**
     * Sets the value of the password property.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldString }
     *     
     */
    public void setPASSWORD(FieldString value) {
        this.password = value;
    }

    /**
     * Gets the value of the tipodefault property.
     * 
     * @return
     *     possible object is
     *     {@link FieldInt }
     *     
     */
    public FieldInt getTIPODEFAULT() {
        return tipodefault;
    }

    /**
     * Sets the value of the tipodefault property.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldInt }
     *     
     */
    public void setTIPODEFAULT(FieldInt value) {
        this.tipodefault = value;
    }

    /**
     * Gets the value of the tipo2 property.
     * 
     * @return
     *     possible object is
     *     {@link FieldInt }
     *     
     */
    public FieldInt getTIPO2() {
        return tipo2;
    }

    /**
     * Sets the value of the tipo2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldInt }
     *     
     */
    public void setTIPO2(FieldInt value) {
        this.tipo2 = value;
    }

    /**
     * Gets the value of the tipo3 property.
     * 
     * @return
     *     possible object is
     *     {@link FieldInt }
     *     
     */
    public FieldInt getTIPO3() {
        return tipo3;
    }

    /**
     * Sets the value of the tipo3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldInt }
     *     
     */
    public void setTIPO3(FieldInt value) {
        this.tipo3 = value;
    }

    /**
     * Gets the value of the internofax property.
     * 
     * @return
     *     possible object is
     *     {@link FieldString }
     *     
     */
    public FieldString getINTERNOFAX() {
        return internofax;
    }

    /**
     * Sets the value of the internofax property.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldString }
     *     
     */
    public void setINTERNOFAX(FieldString value) {
        this.internofax = value;
    }

    /**
     * Gets the value of the lastmail property.
     * 
     * @return
     *     possible object is
     *     {@link FieldDateTime }
     *     
     */
    public FieldDateTime getLASTMAIL() {
        return lastmail;
    }

    /**
     * Sets the value of the lastmail property.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldDateTime }
     *     
     */
    public void setLASTMAIL(FieldDateTime value) {
        this.lastmail = value;
    }

    /**
     * Gets the value of the categoria property.
     * 
     * @return
     *     possible object is
     *     {@link FieldString }
     *     
     */
    public FieldString getCATEGORIA() {
        return categoria;
    }

    /**
     * Sets the value of the categoria property.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldString }
     *     
     */
    public void setCATEGORIA(FieldString value) {
        this.categoria = value;
    }

    /**
     * Gets the value of the workflow property.
     * 
     * @return
     *     possible object is
     *     {@link FieldInt }
     *     
     */
    public FieldInt getWORKFLOW() {
        return workflow;
    }

    /**
     * Sets the value of the workflow property.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldInt }
     *     
     */
    public void setWORKFLOW(FieldInt value) {
        this.workflow = value;
    }

    /**
     * Gets the value of the statodefault property.
     * 
     * @return
     *     possible object is
     *     {@link FieldString }
     *     
     */
    public FieldString getSTATODEFAULT() {
        return statodefault;
    }

    /**
     * Sets the value of the statodefault property.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldString }
     *     
     */
    public void setSTATODEFAULT(FieldString value) {
        this.statodefault = value;
    }

    /**
     * Gets the value of the rubrica property.
     * 
     * @return
     *     possible object is
     *     {@link FieldInt }
     *     
     */
    public FieldInt getRUBRICA() {
        return rubrica;
    }

    /**
     * Sets the value of the rubrica property.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldInt }
     *     
     */
    public void setRUBRICA(FieldInt value) {
        this.rubrica = value;
    }

    /**
     * Gets the value of the statoutente property.
     * 
     * @return
     *     possible object is
     *     {@link FieldInt }
     *     
     */
    public FieldInt getSTATOUTENTE() {
        return statoutente;
    }

    /**
     * Sets the value of the statoutente property.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldInt }
     *     
     */
    public void setSTATOUTENTE(FieldInt value) {
        this.statoutente = value;
    }

    /**
     * Gets the value of the nomecompleto property.
     * 
     * @return
     *     possible object is
     *     {@link FieldString }
     *     
     */
    public FieldString getNOMECOMPLETO() {
        return nomecompleto;
    }

    /**
     * Sets the value of the nomecompleto property.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldString }
     *     
     */
    public void setNOMECOMPLETO(FieldString value) {
        this.nomecompleto = value;
    }

    /**
     * Gets the value of the serverposta property.
     * 
     * @return
     *     possible object is
     *     {@link FieldString }
     *     
     */
    public FieldString getSERVERPOSTA() {
        return serverposta;
    }

    /**
     * Sets the value of the serverposta property.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldString }
     *     
     */
    public void setSERVERPOSTA(FieldString value) {
        this.serverposta = value;
    }

    /**
     * Gets the value of the accessoweb property.
     * 
     * @return
     *     possible object is
     *     {@link FieldInt }
     *     
     */
    public FieldInt getACCESSOWEB() {
        return accessoweb;
    }

    /**
     * Sets the value of the accessoweb property.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldInt }
     *     
     */
    public void setACCESSOWEB(FieldInt value) {
        this.accessoweb = value;
    }

    /**
     * Gets the value of the upload property.
     * 
     * @return
     *     possible object is
     *     {@link FieldInt }
     *     
     */
    public FieldInt getUPLOAD() {
        return upload;
    }

    /**
     * Sets the value of the upload property.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldInt }
     *     
     */
    public void setUPLOAD(FieldInt value) {
        this.upload = value;
    }

    /**
     * Gets the value of the fascicoli property.
     * 
     * @return
     *     possible object is
     *     {@link FieldInt }
     *     
     */
    public FieldInt getFASCICOLI() {
        return fascicoli;
    }

    /**
     * Sets the value of the fascicoli property.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldInt }
     *     
     */
    public void setFASCICOLI(FieldInt value) {
        this.fascicoli = value;
    }

    /**
     * Gets the value of the flow property.
     * 
     * @return
     *     possible object is
     *     {@link FieldInt }
     *     
     */
    public FieldInt getFLOW() {
        return flow;
    }

    /**
     * Sets the value of the flow property.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldInt }
     *     
     */
    public void setFLOW(FieldInt value) {
        this.flow = value;
    }

    /**
     * Gets the value of the sign property.
     * 
     * @return
     *     possible object is
     *     {@link FieldInt }
     *     
     */
    public FieldInt getSIGN() {
        return sign;
    }

    /**
     * Sets the value of the sign property.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldInt }
     *     
     */
    public void setSIGN(FieldInt value) {
        this.sign = value;
    }

    /**
     * Gets the value of the viewer property.
     * 
     * @return
     *     possible object is
     *     {@link FieldInt }
     *     
     */
    public FieldInt getVIEWER() {
        return viewer;
    }

    /**
     * Sets the value of the viewer property.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldInt }
     *     
     */
    public void setVIEWER(FieldInt value) {
        this.viewer = value;
    }

    /**
     * Gets the value of the protocollo property.
     * 
     * @return
     *     possible object is
     *     {@link FieldInt }
     *     
     */
    public FieldInt getPROTOCOLLO() {
        return protocollo;
    }

    /**
     * Sets the value of the protocollo property.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldInt }
     *     
     */
    public void setPROTOCOLLO(FieldInt value) {
        this.protocollo = value;
    }

    /**
     * Gets the value of the moduli property.
     * 
     * @return
     *     possible object is
     *     {@link FieldInt }
     *     
     */
    public FieldInt getMODULI() {
        return moduli;
    }

    /**
     * Sets the value of the moduli property.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldInt }
     *     
     */
    public void setMODULI(FieldInt value) {
        this.moduli = value;
    }

    /**
     * Gets the value of the dominio property.
     * 
     * @return
     *     possible object is
     *     {@link FieldString }
     *     
     */
    public FieldString getDOMINIO() {
        return dominio;
    }

    /**
     * Sets the value of the dominio property.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldString }
     *     
     */
    public void setDOMINIO(FieldString value) {
        this.dominio = value;
    }

    /**
     * Gets the value of the statoout property.
     * 
     * @return
     *     possible object is
     *     {@link FieldString }
     *     
     */
    public FieldString getSTATOOUT() {
        return statoout;
    }

    /**
     * Sets the value of the statoout property.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldString }
     *     
     */
    public void setSTATOOUT(FieldString value) {
        this.statoout = value;
    }

    /**
     * Gets the value of the testomail property.
     * 
     * @return
     *     possible object is
     *     {@link FieldString }
     *     
     */
    public FieldString getTESTOMAIL() {
        return testomail;
    }

    /**
     * Sets the value of the testomail property.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldString }
     *     
     */
    public void setTESTOMAIL(FieldString value) {
        this.testomail = value;
    }

    /**
     * Gets the value of the notifica property.
     * 
     * @return
     *     possible object is
     *     {@link FieldInt }
     *     
     */
    public FieldInt getNOTIFICA() {
        return notifica;
    }

    /**
     * Sets the value of the notifica property.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldInt }
     *     
     */
    public void setNOTIFICA(FieldInt value) {
        this.notifica = value;
    }

    /**
     * Gets the value of the clientposta property.
     * 
     * @return
     *     possible object is
     *     {@link FieldString }
     *     
     */
    public FieldString getCLIENTPOSTA() {
        return clientposta;
    }

    /**
     * Sets the value of the clientposta property.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldString }
     *     
     */
    public void setCLIENTPOSTA(FieldString value) {
        this.clientposta = value;
    }

    /**
     * Gets the value of the htmlbody property.
     * 
     * @return
     *     possible object is
     *     {@link FieldInt }
     *     
     */
    public FieldInt getHTMLBODY() {
        return htmlbody;
    }

    /**
     * Sets the value of the htmlbody property.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldInt }
     *     
     */
    public void setHTMLBODY(FieldInt value) {
        this.htmlbody = value;
    }

    /**
     * Gets the value of the respaos property.
     * 
     * @return
     *     possible object is
     *     {@link FieldInt }
     *     
     */
    public FieldInt getRESPAOS() {
        return respaos;
    }

    /**
     * Sets the value of the respaos property.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldInt }
     *     
     */
    public void setRESPAOS(FieldInt value) {
        this.respaos = value;
    }

    /**
     * Gets the value of the addaos property.
     * 
     * @return
     *     possible object is
     *     {@link FieldInt }
     *     
     */
    public FieldInt getADDAOS() {
        return addaos;
    }

    /**
     * Sets the value of the addaos property.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldInt }
     *     
     */
    public void setADDAOS(FieldInt value) {
        this.addaos = value;
    }

    /**
     * Gets the value of the codfis property.
     * 
     * @return
     *     possible object is
     *     {@link FieldString }
     *     
     */
    public FieldString getCODFIS() {
        return codfis;
    }

    /**
     * Sets the value of the codfis property.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldString }
     *     
     */
    public void setCODFIS(FieldString value) {
        this.codfis = value;
    }

    /**
     * Gets the value of the pin property.
     * 
     * @return
     *     possible object is
     *     {@link FieldString }
     *     
     */
    public FieldString getPIN() {
        return pin;
    }

    /**
     * Sets the value of the pin property.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldString }
     *     
     */
    public void setPIN(FieldString value) {
        this.pin = value;
    }

    /**
     * Gets the value of the guest property.
     * 
     * @return
     *     possible object is
     *     {@link FieldInt }
     *     
     */
    public FieldInt getGUEST() {
        return guest;
    }

    /**
     * Sets the value of the guest property.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldInt }
     *     
     */
    public void setGUEST(FieldInt value) {
        this.guest = value;
    }

    /**
     * Gets the value of the cambiopassword property.
     * 
     * @return
     *     possible object is
     *     {@link FieldInt }
     *     
     */
    public FieldInt getCAMBIOPASSWORD() {
        return cambiopassword;
    }

    /**
     * Sets the value of the cambiopassword property.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldInt }
     *     
     */
    public void setCAMBIOPASSWORD(FieldInt value) {
        this.cambiopassword = value;
    }

    /**
     * Gets the value of the tipo property.
     * 
     * @return
     *     possible object is
     *     {@link FieldInt }
     *     
     */
    public FieldInt getTIPO() {
        return tipo;
    }

    /**
     * Sets the value of the tipo property.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldInt }
     *     
     */
    public void setTIPO(FieldInt value) {
        this.tipo = value;
    }

    /**
     * Gets the value of the mailoutdefault property.
     * 
     * @return
     *     possible object is
     *     {@link FieldInt }
     *     
     */
    public FieldInt getMAILOUTDEFAULT() {
        return mailoutdefault;
    }

    /**
     * Sets the value of the mailoutdefault property.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldInt }
     *     
     */
    public void setMAILOUTDEFAULT(FieldInt value) {
        this.mailoutdefault = value;
    }

    /**
     * Gets the value of the accessobarcode property.
     * 
     * @return
     *     possible object is
     *     {@link FieldInt }
     *     
     */
    public FieldInt getACCESSOBARCODE() {
        return accessobarcode;
    }

    /**
     * Sets the value of the accessobarcode property.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldInt }
     *     
     */
    public void setACCESSOBARCODE(FieldInt value) {
        this.accessobarcode = value;
    }

}
