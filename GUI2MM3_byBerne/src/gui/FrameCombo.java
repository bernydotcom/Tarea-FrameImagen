package gui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import javax.swing.JComboBox;
import javax.swing.JPanel;

import escuchadores.EscuchadorItemCombo;
// este frame es para poner a prueba un JComboBox
public class FrameCombo extends javax.swing.JFrame {
 
    private JComboBox combo;
    private JPanel panel;
    
    
    public FrameCombo(){

        setLayout(new BorderLayout());

        this.combo = new JComboBox();
        this.combo.addItem("Negro");
        this.combo.addItem("Amarillo");
        this.combo.addItem("Rojo");
        this.combo.addItem("Verde");
        
        EscuchadorItemCombo escuchador = new EscuchadorItemCombo(this);
        this.combo.addItemListener(escuchador);
        add(this.combo, BorderLayout.NORTH);

        this.panel = new JPanel();
        this.panel.setBackground(new Color(255, 255, 255));
        add(this.panel, BorderLayout.CENTER);

        setTitle("Ejemplo de uso de JComboBox");
        setSize(150,150);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }

    public JPanel getPanel(){

        return this.panel;
    }
}
