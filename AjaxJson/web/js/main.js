$(document).ready( function () {

    var jsonSend = {
        "saludo"    : "sdadasdasda munsdadasddo",
        "despedida" : "adiós mundo cruel asdadasd"
    };

    $.ajax({
        //Ruta del servlet
        //url: "http://localhost:8084/red-social/GetPost?saludo=hola mundo&despedida=adios mundo cruel",
        url: "http://localhost:8084/AjaxJson/NewServlet", 
        //url: "get-post", //Servlet
        //Tipo de Método de consulta
        type: "POST",
        //Qué espero recibir de la ruta
        contentType: "application/json",
        //Que tipo de datos te voy a enviar
        dataType: "json",
        //Datos a enviar
        //data: JSON.stringify(jsonSend),
        data: JSON.stringify(jsonSend),
        
        //Servlet existe y me devolvió un JSON
        success: function(data, textStatus, jqXHR) {
            //console.log("Exito");
            
            //Si el status es exitoso
            if(textStatus === "success") {
                //Procesa los datos
                console.log(data);
            } else {
                //Muestra error
                console.log("I am Sorry Margarito");
            }
            //console.log(jqXHR);
        },
        error: function(jqXHR, textStatus, errorThrown) {
            console.log(jqXHR);
            console.log(textStatus);
            console.log(errorThrown);
        }
    });

});