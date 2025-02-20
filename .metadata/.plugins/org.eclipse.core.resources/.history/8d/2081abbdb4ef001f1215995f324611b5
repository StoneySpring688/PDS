package umu.tds.AppChat.ui;

import java.awt.CardLayout;
import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import java.util.List;
import java.util.Optional;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import umu.tds.AppChat.backend.utils.EntidadComunicable;
import umu.tds.AppChat.backend.utils.Grupo;
import umu.tds.AppChat.backend.utils.Membership.MembershipType;
import umu.tds.AppChat.backend.utils.ModelMessage;
import umu.tds.AppChat.ui.chatInterface.ChatBox.BoxType;

public class AppFrame extends JFrame {

	private static final long serialVersionUID = 1L;
	int posX=0;
	int posY=0;
	private JPanel movilidad;
	private JPanel panelIntercambiable;
	private LoginPanel login;
	private RegisterPanel register;
	private MainPanel mainPanel;
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
		mainPanel = new MainPanel();
		intermedio = new PanelIntermedio();

		//gestion paneles
		panelIntercambiable.add(login, "login");
		panelIntercambiable.add(register, "register");
		panelIntercambiable.add(mainPanel, "mainPanel");
		panelIntercambiable.add(intermedio, "intermedio");
		this.actualizadorUI.show(panelIntercambiable, "login");
		
		//gestion botones
			//login.getRegisterButton().addActionListener(e -> UIController.showRegister());
			//login.getLoginButton().addActionListener(e -> UIController.doLogin());
		/*register.getBackButton().addMouseListener(new MouseAdapter() {
		    @Override
		    public void mouseClicked(MouseEvent e) {
		    	UIController.showLogin();
		    	register.reset();
		    }
		});*/
		
		/*mainPanel.getLogoutBotton().addMouseListener(new MouseAdapter() {
		    @Override
		    public void mouseClicked(MouseEvent e) {
		    	UIController.doLogout();
		    }
		});*/
		
	}
	
	public void showLoginPanel() {
        this.changePanel("login");
        this.movilidad.setBounds(0, 0, 684, 22);
    }

    public void showMainPanel() {

        changePanel("mainPanel");
        
    }
    
    public void showRegisterPanel() {
        changePanel("register");
        this.movilidad.setBounds(42, 0, 642, 22);
    }
    
    public void showPanelIntermedio() {
        changePanel("intermedio");
    }
    
    public void showAnyadirContactoPanel() {
        this.mainPanel.changePanelPrincipal("anyadirContacto");
    }
    
    public void showCrearGrupoPanel() {
        this.mainPanel.changePanelPrincipal("crearGrupo");
    }
    
    public void showChatPanel() {
    	this.mainPanel.changePanelPrincipal("chat");
    }
    
    public void showShopPanel() {
    	this.mainPanel.changePanelPrincipal("shop");
    }
    
    public void showDefaultPanel() {
    	this.mainPanel.changePanelPrincipal("porDefecto");
    }
    

    public void resizeForMainPanel() {
        setSize(1280, 720);
        this.panelIntercambiable.setSize(1280, 720);
        this.movilidad.setSize(1244, 22);
    }
    
    public void resizeForLoginPanel() {
        setSize(720,420);
        this.panelIntercambiable.setSize(720,420);
        this.movilidad.setSize(684, 22);
    }
    
    public void resetMainPanel() {
    	this.mainPanel.reset();
    }
    
    public void changePanel(String panel) {
    	this.actualizadorUI.show(panelIntercambiable, panel);
    }
    
    public void setUserInfo(String name, ImageIcon profilePicUrl) {
    	this.mainPanel.setUserInfo(name, profilePicUrl);
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
    
    @SuppressWarnings("unchecked")
	public void llamarMetodo(int numMetodo, Optional<Object> arg2, Optional<Object> arg) {
		//System.out.println("[DEBUG] llamarMetodo" + (byte) arg2.get());
		
		switch (numMetodo) {
		
		case 1: { // inicializar lista de usuarios de crearGrupo
			
			if (arg.isPresent() && arg.get() instanceof List<?>) {
				List<EntidadComunicable> lista = (List<EntidadComunicable>) arg.get();
				mainPanel.accederMetodoNoVisible(1, Optional.empty() ,Optional.of(lista));
			}
			break;
			
		}
		case 2: { // añadir un nuevo chat a la lista de chats
			if (arg.isPresent() && arg.get() instanceof EntidadComunicable) {
				this.mainPanel.accederMetodoNoVisible(2, Optional.empty() ,Optional.of(arg.get()));
			}
			break;
		}
		case 3: { // gestionar los errores en el formulario de registro
			if(!arg.isPresent() && arg2.isPresent() && arg2.get() instanceof Byte) {
				this.register.Errors((byte) arg2.get());
			}
			break;
		}
		case 4: { // gestionar los errores en el formulario para añadir contactos
			if(!arg.isPresent() && arg2.isPresent() && arg2.get() instanceof Byte) {
				this.mainPanel.accederMetodoNoVisible(3, Optional.empty() ,Optional.of(arg2.get()));
			}
			break;
		}
		case 5: { // gestionar los errores en el formulario para hacer grupos
			if(!arg.isPresent() && arg2.isPresent() && arg2.get() instanceof Byte) {
				this.mainPanel.accederMetodoNoVisible(4, Optional.empty() ,Optional.of(arg2.get()));
			}
			break;
		}
		case 6: { // añadir un nuevo grupo a la lista de grupos
			if (arg.isPresent() && arg.get() instanceof Grupo) {
				this.mainPanel.accederMetodoNoVisible(5, Optional.empty() ,Optional.of(arg.get()));
			}
			break;
		}
		case 7: { // cambiar de chat al seleccionado
			if(arg2.isPresent() && arg2.get() instanceof ElementoChatOGrupo) {
				this.mainPanel.accederMetodoNoVisible(6, Optional.empty() ,Optional.of(arg2.get()));
			}
			break;
		}
		case 8: { // renderizar mensaje
			if(arg.isPresent() && arg.get() instanceof List <?> && arg2.isPresent() && arg2.get() instanceof Integer) {
				this.mainPanel.accederMetodoNoVisible(7, Optional.of(arg2.get()) ,Optional.of(arg.get()));
			}
			break;
		}
		case 9: { // renderizar mensaje, orden inverso
			if(arg.isPresent() && arg.get() instanceof List <?> && arg2.isPresent() && arg2.get() instanceof Integer) {
				this.mainPanel.accederMetodoNoVisible(8, Optional.of(arg2.get()) ,Optional.of(arg.get()));
			}
			break;
		}
		case 10: { // preview search message
			if(arg2.isPresent() && arg2.get() instanceof ModelMessage && arg.isPresent() && arg.get() instanceof BoxType) {
				this.mainPanel.accederMetodoNoVisible(9, arg2, arg);
			}
			break;
		}
		case 11: { // actualizar la fecha de expiración del premium en ui
				this.mainPanel.accederMetodoNoVisible(10, Optional.empty(), Optional.empty());
			break;
		}
		case 12: { // cambiar el panel de la tienda
			if(arg2.isPresent() && arg2.get() instanceof Double && arg.isPresent() && arg.get() instanceof MembershipType) {
				this.mainPanel.accederMetodoNoVisible(11, arg2, arg);
			}
			break;
		}
		case 13: { // cargar las ofertas en la lista
			if(arg2.isPresent() && arg2.get() instanceof List<?>) {
				this.mainPanel.accederMetodoNoVisible(12, arg2, Optional.empty());
			}
			break;
		}
		default:
			throw new IllegalArgumentException("Unexpected value: " + numMetodo);
		}
		
	}
    
}
