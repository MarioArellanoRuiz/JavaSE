$(document).ready(function () {

    //Clear console
    console.clear();

    $("button#add-post").on("click", function (event) {
        // console.log("Entro");
        // alert("Entro");

        // Obteniendo valor de un elemento por su tipo y su id
        var postText = $("textarea#textoPost").val();

        // Quitamos espacios en blanco, a las orillas
        postText = $.trim(postText);

        //console.log(postText);

        //Si llega texto que agregar
        if (postText !== "") {

            // alert(postText);

            // Objeto a enviar al servlet
            var nuevaPublicacion = {
                "id": $("div.mi-post").length + 1,
                "contenido": postText
            };

            //alert(nuevaPublicacion);


            $.ajax({
                url: "http://localhost:8084/SandiaFace/RedSocial", //Aquí la ruta exacta de su servlet
                type: "POST",
                //Qué espero recibir de la ruta
                contentType: "application/json",
                //Que tipo de datos te voy a enviar
                dataType: "json",
                data: JSON.stringify(nuevaPublicacion),

                //Servlet existe y me devolvió un JSON
                success: function (data, textStatus, jqXHR) {
                    console.log("Si el acceso al servlet fue correcto");
                    console.log(data);

                    //Insertar nueva publicacion
                    var htmlElement =
                            '<div id="mi-post-' + nuevaPublicacion.id + '" class="container mi-post">' +
                            '<div class="row">' +
                            '<div class="col-4">' +
                            '<img src="img/author1.jpeg">' +
                            '</div>' +
                            '<div class="col-4">' +
                            '<b>Publicado el </b><label class="h-date-pr" data-date=""> alguna fecha </label><br>' +
                            '<b>Hace </b><label class="h-date-tp" data-date="">algun momento</label><br>' +
                            '</div>' +
                            '<div class="col-3"><b>POST ' + nuevaPublicacion.id + '</b></div>' +
                            '<div class="col-1">' +
                            '<button class="btn btn-outline-danger btn-sm post-delete" data-numero="' + nuevaPublicacion.id + '">&times;</button>' +
                            '</div>' +
                            '</div>' +
                            '<div class="row">' +
                            '<div class="col-12 contenido-post" contenteditable>' + nuevaPublicacion.contenido + '</div>' +
                            '</div>' +
                            '</div>';

                    //console.log(htmlElement);

                    $("div#posts").prepend(htmlElement);
                    //$(htmlElement).prependTo("div#posts");

                },
                error: function (jqXHR, textStatus, errorThrown) {
                    console.log(jqXHR);
                    console.log(textStatus);
                    console.log(errorThrown);
                }
            });

            //Si la publicacion está vacía
        } else {
            alert("Agrega texto no seas flojo");
        }

    });

});