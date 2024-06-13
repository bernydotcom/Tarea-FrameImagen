package herramientas;

import java.awt.Color;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;

// va orientada a poder obtener una imagen de la pc
public class GestorImagen {


    public BufferedImage abrirImagen() {
        FileNameExtensionFilter filtro = new FileNameExtensionFilter("Imagenes","jpg","jpeg","png","bmp");
        JFileChooser selector = new JFileChooser();
        selector.addChoosableFileFilter(filtro);
        selector.setFileSelectionMode(JFileChooser.FILES_ONLY);
        
        int res = selector.showOpenDialog(null);
    
        if (res == 1 ) {
            return null;
        }
        
        File archivo = selector.getSelectedFile();
        
        BufferedImage bi = null;
        try {
            bi = ImageIO.read(archivo);
        } catch (IOException e) {
            e.printStackTrace();
        }
        
        return bi;
    }

    public BufferedImage cambiarColor(BufferedImage bi) {
        for (int x = 0; x < bi.getWidth(); x++) {
            for (int y = 0; y < bi.getHeight(); y++) {
                Color color = new Color(bi.getRGB(x, y));
                if (color.getRed() > 200 && color.getGreen() > 200 && color.getBlue() < 100) {
                    bi.setRGB(x, y, Color.GREEN.getRGB());
                }
            }
        }
        return bi;
    }

    public  Image toImage (BufferedImage bi){
        return bi.getScaledInstance(bi.getWidth(),bi.getHeight(), BufferedImage.TYPE_INT_RGB);
    }
    
}
