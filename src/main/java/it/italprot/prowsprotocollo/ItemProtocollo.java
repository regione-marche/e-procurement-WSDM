/**
 * ItemProtocollo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package it.italprot.prowsprotocollo;

public class ItemProtocollo  implements java.io.Serializable {
    private java.lang.String rowID;

    private java.lang.String annoProtocollo;

    private java.lang.String numeroProtocollo;

    private java.lang.String dataProtocollo;

    private java.lang.String segnatura;

    private java.lang.String oggetto;

    private it.italprot.prowsprotocollo.Nota[] note;

    private java.lang.String classificazione;

    private java.lang.String classificazione_Descrizione;

    private java.lang.String tipoProtocollo;

    private java.lang.String tipoProtocollo_Descrizione;

    private java.lang.String tipoDocumento;

    private java.lang.String descrTipoDocumento;

    private java.lang.String firmatario;

    private java.lang.String firmatario_Descrizione;

    private it.italprot.prowsprotocollo.MittenteDestinatario[] mittenti;

    private java.lang.String dataDocumento;

    private java.lang.String protocolloMittente;

    private java.lang.String dataEvidenza;

    private java.lang.String documentoRiservato;

    private java.lang.String dataDiCarico;

    private java.lang.String utenteDiInserimento;

    private java.lang.String dataInserimento;

    private java.lang.String messaggio;

    private it.italprot.prowsprotocollo.Allegato[] allegati;

    private java.lang.String numeroProtocolloAntecedente;

    private java.lang.String annoProtocolloAntecedente;

    private java.lang.String codiceFascicolo;

    private java.lang.String tipoProtocolloAntecedente;

    private it.italprot.prowsprotocollo.MittenteDestinatario[] destinatari;

    private it.italprot.prowsprotocollo.Trasmissione[] trasmissioniInterne;

    private java.lang.String statoConservazione;

    private java.lang.String dataConservazione;

    public ItemProtocollo() {
    }

    public ItemProtocollo(
           java.lang.String rowID,
           java.lang.String annoProtocollo,
           java.lang.String numeroProtocollo,
           java.lang.String dataProtocollo,
           java.lang.String segnatura,
           java.lang.String oggetto,
           it.italprot.prowsprotocollo.Nota[] note,
           java.lang.String classificazione,
           java.lang.String classificazione_Descrizione,
           java.lang.String tipoProtocollo,
           java.lang.String tipoProtocollo_Descrizione,
           java.lang.String tipoDocumento,
           java.lang.String descrTipoDocumento,
           java.lang.String firmatario,
           java.lang.String firmatario_Descrizione,
           it.italprot.prowsprotocollo.MittenteDestinatario[] mittenti,
           java.lang.String dataDocumento,
           java.lang.String protocolloMittente,
           java.lang.String dataEvidenza,
           java.lang.String documentoRiservato,
           java.lang.String dataDiCarico,
           java.lang.String utenteDiInserimento,
           java.lang.String dataInserimento,
           java.lang.String messaggio,
           it.italprot.prowsprotocollo.Allegato[] allegati,
           java.lang.String numeroProtocolloAntecedente,
           java.lang.String annoProtocolloAntecedente,
           java.lang.String codiceFascicolo,
           java.lang.String tipoProtocolloAntecedente,
           it.italprot.prowsprotocollo.MittenteDestinatario[] destinatari,
           it.italprot.prowsprotocollo.Trasmissione[] trasmissioniInterne,
           java.lang.String statoConservazione,
           java.lang.String dataConservazione) {
           this.rowID = rowID;
           this.annoProtocollo = annoProtocollo;
           this.numeroProtocollo = numeroProtocollo;
           this.dataProtocollo = dataProtocollo;
           this.segnatura = segnatura;
           this.oggetto = oggetto;
           this.note = note;
           this.classificazione = classificazione;
           this.classificazione_Descrizione = classificazione_Descrizione;
           this.tipoProtocollo = tipoProtocollo;
           this.tipoProtocollo_Descrizione = tipoProtocollo_Descrizione;
           this.tipoDocumento = tipoDocumento;
           this.descrTipoDocumento = descrTipoDocumento;
           this.firmatario = firmatario;
           this.firmatario_Descrizione = firmatario_Descrizione;
           this.mittenti = mittenti;
           this.dataDocumento = dataDocumento;
           this.protocolloMittente = protocolloMittente;
           this.dataEvidenza = dataEvidenza;
           this.documentoRiservato = documentoRiservato;
           this.dataDiCarico = dataDiCarico;
           this.utenteDiInserimento = utenteDiInserimento;
           this.dataInserimento = dataInserimento;
           this.messaggio = messaggio;
           this.allegati = allegati;
           this.numeroProtocolloAntecedente = numeroProtocolloAntecedente;
           this.annoProtocolloAntecedente = annoProtocolloAntecedente;
           this.codiceFascicolo = codiceFascicolo;
           this.tipoProtocolloAntecedente = tipoProtocolloAntecedente;
           this.destinatari = destinatari;
           this.trasmissioniInterne = trasmissioniInterne;
           this.statoConservazione = statoConservazione;
           this.dataConservazione = dataConservazione;
    }


    /**
     * Gets the rowID value for this ItemProtocollo.
     * 
     * @return rowID
     */
    public java.lang.String getRowID() {
        return rowID;
    }


    /**
     * Sets the rowID value for this ItemProtocollo.
     * 
     * @param rowID
     */
    public void setRowID(java.lang.String rowID) {
        this.rowID = rowID;
    }


    /**
     * Gets the annoProtocollo value for this ItemProtocollo.
     * 
     * @return annoProtocollo
     */
    public java.lang.String getAnnoProtocollo() {
        return annoProtocollo;
    }


    /**
     * Sets the annoProtocollo value for this ItemProtocollo.
     * 
     * @param annoProtocollo
     */
    public void setAnnoProtocollo(java.lang.String annoProtocollo) {
        this.annoProtocollo = annoProtocollo;
    }


    /**
     * Gets the numeroProtocollo value for this ItemProtocollo.
     * 
     * @return numeroProtocollo
     */
    public java.lang.String getNumeroProtocollo() {
        return numeroProtocollo;
    }


    /**
     * Sets the numeroProtocollo value for this ItemProtocollo.
     * 
     * @param numeroProtocollo
     */
    public void setNumeroProtocollo(java.lang.String numeroProtocollo) {
        this.numeroProtocollo = numeroProtocollo;
    }


    /**
     * Gets the dataProtocollo value for this ItemProtocollo.
     * 
     * @return dataProtocollo
     */
    public java.lang.String getDataProtocollo() {
        return dataProtocollo;
    }


    /**
     * Sets the dataProtocollo value for this ItemProtocollo.
     * 
     * @param dataProtocollo
     */
    public void setDataProtocollo(java.lang.String dataProtocollo) {
        this.dataProtocollo = dataProtocollo;
    }


    /**
     * Gets the segnatura value for this ItemProtocollo.
     * 
     * @return segnatura
     */
    public java.lang.String getSegnatura() {
        return segnatura;
    }


    /**
     * Sets the segnatura value for this ItemProtocollo.
     * 
     * @param segnatura
     */
    public void setSegnatura(java.lang.String segnatura) {
        this.segnatura = segnatura;
    }


    /**
     * Gets the oggetto value for this ItemProtocollo.
     * 
     * @return oggetto
     */
    public java.lang.String getOggetto() {
        return oggetto;
    }


    /**
     * Sets the oggetto value for this ItemProtocollo.
     * 
     * @param oggetto
     */
    public void setOggetto(java.lang.String oggetto) {
        this.oggetto = oggetto;
    }


    /**
     * Gets the note value for this ItemProtocollo.
     * 
     * @return note
     */
    public it.italprot.prowsprotocollo.Nota[] getNote() {
        return note;
    }


    /**
     * Sets the note value for this ItemProtocollo.
     * 
     * @param note
     */
    public void setNote(it.italprot.prowsprotocollo.Nota[] note) {
        this.note = note;
    }


    /**
     * Gets the classificazione value for this ItemProtocollo.
     * 
     * @return classificazione
     */
    public java.lang.String getClassificazione() {
        return classificazione;
    }


    /**
     * Sets the classificazione value for this ItemProtocollo.
     * 
     * @param classificazione
     */
    public void setClassificazione(java.lang.String classificazione) {
        this.classificazione = classificazione;
    }


    /**
     * Gets the classificazione_Descrizione value for this ItemProtocollo.
     * 
     * @return classificazione_Descrizione
     */
    public java.lang.String getClassificazione_Descrizione() {
        return classificazione_Descrizione;
    }


    /**
     * Sets the classificazione_Descrizione value for this ItemProtocollo.
     * 
     * @param classificazione_Descrizione
     */
    public void setClassificazione_Descrizione(java.lang.String classificazione_Descrizione) {
        this.classificazione_Descrizione = classificazione_Descrizione;
    }


    /**
     * Gets the tipoProtocollo value for this ItemProtocollo.
     * 
     * @return tipoProtocollo
     */
    public java.lang.String getTipoProtocollo() {
        return tipoProtocollo;
    }


    /**
     * Sets the tipoProtocollo value for this ItemProtocollo.
     * 
     * @param tipoProtocollo
     */
    public void setTipoProtocollo(java.lang.String tipoProtocollo) {
        this.tipoProtocollo = tipoProtocollo;
    }


    /**
     * Gets the tipoProtocollo_Descrizione value for this ItemProtocollo.
     * 
     * @return tipoProtocollo_Descrizione
     */
    public java.lang.String getTipoProtocollo_Descrizione() {
        return tipoProtocollo_Descrizione;
    }


    /**
     * Sets the tipoProtocollo_Descrizione value for this ItemProtocollo.
     * 
     * @param tipoProtocollo_Descrizione
     */
    public void setTipoProtocollo_Descrizione(java.lang.String tipoProtocollo_Descrizione) {
        this.tipoProtocollo_Descrizione = tipoProtocollo_Descrizione;
    }


    /**
     * Gets the tipoDocumento value for this ItemProtocollo.
     * 
     * @return tipoDocumento
     */
    public java.lang.String getTipoDocumento() {
        return tipoDocumento;
    }


    /**
     * Sets the tipoDocumento value for this ItemProtocollo.
     * 
     * @param tipoDocumento
     */
    public void setTipoDocumento(java.lang.String tipoDocumento) {
        this.tipoDocumento = tipoDocumento;
    }


    /**
     * Gets the descrTipoDocumento value for this ItemProtocollo.
     * 
     * @return descrTipoDocumento
     */
    public java.lang.String getDescrTipoDocumento() {
        return descrTipoDocumento;
    }


    /**
     * Sets the descrTipoDocumento value for this ItemProtocollo.
     * 
     * @param descrTipoDocumento
     */
    public void setDescrTipoDocumento(java.lang.String descrTipoDocumento) {
        this.descrTipoDocumento = descrTipoDocumento;
    }


    /**
     * Gets the firmatario value for this ItemProtocollo.
     * 
     * @return firmatario
     */
    public java.lang.String getFirmatario() {
        return firmatario;
    }


    /**
     * Sets the firmatario value for this ItemProtocollo.
     * 
     * @param firmatario
     */
    public void setFirmatario(java.lang.String firmatario) {
        this.firmatario = firmatario;
    }


    /**
     * Gets the firmatario_Descrizione value for this ItemProtocollo.
     * 
     * @return firmatario_Descrizione
     */
    public java.lang.String getFirmatario_Descrizione() {
        return firmatario_Descrizione;
    }


    /**
     * Sets the firmatario_Descrizione value for this ItemProtocollo.
     * 
     * @param firmatario_Descrizione
     */
    public void setFirmatario_Descrizione(java.lang.String firmatario_Descrizione) {
        this.firmatario_Descrizione = firmatario_Descrizione;
    }


    /**
     * Gets the mittenti value for this ItemProtocollo.
     * 
     * @return mittenti
     */
    public it.italprot.prowsprotocollo.MittenteDestinatario[] getMittenti() {
        return mittenti;
    }


    /**
     * Sets the mittenti value for this ItemProtocollo.
     * 
     * @param mittenti
     */
    public void setMittenti(it.italprot.prowsprotocollo.MittenteDestinatario[] mittenti) {
        this.mittenti = mittenti;
    }


    /**
     * Gets the dataDocumento value for this ItemProtocollo.
     * 
     * @return dataDocumento
     */
    public java.lang.String getDataDocumento() {
        return dataDocumento;
    }


    /**
     * Sets the dataDocumento value for this ItemProtocollo.
     * 
     * @param dataDocumento
     */
    public void setDataDocumento(java.lang.String dataDocumento) {
        this.dataDocumento = dataDocumento;
    }


    /**
     * Gets the protocolloMittente value for this ItemProtocollo.
     * 
     * @return protocolloMittente
     */
    public java.lang.String getProtocolloMittente() {
        return protocolloMittente;
    }


    /**
     * Sets the protocolloMittente value for this ItemProtocollo.
     * 
     * @param protocolloMittente
     */
    public void setProtocolloMittente(java.lang.String protocolloMittente) {
        this.protocolloMittente = protocolloMittente;
    }


    /**
     * Gets the dataEvidenza value for this ItemProtocollo.
     * 
     * @return dataEvidenza
     */
    public java.lang.String getDataEvidenza() {
        return dataEvidenza;
    }


    /**
     * Sets the dataEvidenza value for this ItemProtocollo.
     * 
     * @param dataEvidenza
     */
    public void setDataEvidenza(java.lang.String dataEvidenza) {
        this.dataEvidenza = dataEvidenza;
    }


    /**
     * Gets the documentoRiservato value for this ItemProtocollo.
     * 
     * @return documentoRiservato
     */
    public java.lang.String getDocumentoRiservato() {
        return documentoRiservato;
    }


    /**
     * Sets the documentoRiservato value for this ItemProtocollo.
     * 
     * @param documentoRiservato
     */
    public void setDocumentoRiservato(java.lang.String documentoRiservato) {
        this.documentoRiservato = documentoRiservato;
    }


    /**
     * Gets the dataDiCarico value for this ItemProtocollo.
     * 
     * @return dataDiCarico
     */
    public java.lang.String getDataDiCarico() {
        return dataDiCarico;
    }


    /**
     * Sets the dataDiCarico value for this ItemProtocollo.
     * 
     * @param dataDiCarico
     */
    public void setDataDiCarico(java.lang.String dataDiCarico) {
        this.dataDiCarico = dataDiCarico;
    }


    /**
     * Gets the utenteDiInserimento value for this ItemProtocollo.
     * 
     * @return utenteDiInserimento
     */
    public java.lang.String getUtenteDiInserimento() {
        return utenteDiInserimento;
    }


    /**
     * Sets the utenteDiInserimento value for this ItemProtocollo.
     * 
     * @param utenteDiInserimento
     */
    public void setUtenteDiInserimento(java.lang.String utenteDiInserimento) {
        this.utenteDiInserimento = utenteDiInserimento;
    }


    /**
     * Gets the dataInserimento value for this ItemProtocollo.
     * 
     * @return dataInserimento
     */
    public java.lang.String getDataInserimento() {
        return dataInserimento;
    }


    /**
     * Sets the dataInserimento value for this ItemProtocollo.
     * 
     * @param dataInserimento
     */
    public void setDataInserimento(java.lang.String dataInserimento) {
        this.dataInserimento = dataInserimento;
    }


    /**
     * Gets the messaggio value for this ItemProtocollo.
     * 
     * @return messaggio
     */
    public java.lang.String getMessaggio() {
        return messaggio;
    }


    /**
     * Sets the messaggio value for this ItemProtocollo.
     * 
     * @param messaggio
     */
    public void setMessaggio(java.lang.String messaggio) {
        this.messaggio = messaggio;
    }


    /**
     * Gets the allegati value for this ItemProtocollo.
     * 
     * @return allegati
     */
    public it.italprot.prowsprotocollo.Allegato[] getAllegati() {
        return allegati;
    }


    /**
     * Sets the allegati value for this ItemProtocollo.
     * 
     * @param allegati
     */
    public void setAllegati(it.italprot.prowsprotocollo.Allegato[] allegati) {
        this.allegati = allegati;
    }


    /**
     * Gets the numeroProtocolloAntecedente value for this ItemProtocollo.
     * 
     * @return numeroProtocolloAntecedente
     */
    public java.lang.String getNumeroProtocolloAntecedente() {
        return numeroProtocolloAntecedente;
    }


    /**
     * Sets the numeroProtocolloAntecedente value for this ItemProtocollo.
     * 
     * @param numeroProtocolloAntecedente
     */
    public void setNumeroProtocolloAntecedente(java.lang.String numeroProtocolloAntecedente) {
        this.numeroProtocolloAntecedente = numeroProtocolloAntecedente;
    }


    /**
     * Gets the annoProtocolloAntecedente value for this ItemProtocollo.
     * 
     * @return annoProtocolloAntecedente
     */
    public java.lang.String getAnnoProtocolloAntecedente() {
        return annoProtocolloAntecedente;
    }


    /**
     * Sets the annoProtocolloAntecedente value for this ItemProtocollo.
     * 
     * @param annoProtocolloAntecedente
     */
    public void setAnnoProtocolloAntecedente(java.lang.String annoProtocolloAntecedente) {
        this.annoProtocolloAntecedente = annoProtocolloAntecedente;
    }


    /**
     * Gets the codiceFascicolo value for this ItemProtocollo.
     * 
     * @return codiceFascicolo
     */
    public java.lang.String getCodiceFascicolo() {
        return codiceFascicolo;
    }


    /**
     * Sets the codiceFascicolo value for this ItemProtocollo.
     * 
     * @param codiceFascicolo
     */
    public void setCodiceFascicolo(java.lang.String codiceFascicolo) {
        this.codiceFascicolo = codiceFascicolo;
    }


    /**
     * Gets the tipoProtocolloAntecedente value for this ItemProtocollo.
     * 
     * @return tipoProtocolloAntecedente
     */
    public java.lang.String getTipoProtocolloAntecedente() {
        return tipoProtocolloAntecedente;
    }


    /**
     * Sets the tipoProtocolloAntecedente value for this ItemProtocollo.
     * 
     * @param tipoProtocolloAntecedente
     */
    public void setTipoProtocolloAntecedente(java.lang.String tipoProtocolloAntecedente) {
        this.tipoProtocolloAntecedente = tipoProtocolloAntecedente;
    }


    /**
     * Gets the destinatari value for this ItemProtocollo.
     * 
     * @return destinatari
     */
    public it.italprot.prowsprotocollo.MittenteDestinatario[] getDestinatari() {
        return destinatari;
    }


    /**
     * Sets the destinatari value for this ItemProtocollo.
     * 
     * @param destinatari
     */
    public void setDestinatari(it.italprot.prowsprotocollo.MittenteDestinatario[] destinatari) {
        this.destinatari = destinatari;
    }


    /**
     * Gets the trasmissioniInterne value for this ItemProtocollo.
     * 
     * @return trasmissioniInterne
     */
    public it.italprot.prowsprotocollo.Trasmissione[] getTrasmissioniInterne() {
        return trasmissioniInterne;
    }


    /**
     * Sets the trasmissioniInterne value for this ItemProtocollo.
     * 
     * @param trasmissioniInterne
     */
    public void setTrasmissioniInterne(it.italprot.prowsprotocollo.Trasmissione[] trasmissioniInterne) {
        this.trasmissioniInterne = trasmissioniInterne;
    }


    /**
     * Gets the statoConservazione value for this ItemProtocollo.
     * 
     * @return statoConservazione
     */
    public java.lang.String getStatoConservazione() {
        return statoConservazione;
    }


    /**
     * Sets the statoConservazione value for this ItemProtocollo.
     * 
     * @param statoConservazione
     */
    public void setStatoConservazione(java.lang.String statoConservazione) {
        this.statoConservazione = statoConservazione;
    }


    /**
     * Gets the dataConservazione value for this ItemProtocollo.
     * 
     * @return dataConservazione
     */
    public java.lang.String getDataConservazione() {
        return dataConservazione;
    }


    /**
     * Sets the dataConservazione value for this ItemProtocollo.
     * 
     * @param dataConservazione
     */
    public void setDataConservazione(java.lang.String dataConservazione) {
        this.dataConservazione = dataConservazione;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ItemProtocollo)) return false;
        ItemProtocollo other = (ItemProtocollo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.rowID==null && other.getRowID()==null) || 
             (this.rowID!=null &&
              this.rowID.equals(other.getRowID()))) &&
            ((this.annoProtocollo==null && other.getAnnoProtocollo()==null) || 
             (this.annoProtocollo!=null &&
              this.annoProtocollo.equals(other.getAnnoProtocollo()))) &&
            ((this.numeroProtocollo==null && other.getNumeroProtocollo()==null) || 
             (this.numeroProtocollo!=null &&
              this.numeroProtocollo.equals(other.getNumeroProtocollo()))) &&
            ((this.dataProtocollo==null && other.getDataProtocollo()==null) || 
             (this.dataProtocollo!=null &&
              this.dataProtocollo.equals(other.getDataProtocollo()))) &&
            ((this.segnatura==null && other.getSegnatura()==null) || 
             (this.segnatura!=null &&
              this.segnatura.equals(other.getSegnatura()))) &&
            ((this.oggetto==null && other.getOggetto()==null) || 
             (this.oggetto!=null &&
              this.oggetto.equals(other.getOggetto()))) &&
            ((this.note==null && other.getNote()==null) || 
             (this.note!=null &&
              java.util.Arrays.equals(this.note, other.getNote()))) &&
            ((this.classificazione==null && other.getClassificazione()==null) || 
             (this.classificazione!=null &&
              this.classificazione.equals(other.getClassificazione()))) &&
            ((this.classificazione_Descrizione==null && other.getClassificazione_Descrizione()==null) || 
             (this.classificazione_Descrizione!=null &&
              this.classificazione_Descrizione.equals(other.getClassificazione_Descrizione()))) &&
            ((this.tipoProtocollo==null && other.getTipoProtocollo()==null) || 
             (this.tipoProtocollo!=null &&
              this.tipoProtocollo.equals(other.getTipoProtocollo()))) &&
            ((this.tipoProtocollo_Descrizione==null && other.getTipoProtocollo_Descrizione()==null) || 
             (this.tipoProtocollo_Descrizione!=null &&
              this.tipoProtocollo_Descrizione.equals(other.getTipoProtocollo_Descrizione()))) &&
            ((this.tipoDocumento==null && other.getTipoDocumento()==null) || 
             (this.tipoDocumento!=null &&
              this.tipoDocumento.equals(other.getTipoDocumento()))) &&
            ((this.descrTipoDocumento==null && other.getDescrTipoDocumento()==null) || 
             (this.descrTipoDocumento!=null &&
              this.descrTipoDocumento.equals(other.getDescrTipoDocumento()))) &&
            ((this.firmatario==null && other.getFirmatario()==null) || 
             (this.firmatario!=null &&
              this.firmatario.equals(other.getFirmatario()))) &&
            ((this.firmatario_Descrizione==null && other.getFirmatario_Descrizione()==null) || 
             (this.firmatario_Descrizione!=null &&
              this.firmatario_Descrizione.equals(other.getFirmatario_Descrizione()))) &&
            ((this.mittenti==null && other.getMittenti()==null) || 
             (this.mittenti!=null &&
              java.util.Arrays.equals(this.mittenti, other.getMittenti()))) &&
            ((this.dataDocumento==null && other.getDataDocumento()==null) || 
             (this.dataDocumento!=null &&
              this.dataDocumento.equals(other.getDataDocumento()))) &&
            ((this.protocolloMittente==null && other.getProtocolloMittente()==null) || 
             (this.protocolloMittente!=null &&
              this.protocolloMittente.equals(other.getProtocolloMittente()))) &&
            ((this.dataEvidenza==null && other.getDataEvidenza()==null) || 
             (this.dataEvidenza!=null &&
              this.dataEvidenza.equals(other.getDataEvidenza()))) &&
            ((this.documentoRiservato==null && other.getDocumentoRiservato()==null) || 
             (this.documentoRiservato!=null &&
              this.documentoRiservato.equals(other.getDocumentoRiservato()))) &&
            ((this.dataDiCarico==null && other.getDataDiCarico()==null) || 
             (this.dataDiCarico!=null &&
              this.dataDiCarico.equals(other.getDataDiCarico()))) &&
            ((this.utenteDiInserimento==null && other.getUtenteDiInserimento()==null) || 
             (this.utenteDiInserimento!=null &&
              this.utenteDiInserimento.equals(other.getUtenteDiInserimento()))) &&
            ((this.dataInserimento==null && other.getDataInserimento()==null) || 
             (this.dataInserimento!=null &&
              this.dataInserimento.equals(other.getDataInserimento()))) &&
            ((this.messaggio==null && other.getMessaggio()==null) || 
             (this.messaggio!=null &&
              this.messaggio.equals(other.getMessaggio()))) &&
            ((this.allegati==null && other.getAllegati()==null) || 
             (this.allegati!=null &&
              java.util.Arrays.equals(this.allegati, other.getAllegati()))) &&
            ((this.numeroProtocolloAntecedente==null && other.getNumeroProtocolloAntecedente()==null) || 
             (this.numeroProtocolloAntecedente!=null &&
              this.numeroProtocolloAntecedente.equals(other.getNumeroProtocolloAntecedente()))) &&
            ((this.annoProtocolloAntecedente==null && other.getAnnoProtocolloAntecedente()==null) || 
             (this.annoProtocolloAntecedente!=null &&
              this.annoProtocolloAntecedente.equals(other.getAnnoProtocolloAntecedente()))) &&
            ((this.codiceFascicolo==null && other.getCodiceFascicolo()==null) || 
             (this.codiceFascicolo!=null &&
              this.codiceFascicolo.equals(other.getCodiceFascicolo()))) &&
            ((this.tipoProtocolloAntecedente==null && other.getTipoProtocolloAntecedente()==null) || 
             (this.tipoProtocolloAntecedente!=null &&
              this.tipoProtocolloAntecedente.equals(other.getTipoProtocolloAntecedente()))) &&
            ((this.destinatari==null && other.getDestinatari()==null) || 
             (this.destinatari!=null &&
              java.util.Arrays.equals(this.destinatari, other.getDestinatari()))) &&
            ((this.trasmissioniInterne==null && other.getTrasmissioniInterne()==null) || 
             (this.trasmissioniInterne!=null &&
              java.util.Arrays.equals(this.trasmissioniInterne, other.getTrasmissioniInterne()))) &&
            ((this.statoConservazione==null && other.getStatoConservazione()==null) || 
             (this.statoConservazione!=null &&
              this.statoConservazione.equals(other.getStatoConservazione()))) &&
            ((this.dataConservazione==null && other.getDataConservazione()==null) || 
             (this.dataConservazione!=null &&
              this.dataConservazione.equals(other.getDataConservazione())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getRowID() != null) {
            _hashCode += getRowID().hashCode();
        }
        if (getAnnoProtocollo() != null) {
            _hashCode += getAnnoProtocollo().hashCode();
        }
        if (getNumeroProtocollo() != null) {
            _hashCode += getNumeroProtocollo().hashCode();
        }
        if (getDataProtocollo() != null) {
            _hashCode += getDataProtocollo().hashCode();
        }
        if (getSegnatura() != null) {
            _hashCode += getSegnatura().hashCode();
        }
        if (getOggetto() != null) {
            _hashCode += getOggetto().hashCode();
        }
        if (getNote() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getNote());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getNote(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getClassificazione() != null) {
            _hashCode += getClassificazione().hashCode();
        }
        if (getClassificazione_Descrizione() != null) {
            _hashCode += getClassificazione_Descrizione().hashCode();
        }
        if (getTipoProtocollo() != null) {
            _hashCode += getTipoProtocollo().hashCode();
        }
        if (getTipoProtocollo_Descrizione() != null) {
            _hashCode += getTipoProtocollo_Descrizione().hashCode();
        }
        if (getTipoDocumento() != null) {
            _hashCode += getTipoDocumento().hashCode();
        }
        if (getDescrTipoDocumento() != null) {
            _hashCode += getDescrTipoDocumento().hashCode();
        }
        if (getFirmatario() != null) {
            _hashCode += getFirmatario().hashCode();
        }
        if (getFirmatario_Descrizione() != null) {
            _hashCode += getFirmatario_Descrizione().hashCode();
        }
        if (getMittenti() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getMittenti());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getMittenti(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getDataDocumento() != null) {
            _hashCode += getDataDocumento().hashCode();
        }
        if (getProtocolloMittente() != null) {
            _hashCode += getProtocolloMittente().hashCode();
        }
        if (getDataEvidenza() != null) {
            _hashCode += getDataEvidenza().hashCode();
        }
        if (getDocumentoRiservato() != null) {
            _hashCode += getDocumentoRiservato().hashCode();
        }
        if (getDataDiCarico() != null) {
            _hashCode += getDataDiCarico().hashCode();
        }
        if (getUtenteDiInserimento() != null) {
            _hashCode += getUtenteDiInserimento().hashCode();
        }
        if (getDataInserimento() != null) {
            _hashCode += getDataInserimento().hashCode();
        }
        if (getMessaggio() != null) {
            _hashCode += getMessaggio().hashCode();
        }
        if (getAllegati() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAllegati());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAllegati(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getNumeroProtocolloAntecedente() != null) {
            _hashCode += getNumeroProtocolloAntecedente().hashCode();
        }
        if (getAnnoProtocolloAntecedente() != null) {
            _hashCode += getAnnoProtocolloAntecedente().hashCode();
        }
        if (getCodiceFascicolo() != null) {
            _hashCode += getCodiceFascicolo().hashCode();
        }
        if (getTipoProtocolloAntecedente() != null) {
            _hashCode += getTipoProtocolloAntecedente().hashCode();
        }
        if (getDestinatari() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDestinatari());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getDestinatari(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getTrasmissioniInterne() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getTrasmissioniInterne());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getTrasmissioniInterne(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getStatoConservazione() != null) {
            _hashCode += getStatoConservazione().hashCode();
        }
        if (getDataConservazione() != null) {
            _hashCode += getDataConservazione().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ItemProtocollo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:proWsProtocollo", "itemProtocollo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rowID");
        elemField.setXmlName(new javax.xml.namespace.QName("", "rowID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("annoProtocollo");
        elemField.setXmlName(new javax.xml.namespace.QName("", "annoProtocollo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numeroProtocollo");
        elemField.setXmlName(new javax.xml.namespace.QName("", "numeroProtocollo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dataProtocollo");
        elemField.setXmlName(new javax.xml.namespace.QName("", "dataProtocollo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("segnatura");
        elemField.setXmlName(new javax.xml.namespace.QName("", "segnatura"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("oggetto");
        elemField.setXmlName(new javax.xml.namespace.QName("", "oggetto"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("note");
        elemField.setXmlName(new javax.xml.namespace.QName("", "note"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:proWsProtocollo", "nota"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("classificazione");
        elemField.setXmlName(new javax.xml.namespace.QName("", "classificazione"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("classificazione_Descrizione");
        elemField.setXmlName(new javax.xml.namespace.QName("", "classificazione_Descrizione"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tipoProtocollo");
        elemField.setXmlName(new javax.xml.namespace.QName("", "tipoProtocollo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tipoProtocollo_Descrizione");
        elemField.setXmlName(new javax.xml.namespace.QName("", "tipoProtocollo_Descrizione"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tipoDocumento");
        elemField.setXmlName(new javax.xml.namespace.QName("", "tipoDocumento"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("descrTipoDocumento");
        elemField.setXmlName(new javax.xml.namespace.QName("", "descrTipoDocumento"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("firmatario");
        elemField.setXmlName(new javax.xml.namespace.QName("", "firmatario"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("firmatario_Descrizione");
        elemField.setXmlName(new javax.xml.namespace.QName("", "firmatario_Descrizione"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mittenti");
        elemField.setXmlName(new javax.xml.namespace.QName("", "mittenti"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:proWsProtocollo", "mittenteDestinatario"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dataDocumento");
        elemField.setXmlName(new javax.xml.namespace.QName("", "dataDocumento"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("protocolloMittente");
        elemField.setXmlName(new javax.xml.namespace.QName("", "protocolloMittente"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dataEvidenza");
        elemField.setXmlName(new javax.xml.namespace.QName("", "dataEvidenza"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("documentoRiservato");
        elemField.setXmlName(new javax.xml.namespace.QName("", "documentoRiservato"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dataDiCarico");
        elemField.setXmlName(new javax.xml.namespace.QName("", "dataDiCarico"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("utenteDiInserimento");
        elemField.setXmlName(new javax.xml.namespace.QName("", "utenteDiInserimento"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dataInserimento");
        elemField.setXmlName(new javax.xml.namespace.QName("", "dataInserimento"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("messaggio");
        elemField.setXmlName(new javax.xml.namespace.QName("", "messaggio"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("allegati");
        elemField.setXmlName(new javax.xml.namespace.QName("", "allegati"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:proWsProtocollo", "allegato"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numeroProtocolloAntecedente");
        elemField.setXmlName(new javax.xml.namespace.QName("", "numeroProtocolloAntecedente"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("annoProtocolloAntecedente");
        elemField.setXmlName(new javax.xml.namespace.QName("", "annoProtocolloAntecedente"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codiceFascicolo");
        elemField.setXmlName(new javax.xml.namespace.QName("", "codiceFascicolo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tipoProtocolloAntecedente");
        elemField.setXmlName(new javax.xml.namespace.QName("", "tipoProtocolloAntecedente"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("destinatari");
        elemField.setXmlName(new javax.xml.namespace.QName("", "destinatari"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:proWsProtocollo", "mittenteDestinatario"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("trasmissioniInterne");
        elemField.setXmlName(new javax.xml.namespace.QName("", "trasmissioniInterne"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:proWsProtocollo", "trasmissione"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("statoConservazione");
        elemField.setXmlName(new javax.xml.namespace.QName("", "statoConservazione"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dataConservazione");
        elemField.setXmlName(new javax.xml.namespace.QName("", "dataConservazione"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
