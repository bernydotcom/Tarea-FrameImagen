package escuchadores;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import javax.swing.JButton;

public class EscuchadorBoton implements ActionListener{

    @Override
    public void actionPerformed(ActionEvent e) {
        // guardamos en aux la referencia del boton
        JButton aux =(JButton) e.getSource();
        // mostramos el dialogo y guardamos en 
        //valor lo que ingresa el usario
        String valor = JOptionPane.
        showInputDialog(null,
        "mensaje",
        "Dialogo",
        JOptionPane.OK_OPTION);
        // seteamos el texto del boton con el valor que
        // ingresó el usuario
        aux.setText(valor);
  

    }

    
    
}
