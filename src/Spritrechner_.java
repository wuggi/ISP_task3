import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.util.Scanner;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class Spritrechner_ extends JFrame {
	
	private static float calc(){
		
		int km;
		float verbrauch;
		float spritpreis;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Zu fahrende Kilometer: ");
		km = scan.nextInt();
		
		System.out.println("Verbrauch: ");
		verbrauch = scan.nextFloat();
		
		System.out.println("Spritpreis: ");
		spritpreis = scan.nextFloat();
		
		float result = km * verbrauch/100 * spritpreis;
		scan.close();
		return result;
	}


	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Spritrechner_ frame = new Spritrechner_();
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
	public Spritrechner_() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 733, 519);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		textField = new JTextField();
		textField.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent arg0) {
			}
		});
		contentPane.add(textField, BorderLayout.NORTH);
		textField.setColumns(10);
		
		System.out.println("=========================== SpritRechner ===========================");
		System.out.println("Kosten: "+calc());
	}

}
