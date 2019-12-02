import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main extends JFrame  implements ActionListener {
    private JLabel lblNom, lblApe, lblId, lblNom2, lblApe2, lblId2;
    private JTextField txtNom, txtApe, txtId, txtNom2, txtApe2, txtId2;

    private JTextArea txtres;
private String rr;


    private JButton btnMostrar, btnMostrar2, btnInO, btnPosO, btnPreO;
    private ArbolBinarioBusqueda arbolito = new ArbolBinarioBusqueda();


    public Main() {
        setTitle("Ventana Principal");
        setSize(650,550);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.getContentPane().setBackground(Color.gray);

        //setLayout(new FlowLayout());

        lblNom = new JLabel("Nombre:");
        lblApe = new JLabel("Apellido:");
        lblId = new JLabel("Id:");
        lblNom2 = new JLabel("Nombre:");
        lblApe2 = new JLabel("Apellido:");
        lblId2 = new JLabel("Id:");

        txtNom = new JTextField(30);
        txtApe = new JTextField(30);
        txtId = new JTextField(30);
        txtNom2 = new JTextField(30);
        txtApe2 = new JTextField(30);
        txtId2 = new JTextField(30);
        txtres = new JTextArea(800,600);

        btnMostrar = new JButton("Agregar");
        btnMostrar.addActionListener(this);
        btnMostrar2 = new JButton("Buscar");
        btnMostrar2.addActionListener(this);

        btnInO = new JButton("In Order");
        btnInO.addActionListener(this);
        btnPreO = new JButton("Pre Order");
        btnPreO.addActionListener(this);
        btnPosO = new JButton("Post Order");
        btnPosO.addActionListener(this);

        JPanel pnlCont = new JPanel(null);

        lblNom.setBounds(70, 10, 100, 20);
        lblApe.setBounds(60, 50, 100, 20);
        lblId.setBounds(95, 90, 100, 20);

        txtNom.setBounds(190, 10, 100, 20);
        txtApe.setBounds(190, 50, 100, 20);
        txtId.setBounds(190, 90, 100, 20);

        lblNom2.setBounds(360, 10, 100, 20);
        lblApe2.setBounds(350, 50, 100, 20);
        lblId2.setBounds(385, 90, 50, 20);

        txtNom2.setBounds(480, 10, 100, 20);
        txtApe2.setBounds(480, 50, 100, 20);
        txtId2.setBounds(480, 90, 100, 20);

        btnMostrar.setBounds(125, 140, 100, 20);
        btnMostrar2.setBounds(440, 140, 100, 20);

        btnInO.setBounds(150, 200, 100, 20);
        btnPosO.setBounds(270, 200, 100, 20);
        btnPreO.setBounds(390, 200, 100, 20);

        txtres.setBounds(20, 250, 600, 250);


        pnlCont.add(lblNom);
        pnlCont.add(lblApe);
        pnlCont.add(lblId);
       /* pnlCont.add(lblNom2);
        pnlCont.add(lblApe2);*/
        pnlCont.add(lblId2);
        pnlCont.add(txtres);

        pnlCont.add(txtNom);
        pnlCont.add(txtApe);
        pnlCont.add(txtId);

        pnlCont.add(txtId2);

        pnlCont.add(btnMostrar);
        pnlCont.add(btnMostrar2);
        pnlCont.add(btnInO);
        pnlCont.add(btnPosO);
        pnlCont.add(btnPreO);

        setContentPane(pnlCont);
        setLocationRelativeTo(null);


    }
    public static void main(String[] args) {
        Main vp = new Main();
        vp.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==btnMostrar) {

            String nom=(String.valueOf(txtNom.getText()));
            String ape=(String.valueOf(txtApe.getText()));
            Integer id=(Integer.parseInt(txtId.getText()));
            Empleado emp1 = new Empleado(nom, ape, id);
            arbolito.insertar(emp1);

        }
        if(e.getSource()==btnMostrar2) {

            Integer id=(Integer.parseInt(txtId2.getText()));

            txtres.setText(String.valueOf(arbolito.existe(id)));
        }
        if(e.getSource()==btnInO) {
            txtres.setText(arbolito.inOrden());
        }
        if(e.getSource()==btnPosO) {
            txtres.setText(arbolito.posOrden());
        }
        if(e.getSource()==btnPreO) {
            txtres.setText(arbolito.preOrden());
        }

    }
}
