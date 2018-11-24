
package sinema;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.GroupLayout;
import javax.swing.ImageIcon;
import javax.swing.GroupLayout.Alignment;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.CardLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.UIManager;
import javax.swing.border.BevelBorder;
import java.awt.SystemColor;
import javax.swing.border.EmptyBorder;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EtchedBorder;
import java.awt.Font;
import java.awt.Image;

import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import javax.swing.JComboBox;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ayarlar {
	sqlbaglanti baslaAy=sqlbaglanti.instance();
	private JFrame frame;
	private JTextField txtFilmadigir;
    
	String filmadi;
	int salon;
	String seans;
	
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ayarlar window = new ayarlar();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	
	public ayarlar() {
		gorsellik();
	}
	

	private void gorsellik() {
		frame = new JFrame("Film Ekle");
			frame.getContentPane().setBackground(new Color(220, 20, 60));
			frame.setBounds(100, 100, 455, 308);
			frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
			frame.setResizable(false);
		
	
		JLabel lblFilmadilbl = new JLabel("F\u0130LM AD\u0130 : ");
			lblFilmadilbl.setFont(new Font("Arial", Font.BOLD, 14));
		
		txtFilmadigir = new JTextField();
			txtFilmadigir.setColumns(10);
		 
		JLabel lblSalon = new JLabel("SALON :");
			lblSalon.setFont(new Font("Arial", Font.BOLD, 14));
		
		JLabel lblSeans = new JLabel("SEANS :");
			lblSeans.setFont(new Font("Arial", Font.BOLD, 14));
		
		JButton btnFilmkayit = new JButton("K  A  Y  D  E  T");
		btnFilmkayit.setFont(new Font("Arial", Font.BOLD, 14));
	 
		 
		JComboBox comboBox = new JComboBox();
		  	comboBox.addItem("1");
		  	comboBox.addItem("2");
		  	comboBox.addItem("3");
		  	comboBox.addItem("4");
		  	comboBox.addItem("5");
		  	comboBox.addItem("6");
		  	comboBox.addItem("7");
		  	comboBox.addItem("8");
		
		
		JComboBox comboBox_1 = new JComboBox();
	
			comboBox_1.addItem("09:30");
			comboBox_1.addItem("11:30");
			comboBox_1.addItem("13:30");
			comboBox_1.addItem("15:30");
			comboBox_1.addItem("17:30");
			comboBox_1.addItem("19:30");
			comboBox_1.addItem("21:30");
			comboBox_1.addItem("23:30");
			
		
			btnFilmkayit.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					 
				 
					String filmAl=txtFilmadigir.getText(); 
					filmAl=filmAl.toUpperCase(); 
					int salon=Integer.parseInt((String) comboBox.getSelectedItem());
					String seans=(String) comboBox_1.getSelectedItem();
					
					baslaAy.setfilm(filmAl, salon, seans);
					
					System.out.println("buton if e girmeden buraya girdi.");
					
					if(filmAl.length()<2) {
						JOptionPane.showMessageDialog(null, "FİLM ADI BOŞ OLAMAZ!","HATA!",JOptionPane.WARNING_MESSAGE);
					
					}else {
				
                      System.out.println("birinci if ilk satir");

					baslaAy.sqlbaglantisi4();
					
					System.out.println("birinci if ikinci satir");
					
					System.out.println(baslaAy.kontrolSeans);  
					
						
				             System.out.println("ikinci if ilk satir");
							
							baslaAy.sqlbaglantisi2(); 
							baslaAy.sqlbaglantisi5();
							baslaAy.sqlbaglantisi6();
						
							 System.out.println("ikinci if ikinci satir");
							
							txtFilmadigir.setText("");		
						
					}
					
					
				}
			}); 
		
			
			
			
			
		JLabel lblResimlbl = new JLabel("");
		
		Image imgG=new ImageIcon(this.getClass().getResource("/tiyatro.png")).getImage();
		lblResimlbl.setIcon(new ImageIcon(imgG));
		
		
		
		
		//GEREKSİZLER
		
		
		GroupLayout groupLayout = new GroupLayout(frame.getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(44)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(lblFilmadilbl, GroupLayout.PREFERRED_SIZE, 96, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblSalon, GroupLayout.PREFERRED_SIZE, 63, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblSeans, GroupLayout.PREFERRED_SIZE, 63, GroupLayout.PREFERRED_SIZE))
					.addGap(9)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(txtFilmadigir, GroupLayout.PREFERRED_SIZE, 264, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnFilmkayit, GroupLayout.PREFERRED_SIZE, 143, GroupLayout.PREFERRED_SIZE)
						.addGroup(groupLayout.createSequentialGroup()
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addComponent(comboBox_1, GroupLayout.PREFERRED_SIZE, 80, GroupLayout.PREFERRED_SIZE)
								.addComponent(comboBox, GroupLayout.PREFERRED_SIZE, 79, GroupLayout.PREFERRED_SIZE))
							.addGap(26)
							.addComponent(lblResimlbl, GroupLayout.PREFERRED_SIZE, 150, GroupLayout.PREFERRED_SIZE)))
					.addContainerGap(27, Short.MAX_VALUE))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(41)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblFilmadilbl, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE)
						.addComponent(txtFilmadigir, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(29)
							.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblSalon, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE)
								.addComponent(comboBox, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE))
							.addGap(27)
							.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblSeans, GroupLayout.PREFERRED_SIZE, 29, GroupLayout.PREFERRED_SIZE)
								.addComponent(comboBox_1, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE)))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(18)
							.addComponent(lblResimlbl, GroupLayout.PREFERRED_SIZE, 111, GroupLayout.PREFERRED_SIZE)))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(btnFilmkayit, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
					.addGap(30))
		);
		frame.getContentPane().setLayout(groupLayout);
	}
}
