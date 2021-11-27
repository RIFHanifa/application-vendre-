package login;

import java.awt.Color;
import java.awt.Font;
import java.awt.Frame;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JSeparator;
import javax.swing.JTextField;

public class Logsign {
	
	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
	new intro();
		// TODO Auto-generated method stub
		JFrame fenetre=new JFrame("Login");
			fenetre.setSize(500,600);
			fenetre.setLocationRelativeTo(null);
			fenetre.setUndecorated(true);
			fenetre.setBackground(new Color(0,0,0,0));
		
		JPanel p1=new JPanel();
			p1.setLayout(null);
			p1.setBounds(0,0, 500, 98);
			p1.setBackground(new Color(0,0,200,0));
			//p1.setBorder(BorderFactory.createLineBorder(new Color(0,0,0), 1));
		ImageIcon icone=new ImageIcon("Male User_100gpx.png");
		JLabel icon=new JLabel();
			icon.setBounds(70, 22, 100, 99);
			icon.setIcon(icone);
			//icon.setBorder(BorderFactory.createBevelBorder(0,new Color(85,85,85,105),new Color(85,85,85,200)));
			p1.add(icon);
		JPanel p2=new JPanel();
			p2.setLayout(null);
			p2.setBounds(0,100, 250, 150);
			p2.setBackground(new Color(18, 161, 154));
		JLabel signup=new JLabel("Créer Un Compte");
			signup.setForeground(new Color(238,238,238));
			signup.setFont(new Font("Arial",1,16));
			signup.setBounds(55, 45, 150, 30);
		JSeparator sh1=new JSeparator();
			sh1.setForeground(new Color(238,238,238));
			sh1.setBounds(62, 80, 115, 1);
		JLabel signin=new JLabel("Se Connecter");
			signin.setForeground(new Color(238,238,238));
			signin.setFont(new Font("Arial",1,16));
			signin.setBounds(68, 85, 150, 30);
			p2.add(signin);
			p2.add(sh1);
			p2.add(signup);
		JPanel p3=new JPanel();
			p3.setLayout(null);
			p3.setBounds(249,100, 250, 500);
			p3.setBackground(new Color(225,225,225));
			p3.setBorder(BorderFactory.createLineBorder(new Color(18,161,154)));
		ImageIcon mini=new ImageIcon("Subtract_20px.png");
		JLabel min=new JLabel();
			min.setBounds(202, 5, 23, 20);
			min.setIcon(mini);
			min.addMouseListener(new MouseAdapter(){
				public void mouseEntered(MouseEvent me){
					min.setBorder(BorderFactory.createBevelBorder(0, new Color(100,100,100), new Color(85,85,85)));
				}
				public void mouseExited(MouseEvent me){
					min.setBorder(null);
				}
				public void mouseClicked(MouseEvent me){
					min.setBorder(null);
					fenetre.setState(Frame.ICONIFIED);
				}
			});
		ImageIcon droite=new ImageIcon("droite.png");
		JLabel flechd=new JLabel();
				flechd.setBounds(-5,50, 20, 35);
				flechd.setIcon(droite);
			p3.add(flechd);
			p3.add(min);
		ImageIcon close=new ImageIcon("Delete_20px.png");
		JLabel clos=new JLabel();
			clos.setBounds(225, 5, 23,20);
			clos.setIcon(close);
			clos.setBackground(new Color(200,200,200));
			clos.addMouseListener(new MouseAdapter(){
				public void mouseEntered(MouseEvent me){
					clos.setBorder(BorderFactory.createBevelBorder(0, new Color(100,100,100), new Color(85,85,85)));
				}
				public void mouseExited(MouseEvent me){
					clos.setBorder(null);
				}
				public void mouseClicked(MouseEvent me){
					fenetre.dispose();
				}
			});
			p3.add(clos);
		JPanel p5=new JPanel();
			p5.setBackground(new Color(187, 190, 191));
			p5.setBounds(25,65,200,45);
			p5.setLayout(null);
		ImageIcon i=new ImageIcon("Administrator Male_35px.png");
		JLabel l2=new JLabel();
			l2.setBounds(5, 5, 35, 35);
			l2.setIcon(i);
		JTextField username=new JTextField("Nom d'utilisateur");
			username.setBackground(new Color(187, 190, 191));
			username.setBorder(null);
			username.setBounds(45, 5, 150, 35);
			username.setFont(new Font("Arial",0,12));
			username.setForeground(new Color(90,90,90));
			username.addMouseListener(new MouseAdapter() {
				public void mouseClicked(MouseEvent me) {
					if(username.getText().contains("Nom d'utilisateur")) {
					username.setText("");
					username.setForeground(Color.BLACK);
				}
				}
			});
			p5.add(username);
			p5.add(l2);
		JPanel p6=new JPanel();
			p6.setBackground(new Color(187, 190, 191));
			p6.setBounds(25,130,200,45);
			p6.setLayout(null);
		ImageIcon i2=new ImageIcon("Email_35px.png");
		JLabel l3=new JLabel();
			l3.setBounds(5, 5, 35, 35);
			l3.setIcon(i2);
			p6.add(l3);
		JTextField email=new JTextField("E-mail");
			email.setBackground(new Color(187, 190, 191));
			email.setBorder(null);
			email.setBounds(45, 5, 150, 35);
			email.setFont(new Font("Arial",0,12));
			email.setForeground(new Color(90,90,90));
			email.addMouseListener(new MouseAdapter() {
				public void mouseClicked(MouseEvent me) {
				if(email.getText().contains("E-mail")) {
					email.setText("");
					email.setForeground(Color.black);
				}
				}
			});
			p6.add(email);
		JPanel p7=new JPanel();
			p7.setBackground(new Color(187, 190, 191));
			p7.setBounds(25,195,200,45);
			p7.setLayout(null);
		ImageIcon i3=new ImageIcon("Password 1_35px.png");
		JLabel ipw=new JLabel();
			ipw.setBounds(5, 5, 35, 35);
			ipw.setIcon(i3);
			p7.add(ipw);
		JTextField pwrplce=new JTextField("Mot de Passe");
			pwrplce.setBackground(new Color(187, 190, 191));
			pwrplce.setBorder(null);
			pwrplce.setBounds(45, 5, 150, 35);
			pwrplce.setFont(new Font("Arial",0,12));
			pwrplce.setForeground(new Color(90,90,90));
			p7.add(pwrplce);
		JPasswordField passw=new JPasswordField();
			passw.setBackground(new Color(187, 190, 191));
			passw.setBorder(null);
			passw.setBounds(45, 5, 150, 35);
			passw.setFont(new Font("Arial",0,12));
			p7.add(passw);
			passw.hide();
			pwrplce.addMouseListener(new MouseAdapter() {
				public void mouseClicked(MouseEvent me) {
					pwrplce.hide();
					passw.show();
					passw.setText("");
				}
			});
		JPanel p8=new JPanel();
			p8.setBackground(new Color(187, 190, 191));
			p8.setBounds(25,260,200,45);
			p8.setLayout(null);
		ImageIcon i4=new ImageIcon("Password 1_35px.png");
		JLabel icpw=new JLabel();
			icpw.setBounds(5, 5, 35, 35);
			icpw.setIcon(i4);
			p8.add(icpw);
		JTextField cpwrplce=new JTextField("Confirmer Mot de Passe");
			cpwrplce.setBackground(new Color(187, 190, 191));
			cpwrplce.setBorder(null);
			cpwrplce.setBounds(45, 5, 150, 35);
			cpwrplce.setFont(new Font("Arial",0,12));
			cpwrplce.setForeground(new Color(90,90,90));
			p8.add(cpwrplce);
		JPasswordField cpassw=new JPasswordField();
			cpassw.setVerifyInputWhenFocusTarget(true);
			cpassw.setBackground(new Color(187, 190, 191));
			cpassw.setBorder(null);
			cpassw.setBounds(45, 5, 150, 35);
			cpassw.setFont(new Font("Arial",0,12));
			p8.add(cpassw);
			cpassw.hide();
			cpwrplce.addMouseListener(new MouseAdapter() {
				public void mouseClicked(MouseEvent me) {
					cpwrplce.hide();
					cpassw.show();
					cpassw.setText("");
				}
			});
		JButton b1=new JButton("Créer Un Compte");
			b1.setForeground(new Color(225,225,225));
			b1.setBackground(new Color(18, 161, 154));
			b1.setBounds(25, 420, 200, 40);
			b1.setBorder(null);
			p3.add(b1);
			p3.add(p5);
			p3.add(p6);
			p3.add(p7);
			p3.add(p8);
		JPanel p4=new JPanel();
			p4.setLayout(null);
			p4.setBounds(0,250, 250, 350);
			p4.setBackground(new Color(225,225,225));
			p4.setBorder(BorderFactory.createLineBorder(new Color(18,161,154)));
		ImageIcon bas=new ImageIcon("bas.png");
		JLabel flechb=new JLabel();
			flechb.setBounds(100,-13, 45, 30);
			flechb.setIcon(bas);
			p4.add(flechb);
		JPanel p9=new JPanel();
			p9.setBackground(new Color(187, 190, 191));
			p9.setBounds(25,44,200,45);
			p9.setLayout(null);
		JLabel usn=new JLabel();
			usn.setBounds(5, 5, 35, 35);
			usn.setIcon(i);
		JTextField username2=new JTextField("Nom d'utilisateur");
			username2.setBackground(new Color(187, 190, 191));
			username2.setBorder(null);
			username2.setBounds(45, 5, 150, 35);
			username2.setForeground(new Color(90,90,90));
			username2.setFont(new Font("Arial",0,12));
			p9.add(username2);
			username2.addMouseListener(new MouseAdapter() {
				public void mouseClicked(MouseEvent me) {
					if(username2.getText().contains("Nom d'utilisateur")) {
						username2.setText("");
						username2.setForeground(Color.black);
					}
				}
			});
		JPanel p10=new JPanel();
			p10.setBackground(new Color(187, 190, 191));
			p10.setBounds(25,109,200,45);
			p10.setLayout(null);
		JLabel pw=new JLabel();
			pw.setBounds(5, 5, 35, 35);
			pw.setIcon(i3);
			p10.add(pw);
		JTextField psswrdrplce=new JTextField("Mot de Passe");
			psswrdrplce.setBackground(new Color(187, 190, 191));
			psswrdrplce.setBorder(null);
			psswrdrplce.setBounds(45, 5, 150, 35);
			psswrdrplce.setFont(new Font("Arial",0,12));
			psswrdrplce.setForeground(new Color(90,90,90));
			p10.add(psswrdrplce);
		JPasswordField psswrd=new JPasswordField();
			psswrd.setBackground(new Color(187, 190, 191));
			psswrd.setBorder(null);
			psswrd.setBounds(45, 5, 150, 35);
			psswrd.setFont(new Font("Arial",0,12));
			p10.add(psswrd);
			psswrd.hide();
			psswrdrplce.addMouseListener(new MouseAdapter() {
				public void mouseClicked(MouseEvent me) {
					psswrd.setText("");
					psswrdrplce.hide();
					psswrd.show();
					
				}
			});
		JButton b2=new JButton("Se Connecter");
			b2.setForeground(new Color(225,225,225));
			b2.setBackground(new Color(18, 161, 154));
			b2.setBounds(25, 270, 200, 40);
			b2.setBorder(null);
			b2.addActionListener(ActionEvent ->{
				if(username2.getText().contains("Reda1815")&&psswrd.getText().contains("reda1815")) {
				fenetre.setVisible(false);
				new principe();}
				else JOptionPane.showMessageDialog(fenetre, "nom d'utilisateur ou Mot de passe incorrect", null, 0);
			});
		JCheckBox  cb=new JCheckBox("Rester Connecté");
			cb.setForeground(new Color(82, 89, 92));
			cb.setFont(new Font("Arial",1,12));
			cb.setBounds(25, 245, 200, 15);
			cb.setBackground(null);
			cb.setBorder(null);
			cb.setBorderPaintedFlat(false);
			p4.add(cb);
			p4.add(b2);
			p9.add(usn);
			p4.add(p9);
			p4.add(p10);
		@SuppressWarnings("static-access")
		JSeparator s1=new JSeparator(new JSeparator().VERTICAL);
			s1.setBounds(249, 20, 2, 310);
			s1.setForeground(new Color(180,180,180));
			p4.add(s1);
			fenetre.add(p4);
			fenetre.add(p3);
			fenetre.add(p2);
			fenetre.add(p1);
			fenetre.setVisible(true);
	}

}
