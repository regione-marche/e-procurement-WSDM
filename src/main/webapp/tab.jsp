<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<html lang="it">
<body>
  
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
		<th id="thtabellati"></th>
	</tr>
	<tr>
		<td> 
			<table class="griglia">	
				<tr class="intestazione">
					<th id="tabellato">Configurazione (tabellato)</th>
					<th id="valore">Valore</th>
				</tr>
				<%
				try {
				  Context ic = new InitialContext();
				  Object liv1 = ic.lookup("java:/comp/env/REMOTEWSDM");
				  if (liv1.equals("DATAGRAPH.PRISMA")) {
				    liv1 = "DATAGRAPH";				    
				  }
				  if (liv1.equals("FOLIUM2.FOLIUM")) {
				    liv1 = "FOLIUM2";				    
				  }
				  if (liv1.equals("INFOR2.INFOR")) {
				    liv1 = "INFOR2";				    
				  }
				  if (liv1.equals("ARCHIFLOW10") || liv1.equals("ARCHIFLOW10.ARCHIFLOW")) {
					  liv1 = "ARCHIFLOW";
				  }
				  NamingEnumeration<NameClassPair> listLiv2 = ic.list("java:comp/env/tab/" + liv1);
				  while (listLiv2.hasMore()) {
				  Object liv2 = listLiv2.next().getName();
					  NamingEnumeration<NameClassPair> listLiv3 = ic.list("java:comp/env/tab/" + liv1 + "/" + liv2);
					  %>
					  	<tr>
					  		<td colspan="2"><%=liv1%>/<%=liv2%></td>
					  	</tr>
					  <%
					  while (listLiv3.hasMore()) {
					  Object liv3 = listLiv3.next().getName();
					  Object liv3look = ic.lookup("java:comp/env/tab/" + liv1 + "/" + liv2 + "/" + liv3);
						  %>
						  	<tr>
						  		<td class="etichettadx"><%=liv3%></td>
						  		<td><%=liv3look%></td>
						  	</tr>	
						  <%
					  }
					}
				} catch (NamingException nex) {
				  
				}
				%>
				
			</table>
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
		<tr>
			<th id="therrore"></th>
		</tr>
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

