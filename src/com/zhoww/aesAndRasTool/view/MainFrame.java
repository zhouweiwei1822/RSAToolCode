package com.zhoww.aesAndRasTool.view;

import com.alibaba.fastjson.JSONObject;
import com.zhoww.aesAndRasTool.model.Base64;
import com.zhoww.aesAndRasTool.model.RSACoder;
import org.apache.commons.codec.binary.Hex;


import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import java.awt.Color;
import javax.swing.ImageIcon;
import java.awt.Font;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.LayoutStyle.ComponentPlacement;


import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.io.UnsupportedEncodingException;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;
import javax.swing.JScrollPane;

import static com.zhoww.aesAndRasTool.model.RSACoder.getPrivateKey;
import static com.zhoww.aesAndRasTool.model.RSACoder.getPublicKey;

/**
 * rsaTool 主窗体
 *
 *
 */
public class MainFrame extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField panel_1_textField_1;
	private JLabel   panel_1_label_1,panel_1_label_2,panel_1_label_3;
	private JButton  panel_1_button_1,panel_1_button_2;
	private JScrollPane panel_1_scrollPane_1;
	private JTextArea panel_1_textArea_1;
	private JScrollPane panel_1_scrollPane_2;
	private JTextArea panel_1_textArea_2;
	private JLabel panel_2_label_1;
	private JTextField panel_2_textField_1;
	private JLabel panel_2_label_2;
	private JScrollPane panel_2_scrollPane_1;
	private JTextArea panel_2_textArea_1;
	private JButton panel_2_button_1;
	private JButton panel_2_button_2;
	private JLabel panel_2_label_3;
	private JScrollPane panel_2_scrollPane_2;
	private JTextArea panel_2_textArea_2;
	private JLabel panel_3_label_1;
	private JLabel panel_3_label_2;
	private JLabel panel_3_label_3;
	private JTextField panel_3_textField_1;
	private JScrollPane panel_3_scrollPane_1;
	private JTextArea panel_3_textArea_1;
	private JScrollPane panel_3_scrollPane_2;
	private JTextArea panel_3_textArea_2;
	private JButton panel_3_button_1;
	private JButton panel_3_button_2;
	private JLabel panel_4_label_1;
	private JTextField panel_4_textField_1;
	private JLabel panel_4_label_2;
	private JScrollPane panel_4_scrollPane_1;
	private JTextArea panel_4_textArea_1;
	private JLabel panel_4_label_3;
	private JScrollPane panel_4_scrollPane_2;
	//private JTextArea panel_4_textArea_2;
	private JButton panel_4_button_1;
	private JButton panel_4_button_2;
	private JLabel panel_4_label_4;
	private JLabel panel_4_label_5;



	private JTextField panel_5_textField_1;
	private JLabel   panel_5_label_1,panel_5_label_2,panel_5_label_3;
	private JButton  panel_5_button_1,panel_5_button_2;
	private JScrollPane panel_5_scrollPane_1;
	private JTextArea panel_5_textArea_1;
	private JScrollPane panel_5_scrollPane_2;
	private JTextArea panel_5_textArea_2;
	private JLabel panel_6_label_1;
	private JTextField panel_6_textField_1;
	private JLabel panel_6_label_2;
	private JScrollPane panel_6_scrollPane_1;
	private JTextArea panel_6_textArea_1;
	private JButton panel_6_button_1;
	private JButton panel_6_button_2;
	private JLabel panel_6_label_3;
	private JScrollPane panel_6_scrollPane_2;
	private JTextArea panel_6_textArea_2;



	private JLabel panel_7_label_2;
	private JScrollPane panel_7_scrollPane_1;
	private JTextArea panel_7_textArea_1;
	private JButton panel_7_button_1;
	private JButton panel_7_button_2;
	private JLabel panel_7_label_3;
	private JScrollPane panel_7_scrollPane_2;
	private JTextArea panel_7_textArea_2;


	private JLabel panel_8_label_2;
	private JScrollPane panel_8_scrollPane_1;
	private JTextArea panel_8_textArea_1;
	private JButton panel_8_button_1;
	private JButton panel_8_button_2;
	private JLabel panel_8_label_3;
	private JScrollPane panel_8_scrollPane_2;
	private JTextArea panel_8_textArea_2;



	private JLabel panel_9_label_1;
	private JTextField panel_9_textField_1;
	private JLabel panel_9_label_2;
	private JScrollPane panel_9_scrollPane_1;
	private JTextArea panel_9_textArea_1;
	private JLabel panel_9_label_3;
	private JScrollPane panel_9_scrollPane_2;
	//private JTextArea panel_4_textArea_2;
	private JButton panel_9_button_1;
	private JButton panel_9_button_2;
	private JLabel panel_9_label_4;
	private JLabel panel_9_label_5;
	
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainFrame frame = new MainFrame();
					frame.setVisible(true);
					
					frame.setLocationRelativeTo(null);//主窗体居中
					 
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public MainFrame() {
		setResizable(true);
		//setIconImage(Toolkit.getDefaultToolkit().getImage(MainFrame.class.getResource("/com/tingcream/rsaTool/img/tools_24px.png")));
		setFont(new Font("微软雅黑", Font.PLAIN, 18));
		setBackground(Color.LIGHT_GRAY);
		setTitle("第三事业部AESandRASTool加解密测试小工具");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 900, 514);
		//setBounds(400, 400, 400, 400);
		contentPane = new JPanel();
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setFont(new Font("微软雅黑", Font.PLAIN, 18));
		contentPane.add(tabbedPane, BorderLayout.CENTER);
		
		JPanel panel_1 = new JPanel();
		tabbedPane.addTab("rsa加密", new ImageIcon(MainFrame.class.getResource("/com/zhoww/aesAndRasTool/img/encrypt_3_24px.png")), panel_1, null);
		tabbedPane.setForegroundAt(0, Color.BLACK);
		//tabbedPane.setBackgroundAt(0, Color.WHITE);
		
		 panel_1_label_1 = new JLabel("RSA公钥:");
		panel_1_label_1.setFont(new Font("微软雅黑", Font.PLAIN, 18));
		
		panel_1_textField_1 = new JTextField();
		panel_1_textField_1.setFont(new Font("微软雅黑", Font.PLAIN, 18));
		panel_1_textField_1.setColumns(10);
		
		 panel_1_label_2 = new JLabel("明      文:");
		panel_1_label_2.setHorizontalAlignment(SwingConstants.TRAILING);
		panel_1_label_2.setFont(new Font("微软雅黑", Font.PLAIN, 18));
		
		 panel_1_button_1 = new JButton("加  密");
		 panel_1_button_1.setIcon(new ImageIcon(MainFrame.class.getResource("/com/zhoww/aesAndRasTool/img/encrypt_3_24px.png")));
		 panel_1_button_1.addActionListener(new ActionListener() {
		 	public void actionPerformed(ActionEvent e) {
		 		panel_1_button_1_click(e);
		 	}
		 });
	 
		panel_1_button_1.setFont(new Font("微软雅黑", Font.PLAIN, 18));
		
		 panel_1_label_3 = new JLabel("密      文:");
		panel_1_label_3.setHorizontalAlignment(SwingConstants.TRAILING);
		panel_1_label_3.setFont(new Font("微软雅黑", Font.PLAIN, 18));
		
		 panel_1_button_2 = new JButton("清除明/密文");
		 panel_1_button_2.setIcon(new ImageIcon(MainFrame.class.getResource("/com/zhoww/aesAndRasTool/img/editclear_24px.png")));
		 panel_1_button_2.addActionListener(new ActionListener() {
		 	public void actionPerformed(ActionEvent e) {
		 		panel_1_textArea_1.setText("");
		 		panel_1_textArea_2.setText("");
		 	}
		 });
	 
		panel_1_button_2.setFont(new Font("微软雅黑", Font.PLAIN, 18));
		panel_1_scrollPane_1 = new JScrollPane();
		panel_1_scrollPane_2 = new JScrollPane();
		
		
		GroupLayout gl_panel_1 = new GroupLayout(panel_1);
		gl_panel_1.setHorizontalGroup(
			gl_panel_1.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_1.createSequentialGroup()
					.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel_1.createSequentialGroup()
							.addContainerGap()
							.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING, false)
								.addGroup(gl_panel_1.createSequentialGroup()
									.addComponent(panel_1_label_1)
									.addPreferredGap(ComponentPlacement.UNRELATED)
									.addComponent(panel_1_textField_1))
								.addGroup(gl_panel_1.createSequentialGroup()
									.addComponent(panel_1_label_2, GroupLayout.PREFERRED_SIZE, 75, GroupLayout.PREFERRED_SIZE)
									.addGap(16)
									.addComponent(panel_1_scrollPane_1, GroupLayout.PREFERRED_SIZE, 449, GroupLayout.PREFERRED_SIZE))))
						.addGroup(gl_panel_1.createSequentialGroup()
							.addGap(20)
							.addComponent(panel_1_label_3, GroupLayout.PREFERRED_SIZE, 75, GroupLayout.PREFERRED_SIZE)
							.addGap(13)
							.addComponent(panel_1_scrollPane_2, GroupLayout.PREFERRED_SIZE, 449, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_panel_1.createSequentialGroup()
							.addGap(105)
							.addComponent(panel_1_button_1)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(panel_1_button_2)))
					.addContainerGap(51, Short.MAX_VALUE))
		);
		gl_panel_1.setVerticalGroup(
			gl_panel_1.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_1.createSequentialGroup()
					.addGap(24)
					.addGroup(gl_panel_1.createParallelGroup(Alignment.BASELINE)
						.addComponent(panel_1_label_1)
						.addComponent(panel_1_textField_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(28)
					.addGroup(gl_panel_1.createParallelGroup(Alignment.TRAILING)
						.addGroup(gl_panel_1.createSequentialGroup()
							.addComponent(panel_1_label_2, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE)
							.addGap(102))
						.addGroup(gl_panel_1.createSequentialGroup()
							.addComponent(panel_1_scrollPane_1, GroupLayout.PREFERRED_SIZE, 109, GroupLayout.PREFERRED_SIZE)
							.addGap(16)))
					.addGroup(gl_panel_1.createParallelGroup(Alignment.BASELINE)
						.addComponent(panel_1_button_1)
						.addComponent(panel_1_button_2, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE))
					.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel_1.createSequentialGroup()
							.addGap(22)
							.addComponent(panel_1_label_3, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_panel_1.createSequentialGroup()
							.addGap(24)
							.addComponent(panel_1_scrollPane_2, GroupLayout.PREFERRED_SIZE, 109, GroupLayout.PREFERRED_SIZE)))
					.addContainerGap(28, Short.MAX_VALUE))
		);
		
		panel_1_textArea_2 = new JTextArea();
		panel_1_textArea_2.setFont(new Font("微软雅黑", Font.PLAIN, 18));
		panel_1_scrollPane_2.setViewportView(panel_1_textArea_2);
		
		panel_1_textArea_1 = new JTextArea();
		panel_1_textArea_1.setFont(new Font("微软雅黑", Font.PLAIN, 18));
		panel_1_scrollPane_1.setViewportView(panel_1_textArea_1);
		panel_1.setLayout(gl_panel_1);
		tabbedPane.setForegroundAt(0, Color.BLACK);
		JPanel panel_2 = new JPanel();
		panel_2.setForeground(Color.WHITE);
		tabbedPane.addTab("rsa解密", new ImageIcon(MainFrame.class.getResource("/com/zhoww/aesAndRasTool/img/decrypted_24px.png")), panel_2, null);
		
		panel_2_label_1 = new JLabel("RSA私钥:");
		panel_2_label_1.setFont(new Font("微软雅黑", Font.PLAIN, 18));
		
		panel_2_textField_1 = new JTextField();
		panel_2_textField_1.setFont(new Font("微软雅黑", Font.PLAIN, 18));
		panel_2_textField_1.setColumns(10);
		
		panel_2_label_2 = new JLabel(" 密      文:");
		panel_2_label_2.setFont(new Font("微软雅黑", Font.PLAIN, 18));
		
		panel_2_scrollPane_1 = new JScrollPane();
		
		panel_2_button_1 = new JButton("解  密");
		panel_2_button_1.setIcon(new ImageIcon(MainFrame.class.getResource("/com/zhoww/aesAndRasTool/img/decrypted_24px.png")));
		panel_2_button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panel_2_button_1_click(e);
			}
		});
		panel_2_button_1.setFont(new Font("微软雅黑", Font.PLAIN, 18));
		
		panel_2_button_2 = new JButton("清除明/密文");
		panel_2_button_2.setIcon(new ImageIcon(MainFrame.class.getResource("/com/zhoww/aesAndRasTool/img/editclear_24px.png")));
		panel_2_button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panel_2_textArea_1.setText("");
				panel_2_textArea_2.setText("");
			}
		});
		panel_2_button_2.setFont(new Font("微软雅黑", Font.PLAIN, 18));
		
		panel_2_label_3 = new JLabel(" 明      文:");
		panel_2_label_3.setFont(new Font("微软雅黑", Font.PLAIN, 18));
		
		panel_2_scrollPane_2 = new JScrollPane();
 
		
		
		GroupLayout gl_panel_2 = new GroupLayout(panel_2);
		gl_panel_2.setHorizontalGroup(
			gl_panel_2.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_2.createSequentialGroup()
					.addGroup(gl_panel_2.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel_2.createSequentialGroup()
							.addContainerGap()
							.addGroup(gl_panel_2.createParallelGroup(Alignment.LEADING, false)
								.addGroup(gl_panel_2.createSequentialGroup()
									.addComponent(panel_2_label_1)
									.addPreferredGap(ComponentPlacement.UNRELATED)
									.addComponent(panel_2_textField_1))
								.addGroup(gl_panel_2.createSequentialGroup()
									.addComponent(panel_2_label_2, GroupLayout.PREFERRED_SIZE, 75, GroupLayout.PREFERRED_SIZE)
									.addGap(16)
									.addComponent(panel_2_scrollPane_1, GroupLayout.PREFERRED_SIZE, 449, GroupLayout.PREFERRED_SIZE))))
						.addGroup(gl_panel_2.createSequentialGroup()
							.addGap(20)
							.addComponent(panel_2_label_3, GroupLayout.PREFERRED_SIZE, 75, GroupLayout.PREFERRED_SIZE)
							.addGap(13)
							.addComponent(panel_2_scrollPane_2, GroupLayout.PREFERRED_SIZE, 449, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_panel_2.createSequentialGroup()
							.addGap(105)
							.addComponent(panel_2_button_1)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(panel_2_button_2)))
					.addContainerGap(51, Short.MAX_VALUE))
		);
		gl_panel_2.setVerticalGroup(
			gl_panel_2.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_2.createSequentialGroup()
					.addGap(24)
					.addGroup(gl_panel_2.createParallelGroup(Alignment.BASELINE)
						.addComponent(panel_2_label_1)
						.addComponent(panel_2_textField_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(28)
					.addGroup(gl_panel_2.createParallelGroup(Alignment.TRAILING)
						.addGroup(gl_panel_2.createSequentialGroup()
							.addComponent(panel_2_label_2, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE)
							.addGap(102))
						.addGroup(gl_panel_2.createSequentialGroup()
							.addComponent(panel_2_scrollPane_1, GroupLayout.PREFERRED_SIZE, 109, GroupLayout.PREFERRED_SIZE)
							.addGap(16)))
					.addGroup(gl_panel_2.createParallelGroup(Alignment.BASELINE)
						.addComponent(panel_2_button_1)
						.addComponent(panel_2_button_2, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE))
					.addGroup(gl_panel_2.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel_2.createSequentialGroup()
							.addGap(22)
							.addComponent(panel_2_label_3, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_panel_2.createSequentialGroup()
							.addGap(24)
							.addComponent(panel_2_scrollPane_2, GroupLayout.PREFERRED_SIZE, 109, GroupLayout.PREFERRED_SIZE)))
					.addContainerGap(28, Short.MAX_VALUE))
		);
		
		
		
		panel_2_textArea_2 = new JTextArea();
		panel_2_textArea_2.setFont(new Font("微软雅黑", Font.PLAIN, 18));
		panel_2_scrollPane_2.setViewportView(panel_2_textArea_2);
		
		panel_2_textArea_1 = new JTextArea();
		panel_2_textArea_1.setFont(new Font("微软雅黑", Font.PLAIN, 18));
		panel_2_scrollPane_1.setViewportView(panel_2_textArea_1);
		panel_2.setLayout(gl_panel_2);
		tabbedPane.setForegroundAt(1, Color.BLACK);
		//tabbedPane.setForegroundAt(2, Color.BLACK);
		JPanel panel_3 = new JPanel();
		tabbedPane.addTab("rsa签名", new ImageIcon(MainFrame.class.getResource("/com/zhoww/aesAndRasTool/img/ok_signature_24px.png")), panel_3, null);
		
		panel_3_label_1 = new JLabel("RSA私钥:");
		panel_3_label_1.setFont(new Font("微软雅黑", Font.PLAIN, 18));
		
		panel_3_label_2 = new JLabel(" 明      文:");
		panel_3_label_2.setFont(new Font("微软雅黑", Font.PLAIN, 18));
		
		panel_3_label_3 = new JLabel(" 签 名 值:");
		panel_3_label_3.setFont(new Font("微软雅黑", Font.PLAIN, 18));
		
		panel_3_textField_1 = new JTextField();
		panel_3_textField_1.setFont(new Font("微软雅黑", Font.PLAIN, 18));
		panel_3_textField_1.setColumns(10);
		
		panel_3_scrollPane_1 = new JScrollPane();
		
		panel_3_scrollPane_2 = new JScrollPane();
		
		panel_3_button_1 = new JButton("签  名");
		panel_3_button_1.setIcon(new ImageIcon(MainFrame.class.getResource("/com/zhoww/aesAndRasTool/img/ok_signature_24px.png")));
		panel_3_button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				panel_3_button_1_click(e);
			}
		});
		panel_3_button_1.setFont(new Font("微软雅黑", Font.PLAIN, 18));
		
		panel_3_button_2 = new JButton("清除明文/签名值");
		panel_3_button_2.setIcon(new ImageIcon(MainFrame.class.getResource("/com/zhoww/aesAndRasTool/img/editclear_24px.png")));
		panel_3_button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panel_3_textArea_1.setText("");
				panel_3_textArea_2.setText("");
			}
		});
		panel_3_button_2.setFont(new Font("微软雅黑", Font.PLAIN, 18));
		
		GroupLayout gl_panel_3 = new GroupLayout(panel_3);
		gl_panel_3.setHorizontalGroup(
			gl_panel_3.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_3.createSequentialGroup()
					.addGroup(gl_panel_3.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel_3.createSequentialGroup()
							.addContainerGap()
							.addGroup(gl_panel_3.createParallelGroup(Alignment.LEADING, false)
								.addGroup(gl_panel_3.createSequentialGroup()
									.addComponent(panel_3_label_1)
									.addPreferredGap(ComponentPlacement.UNRELATED)
									.addComponent(panel_3_textField_1))
								.addGroup(gl_panel_3.createSequentialGroup()
									.addComponent(panel_3_label_2, GroupLayout.PREFERRED_SIZE, 75, GroupLayout.PREFERRED_SIZE)
									.addGap(16)
									.addComponent(panel_3_scrollPane_1, GroupLayout.PREFERRED_SIZE, 449, GroupLayout.PREFERRED_SIZE))))
						.addGroup(gl_panel_3.createSequentialGroup()
							.addGap(20)
							.addComponent(panel_3_label_3, GroupLayout.PREFERRED_SIZE, 75, GroupLayout.PREFERRED_SIZE)
							.addGap(13)
							.addComponent(panel_3_scrollPane_2, GroupLayout.PREFERRED_SIZE, 449, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_panel_3.createSequentialGroup()
							.addGap(105)
							.addComponent(panel_3_button_1)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(panel_3_button_2)))
					.addContainerGap(51, Short.MAX_VALUE))
		);
		gl_panel_3.setVerticalGroup(
			gl_panel_3.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_3.createSequentialGroup()
					.addGap(24)
					.addGroup(gl_panel_3.createParallelGroup(Alignment.BASELINE)
						.addComponent(panel_3_label_1)
						.addComponent(panel_3_textField_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(28)
					.addGroup(gl_panel_3.createParallelGroup(Alignment.TRAILING)
						.addGroup(gl_panel_3.createSequentialGroup()
							.addComponent(panel_3_label_2, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE)
							.addGap(102))
						.addGroup(gl_panel_3.createSequentialGroup()
							.addComponent(panel_3_scrollPane_1, GroupLayout.PREFERRED_SIZE, 109, GroupLayout.PREFERRED_SIZE)
							.addGap(16)))
					.addGroup(gl_panel_3.createParallelGroup(Alignment.BASELINE)
						.addComponent(panel_3_button_1)
						.addComponent(panel_3_button_2, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE))
					.addGroup(gl_panel_3.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel_3.createSequentialGroup()
							.addGap(22)
							.addComponent(panel_3_label_3, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_panel_3.createSequentialGroup()
							.addGap(24)
							.addComponent(panel_3_scrollPane_2, GroupLayout.PREFERRED_SIZE, 109, GroupLayout.PREFERRED_SIZE)))
					.addContainerGap(28, Short.MAX_VALUE))
		);
		
		
		
		panel_3_textArea_2 = new JTextArea();
		panel_3_textArea_2.setFont(new Font("微软雅黑", Font.PLAIN, 18));
		panel_3_scrollPane_2.setViewportView(panel_3_textArea_2);
		
		panel_3_textArea_1 = new JTextArea();
		panel_3_textArea_1.setFont(new Font("微软雅黑", Font.PLAIN, 18));
		panel_3_scrollPane_1.setViewportView(panel_3_textArea_1);
		panel_3.setLayout(gl_panel_3);
		tabbedPane.setForegroundAt(2, Color.BLACK);
		
		JPanel panel_4 = new JPanel();
		tabbedPane.addTab("rsa验签respMsg为中文", new ImageIcon(MainFrame.class.getResource("/com/zhoww/aesAndRasTool/img/verified_user_24px.png")), panel_4, null);
		
		panel_4_label_1 = new JLabel("RSA公钥:");
		panel_4_label_1.setFont(new Font("微软雅黑", Font.PLAIN, 18));
		
		panel_4_textField_1 = new JTextField();
		panel_4_textField_1.setFont(new Font("微软雅黑", Font.PLAIN, 18));
		panel_4_textField_1.setColumns(10);
		
		panel_4_label_2 = new JLabel(" 明      文:");
		panel_4_label_2.setFont(new Font("微软雅黑", Font.PLAIN, 18));
		
		panel_4_scrollPane_1 = new JScrollPane();
		
		/*panel_4_label_3 = new JLabel(" 签 名 值:");
		panel_4_label_3.setFont(new Font("微软雅黑", Font.PLAIN, 18));*/
		
		//panel_4_scrollPane_2 = new JScrollPane();
		
		panel_4_button_1 = new JButton("验  签");
		panel_4_button_1.setIcon(new ImageIcon(MainFrame.class.getResource("/com/zhoww/aesAndRasTool/img/verified_user_24px.png")));
		panel_4_button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panel_4_button_1_click(e);
			}
		});
		panel_4_button_1.setFont(new Font("微软雅黑", Font.PLAIN, 18));
		
		panel_4_button_2 = new JButton("清除明文/签名值");
		panel_4_button_2.setIcon(new ImageIcon(MainFrame.class.getResource("/com/zhoww/aesAndRasTool/img/editclear_24px.png")));
		panel_4_button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panel_4_textArea_1.setText("");
				/*panel_4_textArea_2.setText("");*/
			}
		});
		panel_4_button_2.setFont(new Font("微软雅黑", Font.PLAIN, 18));
		
		panel_4_label_4 = new JLabel(" 验签结果:");
		panel_4_label_4.setFont(new Font("微软雅黑", Font.PLAIN, 18));
		
		panel_4_label_5 = new JLabel("");
		panel_4_label_5.setFont(new Font("微软雅黑", Font.PLAIN, 18));
		GroupLayout gl_panel_4 = new GroupLayout(panel_4);
		gl_panel_4.setHorizontalGroup(
			gl_panel_4.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_4.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_panel_4.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel_4.createSequentialGroup()
							.addComponent(panel_4_label_1)
							.addGap(18)
							.addComponent(panel_4_textField_1, GroupLayout.PREFERRED_SIZE, 446, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_panel_4.createSequentialGroup()
							.addComponent(panel_4_label_2, GroupLayout.PREFERRED_SIZE, 75, GroupLayout.PREFERRED_SIZE)
							.addGap(18)
							.addComponent(panel_4_scrollPane_1, GroupLayout.PREFERRED_SIZE, 446, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_panel_4.createSequentialGroup()
							/*.addComponent(panel_4_label_3, GroupLayout.PREFERRED_SIZE, 75, GroupLayout.PREFERRED_SIZE)*/
							.addGap(18)
							.addGroup(gl_panel_4.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_panel_4.createSequentialGroup()
									.addComponent(panel_4_button_1)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(panel_4_button_2, GroupLayout.PREFERRED_SIZE, 210, GroupLayout.PREFERRED_SIZE))
								/*.addComponent(panel_4_scrollPane_2, GroupLayout.PREFERRED_SIZE, 446, GroupLayout.PREFERRED_SIZE)*/))
						.addGroup(gl_panel_4.createSequentialGroup()
							.addComponent(panel_4_label_4, GroupLayout.PREFERRED_SIZE, 92, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(panel_4_label_5)))
					.addContainerGap(70, Short.MAX_VALUE))
		);
		gl_panel_4.setVerticalGroup(
			gl_panel_4.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_4.createSequentialGroup()
					.addGap(27)
					.addGroup(gl_panel_4.createParallelGroup(Alignment.BASELINE)
						.addComponent(panel_4_label_1)
						.addComponent(panel_4_textField_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(gl_panel_4.createParallelGroup(Alignment.LEADING)
						.addComponent(panel_4_label_2, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE)
						.addComponent(panel_4_scrollPane_1, GroupLayout.PREFERRED_SIZE, 109, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					/*.addGroup(gl_panel_4.createParallelGroup(Alignment.LEADING)
						.addComponent(panel_4_scrollPane_2, GroupLayout.PREFERRED_SIZE, 108, GroupLayout.PREFERRED_SIZE)
						*//*.addComponent(panel_4_label_3, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE)*//*)
					.addGap(18)*/
					.addGroup(gl_panel_4.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel_4.createSequentialGroup()
							.addComponent(panel_4_button_1)
							.addGap(25)
							.addGroup(gl_panel_4.createParallelGroup(Alignment.BASELINE)
								.addComponent(panel_4_label_4, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE)
								.addComponent(panel_4_label_5)))
						.addComponent(panel_4_button_2, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE))
					.addContainerGap(26, Short.MAX_VALUE))
		);
		
		///panel_4_textArea_2 = new JTextArea();
		//panel_4_textArea_2.setFont(new Font("微软雅黑", Font.PLAIN, 18));
		//panel_4_scrollPane_2.setViewportView(panel_4_textArea_2);
		
		panel_4_textArea_1 = new JTextArea();
		panel_4_textArea_1.setFont(new Font("微软雅黑", Font.PLAIN, 18));
		panel_4_scrollPane_1.setViewportView(panel_4_textArea_1);
		panel_4.setLayout(gl_panel_4);
		tabbedPane.setForegroundAt(2, Color.BLACK);


		JPanel panel_5 = new JPanel();
		tabbedPane.addTab("AES加密", new ImageIcon(MainFrame.class.getResource("/com/zhoww/aesAndRasTool/img/encrypt_3_24px.png")), panel_5, null);

		panel_5_label_1 = new JLabel("AES密钥:");
		panel_5_label_1.setFont(new Font("微软雅黑", Font.PLAIN, 18));

		panel_5_textField_1 = new JTextField();
		panel_5_textField_1.setFont(new Font("微软雅黑", Font.PLAIN, 18));
		panel_5_textField_1.setColumns(10);

		panel_5_label_2 = new JLabel("明      文:");
		panel_5_label_2.setHorizontalAlignment(SwingConstants.TRAILING);
		panel_5_label_2.setFont(new Font("微软雅黑", Font.PLAIN, 18));

		panel_5_button_1 = new JButton("加  密");
		panel_5_button_1.setIcon(new ImageIcon(MainFrame.class.getResource("/com/zhoww/aesAndRasTool/img/encrypt_3_24px.png")));
		panel_5_button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panel_5_button_1_click(e);
			}
		});

		panel_5_button_1.setFont(new Font("微软雅黑", Font.PLAIN, 18));

		panel_5_label_3 = new JLabel("密      文:");
		panel_5_label_3.setHorizontalAlignment(SwingConstants.TRAILING);
		panel_5_label_3.setFont(new Font("微软雅黑", Font.PLAIN, 18));

		panel_5_button_2 = new JButton("清除明/密文");
		panel_5_button_2.setIcon(new ImageIcon(MainFrame.class.getResource("/com/zhoww/aesAndRasTool/img/editclear_24px.png")));
		panel_5_button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panel_5_textArea_1.setText("");
				panel_5_textArea_2.setText("");
			}
		});

		panel_5_button_2.setFont(new Font("微软雅黑", Font.PLAIN, 18));
		panel_5_scrollPane_1 = new JScrollPane();
		panel_5_scrollPane_2 = new JScrollPane();


		GroupLayout gl_panel_5 = new GroupLayout(panel_5);
		gl_panel_5.setHorizontalGroup(
				gl_panel_5.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel_5.createSequentialGroup()
								.addGroup(gl_panel_5.createParallelGroup(Alignment.LEADING)
										.addGroup(gl_panel_5.createSequentialGroup()
												.addContainerGap()
												.addGroup(gl_panel_5.createParallelGroup(Alignment.LEADING, false)
														.addGroup(gl_panel_5.createSequentialGroup()
																.addComponent(panel_5_label_1)
																.addPreferredGap(ComponentPlacement.UNRELATED)
																.addComponent(panel_5_textField_1))
														.addGroup(gl_panel_5.createSequentialGroup()
																.addComponent(panel_5_label_2, GroupLayout.PREFERRED_SIZE, 75, GroupLayout.PREFERRED_SIZE)
																.addGap(16)
																.addComponent(panel_5_scrollPane_1, GroupLayout.PREFERRED_SIZE, 449, GroupLayout.PREFERRED_SIZE))))
										.addGroup(gl_panel_5.createSequentialGroup()
												.addGap(20)
												.addComponent(panel_5_label_3, GroupLayout.PREFERRED_SIZE, 75, GroupLayout.PREFERRED_SIZE)
												.addGap(13)
												.addComponent(panel_5_scrollPane_2, GroupLayout.PREFERRED_SIZE, 449, GroupLayout.PREFERRED_SIZE))
										.addGroup(gl_panel_5.createSequentialGroup()
												.addGap(105)
												.addComponent(panel_5_button_1)
												.addPreferredGap(ComponentPlacement.RELATED)
												.addComponent(panel_5_button_2)))
								.addContainerGap(51, Short.MAX_VALUE))
		);
		gl_panel_5.setVerticalGroup(
				gl_panel_5.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel_5.createSequentialGroup()
								.addGap(24)
								.addGroup(gl_panel_5.createParallelGroup(Alignment.BASELINE)
										.addComponent(panel_5_label_1)
										.addComponent(panel_5_textField_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
								.addGap(28)
								.addGroup(gl_panel_5.createParallelGroup(Alignment.TRAILING)
										.addGroup(gl_panel_5.createSequentialGroup()
												.addComponent(panel_5_label_2, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE)
												.addGap(102))
										.addGroup(gl_panel_5.createSequentialGroup()
												.addComponent(panel_5_scrollPane_1, GroupLayout.PREFERRED_SIZE, 109, GroupLayout.PREFERRED_SIZE)
												.addGap(16)))
								.addGroup(gl_panel_5.createParallelGroup(Alignment.BASELINE)
										.addComponent(panel_5_button_1)
										.addComponent(panel_5_button_2, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE))
								.addGroup(gl_panel_5.createParallelGroup(Alignment.LEADING)
										.addGroup(gl_panel_5.createSequentialGroup()
												.addGap(22)
												.addComponent(panel_5_label_3, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE))
										.addGroup(gl_panel_5.createSequentialGroup()
												.addGap(24)
												.addComponent(panel_5_scrollPane_2, GroupLayout.PREFERRED_SIZE, 109, GroupLayout.PREFERRED_SIZE)))
								.addContainerGap(28, Short.MAX_VALUE))
		);

		panel_5_textArea_2 = new JTextArea();
		panel_5_textArea_2.setFont(new Font("微软雅黑", Font.PLAIN, 18));
		panel_5_scrollPane_2.setViewportView(panel_5_textArea_2);

		panel_5_textArea_1 = new JTextArea();
		panel_5_textArea_1.setFont(new Font("微软雅黑", Font.PLAIN, 18));
		panel_5_scrollPane_1.setViewportView(panel_5_textArea_1);
		panel_5.setLayout(gl_panel_5);
		tabbedPane.setForegroundAt(2, Color.BLACK);
		JPanel panel_6 = new JPanel();
		panel_6.setForeground(Color.WHITE);
		tabbedPane.addTab("AES解密", new ImageIcon(MainFrame.class.getResource("/com/zhoww/aesAndRasTool/img/decrypted_24px.png")), panel_6, null);

		panel_6_label_1 = new JLabel("AES密钥:");
		panel_6_label_1.setFont(new Font("微软雅黑", Font.PLAIN, 18));

		panel_6_textField_1 = new JTextField();
		panel_6_textField_1.setFont(new Font("微软雅黑", Font.PLAIN, 18));
		panel_6_textField_1.setColumns(10);

		panel_6_label_2 = new JLabel(" 密      文:");
		panel_6_label_2.setFont(new Font("微软雅黑", Font.PLAIN, 18));

		panel_6_scrollPane_1 = new JScrollPane();

		panel_6_button_1 = new JButton("解  密");
		panel_6_button_1.setIcon(new ImageIcon(MainFrame.class.getResource("/com/zhoww/aesAndRasTool/img/decrypted_24px.png")));
		panel_6_button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panel_6_button_1_click(e);
			}
		});
		panel_6_button_1.setFont(new Font("微软雅黑", Font.PLAIN, 18));

		panel_6_button_2 = new JButton("清除明/密文");
		panel_6_button_2.setIcon(new ImageIcon(MainFrame.class.getResource("/com/zhoww/aesAndRasTool/img/editclear_24px.png")));
		panel_6_button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panel_6_textArea_1.setText("");
				panel_6_textArea_2.setText("");
			}
		});
		panel_6_button_2.setFont(new Font("微软雅黑", Font.PLAIN, 18));

		panel_6_label_3 = new JLabel(" 明      文:");
		panel_6_label_3.setFont(new Font("微软雅黑", Font.PLAIN, 18));

		panel_6_scrollPane_2 = new JScrollPane();

		GroupLayout gl_panel_6 = new GroupLayout(panel_6);
		gl_panel_6.setHorizontalGroup(
				gl_panel_6.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel_6.createSequentialGroup()
								.addGroup(gl_panel_6.createParallelGroup(Alignment.LEADING)
										.addGroup(gl_panel_6.createSequentialGroup()
												.addContainerGap()
												.addGroup(gl_panel_6.createParallelGroup(Alignment.LEADING, false)
														.addGroup(gl_panel_6.createSequentialGroup()
																.addComponent(panel_6_label_1)
																.addPreferredGap(ComponentPlacement.UNRELATED)
																.addComponent(panel_6_textField_1))
														.addGroup(gl_panel_6.createSequentialGroup()
																.addComponent(panel_6_label_2, GroupLayout.PREFERRED_SIZE, 75, GroupLayout.PREFERRED_SIZE)
																.addGap(16)
																.addComponent(panel_6_scrollPane_1, GroupLayout.PREFERRED_SIZE, 449, GroupLayout.PREFERRED_SIZE))))
										.addGroup(gl_panel_6.createSequentialGroup()
												.addGap(20)
												.addComponent(panel_6_label_3, GroupLayout.PREFERRED_SIZE, 75, GroupLayout.PREFERRED_SIZE)
												.addGap(13)
												.addComponent(panel_6_scrollPane_2, GroupLayout.PREFERRED_SIZE, 449, GroupLayout.PREFERRED_SIZE))
										.addGroup(gl_panel_6.createSequentialGroup()
												.addGap(105)
												.addComponent(panel_6_button_1)
												.addPreferredGap(ComponentPlacement.RELATED)
												.addComponent(panel_6_button_2)))
								.addContainerGap(51, Short.MAX_VALUE))
		);
		gl_panel_6.setVerticalGroup(
				gl_panel_6.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel_6.createSequentialGroup()
								.addGap(24)
								.addGroup(gl_panel_6.createParallelGroup(Alignment.BASELINE)
										.addComponent(panel_6_label_1)
										.addComponent(panel_6_textField_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
								.addGap(28)
								.addGroup(gl_panel_6.createParallelGroup(Alignment.TRAILING)
										.addGroup(gl_panel_6.createSequentialGroup()
												.addComponent(panel_6_label_2, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE)
												.addGap(102))
										.addGroup(gl_panel_6.createSequentialGroup()
												.addComponent(panel_6_scrollPane_1, GroupLayout.PREFERRED_SIZE, 109, GroupLayout.PREFERRED_SIZE)
												.addGap(16)))
								.addGroup(gl_panel_6.createParallelGroup(Alignment.BASELINE)
										.addComponent(panel_6_button_1)
										.addComponent(panel_6_button_2, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE))
								.addGroup(gl_panel_6.createParallelGroup(Alignment.LEADING)
										.addGroup(gl_panel_6.createSequentialGroup()
												.addGap(22)
												.addComponent(panel_6_label_3, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE))
										.addGroup(gl_panel_6.createSequentialGroup()
												.addGap(24)
												.addComponent(panel_6_scrollPane_2, GroupLayout.PREFERRED_SIZE, 109, GroupLayout.PREFERRED_SIZE)))
								.addContainerGap(28, Short.MAX_VALUE))
		);



		panel_6_textArea_2 = new JTextArea();
		panel_6_textArea_2.setFont(new Font("微软雅黑", Font.PLAIN, 18));
		panel_6_scrollPane_2.setViewportView(panel_6_textArea_2);

		panel_6_textArea_1 = new JTextArea();
		panel_6_textArea_1.setFont(new Font("微软雅黑", Font.PLAIN, 18));
		panel_6_scrollPane_1.setViewportView(panel_6_textArea_1);
		panel_6.setLayout(gl_panel_6);
		tabbedPane.setForegroundAt(2, Color.BLACK);


	JPanel panel_7 = new JPanel();
		panel_7.setForeground(Color.WHITE);
		tabbedPane.addTab("Ascii签名排序", new ImageIcon(MainFrame.class.getResource("/com/zhoww/aesAndRasTool/img/asciisort.png")), panel_7, null);

		/*panel_7_label_1 = new JLabel("Ascii签名排序:");
		panel_7_label_1.setFont(new Font("微软雅黑", Font.PLAIN, 18));

		panel_7_textField_1 = new JTextField();
		panel_7_textField_1.setFont(new Font("微软雅黑", Font.PLAIN, 18));
		panel_7_textField_1.setColumns(10);*/

		panel_7_label_2 = new JLabel(" 排序前:");
		panel_7_label_2.setFont(new Font("微软雅黑", Font.PLAIN, 18));

		panel_7_scrollPane_1 = new JScrollPane();

		panel_7_button_1 = new JButton("排序");
		panel_7_button_1.setIcon(new ImageIcon(MainFrame.class.getResource("/com/zhoww/aesAndRasTool/img/asciisort.png")));
		panel_7_button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panel_7_button_1_click(e);
			}
		});
		panel_7_button_1.setFont(new Font("微软雅黑", Font.PLAIN, 18));

		panel_7_button_2 = new JButton("清除数据");
		panel_7_button_2.setIcon(new ImageIcon(MainFrame.class.getResource("/com/zhoww/aesAndRasTool/img/editclear_24px.png")));
		panel_7_button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panel_7_textArea_1.setText("");
				panel_7_textArea_2.setText("");
			}
		});
		panel_7_button_2.setFont(new Font("微软雅黑", Font.PLAIN, 18));

		panel_7_label_3 = new JLabel(" 排序后:");
		panel_7_label_3.setFont(new Font("微软雅黑", Font.PLAIN, 18));

		panel_7_scrollPane_2 = new JScrollPane();

		GroupLayout gl_panel_7 = new GroupLayout(panel_7);
		gl_panel_7.setHorizontalGroup(
				gl_panel_7.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel_7.createSequentialGroup()
								.addGroup(gl_panel_7.createParallelGroup(Alignment.LEADING)
										.addGroup(gl_panel_7.createSequentialGroup()
												.addContainerGap()
												.addGroup(gl_panel_7.createParallelGroup(Alignment.LEADING, false)
														/*.addGroup(gl_panel_7.createSequentialGroup()
																.addComponent(panel_7_label_1)
																.addPreferredGap(ComponentPlacement.UNRELATED)
																.addComponent(panel_7_textField_1))*/
														.addGroup(gl_panel_7.createSequentialGroup()
																.addComponent(panel_7_label_2, GroupLayout.PREFERRED_SIZE, 75, GroupLayout.PREFERRED_SIZE)
																.addGap(16)
																.addComponent(panel_7_scrollPane_1, GroupLayout.PREFERRED_SIZE, 449, GroupLayout.PREFERRED_SIZE))))
										.addGroup(gl_panel_7.createSequentialGroup()
												.addGap(20)
												.addComponent(panel_7_label_3, GroupLayout.PREFERRED_SIZE, 75, GroupLayout.PREFERRED_SIZE)
												.addGap(13)
												.addComponent(panel_7_scrollPane_2, GroupLayout.PREFERRED_SIZE, 449, GroupLayout.PREFERRED_SIZE))
										.addGroup(gl_panel_7.createSequentialGroup()
												.addGap(105)
												.addComponent(panel_7_button_1)
												.addPreferredGap(ComponentPlacement.RELATED)
												.addComponent(panel_7_button_2)))
								.addContainerGap(51, Short.MAX_VALUE))
		);
		gl_panel_7.setVerticalGroup(
				gl_panel_7.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel_7.createSequentialGroup()
								/*.addGap(24)
								.addGroup(gl_panel_7.createParallelGroup(Alignment.BASELINE)
										.addComponent(panel_7_label_1)
										.addComponent(panel_7_textField_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))*/
								.addGap(28)
								.addGroup(gl_panel_7.createParallelGroup(Alignment.TRAILING)
										.addGroup(gl_panel_7.createSequentialGroup()
												.addComponent(panel_7_label_2, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE)
												.addGap(102))
										.addGroup(gl_panel_7.createSequentialGroup()
												.addComponent(panel_7_scrollPane_1, GroupLayout.PREFERRED_SIZE, 109, GroupLayout.PREFERRED_SIZE)
												.addGap(16)))
								.addGroup(gl_panel_7.createParallelGroup(Alignment.BASELINE)
										.addComponent(panel_7_button_1)
										.addComponent(panel_7_button_2, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE))
								.addGroup(gl_panel_7.createParallelGroup(Alignment.LEADING)
										.addGroup(gl_panel_7.createSequentialGroup()
												.addGap(22)
												.addComponent(panel_7_label_3, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE))
										.addGroup(gl_panel_7.createSequentialGroup()
												.addGap(24)
												.addComponent(panel_7_scrollPane_2, GroupLayout.PREFERRED_SIZE, 109, GroupLayout.PREFERRED_SIZE)))
								.addContainerGap(28, Short.MAX_VALUE))
		);



		panel_7_textArea_2 = new JTextArea();
		panel_7_textArea_2.setFont(new Font("微软雅黑", Font.PLAIN, 18));
		panel_7_scrollPane_2.setViewportView(panel_7_textArea_2);

		panel_7_textArea_1 = new JTextArea();
		panel_7_textArea_1.setFont(new Font("微软雅黑", Font.PLAIN, 18));
		panel_7_scrollPane_1.setViewportView(panel_7_textArea_1);
		panel_7.setLayout(gl_panel_7);
		tabbedPane.setForegroundAt(2, Color.BLACK);





		JPanel panel_8 = new JPanel();
		panel_8.setForeground(Color.WHITE);
		tabbedPane.addTab("RSA公私钥生成", new ImageIcon(MainFrame.class.getResource("/com/zhoww/aesAndRasTool/img/asciisort.png")), panel_8, null);
		panel_8_label_2 = new JLabel(" 公钥:");
		panel_8_label_2.setFont(new Font("微软雅黑", Font.PLAIN, 18));

		panel_8_scrollPane_1 = new JScrollPane();

		panel_8_button_1 = new JButton("RSA生成公私钥");
		panel_8_button_1.setIcon(new ImageIcon(MainFrame.class.getResource("/com/zhoww/aesAndRasTool/img/asciisort.png")));
		panel_8_button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panel_8_button_1_click(e);
			}
		});
		panel_8_button_1.setFont(new Font("微软雅黑", Font.PLAIN, 18));

		panel_8_button_2 = new JButton("清除数据");
		panel_8_button_2.setIcon(new ImageIcon(MainFrame.class.getResource("/com/zhoww/aesAndRasTool/img/editclear_24px.png")));
		panel_8_button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panel_8_textArea_1.setText("");
				panel_8_textArea_2.setText("");
			}
		});
		panel_8_button_2.setFont(new Font("微软雅黑", Font.PLAIN, 18));

		panel_8_label_3 = new JLabel(" 私钥:");
		panel_8_label_3.setFont(new Font("微软雅黑", Font.PLAIN, 18));

		panel_8_scrollPane_2 = new JScrollPane();

		GroupLayout gl_panel_8 = new GroupLayout(panel_8);
		gl_panel_8.setHorizontalGroup(
				gl_panel_8.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel_8.createSequentialGroup()
								.addGroup(gl_panel_8.createParallelGroup(Alignment.LEADING)
										.addGroup(gl_panel_8.createSequentialGroup()
												.addContainerGap()
												.addGroup(gl_panel_8.createParallelGroup(Alignment.LEADING, false)
														/*.addGroup(gl_panel_7.createSequentialGroup()
																.addComponent(panel_7_label_1)
																.addPreferredGap(ComponentPlacement.UNRELATED)
																.addComponent(panel_7_textField_1))*/
														.addGroup(gl_panel_8.createSequentialGroup()
																.addComponent(panel_8_label_2, GroupLayout.PREFERRED_SIZE, 75, GroupLayout.PREFERRED_SIZE)
																.addGap(16)
																.addComponent(panel_8_scrollPane_1, GroupLayout.PREFERRED_SIZE, 449, GroupLayout.PREFERRED_SIZE))))
										.addGroup(gl_panel_8.createSequentialGroup()
												.addGap(20)
												.addComponent(panel_8_label_3, GroupLayout.PREFERRED_SIZE, 75, GroupLayout.PREFERRED_SIZE)
												.addGap(13)
												.addComponent(panel_8_scrollPane_2, GroupLayout.PREFERRED_SIZE, 449, GroupLayout.PREFERRED_SIZE))
										.addGroup(gl_panel_8.createSequentialGroup()
												.addGap(105)
												.addComponent(panel_8_button_1)
												.addPreferredGap(ComponentPlacement.RELATED)
												.addComponent(panel_8_button_2)))
								.addContainerGap(51, Short.MAX_VALUE))
		);
		gl_panel_8.setVerticalGroup(
				gl_panel_8.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel_8.createSequentialGroup()
								/*.addGap(24)
								.addGroup(gl_panel_7.createParallelGroup(Alignment.BASELINE)
										.addComponent(panel_7_label_1)
										.addComponent(panel_7_textField_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))*/
								.addGap(28)
								.addGroup(gl_panel_8.createParallelGroup(Alignment.TRAILING)
										.addGroup(gl_panel_8.createSequentialGroup()
												.addComponent(panel_8_label_2, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE)
												.addGap(102))
										.addGroup(gl_panel_8.createSequentialGroup()
												.addComponent(panel_8_scrollPane_1, GroupLayout.PREFERRED_SIZE, 109, GroupLayout.PREFERRED_SIZE)
												.addGap(16)))
								.addGroup(gl_panel_8.createParallelGroup(Alignment.BASELINE)
										.addComponent(panel_8_button_1)
										.addComponent(panel_8_button_2, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE))
								.addGroup(gl_panel_8.createParallelGroup(Alignment.LEADING)
										.addGroup(gl_panel_8.createSequentialGroup()
												.addGap(22)
												.addComponent(panel_8_label_3, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE))
										.addGroup(gl_panel_8.createSequentialGroup()
												.addGap(24)
												.addComponent(panel_8_scrollPane_2, GroupLayout.PREFERRED_SIZE, 109, GroupLayout.PREFERRED_SIZE)))
								.addContainerGap(28, Short.MAX_VALUE))
		);



		panel_8_textArea_2 = new JTextArea();
		panel_8_textArea_2.setFont(new Font("微软雅黑", Font.PLAIN, 18));
		panel_8_scrollPane_2.setViewportView(panel_8_textArea_2);

		panel_8_textArea_1 = new JTextArea();
		panel_8_textArea_1.setFont(new Font("微软雅黑", Font.PLAIN, 18));
		panel_8_scrollPane_1.setViewportView(panel_8_textArea_1);
		panel_8.setLayout(gl_panel_8);
		tabbedPane.setForegroundAt(2, Color.BLACK);






		JPanel panel_9 = new JPanel();
		tabbedPane.addTab("rsa验签respMsg为英文", new ImageIcon(MainFrame.class.getResource("/com/zhoww/aesAndRasTool/img/verified_user_24px.png")), panel_9, null);

		panel_9_label_1 = new JLabel("RSA公钥:");
		panel_9_label_1.setFont(new Font("微软雅黑", Font.PLAIN, 18));

		panel_9_textField_1 = new JTextField();
		panel_9_textField_1.setFont(new Font("微软雅黑", Font.PLAIN, 18));
		panel_9_textField_1.setColumns(10);

		panel_9_label_2 = new JLabel(" 明      文:");
		panel_9_label_2.setFont(new Font("微软雅黑", Font.PLAIN, 18));

		panel_9_scrollPane_1 = new JScrollPane();

		/*panel_4_label_3 = new JLabel(" 签 名 值:");
		panel_4_label_3.setFont(new Font("微软雅黑", Font.PLAIN, 18));*/

		//panel_4_scrollPane_2 = new JScrollPane();

		panel_9_button_1 = new JButton("验  签");
		panel_9_button_1.setIcon(new ImageIcon(MainFrame.class.getResource("/com/zhoww/aesAndRasTool/img/verified_user_24px.png")));
		panel_9_button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panel_9_button_1_click(e);
			}
		});
		panel_9_button_1.setFont(new Font("微软雅黑", Font.PLAIN, 18));

		panel_9_button_2 = new JButton("清除明文/签名值");
		panel_9_button_2.setIcon(new ImageIcon(MainFrame.class.getResource("/com/zhoww/aesAndRasTool/img/editclear_24px.png")));
		panel_9_button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panel_9_textArea_1.setText("");
				/*panel_4_textArea_2.setText("");*/
			}
		});
		panel_9_button_2.setFont(new Font("微软雅黑", Font.PLAIN, 18));

		panel_9_label_4 = new JLabel(" 验签结果:");
		panel_9_label_4.setFont(new Font("微软雅黑", Font.PLAIN, 18));

		panel_9_label_5 = new JLabel("");
		panel_9_label_5.setFont(new Font("微软雅黑", Font.PLAIN, 18));
		GroupLayout gl_panel_9 = new GroupLayout(panel_9);
		gl_panel_9.setHorizontalGroup(
				gl_panel_9.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel_9.createSequentialGroup()
								.addContainerGap()
								.addGroup(gl_panel_9.createParallelGroup(Alignment.LEADING)
										.addGroup(gl_panel_9.createSequentialGroup()
												.addComponent(panel_9_label_1)
												.addGap(18)
												.addComponent(panel_9_textField_1, GroupLayout.PREFERRED_SIZE, 446, GroupLayout.PREFERRED_SIZE))
										.addGroup(gl_panel_9.createSequentialGroup()
												.addComponent(panel_9_label_2, GroupLayout.PREFERRED_SIZE, 75, GroupLayout.PREFERRED_SIZE)
												.addGap(18)
												.addComponent(panel_9_scrollPane_1, GroupLayout.PREFERRED_SIZE, 446, GroupLayout.PREFERRED_SIZE))
										.addGroup(gl_panel_9.createSequentialGroup()
												/*.addComponent(panel_4_label_3, GroupLayout.PREFERRED_SIZE, 75, GroupLayout.PREFERRED_SIZE)*/
												.addGap(18)
												.addGroup(gl_panel_9.createParallelGroup(Alignment.LEADING)
																.addGroup(gl_panel_9.createSequentialGroup()
																		.addComponent(panel_9_button_1)
																		.addPreferredGap(ComponentPlacement.RELATED)
																		.addComponent(panel_9_button_2, GroupLayout.PREFERRED_SIZE, 210, GroupLayout.PREFERRED_SIZE))
														/*.addComponent(panel_4_scrollPane_2, GroupLayout.PREFERRED_SIZE, 446, GroupLayout.PREFERRED_SIZE)*/))
										.addGroup(gl_panel_9.createSequentialGroup()
												.addComponent(panel_9_label_4, GroupLayout.PREFERRED_SIZE, 92, GroupLayout.PREFERRED_SIZE)
												.addPreferredGap(ComponentPlacement.RELATED)
												.addComponent(panel_9_label_5)))
								.addContainerGap(70, Short.MAX_VALUE))
		);
		gl_panel_9.setVerticalGroup(
				gl_panel_9.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel_9.createSequentialGroup()
								.addGap(27)
								.addGroup(gl_panel_9.createParallelGroup(Alignment.BASELINE)
										.addComponent(panel_9_label_1)
										.addComponent(panel_9_textField_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
								.addGap(18)
								.addGroup(gl_panel_9.createParallelGroup(Alignment.LEADING)
										.addComponent(panel_9_label_2, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE)
										.addComponent(panel_9_scrollPane_1, GroupLayout.PREFERRED_SIZE, 109, GroupLayout.PREFERRED_SIZE))
								.addGap(18)
								/*.addGroup(gl_panel_4.createParallelGroup(Alignment.LEADING)
                                    .addComponent(panel_4_scrollPane_2, GroupLayout.PREFERRED_SIZE, 108, GroupLayout.PREFERRED_SIZE)
                                    *//*.addComponent(panel_4_label_3, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE)*//*)
					.addGap(18)*/
								.addGroup(gl_panel_9.createParallelGroup(Alignment.LEADING)
										.addGroup(gl_panel_9.createSequentialGroup()
												.addComponent(panel_9_button_1)
												.addGap(25)
												.addGroup(gl_panel_9.createParallelGroup(Alignment.BASELINE)
														.addComponent(panel_9_label_4, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE)
														.addComponent(panel_9_label_5)))
										.addComponent(panel_9_button_2, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE))
								.addContainerGap(26, Short.MAX_VALUE))
		);

		///panel_4_textArea_2 = new JTextArea();
		//panel_4_textArea_2.setFont(new Font("微软雅黑", Font.PLAIN, 18));
		//panel_4_scrollPane_2.setViewportView(panel_4_textArea_2);

		panel_9_textArea_1 = new JTextArea();
		panel_9_textArea_1.setFont(new Font("微软雅黑", Font.PLAIN, 18));
		panel_9_scrollPane_1.setViewportView(panel_9_textArea_1);
		panel_9.setLayout(gl_panel_9);
		tabbedPane.setForegroundAt(2, Color.BLACK);









	}
	//rsa 加密 公钥加密
	private void panel_1_button_1_click(ActionEvent e) {
		try {
			String publicKeyStr =this.panel_1_textField_1.getText();
			String content =   this.panel_1_textArea_1.getText();
			if(publicKeyStr==null ||publicKeyStr.trim().equals("")) {
				JOptionPane.showMessageDialog(null, "RSA公钥不能为空！", "错误", JOptionPane.ERROR_MESSAGE);
			    return ;
			}
			if(content==null ||content.trim().equals("")) {
				//JOptionPane.showMessageDialog(null, "明文内容不能为空！", "信息", JOptionPane.INFORMATION_MESSAGE);
				  JOptionPane.showMessageDialog(null, "明文内容不能为空！");//默认的  提示框 title为“信息” type为  INFORMATION_MESSAGE
				return ;
			}
			
			String  cipherContent  =Base64.encode(RSACoder.encryptByPublicKey(content.getBytes(),Base64.decode(publicKeyStr))) ;//rsaHelper.rsaEncrypt(content, publicKeyStr);
			this.panel_1_textArea_2.setText(cipherContent);
		} catch (Exception e1) {
			e1.printStackTrace();
			JOptionPane.showMessageDialog(null, e1.getMessage(), "错误", JOptionPane.ERROR_MESSAGE);
		}
		
	}
	//rsa 解密 私钥解密
	private void panel_2_button_1_click(ActionEvent e) {
		try {
			String privateKeyStr =this.panel_2_textField_1.getText();
			String cipherContent =   this.panel_2_textArea_1.getText();
			if(privateKeyStr==null ||privateKeyStr.trim().equals("")) {
				JOptionPane.showMessageDialog(null, "RSA私钥不能为空！", "错误", JOptionPane.ERROR_MESSAGE);
				return ;
			}
			if(cipherContent==null ||cipherContent.trim().equals("")) {
				JOptionPane.showMessageDialog(null, "密文内容不能为空！");//默认的  提示框 title为“信息” type为  INFORMATION_MESSAGE
				return ;
			}
			String content  = new String(RSACoder. decryptByPrivateKey(Base64.decode(cipherContent),Base64.decode(privateKeyStr)),"utf-8");
			this.panel_2_textArea_2.setText(content);
			
		} catch (Exception e1) {
			e1.printStackTrace();
			JOptionPane.showMessageDialog(null, e1.getMessage(), "错误", JOptionPane.ERROR_MESSAGE);
		}
	}
	//rsa 签名
	private void panel_3_button_1_click(ActionEvent e) {
		try {
			String privateKeyStr =this.panel_3_textField_1.getText();
			String content =   this.panel_3_textArea_1.getText();
			if(privateKeyStr==null ||privateKeyStr.trim().equals("")) {
				JOptionPane.showMessageDialog(null, "RSA私钥不能为空！", "错误", JOptionPane.ERROR_MESSAGE);
				return ;
			}
			if(content==null ||content.trim().equals("")) {
				JOptionPane.showMessageDialog(null, "明文内容不能为空！");//默认的  提示框 title为“信息” type为  INFORMATION_MESSAGE
				return ;
			}
	 
			String sign  =Hex.encodeHexString(RSACoder.signSHA256withRSA(content.getBytes(), Base64.decode(privateKeyStr)));
			this.panel_3_textArea_2.setText(sign);
			
		} catch (Exception e1) {
			e1.printStackTrace();
			JOptionPane.showMessageDialog(null, e1.getMessage(), "错误", JOptionPane.ERROR_MESSAGE);
		}
	}


	//rsa 验证签名
	private void panel_4_button_1_click(ActionEvent e) {
		try {
			String publicKeyStr = this.panel_4_textField_1.getText();
			String content = this.panel_4_textArea_1.getText();
			//String sign = this.panel_4_textArea_2.getText();
			if(publicKeyStr==null ||publicKeyStr.trim().equals("")) {
				JOptionPane.showMessageDialog(null, "RSA公钥不能为空！", "错误", JOptionPane.ERROR_MESSAGE);
			    return ;
			}
			if(content==null ||content.trim().equals("")) {
				JOptionPane.showMessageDialog(null, "明文内容不能为空！");
			    return ;
			}
			//if(sign==null ||sign.trim().equals("")) {
			//	JOptionPane.showMessageDialog(null, "签名值内容不能为空！");
			//	return ;
			//}
			
			boolean  f=verifySign( content, publicKeyStr) ;
			if(f) {
				 this.panel_4_label_5.setForeground( new Color(0, 255, 0));
				 this.panel_4_label_5.setText("验签成功");
			}else {
				 this.panel_4_label_5.setForeground( new Color(255, 0, 0));
				 this.panel_4_label_5.setText("验签失败");
				
			}
			
		} catch (Exception e1) {
			e1.printStackTrace();
			JOptionPane.showMessageDialog(null, e1.getMessage(), "错误", JOptionPane.ERROR_MESSAGE);
		}
	}

	//rsa 验证签名
	private void panel_9_button_1_click(ActionEvent e) {
		try {
			String publicKeyStr = this.panel_9_textField_1.getText();
			String content = this.panel_9_textArea_1.getText();
			//String sign = this.panel_4_textArea_2.getText();
			if(publicKeyStr==null ||publicKeyStr.trim().equals("")) {
				JOptionPane.showMessageDialog(null, "RSA公钥不能为空！", "错误", JOptionPane.ERROR_MESSAGE);
				return ;
			}
			if(content==null ||content.trim().equals("")) {
				JOptionPane.showMessageDialog(null, "明文内容不能为空！");
				return ;
			}
			//if(sign==null ||sign.trim().equals("")) {
			//	JOptionPane.showMessageDialog(null, "签名值内容不能为空！");
			//	return ;
			//}

			boolean  f=verifySignEng( content, publicKeyStr) ;
			if(f) {
				this.panel_9_label_5.setForeground( new Color(0, 255, 0));
				this.panel_9_label_5.setText("验签成功");
			}else {
				this.panel_9_label_5.setForeground( new Color(255, 0, 0));
				this.panel_9_label_5.setText("验签失败");

			}

		} catch (Exception e1) {
			e1.printStackTrace();
			JOptionPane.showMessageDialog(null, e1.getMessage(), "错误", JOptionPane.ERROR_MESSAGE);
		}
	}

	/**
	 * 签名校验
	 *
	 * @param content
	 * @return
	 */
	private boolean verifySignEng( String content,String rsaPubKey) {
		Map<String,Object> map=new HashMap<String, Object>();
		if (content!=null && content!="") {
			String sign = "";

			String[] callBacks = content.split("&");
			if (callBacks.length < 2 && !content.contains("sign")) {
				JOptionPane.showMessageDialog(null, "sign字段错误", "错误", JOptionPane.ERROR_MESSAGE);
			}
			for (int i = 0; i < callBacks.length; i++) {
				String[] str2 = callBacks[i].split("=");
				if ("sign".equals(str2[0])) {
					sign = str2[1];
				} else {
					map.put(str2[0], str2[1]);
				}
			}
			String prepareText = sortMapSignEn(map);


			try {
				boolean b = RSACoder.verifyByPublicKeySHA256withRSA(prepareText.getBytes("utf-8"), Base64.decode(rsaPubKey), Hex.decodeHex(sign.toCharArray()));
				return b;
			} catch (Exception e) {
				e.printStackTrace();
				JOptionPane.showMessageDialog(null, e.getMessage(), "错误", JOptionPane.ERROR_MESSAGE);
			}
		}
		return false;

	}

	/**
	 * 签名校验
	 *
	 * @param content
	 * @return
	 */
	private boolean verifySign( String content,String rsaPubKey) {
		Map<String,Object> map=new HashMap<String, Object>();
		if (content!=null && content!="") {
			String sign = "";

			String[] callBacks = content.split("&");
			if (callBacks.length < 2 && !content.contains("sign")) {
				JOptionPane.showMessageDialog(null, "sign字段错误", "错误", JOptionPane.ERROR_MESSAGE);
			}
			for (int i = 0; i < callBacks.length; i++) {
				String[] str2 = callBacks[i].split("=");
				if ("sign".equals(str2[0])) {
					sign = str2[1];
				} else {
					map.put(str2[0], str2[1]);
				}
			}
			String prepareText = sortMapSign(map);


			try {
				boolean b = RSACoder.verifyByPublicKeySHA256withRSA(prepareText.getBytes("utf-8"), Base64.decode(rsaPubKey), Hex.decodeHex(sign.toCharArray()));
				return b;
			} catch (Exception e) {
				e.printStackTrace();
				JOptionPane.showMessageDialog(null, e.getMessage(), "错误", JOptionPane.ERROR_MESSAGE);
			}
		}
		return false;

	}

	public  static  String sortMapSign(Map<String, Object> map) {
		Map<String, Object> sortMap = new TreeMap<String, Object>(new Comparator<String>() {
			@Override
			public int compare(String o1, String o2) {
				return o1.compareTo(o2);
			}
		});
		sortMap.putAll(map);
		StringBuilder builder = new StringBuilder();
		for (Map.Entry<String, Object> entry : sortMap.entrySet()) {
			if (((String) entry.getValue())!=null && ((String) entry.getValue())!="") {
				if(entry.getKey().equals("respMsg") && entry.getValue()!=null && entry.getValue().toString()!=null && entry.getValue().toString()!="" )
				{

					try {
						builder.append(entry.getKey()).append("=").append(Hex.encodeHexString(entry.getValue().toString().getBytes("utf-8"))).append("&");
					} catch (UnsupportedEncodingException e) {
						e.printStackTrace();
						JOptionPane.showMessageDialog(null, e.getMessage(), "错误", JOptionPane.ERROR_MESSAGE);
					}

				}else {
					builder.append(entry.getKey()).append("=").append(entry.getValue()).append("&");
				}
			}
		}
		String prepareText = builder.toString().replaceAll("&$", "");
		return prepareText;
	}

	public  static  String sortMapSignEn(Map<String, Object> map) {
		Map<String, Object> sortMap = new TreeMap<String, Object>(new Comparator<String>() {
			@Override
			public int compare(String o1, String o2) {
				return o1.compareTo(o2);
			}
		});
		sortMap.putAll(map);
		StringBuilder builder = new StringBuilder();
		for (Map.Entry<String, Object> entry : sortMap.entrySet()) {
			if (((String) entry.getValue())!=null && ((String) entry.getValue())!="") {
					builder.append(entry.getKey()).append("=").append(entry.getValue()).append("&");
			}
		}
		String prepareText = builder.toString().replaceAll("&$", "");
		return prepareText;
	}
	/**
	 * AES加密
	 * @param e
	 */
	private void panel_5_button_1_click(ActionEvent e) {
		try {
			String AESKeyStr =this.panel_5_textField_1.getText();
			String content =   this.panel_5_textArea_1.getText();
			if(AESKeyStr==null ||AESKeyStr.trim().equals("")) {
				JOptionPane.showMessageDialog(null, "AES秘钥不能为空！", "错误", JOptionPane.ERROR_MESSAGE);
				return ;
			}
			if(content==null ||content.trim().equals("")) {
				//JOptionPane.showMessageDialog(null, "明文内容不能为空！", "信息", JOptionPane.INFORMATION_MESSAGE);
				JOptionPane.showMessageDialog(null, "明文内容不能为空！");//默认的  提示框 title为“信息” type为  INFORMATION_MESSAGE
				return ;
			}

			String  cipherContent  = new String(RSACoder.encryptAES(AESKeyStr, content));;//rsaHelper.rsaEncrypt(content, publicKeyStr);
			this.panel_5_textArea_2.setText(cipherContent);
		} catch (Exception e1) {
			e1.printStackTrace();
			JOptionPane.showMessageDialog(null, e1.getMessage(), "错误", JOptionPane.ERROR_MESSAGE);
		}

	}
	/**
	 * AES解密
	 * @param e
	 */
	private void panel_6_button_1_click(ActionEvent e) {
		try {
			String AESKeyStr =this.panel_6_textField_1.getText();
			String content =   this.panel_6_textArea_1.getText();
			if(AESKeyStr==null ||AESKeyStr.trim().equals("")) {
				JOptionPane.showMessageDialog(null, "AES秘钥不能为空！", "错误", JOptionPane.ERROR_MESSAGE);
				return ;
			}
			if(content==null ||content.trim().equals("")) {
				//JOptionPane.showMessageDialog(null, "明文内容不能为空！", "信息", JOptionPane.INFORMATION_MESSAGE);
				JOptionPane.showMessageDialog(null, "密文内容不能为空！");//默认的  提示框 title为“信息” type为  INFORMATION_MESSAGE
				return ;
			}

			String  cipherContent  = new String(RSACoder.decryptAES(AESKeyStr, content));//rsaHelper.rsaEncrypt(content, publicKeyStr);
			this.panel_6_textArea_2.setText(cipherContent);
		} catch (Exception e1) {
			e1.printStackTrace();
			JOptionPane.showMessageDialog(null, e1.getMessage(), "错误", JOptionPane.ERROR_MESSAGE);
		}

	}


	/**
	 * Ascii 排序
	 *
	 * @param e
	 */
	private void panel_7_button_1_click(ActionEvent e) {
		try {
			String content =this.panel_7_textArea_1.getText();
			//String content =   this.panel_7_textArea_2.getText();
			if(content==null ||content.trim().equals("")) {
				JOptionPane.showMessageDialog(null, "排序前的数据不能为空！", "错误", JOptionPane.ERROR_MESSAGE);
				return ;
			}
			Map<String,Object> map=new HashMap<String, Object>();
			if (content!=null && content!="") {
				String sign = "";

				String[] callBacks = content.split("&");
				if (callBacks.length < 2 && !content.contains("sign")) {
					JOptionPane.showMessageDialog(null, "sign字段错误", "错误", JOptionPane.ERROR_MESSAGE);
				}
				for (int i = 0; i < callBacks.length; i++) {
					String[] str2 = callBacks[i].split("=");
					if ("sign".equals(str2[0])) {
						sign = str2[1];
					} else {
						map.put(str2[0], str2[1]);
					}
				}}

			String  cipherContent  =sortMapSign(map);
			this.panel_7_textArea_2.setText(cipherContent);
		} catch (Exception e1) {
			e1.printStackTrace();
			JOptionPane.showMessageDialog(null, e1.getMessage(), "错误", JOptionPane.ERROR_MESSAGE);
		}

	}


	/**
	 * 公私要生生成
	 *
	 * @param e
	 */
	private void panel_8_button_1_click(ActionEvent e) {
		try {
			Map<String,Object> map  =RSACoder.initKey();
			String pukey=org.apache.commons.codec.binary.Base64.encodeBase64String(RSACoder.getPublicKey(map));
			this.panel_8_textArea_1.setText(pukey);
			String prikey=org.apache.commons.codec.binary.Base64.encodeBase64String(RSACoder.getPrivateKey(map));
			this.panel_8_textArea_2.setText(prikey);


		} catch (Exception e1) {
			e1.printStackTrace();
			JOptionPane.showMessageDialog(null, e1.getMessage(), "错误", JOptionPane.ERROR_MESSAGE);
		}

	}
}
