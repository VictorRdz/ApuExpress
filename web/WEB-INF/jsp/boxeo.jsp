<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>Boxeo - ApuExpress</title>
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
        <div class="header boxeo-header">
            <div class="overlay">
                <div class="wrapper">
                    <h1 class="header-title">Boxeo</h1>
                    <p class="header-text">El deporte más completo y exigente físicamente</p>
                </div>
            </div>
        </div>
        
        <div class="element-container">
            <div class="header">
                <span class="title">¡PROXIMOS ENCUENTROS!</span>
            </div>
            <br>
            <div class="two-columns boxeo-style">
                <div class="column">
                    
                </div>
                <div class="column">
                    
                </div>
            </div>
            <br>
        </div>
        
        <div class="element-container">
            <div class="header">
                <span class="title">¡ENCUENTROS TERMINADOS!</span>
            </div>
            <br>
            <div class="two-columns boxeo-style">
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
