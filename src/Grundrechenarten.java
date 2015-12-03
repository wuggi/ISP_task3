import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridBagLayout;
import java.awt.CardLayout;
import java.awt.GridLayout;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JTextField;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class Grundrechenarten extends JFrame {
	
	public static String calc(String expression) throws ScriptException{
		 ScriptEngineManager mgr = new ScriptEngineManager();
		 ScriptEngine engine = mgr.getEngineByName("JavaScript");
		 return engine.eval(expression).toString();
   } 
	

	private JPanel contentPane;
	private JTextField txt;
	private JTextField last_result;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Grundrechenarten() {
		setTitle("Grundrechenarten");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 870, 604);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton num7 = new JButton("7");
		num7.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				txt.setText(txt.getText()+"7");
			}
		});
		num7.setBounds(284, 262, 45, 34);
		contentPane.add(num7);
		
		JButton num8 = new JButton("8");
		num8.setBounds(339, 262, 45, 34);
		num8.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				txt.setText(txt.getText()+"8");
			}
		});
		contentPane.add(num8);
		
		JButton num9 = new JButton("9");
		num9.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				txt.setText(txt.getText()+"9");
			}
		});
		num9.setBounds(394, 262, 45, 34);
		contentPane.add(num9);
		
		JButton num4 = new JButton("4");
		num4.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				txt.setText(txt.getText()+"4");
			}
		});
		num4.setBounds(284, 307, 45, 34);
		contentPane.add(num4);
		
		JButton num5 = new JButton("5");
		num5.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				txt.setText(txt.getText()+"5");
			}
		});
		num5.setBounds(339, 307, 45, 34);
		contentPane.add(num5);
		
		JButton num6 = new JButton("6");
		num6.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				txt.setText(txt.getText()+"6");
			}
		});
		num6.setBounds(394, 307, 45, 34);
		contentPane.add(num6);
		
		JButton num1 = new JButton("1");
		num1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				txt.setText(txt.getText()+"1");
			}
		});
		num1.setBounds(284, 352, 45, 34);
		contentPane.add(num1);
		
		JButton num2 = new JButton("2");
		num2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				txt.setText(txt.getText()+"2");
			}
		});
		num2.setBounds(339, 352, 45, 34);
		contentPane.add(num2);
		
		JButton num3 = new JButton("3");
		num3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				txt.setText(txt.getText()+"3");
			}
		});
		num3.setBounds(394, 352, 45, 34);
		contentPane.add(num3);
		
		JButton num0 = new JButton("0");
		num0.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				txt.setText(txt.getText()+"0");
			}
		});
		num0.setBounds(284, 397, 100, 34);
		contentPane.add(num0);
		
		JButton point = new JButton(".");
		point.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				txt.setText(txt.getText()+".");
			}
		});
		point.setBounds(394, 397, 45, 34);
		contentPane.add(point);
		
		JButton mult = new JButton("*");
		mult.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		mult.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				txt.setText(txt.getText()+"*");
			}
		});
		mult.setBounds(394, 217, 45, 34);
		contentPane.add(mult);
		
		JButton sub = new JButton("-");
		sub.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				txt.setText(txt.getText()+"-");
			}
		});
		sub.setBounds(449, 217, 45, 34);
		contentPane.add(sub);
		
		JButton add = new JButton("+");
		add.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				txt.setText(txt.getText()+"+");
			}
		});
		add.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		add.setBounds(449, 262, 45, 79);
		contentPane.add(add);
		
		JButton enter = new JButton("=");
		enter.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		enter.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				try {
					last_result.setText(calc(txt.getText()));
				} catch (ScriptException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		enter.setFont(new Font("Tahoma", Font.PLAIN, 11));
		enter.setBounds(449, 352, 45, 79);
		contentPane.add(enter);
		
		JButton divide = new JButton("/");
		divide.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				txt.setText(txt.getText()+"/");
			}
		});
		divide.setBounds(339, 217, 45, 34);
		contentPane.add(divide);
		
		txt = new JTextField();
		txt.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent arg0) {
				if(arg0.getKeyCode()==10){
					try {
						last_result.setText(calc(txt.getText()));
					} catch (ScriptException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
		});
		txt.setBounds(46, 65, 770, 65);
		contentPane.add(txt);
		txt.setColumns(10);
		
		last_result = new JTextField();
		last_result.setEditable(false);
		last_result.setBounds(284, 141, 208, 34);
		contentPane.add(last_result);
		last_result.setColumns(10);
	}
}
