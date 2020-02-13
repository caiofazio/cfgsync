import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.BorderLayout;
import javax.swing.JList;
import javax.swing.JOptionPane;

import org.apache.commons.io.FileUtils;

import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import java.awt.event.ActionEvent;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.Color;

public class Frame1 {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Frame1 window = new Frame1();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	File fazio_cs = new File("C:/Program Files (x86)/Steam/userdata/156051942/730");
	File fazio_cs1 = new File("C:/Program Files (x86)/Steam/userdata/879347404/730");
	File back = new File("C:/Users/CAIO/Downloads/CFGBackup/fazio_cs/730");
	File back1 = new File("C:/Users/CAIO/Downloads/CFGBackup/fazio_cs1/730");
	Object[] options = { "Confirmar", "Cancelar" };
	private JTextField txtCfgSync;

	/**
	 * Create the application.
	 */
	public Frame1() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setForeground(Color.GREEN);
		frame.setBounds(100, 100, 312, 251);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btnFaziocsFaziocs = new JButton("fazio_cs > fazio_cs1");
		btnFaziocsFaziocs.setBackground(Color.GREEN);
		btnFaziocsFaziocs.setForeground(Color.BLUE);
		btnFaziocsFaziocs.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (0 == JOptionPane.showOptionDialog(null, "Copiar fazio_cs para fazio_cs1?", "Confirmar sincronização", JOptionPane.DEFAULT_OPTION, JOptionPane.WARNING_MESSAGE, null, options, options[0])) {
					try {
					FileUtils.copyDirectory(fazio_cs1, back1);
				} catch (IOException e2) {
					// TODO Auto-generated catch block
					e2.printStackTrace();
				}
					    JOptionPane.showMessageDialog(null, "Backup de fazio_cs1 em C:/Users/CAIO/Downloads/CFGBackup/fazio_cs1");
					try {
					FileUtils.copyDirectory(fazio_cs, fazio_cs1, true);
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				JOptionPane.showMessageDialog(null, "Sincronizado!");
				}
				//JOptionPane.showMessageDialog(null, JOptionPane.showOptionDialog(null, "Copiar fazio_cs para fazio_cs1?", "Confirmar sincronização", JOptionPane.DEFAULT_OPTION, JOptionPane.WARNING_MESSAGE, null, options, options[0]));
				
					
				
				
			}
		});
		btnFaziocsFaziocs.setBounds(36, 49, 235, 23);
		frame.getContentPane().add(btnFaziocsFaziocs);
		
		JButton btnFaziocsFaziocs_1 = new JButton("fazio_cs1 > fazio_cs");
		btnFaziocsFaziocs_1.setBackground(Color.BLUE);
		btnFaziocsFaziocs_1.setForeground(Color.GREEN);
		btnFaziocsFaziocs_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (0 == JOptionPane.showOptionDialog(null, "Copiar fazio_cs1 para fazio_cs?", "Confirmar sincronização", JOptionPane.DEFAULT_OPTION, JOptionPane.WARNING_MESSAGE, null, options, options[0])) {
				    try {
						FileUtils.copyDirectory(fazio_cs, back);
					} catch (IOException e2) {
						// TODO Auto-generated catch block
						e2.printStackTrace();
					}
				    JOptionPane.showMessageDialog(null, "Backup de fazio_cs em C:/Users/CAIO/Downloads/CFGBackup/fazio_cs");
					try {
						FileUtils.copyDirectory(fazio_cs1, fazio_cs, true);
					} catch (IOException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
					JOptionPane.showMessageDialog(null, "Sincronizado!");
					}
		
			}
		});
		btnFaziocsFaziocs_1.setBounds(36, 81, 235, 23);
		frame.getContentPane().add(btnFaziocsFaziocs_1);
		
		txtCfgSync = new JTextField();
		txtCfgSync.setBackground(Color.MAGENTA);
		txtCfgSync.setToolTipText("AAA");
		txtCfgSync.setForeground(Color.WHITE);
		txtCfgSync.setFont(new Font("Source Sans Pro Black", Font.PLAIN, 16));
		txtCfgSync.setHorizontalAlignment(SwingConstants.CENTER);
		txtCfgSync.setEditable(false);
		txtCfgSync.setText("CFG SYNC 666 7777777777777777777");
		txtCfgSync.setBounds(0, 11, 306, 40);
		frame.getContentPane().add(txtCfgSync);
		txtCfgSync.setColumns(20);
		
		JButton btnNewButton = new JButton("Backup");
		btnNewButton.setBackground(Color.RED);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					FileUtils.copyDirectory(fazio_cs, back);
				} catch (IOException e2) {
					// TODO Auto-generated catch block
					e2.printStackTrace();
				}
			    JOptionPane.showMessageDialog(null, "Backup de fazio_cs em C:/Users/CAIO/Downloads/CFGBackup/fazio_cs");
			    try {
					FileUtils.copyDirectory(fazio_cs1, back1);
				} catch (IOException e2) {
					// TODO Auto-generated catch block
					e2.printStackTrace();
				}
					    JOptionPane.showMessageDialog(null, "Backup de fazio_cs1 em C:/Users/CAIO/Downloads/CFGBackup/fazio_cs1");
			}
		});
		btnNewButton.setBounds(104, 120, 101, 23);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("fazio_cs1 recover");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (0 == JOptionPane.showOptionDialog(null, "Recuperar a cfg de fazio_cs1?", "Confirmar recuperação", JOptionPane.DEFAULT_OPTION, JOptionPane.WARNING_MESSAGE, null, options, options[0])) {
				    try {
						FileUtils.copyDirectory(back1, fazio_cs1);
					} catch (IOException e2) {
						// TODO Auto-generated catch block
						e2.printStackTrace();
					}
				    JOptionPane.showMessageDialog(null, "Backup de fazio_cs1 recuperado para \"C:/Program Files (x86)/Steam/userdata/879347404/730\"");
					}
				
				
			}
		});
		btnNewButton_1.setBackground(Color.GREEN);
		btnNewButton_1.setForeground(Color.BLUE);
		btnNewButton_1.setBounds(36, 157, 235, 23);
		frame.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("fazio_cs recover");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (0 == JOptionPane.showOptionDialog(null, "Recuperar a cfg de fazio_cs?", "Confirmar recuperação", JOptionPane.DEFAULT_OPTION, JOptionPane.WARNING_MESSAGE, null, options, options[0])) {
				    try {
						FileUtils.copyDirectory(back, fazio_cs);
					} catch (IOException e2) {
						// TODO Auto-generated catch block
						e2.printStackTrace();
					}
				    JOptionPane.showMessageDialog(null, "Backup de fazio_cs recuperado para \"C:/Program Files (x86)/Steam/userdata/156051942/730\"");
					}
				
				
			
			}
		});
		btnNewButton_2.setBackground(Color.BLUE);
		btnNewButton_2.setForeground(Color.GREEN);
		btnNewButton_2.setBounds(36, 190, 235, 23);
		frame.getContentPane().add(btnNewButton_2);
	}
}
