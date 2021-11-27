package login;


import java.awt.Color;

import javax.swing.*;

public class intro {
	public intro(){
	JWindow w = new JWindow();
	
		
		JLabel bg= new JLabel();
		ImageIcon im= new ImageIcon("logo_bigger.png");
		bg.setIcon(im);
		//bg.setBorder(BorderFactory.createBevelBorder(1));
		w.add(bg);
		w.setBackground(new Color(0, 0, 0,0));
		w.setSize(600, 500);
		
		w.setLocationRelativeTo(null);
		float k=(float)0.01,s=(float)0.0;
		for(int i=0;i<800;i++){
			if(i%10==0) {
			w.setOpacity((float)s+k);
			s+=0.01;
			w.setVisible(true);}
			s+=0.00025;
			w.setVisible(true);
		}
		w.setVisible(true);
		try{
			Thread.sleep(3000);
		}catch(Exception e){
			
		}
		w.setVisible(false);
		}
}
