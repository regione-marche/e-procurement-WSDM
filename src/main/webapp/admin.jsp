<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<html lang="it">
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
  
 <body>
	<jsp:include page="parameter.jsp"></jsp:include> 
	<jsp:include page="loglink.jsp"></jsp:include>
	<jsp:include page="tab.jsp"></jsp:include> 
 	<jsp:include page="footer.jsp"></jsp:include>
 </body>
</html>
