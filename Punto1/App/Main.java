package Punto1.App;

import Punto1.Observer.CommunityManager;
import Punto1.Observer.NotificacionInterface;
import Punto1.Observer.Periodista;
import Punto1.Observer.Webmaster;
import Punto1.Sujeto.Sujeto;

public class Main {
    public static void main(String[] args) {
        Sujeto sujeto = new Sujeto();

        NotificacionInterface andrea = new Webmaster("Andrea");
        NotificacionInterface luzDary = new Periodista("Luz Dary");
        NotificacionInterface lauraMolano = new CommunityManager("Laura Molano");
        
        sujeto.agregarObservador(andrea);
        sujeto.agregarObservador(luzDary);
        sujeto.agregarObservador(lauraMolano);


        sujeto.actualizarCursos("Curso de Pedagogia decolonial", "Agregado");
        sujeto.actualizarCursos("Curso de Inteligencia artificial aplicada a la educacion", "Eliminado");
        sujeto.actualizarCursos("Curso de ciudades inteligentes", "Actualizado");

    }
}
