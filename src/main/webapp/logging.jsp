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
			
			TABLE.griglia {
				vertical-align: middle;
				margin-left: 10px;
				margin-right: 10px;
				margin-top: 10px;
				margin-bottom: 10px;
				padding: 0px;
				width: 900px;
				border-collapse: collapse;
				font: 11px Verdana, Arial, Helvetica, sans-serif;
			}
			
			TABLE.griglia TR {
				background-color: #FFFFFF;
			}

					
			TABLE.griglia TR TD {
				padding-left: 0px;
				padding-right: 0px;
				padding-top: 10px;
				padding-bottom: 10px;
				height: 25px;
				text-align: left;
			}
			
			span.message {
				margin-right: 10px;
				color: white;
				font-weight: bold;
				float: right;
				font: 10px Verdana, Arial, Helvetica, sans-serif;
				border: 1px solid #00C613;
				background-color: #00C613;
				padding: 2 2 2 2;
				-moz-border-radius-topleft: 2px; 
				-webkit-border-top-left-radius: 2px; 
				-khtml-border-top-left-radius: 2px; 
				border-top-left-radius: 2px; 
				-moz-border-radius-topright: 2px;
				-webkit-border-top-right-radius: 2px;
				-khtml-border-top-right-radius: 2px;
				border-top-right-radius: 2px;
				-moz-border-radius-bottomleft: 2px; 
				-webkit-border-bottom-left-radius: 2px; 
				-khtml-border-bottom-left-radius: 2px; 
				border-bottom-left-radius: 2px; 
				-moz-border-radius-bottomright: 42px;
				-webkit-border-bottom-right-radius: 2px;
				-khtml-border-bottom-right-radius: 2px;
				border-bottom-right-radius: 2px;
			}
			
			span.warning {
				margin-right: 10px;
				color: white;
				font-weight: bold;
				float: right;
				font: 10px Verdana, Arial, Helvetica, sans-serif;
				border: 1px solid #FFCC00;
				background-color: #FFCC00;
				padding: 2 2 2 2;
				-moz-border-radius-topleft: 2px; 
				-webkit-border-top-left-radius: 2px; 
				-khtml-border-top-left-radius: 2px; 
				border-top-left-radius: 2px; 
				-moz-border-radius-topright: 2px;
				-webkit-border-top-right-radius: 2px;
				-khtml-border-top-right-radius: 2px;
				border-top-right-radius: 2px;
				-moz-border-radius-bottomleft: 2px; 
				-webkit-border-bottom-left-radius: 2px; 
				-khtml-border-bottom-left-radius: 2px; 
				border-bottom-left-radius: 2px; 
				-moz-border-radius-bottomright: 42px;
				-webkit-border-bottom-right-radius: 2px;
				-khtml-border-bottom-right-radius: 2px;
				border-bottom-right-radius: 2px;
			}
			
			span.fault {
				margin-right: 10px;
				color: white;
				font-weight: bold;
				float: right;
				font: 10px Verdana, Arial, Helvetica, sans-serif;
				border: 1px solid #FF0000;
				background-color: #FF0000;
				padding: 2 2 2 2;
				-moz-border-radius-topleft: 2px; 
				-webkit-border-top-left-radius: 2px; 
				-khtml-border-top-left-radius: 2px; 
				border-top-left-radius: 2px; 
				-moz-border-radius-topright: 2px;
				-webkit-border-top-right-radius: 2px;
				-khtml-border-top-right-radius: 2px;
				border-top-right-radius: 2px;
				-moz-border-radius-bottomleft: 2px; 
				-webkit-border-bottom-left-radius: 2px; 
				-khtml-border-bottom-left-radius: 2px; 
				border-bottom-left-radius: 2px; 
				-moz-border-radius-bottomright: 42px;
				-webkit-border-bottom-right-radius: 2px;
				-khtml-border-bottom-right-radius: 2px;
				border-bottom-right-radius: 2px;
			}	
			
			div.msg {
				border-left: 2px solid #0034D3;
				background-color: #EFEFEF;
				padding: 10 0 10 10;
				margin-bottom: 5px;
				width: 900px;
			}	
			
			div.msg-error {
				border-left: 2px solid #C60000;
				background-color: #EFEFEF;
				color: #C60000;
				padding: 10 0 10 10;
				margin-bottom: 5px;
				width: 900px;
			}
		
		
		</style>
		<title>Eldasoft WSDM</title>
		
		
		<script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery-3.3.1.min.js"></script>
		
		<script type="text/javascript">
			var socket;
			function connect() {
				if ('WebSocket' in window){
					
					var _loc = $(location).attr('href');
					_loc = _loc.replace('https://','wss://');
					_loc = _loc.replace('http://','ws://');
					_loc = _loc.replace('logging.jsp?mode=all','websocketwsdm/all');
					_loc = _loc.replace('logging.jsp','websocketwsdm/all');
					
					var _url = _loc;
					
					socket = new WebSocket(_url);
					
					socket.onerror = function(evt) {
						var _d = $("<div/>", {"class": "msg-error"});
						_d.append("Collegamento con il server (" + _loc + ")... KO");
						$('#logging').append(_d).append("<br>");
						window.scrollTo(0,document.body.scrollHeight);
					}
					
					socket.onopen = function() {
						var _d = $("<div/>", {"class": "msg"});
						_d.append("Collegamento con il server (" + _loc + ")... OK");
						_d.append("<br>");
						_d.append("Inizializzazione della tracciatura dei messaggi... OK");
						$('#logging').append(_d);
						window.scrollTo(0,document.body.scrollHeight);
					}
					
					socket.onclose = function() {
						setTimeout(function(){connect();}, 5000);
					}
					
					socket.onmessage = function (evt) {
						
						var _n = $("#logging div").length;
						var _nmax = $("#numeromassimomessaggi").val();
						var _ntot = $("#numeromessaggitotali").text();
						
						_ntot++;
						
						$("#numeromessaggitotali").text(_ntot);
						

						if (_n > _nmax) {
							$("#logging div:lt(-" + _nmax + ")").remove();
						}
						
						var received_msg = evt.data;
						var _d = $("<div/>", {"class": "msg"});
						
						var _inm = received_msg.indexOf("Inbound Message");
						var _inf = received_msg.indexOf("Inbound Fault");
						var _outm = received_msg.indexOf("Outbound Message");
						var _outf = received_msg.indexOf("Outbound Fault");
						var _thr = received_msg.indexOf("THROWABLE:");
						

						
						if (_inm >=0) {
							var _span = $("<span/>",{"class":"message"});
							_span.append("INBOUND MESSAGE");
							_d.append(_span);
						}
						
						if (_inf >=0) {
							var _span = $("<span/>",{"class":"fault"});
							_span.append("INBOUND FAULT");
							_d.append(_span);
						}
						
						if (_outm >=0) {
							var _span = $("<span/>",{"class":"message"});
							_span.append("OUTBOUND MESSAGE");
							_d.append(_span);
						}
						
						if (_outf >=0) {
							var _span = $("<span/>",{"class":"fault"});
							_span.append("OUTBOUND FAULT");
							_d.append(_span);
						}

						if (_thr >=0) {
							var _span = $("<span/>",{"class":"fault"});
							_span.append("THROWABLE");
							_d.append(_span);
						}
						
						_d.append(document.createTextNode(received_msg));
						_d.append("<br>");
						$('#logging').append(_d);
						
						
						window.scrollTo(0,document.body.scrollHeight);

				  	}
				} 
			}
			
			function disconnect () {
				socket.close();
			}
		   
		    setTimeout(function(){connect();}, 1000);
	
		</script>
		
		
	</head>
 <body>
  

  
<%@ page import="javax.naming.Context" %>
<%@ page import="javax.naming.InitialContext" %>
	<table class="griglia">
		<tr>
			<td>
				<div id="logging" style="width:100%; font-size: 11px; white-space: pre-wrap; word-wrap: break-word;"></div>
			</td>
		</tr>
		
		<tr>
			<td>
				<div class="msg">
					Numero messaggi totali: <span id="numeromessaggitotali">0</span>
					<br>
					<br>
					Visualizzare gli ultimi&nbsp; 
					<select id="numeromassimomessaggi">
						<option value="1000">1000</option>
						<option value="2000">2000</option>
						<option value="4000">4000</option>	
					</select>
					&nbsp;messaggi
				</div>
			</td>
		</tr>
	</table>
  </body>
</html>
