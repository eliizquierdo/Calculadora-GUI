package presentacion;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.border.TitledBorder;
import java.awt.Color;

public class Operaciones extends JFrame {

	private JPanel contentPane;
	private JLabel lblPrimeraEntrada;
	private JTextField txtPrimeraEntrada;
	private JLabel lblSegundaEntrada;
	private JLabel lblResultado;
	private JTextField txtSegundaEntrada;
	private JTextField txtResultado;
	private JPanel panel;
	private JButton btnSalir;
	private JButton btnSumar;
	private JButton btnConcatenar;
	private JButton btnLimpiar;

	public Operaciones() {
		iniciarComponentes();
		iniciarManejadorEventos();
	}
	
	
	private void iniciarComponentes() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		panel = new JPanel();
		panel.setBackground(Color.CYAN);
		panel.setBorder(new TitledBorder(null, "Cadenas y n\u00FAmeros", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel.setBounds(22, 8, 379, 205);
		contentPane.add(panel);
		panel.setLayout(null);
		
		lblPrimeraEntrada = new JLabel("Primera Entrada:");
		lblPrimeraEntrada.setBounds(12, 25, 81, 14);
		panel.add(lblPrimeraEntrada);
		
		txtPrimeraEntrada = new JTextField();
		txtPrimeraEntrada.setBounds(135, 22, 192, 20);
		panel.add(txtPrimeraEntrada);
		txtPrimeraEntrada.setColumns(10);
		
		lblSegundaEntrada = new JLabel("Segunda Entrada:");
		lblSegundaEntrada.setBounds(12, 67, 87, 14);
		panel.add(lblSegundaEntrada);
		
		txtResultado = new JTextField();
		txtResultado.setBounds(135, 111, 192, 20);
		panel.add(txtResultado);
		txtResultado.setColumns(10);
		
		lblResultado = new JLabel("Resultado:");
		lblResultado.setBounds(10, 114, 52, 14);
		panel.add(lblResultado);
		
		txtSegundaEntrada = new JTextField();
		txtSegundaEntrada.setBounds(135, 67, 192, 20);
		panel.add(txtSegundaEntrada);
		txtSegundaEntrada.setColumns(10);
		
		btnConcatenar = new JButton("Concatenar");
				
		btnConcatenar.setBounds(121, 171, 107, 23);
		panel.add(btnConcatenar);
		
		btnSumar = new JButton("Sumar");
		
		btnSumar.setBounds(238, 171, 89, 23);
		panel.add(btnSumar);
		
		btnLimpiar = new JButton("Limpiar");
		
		btnLimpiar.setBounds(146, 228, 89, 23);
		contentPane.add(btnLimpiar);
		
		btnSalir = new JButton("Salir");
		
		btnSalir.setBounds(263, 228, 89, 23);
		contentPane.add(btnSalir);
		
	}


	
	

	private void iniciarManejadorEventos() {
		
		btnSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.exit(0);
			}
		});
		
		btnLimpiar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtPrimeraEntrada.setText(null);
				txtSegundaEntrada.setText(null);
				txtResultado.setText(null);
			}
		});
		
		btnSumar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					int nro1=Integer.valueOf(txtPrimeraEntrada.getText());
					int nro2=Integer.valueOf(txtSegundaEntrada.getText());
					txtResultado.setText(String.valueOf(nro1+nro2));
				}catch(Exception ex) {
					JOptionPane.showMessageDialog(null,"Intente de nuevo");
					
				}
			}
		});
		
		btnConcatenar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String cadena1=txtPrimeraEntrada.getText();
				String cadena2=txtSegundaEntrada.getText();
				txtResultado.setText(cadena1 +" "+cadena2);
			}
		});
	
	
	}
}
