$(document).ready(function() {

    $("#sidebar-accept").controlgroup();
    $("#sidebar-submit-button").button();
    
    // topnav-sidebar-button
    $("#sidebar").animate({width: "330px"}, 1000);

    $("#toggle-sidebar").click(function(){
        $("#sidebar").animate({width: "toggle"}, 300);
    });    
});