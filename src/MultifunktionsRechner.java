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
		
		//#if Spritrechner
		JButton btnSpritRechner = new JButton("SpritRechner");
		btnSpritRechner.setBounds(10, 482, 117, 56);
		btnSpritRechner.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				Spritrechner frame2 = new Spritrechner();
				frame2.setVisible(true);
			}
		});
		btnSpritRechner.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		
		contentPane.add(btnSpritRechner);
		//#endif
		contentPane.setLayout(null);
		
		//#if Zinsrechner
		JButton btnZinsrechner = new JButton("Zinsrechner");
		btnZinsrechner.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Zinsrechner frame2 = new Zinsrechner();
				frame2.setVisible(true);
			}
		});
		btnZinsrechner.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnZinsrechner.setBounds(137, 482, 117, 56);
		contentPane.add(btnZinsrechner);
		//#endif
		//#if Grundrechenarten
		JButton btnGrundrechenarten = new JButton("Grundrechenarten");
		btnGrundrechenarten.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Grundrechenarten frame1 = new Grundrechenarten();
				frame1.setVisible(true);
			}
		});
		btnGrundrechenarten.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnGrundrechenarten.setBounds(264, 482, 145, 56);
		contentPane.add(btnGrundrechenarten);
		//#endif
		
		JTextPane txtpnMultifunktionsrechner = new JTextPane();
		txtpnMultifunktionsrechner.setEditable(false);
		txtpnMultifunktionsrechner.setFont(new Font("Times New Roman", Font.BOLD, 26));
		txtpnMultifunktionsrechner.setText("MultifunktionsRechner");
		txtpnMultifunktionsrechner.setBounds(305, 11, 276, 32);
		contentPane.add(txtpnMultifunktionsrechner);
	}
}
