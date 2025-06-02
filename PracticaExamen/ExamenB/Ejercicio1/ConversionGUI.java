package ExamenB.Ejercicio1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ConversionGUI extends JFrame implements ActionListener {
    private JTextField campoPies, campoPulgadas;
    private JLabel resultado;
    private JButton convertir;

    public ConversionGUI() {
        setTitle("Conversión Pies y Pulgadas a Cm");
        setSize(400, 250);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        iniciarComponentes();
    }

    private void iniciarComponentes() {
        Container contenedor = getContentPane();
        contenedor.setLayout(null);

        JLabel labelPies = new JLabel("Pies:");
        labelPies.setBounds(20, 20, 100, 25);
        contenedor.add(labelPies);

        campoPies = new JTextField();
        campoPies.setBounds(120, 20, 100, 25);
        contenedor.add(campoPies);

        JLabel labelPulgadas = new JLabel("Pulgadas:");
        labelPulgadas.setBounds(20, 60, 100, 25);
        contenedor.add(labelPulgadas);

        campoPulgadas = new JTextField();
        campoPulgadas.setBounds(120, 60, 100, 25);
        contenedor.add(campoPulgadas);

        convertir = new JButton("CONVERTIR");
        convertir.setBounds(20, 100, 200, 30);
        convertir.addActionListener(this);
        contenedor.add(convertir);

        resultado = new JLabel("Resultado:");
        resultado.setBounds(20, 150, 350, 25);
        contenedor.add(resultado);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == convertir) {
            try {
                int pies = Integer.parseInt(campoPies.getText());
                int pulgadas = Integer.parseInt(campoPulgadas.getText());

                if (pulgadas < 0 || pulgadas > 11) {
                    JOptionPane.showMessageDialog(this, "Las pulgadas deben estar entre 0 y 11.", "Error", JOptionPane.ERROR_MESSAGE);
                    return;
                }

                double cm = (pies * 30.48) + (pulgadas * 2.54);
                resultado.setText(String.format("Resultado: %.2f cm", cm));
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(this, "Por favor, ingrese números enteros válidos.", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }

    public static void main(String[] args) {
        ConversionGUI ventana = new ConversionGUI();
        ventana.setVisible(true);
    }
}
