package sinema;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.ButtonGroup;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.ActionEvent;
import javax.swing.JPanel;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.Color;
import javax.swing.border.LineBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.border.EmptyBorder;
import javax.swing.border.MatteBorder;
import java.awt.SystemColor;
import javax.swing.border.BevelBorder;
import javax.swing.JRadioButton;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JToggleButton;
import java.lang.String;
import java.util.*;

public class sinemasalonu {
    
	private JFrame frame;
	private JTextField txtIsimgir;
	private JTextField txtSoygir;

	sqlbaglanti baslaSin=sqlbaglanti.instance();
	
	String filmAdi;
	String ad;
	String soyad;
	int fiyat;
	int salon;
	String seans; 
	String koltuk;
    String [] otur; 
	
	 
	
	public sinemasalonu() {
		
      
		frame = new JFrame("Bilet Satın Alma Ekranı");
		frame.getContentPane().setBackground(new Color(220, 20, 60));
		frame.setBounds(100, 100, 868, 563);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.setResizable(false);
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
		
		
		ButtonGroup group = new ButtonGroup();
	
		JRadioButton rdbtnTam = new JRadioButton("   TAM");
		rdbtnTam.setBackground(new Color(216, 191, 216));
		
		JRadioButton rdbtnOgrenci = new JRadioButton("   \u00D6\u011ERENC\u0130");
		rdbtnOgrenci.setBackground(new Color(216, 191, 216));
		
		group.add(rdbtnOgrenci);
		group.add(rdbtnTam);
		
		JComboBox comboBox = new JComboBox();
		comboBox.addItem(baslaSin.alSalon);
			
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.addItem(baslaSin.alSeans);
		
		System.out.println(baslaSin.alSalon+baslaSin.alSeans);
		
		JLabel lblA = new JLabel("A");
		lblA.setForeground(new Color(245, 245, 245));
		lblA.setFont(new Font("Tahoma", Font.BOLD, 17));
		
		JLabel lblB = new JLabel("B");
		lblB.setForeground(new Color(245, 245, 245));
		lblB.setFont(new Font("Tahoma", Font.BOLD, 17));
		
		JLabel lblC = new JLabel("C");
		lblC.setForeground(new Color(245, 245, 245));
		lblC.setFont(new Font("Tahoma", Font.BOLD, 17));
		
		JLabel lblD = new JLabel("D");
		lblD.setForeground(new Color(245, 245, 245));
		lblD.setFont(new Font("Tahoma", Font.BOLD, 17));
		
		JLabel lblE = new JLabel("E");
		lblE.setForeground(new Color(245, 245, 245));
		lblE.setFont(new Font("Tahoma", Font.BOLD, 17));
		
		JLabel lblF = new JLabel("F");
		lblF.setForeground(new Color(245, 245, 245));
		lblF.setFont(new Font("Tahoma", Font.BOLD, 17));
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(255, 165, 0));
		panel_1.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		
		JToggleButton A1 = new JToggleButton("1");
		A1.setBackground(Color.WHITE);
		A1.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent arg0) {
			if(A1.isSelected()) {
				A1.setBackground(Color.orange);
				koltuk="A1";
				System.out.println(koltuk);
			}else {
				A1.setBackground(Color.WHITE);
			     
			}
			
			}
		});
		
		JToggleButton A2 = new JToggleButton("2");
		A2.setBackground(Color.WHITE);
		A2.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent arg0) {
				if(A2.isSelected()) {
					A2.setBackground(Color.orange);
					koltuk="A2";
					System.out.println(koltuk);
				}else {
					A2.setBackground(Color.WHITE);
				     
				}
			}
		});
		
		JToggleButton A3 = new JToggleButton("3");
		A3.setBackground(Color.WHITE);
		A3.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent arg0) {
				if(A3.isSelected()) {
					A3.setBackground(Color.orange);
					koltuk="A3";
					System.out.println(koltuk);
				}else {
					A3.setBackground(Color.WHITE);
				     
				}
			}
			
		});
		
		JToggleButton A4 = new JToggleButton("4");
		A4.setBackground(Color.WHITE);
		A4.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent arg0) {
				if(A4.isSelected()) {
					A4.setBackground(Color.orange);
					koltuk="A4";
					System.out.println(koltuk);
				}else {
					A4.setBackground(Color.WHITE);
				     
				}
			
			}
		});
		
		JToggleButton A5 = new JToggleButton("5");
		A5.setBackground(Color.WHITE);
		A5.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent arg0) {
				if(A5.isSelected()) {
					A5.setBackground(Color.orange);
					koltuk="A5";
					System.out.println(koltuk);
				}else {
					A5.setBackground(Color.WHITE);
				     
				}
			
			}
		});
		
		JToggleButton A6 = new JToggleButton("6");
		A6.setBackground(Color.WHITE);
		A6.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent arg0) {
				if(A6.isSelected()) {
					A6.setBackground(Color.orange);
					koltuk="A6";
					System.out.println(koltuk);
				}else {
					A6.setBackground(Color.WHITE);
				     
				}
			
			}
		});
		
		JToggleButton A7 = new JToggleButton("7");
		A7.setBackground(Color.WHITE);
		A7.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent arg0) {
				if(A7.isSelected()) {
					A7.setBackground(Color.orange);
					koltuk="A7";
					System.out.println(koltuk);
				}else {
					A7.setBackground(Color.WHITE);
				     
				}
			
			}
		});
		
		JToggleButton A8 = new JToggleButton("8");
		A8.setBackground(Color.WHITE);
		A8.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent arg0) {
				if(A8.isSelected()) {
					A8.setBackground(Color.orange);
					koltuk="A8";
					System.out.println(koltuk);
				}else {
					A8.setBackground(Color.WHITE);
				     
				}
			}
			
		});
		
		JToggleButton B1 = new JToggleButton("1");
		B1.setBackground(Color.WHITE);
		B1.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent arg0) {				
				
				if(B1.isSelected()) {
					B1.setBackground(Color.orange);
					koltuk="B1";
					System.out.println(koltuk);
				}else {
					B1.setBackground(Color.WHITE);
				     
				}
			}
		});
		
		
		JToggleButton B2 = new JToggleButton("2");
		B2.setBackground(Color.WHITE);
		B2.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent arg0) {
				if(B2.isSelected()) {
					B2.setBackground(Color.orange);
					koltuk="B2";
					System.out.println(koltuk);
				}else {
					B2.setBackground(Color.WHITE);
				     
				}
			}
		});
		
		JToggleButton B3 = new JToggleButton("3");
		B3.setBackground(Color.WHITE);
		B3.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent arg0) {
				if(B3.isSelected()) {
					B3.setBackground(Color.orange);
					koltuk="B3";
					System.out.println(koltuk);
				}else {
					B3.setBackground(Color.WHITE);
				     
				}
			}
		});
		
		JToggleButton B4 = new JToggleButton("4");
		B4.setBackground(Color.WHITE);
		B4.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent arg0) {
				
				
				if(B4.isSelected()) {
					B4.setBackground(Color.orange);
					koltuk="B4";
					System.out.println(koltuk);
				}else {
					B4.setBackground(Color.WHITE);
				     
				}
			}
		});
		
		JToggleButton B5 = new JToggleButton("5");
		B5.setBackground(Color.WHITE);
		B5.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent arg0) {
				if(B5.isSelected()) {
					B5.setBackground(Color.orange);
					koltuk="B5";
					System.out.println(koltuk);
				}else {
					B5.setBackground(Color.WHITE);
				     
				}
			}
		});
		
		JToggleButton B6 = new JToggleButton("6");
		B6.setBackground(Color.WHITE);
		B6.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent arg0) {				
				
				if(B6.isSelected()) {
					B6.setBackground(Color.orange);
					koltuk="B6";
					System.out.println(koltuk);
				}else {
					B6.setBackground(Color.WHITE);
				     
				}
			}
		});
		
		JToggleButton B7 = new JToggleButton("7");
		B7.setBackground(Color.WHITE);
		B7.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent arg0) {				
				
				if(B7.isSelected()) {
					B7.setBackground(Color.orange);
					koltuk="B7";
					System.out.println(koltuk);
				}else {
					B7.setBackground(Color.WHITE);
				     
				}
			}
		});
		
		JToggleButton B8 = new JToggleButton("8");
		B8.setBackground(Color.WHITE);
		B8.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent arg0) {				
				
				if(B8.isSelected()) {
					B8.setBackground(Color.orange);
					koltuk="B8";
					System.out.println(koltuk);
				}else {
					B8.setBackground(Color.WHITE);
				     
				}
			}
		});
		
		JToggleButton C1 = new JToggleButton("1");
		C1.setBackground(Color.WHITE);
		C1.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent arg0) {				
				
				if(C1.isSelected()) {
					C1.setBackground(Color.orange);
					koltuk="C1";
					System.out.println(koltuk);
				}else {
					C1.setBackground(Color.WHITE);
				     
				}
			}
		});
		
		
		JToggleButton C2 = new JToggleButton("2");
		C2.setBackground(Color.WHITE);
		C2.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent arg0) {				
				
				if(C2.isSelected()) {
					C2.setBackground(Color.orange);
					koltuk="C2";
					System.out.println(koltuk);
				}else {
					C2.setBackground(Color.WHITE);
				     
				}
			}
		});
		
		JToggleButton C3 = new JToggleButton("3");
		C3.setBackground(Color.WHITE);
		C3.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent arg0) {				
				
				if(C3.isSelected()) {
					C3.setBackground(Color.orange);
					koltuk="C3";
					System.out.println(koltuk);
				}else {
					C3.setBackground(Color.WHITE);
				     
				}
			}
		});
		
		JToggleButton C4 = new JToggleButton("4");
		C4.setBackground(Color.WHITE);
		C4.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent arg0) {				
				
				if(C4.isSelected()) {
					C4.setBackground(Color.orange);
					koltuk="C4";
					System.out.println(koltuk);
				}else {
					C4.setBackground(Color.WHITE);
				     
				}
			}
		});
		
		JToggleButton C5 = new JToggleButton("5");
		C5.setBackground(Color.WHITE);
		C5.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent arg0) {				
				
				if(C5.isSelected()) {
					C5.setBackground(Color.orange);
					koltuk="C5";
					System.out.println(koltuk);
				}else {
					C5.setBackground(Color.WHITE);
				     
				}
			}
		});
		
		JToggleButton C6 = new JToggleButton("6");
		C6.setBackground(Color.WHITE);
		C6.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent arg0) {				
				
				if(C6.isSelected()) {
					C6.setBackground(Color.orange);
					koltuk="C6";
					System.out.println(koltuk);
				}else {
					C6.setBackground(Color.WHITE);
				     
				}
			}
		});
		
		JToggleButton C7 = new JToggleButton("7");
		C7.setBackground(Color.WHITE);
		C7.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent arg0) {				
				
				if(C7.isSelected()) {
					C7.setBackground(Color.orange);
					koltuk="C7";
					System.out.println(koltuk);
				}else {
					C7.setBackground(Color.WHITE);
				     
				}
			}
		});
		
		JToggleButton C8 = new JToggleButton("8");
		C8.setBackground(Color.WHITE);
		C8.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent arg0) {				
				
				if(C8.isSelected()) {
					C8.setBackground(Color.orange);
					koltuk="C8";
					System.out.println(koltuk);
				}else {
					C8.setBackground(Color.WHITE);
				     
				}
			}
		});
		
		JToggleButton D1 = new JToggleButton("1");
		D1.setBackground(Color.WHITE);
		D1.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent arg0) {				
				
				if(D1.isSelected()) {
					D1.setBackground(Color.orange);
					koltuk="D1";
					System.out.println(koltuk);
				}else {
					D1.setBackground(Color.WHITE);
				     
				}
			}
		});
		
	
		JToggleButton D2 = new JToggleButton("2");
		D2.setBackground(Color.WHITE);
		D2.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent arg0) {				
				
				if(D2.isSelected()) {
					D2.setBackground(Color.orange);
					koltuk="D2";
					System.out.println(koltuk);
				}else {
					D2.setBackground(Color.WHITE);
				     
				}
			}
		});
		
		JToggleButton D3 = new JToggleButton("3");
		D3.setBackground(Color.WHITE);
		D3.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent arg0) {				
				
				if(D3.isSelected()) {
					D3.setBackground(Color.orange);
					koltuk="D3";
					System.out.println(koltuk);
				}else {
					D3.setBackground(Color.WHITE);
				     
				}
			}
		});
		
		JToggleButton D4 = new JToggleButton("4");
		D4.setBackground(Color.WHITE);
		D4.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent arg0) {				
				
				if(D4.isSelected()) {
					D4.setBackground(Color.orange);
					koltuk="D4";
					System.out.println(koltuk);
				}else {
					D4.setBackground(Color.WHITE);
				     
				}
			}
		});
		
		JToggleButton D5 = new JToggleButton("5");
		D5.setBackground(Color.WHITE);
		D5.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent arg0) {				
				
				if(D5.isSelected()) {
					D5.setBackground(Color.orange);
					koltuk="D5";
					System.out.println(koltuk);
				}else {
					D5.setBackground(Color.WHITE);
				     
				}
			}
		});
		
		JToggleButton D6 = new JToggleButton("6");
		D6.setBackground(Color.WHITE);
		D6.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent arg0) {				
				
				if(D6.isSelected()) {
					D6.setBackground(Color.orange);
					koltuk="D6";
					System.out.println(koltuk);
				}else {
					D6.setBackground(Color.WHITE);
				     
				}
			}
		});
		
		JToggleButton D7 = new JToggleButton("7");
		D7.setBackground(Color.WHITE);
		D7.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent arg0) {				
				
				if(D7.isSelected()) {
					D7.setBackground(Color.orange);
					koltuk="D7";
					System.out.println(koltuk);
				}else {
					D7.setBackground(Color.WHITE);
				     
				}
			}
		});
		
		JToggleButton D8 = new JToggleButton("8");
		D8.setBackground(Color.WHITE);
		D8.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent arg0) {				
				
				if(D8.isSelected()) {
					D8.setBackground(Color.orange);
					koltuk="D8";
					System.out.println(koltuk);
				}else {
					D8.setBackground(Color.WHITE);
				     
				}
			}
		});
		
		JToggleButton E1 = new JToggleButton("1");
		E1.setBackground(Color.WHITE);
		E1.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent arg0) {				
				
				if(E1.isSelected()) {
					E1.setBackground(Color.orange);
					koltuk="E1";
					System.out.println(koltuk);
				}else {
					E1.setBackground(Color.WHITE);
				     
				}
			}
		});
		
		JToggleButton E2 = new JToggleButton("2");
		E2.setBackground(Color.WHITE);
		E2.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent arg0) {				
				
				if(E2.isSelected()) {
					E2.setBackground(Color.orange);
					koltuk="E2";
					System.out.println(koltuk);
				}else {
					E2.setBackground(Color.WHITE);
				     
				}
			}
		});
		
		JToggleButton E3 = new JToggleButton("3");
		E3.setBackground(Color.WHITE);
		E3.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent arg0) {				
				
				if(E3.isSelected()) {
					E3.setBackground(Color.orange);
					koltuk="E3";
					System.out.println(koltuk);
				}else {
					E3.setBackground(Color.WHITE);
				     
				}
			}
		});
		
		JToggleButton E4 = new JToggleButton("4");
		E4.setBackground(Color.WHITE);
		E4.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent arg0) {				
				
				if(E4.isSelected()) {
					E4.setBackground(Color.orange);
					koltuk="E4";
					System.out.println(koltuk);
				}else {
					E4.setBackground(Color.WHITE);
				     
				}
			}
		});
		
		JToggleButton E5 = new JToggleButton("5");
		E5.setBackground(Color.WHITE);
		E5.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent arg0) {				
				
				if(E5.isSelected()) {
					E5.setBackground(Color.orange);
					koltuk="E5";
					System.out.println(koltuk);
				}else {
					E5.setBackground(Color.WHITE);
				     
				}
			}
		});
		
		JToggleButton E6 = new JToggleButton("6");
		E6.setBackground(Color.WHITE);
		E6.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent arg0) {				
				
				if(E6.isSelected()) {
					E6.setBackground(Color.orange);
					koltuk="E6";
					System.out.println(koltuk);
				}else {
					E6.setBackground(Color.WHITE);
				     
				}
			}
		});
		
		JToggleButton E7 = new JToggleButton("7");
		E7.setBackground(Color.WHITE);
		E7.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent arg0) {				
				
				if(E7.isSelected()) {
					E7.setBackground(Color.orange);
					koltuk="E7";
					System.out.println(koltuk);
				}else {
					E7.setBackground(Color.WHITE);
				     
				}
			}
		});
		
		JToggleButton E8 = new JToggleButton("8");
		E8.setBackground(Color.WHITE);
		E8.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent arg0) {				
				
				if(E8.isSelected()) {
					E8.setBackground(Color.orange);
					koltuk="E8";
					System.out.println(koltuk);
				}else {
					E8.setBackground(Color.WHITE);
				     
				}
			}
		});
		
		JToggleButton F1 = new JToggleButton("1");
		F1.setBackground(Color.WHITE);
		F1.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent arg0) {				
				
				if(F1.isSelected()) {
					F1.setBackground(Color.orange);
					koltuk="F1";
					System.out.println(koltuk);
				}else {
					F1.setBackground(Color.WHITE);
				     
				}
			}
		});
		
		
		JToggleButton F2 = new JToggleButton("2");
		F2.setBackground(Color.WHITE);
		F2.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent arg0) {				
				
				if(F2.isSelected()) {
					F2.setBackground(Color.orange);
					koltuk="F2";
					System.out.println(koltuk);
				}else {
					F2.setBackground(Color.WHITE);
				     
				}
			}
		});
		
		JToggleButton F3 = new JToggleButton("3");
		F3.setBackground(Color.WHITE);
		F3.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent arg0) {				
				
				if(F3.isSelected()) {
					F3.setBackground(Color.orange);
					koltuk="F3";
					System.out.println(koltuk);
				}else {
					F3.setBackground(Color.WHITE);
				     
				}
			}
		});
		
		JToggleButton F4 = new JToggleButton("4");
		F4.setBackground(Color.WHITE);
		F4.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent arg0) {				
				
				if(F4.isSelected()) {
					F4.setBackground(Color.orange);
					koltuk="F4";
					System.out.println(koltuk);
				}else {
					F4.setBackground(Color.WHITE);
				     
				}
			}
		});
		
		JToggleButton F5 = new JToggleButton("5");
		F5.setBackground(Color.WHITE);
		F5.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent arg0) {				
				
				if(F5.isSelected()) {
					F5.setBackground(Color.orange);
					koltuk="F5";
					System.out.println(koltuk);
				}else {
					F5.setBackground(Color.WHITE);
				     
				}
			}
		});
		
		JToggleButton F6 = new JToggleButton("6");
		F6.setBackground(Color.WHITE);
		F6.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent arg0) {				
				
				if(F6.isSelected()) {
					F6.setBackground(Color.orange);
					koltuk="F6";
					System.out.println(koltuk);
				}else {
					F6.setBackground(Color.WHITE);
				     
				}
			}
		});
		
		JToggleButton F7 = new JToggleButton("7");
		F7.setBackground(Color.WHITE);
		F7.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent arg0) {				
				
				if(F7.isSelected()) {
					F7.setBackground(Color.orange);
					koltuk="F7";
					System.out.println(koltuk);
				}else {
					F7.setBackground(Color.WHITE);
				     
				}
			}
		});
		
		
		
		JToggleButton F8 = new JToggleButton("8");
		F8.setBackground(Color.WHITE);
		F8.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent arg0) {				
				
					
				
				if(F8.isSelected()) {
					F8.setBackground(Color.orange);
					koltuk="F8";
					System.out.println(koltuk);
				}else {
					F8.setBackground(Color.WHITE);
				      
				}
			}
		});
		

for(int i=0;i<baslaSin.oturak.length;i++) {
	
	  
	if("A1".equals(baslaSin.oturak[i])==true) {
		A1.setEnabled(false);
		
	}
	
	if("A2".equals(baslaSin.oturak[i])==true) {
		A2.setEnabled(false);
		
	}
	
	if("A3".equals(baslaSin.oturak[i])==true) {
		A3.setEnabled(false);
		
	}
	
	if("A4".equals(baslaSin.oturak[i])==true) {
		A4.setEnabled(false);
		
	}
	
	if("A5".equals(baslaSin.oturak[i])==true) {
		A5.setEnabled(false);
		
	}
	
	if("A6".equals(baslaSin.oturak[i])==true) {
		A6.setEnabled(false);
		
	}
	
	if("A7".equals(baslaSin.oturak[i])==true) {
		A7.setEnabled(false);
		
	}
	
	if("A8".equals(baslaSin.oturak[i])==true) {
		A8.setEnabled(false);
		
	}
	
	if("B1".equals(baslaSin.oturak[i])==true) {
		B1.setEnabled(false);
		
	}
	
	if("B2".equals(baslaSin.oturak[i])==true) {
		B2.setEnabled(false);
		
	}
	
	if("B3".equals(baslaSin.oturak[i])==true) {
		B3.setEnabled(false);
		
	}
	
	if("B4".equals(baslaSin.oturak[i])==true) {
		B4.setEnabled(false);
		
	}
	
	if("B5".equals(baslaSin.oturak[i])==true) {
		B5.setEnabled(false);
		
	}
	
	if("B6".equals(baslaSin.oturak[i])==true) {
		B6.setEnabled(false);
		
	}
	
	if("B7".equals(baslaSin.oturak[i])==true) {
		B7.setEnabled(false);
		
	}
	
	if("B8".equals(baslaSin.oturak[i])==true) {
		B8.setEnabled(false);
		
	}
	
	if("C1".equals(baslaSin.oturak[i])==true) {
		C1.setEnabled(false);
		
	}
	
	if("C2".equals(baslaSin.oturak[i])==true) {
		C2.setEnabled(false);
		
	}
	
	if("C3".equals(baslaSin.oturak[i])==true) {
		C3.setEnabled(false);
		
	}
	
	if("C4".equals(baslaSin.oturak[i])==true) {
		C4.setEnabled(false);
		
	}
	
	if("C5".equals(baslaSin.oturak[i])==true) {
		C5.setEnabled(false);
		
	}
	
	if("C6".equals(baslaSin.oturak[i])==true) {
		C6.setEnabled(false);
		
	}
	
	if("C7".equals(baslaSin.oturak[i])==true) {
		C7.setEnabled(false);
		
	}
	
	if("C8".equals(baslaSin.oturak[i])==true) {
		C8.setEnabled(false);
		
	}
	
	if("D1".equals(baslaSin.oturak[i])==true) {
		D1.setEnabled(false);
		
	}
	
	if("D2".equals(baslaSin.oturak[i])==true) {
		D2.setEnabled(false);
		
	}
	
	if("D3".equals(baslaSin.oturak[i])==true) {
		D3.setEnabled(false);
		
	}
	
	if("D4".equals(baslaSin.oturak[i])==true) {
		D4.setEnabled(false);
		
	}
	
	if("D5".equals(baslaSin.oturak[i])==true) {
		D5.setEnabled(false);
		
	}
	
	if("D6".equals(baslaSin.oturak[i])==true) {
		D6.setEnabled(false);
		
	}
	
	if("D7".equals(baslaSin.oturak[i])==true) {
		D7.setEnabled(false);
		
	}
	
	if("D8".equals(baslaSin.oturak[i])==true) {
		D8.setEnabled(false);
		
	}
	
	if("E1".equals(baslaSin.oturak[i])==true) {
		E1.setEnabled(false);
		
	}
	
	if("E2".equals(baslaSin.oturak[i])==true) {
		E2.setEnabled(false);
		
	}
	
	if("E3".equals(baslaSin.oturak[i])==true) {
		E3.setEnabled(false);
		
	}
	
	if("E4".equals(baslaSin.oturak[i])==true) {
		E4.setEnabled(false);
		
	}
	
	if("E5".equals(baslaSin.oturak[i])==true) {
		E5.setEnabled(false);
		
	}
	
	if("E6".equals(baslaSin.oturak[i])==true) {
		E6.setEnabled(false);
		
	}
	
	if("E7".equals(baslaSin.oturak[i])==true) {
		E7.setEnabled(false);
		
	}
	
	if("E8".equals(baslaSin.oturak[i])==true) {
		E8.setEnabled(false);
		
	}
	
	if("F1".equals(baslaSin.oturak[i])==true) {
		F1.setEnabled(false);
		
	}
	
	if("F2".equals(baslaSin.oturak[i])==true) {
		F2.setEnabled(false);
		
	}
	
	if("F3".equals(baslaSin.oturak[i])==true) {
		F3.setEnabled(false);
		
	}
	
	if("F4".equals(baslaSin.oturak[i])==true) {
		F4.setEnabled(false);
		
	}
	
	if("F5".equals(baslaSin.oturak[i])==true) {
		F5.setEnabled(false);
	
	}
	
	if("F6".equals(baslaSin.oturak[i])==true) {
		F6.setEnabled(false);
		
	}
	
	if("F7".equals(baslaSin.oturak[i])==true) {
		F7.setEnabled(false);
		
	}
	
	if("F8".equals(baslaSin.oturak[i])==true) {
		F8.setEnabled(false);
		
	}
	
	
	
	
	
	
}
		
		
		JPanel panel = new JPanel();
		GroupLayout groupLayout = new GroupLayout(frame.getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(40)
					.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(lblA, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(A1, GroupLayout.PREFERRED_SIZE, 49, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(A2, GroupLayout.PREFERRED_SIZE, 49, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(A3, GroupLayout.PREFERRED_SIZE, 49, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(A4, GroupLayout.PREFERRED_SIZE, 49, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(A5, GroupLayout.PREFERRED_SIZE, 49, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(A6, GroupLayout.PREFERRED_SIZE, 49, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(A7, GroupLayout.PREFERRED_SIZE, 49, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(A8, GroupLayout.PREFERRED_SIZE, 49, GroupLayout.PREFERRED_SIZE))
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(lblB, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(B1, GroupLayout.PREFERRED_SIZE, 49, GroupLayout.PREFERRED_SIZE)
							.addGap(6)
							.addComponent(B2, GroupLayout.PREFERRED_SIZE, 49, GroupLayout.PREFERRED_SIZE)
							.addGap(6)
							.addComponent(B3, GroupLayout.PREFERRED_SIZE, 49, GroupLayout.PREFERRED_SIZE)
							.addGap(6)
							.addComponent(B4, GroupLayout.PREFERRED_SIZE, 49, GroupLayout.PREFERRED_SIZE)
							.addGap(6)
							.addComponent(B5, GroupLayout.PREFERRED_SIZE, 49, GroupLayout.PREFERRED_SIZE)
							.addGap(6)
							.addComponent(B6, GroupLayout.PREFERRED_SIZE, 49, GroupLayout.PREFERRED_SIZE)
							.addGap(6)
							.addComponent(B7, GroupLayout.PREFERRED_SIZE, 49, GroupLayout.PREFERRED_SIZE)
							.addGap(6)
							.addComponent(B8, GroupLayout.PREFERRED_SIZE, 49, GroupLayout.PREFERRED_SIZE))
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(lblC, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(C1, GroupLayout.PREFERRED_SIZE, 49, GroupLayout.PREFERRED_SIZE)
							.addGap(6)
							.addComponent(C2, GroupLayout.PREFERRED_SIZE, 49, GroupLayout.PREFERRED_SIZE)
							.addGap(6)
							.addComponent(C3, GroupLayout.PREFERRED_SIZE, 49, GroupLayout.PREFERRED_SIZE)
							.addGap(6)
							.addComponent(C4, GroupLayout.PREFERRED_SIZE, 49, GroupLayout.PREFERRED_SIZE)
							.addGap(6)
							.addComponent(C5, GroupLayout.PREFERRED_SIZE, 49, GroupLayout.PREFERRED_SIZE)
							.addGap(6)
							.addComponent(C6, GroupLayout.PREFERRED_SIZE, 49, GroupLayout.PREFERRED_SIZE)
							.addGap(6)
							.addComponent(C7, GroupLayout.PREFERRED_SIZE, 49, GroupLayout.PREFERRED_SIZE)
							.addGap(6)
							.addComponent(C8, GroupLayout.PREFERRED_SIZE, 49, GroupLayout.PREFERRED_SIZE))
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(lblD, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(D1, GroupLayout.PREFERRED_SIZE, 49, GroupLayout.PREFERRED_SIZE)
							.addGap(6)
							.addComponent(D2, GroupLayout.PREFERRED_SIZE, 49, GroupLayout.PREFERRED_SIZE)
							.addGap(6)
							.addComponent(D3, GroupLayout.PREFERRED_SIZE, 49, GroupLayout.PREFERRED_SIZE)
							.addGap(6)
							.addComponent(D4, GroupLayout.PREFERRED_SIZE, 49, GroupLayout.PREFERRED_SIZE)
							.addGap(6)
							.addComponent(D5, GroupLayout.PREFERRED_SIZE, 49, GroupLayout.PREFERRED_SIZE)
							.addGap(6)
							.addComponent(D6, GroupLayout.PREFERRED_SIZE, 49, GroupLayout.PREFERRED_SIZE)
							.addGap(6)
							.addComponent(D7, GroupLayout.PREFERRED_SIZE, 49, GroupLayout.PREFERRED_SIZE)
							.addGap(6)
							.addComponent(D8, GroupLayout.PREFERRED_SIZE, 49, GroupLayout.PREFERRED_SIZE))
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(lblE, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(E1, GroupLayout.PREFERRED_SIZE, 49, GroupLayout.PREFERRED_SIZE)
							.addGap(6)
							.addComponent(E2, GroupLayout.PREFERRED_SIZE, 49, GroupLayout.PREFERRED_SIZE)
							.addGap(6)
							.addComponent(E3, GroupLayout.PREFERRED_SIZE, 49, GroupLayout.PREFERRED_SIZE)
							.addGap(6)
							.addComponent(E4, GroupLayout.PREFERRED_SIZE, 49, GroupLayout.PREFERRED_SIZE)
							.addGap(6)
							.addComponent(E5, GroupLayout.PREFERRED_SIZE, 49, GroupLayout.PREFERRED_SIZE)
							.addGap(6)
							.addComponent(E6, GroupLayout.PREFERRED_SIZE, 49, GroupLayout.PREFERRED_SIZE)
							.addGap(6)
							.addComponent(E7, GroupLayout.PREFERRED_SIZE, 49, GroupLayout.PREFERRED_SIZE)
							.addGap(6)
							.addComponent(E8, GroupLayout.PREFERRED_SIZE, 49, GroupLayout.PREFERRED_SIZE))
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(lblF, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(F1, GroupLayout.PREFERRED_SIZE, 49, GroupLayout.PREFERRED_SIZE)
							.addGap(6)
							.addComponent(F2, GroupLayout.PREFERRED_SIZE, 49, GroupLayout.PREFERRED_SIZE)
							.addGap(6)
							.addComponent(F3, GroupLayout.PREFERRED_SIZE, 49, GroupLayout.PREFERRED_SIZE)
							.addGap(6)
							.addComponent(F4, GroupLayout.PREFERRED_SIZE, 49, GroupLayout.PREFERRED_SIZE)
							.addGap(6)
							.addComponent(F5, GroupLayout.PREFERRED_SIZE, 49, GroupLayout.PREFERRED_SIZE)
							.addGap(6)
							.addComponent(F6, GroupLayout.PREFERRED_SIZE, 49, GroupLayout.PREFERRED_SIZE)
							.addGap(6)
							.addComponent(F7, GroupLayout.PREFERRED_SIZE, 49, GroupLayout.PREFERRED_SIZE)
							.addGap(6)
							.addComponent(F8, GroupLayout.PREFERRED_SIZE, 49, GroupLayout.PREFERRED_SIZE))
						.addComponent(panel, GroupLayout.PREFERRED_SIZE, 463, GroupLayout.PREFERRED_SIZE))
					.addGap(74)
					.addComponent(panel_1, GroupLayout.PREFERRED_SIZE, 251, GroupLayout.PREFERRED_SIZE)
					.addGap(24))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(31)
							.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblA)
								.addComponent(A1, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE)
								.addComponent(A2, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE)
								.addComponent(A3, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE)
								.addComponent(A4, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE)
								.addComponent(A5, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE)
								.addComponent(A6, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE)
								.addComponent(A7, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE)
								.addComponent(A8, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE))
							.addGap(30)
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addComponent(lblB, GroupLayout.PREFERRED_SIZE, 21, GroupLayout.PREFERRED_SIZE)
								.addComponent(B1, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE)
								.addComponent(B2, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE)
								.addComponent(B3, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE)
								.addComponent(B4, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE)
								.addComponent(B5, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE)
								.addComponent(B6, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE)
								.addComponent(B7, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE)
								.addComponent(B8, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE))
							.addGap(31)
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addComponent(lblC, GroupLayout.PREFERRED_SIZE, 21, GroupLayout.PREFERRED_SIZE)
								.addComponent(C1, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE)
								.addComponent(C2, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE)
								.addComponent(C3, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE)
								.addComponent(C4, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE)
								.addComponent(C5, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE)
								.addComponent(C6, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE)
								.addComponent(C7, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE)
								.addComponent(C8, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE))
							.addGap(28)
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addComponent(lblD, GroupLayout.PREFERRED_SIZE, 21, GroupLayout.PREFERRED_SIZE)
								.addComponent(D1, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE)
								.addComponent(D2, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE)
								.addComponent(D3, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE)
								.addComponent(D4, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE)
								.addComponent(D5, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE)
								.addComponent(D6, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE)
								.addComponent(D7, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE)
								.addComponent(D8, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE))
							.addGap(29)
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addComponent(lblE, GroupLayout.PREFERRED_SIZE, 21, GroupLayout.PREFERRED_SIZE)
								.addComponent(E1, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE)
								.addComponent(E2, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE)
								.addComponent(E3, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE)
								.addComponent(E4, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE)
								.addComponent(E5, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE)
								.addComponent(E6, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE)
								.addComponent(E7, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE)
								.addComponent(E8, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE))
							.addGap(28)
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
									.addComponent(F1, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE)
									.addComponent(lblF, GroupLayout.PREFERRED_SIZE, 21, GroupLayout.PREFERRED_SIZE))
								.addComponent(F2, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE)
								.addComponent(F3, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE)
								.addComponent(F4, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE)
								.addComponent(F5, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE)
								.addComponent(F6, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE)
								.addComponent(F7, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE)
								.addComponent(F8, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE))
							.addGap(27)
							.addComponent(panel, GroupLayout.PREFERRED_SIZE, 61, GroupLayout.PREFERRED_SIZE))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(12)
							.addComponent(panel_1, GroupLayout.PREFERRED_SIZE, 488, GroupLayout.PREFERRED_SIZE)))
					.addContainerGap(418, Short.MAX_VALUE))
		);
		
		JLabel lblPER = new JLabel("P   E   R   D   E   ");
		lblPER.setFont(new Font("SansSerif", Font.BOLD, 24));
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(Alignment.TRAILING, gl_panel.createSequentialGroup()
					.addContainerGap(141, Short.MAX_VALUE)
					.addComponent(lblPER, GroupLayout.PREFERRED_SIZE, 233, GroupLayout.PREFERRED_SIZE)
					.addGap(89))
		);
		gl_panel.setVerticalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addGap(14)
					.addComponent(lblPER)
					.addContainerGap(15, Short.MAX_VALUE))
		);
		panel.setLayout(gl_panel);
		
		JButton btnKayit = new JButton("B\u0130LET AL");
		btnKayit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				   if((rdbtnOgrenci.isSelected() || rdbtnTam.isSelected() ) && txtIsimgir.getText().length()>2 && txtSoygir.getText().length()>2) {
									   	   
					ad=txtIsimgir.getText();
					soyad=txtSoygir.getText();
					filmAdi=baslaSin.filmismi;
					salon=baslaSin.alSalon;
					seans=baslaSin.alSeans;
					if(rdbtnOgrenci.isSelected()) {fiyat=10; }
					else {fiyat=15;}
					
                
                    
               
					
					baslaSin.setisim(ad, soyad, filmAdi, salon, seans, fiyat, koltuk); 	   
					
				txtSoygir.setText("");
				txtIsimgir.setText("");
				
                   }
				   else {
					   
					   JOptionPane.showMessageDialog(null, "BİLGİLERİ TAM DOLDURMADINIZ!","SATIN ALMA HATASI!",JOptionPane.OK_CANCEL_OPTION);
				   }
				   
				   
			}
		});
		
		JLabel lblNewLabel = new JLabel("F\u0130LM ADI : ");
		lblNewLabel.setFont(new Font("Dialog", Font.BOLD, 14));
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(216, 191, 216));
		panel_2.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		
		JLabel lblSalon = new JLabel("SALON");
		
		JLabel lblSeans = new JLabel("SEANS");
		
		
		
		JLabel lblIsim = new JLabel("  \u0130S\u0130M");
		lblIsim.setFont(new Font("Dialog", Font.BOLD, 14));
		
		txtIsimgir = new JTextField();
		txtIsimgir.setText("");
		txtIsimgir.setColumns(10);
		
		JLabel lblSoyisim = new JLabel("SOY\u0130S\u0130M");
		lblSoyisim.setFont(new Font("Dialog", Font.BOLD, 14));
		
		txtSoygir = new JTextField();
		txtSoygir.setText("");
		txtSoygir.setColumns(10);
		
		
		 
		JLabel lblFilmadi = new JLabel(baslaSin.filmismi);
		
		 
		lblFilmadi.setFont(new Font("Dialog", Font.BOLD, 14));
		
		
		 
		
		
		GroupLayout gl_panel_1 = new GroupLayout(panel_1);
		gl_panel_1.setHorizontalGroup(
			gl_panel_1.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_panel_1.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblNewLabel)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(lblFilmadi, GroupLayout.DEFAULT_SIZE, 157, Short.MAX_VALUE)
					.addContainerGap())
				.addGroup(gl_panel_1.createSequentialGroup()
					.addContainerGap()
					.addComponent(panel_2, GroupLayout.PREFERRED_SIZE, 223, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(18, Short.MAX_VALUE))
				.addGroup(gl_panel_1.createSequentialGroup()
					.addGap(88)
					.addComponent(lblSoyisim, GroupLayout.PREFERRED_SIZE, 70, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(89, Short.MAX_VALUE))
				.addGroup(gl_panel_1.createSequentialGroup()
					.addGap(22)
					.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
						.addComponent(lblSalon, GroupLayout.PREFERRED_SIZE, 57, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_panel_1.createSequentialGroup()
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(lblSeans, GroupLayout.PREFERRED_SIZE, 57, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
								.addComponent(lblIsim, GroupLayout.PREFERRED_SIZE, 57, GroupLayout.PREFERRED_SIZE)
								.addGroup(gl_panel_1.createParallelGroup(Alignment.TRAILING)
									.addComponent(comboBox, GroupLayout.PREFERRED_SIZE, 87, GroupLayout.PREFERRED_SIZE)
									.addComponent(comboBox_1, GroupLayout.PREFERRED_SIZE, 87, GroupLayout.PREFERRED_SIZE)))))
					.addContainerGap(75, Short.MAX_VALUE))
				.addGroup(gl_panel_1.createSequentialGroup()
					.addGap(37)
					.addGroup(gl_panel_1.createParallelGroup(Alignment.TRAILING)
						.addComponent(txtSoygir, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 154, Short.MAX_VALUE)
						.addComponent(txtIsimgir, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 154, Short.MAX_VALUE))
					.addGap(56))
				.addGroup(Alignment.LEADING, gl_panel_1.createSequentialGroup()
					.addGap(85)
					.addComponent(btnKayit)
					.addContainerGap(83, Short.MAX_VALUE))
		);
		gl_panel_1.setVerticalGroup(
			gl_panel_1.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_1.createSequentialGroup()
					.addGap(28)
					.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
						.addComponent(lblNewLabel)
						.addComponent(lblFilmadi, GroupLayout.PREFERRED_SIZE, 19, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addComponent(panel_2, GroupLayout.PREFERRED_SIZE, 123, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
						.addComponent(lblSalon)
						.addComponent(comboBox, GroupLayout.PREFERRED_SIZE, 22, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_panel_1.createParallelGroup(Alignment.BASELINE)
						.addComponent(comboBox_1, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblSeans))
					.addGap(18)
					.addComponent(lblIsim)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(txtIsimgir, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(lblSoyisim)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(txtSoygir, GroupLayout.PREFERRED_SIZE, 26, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(btnKayit, GroupLayout.PREFERRED_SIZE, 67, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(181, Short.MAX_VALUE))
		);
		
		JLabel label = new JLabel("---- B\u0130LET F\u0130YATLARI ----");
		label.setFont(new Font("Dialog", Font.BOLD, 14));
		
		
		JLabel lblTampara = new JLabel("15 TL");
		
		JLabel lblOgrpara = new JLabel("10 TL");
		GroupLayout gl_panel_2 = new GroupLayout(panel_2);
		gl_panel_2.setHorizontalGroup(
			gl_panel_2.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_2.createSequentialGroup()
					.addGroup(gl_panel_2.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel_2.createSequentialGroup()
							.addGap(29)
							.addComponent(label))
						.addGroup(gl_panel_2.createSequentialGroup()
							.addGap(19)
							.addGroup(gl_panel_2.createParallelGroup(Alignment.LEADING, false)
								.addComponent(rdbtnTam, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(rdbtnOgrenci, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
							.addGroup(gl_panel_2.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_panel_2.createSequentialGroup()
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(lblOgrpara, GroupLayout.PREFERRED_SIZE, 57, GroupLayout.PREFERRED_SIZE))
								.addGroup(Alignment.TRAILING, gl_panel_2.createSequentialGroup()
									.addGap(1)
									.addComponent(lblTampara, GroupLayout.PREFERRED_SIZE, 57, GroupLayout.PREFERRED_SIZE)))))
					.addContainerGap(29, Short.MAX_VALUE))
		);
		gl_panel_2.setVerticalGroup(
			gl_panel_2.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_2.createSequentialGroup()
					.addGap(5)
					.addComponent(label)
					.addGap(18)
					.addGroup(gl_panel_2.createParallelGroup(Alignment.BASELINE)
						.addComponent(rdbtnTam)
						.addComponent(lblTampara))
					.addGap(18)
					.addGroup(gl_panel_2.createParallelGroup(Alignment.BASELINE)
						.addComponent(rdbtnOgrenci)
						.addComponent(lblOgrpara))
					.addContainerGap(11, Short.MAX_VALUE))
		);
		panel_2.setLayout(gl_panel_2);
		panel_1.setLayout(gl_panel_1);
		
		frame.getContentPane().setLayout(groupLayout);
	
}


}
