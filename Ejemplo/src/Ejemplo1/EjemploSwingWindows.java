package Ejemplo1;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.BoxLayout;
import javax.swing.JTextArea;
import javax.swing.JTable;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.JLabel;

public class EjemploSwingWindows {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					EjemploSwingWindows window = new EjemploSwingWindows();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public EjemploSwingWindows() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btnNewButton = new JButton("0");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("Has pulsado el 0");
			}
		});
		btnNewButton.setBounds(20, 111, 89, 23);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("3");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("Has pulsado el 3");
			}
		});
		btnNewButton_1.setBounds(20, 145, 89, 23);
		frame.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("6");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("Has pulsado el 6");
			}
		});
		btnNewButton_2.setBounds(20, 179, 89, 23);
		frame.getContentPane().add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("9");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("Has pulsado el 6");
			}
		});
		btnNewButton_3.setBounds(20, 213, 89, 23);
		frame.getContentPane().add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("1");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("Has pulsado el 1");
			}
		});
		btnNewButton_4.setBounds(119, 111, 89, 23);
		frame.getContentPane().add(btnNewButton_4);
		
		JButton btnNewButton_5 = new JButton("4");
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("Has pulsado el 4");
			}
		});
		btnNewButton_5.setBounds(119, 145, 89, 23);
		frame.getContentPane().add(btnNewButton_5);
		
		JButton btnNewButton_6 = new JButton("7");
		btnNewButton_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("Has pulsado el 7");
			}
		});
		btnNewButton_6.setBounds(119, 179, 89, 23);
		frame.getContentPane().add(btnNewButton_6);
		
		JButton btnNewButton_7 = new JButton("x");
		btnNewButton_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("Has pulsado la multiplicacion");
			}
		});
		btnNewButton_7.setBounds(119, 213, 89, 23);
		frame.getContentPane().add(btnNewButton_7);
		
		JButton btnNewButton_8 = new JButton("2");
		btnNewButton_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("Has pulsado el 2");
			}
		});
		btnNewButton_8.setBounds(218, 111, 89, 23);
		frame.getContentPane().add(btnNewButton_8);
		
		JButton btnNewButton_9 = new JButton("5");
		btnNewButton_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("Has pulsado el 5");
			}
		});
		btnNewButton_9.setBounds(218, 145, 89, 23);
		frame.getContentPane().add(btnNewButton_9);
		
		JButton button = new JButton("8");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("Has pulsado el 8");
			}
		});
		button.setBounds(218, 179, 89, 23);
		frame.getContentPane().add(button);
		
		JButton btnNewButton_10 = new JButton("/");
		btnNewButton_10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("Has pulsado la division");
			}
		});
		btnNewButton_10.setBounds(218, 213, 89, 23);
		frame.getContentPane().add(btnNewButton_10);
		
		JButton btnNewButton_11 = new JButton("+");
		btnNewButton_11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("Has pulsado la multiplicacion");
			}
		});
		btnNewButton_11.setBounds(317, 213, 89, 23);
		frame.getContentPane().add(btnNewButton_11);
		
		JButton btnNewButton_12 = new JButton("-");
		btnNewButton_12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("Has pulsado la resta");
			}
		});
		btnNewButton_12.setBounds(317, 179, 89, 23);
		frame.getContentPane().add(btnNewButton_12);
		
		textField = new JTextField();
		textField.setBounds(20, 57, 192, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Operacion");
		lblNewLabel.setBounds(20, 32, 73, 14);
		frame.getContentPane().add(lblNewLabel);
		
		textField_1 = new JTextField();
		textField_1.setBounds(310, 57, 96, 20);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Resultado");
		lblNewLabel_1.setBounds(309, 32, 49, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		JButton btnNewButton_13 = new JButton("=");
		btnNewButton_13.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("Has pulsado la igualdad");
			}
		});
		btnNewButton_13.setBounds(317, 145, 89, 23);
		frame.getContentPane().add(btnNewButton_13);
	}
}
