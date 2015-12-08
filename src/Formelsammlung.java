import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.GridBagLayout;
import javax.swing.JTextField;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JSeparator;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Formelsammlung extends JFrame {

	private JPanel contentPane;
	private JTextField value_phi;
	private JTextField value_pi;
	private JTextField value_e;
	private JTextField value_sqrt2;
	private JTextField value_sqrt3;
	private JTextField value_gamma;
	private JTextField value_my;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Formelsammlung frame = new Formelsammlung();
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
	public Formelsammlung() {
		setTitle("Formelsammlung");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 560, 340);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		GridBagLayout gbl_contentPane = new GridBagLayout();
		gbl_contentPane.columnWidths = new int[]{45, 0, 0, 45, 0};
		gbl_contentPane.rowHeights = new int[]{30, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		gbl_contentPane.columnWeights = new double[]{0.0, 0.0, 1.0, 0.0, Double.MIN_VALUE};
		gbl_contentPane.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		contentPane.setLayout(gbl_contentPane);
		
		JLabel lblFormelsammlung = new JLabel("Mathematische Konstanten");
		lblFormelsammlung.setFont(new Font("Tahoma", Font.BOLD, 14));
		GridBagConstraints gbc_lblFormelsammlung = new GridBagConstraints();
		gbc_lblFormelsammlung.anchor = GridBagConstraints.WEST;
		gbc_lblFormelsammlung.insets = new Insets(0, 0, 5, 5);
		gbc_lblFormelsammlung.gridx = 1;
		gbc_lblFormelsammlung.gridy = 0;
		contentPane.add(lblFormelsammlung, gbc_lblFormelsammlung);
		
		JLabel lblPi = new JLabel("Pi (Kreiszahl)");
		GridBagConstraints gbc_lblPi = new GridBagConstraints();
		gbc_lblPi.anchor = GridBagConstraints.WEST;
		gbc_lblPi.insets = new Insets(0, 0, 5, 5);
		gbc_lblPi.gridx = 1;
		gbc_lblPi.gridy = 2;
		contentPane.add(lblPi, gbc_lblPi);
		
		value_pi = new JTextField();
		value_pi.setEditable(false);
		value_pi.setText("3.14159 26535 89793 23846");
		GridBagConstraints gbc_value_pi = new GridBagConstraints();
		gbc_value_pi.fill = GridBagConstraints.HORIZONTAL;
		gbc_value_pi.insets = new Insets(0, 0, 5, 5);
		gbc_value_pi.gridx = 2;
		gbc_value_pi.gridy = 2;
		contentPane.add(value_pi, gbc_value_pi);
		value_pi.setColumns(10);
		
		JLabel lblPhi = new JLabel("Phi (Goldener Schnitt)");
		GridBagConstraints gbc_lblPhi = new GridBagConstraints();
		gbc_lblPhi.anchor = GridBagConstraints.WEST;
		gbc_lblPhi.insets = new Insets(0, 0, 5, 5);
		gbc_lblPhi.gridx = 1;
		gbc_lblPhi.gridy = 3;
		contentPane.add(lblPhi, gbc_lblPhi);
		
		value_phi = new JTextField();
		value_phi.setEditable(false);
		value_phi.setText("1.61803 39887 49894 84820");
		GridBagConstraints gbc_value_phi = new GridBagConstraints();
		gbc_value_phi.fill = GridBagConstraints.HORIZONTAL;
		gbc_value_phi.insets = new Insets(0, 0, 5, 5);
		gbc_value_phi.gridx = 2;
		gbc_value_phi.gridy = 3;
		contentPane.add(value_phi, gbc_value_phi);
		value_phi.setColumns(10);
		
		JLabel lblE = new JLabel("e (Eulersche Zahl)");
		GridBagConstraints gbc_lblE = new GridBagConstraints();
		gbc_lblE.anchor = GridBagConstraints.WEST;
		gbc_lblE.insets = new Insets(0, 0, 5, 5);
		gbc_lblE.gridx = 1;
		gbc_lblE.gridy = 4;
		contentPane.add(lblE, gbc_lblE);
		
		value_e = new JTextField();
		value_e.setText("2.71828 18284 59045 23536");
		value_e.setEditable(false);
		GridBagConstraints gbc_value_e = new GridBagConstraints();
		gbc_value_e.fill = GridBagConstraints.HORIZONTAL;
		gbc_value_e.insets = new Insets(0, 0, 5, 5);
		gbc_value_e.gridx = 2;
		gbc_value_e.gridy = 4;
		contentPane.add(value_e, gbc_value_e);
		value_e.setColumns(10);
		
		JLabel lblSqrt2 = new JLabel("Quadratwurzel von 2");
		GridBagConstraints gbc_lblSqrt2 = new GridBagConstraints();
		gbc_lblSqrt2.anchor = GridBagConstraints.WEST;
		gbc_lblSqrt2.insets = new Insets(0, 0, 5, 5);
		gbc_lblSqrt2.gridx = 1;
		gbc_lblSqrt2.gridy = 5;
		contentPane.add(lblSqrt2, gbc_lblSqrt2);
		
		value_sqrt2 = new JTextField();
		value_sqrt2.setText("1.41421 35623 73095 04880");
		value_sqrt2.setEditable(false);
		GridBagConstraints gbc_value_sqrt2 = new GridBagConstraints();
		gbc_value_sqrt2.fill = GridBagConstraints.HORIZONTAL;
		gbc_value_sqrt2.insets = new Insets(0, 0, 5, 5);
		gbc_value_sqrt2.gridx = 2;
		gbc_value_sqrt2.gridy = 5;
		contentPane.add(value_sqrt2, gbc_value_sqrt2);
		value_sqrt2.setColumns(10);
		
		JLabel lblSqrt3 = new JLabel("Quadratwurzel von 3");
		GridBagConstraints gbc_lblSqrt3 = new GridBagConstraints();
		gbc_lblSqrt3.anchor = GridBagConstraints.WEST;
		gbc_lblSqrt3.insets = new Insets(0, 0, 5, 5);
		gbc_lblSqrt3.gridx = 1;
		gbc_lblSqrt3.gridy = 6;
		contentPane.add(lblSqrt3, gbc_lblSqrt3);
		
		value_sqrt3 = new JTextField();
		value_sqrt3.setText("1.73205 08075 68877 29352");
		value_sqrt3.setEditable(false);
		GridBagConstraints gbc_value_sqrt3 = new GridBagConstraints();
		gbc_value_sqrt3.fill = GridBagConstraints.HORIZONTAL;
		gbc_value_sqrt3.insets = new Insets(0, 0, 5, 5);
		gbc_value_sqrt3.gridx = 2;
		gbc_value_sqrt3.gridy = 6;
		contentPane.add(value_sqrt3, gbc_value_sqrt3);
		value_sqrt3.setColumns(10);
		
		JLabel lblGamma = new JLabel("Gamma (Euler-Mascheroni-Konstante)");
		GridBagConstraints gbc_lblGamma = new GridBagConstraints();
		gbc_lblGamma.anchor = GridBagConstraints.WEST;
		gbc_lblGamma.insets = new Insets(0, 0, 5, 5);
		gbc_lblGamma.gridx = 1;
		gbc_lblGamma.gridy = 7;
		contentPane.add(lblGamma, gbc_lblGamma);
		
		value_gamma = new JTextField();
		value_gamma.setText("0.57721 56649 01532 86060");
		value_gamma.setEditable(false);
		GridBagConstraints gbc_value_gamma = new GridBagConstraints();
		gbc_value_gamma.fill = GridBagConstraints.HORIZONTAL;
		gbc_value_gamma.insets = new Insets(0, 0, 5, 5);
		gbc_value_gamma.gridx = 2;
		gbc_value_gamma.gridy = 7;
		contentPane.add(value_gamma, gbc_value_gamma);
		value_gamma.setColumns(10);
		
		JLabel lblMy = new JLabel("My (Ramanujan-Soldner-Konstante)");
		GridBagConstraints gbc_lblMy = new GridBagConstraints();
		gbc_lblMy.anchor = GridBagConstraints.WEST;
		gbc_lblMy.insets = new Insets(0, 0, 5, 5);
		gbc_lblMy.gridx = 1;
		gbc_lblMy.gridy = 8;
		contentPane.add(lblMy, gbc_lblMy);
		
		value_my = new JTextField();
		value_my.setText("1.45136 92348 83381 05028");
		value_my.setEditable(false);
		GridBagConstraints gbc_value_my = new GridBagConstraints();
		gbc_value_my.fill = GridBagConstraints.HORIZONTAL;
		gbc_value_my.insets = new Insets(0, 0, 5, 5);
		gbc_value_my.gridx = 2;
		gbc_value_my.gridy = 8;
		contentPane.add(value_my, gbc_value_my);
		value_my.setColumns(10);
	}
}
