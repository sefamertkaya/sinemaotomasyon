package sinema;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.GroupLayout;
import javax.swing.ImageIcon;
import javax.swing.GroupLayout.Alignment;
import javax.swing.Icon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.Font;
import java.awt.Image;

import javax.swing.JComboBox;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.SwingUtilities;
import javax.swing.border.BevelBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.UIManager;
import javax.swing.UIManager.LookAndFeelInfo;

import java.awt.SystemColor;
import java.awt.Toolkit;
import java.lang.Exception;
public class giris  { 
 
	private JFrame frame;



sqlbaglanti basla=sqlbaglanti.instance();
	
	public static  void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					giris window = new giris();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		}); 
	}

	
	public giris() {try {


        Class.forName("com.mysql.jdbc.Driver");


        String url = "jdbc:mysql://127.0.0.1:3306/sinema";


        String kullaniciad = "root";


        String sifre = "toor";


        Connection con = null; Statement st = null; ResultSet rs = null;


        con = DriverManager.getConnection(url, kullaniciad, sifre);


        
        Statement adam=con.createStatement();
      
        try {
            for (LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (Exception e) {
            // Eğer nimbus yoksa başka görünümü burda ayarlayacaksın.
        }


        System.out.println("Baglandi");
        frame = new JFrame("SEFA SİNEMA SALONLARI");
		frame.getContentPane().setBackground(SystemColor.inactiveCaptionBorder);
		frame.setBounds(100, 100, 696, 341);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setResizable(false);
		
		
		JPanel panel = new JPanel();
		panel.setBackground(SystemColor.menu);
		panel.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		JComboBox comboBox = new JComboBox();
		comboBox.setFont(new Font("Arial", Font.BOLD, 12));
		JLabel lblResim = new JLabel("");
		Image img=new ImageIcon(this.getClass().getResource("/Cinema-icon.png")).getImage();
		lblResim.setIcon(new ImageIcon(img)); 
		 	
		JButton btnBiletal = new JButton("B  \u0130  L  E  T    A  L");
		btnBiletal.setFont(new Font("Arial", Font.BOLD, 16));
		btnBiletal.setBackground(new Color(0, 255, 0));
		  
		
		btnBiletal.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent arg0) {
						 
						 
							
						String biletAl=(String)comboBox.getSelectedItem();
						basla.setfilmismiAl(biletAl);
						basla.sqlbaglantisi3();
						basla.koltukBaglanti();
					
						
					    sinemasalonu startt=new sinemasalonu();
					
						
						}
							});
		 
		
		
		JButton btnFilmekle = new JButton("F\u0130LM EKLE");
			
		       btnFilmekle.addActionListener(new ActionListener() {
			
		    	   public void actionPerformed(ActionEvent arg0) {
				
				ayarlar ekle=new ayarlar();
				ekle.main(null);
				
				
				
			}
		});
		       
		       
		btnFilmekle.setBackground(new Color(51, 204, 204));
		btnFilmekle.setFont(new Font("Arial", Font.BOLD, 12));
		
		JButton btnFilmKaldir = new JButton("F\u0130LM KALDIR");
		btnFilmKaldir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			
			}
		});
		
		
		btnFilmKaldir.setBackground(new Color(255, 0, 0));
		btnFilmKaldir.setFont(new Font("Arial", Font.BOLD, 12));
			
			
		Image imgRr=new ImageIcon(this.getClass().getResource("/reload-2-icon.png")).getImage();
		JButton btnRefresh = new JButton(new ImageIcon("/reload-2-icon.png"));
		btnRefresh.setIcon(new javax.swing.ImageIcon(getClass().getResource("/reload-2-icon.png")));
		//"C:\\Users\\sefam\\Desktop\\reload-2-icon.png"
		
		btnRefresh.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				

				 
				String sorgu="SELECT filmadi FROM sinema.film";
				ResultSet sonuc2 = null; 
				try {
					sonuc2 = adam.executeQuery(sorgu); 
				} catch (SQLException e) {
					
					e.printStackTrace();
				}
				
				try {
					while(sonuc2.next()) {
						
						comboBox.addItem(sonuc2.getString("filmadi"));
					}
					
				} catch (SQLException e) {
					
					e.printStackTrace();
				}
				 
				
			}
		});
		
		
		
		btnRefresh.setBackground(SystemColor.menu);
		btnRefresh.setFont(new Font("Tahoma", Font.BOLD, 15));
		 
		
		
		 
		
		GroupLayout groupLayout = new GroupLayout(frame.getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(31)
							.addComponent(panel, GroupLayout.PREFERRED_SIZE, 335, GroupLayout.PREFERRED_SIZE))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(41)
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING, false)
								.addComponent(btnBiletal, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addGroup(groupLayout.createSequentialGroup()
									.addComponent(btnFilmekle, GroupLayout.PREFERRED_SIZE, 132, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.UNRELATED)
									.addComponent(btnFilmKaldir, GroupLayout.PREFERRED_SIZE, 132, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.UNRELATED)
									.addComponent(btnRefresh, GroupLayout.PREFERRED_SIZE, 54, GroupLayout.PREFERRED_SIZE)))))
					.addPreferredGap(ComponentPlacement.RELATED, 90, Short.MAX_VALUE)
					.addComponent(lblResim, GroupLayout.PREFERRED_SIZE, 138, GroupLayout.PREFERRED_SIZE)
					.addGap(73))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(37)
							.addComponent(panel, GroupLayout.PREFERRED_SIZE, 70, GroupLayout.PREFERRED_SIZE)
							.addGap(30)
							.addComponent(btnBiletal, GroupLayout.PREFERRED_SIZE, 48, GroupLayout.PREFERRED_SIZE)
							.addGap(30)
							.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING, false)
								.addComponent(btnRefresh, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(btnFilmekle, GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE)
								.addComponent(btnFilmKaldir, GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE)))
						.addGroup(groupLayout.createSequentialGroup()
							.addContainerGap()
							.addComponent(lblResim, GroupLayout.PREFERRED_SIZE, 249, GroupLayout.PREFERRED_SIZE)))
					.addContainerGap(44, Short.MAX_VALUE))
		);
		
		JLabel lblFilmsec = new JLabel("F\u0130LMLER : ");
		lblFilmsec.setFont(new Font("Arial", Font.BOLD, 13));
		
	
		
		String sorgu="SELECT filmadi FROM sinema.film";
		ResultSet sonuc = adam.executeQuery(sorgu);
		
		while(sonuc.next()) {
			
			comboBox.addItem(sonuc.getString("filmadi"));
			
			
		}
		
		
		
		
		
		
		
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addGap(21)
					.addComponent(lblFilmsec, GroupLayout.PREFERRED_SIZE, 79, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(comboBox, GroupLayout.PREFERRED_SIZE, 208, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(17, Short.MAX_VALUE))
		);
		gl_panel.setVerticalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addGap(27)
					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblFilmsec)
						.addComponent(comboBox, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addContainerGap(16, Short.MAX_VALUE))
		);
		panel.setLayout(gl_panel);
		frame.getContentPane().setLayout(groupLayout);
	
	}	  catch (ClassNotFoundException ex) {


	        ex.printStackTrace();        


	       System.out.println("Sürücü projeye eklenmemiş!");


	    } catch (SQLException ex) {


	        ex.printStackTrace();


	      System.out.println("Veritabanına bağlantı sağlanamadı!");


	    }
	}
}
