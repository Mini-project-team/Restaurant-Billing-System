package restaurant;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSeparator;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;


public class Menu extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					String u ="";
					String t ="";
					Menu frame = new Menu(u , t);
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	
	public Menu(String u , String t ) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 860, 882);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		

		JPanel panel = new JPanel();
		panel.setBackground(new Color(255, 218, 185));
		panel.setBorder(new LineBorder(new Color(0, 0, 0), 8));
		panel.setBounds(12, 13, 817, 804);
		getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Welcome");
		lblNewLabel.setFont(new Font("Perpetua", Font.BOLD | Font.ITALIC, 45));
		lblNewLabel.setBounds(340, 13, 173, 38);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Menu Card ");
		lblNewLabel_1.setFont(new Font("Perpetua", Font.BOLD | Font.ITALIC, 35));
		lblNewLabel_1.setBounds(340, 52, 160, 38);
		panel.add(lblNewLabel_1);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(255, 218, 185));
		panel_1.setBorder(new LineBorder(new Color(0, 0, 0), 8));
		panel_1.setBounds(12, 103, 789, 396);
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel_4 = new JLabel("Meals");
		lblNewLabel_4.setBounds(347, 13, 105, 35);
		panel_1.add(lblNewLabel_4);
		lblNewLabel_4.setFont(new Font("Perpetua", Font.BOLD | Font.ITALIC, 35));
		
		JLabel lblNewLabel_2 = new JLabel("Pizza ");
		lblNewLabel_2.setBounds(12, 48, 105, 35);
		panel_1.add(lblNewLabel_2);
		lblNewLabel_2.setFont(new Font("Perpetua", Font.BOLD | Font.ITALIC, 33));
		
		JLabel lblNewLabel_3 = new JLabel("Margharita ");
		lblNewLabel_3.setForeground(new Color(0, 0, 0));
		lblNewLabel_3.setBackground(new Color(240, 240, 240));
		lblNewLabel_3.setBounds(22, 77, 160, 29);
		panel_1.add(lblNewLabel_3);
		lblNewLabel_3.setFont(new Font("Perpetua", Font.ITALIC, 30));
		
		JLabel lblNewLabel_5 = new JLabel("Cheese Capsicum");
		lblNewLabel_5.setBounds(22, 105, 173, 38);
		panel_1.add(lblNewLabel_5);
		lblNewLabel_5.setFont(new Font("Perpetua", Font.ITALIC, 30));
		
		JLabel lblNewLabel_6 = new JLabel("Mushroom");
		lblNewLabel_6.setBounds(22, 136, 170, 38);
		panel_1.add(lblNewLabel_6);
		lblNewLabel_6.setFont(new Font("Perpetua", Font.ITALIC, 30));
		
		JLabel lblNewLabel_7 = new JLabel("Chicken");
		lblNewLabel_7.setBounds(22, 172, 116, 29);
		panel_1.add(lblNewLabel_7);
		lblNewLabel_7.setFont(new Font("Perpetua", Font.ITALIC, 30));
		
		JLabel lblNewLabel_8 = new JLabel("Rs.100/-");
		lblNewLabel_8.setBounds(240, 78, 97, 29);
		panel_1.add(lblNewLabel_8);
		lblNewLabel_8.setFont(new Font("Perpetua", Font.ITALIC, 28));
		lblNewLabel_8.setBackground(new Color(240, 240, 240));
		
		JLabel lblNewLabel_8_1 = new JLabel("Rs.70/-");
		lblNewLabel_8_1.setBounds(240, 111, 97, 29);
		panel_1.add(lblNewLabel_8_1);
		lblNewLabel_8_1.setFont(new Font("Perpetua", Font.ITALIC, 28));
		lblNewLabel_8_1.setBackground(SystemColor.menu);
		
		JLabel lblNewLabel_8_2 = new JLabel("Rs.150/-");
		lblNewLabel_8_2.setBounds(240, 142, 97, 29);
		panel_1.add(lblNewLabel_8_2);
		lblNewLabel_8_2.setFont(new Font("Perpetua", Font.ITALIC, 28));
		lblNewLabel_8_2.setBackground(SystemColor.menu);
		
		JLabel lblNewLabel_8_3 = new JLabel("Rs.200/-");
		lblNewLabel_8_3.setBounds(240, 173, 97, 29);
		panel_1.add(lblNewLabel_8_3);
		lblNewLabel_8_3.setFont(new Font("Perpetua", Font.ITALIC, 28));
		lblNewLabel_8_3.setBackground(SystemColor.menu);
		
		JLabel lblNewLabel_9 = new JLabel("Burger");
		lblNewLabel_9.setFont(new Font("Perpetua", Font.BOLD | Font.ITALIC, 33));
		lblNewLabel_9.setBounds(462, 48, 105, 35);
		panel_1.add(lblNewLabel_9);
		
		JLabel lblNewLabel_7_1 = new JLabel("Aloo Tikki");
		lblNewLabel_7_1.setFont(new Font("Perpetua", Font.ITALIC, 30));
		lblNewLabel_7_1.setBounds(487, 77, 116, 29);
		panel_1.add(lblNewLabel_7_1);
		
		JLabel lblNewLabel_7_2 = new JLabel("Nachos");
		lblNewLabel_7_2.setFont(new Font("Perpetua", Font.ITALIC, 30));
		lblNewLabel_7_2.setBounds(487, 110, 116, 29);
		panel_1.add(lblNewLabel_7_2);
		
		JLabel lblNewLabel_7_3 = new JLabel("Eggs");
		lblNewLabel_7_3.setFont(new Font("Perpetua", Font.ITALIC, 30));
		lblNewLabel_7_3.setBounds(487, 141, 116, 29);
		panel_1.add(lblNewLabel_7_3);
		
		JLabel lblNewLabel_7_4 = new JLabel("Chicken");
		lblNewLabel_7_4.setFont(new Font("Perpetua", Font.ITALIC, 30));
		lblNewLabel_7_4.setBounds(487, 181, 116, 29);
		panel_1.add(lblNewLabel_7_4);
		
		JLabel lblNewLabel_8_4 = new JLabel("Rs.90/-");
		lblNewLabel_8_4.setFont(new Font("Perpetua", Font.ITALIC, 28));
		lblNewLabel_8_4.setBackground(SystemColor.menu);
		lblNewLabel_8_4.setBounds(678, 77, 97, 29);
		panel_1.add(lblNewLabel_8_4);
		
		JLabel lblNewLabel_8_5 = new JLabel("Rs.130/-");
		lblNewLabel_8_5.setFont(new Font("Perpetua", Font.ITALIC, 28));
		lblNewLabel_8_5.setBackground(SystemColor.menu);
		lblNewLabel_8_5.setBounds(678, 111, 97, 29);
		panel_1.add(lblNewLabel_8_5);
		
		JLabel lblNewLabel_8_6 = new JLabel("Rs.100/-");
		lblNewLabel_8_6.setFont(new Font("Perpetua", Font.ITALIC, 28));
		lblNewLabel_8_6.setBackground(SystemColor.menu);
		lblNewLabel_8_6.setBounds(678, 150, 97, 29);
		panel_1.add(lblNewLabel_8_6);
		
		JLabel lblNewLabel_8_7 = new JLabel("Rs.120/-");
		lblNewLabel_8_7.setFont(new Font("Perpetua", Font.ITALIC, 28));
		lblNewLabel_8_7.setBackground(SystemColor.menu);
		lblNewLabel_8_7.setBounds(678, 181, 97, 29);
		panel_1.add(lblNewLabel_8_7);
		
		JLabel lblNewLabel_2_1 = new JLabel("Pasta");
		lblNewLabel_2_1.setFont(new Font("Perpetua", Font.BOLD | Font.ITALIC, 33));
		lblNewLabel_2_1.setBounds(12, 224, 105, 35);
		panel_1.add(lblNewLabel_2_1);
		
		JLabel lblNewLabel_2_2 = new JLabel("Noodles");
		lblNewLabel_2_2.setFont(new Font("Perpetua", Font.BOLD | Font.ITALIC, 33));
		lblNewLabel_2_2.setBounds(462, 224, 105, 35);
		panel_1.add(lblNewLabel_2_2);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(204, 105, 0, 69);
		panel_1.add(separator);
		
		JLabel lblNewLabel_3_1 = new JLabel("White Sauce");
		lblNewLabel_3_1.setFont(new Font("Perpetua", Font.ITALIC, 30));
		lblNewLabel_3_1.setBounds(22, 255, 160, 29);
		panel_1.add(lblNewLabel_3_1);
		
		JLabel lblNewLabel_3_2 = new JLabel("Red Sauce");
		lblNewLabel_3_2.setFont(new Font("Perpetua", Font.ITALIC, 30));
		lblNewLabel_3_2.setBounds(22, 285, 160, 29);
		panel_1.add(lblNewLabel_3_2);
		
		JLabel lblNewLabel_3_3 = new JLabel("Cheesy Spinach");
		lblNewLabel_3_3.setFont(new Font("Perpetua", Font.ITALIC, 30));
		lblNewLabel_3_3.setBounds(22, 314, 160, 29);
		panel_1.add(lblNewLabel_3_3);
		
		JLabel lblNewLabel_3_4 = new JLabel("Chicken");
		lblNewLabel_3_4.setFont(new Font("Perpetua", Font.ITALIC, 30));
		lblNewLabel_3_4.setBounds(22, 344, 160, 29);
		panel_1.add(lblNewLabel_3_4);
		
		JLabel lblNewLabel_3_5 = new JLabel("Chowmein");
		lblNewLabel_3_5.setFont(new Font("Perpetua", Font.ITALIC, 30));
		lblNewLabel_3_5.setBounds(487, 255, 160, 29);
		panel_1.add(lblNewLabel_3_5);
		
		JLabel lblNewLabel_3_6 = new JLabel("Schezwan");
		lblNewLabel_3_6.setFont(new Font("Perpetua", Font.ITALIC, 30));
		lblNewLabel_3_6.setBounds(487, 285, 160, 29);
		panel_1.add(lblNewLabel_3_6);
		
		JLabel lblNewLabel_3_7 = new JLabel("Hakka Noodles");
		lblNewLabel_3_7.setFont(new Font("Perpetua", Font.ITALIC, 30));
		lblNewLabel_3_7.setBounds(487, 314, 160, 29);
		panel_1.add(lblNewLabel_3_7);
		
		JLabel lblNewLabel_3_8 = new JLabel("Chicken");
		lblNewLabel_3_8.setFont(new Font("Perpetua", Font.ITALIC, 30));
		lblNewLabel_3_8.setBounds(487, 344, 160, 29);
		panel_1.add(lblNewLabel_3_8);
		
		JLabel lblNewLabel_8_8 = new JLabel("Rs.60/-");
		lblNewLabel_8_8.setFont(new Font("Perpetua", Font.ITALIC, 28));
		lblNewLabel_8_8.setBackground(SystemColor.menu);
		lblNewLabel_8_8.setBounds(240, 255, 97, 29);
		panel_1.add(lblNewLabel_8_8);
		
		JLabel lblNewLabel_8_9 = new JLabel("Rs.80/-");
		lblNewLabel_8_9.setFont(new Font("Perpetua", Font.ITALIC, 28));
		lblNewLabel_8_9.setBackground(SystemColor.menu);
		lblNewLabel_8_9.setBounds(240, 286, 97, 29);
		panel_1.add(lblNewLabel_8_9);
		
		JLabel lblNewLabel_8_10 = new JLabel("Rs.90/-");
		lblNewLabel_8_10.setFont(new Font("Perpetua", Font.ITALIC, 28));
		lblNewLabel_8_10.setBackground(SystemColor.menu);
		lblNewLabel_8_10.setBounds(240, 315, 97, 29);
		panel_1.add(lblNewLabel_8_10);
		
		JLabel lblNewLabel_8_11 = new JLabel("Rs.100/-");
		lblNewLabel_8_11.setFont(new Font("Perpetua", Font.ITALIC, 28));
		lblNewLabel_8_11.setBackground(SystemColor.menu);
		lblNewLabel_8_11.setBounds(240, 345, 97, 29);
		panel_1.add(lblNewLabel_8_11);
		
		JLabel lblNewLabel_8_12 = new JLabel("Rs.50/-");
		lblNewLabel_8_12.setFont(new Font("Perpetua", Font.ITALIC, 28));
		lblNewLabel_8_12.setBackground(SystemColor.menu);
		lblNewLabel_8_12.setBounds(678, 255, 97, 29);
		panel_1.add(lblNewLabel_8_12);
		
		JLabel lblNewLabel_8_13 = new JLabel("Rs.80/-");
		lblNewLabel_8_13.setFont(new Font("Perpetua", Font.ITALIC, 28));
		lblNewLabel_8_13.setBackground(SystemColor.menu);
		lblNewLabel_8_13.setBounds(678, 285, 97, 29);
		panel_1.add(lblNewLabel_8_13);
		
		JLabel lblNewLabel_8_14 = new JLabel("Rs.100/-");
		lblNewLabel_8_14.setFont(new Font("Perpetua", Font.ITALIC, 28));
		lblNewLabel_8_14.setBackground(SystemColor.menu);
		lblNewLabel_8_14.setBounds(678, 323, 97, 29);
		panel_1.add(lblNewLabel_8_14);
		
		JLabel lblNewLabel_8_15 = new JLabel("Rs.150/-");
		lblNewLabel_8_15.setFont(new Font("Perpetua", Font.ITALIC, 28));
		lblNewLabel_8_15.setBackground(SystemColor.menu);
		lblNewLabel_8_15.setBounds(678, 353, 97, 29);
		panel_1.add(lblNewLabel_8_15);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(255, 218, 185));
		panel_2.setBorder(new LineBorder(new Color(0, 0, 0), 8));
		panel_2.setBounds(12, 512, 789, 208);
		panel.add(panel_2);
		panel_2.setLayout(null);
		
		JLabel lblNewLabel_4_1 = new JLabel("Drinks");
		lblNewLabel_4_1.setBounds(347, 13, 97, 41);
		panel_2.add(lblNewLabel_4_1);
		lblNewLabel_4_1.setFont(new Font("Perpetua", Font.BOLD | Font.ITALIC, 35));
		
		JLabel lblNewLabel_10 = new JLabel("Tea");
		lblNewLabel_10.setFont(new Font("Perpetua", Font.ITALIC, 33));
		lblNewLabel_10.setBounds(28, 68, 81, 27);
		panel_2.add(lblNewLabel_10);
		
		JLabel lblNewLabel_10_1 = new JLabel("Coffee");
		lblNewLabel_10_1.setFont(new Font("Perpetua", Font.ITALIC, 33));
		lblNewLabel_10_1.setBounds(28, 106, 81, 27);
		panel_2.add(lblNewLabel_10_1);
		
		JLabel lblNewLabel_10_2 = new JLabel("Cold Coffee");
		lblNewLabel_10_2.setFont(new Font("Perpetua", Font.ITALIC, 33));
		lblNewLabel_10_2.setBounds(28, 146, 125, 27);
		panel_2.add(lblNewLabel_10_2);
		
		JLabel lblNewLabel_8_8_1 = new JLabel("Rs.15/-");
		lblNewLabel_8_8_1.setFont(new Font("Perpetua", Font.ITALIC, 28));
		lblNewLabel_8_8_1.setBackground(SystemColor.menu);
		lblNewLabel_8_8_1.setBounds(233, 69, 97, 29);
		panel_2.add(lblNewLabel_8_8_1);
		
		JLabel lblNewLabel_8_8_2 = new JLabel("Rs.40/-");
		lblNewLabel_8_8_2.setFont(new Font("Perpetua", Font.ITALIC, 28));
		lblNewLabel_8_8_2.setBackground(SystemColor.menu);
		lblNewLabel_8_8_2.setBounds(233, 107, 97, 29);
		panel_2.add(lblNewLabel_8_8_2);
		
		JLabel lblNewLabel_8_8_3 = new JLabel("Rs.35/-");
		lblNewLabel_8_8_3.setFont(new Font("Perpetua", Font.ITALIC, 28));
		lblNewLabel_8_8_3.setBackground(SystemColor.menu);
		lblNewLabel_8_8_3.setBounds(233, 144, 97, 29);
		panel_2.add(lblNewLabel_8_8_3);
		
		JLabel lblNewLabel_10_3 = new JLabel("Cold Drinks");
		lblNewLabel_10_3.setFont(new Font("Perpetua", Font.ITALIC, 33));
		lblNewLabel_10_3.setBounds(486, 68, 131, 27);
		panel_2.add(lblNewLabel_10_3);
		
		JLabel lblNewLabel_10_4 = new JLabel("Milkshake");
		lblNewLabel_10_4.setFont(new Font("Perpetua", Font.ITALIC, 33));
		lblNewLabel_10_4.setBounds(486, 109, 125, 27);
		panel_2.add(lblNewLabel_10_4);
		
		JLabel lblNewLabel_10_5 = new JLabel("Juices");
		lblNewLabel_10_5.setFont(new Font("Perpetua", Font.ITALIC, 33));
		lblNewLabel_10_5.setBounds(486, 146, 81, 27);
		panel_2.add(lblNewLabel_10_5);
		
		JLabel lblNewLabel_8_8_1_1 = new JLabel("Rs.35/-");
		lblNewLabel_8_8_1_1.setFont(new Font("Perpetua", Font.ITALIC, 28));
		lblNewLabel_8_8_1_1.setBackground(SystemColor.menu);
		lblNewLabel_8_8_1_1.setBounds(663, 69, 97, 29);
		panel_2.add(lblNewLabel_8_8_1_1);
		
		JLabel lblNewLabel_8_8_1_2 = new JLabel("Rs.50/-");
		lblNewLabel_8_8_1_2.setFont(new Font("Perpetua", Font.ITALIC, 28));
		lblNewLabel_8_8_1_2.setBackground(SystemColor.menu);
		lblNewLabel_8_8_1_2.setBounds(663, 107, 97, 29);
		panel_2.add(lblNewLabel_8_8_1_2);
		
		JLabel lblNewLabel_8_8_1_3 = new JLabel("Rs.45/-");
		lblNewLabel_8_8_1_3.setFont(new Font("Perpetua", Font.ITALIC, 28));
		lblNewLabel_8_8_1_3.setBackground(SystemColor.menu);
		lblNewLabel_8_8_1_3.setBounds(663, 144, 97, 29);
		panel_2.add(lblNewLabel_8_8_1_3);
		
		JButton btnNewButton = new JButton("Place Order");
		btnNewButton.setBackground(new Color(224, 255, 255));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Login l = new Login();
				l.setVisible(true);
				dispose();
			}
		});
		btnNewButton.setFont(new Font("Perpetua", Font.BOLD, 40));
		btnNewButton.setBounds(290, 733, 250, 48);
		panel.add(btnNewButton);
	}
}
