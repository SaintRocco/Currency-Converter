import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JToggleButton;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JEditorPane;

public class MainConverterFrame extends JFrame implements ActionListener{

	private JPanel contentPane;
	private JTextField txtEnterAmount;
	private JComboBox<?> comboBox_1;
	private JComboBox<?> comboBox_2;
	String[] currencies = { "EUR", "USD", "HRK" }; //JCB Content

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainConverterFrame frame = new MainConverterFrame();
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
	public MainConverterFrame() {
		setTitle("Currency Converter");
		setBackground(Color.WHITE);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 497, 341);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Amount");
		lblNewLabel.setBounds(59, 56, 46, 14);
		contentPane.add(lblNewLabel);
		
		txtEnterAmount = new JTextField();
		txtEnterAmount.setToolTipText("Enter amount...");
		txtEnterAmount.setBounds(115, 53, 277, 20);
		contentPane.add(txtEnterAmount);
		txtEnterAmount.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("From:");
		lblNewLabel_1.setBounds(59, 116, 46, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("To:");
		lblNewLabel_2.setBounds(240, 116, 46, 14);
		contentPane.add(lblNewLabel_2);
		
		comboBox_1 = new JComboBox<Object>(currencies);
		comboBox_1.setBounds(115, 113, 86, 20);
		comboBox_1.addActionListener(this);
		contentPane.add(comboBox_1);
		
		comboBox_2 = new JComboBox<Object>(currencies); //To Box
		comboBox_2.setBounds(306, 113, 86, 20);
		comboBox_2.addActionListener(this);
		contentPane.add(comboBox_2);
	
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == comboBox_1) {
			JLabel resultsLabel = new JLabel();
			resultsLabel.setBounds(115, 188, 174, 64);
			contentPane.add(resultsLabel);
			
			String lblmsg = (String) comboBox_1.getSelectedItem();
			switch(lblmsg) {
			case "EUR": 
				resultsLabel.setText("Izabrali ste EVRE u " + comboBox_2.getSelectedItem());
				break;
			case "USD": 
				resultsLabel.setText("Izabrali ste DOLARE u " + comboBox_2.getSelectedItem());
				break;
			case "HRK":
				resultsLabel.setText("Izabrali ste KUNE u " + comboBox_2.getSelectedItem());
				break;
			default: resultsLabel.setText("ERROR!!");
	
			}
		}
		
	}
}
