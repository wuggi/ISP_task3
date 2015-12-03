import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.util.Scanner;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.Color;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextPane;
import java.awt.SystemColor;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Spritrechner extends JFrame {
	
	float res = 0;
	
	private static float calc(int km, float verbrauch, float spritpreis){
		
		float result = km * verbrauch/100 * spritpreis;
		return result;
	}


	private JPanel contentPane;
	private JTextField km_field;
	private JTextField verbrauch_field;
	private JTextField spritpreis_field;
	private JTextField txtZuFahrendeKilometer;
	private JTextField txtVerbrauchL;
	private JTextField txtSpritpreis;
	private JTextField txtSpritrechner;
	private JTextPane textPane;
	private JTextPane result;
	private JButton back_to_menu;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					//Spritrechner_ frame = new Spritrechner_();
					//frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Spritrechner() {
		setTitle("Spritrechner");
		 
		
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 733, 519);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		km_field = new JTextField();
		km_field.setBounds(321, 209, 356, 20);
		km_field.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent arg0) {
				//km = Integer.parseInt(km_field.getText());
			}
		});
		contentPane.setLayout(null);
		contentPane.add(km_field);
		km_field.setColumns(10);
		
		verbrauch_field = new JTextField();
		verbrauch_field.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent arg0) {
				//verbrauch = Float.parseFloat(verbrauch_field.getText());
			}
		});
		verbrauch_field.setBounds(321, 255, 356, 20);
		contentPane.add(verbrauch_field);
		verbrauch_field.setColumns(10);
		
		spritpreis_field = new JTextField();
		spritpreis_field.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent arg0) {
				//spritpreis = Float.parseFloat(spritpreis_field.getText());
			}
		});
		spritpreis_field.setBounds(321, 299, 356, 20);
		contentPane.add(spritpreis_field);
		spritpreis_field.setColumns(10);
		
		txtZuFahrendeKilometer = new JTextField();
		txtZuFahrendeKilometer.setHorizontalAlignment(SwingConstants.RIGHT);
		txtZuFahrendeKilometer.setBackground(Color.LIGHT_GRAY);
		txtZuFahrendeKilometer.setText("Zu fahrende Kilometer:");
		txtZuFahrendeKilometer.setBounds(134, 209, 138, 20);
		contentPane.add(txtZuFahrendeKilometer);
		txtZuFahrendeKilometer.setColumns(10);
		
		txtVerbrauchL = new JTextField();
		txtVerbrauchL.setBackground(Color.LIGHT_GRAY);
		txtVerbrauchL.setHorizontalAlignment(SwingConstants.RIGHT);
		txtVerbrauchL.setText("Verbrauch l/100:");
		txtVerbrauchL.setBounds(134, 255, 138, 20);
		contentPane.add(txtVerbrauchL);
		txtVerbrauchL.setColumns(10);
		
		txtSpritpreis = new JTextField();
		txtSpritpreis.setBackground(Color.LIGHT_GRAY);
		txtSpritpreis.setHorizontalAlignment(SwingConstants.RIGHT);
		txtSpritpreis.setText("Spritpreis:");
		txtSpritpreis.setBounds(134, 299, 138, 20);
		contentPane.add(txtSpritpreis);
		txtSpritpreis.setColumns(10);
		
		txtSpritrechner = new JTextField();
		txtSpritrechner.setEditable(false);
		txtSpritrechner.setFont(new Font("Times New Roman", Font.BOLD, 26));
		txtSpritrechner.setText("Spritrechner");
		txtSpritrechner.setBounds(276, 11, 161, 34);
		contentPane.add(txtSpritrechner);
		txtSpritrechner.setColumns(10);
		
		JButton btnNewButton = new JButton("Calc");
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				System.out.println("CLICK");
				int km = Integer.parseInt(km_field.getText());
				float verbrauch = Float.parseFloat(verbrauch_field.getText());
				float spritpreis = Float.parseFloat(spritpreis_field.getText());
				res = calc(km,verbrauch, spritpreis);
				result.setText(String.valueOf(res));
				
			}
		});
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnNewButton.setBounds(134, 385, 109, 48);
		contentPane.add(btnNewButton);
		
		textPane = new JTextPane();
		textPane.setBounds(321, 429, 116, -44);
		contentPane.add(textPane);
		
		result = new JTextPane();
		result.setBackground(SystemColor.activeCaption);
		result.setBounds(321, 385, 69, 48);
		contentPane.add(result);
		
		back_to_menu = new JButton("Menu");
		back_to_menu.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
			}
		});
		back_to_menu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		back_to_menu.setBounds(581, 391, 96, 36);
		contentPane.add(back_to_menu);
		
		//System.out.println("=========================== SpritRechner ===========================");
		//System.out.println("Kosten: "+calc());
	}
}
