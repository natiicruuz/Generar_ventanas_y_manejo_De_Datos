
public class DatosUsuario {
	String usuario1 = "";
	String pass1 = "";

	public DatosUsuario() {//Constructor
		 
	}
	
	public int probarPass() {//Capturar cual es el user y el password
		usuario1 = Ventana1.txt_usuario.getText();//almacenar nombre de user en usuario1
		pass1 = Ventana1.pss_contrasena.getText();
		
		if(usuario1.equals("Natalia")&&pass1.equals("Candy036")) {
		
			return 1;//Entra 
		
		}
		else {
			return 0;// No entra
		}
	}
}
