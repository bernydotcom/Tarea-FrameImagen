package gui;

import javax.swing.JButton;
import javax.swing.JTextField;

import escuchadores.EscuchadorBoton2;

import javax.swing.JLabel;
import java.awt.GridLayout;

// heredar todo lo que nos brinda JFrame
public class FrameFormulario extends javax.swing.JFrame {

    // boton
    private JButton btnEnviar;
    // campos de texto  // getTxtNombre
    private JTextField txtNombre;
    private JTextField txtAPaterno;
    private JTextField txtAMaterno;
    private JTextField txtDireccion;
    // etiquetas
    private JLabel lblNombre;
    private JLabel lblAPaterno;
    private JLabel lblAMaterno;
    private JLabel lblDireccion;

    public FrameFormulario (){
        // init los componentes
        inicializarComponentes();
        // agregar al frame
        // definir la forma en que se van a agregar (layout)
        setLayout(new GridLayout(5,2));
        // agregar al Frame todos los componentes
        // primer renglon
        add(this.lblNombre);
        add(this.txtNombre);
        // segundo renglon
        add(this.lblAPaterno);
        add(this.txtAPaterno);
        // tercer renglon
        add(this.lblAMaterno);
        add(this.txtAMaterno);
        // cuarto renglon
        add(this.lblDireccion);
        add(this.txtDireccion);
        // quinto renglon
        add(this.btnEnviar);

        // definir un tamaño
        setSize(250,300);
        setTitle("Formulario Basico");
        setVisible(true);    
    }

    private void inicializarComponentes(){
        // inicializar los JTextField
        this.txtNombre = new JTextField();
        this.txtAPaterno = new JTextField();
        this.txtAMaterno = new JTextField();
        this.txtDireccion = new JTextField();
        // inicializar a los JLabel
        this.lblNombre = new JLabel("Nombre: ");
        this.lblAPaterno = new JLabel("Apellido Paterno: ");
        this.lblAMaterno = new JLabel("Apellido Materno: ");
        this.lblDireccion = new JLabel("Direccion: ");
        // inicializar el JButton
        this.btnEnviar = new JButton("Enviar");

        EscuchadorBoton2 escuchador = new EscuchadorBoton2(this);
        this.btnEnviar.addActionListener(escuchador);

    }

    public JTextField getTxtNombre (){

        return  this.txtNombre;
    }

    public JTextField getTxtAPaterno (){

        return  this.txtAPaterno;
    }

    public JTextField getTxtAMaterno (){

        return  this.txtAMaterno;
    }

    public JTextField getTxtDireccion (){

        return  this.txtDireccion;
    }

}
