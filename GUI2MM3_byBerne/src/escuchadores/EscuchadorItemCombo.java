package escuchadores;

import java.awt.Color;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;


import gui.FrameCombo;
public class EscuchadorItemCombo implements ItemListener {

    private FrameCombo frame;

    public EscuchadorItemCombo(FrameCombo frame){
        this.frame = frame;
    }


    @Override
    public void itemStateChanged(ItemEvent e) {
        // e es el evento de tipo ItemEvent
        String aux = (String)e.getItem();
        if(aux == "Amarillo"){
            // si esta selccionado el color "Amarillo" se pinta el panel por referencia de color negro
            this.frame.getPanel().setBackground(new Color(255, 255, 0));
        }
        if(aux == "Negro"){
            // si esta selccionado el color "Negro" se pinta el panel por referencia de color negro
            this.frame.getPanel().setBackground(new Color(0, 0, 0));
        }

        if(aux == "Rojo"){
            // si esta selccionado el color "Rojo" se pinta el panel por referencia de color negro
            this.frame.getPanel().setBackground(new Color(255, 0, 0));
        }
        if(aux == "Verde"){
            // si esta selccionado el color "Verde" se pinta el panel por referencia de color negro
            this.frame.getPanel().setBackground(new Color(0, 255, 0));
        }
    }
    
}
