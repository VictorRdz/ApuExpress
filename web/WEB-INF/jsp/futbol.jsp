<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page isELIgnored="false" %> 
<!DOCTYPE html>
<html>
    <head>
        <title>Futbol - ApuExpress</title>
        <link rel="icon" href="images/logo.png">
        <link rel="stylesheet" href="css/material-icons.css">
        <link rel="stylesheet" type="text/css" href="css/main.css">
        <link rel="stylesheet" type="text/css" href="css/header-images.css">
        <link rel="stylesheet" type="text/css" href="css/jquery-ui.min.css">
        <link rel="stylesheet" type="text/css" href="css/jquery-ui.structure.min.css">
        <link rel="stylesheet" type="text/css" href="css/jquery-ui.theme.min.css">
        <link rel="stylesheet" type="text/css" href="css/style.css">
        <script src="js/jquery-3.3.1.min.js"></script>
        <script src="js/jquery-ui.min.js"></script>
        <script src="js/main.js"></script> 
    </head>
    <body>
        <!-- TOP NAVEGATION BAR -->
        <%@ include file="/jspf/topnav.jspf" %>
        
        <!-- SIDEBAR -->
        <%@ include file="/jspf/sidebar.jspf" %>
       
        <!-- HEADER -->
        <div class="header futbol-header">
            <div class="overlay">
                <div class="wrapper">
                    <h1 class="header-title">Futbol</h1>
                    <p class="header-text">El deporte más hermoso del mundo</p>
                </div>
            </div>
        </div>
        
        <div class="element-container">
            <div class="header">
                <span class="title">¡PROXIMOS PARTIDOS!</span>
            </div>
            <br>
            <div class="two-columns futbol-style">
                <div class="column">
                    <foreach ${partidos} value="partido">
                    
                    </foreach>
                </div>
                <div class="column">
                    
                </div>
            </div>
            <br>
        </div>
        
        <div class="element-container">
            <div class="header">
                <span class="title">¡PARTIDOS TERMINADOS!</span>
            </div>
            <br>
            <div class="two-columns futbol-style">
                <div class="column">
                    
                    
                </div>
                <div class="column">
                    
                    
                </div>
            </div>
            <br>
        </div>
        
        
        <!-- FOOTER -->
        <%@ include file="/jspf/footer.jspf" %>
        
        <!-- BETTING-SCREEN -->
        <%@ include file="/jspf/betting-screen.jspf" %>
        
        
        
    </body>
</html>
