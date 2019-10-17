package ar.edu.utn.java.inicial.modelo;

public class EnviadorCorreos {
	
	public void enviarCorreo(CorreoElectronico correo){
		// Imprimir un mensaje que dice:
		// Enviando correo: direccionDeCorreo con asunto: asunto
		// hint: String.format()
		// Hola Martin! se escribe asi: String.format("Hola %s!", var)
		String mensaje = String.format("Enviando correo: %s con asunto: %s ", correo.getDireccionCorreo(), correo.getAsunto());
		String mensaje2 = "Enviando correo: " + correo.getDireccionCorreo() + " con asunto: " + correo.getAsunto();
		System.out.println(mensaje);
	}
	
}
