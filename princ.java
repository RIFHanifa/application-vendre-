package login;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Date;




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

public class princ extends JFrame  {
	int i=0;
	int mousepx,mousepy;
	@SuppressWarnings("deprecation")
	JLabel homeicon;
	JPanel menupanel;
	JPanel colormenu;
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
	JPanel panal_of_stock;
	JButton addcomE;
	JTable commandeETbl;
	JScrollPane sp;
	JLabel righticn;
	JLabel menuicn;
	JPanel iconpanel;
    JLabel Errmsg1;
	 JPanel hover;
	private JButton delProd;
	 JTable VenteTbl,stocktbl;
	private JButton addstck;
	private JTextField idprotxt;
	private JLabel idpicn;
	private JPanel idp;
	private JLabel Nproduiticn1;
	private JTextField Nproduittxt1;
	private JPanel Nproduit1;
	private JTextField datstocktxt;
	private JLabel datstocicon;
	private JPanel dat;
	private JLabel Quanticn1;
	private JTextField Quanttxt1;
	private JPanel Quant1;
	private JLabel fournicn;
	private JPanel fourn;
	private JTextField fourntxt;
	private JScrollPane sp1;
	private JTextField totaltxt;
	private JButton delstock;
	private int selectrow;
	DefaultTableModel a;
	private JLabel quitter;
	public princ(){	
		homeicon=new JLabel(new ImageIcon("Market Square_100px.gif"));
		 venicon=new JLabel(new ImageIcon("Money Bag_104px.png"));
		 proficon=new JLabel(new ImageIcon("Profile_100px.png"));
		 stocicon=new JLabel(new ImageIcon("Sell Stock_100px.png"));
		 CRicon=new JLabel(new ImageIcon("Purchase Order_104px.png"));
		 CEicon=new JLabel(new ImageIcon("Sell Order_100px.png"));
		 vendret=new JLabel("Vendre");
		 vendicon=new JLabel(new ImageIcon("MoneyBag_30px.png"));
		 commandicon=new JLabel(new ImageIcon("PurchaseOrder_30px.png"));
		 commandeicon=new JLabel(new ImageIcon("sellOrder_30px.png"));
		 commandet=new JLabel("Commandes Reçues");
		 drag=new JLabel();
		 fleche=new JLabel(new ImageIcon("droite.png"));
		 logo=new JLabel(new ImageIcon("logo_bigger3.png"));
		 stockt=new JLabel("Stock");
		 profilt=new JLabel("Profile");
		 clos=new JLabel(new ImageIcon("Delete_20px.png"));
		 min=new JLabel(new ImageIcon("Subtract_20px.png"));
		Priceicn=new JLabel(new ImageIcon("Price_35px.png"));
		Quanticn=new JLabel(new ImageIcon("Rain Gauge_35px.png"));
		idp=new JPanel();
		idpicn=new JLabel(new ImageIcon("icon_id_35px.png"));
		 Errmsg=new JLabel("Format Invalide (Exemple:15)");
		 Errmsg1=new JLabel("Format Invalide (Exemple:45.99)");
		 commandert=new JLabel(" Commandes Envoyées");
		 stockicon=new JLabel(new ImageIcon("Sell Stock_30px.png"));
		 menuicn=new JLabel(new ImageIcon("Left_25px.png"));
		 righticn=new JLabel(new ImageIcon("Right_25px.png"));
		 Pricetxt=new JTextField (" Prix du Produit");
		 Nproduittxt=new JTextField (" Nom du Produit");
		 Nproduittxt1=new JTextField (" Nom du Produit");
		 Nproduiticn=new JLabel(new ImageIcon("Dog Tag_35px.png"));
		 Nproduiticn1=new JLabel(new ImageIcon("Dog Tag_35px.png"));
		 Quanticn=new JLabel(new ImageIcon("Rain Gauge_35px.png"));
	   	Quanttxt = new JTextField (" Quantité du Produit");
	   	Quant=new JPanel();
		 fournicn=new JLabel(new ImageIcon("icon_Truck_35px.png"));
	   	fourntxt = new JTextField ("fournisseur");
	   	fourn=new JPanel();
		 Quanticn1=new JLabel(new ImageIcon("Rain Gauge_35px.png"));
	   	Quanttxt1= new JTextField (" Quantité du Produit");
	   	Quant1=new JPanel();
	   	idprotxt= new JTextField (" id du Produit");
		s1=new JSeparator();
		s2=new JSeparator();
		s3=new JSeparator();
		s4=new JSeparator();
		 sp=new JScrollPane();
		 sp1=new JScrollPane();
		 commandeETbl=new JTable();
		 commandeR=new JPanel();
		 hover=new JPanel();
		 menupanel=new JPanel();
		 commandeE=new JPanel();
		 window1=new JPanel();
		 groupepanel=new JPanel();
		 band=new JPanel();
		 vendre=new JPanel();
		 stock=new JPanel();
		 panel_of_vente=new JPanel();
		 Nproduit=new JPanel();
		 Nproduit1=new JPanel();
		 iconpanel=new JPanel();
		 panal_of_stock=new JPanel(); 
		 panel_of_commandeE=new JPanel();
		 Price=new JPanel();
		 colormenu=new JPanel();
		 addcomE=new JButton("Ajouter");
		 addProd=new JButton("Ajouter");
		 addstck=new JButton("Ajouter");
		 delProd=new JButton("Supprimer");
		 delstock=new JButton("Supprimer");
         VenteTbl=new JTable();
	    stocktbl=new JTable();
	    datstocktxt=new JTextField("date de stock");
	    datstocicon=new JLabel(new ImageIcon("icon_Date_35px.png"));
	    dat=new JPanel();
	    totaltxt=new JTextField("");
	     a=new DefaultTableModel();
	    quitter=new JLabel(new ImageIcon("exitt.png"));
		this.setSize(900,700);
		this.setLocationRelativeTo(null);
		this.setUndecorated(true);
		this.setLayout(null);
		this.setBackground(new Color(0,0,0,0));
		this.setPreferredSize(null);
		
		Price.setBounds(50, 190, 200, 50);	
		Price.setBackground(new Color(187,190,191));
		Price.setLayout(null); 
		
			iconpanel.setBounds(0, 0, 900, 100);
			iconpanel.setBackground(new Color(255,255,255,0));
			iconpanel.setLayout(null);
		
			hover.setBackground(new Color(255,255,255,60));
		 
			homeicon.setBounds(0, 0, 200, 100);
		
			
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
			 vendret.setFont(new Font("Arial",1,12));
			 
			vendicon.setBounds(5,8, 40, 40);
			
			commandeicon.setBounds(5,8, 40, 40);
			
			commandeR.setLayout(null);
			commandeR.setBackground(new Color(18,161,154));
			commandeR.setBounds(0,236,200,55);
		
			commandicon.setBounds(5,8, 40, 40);
			
			commandert.setFont(new Font("Arial",1,12));
			commandert.setBounds(42, 5, 160, 45);
			commandert.setForeground(new Color(220,220,220));
			
			commandeE.setLayout(null);
			commandeE.setBackground(new Color(18,161,154));
			commandeE.setBounds(0,292,200,55);
			
			commandet.setFont(new Font("Arial",1,12));
			commandet.setBounds(45, 5, 160, 45);
			commandet.setForeground(new Color(220,220,220));
			
			stock.setLayout(null);
			stock.setBackground(new Color(18,161,154));
			stock.setBounds(0,348,200,55);
		   
			stockt.setFont(new Font("Arial",1,12));
			stockt.setBounds(85, 5, 160, 45);
			stockt.setForeground(new Color(220,220,220));
			
			stockicon.setBounds(5,8, 40, 40);
			
		    profil=new JPanel();
			profil.setLayout(null);
			profil.setBackground(new Color(18,161,154));
			profil.setBounds(0,404,200,55);
			
		   
			profilt.setFont(new Font("Arial",1,12));
			profilt.setBounds(83, 5, 160, 45);
			profilt.setForeground(new Color(220,220,220));
			
			profilicon=new JLabel(new ImageIcon("Profile_30px.png"));
			profilicon.setBounds(5,8, 40, 40);

			
			
			s1.setForeground(new Color(200,200,200));
			s2.setForeground(new Color(200,200,200));
			s3.setForeground(new Color(200,200,200));
			s4.setForeground(new Color(200,200,200));
			s1.setBounds(25, 235, 150, 1);
			s2.setBounds(25, 291, 150, 1);
			s3.setBounds(25, 347, 150, 1);
			s4.setBounds(25, 403, 150, 1);
			
			window1.setBackground(new Color(225,225,225));
			window1.setLayout(null);
			window1.setBounds(200, 100, 700, 600);
			window1.setBorder(BorderFactory.createLineBorder(new Color(18,161,154)));
			
			drag.setBounds(0, 0, 640,30);
			drag.addMouseMotionListener(new MouseAdapter() {
				int mousepx,mousepy;
				public void mouseDragged(MouseEvent me) {
					setLocation(me.getXOnScreen()-mousepx, me.getYOnScreen()-mousepy);
				}
				public void mousePressed(MouseEvent me) {
					mousepx=me.getX();
					mousepy=me.getY();
				}
			});
			
			
			groupepanel.setBackground(new Color(225,225,225));
			groupepanel.setLayout(null);
			groupepanel.setBounds(0, 180,699, 400);
	
			logo.setBounds(50, 0, 550, 400);
			logo.setForeground(new Color(0,0,0,0));
		
			band.setBounds(0, 30, 700, 150);
			band.setLayout(null);
	 		band.setBackground(new Color(18, 164, 154));
	 		
	 		 
	 		quitter.setBounds(760, 360,80, 50);
	 		quitter.addMouseListener(new MouseAdapter(){
				public void mouseClicked(MouseEvent me){
					dispose();
				}
			});
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

			panal_of_stock.setBounds(0,180, 854, 419);
			panal_of_stock.setBackground(new Color(225,225,225));
			panal_of_stock.setLayout(null);
			panal_of_stock.hide();
			
			idprotxt.setBounds(46,3, 150, 40);
			idprotxt.setBorder(null);
			idprotxt.setBackground(new Color(187,190,191));
			idprotxt.setForeground(new Color(90,90,90));
			idprotxt.setFont(new Font("Arial",0,12));
			idprotxt.addMouseListener(new MouseAdapter() {
				public void mouseClicked(MouseEvent me) {
					idprotxt.setText("");
				}
			});  
		    idp.setBounds(50,270,200,50);
						idp.setBackground(new Color(187,190,191));
						idp.setLayout(null);
						idp.add(idpicn);
						idp.add(idprotxt);
						
						idpicn.setBounds(5, 5, 40, 40);
						
				panel_of_vente.setBounds(0,180, 854, 419);
				panel_of_vente.setBackground(new Color(225,225,225));
				panel_of_vente.setLayout(null);
				panel_of_vente.hide();
				
				
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
			
				Nproduit1.setBounds(50, 30, 200, 50);
				Nproduit1.setBackground(new Color(187, 190, 191));
				Nproduit1.setLayout(null);
			    
				
				Nproduiticn1.setBounds(5, 5, 40, 40);
				Nproduit1.add(Nproduiticn1);
				
				
				Nproduittxt1.setBounds(46, 5, 150, 40);
				Nproduittxt1.setBorder(null);
				Nproduittxt1.setBackground(new Color(187,190,191));
				Nproduittxt1.setForeground(new Color(90,90,90));
				Nproduittxt1.setFont(new Font("Arial",0,12));
				Nproduittxt1.addMouseListener(new MouseAdapter() {
					public void mouseClicked(MouseEvent me) {
						Nproduittxt1.setText("");
					}
				});
				Nproduit1.add(Nproduittxt1);
				panal_of_stock.add(Nproduit1);
				
				dat.setBounds(50,190,200,50);
				dat.setBackground(new Color(187,190,191));
				dat.setLayout(null);
				datstocicon.setBounds(5, 5, 40, 40);
				
				datstocktxt.setBounds(46, 3, 200, 50);
				datstocktxt.setBorder(null);
				datstocktxt.setBackground(new Color(187,190,191));
				datstocktxt.setForeground(new Color(90,90,90));
				datstocktxt.setFont(new Font("Arial",0,12));
				datstocktxt.addMouseListener(new MouseAdapter() {
					public void mouseClicked(MouseEvent me) {
						datstocktxt.setText("");
					}
				});
				dat.add(datstocicon);
				dat.add(datstocktxt);
				
				Quant1.setBounds(50,110,200,50);
				Quant1.setBackground(new Color(187,190,191));
				Quant1.setLayout(null);
				
				Quanticn1.setBounds(5, 5, 40, 40);
				Quant1.add(Quanticn1);
				
				Quant1.add(Quanttxt1);
				Quanttxt1.setBounds(45, 5, 150, 40);
				Quanttxt1.setBorder(null);
				Quanttxt1.setBackground(new Color(187,190,191));
				Quanttxt1.setForeground(new Color(90,90,90));
				Quanttxt1.setFont(new Font("Arial",0,12));
				Quanttxt1.addMouseListener(new MouseAdapter() {
					public void mouseClicked(MouseEvent me) {
						Quanttxt1.setText("");
					}
				});
				fourn.setBounds(50,350,200,50);
				fourn.setBackground(new Color(187,190,191));
				fourn.setLayout(null);
				
				fournicn.setBounds(5, 5, 40, 40);
				fourn.add(fournicn);
				
				fourn.add(fourntxt);
				fourntxt.setBounds(45, 5, 150, 40);
				fourntxt.setBorder(null);
				fourntxt.setBackground(new Color(187,190,191));
				fourntxt.setForeground(new Color(90,90,90));
				fourntxt.setFont(new Font("Arial",0,12));
				fourntxt.addMouseListener(new MouseAdapter() {
					public void mouseClicked(MouseEvent me) {
						fourntxt.setText("");
					}
				});
				panal_of_stock.add(Quant1);
				panal_of_stock.add(dat);
				panal_of_stock.add(fourn);
				panal_of_stock.add(addstck);
				
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
				
				Priceicn.setBounds(5, 5, 40, 40);
				
			
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
				
				
			
				Errmsg.setForeground(Color.RED);
				Errmsg.hide();
				Errmsg1.setForeground(Color.RED);
				Errmsg1.hide();
			 
				addstck.setBackground(new Color(18,161,154));
				addstck.setBounds(280, 30, 120, 50);
				addstck.setForeground(new Color(238,238,238));
				addstck.setBorder(null);
				
				stocktbl.addMouseListener(new MouseAdapter() {
					public void mouseClicked(MouseEvent me) {
						selectrow=stocktbl.getSelectedRow();
					}
				});
				addProd.setBackground(new Color(18,161,154));
				addProd.setBounds(280, 110, 120, 50);
				addProd.setForeground(new Color(238,238,238));
				addProd.setBorder(null);
				
			
				addstck.addActionListener(ActionEvent ->{
					a=(DefaultTableModel)stocktbl.getModel();
					if(!(idprotxt.getText().equals("")||Quanttxt1.getText().equals("")||Nproduittxt1.getText().equals("")||fourntxt.getText().equals("")||datstocktxt.getText().equals(""))) {
						a.addRow(new String[]{idprotxt.getText(),Quanttxt1.getText(),Nproduittxt1.getText(),fourntxt.getText(),datstocktxt.getText()} );
					
			
					}});
			
			//____________________________________________//
			panel_of_commandeE.hide();
			panel_of_commandeE.setBounds(0,180, 854, 419);
			panel_of_commandeE.setBackground(new Color(225,225,225));
			panel_of_commandeE.setLayout(null);
			
				addcomE.setBackground(new Color(18,161,154));
				addcomE.setBackground(new Color(18,161,154));
				addcomE.setBounds(80, 60, 120, 50);
				addcomE.setForeground(new Color(238,238,238));
				addcomE.setBorder(null);
			
					sp.setViewportView(VenteTbl);
				    sp.setVisible(true);
				    sp.setBounds(420,30,400,200);
				    sp.setBorder(BorderFactory.createBevelBorder(1, new Color(228,228,228), new Color(82,89,87)));
				    
				    sp1.setViewportView(stocktbl);
				    sp1.setVisible(true);
				    sp1.setBounds(420,30,400,200);
				    sp1.setBorder(BorderFactory.createBevelBorder(1, new Color(228,228,228), new Color(82,89,87)));
				       VenteTbl.setModel(new DefaultTableModel(    
				    		
				    		  new Object [][] {
				    		  			    	            },
				    	            new String [] {
				    	                "nom produit", "quantite", "prix unitaire","prix totale"
				    	            }
				    		));
				       
				       stocktbl.setModel(new DefaultTableModel(    
					    		
					    		  new Object [][] {null,null,null,null,null,null
					    		  			    	            },
					    	            new String [] {
					    				  "id produit", "nom du produit " ,"quantité", "fournis par"," date"
					    	            }
					    ));
				  
				       addProd.addActionListener(ActionEvent ->{    	
					    	DefaultTableModel fill=(DefaultTableModel)VenteTbl.getModel();
							if(Pricetxt.getText().isEmpty()||Quanttxt.getText().isEmpty()||Nproduittxt.getText().isEmpty()) {
								fill.addRow(new String[]{Pricetxt.getText(),Quanttxt.getText(),Nproduittxt.getText(),totaltxt.getText()} );
							}
				       });
								panal_of_stock.add(addstck);
				    
				    stocktbl.setBounds(300, 80, 300, 100);
					panel_of_vente.add(addProd);
					
					delstock.setBackground(new Color(18,161,154));
					delstock.setBounds(280, 100, 120, 50);
					delstock.setForeground(new Color(238,238,238));
					delstock.setBorder(null);
	///////////////				
					 delstock.addActionListener(ActionEvent ->{    	
							a.removeRow(selectrow);	
							});
					panal_of_stock.add(delstock);
					
						delProd.setBackground(new Color(18,161,154));
						delProd.setBounds(280, 170, 120, 50);
						delProd.setForeground(new Color(238,238,238));
						delProd.setBorder(null);
						panel_of_vente.add(delProd);
					 VenteTbl.setBounds(300, 80, 300, 100);
					 
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
					vendre.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
					vendre.setBackground(new Color(255,255,255,60 ));
					
					venicon.show();
				}
				public void mouseExited(MouseEvent me){
					vendre.setBackground(new Color(18,161,154));
					venicon.hide();
				}
				//@SuppressWarnings("deprecation")
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
					panal_of_stock.hide();
					panel_of_commandeE.hide();

				}
			});
			commandeE.addMouseListener(new MouseAdapter(){
				public void mouseEntered(MouseEvent me){
					commandeE.setBackground(new Color(255,255,255,60 ));
					CEicon.show();
					commandeE.setCursor(new Cursor(Cursor.HAND_CURSOR));
				}
				public void mouseExited(MouseEvent me){
					commandeE.setBackground(new Color(18,161,154));
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
					panal_of_stock.hide();
				}
			});
			commandeR.addMouseListener(new MouseAdapter(){
				public void mouseEntered(MouseEvent me){	
				commandeR.setBackground(new Color(255,255,255,60 ));
					CRicon.show();
					commandeR.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
				}
				public void mouseExited(MouseEvent me){
					commandeR.setBackground(new Color(18,161,154));
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
					panal_of_stock.hide();
					panel_of_vente.hide();
					panel_of_commandeE.hide();
				}
			});
			profil.addMouseListener(new MouseAdapter(){
				public void mouseEntered(MouseEvent me){
					profil.setBackground(new Color(255,255,255,60));
					profil.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
					proficon.show();
					
				}
				public void mouseExited(MouseEvent me){
					profil.setBackground(new Color(18, 161, 154));
					proficon.hide();
					hover.hide();
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
					panel_of_vente.hide();
					panel_of_commandeE.hide();
					panal_of_stock.hide();
				}
			});
			stock.addMouseListener(new MouseAdapter(){
				public void mouseEntered(MouseEvent me){
					stock.setBackground(new Color(255,255,255,60));
					stocicon.show();
					stock.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
				}
				public void mouseExited(MouseEvent me){
					stock.setBackground(new Color(18,161,154));
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
					panal_of_stock.show();
					panel_of_vente.hide();
					panel_of_commandeE.hide();
				}
			});
		
			vendre.add(vendicon);
			stock.add(stockt);
			commandeE.add(commandet);
			menupanel.add(commandeE);
			menupanel.add(vendre);
			menupanel.add(CRicon);
			menupanel.add(CEicon);
			menupanel.add(stocicon);
			menupanel.add(proficon);
			menupanel.add(venicon);
			menupanel.add(profil);
			menupanel.add(stock);
			menupanel.add(colormenu);
			menupanel.add(s1);
			menupanel.add(s2);
			menupanel.add(s3);
			menupanel.add(s4);
			menupanel.add(hover);
			menupanel.add(commandeR);
			menupanel.add(menuicn);
			menupanel.add(righticn);
			stock.add(stockicon);
			profil.add(profilt);
			profil.add(profilicon);
			groupepanel.add(logo);
			 groupepanel.add(fleche);
			commandeR.add(commandicon);
			commandeR.add(commandert);
			commandeE.add(commandeicon); 
			iconpanel.add(homeicon);
			vendre.add(vendret);
			panel_of_vente.add(sp);
			panal_of_stock.add(sp1);		
			panal_of_stock.add(quitter);
			panel_of_commandeE.add(addcomE);
			panel_of_commandeE.add(quitter);
			panal_of_stock.add(idp);
			Quant.add(Quanttxt);
			panel_of_vente.add(Quant);
			Price.add(Priceicn);
			Price.add(Pricetxt);
			panel_of_vente.add(quitter);
			panel_of_vente.add(Errmsg);
			panel_of_vente.add(Price);
			panel_of_vente.add(Errmsg1);
			panel_of_vente.add(addProd);
			 window1.add(groupepanel);
			 window1.add(band);
		    window1.add(drag);
			window1.add(min);
			window1.add(clos);
			window1.add(panel_of_commandeE);
			window1.add(panal_of_stock);
			panel_of_vente.add(fleche);
			window1.add(panel_of_vente);
			this.add(iconpanel);
			this.add(window1);
			this.add(menupanel);
		this.setVisible(true);
		
	}

	private float parseFloat(String text) {
	// TODO Auto-generated method stub
	return 0;
}
public static void main(String[] args) {
		
		new princ();
	}

}
