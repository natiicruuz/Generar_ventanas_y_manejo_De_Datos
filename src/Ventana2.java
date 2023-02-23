import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.ButtonGroup;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Ventana2 extends JFrame {

	private JPanel contentPane;
	private JTextField txt_nombre;
	private JTextField txt_salario;
	
	private ButtonGroup botones = new ButtonGroup();


	public Ventana2() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Nombre");
		lblNewLabel.setBounds(39, 39, 96, 14);
		contentPane.add(lblNewLabel);
		
		txt_nombre = new JTextField();
		txt_nombre.setBounds(145, 36, 86, 20);
		contentPane.add(txt_nombre);
		txt_nombre.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Edad");
		lblNewLabel_1.setBounds(39, 102, 46, 14);
		contentPane.add(lblNewLabel_1);
		
		final JComboBox cmb_edad = new JComboBox();
		cmb_edad.setModel(new DefaultComboBoxModel(new String[] {"15-25", "25-35", "36-45", "46-55", "Mas de 55"}));
		cmb_edad.setBounds(145, 86, 86, 22);
		contentPane.add(cmb_edad);
		
		JLabel lblNewLabel_2 = new JLabel("Sexo");
		lblNewLabel_2.setBounds(39, 155, 46, 14);
		contentPane.add(lblNewLabel_2);
		
		final JRadioButton rdbtnMasculino = new JRadioButton("Masculino");
		rdbtnMasculino.setBounds(143, 151, 109, 23);
		contentPane.add(rdbtnMasculino);
		botones.add(rdbtnMasculino); //Agregamos a conjunto de botones
		
		final JRadioButton rdbtnFemenino = new JRadioButton("Femenino");
		rdbtnFemenino.setBounds(272, 151, 109, 23);
		contentPane.add(rdbtnFemenino);
		botones.add(rdbtnFemenino);//agregamos a conjunto de botones, permite que no se selecciones ambos botones.
		
		JLabel lblNewLabel_3 = new JLabel("Salario");
		lblNewLabel_3.setBounds(39, 203, 46, 14);
		contentPane.add(lblNewLabel_3);
		
		txt_salario = new JTextField();
		txt_salario.setBounds(145, 200, 86, 20);
		contentPane.add(txt_salario);
		txt_salario.setColumns(10);
		
		JButton btnNewButton = new JButton("Ingresar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String mensaje,sexo;
				
				if(rdbtnMasculino.isSelected()) {
					sexo = "Masculino";
				}else if(rdbtnFemenino.isSelected()){
					sexo = "Femenino";
				}
				else {
					sexo = "";
				}
				
				mensaje = txt_nombre.getText()+" que tiene un rango de edad de: "+cmb_edad.getSelectedItem()+", de sexo: "+sexo+" y que tiene un salario de: "+txt_salario.getText();
				System.out.println(mensaje);
			}
		});
		
		btnNewButton.setBounds(322, 199, 89, 23);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Salir");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnNewButton_1.setBounds(322, 227, 89, 23);
		contentPane.add(btnNewButton_1);
	}
}
