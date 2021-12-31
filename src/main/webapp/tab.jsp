<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<html>
	<head>
		<style type="text/css">
			body {
				background: #FFFFFF;
				color: #000000;
				margin: 0px;
			}
			
			TABLE.contenitore {
				vertical-align: middle;
				margin-left: 10px;
				margin-right: 10px;
				margin-top: 10px;
				margin-bottom: 10px;
				padding: 0px;
				border-collapse: collapse;
				width: 95%;
				font: 11px Verdana, Arial, Helvetica, sans-serif;
			}
			
			TABLE.contenitore TR {
				background-color: #FFFFFF;
			}
							
			TABLE.contenitore TR.titolo {
				padding: 5 2 5 2;
				text-align: center;
				height: 40px;
			}

			TABLE.contenitore TR.titolo TD {
				font: 16px Verdana, Arial, Helvetica, sans-serif;
				font-weight: bold;
			}
			
			TABLE.griglia {
				vertical-align: middle;
				margin-left: 0px;
				margin-right: 0px;
				margin-top: 10px;
				margin-bottom: 10px;
				padding: 0px;
				width: 100%;
				border-collapse: collapse;
				font: 11px Verdana, Arial, Helvetica, sans-serif;
			}
			
			TABLE.griglia TR {
				background-color: #FFFFFF;
			}
			
			TABLE.griglia TR.intestazione {
				background-color: #EFEFEF;
			}
			
			TABLE.griglia TR.intestazione TH {
				padding: 5 2 5 2;
				text-align: center;
				border: 1px solid #A0AABA;	
				height: 40px;
				font-weight: bold;
			}
			
			TABLE.griglia TR.intestazione TH.etichetta {
				width: 350px;
			}
					
			TABLE.griglia TR TD {
				padding-left: 5px;
				padding-right: 5px;
				padding-top: 2px;
				padding-bottom: 2px;
				height: 25px;
				text-align: left;
				border: 1px solid #A0AABA;
			}
			
			TABLE.griglia TR TD.disp {
				text-align: center;
				width: 200px;
			}
			
			TABLE.griglia TR TD.etichetta {
				width: 350px;
			}

			TABLE.griglia TR TD.etichettadx {
				width: 350px;
				text-align: right;
			}
			
			a.link-generico{
				text-decoration: underline;
				color: #000000;
				font: 11px Verdana, Arial, Helvetica, sans-serif;
			}
		
		</style>
		<title>Eldasoft WSDM</title>
	</head>
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
		<td> 
			<table class="griglia">	
				<tr class="intestazione">
					<th>Configurazione (tabellato)</th>
					<th>Valore</th>
				</tr>
				<%
				try {
				  Context ic = new InitialContext();
				  Object liv1 = ic.lookup("java:/comp/env/REMOTEWSDM");
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

