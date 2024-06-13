import java.awt.image.BufferedImage;

import gui.FrameImagen;
import herramientas.GestorImagen;


public class App {
    public static void main(String[] args) throws Exception {
    //  Combo Box  =  "JComboBox"  Constructores(4) (api oracle) | Object,Component, Container, J
    //  estado del combo cambie (selección de lo elementos que tiene) 
    // obtener la imagen
    // abrir la imagen por medio del gestor
    GestorImagen aux = new GestorImagen();
    // asignamos a variable la imagen abierta
    BufferedImage imagen = aux.abrirImagen();
    // creamos un frame especial para mostrar la imagen    
    FrameImagen fi = new FrameImagen(imagen);
    // le damos un titulo al frame de la imagen original
    fi.setTitle("Imagen Original");

    // instrucciones para el cambio de color
    // asignamos a varible la imagen a modificar
    BufferedImage nuevaImagen = aux.cambiarColor(imagen);
    // creamos un frame especial para mostrar la imagen modificada
    FrameImagen fiNueva = new FrameImagen(nuevaImagen);
    // le damos un titulo al frame de la imagen modificada
    fiNueva.setTitle("Imagen Modificada");

    }
}
