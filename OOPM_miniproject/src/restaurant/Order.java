package restaurant;

import java.awt.BorderLayout;
//import java.awt.EventQueue;
import java.awt.Font;
//import java.awt.GraphicsConfiguration;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
//import java.util.Calendar;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;

import java.awt.Color;
import javax.swing.JTextArea;


public class Order extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField NoOfPizza;
	private JTextField NoOfBurger;
	private JTextField NoOfPasta;
	private JTextField NoOfNoodles;
	private JTextField NoOfCoffee;
	private JTextField NoOfMilkshake;
	private JTextField NoOfColddrinks;
	private JTextField NoOfJuices;
	private JTextField NoOfCold;
	private JTextField NoOfTea;
	private JTextArea Reciept;
	
	public Order(String s , String p ) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 1450, 830);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 239, 213));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 2, 2);
		getContentPane().add(panel);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBackground(new Color(255, 222, 173));
		panel_4.setBorder(new LineBorder(new Color(0, 0, 0), 8));
		panel_4.setBounds(1044, 137, 364, 505);
		getContentPane().add(panel_4);
		panel_4.setLayout(null);
		
		JPanel drinks = new JPanel();
		drinks.setBounds(599, 139, 445, 505);
		panel_4.add(drinks);
		drinks.setBackground(new Color(255, 222, 173));
		drinks.setLayout(null);
		drinks.setBorder(new LineBorder(new Color(0, 0, 0), 8));
		
		JLabel Drinks = new JLabel("Drinks");
		Drinks.setFont(new Font("Perpetua", Font.BOLD, 45));
		Drinks.setBounds(154, 13, 137, 44);
		drinks.add(Drinks);
		
		JLabel Coffee = new JLabel("Coffee");
		Coffee.setFont(new Font("Perpetua", Font.BOLD, 37));
		Coffee.setBounds(26, 400, 109, 38);
		drinks.add(Coffee);
		
		JLabel Milkshake = new JLabel("Milkshake");
		Milkshake.setFont(new Font("Perpetua", Font.BOLD, 37));
		Milkshake.setBounds(26, 164, 191, 36);
		drinks.add(Milkshake);
		
		JLabel Colddrinks = new JLabel("SoftDrinks");
		Colddrinks.setFont(new Font("Perpetua", Font.BOLD, 37));
		Colddrinks.setBounds(26, 230, 191, 40);
		drinks.add(Colddrinks);
		
		JLabel Jucies = new JLabel("Juices");
		Jucies.setFont(new Font("Perpetua", Font.BOLD, 37));
		Jucies.setBounds(26, 293, 138, 36);
		drinks.add(Jucies);
		
		NoOfCoffee = new JTextField();
		NoOfCoffee.setHorizontalAlignment(SwingConstants.CENTER);
		NoOfCoffee.setColumns(10);
		NoOfCoffee.setBounds(239, 406, 171, 34);
		drinks.add(NoOfCoffee);
		
		NoOfMilkshake = new JTextField();
		NoOfMilkshake.setHorizontalAlignment(SwingConstants.CENTER);
		NoOfMilkshake.setColumns(10);
		NoOfMilkshake.setBounds(239, 164, 171, 38);
		drinks.add(NoOfMilkshake);
		
		NoOfColddrinks = new JTextField();
		NoOfColddrinks.setHorizontalAlignment(SwingConstants.CENTER);
		NoOfColddrinks.setColumns(10);
		NoOfColddrinks.setBounds(239, 230, 171, 38);
		drinks.add(NoOfColddrinks);
		
		NoOfJuices = new JTextField();
		NoOfJuices.setHorizontalAlignment(SwingConstants.CENTER);
		NoOfJuices.setColumns(10);
		NoOfJuices.setBounds(239, 296, 171, 38);
		drinks.add(NoOfJuices);
		
		JLabel lblNewLabel_1 = new JLabel("Tea");
		lblNewLabel_1.setFont(new Font("Perpetua", Font.BOLD, 37));
		lblNewLabel_1.setBounds(26, 113, 90, 38);
		drinks.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("ColdCoffee");
		lblNewLabel_2.setFont(new Font("Perpetua", Font.BOLD, 37));
		lblNewLabel_2.setBounds(26, 342, 191, 48);
		drinks.add(lblNewLabel_2);
		
		NoOfCold = new JTextField();
		NoOfCold.setHorizontalAlignment(SwingConstants.CENTER);
		NoOfCold.setBounds(239, 353, 171, 34);
		drinks.add(NoOfCold);
		NoOfCold.setColumns(10);
		
		NoOfTea = new JTextField();
		NoOfTea.setHorizontalAlignment(SwingConstants.CENTER);
		NoOfTea.setBounds(239, 113, 171, 34);
		drinks.add(NoOfTea);
		NoOfTea.setColumns(10);
		
		JPanel meals = new JPanel();
		meals.setBounds(12, 139, 575, 295);
		panel_4.add(meals);
		meals.setBackground(new Color(255, 222, 173));
		meals.setLayout(null);
		meals.setBorder(new LineBorder(new Color(0, 0, 0), 8));
		
		JLabel Meals = new JLabel("Meals");
		Meals.setFont(new Font("Perpetua", Font.BOLD, 45));
		Meals.setBounds(244, 13, 124, 47);
		meals.add(Meals);
		
		JLabel Pizza_1 = new JLabel("Pizza");
		Pizza_1.setFont(new Font("Perpetua", Font.BOLD, 37));
		Pizza_1.setBounds(46, 78, 90, 38);
		meals.add(Pizza_1);
		
		JLabel Burger_1 = new JLabel("Burger");
		Burger_1.setFont(new Font("Perpetua", Font.BOLD, 37));
		Burger_1.setBounds(46, 121, 124, 36);
		meals.add(Burger_1);
		
		JLabel Pasta_1 = new JLabel("Pasta");
		Pasta_1.setFont(new Font("Perpetua", Font.BOLD, 37));
		Pasta_1.setBounds(46, 165, 90, 47);
		meals.add(Pasta_1);
		
		JLabel Noodles_1 = new JLabel("Noodles");
		Noodles_1.setFont(new Font("Perpetua", Font.BOLD, 37));
		Noodles_1.setBounds(46, 215, 138, 36);
		meals.add(Noodles_1);
		
		JComboBox<String> pizzaselect = new JComboBox<String>();
		pizzaselect.setBackground(new Color(255, 235, 205));
		pizzaselect.setFont(new Font("Perpetua", Font.PLAIN, 30));
		pizzaselect.setModel(new DefaultComboBoxModel<String>(new String[] {"Select", "Margarita", "Capsicum", "Mushroom", "Chicken"}));
		pizzaselect.setBounds(228, 78, 124, 38);
		meals.add(pizzaselect);
		
		JComboBox<String> burgerselect = new JComboBox<String>();
		burgerselect.setBackground(new Color(255, 235, 205));
		burgerselect.setFont(new Font("Perpetua", Font.PLAIN, 30));
		burgerselect.setModel(new DefaultComboBoxModel<String>(new String[] {"Select", "Aloo Tikki", "Chicken ", "Egg", "Nachos"}));
		burgerselect.setBounds(228, 124, 124, 38);
		meals.add(burgerselect);
		
		JComboBox<String> pastaselect = new JComboBox<String>();
		pastaselect.setBackground(new Color(255, 235, 205));
		pastaselect.setModel(new DefaultComboBoxModel<String>(new String[] {"Select", "White Sauce", "Red Sauce", "Spinach", "Chicken"}));
		pastaselect.setFont(new Font("Perpetua", Font.PLAIN, 30));
		pastaselect.setBounds(228, 173, 124, 38);
		meals.add(pastaselect);
		
		JComboBox<String> noodlesselect = new JComboBox<String>();
		noodlesselect.setBackground(new Color(255, 235, 205));
		noodlesselect.setModel(new DefaultComboBoxModel<String>(new String[] {"Select", "Schezwan", "Hakka", "Chowmien", "Chicken"}));
		noodlesselect.setFont(new Font("Perpetua", Font.PLAIN, 30));
		noodlesselect.setBounds(228, 218, 124, 38);
		meals.add(noodlesselect);
		
		NoOfPizza = new JTextField();
		NoOfPizza.setHorizontalAlignment(SwingConstants.CENTER);
		NoOfPizza.setColumns(10);
		NoOfPizza.setBounds(414, 78, 116, 38);
		meals.add(NoOfPizza);
		
		NoOfBurger = new JTextField();
		NoOfBurger.setHorizontalAlignment(SwingConstants.CENTER);
		NoOfBurger.setColumns(10);
		NoOfBurger.setBounds(414, 124, 116, 38);
		meals.add(NoOfBurger);
		
		NoOfPasta = new JTextField();
		NoOfPasta.setHorizontalAlignment(SwingConstants.CENTER);
		NoOfPasta.setColumns(10);
		NoOfPasta.setBounds(414, 173, 116, 35);
		meals.add(NoOfPasta);
		
		NoOfNoodles = new JTextField();
		NoOfNoodles.setHorizontalAlignment(SwingConstants.CENTER);
		NoOfNoodles.setColumns(10);
		NoOfNoodles.setBounds(414, 215, 116, 41);
		meals.add(NoOfNoodles);
		
		JPanel panel_1_2 = new JPanel();
		panel_1_2.setBounds(12, 447, 575, 197);
		panel_4.add(panel_1_2);
		panel_1_2.setBackground(new Color(255, 222, 173));
		panel_1_2.setLayout(null);
		panel_1_2.setBorder(new LineBorder(new Color(0, 0, 0), 8));
		
		JLabel CostOfMeals = new JLabel("Cost Of Meals");
		CostOfMeals.setFont(new Font("Perpetua", Font.BOLD, 30));
		CostOfMeals.setBounds(40, 25, 191, 35);
		panel_1_2.add(CostOfMeals);
		
		JLabel CostOfDrinks = new JLabel("Cost Of Drinks");
		CostOfDrinks.setFont(new Font("Perpetua", Font.BOLD, 30));
		CostOfDrinks.setBounds(40, 73, 191, 35);
		panel_1_2.add(CostOfDrinks);
		
		JLabel TotalCost = new JLabel("Total Cost");
		TotalCost.setFont(new Font("Perpetua", Font.BOLD, 30));
		TotalCost.setBounds(40, 129, 148, 35);
		panel_1_2.add(TotalCost);
		
		JLabel Mealscost = new JLabel("");
		Mealscost.setFont(new Font("Perpetua", Font.PLAIN, 24));
		Mealscost.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		Mealscost.setBounds(365, 25, 163, 35);
		panel_1_2.add(Mealscost);
		
		JLabel Drinkscost = new JLabel("");
		Drinkscost.setFont(new Font("Perpetua", Font.PLAIN, 24));
		Drinkscost.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		Drinkscost.setBounds(365, 73, 163, 35);
		panel_1_2.add(Drinkscost);
		
		JLabel Costtotal = new JLabel("");
		Costtotal.setFont(new Font("Perpetua", Font.PLAIN, 24));
		Costtotal.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		Costtotal.setBounds(365, 129, 163, 35);
		panel_1_2.add(Costtotal);
		
		JPanel panel_2 = new JPanel();
		panel_4.add(panel_2);
		panel_2.setBackground(new Color(255, 222, 173));
		panel_2.setLayout(null);
		panel_2.setForeground(Color.BLACK);
		panel_2.setBorder(new LineBorder(new Color(0, 0, 0), 8));
		panel_2.setBounds(12, 652, 1398, 108);
		
		JButton btnNewButton = new JButton("Total");
		btnNewButton.setBackground(new Color(248, 248, 255));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				double sum = 0;
				double Pizza = Double.parseDouble(NoOfPizza.getText());
				double Margarita = 100*Pizza;
				double Capsicum = 70*Pizza;
				double Mushroom = 150*Pizza;
				double Chicken = 200*Pizza;
				if(pizzaselect.getSelectedItem().equals("Margarita")) {
					sum = sum + Margarita;
					String margarita = String.format("%.2f", sum);
					Mealscost.setText(margarita);
				}
				
				if(pizzaselect.getSelectedItem().equals("Capsicum")) {
					sum= sum + Capsicum;
					String capsicum = String.format("%.2f", sum);
					Mealscost.setText(capsicum);
					
				}
				
				if(pizzaselect.getSelectedItem().equals("Mushroom")) {
					sum = sum + Mushroom;
					String mushroom = String.format("%.2f", sum);
					Mealscost.setText(mushroom);
					
				}
				
				if(pizzaselect.getSelectedItem().equals("Chicken")) {
					sum = sum + Chicken;
					String chicken = String.format("%.2f", sum);
					Mealscost.setText(chicken);
					
				}
				
				if(pizzaselect.getSelectedItem().equals("Select")) {
					String sup = String.format("%.2f", sum);
					Mealscost.setText(sup);
				}
				
				double Burger = Double.parseDouble(NoOfBurger.getText());
				double AlooTikki = 90*Burger;
				double Nachos = 130*Burger;
				double Eggs = 100*Burger;
				double Chickenb = 120*Burger;
				
				if(burgerselect.getSelectedItem().equals("Aloo Tikki")) {
					sum = sum+AlooTikki;
					String alootikki = String.format("%.2f", sum);
					Mealscost.setText(alootikki);
				}
				
				if(burgerselect.getSelectedItem().equals("Nachos")) {
					sum = sum+Nachos;
					String nachos = String.format("%.2f", sum);
					Mealscost.setText(nachos);
				}
				
				if(burgerselect.getSelectedItem().equals("Egg")) {
					sum = sum+Eggs;
					String eggs = String.format("%.2f", Eggs);
					Mealscost.setText(eggs);
				}
				
				if(burgerselect.getSelectedItem().equals("Chicken")) {
					sum = sum+Chickenb;
					String chickenb = String.format("%.2f", Chickenb);
					Mealscost.setText(chickenb);
				}
				
				if(burgerselect.getSelectedItem().equals("Select")) {
					String sub = String.format("%.2f", sum);
					Mealscost.setText(sub);
				}
				
				double Pasta = Double.parseDouble(NoOfPasta.getText());
				double White = 60*Pasta;
				double Red = 80*Pasta;
				double Spinach = 90*Pasta;
				double Chickenp = 120*Pasta;
				
				if(pastaselect.getSelectedItem().equals("White Sauce")) {
					sum = sum + White;
					String white = String.format("%.2f", sum );
					Mealscost.setText(white);
				}
				
				if(pastaselect.getSelectedItem().equals("Red Sauce")) {
					sum = sum + Red;
					String red = String.format("%.2f", sum );
					Mealscost.setText(red);
				}
				
				if(pastaselect.getSelectedItem().equals("Spinach")) {
					sum = sum + Spinach;
					String spinach = String.format("%.2f", sum );
					Mealscost.setText(spinach);
				}
				
				if(pastaselect.getSelectedItem().equals("Chicken")) {
					sum = sum + Chickenp;
					String chickenp = String.format("%.2f", sum );
					Mealscost.setText(chickenp);
				}
				
				if(pastaselect.getSelectedItem().equals("Select")) {
					String supa = String.format("%.2f", sum);
					Mealscost.setText(supa);
				}
				
				double Noodles = Double.parseDouble(NoOfNoodles.getText());
				double Chowmien = 50*Noodles;
				double Schezwan = 80*Noodles;
				double Hakka = 100*Noodles;
				double Chickenn = 150*Noodles;
				
				if(noodlesselect.getSelectedItem().equals("Hakka")) {
					sum = sum+Hakka;
					String hakka = String.format("%.2f", sum);
					Mealscost.setText(hakka);
				}
				
				if(noodlesselect.getSelectedItem().equals("Chowmien")) {
					sum = sum+Chowmien;
					String chowmien = String.format("%.2f", sum);
					Mealscost.setText(chowmien);
				}
				
				if(noodlesselect.getSelectedItem().equals("Schezwan")) {
					sum = sum+Schezwan;
					String schezwan = String.format("%.2f", sum);
					Mealscost.setText(schezwan);
				}
				
				if(noodlesselect.getSelectedItem().equals("Chicken")) {
					sum = sum+Chickenn;
					String chickenn = String.format("%.2f", sum);
					Mealscost.setText(chickenn);
				}
				
				if(noodlesselect.getSelectedItem().equals("Select")) {
					String sun = String.format("%.2f", sum);
					Mealscost.setText(sun);
				}
				
				double sumd = 0;
				
				double Coffee = Double.parseDouble(NoOfCoffee.getText());
				double coffee = 40.00f;
				double coffeec;
				coffeec = Coffee * coffee;
				sumd = sumd + coffeec;
				String coffeed = String.format("%.2f",sumd);
				Drinkscost.setText(coffeed);
				
				double Milkshake = Double.parseDouble(NoOfMilkshake.getText());
				double milkshake = 50;
				double milkshakec;
				milkshakec = (Milkshake * milkshake);
				sumd = sumd + milkshakec;
				String milkshaked = String.format("%.2f", sumd);
				Drinkscost.setText(milkshaked);
				
				double Colddrink = Double.parseDouble(NoOfColddrinks.getText());
				double colddrinks = 35;
				double colddrinksc;
				colddrinksc = (Colddrink * colddrinks);
				sumd =sumd +colddrinksc;
				String colddrinksd = String.format("%.2f", sumd);
				Drinkscost.setText(colddrinksd);
				
				double Juice = Double.parseDouble(NoOfJuices.getText());
				double juice = 45;
				double juices;
				juices = (Juice * juice);
				sumd = sumd + juices;
				String juicesd = String.format("%.2f", sumd);
				Drinkscost.setText(juicesd);
				

				Double Tea = Double.parseDouble(NoOfTea.getText());
				double tea = 15;
				double teas;
				teas = Tea * tea;
				sumd = sumd + teas;
				String tead = String.format("%.2f", sumd);
				Drinkscost.setText(tead);
				
				Double Coldcoffee = Double.parseDouble(NoOfCold.getText());
				double coldcoffee = 60;
				double coldcoffees;
				coldcoffees = Coldcoffee * coldcoffee;
				sumd = sumd + coldcoffees;
				String coldcoffed = String.format("%.2f", sumd);
				Drinkscost.setText(coldcoffed);
				
				double mealscost = Double.parseDouble(Mealscost.getText());
				double drinkscost = Double.parseDouble(Drinkscost.getText());
				double total = mealscost + drinkscost ;
				String totald = String.format("%.2f", total);
				Costtotal.setText(totald);
			    
			}
		});
		
		btnNewButton.setFont(new Font("Perpetua", Font.BOLD, 40));
		btnNewButton.setBounds(22, 28, 153, 47);
		panel_2.add(btnNewButton);
		
		JButton btnReciept = new JButton("Reciept");
		btnReciept.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
                
				int refs = 1325 + (int) (Math.random()*4238);
				Calendar timer = Calendar.getInstance();
				timer.getTime();
				SimpleDateFormat tTime = new SimpleDateFormat("HH:mm:ss");
				tTime.format(timer.getTime());
				SimpleDateFormat tdate = new SimpleDateFormat("dd-MM-yyyy");
				tdate.format(timer.getTime());
				
				Reciept.setText("\tYour Bill \n"+"Referance:" 
				+refs+ "\n===============================\n"+
						"Name:  " + s + 
						"\nContact:  "+ p +
						"\n\nMeals:\t\t"+ Mealscost.getText() + "\n\n"+
				         "Drinks:\t\t"+Drinkscost.getText() + "\n\n"+
						"Total Cost:\t\t"+Costtotal.getText() + "\n\n"+
				         "================================"+ "\n" + 
						"Date: "+ tdate.format(timer.getTime())+ 
						"\nTime: "+tTime.format(timer.getTime())+ 
						"\n\tThank You \n\tVisit Again:))");
			}
		});
		
		btnReciept.setBackground(new Color(248, 248, 255));
		btnReciept.setFont(new Font("Perpetua", Font.BOLD, 40));
		btnReciept.setBounds(228, 28, 183, 47);
		panel_2.add(btnReciept);
		
		JButton btnReset = new JButton("Reset");
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				NoOfPizza.setText(null);
				NoOfBurger.setText(null);
				NoOfPasta.setText(null);
				NoOfNoodles.setText(null);
				NoOfTea.setText(null);
				NoOfCold.setText(null);
				NoOfCoffee.setText(null);
				NoOfMilkshake.setText(null);
				NoOfColddrinks.setText(null);
				NoOfJuices.setText(null);
				pizzaselect.setSelectedItem("Select");
				burgerselect.setSelectedItem("Select");
				pastaselect.setSelectedItem("Select");
				noodlesselect.setSelectedItem("Select");
				Mealscost.setText("0");
				Drinkscost.setText("0");
				Costtotal.setText("0");
				Reciept.setText(null);
				
			}
		});
		
		btnReset.setBackground(new Color(248, 248, 255));
		btnReset.setFont(new Font("Perpetua", Font.BOLD, 40));
		btnReset.setBounds(720, 28, 166, 47);
		panel_2.add(btnReset);
		
		JButton btnExit = new JButton("Exit");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				System.exit(0);
				
			}
		});
		
		btnExit.setBackground(new Color(248, 248, 255));
		btnExit.setFont(new Font("Perpetua", Font.BOLD, 40));
		btnExit.setBounds(1196, 28, 153, 47);
		panel_2.add(btnExit);
		
		JButton btnSubmit = new JButton("Submit");
		btnSubmit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
					System.out.println("command completed succesfully");
					String conn = "jdbc:sqlserver://LAPTOP-CN2OJSVF\\SQLEXPRESS;Database=Restaurant;user=sa;password=neha123";
					Connection con = DriverManager.getConnection(conn);
					String query = "insert into details(name, contact, Mealscost, Drinkscost, Total)values(?,?,?,?,?)";
					PreparedStatement pst = con.prepareStatement(query);
					pst.setString(1, s);
					pst.setString(2, p);
					pst.setString(3, Mealscost.getText());
					pst.setString(4, Drinkscost.getText());
					pst.setString(5, Costtotal.getText());
					pst.executeUpdate();
					JOptionPane.showMessageDialog(null, "!!Inserted Data into Database Successfully!!");
				}
				catch(Exception ex) {
					JOptionPane.showMessageDialog(null, ex);
					System.out.println(ex);
				}
			}
		});
		btnSubmit.setBackground(new Color(245, 255, 250));
		btnSubmit.setFont(new Font("Perpetua", Font.BOLD, 40));
		btnSubmit.setBounds(478, 28, 183, 47);
		panel_2.add(btnSubmit);
		
		JButton btnNewButton_1 = new JButton("NewOrder");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Login login = new Login();
				login.setVisible(true);
			    dispose();
			}
		});
		btnNewButton_1.setFont(new Font("Perpetua", Font.BOLD, 40));
		btnNewButton_1.setBounds(935, 28, 219, 47);
		panel_2.add(btnNewButton_1);
		
		JPanel panel_3 = new JPanel();
		panel_4.add(panel_3);
		panel_3.setBackground(new Color(255, 218, 185));
		panel_3.setBorder(new LineBorder(new Color(0, 0, 0), 8));
		panel_3.setBounds(33, 15, 1361, 111);
		panel_3.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Restaurant Billing System");
		lblNewLabel.setFont(new Font("Perpetua", Font.BOLD, 86));
		lblNewLabel.setBounds(210, 13, 946, 85);
		panel_3.add(lblNewLabel);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(255, 222, 173));
		panel_1.setBorder(new LineBorder(new Color(0, 0, 0), 8));
		panel_1.setBounds(1056, 139, 354, 505);
		panel_4.add(panel_1);
		panel_1.setLayout(null);
		
		Reciept = new JTextArea();
		Reciept.setFont(new Font("Perpetua", Font.PLAIN, 22));
		Reciept.setBounds(12, 13, 330, 479);
		panel_1.add(Reciept);
		Reciept.setColumns(10);
	}
	}


