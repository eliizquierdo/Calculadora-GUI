
import javax.swing.*;
import java.awt.*;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;


public class Operaciones extends JFrame {

	private JPanel contentPane;
	private JTextField txtPrimeraEntrada;
	private JTextField txtSegundaEntrada;
	private JTextField txtResultado;
	private JButton btnSumar;
	private JButton btnConcatenar;
	private JButton btnSalir;
	private JButton btnLimpiar;
	
	
	public Operaciones() {
		iniciarComponentes();
		iniciarManejadoresEventos();
	}

	private void iniciarComponentes() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("Operaciones");
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Cadenas y n\u00FAmeros", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel.setBackground(Color.PINK);
		panel.setBounds(21, 11, 403, 188);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Primer entrada");
		lblNewLabel.setBounds(20, 42, 120, 14);
		panel.add(lblNewLabel);
		
		JLabel lblSegundaEntrada = new JLabel("Segunda entrada");
		lblSegundaEntrada.setBounds(20, 84, 120, 14);
		panel.add(lblSegundaEntrada);
		
		JLabel lblResultado = new JLabel("Resultado:");
		lblResultado.setBounds(20, 126, 94, 14);
		panel.add(lblResultado);
		
		txtPrimeraEntrada = new JTextField();
		txtPrimeraEntrada.setBounds(171, 39, 173, 20);
		panel.add(txtPrimeraEntrada);
		txtPrimeraEntrada.setColumns(10);
		
		txtSegundaEntrada = new JTextField();
		txtSegundaEntrada.setColumns(10);
		txtSegundaEntrada.setBounds(171, 81, 173, 20);
		panel.add(txtSegundaEntrada);
		
		txtResultado = new JTextField();
		txtResultado.setColumns(10);
		txtResultado.setBounds(171, 123, 173, 20);
		panel.add(txtResultado);
		
		btnSumar = new JButton("Sumar");
		btnSumar.setBounds(265, 154, 89, 23);
		panel.add(btnSumar);
		
		btnConcatenar = new JButton("Concatenar");
		btnConcatenar.setBounds(154, 154, 89, 23);
		panel.add(btnConcatenar);
		
		btnLimpiar = new JButton("Limpiar");
		btnLimpiar.setBounds(177, 228, 89, 23);
		contentPane.add(btnLimpiar);
		
		btnSalir = new JButton("Salir");
		btnSalir.setBounds(289, 228, 89, 23);
		contentPane.add(btnSalir);
		
	}
	
	private void iniciarManejadoresEventos() {
		
		
	}
}