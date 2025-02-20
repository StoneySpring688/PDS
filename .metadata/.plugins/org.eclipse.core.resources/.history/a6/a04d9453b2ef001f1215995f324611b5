package umu.tds.AppChat.ui;

import java.awt.Color;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import umu.tds.AppChat.controllers.UIController;


public class LoginPanel extends JPanel {

	private static final long serialVersionUID = 1L;
	
	private JTextField textFieldPhone;
	private JPasswordField password1;
	protected JButton RegisterButton;
	private JButton LoginButton;
	
	private final Color defaultDark = new Color(40, 43, 48);
	private final Color Gray = new Color(64, 68, 75);
	
	public LoginPanel() {
		setBackground(this.Gray);
		setBorder(new EmptyBorder(5, 5, 5, 5));
		setLayout(null);
		
		// Botón o etiqueta para cerrar la ventana
		JLabel closeButton = new JLabel("");
		closeButton.setIcon(new ImageIcon(LoginPanel.class.getResource("/assets/UI_Exit.png")));
		closeButton.setForeground(new Color(241, 57, 83));
		closeButton.setBounds(685, 2, 33, 33);
		closeButton.setBackground(Color.WHITE);
		this.add(closeButton);
				
		closeButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				System.exit(0); // Cierra la aplicación
				}
			});

		JPanel panel = new JPanel();
		panel.setBackground(this.defaultDark);
		panel.setBounds(0, 0, 346, 420);
		this.add(panel);
		panel.setLayout(null);
		
		JLabel lblDecoration1 = new JLabel("");
		lblDecoration1.setIcon(new ImageIcon(LoginPanel.class.getResource("/assets/UI_ChapterIcon_MondstadtResized.png")));
		lblDecoration1.setBounds(141, 4, 64, 64);
		panel.add(lblDecoration1);
		
		JLabel lblDecoration2 = new JLabel("");
		lblDecoration2.setIcon(new ImageIcon(LoginPanel.class.getResource("/assets/UI_ChapterIcon_LiyueResized.png")));
		lblDecoration2.setBounds(141, 72, 64, 64);
		panel.add(lblDecoration2);
		
		JLabel lblDecoration3 = new JLabel("");
		lblDecoration3.setIcon(new ImageIcon(LoginPanel.class.getResource("/assets/UI_ChapterIcon_InazumaResized.png")));
		lblDecoration3.setBounds(141, 140, 64, 64);
		panel.add(lblDecoration3);
		
		JLabel lblDecoration4 = new JLabel("");
		lblDecoration4.setIcon(new ImageIcon(LoginPanel.class.getResource("/assets/UI_ChapterIcon_SumeruResized.png")));
		lblDecoration4.setBounds(141, 208, 64, 64);
		panel.add(lblDecoration4);
		
		JLabel lblDecoration5 = new JLabel("");
		lblDecoration5.setIcon(new ImageIcon(LoginPanel.class.getResource("/assets/UI_ChapterIcon_FontaineResized.png")));
		lblDecoration5.setBounds(141, 276, 64, 64);
		panel.add(lblDecoration5);
		
		JLabel lblDecoration5_1 = new JLabel("");
		lblDecoration5_1.setIcon(new ImageIcon(LoginPanel.class.getResource("/assets/UI_ChapterIcon_NatlanResized.png")));
		lblDecoration5_1.setBounds(141, 344, 64, 64);
		panel.add(lblDecoration5_1);
		
		LoginButton = new JButton("Login");
		LoginButton.setForeground(Color.WHITE);
		LoginButton.setBackground(new Color(241, 57, 83));
		LoginButton.setBounds(370, 360, 120, 35); // x = 370+(285/2)-(187/2)
		LoginButton.addActionListener(e -> this.doLogin());
		this.add(LoginButton);
		
		RegisterButton = new JButton("Register");
		RegisterButton.setForeground(Color.WHITE);
		RegisterButton.setBackground(new Color(241, 57, 83));
		RegisterButton.setBounds(535, 360, 120, 35);
		RegisterButton.addActionListener(e -> {UIController.showRegister(); this.reset();});
		this.add(RegisterButton);
		
		textFieldPhone = new JTextField();
		textFieldPhone.setBounds(370, 160, 285, 30);
		textFieldPhone.setBackground(this.Gray);
		textFieldPhone.setCaretColor(Color.WHITE);
		textFieldPhone.setForeground(Color.WHITE);
		//textFieldPhone.setBorder(new LineBorder(Color.LIGHT_GRAY, 1));
		textFieldPhone.addFocusListener(new FocusAdapter() {
            @Override
            public void focusGained(FocusEvent e) {
                if (textFieldPhone.getForeground().equals(Color.RED)) {
                	textFieldPhone.setText(""); // Borrar el mensaje de error
                	textFieldPhone.setForeground(Color.WHITE); // Restaurar color normal
                }
            }
        });
		this.add(textFieldPhone);
		textFieldPhone.setColumns(10);
		
		JLabel lblPhone = new JLabel("Phone");
		lblPhone.setBounds(370, 142, 50, 20);
		lblPhone.setForeground(Color.WHITE);
		add(lblPhone);
		
		JLabel lblPassword1 = new JLabel("Password");
		lblPassword1.setBounds(370, 217, 70, 20);
		lblPassword1.setForeground(Color.WHITE);
		add(lblPassword1);
		
		JRadioButton rdbtnshowPassword1 = new JRadioButton("show Password");
		rdbtnshowPassword1.setBackground(this.Gray);
		rdbtnshowPassword1.setForeground(Color.WHITE);
		rdbtnshowPassword1.setBounds(370, 270, 130, 25);
		rdbtnshowPassword1.addItemListener (e -> {
			if(rdbtnshowPassword1.isSelected()) {
				password1.setEchoChar((char)0);
			}else {
				password1.setEchoChar('•');
			}
		});
		add(rdbtnshowPassword1);
		
		password1 = new JPasswordField();
		password1.setBackground(this.Gray);
		password1.setCaretColor(Color.WHITE);
		password1.setForeground(Color.WHITE);
		//password1.setBorder(new LineBorder(Color.LIGHT_GRAY, 1));
		password1.setColumns(10);
		password1.setBounds(370, 235, 285, 30);
		password1.addFocusListener(new FocusAdapter() {
            @Override
            public void focusGained(FocusEvent e) {
                if (password1.getForeground().equals(Color.RED)) {
                	password1.setText(""); // Borrar el mensaje de error
                	password1.setForeground(Color.WHITE); // Restaurar color normal
                	if(!rdbtnshowPassword1.isSelected()) password1.setEchoChar('•');
                }
            }
        });
		add(password1);
		
		JLabel lblBanner = new JLabel("");
		lblBanner.setIcon(new ImageIcon(LoginPanel.class.getResource("/assets/Login_Banner.png")));
		lblBanner.setBounds(370, 30, 285, 80);
		add(lblBanner);		
	}
	
	public JButton getRegisterButton() {
		return this.RegisterButton;
	}
	
	public JButton getLoginButton() {
		return this.LoginButton;
	}
	
	public String getPasswd() {
		return String.copyValueOf(this.password1.getPassword()).isBlank() ? null : String.copyValueOf(this.password1.getPassword());
	}
	
	public String getPhone() {
		return this.textFieldPhone.getText();
	}
	
	protected void reset() {
		this.textFieldPhone.setText("");
		this.password1.setText("");		
	}
	
	public void doLogin() {
		
		boolean success = true;
		
		String passwd = this.getPasswd();
		int number = 0;
		
		if(this.getPhone().isBlank()) {
			this.errors((byte)1);
			success = false;
		}
		
    	try {
		    number = Integer.parseInt(this.getPhone());
		} catch (NumberFormatException e) {
		    UIController.addContactErrors((byte) 1);
			success = false;
		}
		
		if(number == 0 || (int) (Math.log10(Math.abs(number)) + 1) != 9) {
			this.errors((byte)1);
			success = false;
		} if(passwd ==  null) {
    		//System.out.println("[DEBUG] doRegister BackendControoller 2");
			this.errors((byte)2);
    		success = false;
    	}else if(passwd.length() < 5){
    		//System.out.println("[DEBUG] doRegister BackendControoller 3");
    		this.errors((byte)3);
    		success = false;
    	}else if(passwd.isBlank() || passwd.isEmpty()){
    		//System.out.println("[DEBUG] doRegister BackendControoller 4");
    		this.errors((byte)2);
    		success = false;
    	}
		
    	if(success) UIController.doLogin(number, passwd);
    	
	}
	
	public void errors(byte code) {
		//System.out.println("[DEBUG] Errors" + code);
		switch (code) {
		case 1: {
			this.textFieldPhone.setForeground(Color.RED);
			this.textFieldPhone.setText("invalid phone");
			break;
		}
		case 2: {
			//System.err.println("[Error] : El valor no es una contraseña válida.");
			this.password1.setForeground(Color.RED);
            this.password1.setText("invalid password");
            this.password1.setEchoChar((char)0);
			break;
		}
		case 3: {
			//System.err.println("[Error] : El valor no es una contraseña válida.");
			this.password1.setForeground(Color.RED);
            this.password1.setText("short password");
            this.password1.setEchoChar((char)0);
			break;
		}
		case 4: {
			//System.err.println("[Error] : El valor no es una contraseña válida.");
			this.textFieldPhone.setForeground(Color.RED);
			this.textFieldPhone.setText("invalid login");
			this.password1.setForeground(Color.RED);
            this.password1.setText("invalid login");
            this.password1.setEchoChar((char)0);
			break;
		}
		default:
			throw new IllegalArgumentException("Unexpected value: " + code);
		}
	}
	
}
