package MenoPack;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;
import java.awt.Color;

public class FrameForNames extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JLabel lblNewLabel;
	private JTextArea textArea ;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FrameForNames frame = new FrameForNames();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public FrameForNames() {
		setTitle("NameDatabase");
		
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 629, 333);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 51, 153));
		contentPane.setBorder(new EmptyBorder(9, 0, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textField = new JTextField();
		textField.setBackground(new Color(198, 226, 255));
		textField.setBounds(26, 72, 206, 20);
		textField.setHorizontalAlignment(SwingConstants.LEFT);
		contentPane.add(textField);
		textField.setColumns(25);
		
		textField_1 = new JTextField();
		textField_1.setBackground(new Color(198, 226, 255));
		textField_1.setEditable(false);
		textField_1.setBounds(26, 155, 206, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		textArea = new JTextArea();
		textArea.setBackground(new Color(198, 226, 255));
		textArea.setBounds(359, 41, 186, 197);
		textArea.setEditable(false);
		contentPane.add(textArea);
		
		JButton btnNewButton = new JButton("Añadir");
		btnNewButton.setBackground(new Color(255, 240, 183));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String name=textField.getText();
				int hasNumber=0;
				for(int i=0; i<name.length(); i++) {
					for(int j=0;j<10; j++) {
						if(name.charAt(i)==(j+"").charAt(0))
							hasNumber=1;
					}
				}
				if(hasNumber==1) {
					textField_1.setText("Nombre no validado");
				}else {
					String txt=textArea.getText() ;
					textArea.setText(txt+"\n"+name);
					textField_1.setText("Nombre validado");
				}
			}
		});
		btnNewButton.setBounds(63, 113, 135, 23);
		contentPane.add(btnNewButton);
		
		lblNewLabel = new JLabel("Lista de los nombres");
		lblNewLabel.setForeground(new Color(255, 204, 0));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(359, 11, 186, 20);
		contentPane.add(lblNewLabel);
		
		JLabel lblAadirNombreAqui = new JLabel("Añadir nombre aqui");
		lblAadirNombreAqui.setForeground(new Color(255, 204, 0));
		lblAadirNombreAqui.setBackground(new Color(255, 204, 0));
		lblAadirNombreAqui.setHorizontalAlignment(SwingConstants.CENTER);
		lblAadirNombreAqui.setBounds(26, 41, 206, 20);
		contentPane.add(lblAadirNombreAqui);
		
		
		
		
		
		
		
	}
}
