import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JRadioButton;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JList;
import javax.swing.ListSelectionModel;
import javax.swing.AbstractListModel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Font;

public class Einheitenrechner extends JFrame {

	private JPanel contentPane;
	private JTextField field_in;
	private JTextField field_out;
	private JLabel lblIn;
	private JLabel lblOut;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Einheitenrechner frame = new Einheitenrechner();
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
	public Einheitenrechner() {
		setTitle("Einheitenrechner");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 560, 340);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		GridBagLayout gbl_contentPane = new GridBagLayout();
		gbl_contentPane.columnWidths = new int[]{0, 0, 0, 0, 0, 0, 0, 0};
		gbl_contentPane.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0};
		gbl_contentPane.columnWeights = new double[]{0.0, 1.0, 0.0, 1.0, 0.0, 1.0, 0.0, Double.MIN_VALUE};
		gbl_contentPane.rowWeights = new double[]{1.0, 0.0, 1.0, 0.0, 1.0, 1.0, Double.MIN_VALUE};
		contentPane.setLayout(gbl_contentPane);
		
		JLabel lblEinheitenrechner = new JLabel("Einheitenrechner");
		lblEinheitenrechner.setFont(new Font("Tahoma", Font.BOLD, 14));
		GridBagConstraints gbc_lblEinheitenrechner = new GridBagConstraints();
		gbc_lblEinheitenrechner.insets = new Insets(0, 0, 5, 5);
		gbc_lblEinheitenrechner.gridx = 3;
		gbc_lblEinheitenrechner.gridy = 0;
		contentPane.add(lblEinheitenrechner, gbc_lblEinheitenrechner);
		
		lblIn = new JLabel("Eingangswert:");
		GridBagConstraints gbc_lblIn = new GridBagConstraints();
		gbc_lblIn.insets = new Insets(0, 0, 5, 5);
		gbc_lblIn.gridx = 1;
		gbc_lblIn.gridy = 2;
		contentPane.add(lblIn, gbc_lblIn);
		
		field_in = new JTextField();
		field_in.setText("274.15");
		GridBagConstraints gbc_field_in = new GridBagConstraints();
		gbc_field_in.fill = GridBagConstraints.HORIZONTAL;
		gbc_field_in.insets = new Insets(0, 0, 5, 5);
		gbc_field_in.gridx = 3;
		gbc_field_in.gridy = 2;
		contentPane.add(field_in, gbc_field_in);
		field_in.setColumns(10);
		
		JList list_in = new JList();
		list_in.setToolTipText("Ausgangseinheit");
		list_in.setVisibleRowCount(2);
		list_in.setModel(new AbstractListModel() {
			String[] values = new String[] {"Kelvin", "Grad Celsius", "Grad Fahrenheit", "Grad Rankine"};
			public int getSize() {
				return values.length;
			}
			public Object getElementAt(int index) {
				return values[index];
			}
		});
		list_in.setSelectedIndex(0);
		list_in.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		GridBagConstraints gbc_list_in = new GridBagConstraints();
		gbc_list_in.insets = new Insets(0, 0, 5, 5);
		gbc_list_in.gridx = 5;
		gbc_list_in.gridy = 2;
		contentPane.add(list_in, gbc_list_in);
		
		lblOut = new JLabel("Ausgabewert:");
		GridBagConstraints gbc_lblOut = new GridBagConstraints();
		gbc_lblOut.insets = new Insets(0, 0, 5, 5);
		gbc_lblOut.gridx = 1;
		gbc_lblOut.gridy = 4;
		contentPane.add(lblOut, gbc_lblOut);
		
		field_out = new JTextField();
		GridBagConstraints gbc_field_out = new GridBagConstraints();
		gbc_field_out.fill = GridBagConstraints.HORIZONTAL;
		gbc_field_out.insets = new Insets(0, 0, 5, 5);
		gbc_field_out.gridx = 3;
		gbc_field_out.gridy = 4;
		contentPane.add(field_out, gbc_field_out);
		field_out.setColumns(10);
		
		JList list_out = new JList();
		list_out.setValueIsAdjusting(true);
		list_out.setToolTipText("Zieleinheit");
		list_out.setModel(new AbstractListModel() {
			String[] values = new String[] {"Kelvin", "Grad Celsius", "Grad Fahrenheit", "Grad Rankine"};
			public int getSize() {
				return values.length;
			}
			public Object getElementAt(int index) {
				return values[index];
			}
		});
		list_out.setSelectedIndex(1);
		list_out.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		list_out.setVisibleRowCount(2);
		GridBagConstraints gbc_list_out = new GridBagConstraints();
		gbc_list_out.insets = new Insets(0, 0, 5, 5);
		gbc_list_out.gridx = 5;
		gbc_list_out.gridy = 4;
		contentPane.add(list_out, gbc_list_out);
		
		JButton btnBerechnen = new JButton("Berechnen");
		btnBerechnen.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {

				int selected_in = list_in.getSelectedIndex();
				int selected_out = list_out.getSelectedIndex();
				double value = Double.parseDouble(field_in.getText());
				double result = 0;
				if(selected_in==0) {
					if(selected_out==1) {
						result = value-273.15;
					}
					else if(selected_out==2) {
						result = (value*1.8)-459.67;
					}
					else if(selected_out==3) {
						result = value*1.8;
					}
					else {
						result = value;
					}
				}
				if(selected_in==1) {
					if(selected_out==0) {
						result = value+273.15;
					}
					else if(selected_out==2) {
						result = (value*1.8)+32;
					}
					else if(selected_out==3) {
						result = (value*1.8)+32+459.67;
					}
					else {
						result = value;
					}
				}
				if(selected_in==2) {
					if(selected_out==0) {
						result = (value+459.67)/1.8;
					}
					else if(selected_out==1) {
						result = (value-32)/1.8;
					}
					else if(selected_out==3) {
						result = value+459.67;
					}
					else {
						result = value;
					}
				}
				if(selected_in==3) {
					if(selected_out==0) {
						result = value/1.8;
					}
					else if(selected_out==1) {
						result = (value-32-459.67)/1.8;
					}
					else if(selected_out==2) {
						result = value-459.67;
					}
					else {
						result = value;
					}
				}
				
				field_out.setText(String.valueOf(result));
			}
		});
		GridBagConstraints gbc_btnBerechnen = new GridBagConstraints();
		gbc_btnBerechnen.insets = new Insets(0, 0, 0, 5);
		gbc_btnBerechnen.gridx = 3;
		gbc_btnBerechnen.gridy = 5;
		contentPane.add(btnBerechnen, gbc_btnBerechnen);
	}

}
