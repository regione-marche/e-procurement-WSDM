<table class="griglia">
	<tr class="intestazione">
		<th colspan="4">
			Descrizione delle operazioni disponibili nel&nbsp;<a href="./services/WSDM?wsdl" target="_blank">WSDL del servizio WSDM</a> (*)
		</th>    
	</tr>
	<tr class="intestazione">
		<th>Gruppo</th> 
		<th class="etichetta">Operazione</th>
		<th>Descrizione</th>
		<th>Disponibilit&agrave; per il <br>sistema remoto di protocollazione</th>
	</tr>
	<tr>
		<td rowspan="2">Protocollo</td>
		<td class="etichetta">WSDMProtocolloInserisci</td>
		<td>Inserimento nel protocollo</td>
		<td class="disp">Si</td>
	</tr>
	<tr>
		<td class="etichetta">WSDMProtocolloLeggi</td>
		<td>Lettura del protocollo</td>
		<td class="disp">Si</td>
	</tr>
	<tr>
		<td rowspan="3">Documento</td>
		<td class="etichetta">WSDMDocumentoInserisci</td>
		<td>Richiesta di inserimento di un elemento documentale (senza protocollazione)</td>
		<td class="disp">No</td>
	</tr>
	<tr>
		<td class="etichetta">WSDMDocumentoLeggi</td>
		<td>Lettura di un elemento documentale (protocollato o non protocollato)</td>
		<td class="disp">No</td>
	</tr>
	<tr>
		<td class="etichetta">WSDMDocumentoMetadatiLeggi</td>
		<td>Lettura dei metadati di un elemento documentale (protocollato o non protocollato)</td>
		<td class="disp">No</td>
	</tr>
	<tr>
		<td rowspan="3">Fascicolo</td>
		<td class="etichetta">WSDMFascicoloInserisci</td>
		<td>Inserimento di un nuovo fascicolo</td>
		<td class="disp">Si</td>
	</tr>
	<tr>
		<td class="etichetta">WSDMFascicoloAggiungiDocumento</td>
		<td>Aggiunta di un elemento documentale, protocollato o non protocollato, ad un fascicolo esistente</td>
		<td class="disp">No, disponibile contestualmente all'operazione di inserimento protocollo</td>
	</tr>
	<tr>
		<td class="etichetta">WSDMFascicoloLeggi</td>
		<td>Lettura del fascicolo e degli elementi documentali associati</td>
		<td class="disp">Si</td>
	</tr>
	<tr>
		<td rowspan="2">Atto/contratto</td>
		<td class="etichetta">WSDMAttoContrattoRicerca</td>
		<td>Ricerca degli atti e dei contratti</td>
		<td class="disp">No</td>
	</tr>
	<tr>
		<td class="etichetta">WSDMAttoContrattoLeggi</td>
		<td>Lettura dell'atto o del contratto e degli allegati associati</td>
		<td class="disp">No</td>
	</tr>
	<tr>
		<td rowspan="2">Mail</td>
		<td class="etichetta">WSDMInviaMail</td>
		<td>Invio mail</td>
		<td class="disp">No, disponibile contestualmente all'operazione di inserimento protocollo</td>
	</tr>	
	<tr>
		<td class="etichetta">WSDMVerificaMail</td>
		<td>Verifica mail inviata</td>
		<td class="disp">No</td>
	</tr>
	<tr>
		<td rowspan="3">Informazioni di configurazione</td>
		<td class="etichetta">WSDMProfili</td>
		<td>Lista dei profili associati all'utente connesso</td>
		<td class="disp">No</td>
	</tr>	
	<tr>
		<td class="etichetta">WSDMAmministrazioniAoo</td>
		<td>Lista delle amministrazioni/AOO</td>
		<td class="disp">No</td>
	</tr>
		<tr>
		<td class="etichetta">WSDMUffici</td>
		<td>Lista degli uffici</td>
		<td class="disp">No</td>
	</tr>	
</table>
