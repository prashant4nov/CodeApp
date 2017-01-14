function mapping(stream) {
    $.ajax({url: "mapping", type: "POST", data: {'data': stream},success: function(result){
        document.getElementById("update").innerHTML = result;
    }});
}
