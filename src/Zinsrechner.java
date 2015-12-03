import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ButtonGroup;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Zinsrechner extends JFrame {

	private JPanel contentPane;
	private JTextField a_kap;
	private JTextField zins;
	private JTextField lauf;
	private JTextField kapital;
	private JTextField a_kap_txt;
	private JTextField txtZinssatz;
	private JTextField txtLaufzeit;
	private JTextField txtEndkapital;
	private final ButtonGroup buttonGroup = new ButtonGroup();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Zinsrechner frame = new Zinsrechner();
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
	public Zinsrechner() {
		setTitle("Zinsrechner");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 866, 603);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JRadioButton Anfangskapital = new JRadioButton("Anfangskapital berechnen");
		buttonGroup.add(Anfangskapital);
		Anfangskapital.setBounds(544, 162, 191, 23);
		contentPane.add(Anfangskapital);
		
		JRadioButton Zinssatz = new JRadioButton("Zinssatz berechnen");
		buttonGroup.add(Zinssatz);
		Zinssatz.setBounds(544, 204, 191, 23);
		contentPane.add(Zinssatz);
		
		JRadioButton rdbtnLaufzeitBerechnen = new JRadioButton("Laufzeit berechnen");
		buttonGroup.add(rdbtnLaufzeitBerechnen);
		rdbtnLaufzeitBerechnen.setBounds(544, 246, 191, 23);
		contentPane.add(rdbtnLaufzeitBerechnen);
		
		JRadioButton rdbtnEndkapitalBerechnen = new JRadioButton("Endkapital berechnen");
		buttonGroup.add(rdbtnEndkapitalBerechnen);
		rdbtnEndkapitalBerechnen.setBounds(544, 288, 191, 23);
		contentPane.add(rdbtnEndkapitalBerechnen);
		
		a_kap = new JTextField();
		a_kap.setText("5000");
		a_kap.setBounds(287, 163, 201, 22);
		contentPane.add(a_kap);
		a_kap.setColumns(10);
		
		zins = new JTextField();
		zins.setText("4");
		zins.setColumns(10);
		zins.setBounds(287, 205, 201, 22);
		contentPane.add(zins);
		
		lauf = new JTextField();
		lauf.setText("7");
		lauf.setColumns(10);
		lauf.setBounds(287, 247, 201, 22);
		contentPane.add(lauf);
		
		kapital = new JTextField();
		kapital.setColumns(10);
		kapital.setBounds(287, 289, 201, 22);
		contentPane.add(kapital);
		
		a_kap_txt = new JTextField();
		a_kap_txt.setHorizontalAlignment(SwingConstants.RIGHT);
		a_kap_txt.setEditable(false);
		a_kap_txt.setText("Anfangskapital:");
		a_kap_txt.setColumns(10);
		a_kap_txt.setBounds(111, 163, 142, 22);
		contentPane.add(a_kap_txt);
		
		txtZinssatz = new JTextField();
		txtZinssatz.setText("Zinssatz:");
		txtZinssatz.setHorizontalAlignment(SwingConstants.RIGHT);
		txtZinssatz.setEditable(false);
		txtZinssatz.setColumns(10);
		txtZinssatz.setBounds(111, 205, 142, 22);
		contentPane.add(txtZinssatz);
		
		txtLaufzeit = new JTextField();
		txtLaufzeit.setText("Laufzeit:");
		txtLaufzeit.setHorizontalAlignment(SwingConstants.RIGHT);
		txtLaufzeit.setEditable(false);
		txtLaufzeit.setColumns(10);
		txtLaufzeit.setBounds(111, 247, 142, 22);
		contentPane.add(txtLaufzeit);
		
		txtEndkapital = new JTextField();
		txtEndkapital.setText("Endkapital:");
		txtEndkapital.setHorizontalAlignment(SwingConstants.RIGHT);
		txtEndkapital.setEditable(false);
		txtEndkapital.setColumns(10);
		txtEndkapital.setBounds(111, 289, 142, 22);
		contentPane.add(txtEndkapital);
		
		JButton btnNewButton = new JButton("Berechnen");
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				if(rdbtnEndkapitalBerechnen.isSelected()){
					float anfangs_kapital = Float.parseFloat(a_kap.getText());
					float zinssatz = Float.parseFloat(zins.getText());
					int laufzeit = Integer.parseInt(lauf.getText());

					float result = anfangs_kapital;
					for(int i = 0; i<laufzeit; i++ ){
						result = result + ((zinssatz/100)*result);
					}
					kapital.setText(String.valueOf(result));
					
				}else if (rdbtnLaufzeitBerechnen.isSelected()) {
					
					float anfangs_kapital = Float.parseFloat(a_kap.getText());
					float zinssatz = Float.parseFloat(zins.getText());
					float endkapital = Float.parseFloat(kapital.getText());
					
					int result = 0;
					float tmp = anfangs_kapital;
					while(tmp<endkapital){
						System.out.println(tmp+" != "+endkapital);
						tmp = tmp + ((zinssatz/100)*tmp);
						result++;
					}
					lauf.setText(String.valueOf(result));
					
				}else if (Anfangskapital.isSelected()) {
					//TODO korrekt berechnen
					float zinssatz = Float.parseFloat(zins.getText());
					int laufzeit = Integer.parseInt(lauf.getText());
					float endkapital = Float.parseFloat(kapital.getText());
					
					float result = endkapital;
					for(int i=0; i<10;i++){
						result = result - ((zinssatz/100)*result);
						System.out.println(result);
					}
					a_kap.setText(String.valueOf(result));
					
				}else if(Zinssatz.isSelected()){
					
					int laufzeit = Integer.parseInt(lauf.getText());
					float endkapital = Float.parseFloat(kapital.getText());
					float anfangs_kapital = Float.parseFloat(a_kap.getText());
					
					float result = 0;

				}
			}
		});
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton.setBounds(287, 373, 201, 40);
		contentPane.add(btnNewButton);
	}
}
