package app.ito.poo;
import Clases.ito.poo.Ubicacion;
import Clases.ito.poo.CuerpoCeleste;

	public class MyApp {

		public static void run(){
			CuerpoCeleste estrella= new CuerpoCeleste("Orion",new Ubicacion(12.313F,124.45F,"Junio-Julio",30000F),"Gaseoso");
			System.out.println(estrella);
			estrella.desplazamiento(50, 330);
			System.out.println(estrella);
			estrella.desplazamiento(300, 400);
			System.out.println(estrella);		
		}
		
		public static void main(String[] args) {
			run();

		}

	}
