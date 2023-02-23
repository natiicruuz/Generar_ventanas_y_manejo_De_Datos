import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Ventana1 extends JFrame {

	private JPanel contentPane;
	public static JTextField txt_usuario;
	public static JPasswordField pss_contrasena;
	
	

	public Ventana1() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Usuario:");
		lblNewLabel.setBounds(24, 38, 46, 14);
		contentPane.add(lblNewLabel);
		
		txt_usuario = new JTextField();
		txt_usuario.setBounds(119, 35, 86, 20);
		contentPane.add(txt_usuario);
		txt_usuario.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Password:");
		lblNewLabel_1.setBounds(24, 118, 111, 14);
		contentPane.add(lblNewLabel_1);
		
		pss_contrasena = new JPasswordField();
		pss_contrasena.setBounds(119, 115, 86, 20);
		contentPane.add(pss_contrasena);
		
		
		final DatosUsuario data = new DatosUsuario(); //Declarar objeto de tipo datos usuario
		final Ventana2 window2 = new Ventana2();
		
		
		JButton btnEntrar = new JButton("Entrar");
		btnEntrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(data.probarPass() == 1) {
					JOptionPane.showMessageDialog(null, "Bienvenido al sistema!");
					window2.setVisible(true);
					dispose();//Se cierra la ventana 1
				}
				else {
					JOptionPane.showMessageDialog(null, "Error, usuario o contrasena incorrectas");
				}
				
			}
			
			
		});
		btnEntrar.setBounds(35, 194, 89, 23);
		contentPane.add(btnEntrar);
		
		JButton btnSalir = new JButton("Salir");
		btnSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnSalir.setBounds(293, 194, 89, 23);
		contentPane.add(btnSalir);
	}
}
