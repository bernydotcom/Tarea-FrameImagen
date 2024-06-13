package gui;

import java.awt.GridLayout;
import java.awt.image.BufferedImage;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class FrameImagen extends javax.swing.JFrame {
    // Etiqueta
    // dentro de la etiqueta Imagen
    private JLabel etiquetaImagen;
    private BufferedImage imagen;

    public FrameImagen(BufferedImage imagen) {
        this.imagen = imagen;
        this.etiquetaImagen = new JLabel(new ImageIcon(this.imagen));

        setLayout(new GridLayout());
        add(this.etiquetaImagen);
        setSize(800, 800);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
}
