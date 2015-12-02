import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import javax.swing.JTextPane;
import java.awt.Font;
import java.awt.Color;

public class MultifunktionsRechner extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MultifunktionsRechner frame = new MultifunktionsRechner();
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
	public MultifunktionsRechner() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 865, 588);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JButton btnNewButton = new JButton("SpritRechner");
		btnNewButton.setBounds(10, 482, 117, 56);
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				Spritrechner_ frame2 = new Spritrechner_();
				frame2.setVisible(true);
			}
		});
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		contentPane.setLayout(null);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Zinsrechner");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnNewButton_1.setBounds(137, 482, 117, 56);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Grundrechenarten");
		btnNewButton_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Grundrechenarten_ frame1 = new Grundrechenarten_();
				frame1.setVisible(true);
			}
		});
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_2.setBounds(264, 482, 145, 56);
		contentPane.add(btnNewButton_2);
		
		JTextPane txtpnMultifunktionsrechner = new JTextPane();
		txtpnMultifunktionsrechner.setBackground(Color.LIGHT_GRAY);
		txtpnMultifunktionsrechner.setFont(new Font("Times New Roman", Font.BOLD, 27));
		txtpnMultifunktionsrechner.setText("Multifunktionsrechner");
		txtpnMultifunktionsrechner.setBounds(298, 11, 280, 38);
		contentPane.add(txtpnMultifunktionsrechner);
	}
}
