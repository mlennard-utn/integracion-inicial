package ar.edu.utn.java.inicial.programa;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;

import ar.edu.utn.java.inicial.modelo.CorreoElectronico;
import ar.edu.utn.java.inicial.modelo.EnviadorCorreos;


public class Main {

	public static void main(String[] args) {
		// Crear objeto CorreoElectronico
		// Le defino valores cualesquiera para direccion y asunto
		
		// Creo objeto EnviadorCorreo
		// le pido que envie el correo electronico que cree
		
//		CorreoElectronico correo = new CorreoElectronico();
//		
//		correo.setAsunto("Asunto del mail");
//		correo.setDireccionCorreo("E-mail");
//		
//		EnviadorCorreos enviador = new EnviadorCorreos();
//		
//		enviador.enviarCorreo(correo);
		ArrayList<CorreoElectronico> correos = new ArrayList<>();
		
		Path path = Paths.get("main/resources/emails.txt");
	    try(BufferedReader reader = Files.newBufferedReader(path, Charset.forName("UTF-8"))){
	      String currentLine = null;
	      while((currentLine = reader.readLine()) != null){//while haya contenido en la linea del archivo
	    	  CorreoElectronico correo = new CorreoElectronico();
	    	  //Descompo la linea en un array de strings
	    	  String[] linea = currentLine.split(",");
	    	  //la primera posicion del array tiene el email
	    	  correo.setDireccionCorreo(linea[0]);
	    	  //la segunda posicion el asunto
	    	  correo.setAsunto(linea[1]);
	    	  //agrego a la lista de correos lo que encontre en la 
	    	  //linea del archivo
	    	  correos.add(correo);
	    	  System.out.println(currentLine); // print the current line
	      }
	    }catch(IOException ex){
	      ex.printStackTrace(); //handle an exception here
	    }
		
	    EnviadorCorreos enviador = new EnviadorCorreos();
	    for (CorreoElectronico correo : correos) {
	    	enviador.enviarCorreo(correo);
		}
	    
	}

}
