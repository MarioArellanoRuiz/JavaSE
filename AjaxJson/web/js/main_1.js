$(document).ready(function(){
	var arregloDeObjetos=[];

	$("button#add-post").on("click",function(event) { //funcion manejadora

		var postText = $("textarea#textoPost").val(); //Develve un string
		var nuevoPost = {
						
			numero: arregloDeObjetos.length+1,
			contenido: postText
		};
		console.log(arregloDeObjetos);
		arregloDeObjetos[arregloDeObjetos.length] = nuevoPost;

		var html = $("div#posts").html();

		$("div#posts").prepend(

				'<div class="container">'+
		  				'<div class="row">'+
		       				'<div class="col-4">'+
		                		'<img src="img/author1.jpeg"/>'+
		        			'</div>'   +
		        		    '<div class="col-4">'+
			                	'Texto 1 <br>'+
			            		'Texto 2'+
		   	  			    '</div>'+ 
		   				'</div>'+

			  	  		'<div id="post">'+
				     		 '<div class="row" align="center">'+
				       			 '<div class="col-12">'+
				                  nuevoPost.contenido+
				          		'</div>'+
				      		'</div>'+
			  			'</div>'+

				'</div>'



			);
		
			
	});
});