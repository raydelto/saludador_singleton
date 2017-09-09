package edu.itla.saludador.ventanas;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Calendar;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class VentanaPrincipal extends JFrame{
	private JTextField txtNombre;
	private JButton btnSaludar;
	private static VentanaPrincipal instancia;
	
	public static VentanaPrincipal getInstancia() {
		if(instancia == null) {
			instancia = new VentanaPrincipal();
		}
		return instancia;
	}	
	
	private VentanaPrincipal(){
		setTitle("Saludador v0.1");
		setSize(400,600);
		txtNombre = new JTextField(10);
		btnSaludar = new JButton("Saludar");
		btnSaludar.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				Calendar calendar = Calendar.getInstance();
				int mes = calendar.get(Calendar.MONTH) + 1;
				JOptionPane.showMessageDialog(VentanaPrincipal.this, "Hola " + txtNombre.getText() +". Este es el mes " + mes, "Saludador", JOptionPane.INFORMATION_MESSAGE);				
			}			
		});
		add(txtNombre);
		add(btnSaludar);
		setDefaultCloseOperation(EXIT_ON_CLOSE);	
		setLayout(new FlowLayout());
		setVisible(true);
	}	

}
