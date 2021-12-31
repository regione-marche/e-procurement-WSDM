<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

  
<%@page import="java.io.File"%>
<%@page import="java.io.InputStreamReader"%>
<%@page import="java.net.URL"%>
<%@page import="java.io.FileReader"%>
<%@page import="java.io.BufferedReader"%>
<%@page import="javax.naming.Context" %>
<%@page import="javax.naming.InitialContext" %>
<%@page import="javax.naming.NamingException" %>
<%@page import="javax.naming.NamingEnumeration" %>
<%@page import="javax.naming.NameClassPair" %>

<%
	try {
	Context initCtx = new InitialContext();
	Context ctx = (Context) initCtx.lookup("java:/comp/env");
	Object REMOTEWSDM = ctx.lookup("REMOTEWSDM");
%>
  
  	<c:set var="remotewsdm" value="<%=REMOTEWSDM%>" />

	<table class="contenitore">
		<tr>
			<td>
				<br><br>
				<c:choose>
					<c:when test="${remotewsdm eq 'IRIDE'}">
						<jsp:include page="iride.jsp"></jsp:include>
					</c:when>
					<c:when test="${remotewsdm eq 'JIRIDE'}">
						<jsp:include page="jiride.jsp"></jsp:include>
					</c:when>
					<c:when test="${remotewsdm eq 'PALEO'}">
						<jsp:include page="paleo.jsp"></jsp:include>		
					</c:when>
					<c:when test="${remotewsdm eq 'ENGINEERING'}">
						<jsp:include page="engineering.jsp"></jsp:include>		
					</c:when>
					<c:when test="${remotewsdm eq 'ENGINEERINGDOC'}">
						<jsp:include page="engineeringdoc.jsp"></jsp:include>		
					</c:when>
					<c:when test="${remotewsdm eq 'ARCHIFLOW'}">
						<jsp:include page="archiflow.jsp"></jsp:include>		
					</c:when>
					<c:when test="${ remotewsdm eq 'ARCHIFLOWFA'}">
						<jsp:include page="archiflowfa.jsp"></jsp:include>		
					</c:when>
					<c:when test="${remotewsdm eq 'TITULUS'}">
						<jsp:include page="titulus.jsp"></jsp:include>		
					</c:when>
					<c:when test="${remotewsdm eq 'SMAT'}">
						<jsp:include page="smat.jsp"></jsp:include>		
					</c:when>
					<c:when test="${remotewsdm eq 'FOLIUM'}">
						<jsp:include page="folium.jsp"></jsp:include>		
					</c:when>								
					<c:when test="${remotewsdm eq 'SISPI'}">
						<jsp:include page="sispi.jsp"></jsp:include>		
					</c:when>
					<c:when test="${remotewsdm eq 'EASYDOC'}">
						<jsp:include page="easydoc.jsp"></jsp:include>		
					</c:when>
					<c:when test="${remotewsdm eq 'PRISMA'}">
						<jsp:include page="prisma.jsp"></jsp:include>		
					</c:when>
				</c:choose>
							
				<i>(*) &Egrave; richiesta autenticazione mediante WS-Security</i>
				<br>
				<br>
			</td>
		</tr>
		<tr>
			<td>
				<br>
				<table class="griglia">
					<tr class="intestazione">
						<th colspan="6">
							Descrizione delle operazioni disponibili nel&nbsp;<a href="./services/WSDMConfigurazione?wsdl" target="_blank">WSDL del servizio WSDMConfigurazione</a> (**)
						</th>    
					</tr>
					<tr class="intestazione">
						<th class="etichetta">Operazione</th>
						<th>Descrizione</th>
					</tr>
					<tr>
						<td class="etichetta">WSDMConfigurazioneLeggi</td>
						<td>Lettura della configurazione del server (sistema remoto di protocollazione, tabellati...)</td>
					</tr>
				</table>
				<i>(**) Non &egrave; richiesta autenticazione</i>
				<br>
				<br>
			</td>
		</tr>
	</table>
<%
	}
	catch (NamingException ex) {
	  System.out.println(ex);	  
	  System.err.println(ex);
	  Object ERRORERILEVATO = ex;
%>	
	<table class="contenitore">
		<tr class="titolo">
			<td>
				Eldasoft WSDM
			</td>
		</tr>
		<tr>
			<td style="color: #FF2200">
				Si &egrave; verificato un errore nella lettura della configurazione: 
				<br>
				<b><%=ERRORERILEVATO%></b>
			</td>
		</tr>
	</table>
<%
	}
%>

