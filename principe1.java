package login;

import java.awt.Color;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Panel;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JSeparator;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

public class principe1 extends JFrame  {
	@SuppressWarnings("deprecation")
	JLabel homeicon;
	JPanel menupanel;
	JLabel venicon;
	JLabel stocicon;
	JLabel CEicon;
	JLabel CRicon;
	JLabel proficon;
	JPanel vendre;
	JLabel vendret;
	JLabel vendicon;
	JPanel commandeR;
	JLabel commandicon;
	JLabel commandert;
	JPanel commandeE;
	JLabel commandeicon;
	JLabel commandet;
	JPanel stock;
	JLabel stockt;
	JLabel stockicon;
	JPanel profil;
	JLabel profilt;
	JLabel profilicon;
	JSeparator s1,s2,s3,s4;
	JPanel window1;
	JPanel groupepanel;
	JLabel drag;
	JLabel fleche;
	JLabel logo;
	JPanel band;
	JLabel clos;
	JLabel min;
	JPanel panel_of_vente;
	JPanel Nproduit;
	JLabel Nproduiticn;
	JTextField  Nproduittxt;
	JPanel Quant;
	JLabel Quanticn;
	JTextField Quanttxt;
	JPanel Price;
	JLabel Priceicn;
	JTextField Pricetxt;
	JLabel Errmsg;
	JButton addProd;
	JPanel panel_of_commandeE;
	JButton addcomE;
	JTable commandeETbl;
	JScrollPane sp;
	JLabel righticn;
	JLabel menuicn;
	JPanel iconpanel;
	JLabel Errmsg1;
	int mousepx,mousepy;
	JPanel hover;
	public principe1(){	
		 homeicon=new JLabel(new ImageIcon("Market Square_100px.png"));
		 menupanel=new JPanel();
		 venicon=new JLabel(new ImageIcon("Money Bag_104px.png"));
		 proficon=new JLabel(new ImageIcon("Profile_100px.png"));
		 stocicon=new JLabel(new ImageIcon("Sell Stock_100px.png"));
		 CRicon=new JLabel(new ImageIcon("Purchase Order_104px.png"));
		 CEicon=new JLabel(new ImageIcon("Sell Order_100px.png"));
		 vendre=new JPanel();
		 vendret=new JLabel("Vendre");
		 vendret.setFont(new Font("Arial",1,12));
		 vendicon=new JLabel(new ImageIcon("MoneyBag_30px.png"));
		 commandicon=new JLabel(new ImageIcon("PurchaseOrder_30px.png"));
		 commandeE=new JPanel();
		 commandeicon=new JLabel(new ImageIcon("sellOrder_30px.png"));
		 commandet=new JLabel("Commandes Reçues");
		 drag=new JLabel();
		 fleche=new JLabel(new ImageIcon("droite.png"));
		 window1=new JPanel();
		 logo=new JLabel(new ImageIcon("logo_bigger3.png"));
		 groupepanel=new JPanel();
		 stockt=new JLabel("Stock");
		 band=new JPanel();
		 clos=new JLabel(new ImageIcon("Delete_20px.png"));
		 min=new JLabel(new ImageIcon("Subtract_20px.png"));
		 homeicon.setBounds(0, 0, 200, 100);
		 panel_of_vente=new JPanel();
		 Nproduit=new JPanel();
		 Nproduiticn=new JLabel(new ImageIcon("Dog Tag_35px.png"));
		 Quant=new JPanel();
		 Quanticn=new JLabel(new ImageIcon("Rain Gauge_35px.png"));
		 Quanttxt = new JTextField (" Quantité du Produit");
		 Price=new JPanel();
		 s1=new JSeparator();
		 s2=new JSeparator();
		 s3=new JSeparator();
		 s4=new JSeparator();
		 Priceicn=new JLabel(new ImageIcon("Price_35px.png"));
		 Pricetxt=new JTextField (" Prix du Produit");
		 Errmsg=new JLabel("Format Invalide (Exemple:15)");
		 Errmsg1=new JLabel("Format Invalide (Exemple:45.99)");
		 addProd=new JButton("Ajouter");
		 menuicn=new JLabel(new ImageIcon("Left_25px.png"));
		 righticn=new JLabel(new ImageIcon("Right_25px.png"));
		 panel_of_commandeE=new JPanel();
		 addcomE=new JButton("Ajouter");
		 commandeETbl=new JTable();
		 sp=new JScrollPane();
		 iconpanel=new JPanel();
		 commandert=new JLabel(" Commandes Envoyées");
		 commandeR=new JPanel();
		 stockicon=new JLabel(new ImageIcon("Sell Stock_30px.png"));
		 profilicon=new JLabel(new ImageIcon("Profile_30px.png"));
		 profil=new JPanel();
		 profilt=new JLabel("Profile");
		 Nproduittxt=new JTextField("Nom Du Produit");
		 stock=new JPanel();
		 hover = new JPanel();
			 
		 Price.setBounds(50, 190, 200, 50);
		 Price.setBackground(new Color(187,190,191));
		 Price.setLayout(null);
		this.setSize(900,700);
		this.setLocationRelativeTo(null);
		this.setUndecorated(true);
		this.setLayout(null);
		this.setBackground(new Color(0,0,0,0));
		this.setPreferredSize(null);
		
			iconpanel.setBounds(0, 0, 900, 100);
			iconpanel.setBackground(new Color(255,255,255,0));
			iconpanel.setLayout(null);
		
		
		 
			iconpanel.add(homeicon);
			
			this.add(iconpanel);
		
			
			menupanel.setBounds(0,100,200,600);
			menupanel.setBackground(new Color(18, 161, 154));
			menupanel.setLayout(null);
			
		
			
			venicon.setBounds(50,50,105,105);
			venicon.hide();
		 
			
			proficon.setBounds(50,50,105,105);
			proficon.hide();
			
			
			stocicon.setBounds(50,50,105,105);
			stocicon.hide();
		
			
			CRicon.setBounds(50,50,105,105);
			CRicon.hide();
		
			
			CEicon.setBounds(50,50,105,105);
			CEicon.hide();
			
	
		
		
		   
			vendre.setLayout(null);
			vendre.setBackground(new Color(18,161,154));
			vendre.setBounds(0,180,200,55);
			
		   
			
			vendret.setBounds(83, 5, 160, 45);
			vendret.setForeground(new Color(220,220,220));
			
			vendre.add(vendret);
			
		    
			vendicon.setBounds(5,8, 40, 40);
			
			vendre.add(vendicon);
			menupanel.add(vendre);
			menupanel.add(CRicon);
			menupanel.add(CEicon);
			menupanel.add(stocicon);
			menupanel.add(proficon);
			menupanel.add(venicon);
			
			commandeR.setLayout(null);
			commandeR.setBackground(new Color(18,161,154));
			commandeR.setBounds(0,236,200,55);
			commandeR.addMouseListener(new MouseAdapter(){
				public void mouseEntered(MouseEvent me){
					commandeR.setBackground(new Color(75, 185, 194));
				}
				public void mouseExited(MouseEvent me){
					commandeR.setBackground(new Color(18, 161, 154));
				}
				public void mouseClicked(MouseEvent me){
					
				}
			});
		    
			commandicon.setBounds(5,8, 40, 40);
			
			commandeR.add(commandicon);
		    
			
			commandert.setFont(new Font("Arial",1,12));
			commandert.setBounds(42, 5, 160, 45);
			commandert.setForeground(new Color(220,220,220));

			commandeR.add(commandert);
			menupanel.add(commandeR);

            
			commandeE.setLayout(null);
			commandeE.setBackground(new Color(18,161,154));
			commandeE.setBounds(0,292,200,55);
			
		    
			commandeicon.setBounds(5,8, 40, 40);
			commandeE.add(commandeicon);
		    
			
			commandet.setFont(new Font("Arial",1,12));
			commandet.setBounds(45, 5, 160, 45);
			commandet.setForeground(new Color(220,220,220));
			commandeE.add(commandet);
			menupanel.add(commandeE);	
		  
			
			stock.setLayout(null);
			stock.setBackground(new Color(18,161,154));
			stock.setBounds(0,348,200,55);
			
		   
			stockt.setFont(new Font("Arial",1,12));
			stockt.setBounds(85, 5, 160, 45);
			stockt.setForeground(new Color(220,220,220));
			stock.add(stockt);
		   
			
			stockicon.setBounds(5,8, 40, 40);
			stock.add(stockicon);
			menupanel.add(stock);
		    
			profil.setLayout(null);
			profil.setBackground(new Color(18,161,154));
			profil.setBounds(0,404,200,55);
			
		    
			profilt.setFont(new Font("Arial",1,12));
			profilt.setBounds(83, 5, 160, 45);
			profilt.setForeground(new Color(220,220,220));
			profil.add(profilt);
	        
			
			profilicon.setBounds(5,8, 40, 40);
			profil.add(profilicon);
		
			menupanel.add(profil);
		    
			
			
			s1.setForeground(new Color(200,200,200));
			s2.setForeground(new Color(200,200,200));
			s3.setForeground(new Color(200,200,200));
			s4.setForeground(new Color(200,200,200));
			s1.setBounds(25, 235, 150, 1);
			s2.setBounds(25, 291, 150, 1);
			s3.setBounds(25, 347, 150, 1);
			s4.setBounds(25, 403, 150, 1);
			
			menupanel.add(s1);
			menupanel.add(s2);
			menupanel.add(s3);
			menupanel.add(s4);
			
			this.add(menupanel);
			
			window1.setBackground(new Color(225,225,225));
			window1.setLayout(null);
			window1.setBounds(200, 100, 700, 600);
			window1.setBorder(BorderFactory.createLineBorder(new Color(18,161,154)));
		   
			
			drag.setBounds(0, 0, 640,30);
			drag.addMouseMotionListener(new MouseAdapter() {
				public void mousePressed(MouseEvent me) {
					mousepx=me.getX();
					mousepy=me.getY();
				}
				public void mouseDragged(MouseEvent me) {
					setLocation(me.getXOnScreen()-mousepx, me.getYOnScreen()-mousepy);
				}
				
			});
			window1.add(drag);
			
			groupepanel.setBackground(new Color(225,225,225));
			groupepanel.setLayout(null);
			groupepanel.setBounds(0, 180,699, 400);
		    
			
		    
			
			logo.setBounds(50, 0, 550, 400);
			logo.setForeground(new Color(0,0,0,0));
			groupepanel.add(logo);
			
		groupepanel.add(fleche);
		window1.add(groupepanel);
		 
		    
			band.setBounds(0, 30, 700, 150);
			band.setLayout(null);
			band.setBackground(new Color(18, 164, 154));
		window1.add(band);
			
			clos.setBounds(670, 5, 23,20);
			clos.addMouseListener(new MouseAdapter(){
				public void mouseEntered(MouseEvent me){
					clos.setBorder(BorderFactory.createBevelBorder(0, new Color(100,100,100), new Color(85,85,85)));
				}
				public void mouseExited(MouseEvent me){
					clos.setBorder(null);
				}
				public void mouseClicked(MouseEvent me){
					dispose();
				}
			});
			
			
			min.setBounds(640, 5, 23, 20);
			
			min.addMouseListener(new MouseAdapter(){
				public void mouseEntered(MouseEvent me){
					min.setBorder(BorderFactory.createBevelBorder(0, new Color(100,100,100), new Color(85,85,85)));
				}
				public void mouseExited(MouseEvent me){
					min.setBorder(null);
				}
				public void mouseClicked(MouseEvent me){
					min.setBorder(null);
					setState(Frame.ICONIFIED);
				}
			});
			
			
			
			
			//____________________________________________//
			//creating the panels that contain menu_opened//
			//--------------------------------------------//
			
			   
				panel_of_vente.setBounds(0,180, 854, 419);
				panel_of_vente.setBackground(new Color(225,225,225));
				panel_of_vente.setLayout(null);
				panel_of_vente.add(fleche);
			    
				
				Nproduit.setBounds(50, 30, 200, 50);
				Nproduit.setBackground(new Color(187, 190, 191));
				Nproduit.setLayout(null);
			 
				
				Nproduiticn.setBounds(5, 5, 40, 40);
				Nproduit.add(Nproduiticn);
			
				
				Nproduittxt.setBounds(45, 5, 150, 40);
				Nproduittxt.setBorder(null);
				Nproduittxt.setBackground(new Color(187,190,191));
				Nproduittxt.setForeground(new Color(90,90,90));
				Nproduittxt.setFont(new Font("Arial",0,12));
				Nproduittxt.addMouseListener(new MouseAdapter() {
					public void mouseClicked(MouseEvent me) {
						Nproduittxt.setText("");
					}
				});
				Nproduit.add(Nproduittxt);
				panel_of_vente.add(Nproduit);
			
			
				Quant.setBounds(50,110,200,50);
				Quant.setBackground(new Color(187,190,191));
				Quant.setLayout(null);
			
				
				Quanticn.setBounds(5, 5, 40, 40);
				Quant.add(Quanticn);
			
				
				Quanttxt.setBounds(45, 5, 150, 40);
				Quanttxt.setBorder(null);
				Quanttxt.setBackground(new Color(187,190,191));
				Quanttxt.setForeground(new Color(90,90,90));
				Quanttxt.setFont(new Font("Arial",0,12));
				Quanttxt.addMouseListener(new MouseAdapter() {
					public void mouseClicked(MouseEvent me) {
						Quanttxt.setText("");
					}
				});
				Quant.add(Quanttxt);
				panel_of_vente.add(Quant);
		
		
				Priceicn.setBounds(5, 5, 40, 40);
				Price.add(Priceicn);
			
				Pricetxt.setBounds(45, 5, 150, 40);
				Pricetxt.setBorder(null);
				Pricetxt.setBackground(new Color(187,190,191));
				Pricetxt.setForeground(new Color(90,90,90));
				Pricetxt.setFont(new Font("Arial",0,12));
				Pricetxt.addMouseListener(new MouseAdapter() {
					public void mouseClicked(MouseEvent me) {
						Pricetxt.setText("");
					}
				});
				Price.add(Pricetxt);
				panel_of_vente.add(Price);
			
				Errmsg.setForeground(Color.RED);
				panel_of_vente.add(Errmsg);
				Errmsg.hide();
				
				Errmsg1.setForeground(Color.RED);
				panel_of_vente.add(Errmsg1);
				Errmsg1.hide();
			 
				addProd.setBackground(new Color(18,161,154));
				addProd.setBounds(280, 110, 120, 50);
				addProd.setForeground(new Color(238,238,238));
				addProd.setBorder(null);
				addProd.addActionListener(ActionEvent ->{
					if(Pricetxt.getText().isEmpty()||Quanttxt.getText().isEmpty()||Nproduittxt.getText().isEmpty()) {
						JOptionPane.showMessageDialog(addProd, "Veuillez remplir tous les champs vide pour Ajouter", null, 1);
					}
					else {
					try {
						Integer.parseInt(Quanttxt.getText());
						Errmsg.hide();
					}
					catch(NumberFormatException e){
						Errmsg.setBounds(50,160,200,20);
						Errmsg.show();
					}
					try {
						Float.parseFloat(Pricetxt.getText());
						Errmsg1.hide();
					}
					catch(NumberFormatException e){
						Errmsg1.setBounds(50,240,200,20);
						Errmsg1.show();
					}
					}
				});
				panel_of_vente.add(addProd);
			
			
			
			
			
			
			
			
			window1.add(panel_of_vente);
			panel_of_vente.hide();
			//____________________________________________//
	
				panel_of_commandeE.setBounds(0,180, 854, 419);
				panel_of_commandeE.setBackground(new Color(225,225,225));
				panel_of_commandeE.setLayout(null);
			
				addcomE.setBackground(new Color(18,161,154));
				addcomE.setBackground(new Color(18,161,154));
				addcomE.setBounds(80, 60, 120, 50);
				addcomE.setForeground(new Color(238,238,238));
				addcomE.setBorder(null);
				panel_of_commandeE.add(addcomE);
				
					
					 sp.setViewportView(commandeETbl);
				        sp.setVisible(true);
				        sp.setSize(400,200);
				       sp.setBounds(300,100,520,250);
				 
				 commandeETbl.setModel(new DefaultTableModel(  
				    		
				    		  new Object [][] {
				    				    {null, null, null,null },
				    	                {null, null, null ,null},
				    	                {null, null, null ,null},
				    	                {null, null, null ,null},
				    	                {null, null, null ,null},
				    	                {null, null, null ,null},
				    	                {null, null, null ,null}
				    	            },
				    	            new String [] {
				    	                "nom produit", "quantite", "prix unitaire","prix totale"
				    	            }
				    		));
				 commandeETbl.setBounds(300, 80, 500, 150);
			panel_of_commandeE.add(sp);
			
			
			
			
			
			
			
				window1.add(panel_of_commandeE);
				panel_of_commandeE.hide();
			//___________________________________________//

			righticn.setBounds(10, 5, 25, 25);
			righticn.hide();
			righticn.addMouseListener(new MouseAdapter() {
				public void mouseClicked(MouseEvent me) {
					menupanel.setBounds(0,100,200,600);
					window1.setBounds(200, 100, 700, 600);
					clos.setBounds(670, 5, 23,20);
					band.setBounds(0, 30, 700, 150);
					min.setBounds(640, 5, 23, 20);
					logo.setBounds(50, 0, 600, 400);
					righticn.hide();
					menuicn.show();
				}
			});
			menuicn.setBounds(170, 5, 25, 25);
			menuicn.addMouseListener(new MouseAdapter() {
				public void mouseClicked(MouseEvent me) {
					menupanel.setBounds(0,100,45,600);
					window1.setBounds(45, 100, 855, 600);
					band.setBounds(0, 30, 855, 150);
					clos.setBounds(825, 5, 23,20);
					min.setBounds(795, 5, 23, 20);
					logo.setBounds(125, 0, 600, 400);
					menuicn.hide();
					righticn.show();
				}
			});
			vendre.addMouseListener(new MouseAdapter(){
				public void mouseEntered(MouseEvent me){
					vendre.setBackground(new Color(75, 185, 194));
					venicon.show();
				}
				public void mouseExited(MouseEvent me){
					vendre.setBackground(new Color(18, 161, 154));
					venicon.hide();
				}
				public void mouseClicked(MouseEvent me){
					fleche.setBounds(-10, 10, 25, 35);
					fleche.show();
					//logo.hide();
					groupepanel.hide();
					menupanel.setBounds(0,100,45,600);
					window1.setBounds(45, 100, 855, 600);
					band.setBounds(0, 30, 900, 150);
					clos.setBounds(825, 5, 23,20);
					min.setBounds(795, 5, 23, 20);
					panel_of_vente.show();
					menuicn.hide();
					righticn.show();
					

				}
			});
			commandeE.addMouseListener(new MouseAdapter(){
				public void mouseEntered(MouseEvent me){
					commandeE.setBackground(new Color(75, 185, 194));
					CEicon.show();
				}
				public void mouseExited(MouseEvent me){
					commandeE.setBackground(new Color(18, 161, 154));
					CEicon.hide();
					
				}
				public void mouseClicked(MouseEvent me){
					fleche.setBounds(-10,122,25,35);
					logo.hide();
					menupanel.setBounds(0,100,45,600);
					window1.setBounds(45, 100, 855, 600);
					band.setBounds(0, 30, 900, 150);
					clos.setBounds(825, 5, 23,20);
					min.setBounds(795, 5, 23, 20);
					menuicn.hide();
					righticn.show();
					panel_of_vente.hide();
					panel_of_commandeE.show();
				}
			});
			commandeR.addMouseListener(new MouseAdapter(){
				public void mouseEntered(MouseEvent me){
					commandeR.setBackground(new Color(75, 185, 194));
					CRicon.show();
				}
				public void mouseExited(MouseEvent me){
					commandeR.setBackground(new Color(18, 161, 154));
					CRicon.hide();
				}
				public void mouseClicked(MouseEvent me){
					fleche.setBounds(-10,67,25,35);
					logo.hide();
					menupanel.setBounds(0,100,45,600);
					window1.setBounds(45, 100, 855, 600);
					band.setBounds(0, 30, 900, 150);
					clos.setBounds(825, 5, 23,20);
					min.setBounds(795, 5, 23, 20);
					menuicn.hide();
					righticn.show();
				}
			});
			profil.addMouseListener(new MouseAdapter(){
				public void mouseEntered(MouseEvent me){
					profil.setBackground(new Color(75, 185, 194));
					
					proficon.show();
					
				}
				public void mouseExited(MouseEvent me){
					profil.setBackground(new Color(18, 161, 154));
					proficon.hide();
			
				}
				public void mouseClicked(MouseEvent me){
					fleche.setBounds(-10,234,25,35);
					logo.hide();
					menupanel.setBounds(0,100,45,600);
					window1.setBounds(45, 100, 855, 600);
					band.setBounds(0, 30, 900, 150);
					clos.setBounds(825, 5, 23,20);
					min.setBounds(795, 5, 23, 20);
					menuicn.hide();
					righticn.show();
				}
			});
			stock.addMouseListener(new MouseAdapter(){
				public void mouseEntered(MouseEvent me){
					stock.setBackground(new Color(75, 185, 194));
					stocicon.show();
				}
				public void mouseExited(MouseEvent me){
					stock.setBackground(new Color(18, 161, 154));
					stocicon.hide();
				}
				public void mouseClicked(MouseEvent me){
					fleche.setBounds(-10,179,25,35);
					logo.hide();
					menupanel.setBounds(0,100,45,600);
					window1.setBounds(45, 100, 855, 600);
					band.setBounds(0, 30, 900, 150);
					clos.setBounds(825, 5, 23,20);
					min.setBounds(795, 5, 23, 20);
					menuicn.hide();
					righticn.show();
					
				}
			});
		
		
			window1.add(min);
			window1.add(clos);
		
			menupanel.add(menuicn);
			menupanel.add(righticn);
			this.add(window1);
		this.setVisible(true);
	}

	public static void main(String[] args) {
		
		new principe1();
	}

}
