package escuchadores;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import gui.FrameFormulario;

public class EscuchadorBoton2 implements ActionListener{


    private FrameFormulario frame;

    public EscuchadorBoton2 (FrameFormulario frame){

        this.frame = frame;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String nombre = frame.getTxtNombre().getText();
        String apellidoP = frame.getTxtAPaterno().getText();
        String apellidoM = frame.getTxtAMaterno().getText();
        JOptionPane.
        showMessageDialog(frame,
        nombre+" "+apellidoP+" "+apellidoM);
    }
    
}
