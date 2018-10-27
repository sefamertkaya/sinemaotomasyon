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

public class sinemasalonu   {
    
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
		
		JToggleButton toggleButton_7 = new JToggleButton("2");
		toggleButton_7.setBackground(Color.WHITE);
		toggleButton_7.addItemListener(new ItemListener() {
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
		
		JToggleButton toggleButton_8 = new JToggleButton("3");
		toggleButton_8.setBackground(Color.WHITE);
		toggleButton_8.addItemListener(new ItemListener() {
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
		
		JToggleButton toggleButton_9 = new JToggleButton("4");
		toggleButton_9.setBackground(Color.WHITE);
		toggleButton_9.addItemListener(new ItemListener() {
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
		
		JToggleButton toggleButton_10 = new JToggleButton("5");
		toggleButton_10.setBackground(Color.WHITE);
		toggleButton_10.addItemListener(new ItemListener() {
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
		
		JToggleButton toggleButton_11 = new JToggleButton("6");
		toggleButton_11.setBackground(Color.WHITE);
		toggleButton_11.addItemListener(new ItemListener() {
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
		
		JToggleButton toggleButton_12 = new JToggleButton("7");
		toggleButton_12.setBackground(Color.WHITE);
		toggleButton_12.addItemListener(new ItemListener() {
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
		
		JToggleButton toggleButton_13 = new JToggleButton("8");
		toggleButton_13.setBackground(Color.WHITE);
		toggleButton_13.addItemListener(new ItemListener() {
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
		
		JToggleButton toggleButton_14 = new JToggleButton("1");
		toggleButton_14.setBackground(Color.WHITE);
		toggleButton_14.addItemListener(new ItemListener() {
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
		
		JToggleButton toggleButton_15 = new JToggleButton("2");
		toggleButton_15.setBackground(Color.WHITE);
		toggleButton_15.addItemListener(new ItemListener() {
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
		
		JToggleButton toggleButton_16 = new JToggleButton("3");
		toggleButton_16.setBackground(Color.WHITE);
		toggleButton_16.addItemListener(new ItemListener() {
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
		
		JToggleButton toggleButton_17 = new JToggleButton("4");
		toggleButton_17.setBackground(Color.WHITE);
		toggleButton_17.addItemListener(new ItemListener() {
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
		
		JToggleButton toggleButton_18 = new JToggleButton("5");
		toggleButton_18.setBackground(Color.WHITE);
		toggleButton_18.addItemListener(new ItemListener() {
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
		
		JToggleButton toggleButton_19 = new JToggleButton("6");
		toggleButton_19.setBackground(Color.WHITE);
		toggleButton_19.addItemListener(new ItemListener() {
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
		
		JToggleButton toggleButton_20 = new JToggleButton("7");
		toggleButton_20.setBackground(Color.WHITE);
		toggleButton_20.addItemListener(new ItemListener() {
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
		
		JToggleButton toggleButton_21 = new JToggleButton("8");
		toggleButton_21.setBackground(Color.WHITE);
		toggleButton_21.addItemListener(new ItemListener() {
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
		
		JToggleButton toggleButton_22 = new JToggleButton("1");
		toggleButton_22.setBackground(Color.WHITE);
		toggleButton_22.addItemListener(new ItemListener() {
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
		
		JToggleButton toggleButton_23 = new JToggleButton("2");
		toggleButton_23.setBackground(Color.WHITE);
		toggleButton_23.addItemListener(new ItemListener() {
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
		
		JToggleButton toggleButton_24 = new JToggleButton("3");
		toggleButton_24.setBackground(Color.WHITE);
		toggleButton_24.addItemListener(new ItemListener() {
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
		
		JToggleButton toggleButton_25 = new JToggleButton("4");
		toggleButton_25.setBackground(Color.WHITE);
		toggleButton_25.addItemListener(new ItemListener() {
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
		
		JToggleButton toggleButton_26 = new JToggleButton("5");
		toggleButton_26.setBackground(Color.WHITE);
		toggleButton_26.addItemListener(new ItemListener() {
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
		
		JToggleButton toggleButton_27 = new JToggleButton("6");
		toggleButton_27.setBackground(Color.WHITE);
		toggleButton_27.addItemListener(new ItemListener() {
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
		
		JToggleButton toggleButton_28 = new JToggleButton("7");
		toggleButton_28.setBackground(Color.WHITE);
		toggleButton_28.addItemListener(new ItemListener() {
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
		
		JToggleButton toggleButton_29 = new JToggleButton("8");
		toggleButton_29.setBackground(Color.WHITE);
		toggleButton_29.addItemListener(new ItemListener() {
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
		
		JToggleButton toggleButton_30 = new JToggleButton("1");
		toggleButton_30.setBackground(Color.WHITE);
		toggleButton_30.addItemListener(new ItemListener() {
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
		
		JToggleButton toggleButton_31 = new JToggleButton("2");
		toggleButton_31.setBackground(Color.WHITE);
		toggleButton_31.addItemListener(new ItemListener() {
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
		
		JToggleButton toggleButton_32 = new JToggleButton("3");
		toggleButton_32.setBackground(Color.WHITE);
		toggleButton_32.addItemListener(new ItemListener() {
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
		
		JToggleButton toggleButton_33 = new JToggleButton("4");
		toggleButton_33.setBackground(Color.WHITE);
		toggleButton_33.addItemListener(new ItemListener() {
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
		
		JToggleButton toggleButton_34 = new JToggleButton("5");
		toggleButton_34.setBackground(Color.WHITE);
		toggleButton_34.addItemListener(new ItemListener() {
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
		
		JToggleButton toggleButton_35 = new JToggleButton("6");
		toggleButton_35.setBackground(Color.WHITE);
		toggleButton_35.addItemListener(new ItemListener() {
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
		
		JToggleButton toggleButton_36 = new JToggleButton("7");
		toggleButton_36.setBackground(Color.WHITE);
		toggleButton_36.addItemListener(new ItemListener() {
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
		
		JToggleButton toggleButton_37 = new JToggleButton("8");
		toggleButton_37.setBackground(Color.WHITE);
		toggleButton_37.addItemListener(new ItemListener() {
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
		
		JToggleButton toggleButton_38 = new JToggleButton("1");
		toggleButton_38.setBackground(Color.WHITE);
		toggleButton_38.addItemListener(new ItemListener() {
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
		
		JToggleButton toggleButton_39 = new JToggleButton("2");
		toggleButton_39.setBackground(Color.WHITE);
		toggleButton_39.addItemListener(new ItemListener() {
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
		
		JToggleButton toggleButton_40 = new JToggleButton("3");
		toggleButton_40.setBackground(Color.WHITE);
		toggleButton_40.addItemListener(new ItemListener() {
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
		
		JToggleButton toggleButton_41 = new JToggleButton("4");
		toggleButton_41.setBackground(Color.WHITE);
		toggleButton_41.addItemListener(new ItemListener() {
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
		
		JToggleButton toggleButton_42 = new JToggleButton("5");
		toggleButton_42.setBackground(Color.WHITE);
		toggleButton_42.addItemListener(new ItemListener() {
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
		
		JToggleButton toggleButton_43 = new JToggleButton("6");
		toggleButton_43.setBackground(Color.WHITE);
		toggleButton_43.addItemListener(new ItemListener() {
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
		
		JToggleButton toggleButton_44 = new JToggleButton("7");
		toggleButton_44.setBackground(Color.WHITE);
		toggleButton_44.addItemListener(new ItemListener() {
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
		
		JToggleButton toggleButton_45 = new JToggleButton("8");
		toggleButton_45.setBackground(Color.WHITE);
		toggleButton_45.addItemListener(new ItemListener() {
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
		
		JToggleButton toggleButton_46 = new JToggleButton("1");
		toggleButton_46.setBackground(Color.WHITE);
		toggleButton_46.addItemListener(new ItemListener() {
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
							.addComponent(toggleButton_14, GroupLayout.PREFERRED_SIZE, 49, GroupLayout.PREFERRED_SIZE)
							.addGap(6)
							.addComponent(toggleButton_7, GroupLayout.PREFERRED_SIZE, 49, GroupLayout.PREFERRED_SIZE)
							.addGap(6)
							.addComponent(toggleButton_8, GroupLayout.PREFERRED_SIZE, 49, GroupLayout.PREFERRED_SIZE)
							.addGap(6)
							.addComponent(toggleButton_9, GroupLayout.PREFERRED_SIZE, 49, GroupLayout.PREFERRED_SIZE)
							.addGap(6)
							.addComponent(toggleButton_10, GroupLayout.PREFERRED_SIZE, 49, GroupLayout.PREFERRED_SIZE)
							.addGap(6)
							.addComponent(toggleButton_11, GroupLayout.PREFERRED_SIZE, 49, GroupLayout.PREFERRED_SIZE)
							.addGap(6)
							.addComponent(toggleButton_12, GroupLayout.PREFERRED_SIZE, 49, GroupLayout.PREFERRED_SIZE)
							.addGap(6)
							.addComponent(toggleButton_13, GroupLayout.PREFERRED_SIZE, 49, GroupLayout.PREFERRED_SIZE))
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(lblC, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(toggleButton_22, GroupLayout.PREFERRED_SIZE, 49, GroupLayout.PREFERRED_SIZE)
							.addGap(6)
							.addComponent(toggleButton_15, GroupLayout.PREFERRED_SIZE, 49, GroupLayout.PREFERRED_SIZE)
							.addGap(6)
							.addComponent(toggleButton_16, GroupLayout.PREFERRED_SIZE, 49, GroupLayout.PREFERRED_SIZE)
							.addGap(6)
							.addComponent(toggleButton_17, GroupLayout.PREFERRED_SIZE, 49, GroupLayout.PREFERRED_SIZE)
							.addGap(6)
							.addComponent(toggleButton_18, GroupLayout.PREFERRED_SIZE, 49, GroupLayout.PREFERRED_SIZE)
							.addGap(6)
							.addComponent(toggleButton_19, GroupLayout.PREFERRED_SIZE, 49, GroupLayout.PREFERRED_SIZE)
							.addGap(6)
							.addComponent(toggleButton_20, GroupLayout.PREFERRED_SIZE, 49, GroupLayout.PREFERRED_SIZE)
							.addGap(6)
							.addComponent(toggleButton_21, GroupLayout.PREFERRED_SIZE, 49, GroupLayout.PREFERRED_SIZE))
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(lblD, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(toggleButton_30, GroupLayout.PREFERRED_SIZE, 49, GroupLayout.PREFERRED_SIZE)
							.addGap(6)
							.addComponent(toggleButton_23, GroupLayout.PREFERRED_SIZE, 49, GroupLayout.PREFERRED_SIZE)
							.addGap(6)
							.addComponent(toggleButton_24, GroupLayout.PREFERRED_SIZE, 49, GroupLayout.PREFERRED_SIZE)
							.addGap(6)
							.addComponent(toggleButton_25, GroupLayout.PREFERRED_SIZE, 49, GroupLayout.PREFERRED_SIZE)
							.addGap(6)
							.addComponent(toggleButton_26, GroupLayout.PREFERRED_SIZE, 49, GroupLayout.PREFERRED_SIZE)
							.addGap(6)
							.addComponent(toggleButton_27, GroupLayout.PREFERRED_SIZE, 49, GroupLayout.PREFERRED_SIZE)
							.addGap(6)
							.addComponent(toggleButton_28, GroupLayout.PREFERRED_SIZE, 49, GroupLayout.PREFERRED_SIZE)
							.addGap(6)
							.addComponent(toggleButton_29, GroupLayout.PREFERRED_SIZE, 49, GroupLayout.PREFERRED_SIZE))
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(lblE, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(toggleButton_38, GroupLayout.PREFERRED_SIZE, 49, GroupLayout.PREFERRED_SIZE)
							.addGap(6)
							.addComponent(toggleButton_31, GroupLayout.PREFERRED_SIZE, 49, GroupLayout.PREFERRED_SIZE)
							.addGap(6)
							.addComponent(toggleButton_32, GroupLayout.PREFERRED_SIZE, 49, GroupLayout.PREFERRED_SIZE)
							.addGap(6)
							.addComponent(toggleButton_33, GroupLayout.PREFERRED_SIZE, 49, GroupLayout.PREFERRED_SIZE)
							.addGap(6)
							.addComponent(toggleButton_34, GroupLayout.PREFERRED_SIZE, 49, GroupLayout.PREFERRED_SIZE)
							.addGap(6)
							.addComponent(toggleButton_35, GroupLayout.PREFERRED_SIZE, 49, GroupLayout.PREFERRED_SIZE)
							.addGap(6)
							.addComponent(toggleButton_36, GroupLayout.PREFERRED_SIZE, 49, GroupLayout.PREFERRED_SIZE)
							.addGap(6)
							.addComponent(toggleButton_37, GroupLayout.PREFERRED_SIZE, 49, GroupLayout.PREFERRED_SIZE))
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(lblF, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(toggleButton_46, GroupLayout.PREFERRED_SIZE, 49, GroupLayout.PREFERRED_SIZE)
							.addGap(6)
							.addComponent(toggleButton_39, GroupLayout.PREFERRED_SIZE, 49, GroupLayout.PREFERRED_SIZE)
							.addGap(6)
							.addComponent(toggleButton_40, GroupLayout.PREFERRED_SIZE, 49, GroupLayout.PREFERRED_SIZE)
							.addGap(6)
							.addComponent(toggleButton_41, GroupLayout.PREFERRED_SIZE, 49, GroupLayout.PREFERRED_SIZE)
							.addGap(6)
							.addComponent(toggleButton_42, GroupLayout.PREFERRED_SIZE, 49, GroupLayout.PREFERRED_SIZE)
							.addGap(6)
							.addComponent(toggleButton_43, GroupLayout.PREFERRED_SIZE, 49, GroupLayout.PREFERRED_SIZE)
							.addGap(6)
							.addComponent(toggleButton_44, GroupLayout.PREFERRED_SIZE, 49, GroupLayout.PREFERRED_SIZE)
							.addGap(6)
							.addComponent(toggleButton_45, GroupLayout.PREFERRED_SIZE, 49, GroupLayout.PREFERRED_SIZE))
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
								.addComponent(toggleButton_14, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE)
								.addComponent(toggleButton_7, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE)
								.addComponent(toggleButton_8, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE)
								.addComponent(toggleButton_9, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE)
								.addComponent(toggleButton_10, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE)
								.addComponent(toggleButton_11, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE)
								.addComponent(toggleButton_12, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE)
								.addComponent(toggleButton_13, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE))
							.addGap(31)
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addComponent(lblC, GroupLayout.PREFERRED_SIZE, 21, GroupLayout.PREFERRED_SIZE)
								.addComponent(toggleButton_22, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE)
								.addComponent(toggleButton_15, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE)
								.addComponent(toggleButton_16, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE)
								.addComponent(toggleButton_17, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE)
								.addComponent(toggleButton_18, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE)
								.addComponent(toggleButton_19, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE)
								.addComponent(toggleButton_20, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE)
								.addComponent(toggleButton_21, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE))
							.addGap(28)
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addComponent(lblD, GroupLayout.PREFERRED_SIZE, 21, GroupLayout.PREFERRED_SIZE)
								.addComponent(toggleButton_30, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE)
								.addComponent(toggleButton_23, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE)
								.addComponent(toggleButton_24, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE)
								.addComponent(toggleButton_25, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE)
								.addComponent(toggleButton_26, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE)
								.addComponent(toggleButton_27, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE)
								.addComponent(toggleButton_28, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE)
								.addComponent(toggleButton_29, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE))
							.addGap(29)
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addComponent(lblE, GroupLayout.PREFERRED_SIZE, 21, GroupLayout.PREFERRED_SIZE)
								.addComponent(toggleButton_38, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE)
								.addComponent(toggleButton_31, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE)
								.addComponent(toggleButton_32, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE)
								.addComponent(toggleButton_33, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE)
								.addComponent(toggleButton_34, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE)
								.addComponent(toggleButton_35, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE)
								.addComponent(toggleButton_36, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE)
								.addComponent(toggleButton_37, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE))
							.addGap(28)
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
									.addComponent(toggleButton_46, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE)
									.addComponent(lblF, GroupLayout.PREFERRED_SIZE, 21, GroupLayout.PREFERRED_SIZE))
								.addComponent(toggleButton_39, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE)
								.addComponent(toggleButton_40, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE)
								.addComponent(toggleButton_41, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE)
								.addComponent(toggleButton_42, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE)
								.addComponent(toggleButton_43, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE)
								.addComponent(toggleButton_44, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE)
								.addComponent(toggleButton_45, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE))
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
