package menu;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JTextArea;

public class FrameForNames extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private final JLabel lblParaVerTodos = new JLabel("Lista de todos nombres");
	private final JLabel lblNewLabel = new JLabel("Añadir un nuevo nombre");
	private JTextField textField;

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
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 128, 192));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		lblNewLabel.setForeground(new Color(255, 255, 0));
		lblNewLabel.setBounds(26, 11, 126, 59);
		contentPane.add(lblNewLabel);
		lblParaVerTodos.setHorizontalAlignment(SwingConstants.CENTER);
		lblParaVerTodos.setForeground(new Color(255, 255, 0));
		lblParaVerTodos.setBounds(260, 21, 164, 38);
		contentPane.add(lblParaVerTodos);
		
		textField = new JTextField();
		textField.setBounds(26, 98, 133, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(49, 164, 86, 22);
		contentPane.add(textArea);
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setVerticalAlignment(SwingConstants.TOP);
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_1.setBounds(295, 70, 115, 180);
		contentPane.add(lblNewLabel_1);
		
		JButton btnNewButton = new JButton("Añadir");
		btnNewButton.setBounds(49, 127, 86, 23);
		contentPane.add(btnNewButton);
	}
}
