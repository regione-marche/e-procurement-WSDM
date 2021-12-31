
package it.abletech.arxivar.login;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for Dm_Utenti complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Dm_Utenti">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.Abletech.it/Arxivar}Dm_UtentiBase">
 *       &lt;sequence>
 *         &lt;element name="PASSWORD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PASSWORDNEW" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TIPODEFAULT" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="TIPO2" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="TIPO3" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="INTERNOFAX" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LASTMAIL" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="WORKFLOW" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="STATODEFAULT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RUBRICA" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="SERVERPOSTA" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ACCESSOWEB" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="UPLOAD" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="FASCICOLI" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="FLOW" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="SIGN" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="WS" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="VIEWER" type="{http://www.Abletech.it/Arxivar}Tipo_Licenza"/>
 *         &lt;element name="PROTOCOLLO" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="MODULI" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="DOMINIO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="STATOOUT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TESTOMAIL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NOTIFICA" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="CLIENTPOSTA" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="HTMLBODY" type="{http://www.Abletech.it/Arxivar}Dm_Utenti_Htmlbody"/>
 *         &lt;element name="ADDAOS" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="CODFIS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PIN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="GUEST" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="CAMBIOPASSWORD" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="MARCATURA" type="{http://www.w3.org/2001/XMLSchema}base64Binary" minOccurs="0"/>
 *         &lt;element name="TIPO" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="MAILOUTDEFAULT" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="ACCESSOBARCODE" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="PROFILEDEFAULT_ID" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Dm_Utenti", propOrder = {
    "password",
    "passwordnew",
    "tipodefault",
    "tipo2",
    "tipo3",
    "internofax",
    "lastmail",
    "workflow",
    "statodefault",
    "rubrica",
    "serverposta",
    "accessoweb",
    "upload",
    "fascicoli",
    "flow",
    "sign",
    "ws",
    "viewer",
    "protocollo",
    "moduli",
    "dominio",
    "statoout",
    "testomail",
    "notifica",
    "clientposta",
    "htmlbody",
    "addaos",
    "codfis",
    "pin",
    "guest",
    "cambiopassword",
    "marcatura",
    "tipo",
    "mailoutdefault",
    "accessobarcode",
    "profiledefaultid"
})
public class DmUtenti
    extends DmUtentiBase
{

    @XmlElement(name = "PASSWORD")
    protected String password;
    @XmlElement(name = "PASSWORDNEW")
    protected String passwordnew;
    @XmlElement(name = "TIPODEFAULT")
    protected int tipodefault;
    @XmlElement(name = "TIPO2")
    protected int tipo2;
    @XmlElement(name = "TIPO3")
    protected int tipo3;
    @XmlElement(name = "INTERNOFAX")
    protected String internofax;
    @XmlElement(name = "LASTMAIL", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar lastmail;
    @XmlElement(name = "WORKFLOW")
    protected boolean workflow;
    @XmlElement(name = "STATODEFAULT")
    protected String statodefault;
    @XmlElement(name = "RUBRICA")
    protected boolean rubrica;
    @XmlElement(name = "SERVERPOSTA")
    protected String serverposta;
    @XmlElement(name = "ACCESSOWEB")
    protected boolean accessoweb;
    @XmlElement(name = "UPLOAD")
    protected boolean upload;
    @XmlElement(name = "FASCICOLI")
    protected boolean fascicoli;
    @XmlElement(name = "FLOW")
    protected boolean flow;
    @XmlElement(name = "SIGN")
    protected boolean sign;
    @XmlElement(name = "WS")
    protected boolean ws;
    @XmlElement(name = "VIEWER", required = true)
    protected TipoLicenza viewer;
    @XmlElement(name = "PROTOCOLLO")
    protected boolean protocollo;
    @XmlElement(name = "MODULI")
    protected boolean moduli;
    @XmlElement(name = "DOMINIO")
    protected String dominio;
    @XmlElement(name = "STATOOUT")
    protected String statoout;
    @XmlElement(name = "TESTOMAIL")
    protected String testomail;
    @XmlElement(name = "NOTIFICA")
    protected boolean notifica;
    @XmlElement(name = "CLIENTPOSTA")
    protected String clientposta;
    @XmlElement(name = "HTMLBODY", required = true)
    protected DmUtentiHtmlbody htmlbody;
    @XmlElement(name = "ADDAOS")
    protected boolean addaos;
    @XmlElement(name = "CODFIS")
    protected String codfis;
    @XmlElement(name = "PIN")
    protected String pin;
    @XmlElement(name = "GUEST")
    protected boolean guest;
    @XmlElement(name = "CAMBIOPASSWORD")
    protected boolean cambiopassword;
    @XmlElement(name = "MARCATURA")
    protected byte[] marcatura;
    @XmlElement(name = "TIPO")
    protected int tipo;
    @XmlElement(name = "MAILOUTDEFAULT")
    protected boolean mailoutdefault;
    @XmlElement(name = "ACCESSOBARCODE")
    protected boolean accessobarcode;
    @XmlElement(name = "PROFILEDEFAULT_ID", required = true, type = Integer.class, nillable = true)
    protected Integer profiledefaultid;

    /**
     * Gets the value of the password property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPASSWORD() {
        return password;
    }

    /**
     * Sets the value of the password property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPASSWORD(String value) {
        this.password = value;
    }

    /**
     * Gets the value of the passwordnew property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPASSWORDNEW() {
        return passwordnew;
    }

    /**
     * Sets the value of the passwordnew property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPASSWORDNEW(String value) {
        this.passwordnew = value;
    }

    /**
     * Gets the value of the tipodefault property.
     * 
     */
    public int getTIPODEFAULT() {
        return tipodefault;
    }

    /**
     * Sets the value of the tipodefault property.
     * 
     */
    public void setTIPODEFAULT(int value) {
        this.tipodefault = value;
    }

    /**
     * Gets the value of the tipo2 property.
     * 
     */
    public int getTIPO2() {
        return tipo2;
    }

    /**
     * Sets the value of the tipo2 property.
     * 
     */
    public void setTIPO2(int value) {
        this.tipo2 = value;
    }

    /**
     * Gets the value of the tipo3 property.
     * 
     */
    public int getTIPO3() {
        return tipo3;
    }

    /**
     * Sets the value of the tipo3 property.
     * 
     */
    public void setTIPO3(int value) {
        this.tipo3 = value;
    }

    /**
     * Gets the value of the internofax property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getINTERNOFAX() {
        return internofax;
    }

    /**
     * Sets the value of the internofax property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setINTERNOFAX(String value) {
        this.internofax = value;
    }

    /**
     * Gets the value of the lastmail property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLASTMAIL() {
        return lastmail;
    }

    /**
     * Sets the value of the lastmail property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLASTMAIL(XMLGregorianCalendar value) {
        this.lastmail = value;
    }

    /**
     * Gets the value of the workflow property.
     * 
     */
    public boolean isWORKFLOW() {
        return workflow;
    }

    /**
     * Sets the value of the workflow property.
     * 
     */
    public void setWORKFLOW(boolean value) {
        this.workflow = value;
    }

    /**
     * Gets the value of the statodefault property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSTATODEFAULT() {
        return statodefault;
    }

    /**
     * Sets the value of the statodefault property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSTATODEFAULT(String value) {
        this.statodefault = value;
    }

    /**
     * Gets the value of the rubrica property.
     * 
     */
    public boolean isRUBRICA() {
        return rubrica;
    }

    /**
     * Sets the value of the rubrica property.
     * 
     */
    public void setRUBRICA(boolean value) {
        this.rubrica = value;
    }

    /**
     * Gets the value of the serverposta property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSERVERPOSTA() {
        return serverposta;
    }

    /**
     * Sets the value of the serverposta property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSERVERPOSTA(String value) {
        this.serverposta = value;
    }

    /**
     * Gets the value of the accessoweb property.
     * 
     */
    public boolean isACCESSOWEB() {
        return accessoweb;
    }

    /**
     * Sets the value of the accessoweb property.
     * 
     */
    public void setACCESSOWEB(boolean value) {
        this.accessoweb = value;
    }

    /**
     * Gets the value of the upload property.
     * 
     */
    public boolean isUPLOAD() {
        return upload;
    }

    /**
     * Sets the value of the upload property.
     * 
     */
    public void setUPLOAD(boolean value) {
        this.upload = value;
    }

    /**
     * Gets the value of the fascicoli property.
     * 
     */
    public boolean isFASCICOLI() {
        return fascicoli;
    }

    /**
     * Sets the value of the fascicoli property.
     * 
     */
    public void setFASCICOLI(boolean value) {
        this.fascicoli = value;
    }

    /**
     * Gets the value of the flow property.
     * 
     */
    public boolean isFLOW() {
        return flow;
    }

    /**
     * Sets the value of the flow property.
     * 
     */
    public void setFLOW(boolean value) {
        this.flow = value;
    }

    /**
     * Gets the value of the sign property.
     * 
     */
    public boolean isSIGN() {
        return sign;
    }

    /**
     * Sets the value of the sign property.
     * 
     */
    public void setSIGN(boolean value) {
        this.sign = value;
    }

    /**
     * Gets the value of the ws property.
     * 
     */
    public boolean isWS() {
        return ws;
    }

    /**
     * Sets the value of the ws property.
     * 
     */
    public void setWS(boolean value) {
        this.ws = value;
    }

    /**
     * Gets the value of the viewer property.
     * 
     * @return
     *     possible object is
     *     {@link TipoLicenza }
     *     
     */
    public TipoLicenza getVIEWER() {
        return viewer;
    }

    /**
     * Sets the value of the viewer property.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoLicenza }
     *     
     */
    public void setVIEWER(TipoLicenza value) {
        this.viewer = value;
    }

    /**
     * Gets the value of the protocollo property.
     * 
     */
    public boolean isPROTOCOLLO() {
        return protocollo;
    }

    /**
     * Sets the value of the protocollo property.
     * 
     */
    public void setPROTOCOLLO(boolean value) {
        this.protocollo = value;
    }

    /**
     * Gets the value of the moduli property.
     * 
     */
    public boolean isMODULI() {
        return moduli;
    }

    /**
     * Sets the value of the moduli property.
     * 
     */
    public void setMODULI(boolean value) {
        this.moduli = value;
    }

    /**
     * Gets the value of the dominio property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDOMINIO() {
        return dominio;
    }

    /**
     * Sets the value of the dominio property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDOMINIO(String value) {
        this.dominio = value;
    }

    /**
     * Gets the value of the statoout property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSTATOOUT() {
        return statoout;
    }

    /**
     * Sets the value of the statoout property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSTATOOUT(String value) {
        this.statoout = value;
    }

    /**
     * Gets the value of the testomail property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTESTOMAIL() {
        return testomail;
    }

    /**
     * Sets the value of the testomail property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTESTOMAIL(String value) {
        this.testomail = value;
    }

    /**
     * Gets the value of the notifica property.
     * 
     */
    public boolean isNOTIFICA() {
        return notifica;
    }

    /**
     * Sets the value of the notifica property.
     * 
     */
    public void setNOTIFICA(boolean value) {
        this.notifica = value;
    }

    /**
     * Gets the value of the clientposta property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCLIENTPOSTA() {
        return clientposta;
    }

    /**
     * Sets the value of the clientposta property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCLIENTPOSTA(String value) {
        this.clientposta = value;
    }

    /**
     * Gets the value of the htmlbody property.
     * 
     * @return
     *     possible object is
     *     {@link DmUtentiHtmlbody }
     *     
     */
    public DmUtentiHtmlbody getHTMLBODY() {
        return htmlbody;
    }

    /**
     * Sets the value of the htmlbody property.
     * 
     * @param value
     *     allowed object is
     *     {@link DmUtentiHtmlbody }
     *     
     */
    public void setHTMLBODY(DmUtentiHtmlbody value) {
        this.htmlbody = value;
    }

    /**
     * Gets the value of the addaos property.
     * 
     */
    public boolean isADDAOS() {
        return addaos;
    }

    /**
     * Sets the value of the addaos property.
     * 
     */
    public void setADDAOS(boolean value) {
        this.addaos = value;
    }

    /**
     * Gets the value of the codfis property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCODFIS() {
        return codfis;
    }

    /**
     * Sets the value of the codfis property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCODFIS(String value) {
        this.codfis = value;
    }

    /**
     * Gets the value of the pin property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPIN() {
        return pin;
    }

    /**
     * Sets the value of the pin property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPIN(String value) {
        this.pin = value;
    }

    /**
     * Gets the value of the guest property.
     * 
     */
    public boolean isGUEST() {
        return guest;
    }

    /**
     * Sets the value of the guest property.
     * 
     */
    public void setGUEST(boolean value) {
        this.guest = value;
    }

    /**
     * Gets the value of the cambiopassword property.
     * 
     */
    public boolean isCAMBIOPASSWORD() {
        return cambiopassword;
    }

    /**
     * Sets the value of the cambiopassword property.
     * 
     */
    public void setCAMBIOPASSWORD(boolean value) {
        this.cambiopassword = value;
    }

    /**
     * Gets the value of the marcatura property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getMARCATURA() {
        return marcatura;
    }

    /**
     * Sets the value of the marcatura property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setMARCATURA(byte[] value) {
        this.marcatura = ((byte[]) value);
    }

    /**
     * Gets the value of the tipo property.
     * 
     */
    public int getTIPO() {
        return tipo;
    }

    /**
     * Sets the value of the tipo property.
     * 
     */
    public void setTIPO(int value) {
        this.tipo = value;
    }

    /**
     * Gets the value of the mailoutdefault property.
     * 
     */
    public boolean isMAILOUTDEFAULT() {
        return mailoutdefault;
    }

    /**
     * Sets the value of the mailoutdefault property.
     * 
     */
    public void setMAILOUTDEFAULT(boolean value) {
        this.mailoutdefault = value;
    }

    /**
     * Gets the value of the accessobarcode property.
     * 
     */
    public boolean isACCESSOBARCODE() {
        return accessobarcode;
    }

    /**
     * Sets the value of the accessobarcode property.
     * 
     */
    public void setACCESSOBARCODE(boolean value) {
        this.accessobarcode = value;
    }

    /**
     * Gets the value of the profiledefaultid property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPROFILEDEFAULTID() {
        return profiledefaultid;
    }

    /**
     * Sets the value of the profiledefaultid property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPROFILEDEFAULTID(Integer value) {
        this.profiledefaultid = value;
    }

}
