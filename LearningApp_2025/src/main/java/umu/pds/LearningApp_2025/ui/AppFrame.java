package umu.pds.LearningApp_2025.ui;

import java.awt.CardLayout;
import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class AppFrame extends JFrame {

	private static final long serialVersionUID = 1L;
	int posX=0;
	int posY=0;
	private JPanel movilidad;
	private JPanel panelIntercambiable;
	private LoginPanel login;
	private RegisterPanel register;
	private PanelIntermedio intermedio;
	private CardLayout actualizadorUI;

	public AppFrame() {
		
		//configuración del frame
		setBackground(Color.WHITE);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 720, 420);
		setSize(720,420);
		setResizable(false);
		setLocationRelativeTo(null);
		setUndecorated(true);
		getContentPane().setLayout(null);
		
		//movilidad del frame
		this.movilidad = new JPanel();
		this.movilidad.setOpaque(false);
		this.movilidad.setBackground(new Color(0, 0, 0, 0)); //transparente, alpha a 0
		this.movilidad.setBounds(0, 0, 684, 22);
		this.movilidad.setBorder(new EmptyBorder(0, 0, 0, 0));
		
		this.movilidad.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				posX = e.getX();
				posY = e.getY();
			}
		});
		this.movilidad.addMouseMotionListener(new MouseMotionAdapter() {
			public void mouseDragged(MouseEvent e) {
				setLocation(e.getXOnScreen() - posX, e.getYOnScreen() - posY);
			}
		});
		getContentPane().add(this.movilidad);
		
		//layout
		panelIntercambiable = new JPanel();
		panelIntercambiable.setBounds(0, 0, 720, 420);
		actualizadorUI = new CardLayout();
		panelIntercambiable.setLayout(actualizadorUI);
		getContentPane().add(panelIntercambiable);
		
		//paneles
		login = new LoginPanel();
		register = new RegisterPanel();
		intermedio = new PanelIntermedio();
		// TODO añadir panel principal

		//gestion paneles
		panelIntercambiable.add(login, "login");
		panelIntercambiable.add(register, "register");
		panelIntercambiable.add(intermedio, "intermedio");
		// TODO añadir panel principal
		//this.actualizadorUI.show(panelIntercambiable, "login");
		
	}
	
	public void showLoginPanel() {
        this.changePanel("login");
        this.movilidad.setBounds(0, 0, 684, 22);
    }

    public void showMainPanel() { // TODO añadir panel principal
        changePanel("mainPanel");
    }
    
    public void showRegisterPanel() {
        changePanel("register");
        this.movilidad.setBounds(42, 0, 642, 22);
    }
    
    public void showPanelIntermedio() {
        changePanel("intermedio");
    }
    
    public void resizeForMainPanel() { // TODO valores  provisionales, cambiarlos para ajustarlos al panel principal final
        setSize(1280, 720);
        this.panelIntercambiable.setSize(1280, 720);
        this.movilidad.setSize(1244, 22);
    }
    
    public void resizeForLoginPanel() {
        setSize(720,420);
        this.panelIntercambiable.setSize(720,420);
        this.movilidad.setSize(684, 22);
    }
    
    public void changePanel(String panel) {
    	this.actualizadorUI.show(panelIntercambiable, panel);
    }
    
    public void loginErrors(byte code) {
    	this.login.errors(code);
    }
    
    public void loginReset() {
    	this.login.reset();
    }
    
    public void registerReset() {
    	this.register.reset();
    }
    
}
