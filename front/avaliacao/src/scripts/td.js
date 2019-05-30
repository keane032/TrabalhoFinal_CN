$("table td").on("click", function(){
    var $this = $(this);    
    // remove classes
    $("table td").removeClass("hover");   
    // Add class to the current td
    $this.addClass("hover");
})