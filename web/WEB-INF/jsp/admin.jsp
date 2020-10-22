<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page isELIgnored="false" %> 
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Administrador - ApuExpress</title>
        <link rel="icon" href="images/logo.png">
        <link rel="stylesheet" href="css/material-icons.css">
        <link rel="stylesheet" type="text/css" href="css/main.css">
        <link rel="stylesheet" type="text/css" href="css/jquery-ui.min.css">
        <link rel="stylesheet" type="text/css" href="css/jquery-ui.structure.min.css">
        <link rel="stylesheet" type="text/css" href="css/jquery-ui.theme.min.css">
        <link rel="stylesheet" type="text/css" href="css/jquery-ui-timepicker-addon.css">
        <link rel="stylesheet" type="text/css" href="css/style.css">
        <script src="js/jquery-3.3.1.min.js"></script>
        <script src="js/jquery-ui.min.js"></script>
        <script src="js/main.js"></script> 
        <script src="js/jquery-ui-timepicker-addon.js"></script>
    </head>
    <body>
        <!-- TOP NAVEGATION BAR -->
        <%@ include file="/jspf/topnav.jspf" %>
        
        <!-- SIDEBAR -->
        <%@ include file="/jspf/sidebar.jspf" %>
        
        <div class="element-container">
            <div class="header">
                <span class="title">CREAR PARTIDO DE SOCCER</span><br><br>
                <form action="/ApuExpress/crear_partido.htm" method="POST">
                    <label for="crear-soccer-equipoA">Equipo A:</label>
                    <select id="crear-soccer-equipoA" style="margin-right:50px;" name="idEquipoA">
                        ${equiposSoccer}
                    </select>
                    <label for="crear-soccer-equipoB">Equipo B:</label>
                    <select id="crear-soccer-equipoB" name="idEquipoB">
                        ${equiposSoccer}
                    </select>
                    <br><br>
                    <label for="crear-soccer-multiplicadorA">Multiplicador A:</label>
                    <input type="text" id="crear-soccer-multiplicadorA" style="margin-right:50px;" 
                           name="multiplicadorA">
                    
                    <label for="crear-soccer-multiplicadorB">Multiplicador B:</label>
                    <input type="text" id="crear-soccer-multiplicadorB" name="multiplicadorB">
                    <br><br>
                    <label for="definir-fecha" style="margin-right: 105px;">Fecha:</label>
                    <label for="definir-horaIni" style="margin-right: 50px;">Hora de inicio:</label>
                    <label for="definir-horaFin">Hora de conclusión:</label>
                    <br>
                    <input type="text" id="definir-fecha" placeholder="YYYY/MM/DD" style="margin-right: 10px;" 
                           name="fecha">
                    <input type="text" id="definir-horaIni" placeholder="HH:mm:ss" style="margin-right: 10px;" 
                           name="horaInicio">
                    <input type="text" id="definir-horaFin" placeholder="HH:mm:ss" name="horaFin">
                    <br><br>
                    <input type="submit" id="crear-soccer" value="Crear partido" style="padding:10px 60px;">
                    <input style="display:none" value="1" name="idDeporte">
                </form>

            </div>
        </div>
        
        <div class="element-container">
            <div class="header">
                <span class="title">CREAR PARTIDO DE AMERICANO</span><br><br>
                <form action="/ApuExpress/crear_partido.htm" method="POST">
                    <label for="crear-americano-equipoA">Equipo A:</label>
                    <select id="crear-americano-equipoA" style="margin-right:50px;" name="idEquipoA">
                        ${equiposAmericano}
                    </select>
                    <label for="crear-americano-equipoB">Equipo B:</label>
                    <select id="crear-americano-equipoB" name="idEquipoB">
                        ${equiposAmericano}
                    </select>
                    <br><br>
                    <label for="crear-americano-multiplicadorA">Multiplicador A:</label>
                    <input type="text" id="crear-americano-multiplicadorA" style="margin-right:50px;" 
                           name="multiplicadorA">
                    
                    <label for="crear-americano-multiplicadorB">Multiplicador B:</label>
                    <input type="text" id="crear-americano-multiplicadorB" name="multiplicadorB">
                    <br><br>
                    <label for="definir-fecha" style="margin-right: 105px;">Fecha:</label>
                    <label for="definir-horaIni" style="margin-right: 50px;">Hora de inicio:</label>
                    <label for="definir-horaFin">Hora de conclusión:</label>
                    <br>
                    <input type="text" id="definir-fecha" placeholder="YYYY/MM/DD" style="margin-right: 10px;" 
                           name="fecha">
                    <input type="text" id="definir-horaIni" placeholder="HH:mm:ss" style="margin-right: 10px;" 
                           name="horaInicio">
                    <input type="text" id="definir-horaFin" placeholder="HH:mm:ss" name="horaFin">
                    <br><br>
                    <input type="submit" id="crear-americano" value="Crear partido" style="padding:10px 60px;">
                    <input style="display:none" value="2" name="idDeporte">
                </form>
            </div>
        </div>
        
        <div class="element-container">
            <div class="header">
                <span class="title">CREAR MATCH DE BOXEO</span><br><br>
                <form action="/ApuExpress/crear_partido.htm" method="POST">
                    <label for="crear-boxeo-equipoA">Boxeador A:</label>
                    <select id="crear-boxeo-equipoA" style="margin-right:50px;" name="idEquipoA">
                        ${boxeadores}
                    </select>
                    <label for="crear-boxeo-equipoB">Boxeador B:</label>
                    <select id="crear-boxeo-equipoB" name="idEquipoB">
                        ${boxeadores}
                    </select>
                    <br><br>
                    <label for="crear-boxeo-multiplicadorA">Multiplicador A:</label>
                    <input type="text" id="crear-boxeo-multiplicadorA" style="margin-right:50px;"
                           name="multiplicadorA">
                    
                    <label for="crear-boxeo-multiplicadorB">Multiplicador B:</label>
                    <input type="text" id="crear-boxeo-multiplicadorB" name="multiplicadorB">
                    <br><br>
                    <label for="definir-fecha" style="margin-right: 105px;">Fecha:</label>
                    <label for="definir-horaIni" style="margin-right: 50px;">Hora de inicio:</label>
                    <label for="definir-horaFin">Hora de conclusión:</label>
                    <br>
                    <input type="text" id="definir-fecha" placeholder="YYYY/MM/DD" style="margin-right: 10px;" 
                           name="fecha">
                    <input type="text" id="definir-horaIni" placeholder="HH:mm:ss" style="margin-right: 10px;"
                           name="horaInicio">
                    <input type="text" id="definir-horaFin" placeholder="HH:mm:ss" name="horaFin">
                    <br><br>
                    <input type="submit" id="crear-boxeo" value="Crear encuentro" style="padding:10px 60px;">
                    <input style="display:none" value="3" name="idDeporte">
                </form>
            </div>
        </div>
        
        <div class="element-container">
            <div class="header">
                <span class="title">DEFINIR RESULTADOS</span><br><br>
                <form action="/ApuExpress/definir_resultados.htm" method="POST">
                    <label for="definir-partido-select">Partido o match:</label>
                    <select id="definir-partido-select" name="idPartido">
                        ${partidosADefinir}
                    </select>
                    <br><br>
                    <label for="definir-puntuacionA">Puntuación equipo A:</label>
                    <input type="text" id="definir-puntuacionA" name="puntuacionA" style="margin-right:50px;">
                    
                    <label for="definir-puntuacionB">Puntuación equipo B:</label>
                    <input type="text" id="definir-puntuacionB" name="puntuacionB">
                    
                    <br><br>
                    <input type="submit" id="definir-resultado" value="Definir partido" style="padding:10px 60px;">
                </form>
            </div>
        </div>
        
        <div class="element-container">
            <div class="header">
                <span class="title">CREAR EQUIPO O BOXEADOR</span><br><br>
                <form action="/ApuExpress/crear_equipo.htm" method="POST">
                    <label for="crear-select-equipo">Deporte:</label>
                    <select id="crear-select-equipo" name="idDeporte">
                        <option value="1">Futbol Soccer</option>
                        <option value="2">Futbol Americano</option>
                        <option value="3">Boxeo</option>
                    </select>
                    <br><br>
                    <label for="crear-equipo-nombre" style="margin-right: 90px;">Nombre:</label>
                    <label for="crear-equipo-pais">País:</label>
                    <br>
                    <input type="text" id="crear-equipo-nombre" name="nombre" style="margin-right: 10px;">
                    <input type="text" id="crear-equipo-pais" name="pais">
                    <br><br>
                    <input type="submit" id="crear-equipo" value="Crear equipo" style="padding:10px 60px;">
                </form>

            </div>
        </div>
        
        <!-- FOOTER -->
        <%@ include file="/jspf/footer.jspf" %>

    </body>
</html>