package restaurant;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.border.LineBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Login extends JFrame {

	
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField name;
	private JTextField contact;
	
	public Login() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(113, 13, 559, 377);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 218, 185));
		contentPane.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new LineBorder(new Color(0, 0, 0), 3));
		panel.setBackground(new Color(255, 218, 185));
		panel.setBounds(113, 13, 324, 46);
		contentPane.add(panel);
		
		JLabel lblNewLabel = new JLabel("Customer Details");
		lblNewLabel.setFont(new Font("Perpetua", Font.BOLD, 31));
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Name:");
		lblNewLabel_1.setFont(new Font("Perpetua", Font.BOLD, 27));
		lblNewLabel_1.setBounds(113, 111, 94, 24);
		contentPane.add(lblNewLabel_1);
		
		name = new JTextField();
		name.setFont(new Font("Perpetua", Font.BOLD, 20));
		name.setColumns(10);
		name.setBounds(236, 109, 201, 33);
		contentPane.add(name);
		
		JLabel lblNewLabel_1_1 = new JLabel("Contact:");
		lblNewLabel_1_1.setFont(new Font("Perpetua", Font.BOLD, 27));
		lblNewLabel_1_1.setBounds(113, 157, 111, 24);
		contentPane.add(lblNewLabel_1_1);
		
		contact = new JTextField();
		contact.setFont(new Font("Perpetua", Font.BOLD, 20));
		contact.setColumns(10);
		contact.setBounds(236, 155, 201, 33);
		contentPane.add(contact);
		
		JButton placeorder = new JButton("Place Order");
		placeorder.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String username = name.getText();
				String mobileno = contact.getText();
				if((username!=null )&&(mobileno!=null)) {
					JOptionPane.showMessageDialog(null, "Details saved successfully");
					Order o = new Order(username, mobileno);
					o.setVisible(true);
					dispose();
				}
			}
		});
		placeorder.setFont(new Font("Perpetua", Font.BOLD, 24));
		placeorder.setBackground(new Color(248, 248, 255));
		placeorder.setBounds(180, 227, 159, 46);
		contentPane.add(placeorder);
	}
}
