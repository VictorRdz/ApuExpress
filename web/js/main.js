$(document).ready(function(){

    $(".header .overlay .wrapper").fadeIn(800, function() {
        $("#index-header-image").addClass("spin-animation");
    });
    
    
    $(".element-container .two-columns .column .container").click(function() {
        var match_path = " .overlay .match-header";
        var team_info_path = " .overlay .match .visible-info .team-info";
        var team_image_path = " .overlay .match .visible-info div";

        var id = "#" + $(this).attr("id");
        
        // Variables del container.
        var match_league = $(id + match_path + " .match-league").text();
        var match_date = $(id + match_path + " .match-date").text();
        
        var team_one_name = $(id + team_info_path + " .team-one-name").text();
        var team_one_multiplier = $(id + team_info_path + " .team-one-multiplier").text();
        var team_one_image = $(id + team_image_path + " .team-one-image").attr("src");

        var team_two_name = $(id + team_info_path + " .team-two-name").text();
        var team_two_multiplier = $(id + team_info_path + " .team-two-multiplier").text();
        var team_two_image = $(id + team_image_path + " .team-two-image").attr("src");
        
        // Implementacion en betting-screen
        var betting_screen = ".betting-overlay .window";
        
        $(betting_screen + " .top .league").text(match_league);
        $(betting_screen + " .top .date").text(match_date);
        
        $(betting_screen + " .header .team #team-one-name").text(team_one_name);
        $(betting_screen + " .header .team #team-one-multiplier").text(team_one_multiplier);
        $(betting_screen + " .header .team-one-image").html("<img src='" + team_one_image + "' class='image'>");
        
        $(betting_screen + " .header .team #team-two-name").text(team_two_name);
        $(betting_screen + " .header .team #team-two-multiplier").text(team_two_multiplier);
        $(betting_screen + " .header .team-two-image").html("<img src='" + team_two_image + "' class='image'>");
        
        clearBet();
        $(".betting-overlay").css("display", "flex").hide().fadeIn(200);
    });
   
    $(".close-icon").click(function() {
       $(".betting-overlay").fadeOut(200);
       
    });
    
    $("#betting-screen").click(function(e) {
        if(e.target.id === "betting-screen")   {
            $(".betting-overlay").fadeOut(200);
        }
    });
    
    
    $("#login-button").click(function() {
        $(".login-overlay").css("display", "flex").hide().fadeIn(200);
    });
    
    $("#login-label").click(function() {
        $(".login-overlay").css("display", "flex").hide().fadeIn(200);
    });
    
    $("#login-submit-button").button();
    
     $("#login-overlay").click(function(e) {
        if(e.target.id === "login-overlay")   {
            $(".login-overlay").fadeOut(200);
        }
    });
    
    $("#betting-submit").button();
    
    $("#betting-amount").keyup(function() {
        if($("#radio-team-one").is(":checked")) {
            updateBetTeamOne();
        }
        else if($("#radio-team-two").is(":checked")) {
            updateBetTeamTwo();
        }
    });
    
    $("#radio-team-one").click(function() {
        updateBetTeamOne();
    });
    
    $("#radio-team-two").click(function() {
        updateBetTeamTwo();
    });
    
    $("#betting-submit").click(function() {
        if($("#betting-amount").val() > 0) {
            alert("Apuesta realizada con éxito.");
        }
        else {
            alert("Ha ocurrido un error, intentelo de nuevo más tarde.");
        }
        $(".betting-overlay").fadeOut(200);
    });
    
    
    
});

function clearBet() {
    $("#betting-amount").val("");
    $("#betting-max").val("");
    $("#radio-team-one").checkboxradio("refresh");
    $("#radio-team-two").checkboxradio("refresh");
}

function updateBetTeamOne() {
    var mult = $("#team-one-multiplier").text();
    var multiplier = mult.match("[^x]+");
            
    if($("#betting-amount").val() === "") {
        $("#betting-max").val("");
        return;
    }

    var max = parseInt($("#betting-amount").val() * multiplier);
    $("#betting-max").val(max);
}

function updateBetTeamTwo() {
    var mult = $("#team-two-multiplier").text();
    var multiplier = mult.match("[^x]+");
        
    if($("#betting-amount").val() === "") {
        $("#betting-max").val("");
        return;
    }
    
    var max = parseInt($("#betting-amount").val() * multiplier);
    $("#betting-max").val(max);
}
