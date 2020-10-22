<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>¡Bienvenido a ApuExpress! - Inicio</title>
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
    <div class="header index-header">
        <div class="overlay">
            <div class="wrapper" style="bottom: 15px;">
                <img src="images/logo.png" class="header-image" id="index-header-image">
                <h1 class="header-title" id="testt">ApuExpress</h1>
                <p class="header-text">La mejor página de apuestas del mundo</p>
            </div>
        </div>
    </div>
    
    <div class="element-container">
        <div class="two-columns">
            <div class="header">
                <span class="title">FUTBOL</span>
            </div>
            <div class="center">
                <div class="column">
                    <div>
                        <br>
                        <img src="images/index/fut.gif" class="image">
                        <br>
                    </div>
                </div>
                <div class="column">
                    <p class="text">
                        <i>"Tenemos que ser audaces, salir al campo y hacer 
                            las cosas, no sentarnos y esperar a que suceda. 
                            Tenemos que demostrar lo que podemos hacer y que
                            merecemos ganar el título. Tenemos que ser valientes
                            y salir a jugar."</i> - <b>Josep Guardiola</b>
                    </p>
                </div>
            </div>
        </div>
    </div>
    
    <div class="element-container">
        <div class="two-columns">
            <div class="header">
                <span class="title">FUTBOL AMERICANO</span>
            </div>
            <div class="center">
                <div class="column">
                    <p class="text">
                        <i>"Ganar no solo es un pensamiento, sino es todo en lo
                            que hay que pensar. Usted no gana de vez en cuando;
                            usted no hace las cosas correctas de vez en cuando;
                            usted las tiene que hace bien constantemente. Y esto
                            le crea un hábito que lo llevara a la victoria."</i>
                        - <b>Vince Lombardi</b>
                    </p>
                </div>
                <div class="column">
                    <div>
                        <br>
                        <img src="images/index/ame.gif" class="image">
                        <br>
                    </div>
                </div>
            </div>
        </div>
    </div>

    <div class="element-container">
        <div class="two-columns">
            <div class="header">
                <span class="title">BOXEO</span>
            </div>
            <div class="center">
                <div class="column">
                    <div>
                        <br>
                        <img src="images/index/box.gif" class="image">
                        <br>
                    </div>
                </div>
                <div class="column">
                    <p class="text">
                        <i>Odié cada minuto de entrenamiento, pero me dije; 
                            “no abandones. Sufre ahora y vive el resto de tu 
                            vida como un campeón</i>
                        - <b>Muhammad Ali</b>
                    </p>
                </div>
            </div>
        </div>
    </div> 
    
    <!-- FOOTER -->
    <%@ include file="/jspf/footer.jspf" %>
        
</body>
</html>
