package personalportfolio;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class table extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					table frame = new table();
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
	
	public table() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 475);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("\r\n");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				portfolio portfolio = new portfolio();
				portfolio.setVisible(true);
				dispose();
			}
		});
		btnNewButton.setBounds(25, 11, 89, 23);
		btnNewButton.setOpaque(false);
		btnNewButton.setContentAreaFilled(false);
		btnNewButton.setBorderPainted(false);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("\r\n");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				aboutme aboutme = new aboutme();
				aboutme.setVisible(true);
				dispose();
			}
		});
		btnNewButton_1.setBounds(133, 233, 151, 38);
		btnNewButton_1.setOpaque(false);
		btnNewButton_1.setContentAreaFilled(false);
		btnNewButton_1.setBorderPainted(false);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("\r\n");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				hobbies hobbies = new hobbies();
				hobbies.setVisible(true);
				dispose();
			}
		});
		btnNewButton_2.setBounds(336, 233, 151, 38);
		btnNewButton_2.setOpaque(false);
		btnNewButton_2.setContentAreaFilled(false);
		btnNewButton_2.setBorderPainted(false);
		contentPane.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("\r\n");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				skills skills = new skills();
				skills.setVisible(true);
				dispose();
			}
		});
		btnNewButton_3.setBounds(529, 233, 157, 38);
		btnNewButton_3.setOpaque(false);
		btnNewButton_3.setContentAreaFilled(false);
		btnNewButton_3.setBorderPainted(false);
		contentPane.add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("\r\n");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				education education = new education();
				education.setVisible(true);
				dispose();
			}
		});
		btnNewButton_4.setBounds(237, 296, 151, 33);
		btnNewButton_4.setOpaque(false);
		btnNewButton_4.setContentAreaFilled(false);
		btnNewButton_4.setBorderPainted(false);
		contentPane.add(btnNewButton_4);
		
		JButton btnNewButton_5 = new JButton("\r\n");
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				contact contact = new contact();
				contact.setVisible(true);
				dispose();
			}
		});
		btnNewButton_5.setBounds(450, 296, 157, 33);
		btnNewButton_5.setOpaque(false);
		btnNewButton_5.setContentAreaFilled(false);
		btnNewButton_5.setBorderPainted(false);
		contentPane.add(btnNewButton_5);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon("D:\\New folder\\hugo\\College\\PROGRAMMING 3\\2.jpg"));
		lblNewLabel.setBounds(0, 0, 800, 450);
		contentPane.add(lblNewLabel);
	}



}
