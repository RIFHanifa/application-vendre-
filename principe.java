package login;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.Frame;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JSeparator;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

public class principe {
	int i=0;
	int mousepx,mousepy;
	@SuppressWarnings("deprecation")
	public principe(){
		
		JFrame fen=new JFrame();
		fen.setSize(900,700);
		fen.setLocationRelativeTo(null);
		fen.setUndecorated(true);
		fen.setLayout(null);
		fen.setBackground(new Color(0,0,0,0));
		fen.setPreferredSize(null);
		JPanel iconpanel=new JPanel();
			iconpanel.setBounds(0, 0, 900, 100);
			iconpanel.setBackground(new Color(255,255,255,0));
			iconpanel.setLayout(null);
		
		
		
		JLabel homeicon=new JLabel(new ImageIcon("icons8_Shop_100px_1.png"));
			homeicon.setBounds(0, 13, 200, 100);
			iconpanel.add(homeicon);
			
			fen.add(iconpanel);
		JPanel menupanel=new JPanel();
			menupanel.setBounds(0,100,200,600);
			//menupanel.setBackground(new Color(18, 161, 154));
			menupanel.setLayout(null);
		JLabel backmenu=new JLabel(new ImageIcon("band2-1-1.png"));
			backmenu.setBounds(0, 0, 200, 600);
			menupanel.add(backmenu);
		JLabel venicon=new JLabel(new ImageIcon("Money Bag_104px.png"));
			venicon.setBounds(50,50,105,105);
			venicon.hide();
		JLabel proficon=new JLabel(new ImageIcon("Profile_100px.png"));
			proficon.setBounds(50,50,105,105);
			proficon.hide();
		JLabel stocicon=new JLabel(new ImageIcon("Sell Stock_100px.png"));
			stocicon.setBounds(50,50,105,105);
			stocicon.hide();
		JLabel CRicon=new JLabel(new ImageIcon("Purchase Order_104px.png"));
			CRicon.setBounds(50,50,105,105);
			CRicon.hide();
		JLabel CEicon=new JLabel(new ImageIcon("Sell Order_100px.png"));
			CEicon.setBounds(50,50,105,105);
			CEicon.hide();
		backmenu.add(CRicon);
		backmenu.add(CEicon);
		backmenu.add(stocicon);
		backmenu.add(proficon);
		backmenu.add(venicon);
		
		
		JPanel vendre=new JPanel();
			vendre.setLayout(null);
			vendre.setBackground(new Color(0,0,0,0));
			vendre.setBounds(0,180,200,55);
			
		JLabel vendret=new JLabel("Vendre");
			vendret.setFont(new Font("Arial",1,14));
			vendret.setBounds(83, 5, 160, 45);
			vendret.setForeground(new Color(80,80,80));
			vendre.add(vendret);
		JLabel vendicon=new JLabel(new ImageIcon("Money Bag_30px.png"));
			vendicon.setBounds(5,8, 40, 40);
			vendre.add(vendicon);
			backmenu.add(vendre);
		JPanel commandeR=new JPanel();
			commandeR.setLayout(null);
			commandeR.setBackground(new Color(0,0,0,0));
			commandeR.setBounds(0,236,200,55);
			
		JLabel commandicon=new JLabel(new ImageIcon("Purchase Order_30px.png"));
			commandicon.setBounds(5,8, 40, 40);
			commandeR.add(commandicon);
		JLabel commandert=new JLabel(" Commandes Envoyées");
			commandert.setFont(new Font("Arial",1,13));
			commandert.setBounds(42, 5, 160, 45);
			commandert.setForeground(new Color(80,80,80));
			commandeR.add(commandert);
			backmenu.add(commandeR);
		JPanel commandeE=new JPanel();
			commandeE.setLayout(null);
			commandeE.setBackground(new Color(0,0,0,0));
			commandeE.setBounds(0,292,200,55);
			
		JLabel commandeicon=new JLabel(new ImageIcon("sellOrder_30px.png"));
			commandeicon.setBounds(5,8, 40, 40);
			commandeE.add(commandeicon);
		JLabel commandet=new JLabel("Commandes Reçues");
			commandet.setFont(new Font("Arial",1,13));
			commandet.setBounds(45, 5, 160, 45);
			commandet.setForeground(new Color(80,80,80));
			commandeE.add(commandet);
			backmenu.add(commandeE);	
		JPanel stock=new JPanel();
			stock.setLayout(null);
			stock.setBackground(new Color(0,0,0,0));
			stock.setBounds(0,348,200,55);
			
		JLabel stockt=new JLabel("Stock");
			stockt.setFont(new Font("Arial",1,14));
			stockt.setBounds(85, 5, 160, 45);
			stockt.setForeground(new Color(80,80,80));
			stock.add(stockt);
		JLabel stockicon=new JLabel(new ImageIcon("Sell Stock_30px.png"));
			stockicon.setBounds(5,8, 40, 40);
			stock.add(stockicon);
			backmenu.add(stock);
		JPanel profil=new JPanel();
			profil.setLayout(null);
			profil.setBackground(new Color(0,0,0,0));
			profil.setBounds(0,404,200,55);
			
		JLabel profilt=new JLabel("Profile");
			profilt.setFont(new Font("Arial",1,14));
			profilt.setBounds(83, 5, 160, 45);
			profilt.setForeground(new Color(80,80,80));
			profil.add(profilt);
		JLabel profilicon=new JLabel(new ImageIcon("Profile_30px.png"));
			profilicon.setBounds(5,8, 40, 40);
			profil.add(profilicon);
			backmenu.add(profil);
		JSeparator s1=new JSeparator(),s2=new JSeparator(),s3=new JSeparator(),s4=new JSeparator();
			s1.setForeground(new Color(100,100,100));
			s2.setForeground(new Color(100,100,100));
			s3.setForeground(new Color(100,100,100));
			s4.setForeground(new Color(100,100,100));
			s1.setBounds(25, 235, 150, 1);
			s2.setBounds(25, 291, 150, 1);
			s3.setBounds(25, 347, 150, 1);
			s4.setBounds(25, 403, 150, 1);
			backmenu.add(s1);
			backmenu.add(s2);
			backmenu.add(s3);
			backmenu.add(s4);
			fen.add(menupanel);
		JPanel window1=new JPanel();
			window1.setBackground(new Color(225,225,225));
			window1.setLayout(null);
			window1.setBounds(200, 100, 700, 600);
			//window1.setBorder(BorderFactory.createLineBorder(new Color(100,100,100)));
		JLabel drag=new JLabel();
			drag.setBounds(0, 0, 560,30);
			drag.addMouseMotionListener(new MouseAdapter() {
				
				public void mouseDragged(MouseEvent me) {
					fen.setLocation(me.getXOnScreen()-mousepx, me.getYOnScreen()-mousepy);
				}
				public void mousePressed(MouseEvent me) {
					mousepx=me.getX();
					mousepy=me.getY();
				}
			});
			window1.add(drag);
		JLabel change=new JLabel(new ImageIcon("Fill Color_20px.png"));
		JPanel groupepanel=new JPanel();
			groupepanel.setBackground(new Color(225,225,225));
			groupepanel.setLayout(null);
			groupepanel.setBounds(0, 180,699, 400);
		JLabel fleche=new JLabel(new ImageIcon("Play_25px.png"));
		JLabel logo=new JLabel(new ImageIcon("logoM.png"));
			logo.setBounds(50, 0, 550, 400);
			logo.setForeground(new Color(0,0,0,0));
			groupepanel.add(logo);
			
		groupepanel.add(fleche);
		window1.add(groupepanel);
		JPanel band=new JPanel();
			band.setBounds(0, 30, 700, 150);
			band.setLayout(null);
			band.setBackground(new Color(18, 164, 154));
		JLabel backband=new JLabel(new ImageIcon("capband.png"));
			backband.setBounds(0, 0, 700, 150);
			band.add(backband);
		window1.add(band);
			JLabel clos=new JLabel(new ImageIcon("Delete_20px.png"));
			clos.setBounds(670, 5, 23,20);
			clos.addMouseListener(new MouseAdapter(){
				public void mouseEntered(MouseEvent me){
					clos.setBorder(BorderFactory.createBevelBorder(0, new Color(100,100,100), new Color(85,85,85)));
					clos.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
				}	
				public void mouseExited(MouseEvent me){
					clos.setBorder(null);
				}
				public void mouseClicked(MouseEvent me){
					fen.dispose();
				}
			});
		JLabel min=new JLabel(new ImageIcon("Subtract_20px.png"));
			min.setBounds(640, 5, 23, 20);
			
			min.addMouseListener(new MouseAdapter(){
				public void mouseEntered(MouseEvent me){
					min.setBorder(BorderFactory.createBevelBorder(0, new Color(100,100,100), new Color(85,85,85)));
					min.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
				}
				public void mouseExited(MouseEvent me){
					min.setBorder(null);
				}
				public void mouseClicked(MouseEvent me){
					min.setBorder(null);
					fen.setState(Frame.ICONIFIED);
				}
			});
			
			//____________________________________________//
			//creating the panels that contain menu_opened//
			//--------------------------------------------//
			JPanel panel_of_vente=new JPanel();
				panel_of_vente.setBounds(0,180, 854, 419);
				panel_of_vente.setBackground(new Color(225,225,225));
				panel_of_vente.setLayout(null);
				panel_of_vente.add(fleche);
			JPanel Nproduit=new JPanel();
				Nproduit.setBounds(50, 30, 200, 50);
				Nproduit.setBackground(new Color(187, 190, 191));
				Nproduit.setLayout(null);
			JLabel Nproduiticn=new JLabel(new ImageIcon("Dog Tag_35px.png"));
				Nproduiticn.setBounds(5, 5, 40, 40);
				Nproduit.add(Nproduiticn);
			JTextField  Nproduittxt=new JTextField (" Nom du Produit");
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
			JPanel Quant=new JPanel();
				Quant.setBounds(50,110,200,50);
				Quant.setBackground(new Color(187,190,191));
				Quant.setLayout(null);
			JLabel Quanticn=new JLabel(new ImageIcon("Rain Gauge_35px.png"));
				Quanticn.setBounds(5, 5, 40, 40);
				Quant.add(Quanticn);
			JTextField  Quanttxt=new JTextField (" Quantité du Produit");
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
			JPanel Price=new JPanel();
				Price.setBounds(50, 190, 200, 50);
				Price.setBackground(new Color(187,190,191));
				Price.setLayout(null);
			JLabel Priceicn=new JLabel(new ImageIcon("Price_35px.png"));
				Priceicn.setBounds(5, 5, 40, 40);
				Price.add(Priceicn);
			JTextField Pricetxt=new JTextField (" Prix du Produit");
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
			JLabel Errmsg=new JLabel("Format Invalide (Exemple:15)");
				Errmsg.setForeground(Color.RED);
				panel_of_vente.add(Errmsg);
				Errmsg.hide();
				JLabel Errmsg1=new JLabel("Format Invalide (Exemple:45.99)");
				Errmsg1.setForeground(Color.RED);
				panel_of_vente.add(Errmsg1);
				Errmsg1.hide();
			JButton addProd=new JButton("Ajouter");
				addProd.setBackground(new Color(18,161,154));
				addProd.setBounds(280, 68, 120, 50);
				addProd.setForeground(new Color(238,238,238));
				addProd.setBorder(null);
				
			JLabel totallbl=new JLabel("TOTAL: ");
					totallbl.setForeground(new Color(82,89,92));
					totallbl.setFont(new Font("Times new Roman",1,45));
					totallbl.setBounds(420, 270, 200, 80);
					panel_of_vente.add(totallbl);
			JLabel totaltxt=new JLabel("0,00");
				totaltxt.setBackground(new Color(225,225,225));
				totaltxt.setForeground(new Color(127, 209, 98));
				totaltxt.setBorder(null);
				totaltxt.setBounds(615, 283, 200, 50);
				totaltxt.setFont(new Font("Times new Roman",1,55));
				panel_of_vente.add(totaltxt);
				

			JTable VenteTbl=new JTable();
			JScrollPane sp=new JScrollPane();
				sp.setViewportView(VenteTbl);
			    sp.setVisible(true);
			    sp.setSize(400,200);
			    sp.setBounds(420,30,400,250);
			    sp.setBorder(BorderFactory.createBevelBorder(1, new Color(228,228,228), new Color(82,89,87)));
			 
			    VenteTbl.setModel(new DefaultTableModel(  
			    		
			    		  new Object [][] {
			    				    {null, null, null,null },
			    	                {null, null, null ,null},
			    	                {null, null, null ,null},
			    	                {null, null, null ,null},
			    	                {null, null, null ,null},
			    	                {null, null, null ,null},
			    	                {null, null, null ,null},
			    	                {null, null, null ,null},
			    	                {null, null, null ,null},
			    	                {null, null, null ,null},
			    	                {null, null, null ,null},
			    	                {null, null, null ,null},
			    	                {null, null, null ,null},
			    	                {null, null, null ,null},
			    	                {null, null, null ,null},
			    	                {null, null, null ,null},
			    	                {null, null, null ,null},
			    	            },
			    	            new String [] {
			    	                "Nom Produit", "Quantité", "Prix Unitaire","Total"
			    	            }
			    		));
			    
			    addProd.addActionListener(ActionEvent ->{
			    	
			    	
			    	DefaultTableModel fill=(DefaultTableModel)VenteTbl.getModel();
					if(Pricetxt.getText().contains("Prix du Produit")||Quanttxt.getText().contains("Quantité du Produit")||Nproduittxt.getText().contains("Nom du Produit")) {
						JOptionPane.showMessageDialog(addProd, "Veuillez remplir tous les champs pour Ajouter", null, 1);
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
					else if(Pricetxt.getText().isEmpty()||Quanttxt.getText().isEmpty()||Nproduittxt.getText().isEmpty()){
						JOptionPane.showMessageDialog(addProd, "Veuillez remplir tous les champs vide pour Ajouter", null, 1);
					
						
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
					}}
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
					
					
						int j=0;
						fill.setValueAt(Nproduittxt.getText(), i, j++);
						fill.setValueAt(Quanttxt.getText(), i, j++);
						fill.setValueAt(Pricetxt.getText(), i, j++);
						fill.setValueAt(0, i, j++);
						
					
			    i++;}
				});
				panel_of_vente.add(addProd);
			JButton delProd=new JButton("Supprimer");
				delProd.setBackground(new Color(18,161,154));
				delProd.setBounds(280, 150, 120, 50);
				delProd.setForeground(new Color(238,238,238));
				delProd.setBorder(null);
				panel_of_vente.add(delProd);
			 VenteTbl.setBounds(300, 80, 300, 100);
			 panel_of_vente.add(sp);
			
			
			
			
			
			
			window1.add(panel_of_vente);
			panel_of_vente.hide();
			//____________________________________________//
		JPanel panel_of_commandeR=new JPanel();
				panel_of_commandeR.setBounds(0,180, 854, 419);
				panel_of_commandeR.setBackground(new Color(225,225,225));
				panel_of_commandeR.setLayout(null);
			 	
		JPanel id_commande=new JPanel();
			id_commande.setBounds(50, 30, 200, 50);
			id_commande.setBackground(new Color(187, 190, 191));
			id_commande.setLayout(null);
		JLabel id_ce_icn=new JLabel(new ImageIcon("Identification Documents_35px.png"));
			id_ce_icn.setBounds(5, 5, 40, 40);
			id_commande.add(id_ce_icn);
		JTextField  id_ce_txt=new JTextField ("Id Commande");
			id_ce_txt.setBounds(45, 5, 150, 40);
			id_ce_txt.setBorder(null);
			id_ce_txt.setBackground(new Color(187,190,191));
			id_ce_txt.setForeground(new Color(90,90,90));
			id_ce_txt.setFont(new Font("Arial",0,12));
			id_ce_txt.addMouseListener(new MouseAdapter() {
				public void mouseClicked(MouseEvent me) {
					id_ce_txt.setText("");
				}
			});
			id_commande.add(id_ce_txt);
			panel_of_commandeR.add(id_commande);
			
			
		JPanel N_client=new JPanel();
			N_client.setBounds(50, 106, 200, 50);
			N_client.setBackground(new Color(187, 190, 191));
			N_client.setLayout(null);
		JLabel Nclient_icn=new JLabel(new ImageIcon("Administrator Male_35px.png"));
			Nclient_icn.setBounds(5, 5, 40, 40);
			N_client.add(Nclient_icn);
		JTextField  Nclient_txt=new JTextField ("Nom du Client");
			Nclient_txt.setBounds(45, 5, 150, 40);
			Nclient_txt.setBorder(null);
			Nclient_txt.setBackground(new Color(187,190,191));
			Nclient_txt.setForeground(new Color(90,90,90));
			Nclient_txt.setFont(new Font("Arial",0,12));
			Nclient_txt.addMouseListener(new MouseAdapter() {
				public void mouseClicked(MouseEvent me) {
					Nclient_txt.setText("");
				}
			});
			N_client.add(Nclient_txt);
			panel_of_commandeR.add(N_client);
			
		JPanel Date_C_R=new JPanel();
			Date_C_R.setBounds(50, 182, 200, 50);
			Date_C_R.setBackground(new Color(187, 190, 191));
			Date_C_R.setLayout(null);
		JLabel Date_C_icn=new JLabel(new ImageIcon("Calendar_35px.png"));
			Date_C_icn.setBounds(5, 5, 40, 40);
			Date_C_R.add(Date_C_icn);
		JTextField  Date_C_txt=new JTextField ("Date De  Commande");
			Date_C_txt.setBounds(45, 5, 150, 40);
			Date_C_txt.setBorder(null);
			Date_C_txt.setBackground(new Color(187,190,191));
			Date_C_txt.setForeground(new Color(90,90,90));
			Date_C_txt.setFont(new Font("Arial",0,12));
			Date_C_txt.addMouseListener(new MouseAdapter() {
				public void mouseClicked(MouseEvent me) {
					Date_C_txt.setText("");
				}
			});
			Date_C_R.add(Date_C_txt);
			panel_of_commandeR.add(Date_C_R);
			
		JLabel fournis=new JLabel("Fournis ?");
			fournis.setForeground(new Color(90,90,90));
			fournis.setBounds(100, 250, 150, 25);
			fournis.setFont(new Font("Arial",1,14));
			panel_of_commandeR.add(fournis);
			
		JRadioButton jrb_oui=new JRadioButton("Oui");
			jrb_oui.setBounds(50, 280, 50, 20);
			jrb_oui.setBackground(new Color(225,225,225));
			jrb_oui.setForeground(new Color(80,80,80));
			panel_of_commandeR.add(jrb_oui);
		JRadioButton jrb_non=new JRadioButton("Non");
			jrb_non.setBounds(170, 280, 50, 20);
			jrb_non.setBackground(new Color(225,225,225));
			jrb_non.setForeground(new Color(80,80,80));
			panel_of_commandeR.add(jrb_non);
			
			
			
			JTable CommandeRtbl=new JTable();
			JScrollPane SpCmR=new JScrollPane();
			SpCmR.setViewportView(CommandeRtbl);
			SpCmR.setVisible(true);
			SpCmR.setSize(400,200);
			SpCmR.setBounds(320,30,500,250);
			SpCmR.setBorder(BorderFactory.createBevelBorder(1, new Color(228,228,228), new Color(82,89,87)));
			 
			    CommandeRtbl.setModel(new DefaultTableModel(  
			    		
			    		  new Object [][] {
			    				    {null, null, null,null },
			    	                {null, null, null ,null},
			    	                {null, null, null ,null},
			    	                {null, null, null ,null},
			    	                {null, null, null ,null},
			    	                {null, null, null ,null},
			    	                {null, null, null ,null},
			    	                {null, null, null ,null},
			    	                {null, null, null ,null},
			    	                {null, null, null ,null},
			    	                {null, null, null ,null},
			    	                {null, null, null ,null},
			    	                {null, null, null ,null},
			    	                {null, null, null ,null},
			    	                {null, null, null ,null},
			    	                {null, null, null ,null},
			    	                {null, null, null ,null},
			    	            },
			    	            new String [] {
			    	                "Id Commande", "Nom Du Client", "Date De Commande","Fournis ?"
			    	            }
			    		));
			    panel_of_commandeR.add(SpCmR);
			    
		 JLabel flechicn_cR=new JLabel(new ImageIcon("play_25px.png"));
			    	flechicn_cR.setBounds(-7, 70, 25, 25);
			    panel_of_commandeR.add(flechicn_cR);
			    
			    
		 JButton addcomR=new JButton("Ajouter");
		 	addcomR.setBackground(new Color(18,161,154));
		 	addcomR.setBackground(new Color(18,161,154));
		 	addcomR.setBounds(340, 310, 120, 50);
		 	addcomR.setForeground(new Color(238,238,238));
		 	addcomR.setBorder(null);
			panel_of_commandeR.add(addcomR);
		JButton suppcomR=new JButton("Supprimer");
			suppcomR.setBackground(new Color(18,161,154));
			suppcomR.setBackground(new Color(18,161,154));
			suppcomR.setBounds(500, 310, 120, 50);
			suppcomR.setForeground(new Color(238,238,238));
			suppcomR.setBorder(null);
			panel_of_commandeR.add(suppcomR);
		JButton editcomR=new JButton("Modifier");
			editcomR.setBackground(new Color(18,161,154));
			editcomR.setBackground(new Color(18,161,154));
			editcomR.setBounds(660, 310, 120, 50);
			editcomR.setForeground(new Color(238,238,238));
			editcomR.setBorder(null);
				panel_of_commandeR.add(editcomR);
			    
				window1.add(panel_of_commandeR);
				panel_of_commandeR.hide();
			//___________________________________________//
				
			JPanel panel_of_commandeE=new JPanel();
				panel_of_commandeE.setBounds(0,180, 854, 419);
				panel_of_commandeE.setBackground(new Color(225,225,225));
				panel_of_commandeE.setLayout(null);
		JPanel id_commandeE=new JPanel();
			id_commandeE.setBounds(50, 30, 200, 50);
			id_commandeE.setBackground(new Color(187, 190, 191));
			id_commandeE.setLayout(null);
		JLabel id_ce_icn2=new JLabel(new ImageIcon("Identification Documents_35px.png"));
			id_ce_icn2.setBounds(5, 5, 40, 40);
			id_commandeE.add(id_ce_icn2);
		JTextField  id_ce_txt2=new JTextField ("Id Commande");
			id_ce_txt2.setBounds(45, 5, 150, 40);
			id_ce_txt2.setBorder(null);
			id_ce_txt2.setBackground(new Color(187,190,191));
			id_ce_txt2.setForeground(new Color(90,90,90));
			id_ce_txt2.setFont(new Font("Arial",0,12));
			id_ce_txt2.addMouseListener(new MouseAdapter() {
				public void mouseClicked(MouseEvent me) {
					id_ce_txt2.setText("");
				}
			});
			id_commandeE.add(id_ce_txt2);
			panel_of_commandeE.add(id_commandeE);
			
			
		JPanel N_client2=new JPanel();
			N_client2.setBounds(50, 106, 200, 50);
			N_client2.setBackground(new Color(187, 190, 191));
			N_client2.setLayout(null);
		JLabel Nclient_icn2=new JLabel(new ImageIcon("Administrator Male_35px.png"));
			Nclient_icn2.setBounds(5, 5, 40, 40);
			N_client2.add(Nclient_icn2);
		JTextField  Nclient_txt2=new JTextField ("Nom du Client");
			Nclient_txt2.setBounds(45, 5, 150, 40);
			Nclient_txt2.setBorder(null);
			Nclient_txt2.setBackground(new Color(187,190,191));
			Nclient_txt2.setForeground(new Color(90,90,90));
			Nclient_txt2.setFont(new Font("Arial",0,12));
			Nclient_txt2.addMouseListener(new MouseAdapter() {
				public void mouseClicked(MouseEvent me) {
					Nclient_txt2.setText("");
				}
			});
			N_client2.add(Nclient_txt2);
			panel_of_commandeE.add(N_client2);
			
		JPanel Date_C_E=new JPanel();
			Date_C_E.setBounds(50, 182, 200, 50);
			Date_C_E.setBackground(new Color(187, 190, 191));
			Date_C_E.setLayout(null);
		JLabel Date_C_icn2=new JLabel(new ImageIcon("Calendar_35px.png"));
			Date_C_icn2.setBounds(5, 5, 40, 40);
			Date_C_E.add(Date_C_icn2);
		JTextField  Date_C_txt2=new JTextField ("Date De  Commande");
			Date_C_txt2.setBounds(45, 5, 150, 40);
			Date_C_txt2.setBorder(null);
			Date_C_txt2.setBackground(new Color(187,190,191));
			Date_C_txt2.setForeground(new Color(90,90,90));
			Date_C_txt2.setFont(new Font("Arial",0,12));
			Date_C_txt2.addMouseListener(new MouseAdapter() {
				public void mouseClicked(MouseEvent me) {
					Date_C_txt2.setText("");
				}
			});
			Date_C_E.add(Date_C_txt2);
			panel_of_commandeE.add(Date_C_E);
			
		JLabel fournis1=new JLabel("Fournis ?");
			fournis1.setForeground(new Color(90,90,90));
			fournis1.setBounds(100, 250, 150, 25);
			fournis1.setFont(new Font("Arial",1,14));
			panel_of_commandeE.add(fournis1);
			
		JRadioButton jrb1_oui=new JRadioButton("Oui");
			jrb1_oui.setBounds(50, 280, 50, 20);
			jrb1_oui.setBackground(new Color(225,225,225));
			jrb1_oui.setForeground(new Color(80,80,80));
			panel_of_commandeE.add(jrb1_oui);
		JRadioButton jrb1_non=new JRadioButton("Non");
			jrb1_non.setBounds(170, 280, 50, 20);
			jrb1_non.setBackground(new Color(225,225,225));
			jrb1_non.setForeground(new Color(80,80,80));
			panel_of_commandeE.add(jrb1_non);
			
			
			
			JTable CommandeEtbl=new JTable();
			JScrollPane SpCmE=new JScrollPane();
				SpCmE.setViewportView(CommandeEtbl);
				SpCmE.setVisible(true);
				SpCmE.setSize(400,200);
				SpCmE.setBounds(320,30,500,250);
				SpCmE.setBorder(BorderFactory.createBevelBorder(1, new Color(228,228,228), new Color(82,89,87)));
			 
			    CommandeEtbl.setModel(new DefaultTableModel(  
			    		
			    		  new Object [][] {
			    				    {null, null, null,null },
			    	                {null, null, null ,null},
			    	                {null, null, null ,null},
			    	                {null, null, null ,null},
			    	                {null, null, null ,null},
			    	                {null, null, null ,null},
			    	                {null, null, null ,null},
			    	                {null, null, null ,null},
			    	                {null, null, null ,null},
			    	                {null, null, null ,null},
			    	                {null, null, null ,null},
			    	                {null, null, null ,null},
			    	                {null, null, null ,null},
			    	                {null, null, null ,null},
			    	                {null, null, null ,null},
			    	                {null, null, null ,null},
			    	                {null, null, null ,null},
			    	            },
			    	            new String [] {
			    	                "Id Commande", "Nom Du Client", "Date De Commande","Fournis ?"
			    	            }
			    		));
			    panel_of_commandeE.add(SpCmE);
			
			    JLabel flechicn_cE=new JLabel(new ImageIcon("play_25px.png"));
		    	flechicn_cE.setBounds(-7, 125, 25, 25);
		    	panel_of_commandeE.add(flechicn_cE);
		   	JButton addcomE=new JButton("Ajouter");
				addcomE.setBackground(new Color(18,161,154));
				addcomE.setBackground(new Color(18,161,154));
				addcomE.setBounds(340, 310, 120, 50);
				addcomE.setForeground(new Color(238,238,238));
				addcomE.setBorder(null);
				panel_of_commandeE.add(addcomE);
			JButton suppcomE=new JButton("Supprimer");
				suppcomE.setBackground(new Color(18,161,154));
				suppcomE.setBackground(new Color(18,161,154));
				suppcomE.setBounds(500, 310, 120, 50);
				suppcomE.setForeground(new Color(238,238,238));
				suppcomE.setBorder(null);
				panel_of_commandeE.add(suppcomE);
			JButton editcomE=new JButton("Modifier");
				editcomE.setBackground(new Color(18,161,154));
				editcomE.setBackground(new Color(18,161,154));
				editcomE.setBounds(660, 310, 120, 50);
				editcomE.setForeground(new Color(238,238,238));
				editcomE.setBorder(null);
				panel_of_commandeE.add(editcomE);
		    
		    
				window1.add(panel_of_commandeE);
				panel_of_commandeE.hide();
				
				
				
				
				
				
				
				
				
				//___________________________________________________________________________//
				
				JPanel panel_of_profil=new JPanel();	
					panel_of_profil.setBounds(0,180, 854, 419);
					panel_of_profil.setBackground(new Color(225,225,225));
					panel_of_profil.setLayout(null);
				
				JLabel usericon=new JLabel(new ImageIcon("Admin-icon.png"));
					usericon.setBounds(100, 50, 256, 256);
					panel_of_profil.add(usericon);	
				JLabel username=new JLabel("Groupe-04-2018");
					username.setForeground(new Color(110,105,100));
					username.setFont(new Font("Times New Roman",1,22));
					username.setBounds(130, 316, 196, 30);
					panel_of_profil.add(username);
				
				JLabel flech_profil =new JLabel(new ImageIcon("Play_25px.png"));
					flech_profil.setBounds(-7,240, 25, 25);
					panel_of_profil.add(flech_profil);
					
				JPanel profil_nom=new JPanel();
					profil_nom.setBounds(460, 50, 200, 50);
					profil_nom.setBackground(new Color(187, 190, 191));
					profil_nom.setLayout(null);
				JLabel profil_n_icn=new JLabel(new ImageIcon("Businessman_35px.png"));
					profil_n_icn.setBounds(5, 5, 40, 40);
					profil_nom.add(profil_n_icn);
				JLabel  profil_n_lbl=new JLabel (" Groupe-04-2018");
					profil_n_lbl.setBounds(45, 5, 150, 40);
					profil_n_lbl.setForeground(new Color(90,90,90));
					profil_n_lbl.setFont(new Font("Arial",1,14));
					profil_nom.add(profil_n_lbl);
					panel_of_profil.add(profil_nom);
				JPanel profil_pw=new JPanel();
					profil_pw.setBounds(460, 130, 200, 50);
					profil_pw.setBackground(new Color(187, 190, 191));
					profil_pw.setLayout(null);
				JLabel profil_pw_icn=new JLabel(new ImageIcon("Password_35px.png"));
				profil_pw_icn.setBounds(5, 5, 40, 40);
					profil_pw.add(profil_pw_icn);
				JLabel  profil_pw_lbl=new JLabel (" •••••••••••••••");
					profil_pw_lbl.setBounds(45, 5, 150, 40);
					profil_pw_lbl.setForeground(new Color(90,90,90));
					profil_pw_lbl.setFont(new Font("Arial",1,14));
					profil_pw.add(profil_pw_lbl);
					panel_of_profil.add(profil_pw);
				
				JLabel editprofil=new JLabel(new ImageIcon("Edit Account_50px.png"));
					editprofil.setBounds(460, 270, 60,60);
					editprofil.addMouseListener(new MouseAdapter() {
						public void mouseEntered(MouseEvent me) {
							editprofil.setIcon(new ImageIcon("Edit Account_60px.png"));
							editprofil.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
						}
						public void mouseExited(MouseEvent me) {
							editprofil.setIcon(new ImageIcon("Edit Account_50px.png"));
						}
					});
				panel_of_profil.add(editprofil);
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				window1.add(panel_of_profil);
				panel_of_profil.hide();
				
				//________________________________________________________________________________//
		JLabel menuicn=new JLabel(new ImageIcon("Left_25px.png"));
		JLabel righticn=new JLabel(new ImageIcon("Right_25px.png"));
			righticn.setBounds(10, 5, 25, 25);
			righticn.hide();
			righticn.addMouseListener(new MouseAdapter() {
				public void mouseEntered(MouseEvent me) {
					righticn.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
				}
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
				public void mouseEntered(MouseEvent me) {
					menuicn.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
				}
				public void mouseClicked(MouseEvent me) {
					menupanel.setBounds(0,100,45,600);
					
					
					window1.setBounds(45, 100, 855, 600);
					band.setBounds(0, 30, 854, 150);
					backband.setBounds(0,0,854,150);
					clos.setBounds(825, 5, 23,20);
					min.setBounds(795, 5, 23, 20);
					logo.setBounds(125, 0, 600, 400);
					menuicn.hide();
					righticn.show();
				}
			});
			JPanel hover=new JPanel();
				hover.setBackground(new Color(255,255,255,60));
			menupanel.add(hover);
			vendre.addMouseListener(new MouseAdapter(){
				public void mouseEntered(MouseEvent me){
					vendre.setBackground(new Color(0, 0, 0,50));
					hover.setBounds(0, 180	, 200, 55);
					//hover.show();
					vendre.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
					venicon.show();
				}
				public void mouseExited(MouseEvent me){
					vendre.setBackground(new Color(255, 255, 255,0));
					//hover.hide();
					venicon.hide();
				}
				public void mouseClicked(MouseEvent me){
					fleche.setBounds(-7, 18, 25, 25);
					fleche.show();
					//logo.hide();
					groupepanel.hide();
					menupanel.setBounds(0,100,45,600);
					window1.setBounds(45, 100, 855, 600);
					band.setBounds(0, 30, 855, 150);
					backband.setBounds(0, 0, 855, 150);
					clos.setBounds(825, 5, 23,20);
					min.setBounds(795, 5, 23, 20);
					panel_of_commandeR.hide();
					panel_of_commandeE.hide();
					panel_of_profil.hide();
					panel_of_vente.show();
					menuicn.hide();
					righticn.show();
					

				}
			});
			commandeE.addMouseListener(new MouseAdapter(){
				public void mouseEntered(MouseEvent me){
					commandeE.setBackground(new Color(0, 0, 0,50));
					//hover.setBounds(0,292,200,55);
					//hover.show();
					CEicon.show();
				}
				public void mouseExited(MouseEvent me){
					//hover.hide();
					commandeE.setBackground(new Color(255, 255, 255,0));
					commandeE.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
					CEicon.hide();
					
				}
				public void mouseClicked(MouseEvent me){
					fleche.setBounds(-7,122,25,25);
					groupepanel.hide();
					menupanel.setBounds(0,100,45,600);
					window1.setBounds(45, 100, 855, 600);
					band.setBounds(0, 30, 855, 150);
					backband.setBounds(0, 0, 855, 150);
					clos.setBounds(825, 5, 23,20);
					min.setBounds(795, 5, 23, 20);
					menuicn.hide();
					righticn.show();
					panel_of_vente.hide();
					panel_of_commandeR.hide();
					panel_of_profil.hide();
					panel_of_commandeE.show();
					
				}
			});
			commandeR.addMouseListener(new MouseAdapter(){
				public void mouseEntered(MouseEvent me){
					//hover.setBounds(0,236,200,55);
					//hover.show();
					commandeR.setBackground(new Color(0, 0, 0,50));
					commandeR.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
					CRicon.show();
				}
				public void mouseExited(MouseEvent me){
					//hover.hide();
					commandeR.setBackground(new Color(255, 255, 255,0));
					CRicon.hide();
				}
				public void mouseClicked(MouseEvent me){

					groupepanel.hide();
					menupanel.setBounds(0,100,45,600);
					window1.setBounds(45, 100, 855, 600);
					band.setBounds(0, 30, 855, 150);
					backband.setBounds(0, 0, 855, 150);
					clos.setBounds(825, 5, 23,20);
					min.setBounds(795, 5, 23, 20);
					menuicn.hide();
					righticn.show();
					panel_of_commandeE.hide();
					panel_of_profil.hide();
					panel_of_commandeR.show();
					panel_of_vente.hide();
				}
			});
			profil.addMouseListener(new MouseAdapter(){
				public void mouseEntered(MouseEvent me){
					//hover.setBounds(0,404,200,55);
					//hover.show();
					profil.setBackground(new Color(0, 0, 0,50));
					profil.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
					
					proficon.show();
					
				}
				public void mouseExited(MouseEvent me){
					//hover.hide();
					profil.setBackground(new Color(255, 255, 255,0));
					proficon.hide();
			
				}
				public void mouseClicked(MouseEvent me){
					fleche.setBounds(-7,234,25,25);
					groupepanel.hide();
					menupanel.setBounds(0,100,45,600);
					window1.setBounds(45, 100, 855, 600);
					band.setBounds(0, 30, 855, 150);
					backband.setBounds(0, 0, 855, 150);
					clos.setBounds(825, 5, 23,20);
					min.setBounds(795, 5, 23, 20);
					menuicn.hide();
					righticn.show();
					panel_of_commandeE.hide();
					panel_of_commandeR.hide();
					panel_of_vente.hide();
					panel_of_profil.show();
				}
			});
			stock.addMouseListener(new MouseAdapter(){
				public void mouseEntered(MouseEvent me){
					//hover.setBounds(0,348,200,55);
					//hover.show();
					stock.setBackground(new Color(0, 0, 0,50));
					stocicon.show();
					stock.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
				}
				public void mouseExited(MouseEvent me){
					//hover.hide();
					stock.setBackground(new Color(255, 255, 255,0));
					stocicon.hide();
				}
				public void mouseClicked(MouseEvent me){
					
					fleche.setBounds(-7,179,25,25);
					groupepanel.hide();
					menupanel.setBounds(0,100,45,600);
					window1.setBounds(45, 100, 855, 600);
					band.setBounds(0, 30, 855, 150);
					backband.setBounds(0, 0, 855, 150);
					clos.setBounds(825, 5, 23,20);
					min.setBounds(795, 5, 23, 20);
					menuicn.hide();
					righticn.show();
					panel_of_commandeE.hide();
					panel_of_commandeR.hide();
					panel_of_vente.hide();
					panel_of_profil.hide();
					
				}
			});
		
		
			window1.add(min);
			window1.add(clos);
		
			backmenu.add(menuicn);
			backmenu.add(righticn);
			fen.add(window1);
		
		fen.setVisible(true);
		}

	public static void main(String[] args) {
		
		new principe();
	}

}
