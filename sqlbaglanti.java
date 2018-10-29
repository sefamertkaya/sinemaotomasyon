package sinema;

import java.sql.*;


import com.mysql.*;

public class sqlbaglanti {
	
	
	
	

	String isim;
	String soyisim;
	String filmadi;
	int salon;
	String seans;
	int ucret;
	String koltuk;
	
	
	String eklefilm;
	int eklesalon;
	String ekleseans;
	
	int alSalon;
	String alSeans;
	String kontrolSeans;
	
	public String filmismi;
	
	private static sqlbaglanti instance=null;	
	
	private static Object lock=new Object();
	
	private sqlbaglanti() {
		System.out.println("singletion init()");
		
	}
				
	public static sqlbaglanti instance() {
		if(instance==null) {
			
			synchronized (lock) {
			if(instance==null)
				{
						instance=new sqlbaglanti();
				
				}
			}
			
		}
		
		
		return instance;
	}
				
	
	public void printThis() {
		
		System.out.println(this);
	}
				
	
	
	public void setisim (String isim,String soyisim,String filmadi,int salon,String seans,int ucret,String koltuk) {
		
		this.isim=isim;
		this.soyisim=soyisim;
		this.filmadi=filmadi;
		this.salon=salon;
		this.seans=seans;
		this.ucret=ucret;
		this.koltuk=koltuk;
		sqlbaglantisi();
		
	}
	
	public void setfilm(String eklefilm,int eklesalon,String ekleseans ) {
		
		this.eklefilm=eklefilm;
		this.eklesalon=eklesalon;
		this.ekleseans=ekleseans;
		
	
		
		
	}

	
	public void calistir() {
		
		this.sqlbaglantisi2();
	}
	
	
	public void getFilm(int salon,String seans) {
		
		
		
	}
	
	
	
	
	
	
	
	public void setfilmismiAl(String filmismiAl) {
		this.filmismi=filmismiAl;
			System.out.println(filmismi);
	}
	
	
	public String filmismiVer() {
		System.out.println(filmismi);
		return filmismi;
		
		
		
	}
	
	void sqlbaglantisi4() {
		
		try {


	        Class.forName("com.mysql.jdbc.Driver");


	        String url = "jdbc:mysql://127.0.0.1:3306/sinema";


	        String kullaniciad = "root";


	        String sifre = "toor";


	        Connection con = null; Statement st = null; ResultSet rs = null;


	        con = DriverManager.getConnection(url, kullaniciad, sifre);


	        
	        Statement durum=con.createStatement();
		      System.out.println("Baglandi");
		      String sorgu="SELECT seans FROM sinema.filmekleme WHERE salon="+eklesalon;
		      ResultSet sonucSorgu=durum.executeQuery(sorgu);
			   while(sonucSorgu.next()) {
			   kontrolSeans=sonucSorgu.getString(1);
			   
			   }
			   sonucSorgu.close(); 
	        
}	
		
		catch (ClassNotFoundException ex) {


		        ex.printStackTrace();        


		       System.out.println("Sürücü projeye eklenmemiş!");


		    } catch (SQLException ex) {


		        ex.printStackTrace();


		      System.out.println("Veritabanına bağlantı sağlanamadı!");

		      

		    }
		
	}
	
	
	
	void sqlbaglantisi3() {
		try {


	        Class.forName("com.mysql.jdbc.Driver");


	        String url = "jdbc:mysql://127.0.0.1:3306/sinema";


	        String kullaniciad = "root";


	        String sifre = "toor";


	        Connection con = null; Statement st = null; ResultSet rs = null;


	        con = DriverManager.getConnection(url, kullaniciad, sifre);


	        
	        Statement stc=con.createStatement();
            Statement stc2=con.createStatement();
 

	        System.out.println("Baglandi");
	        
		
		String sorgu1="SELECT salon FROM sinema.filmekleme WHERE filmadi="+"'"+filmismi+"'";
	    ResultSet sonuc1=stc.executeQuery(sorgu1);
	   while(sonuc1.next()) {
	   alSalon=sonuc1.getInt(1);
	   }
	   sonuc1.close(); 
	   String sorgu2="SELECT seans FROM sinema.filmekleme WHERE filmadi="+"'"+filmismi+"'";
	    
	    ResultSet sonuc2=stc2.executeQuery(sorgu2);

	    while(sonuc2.next()) {
		 alSeans=sonuc2.getString(1);
	    }
	    sonuc2.close();
		}	
		
		catch (ClassNotFoundException ex) {


		        ex.printStackTrace();        


		       System.out.println("Sürücü projeye eklenmemiş!");


		    } catch (SQLException ex) {


		        ex.printStackTrace();


		      System.out.println("Veritabanına bağlantı sağlanamadı!");


		    }

		
		
	}
	
	
	void sqlbaglantisi2() {
		

		try {


	        Class.forName("com.mysql.jdbc.Driver");


	        String url = "jdbc:mysql://127.0.0.1:3306/sinema";


	        String kullaniciad = "root";


	        String sifre = "toor";


	        Connection con = null; Statement st = null; ResultSet rs = null;


	        con = DriverManager.getConnection(url, kullaniciad, sifre);


	        
	        Statement st1=con.createStatement();
	        
 

	        System.out.println("Baglandi");
	       
	        try {
	        	
    			String sql2="INSERT INTO filmekleme VALUES (?,?,?,?)";
          
    			PreparedStatement pst=con.prepareStatement(sql2);
	            pst.setString(1, null);
    			pst.setString(2, eklefilm);
    			pst.setInt(3, eklesalon);
    			pst.setString(4, ekleseans);
    			pst.executeUpdate();
    			
    			
    } catch (SQLException e1) {
	
		e1.printStackTrace(); 
	} 	
	    
	    	
	    	
		}	  catch (ClassNotFoundException ex) {


	        ex.printStackTrace();        


	       System.out.println("Sürücü projeye eklenmemiş!");


	    } catch (SQLException ex) {


	        ex.printStackTrace();


	      System.out.println("Veritabanına bağlantı sağlanamadı!");


	    }

	 
		
	}
	
	
	
	
	
	
	void sqlbaglantisi() {
	
		try {


	        Class.forName("com.mysql.jdbc.Driver");


	        String url = "jdbc:mysql://127.0.0.1:3306/sinema";


	        String kullaniciad = "root";


	        String sifre = "toor";


	        Connection con = null; Statement st = null; ResultSet rs = null;


	        con = DriverManager.getConnection(url, kullaniciad, sifre);


	        
	        Statement st1=con.createStatement();
	        Statement st2=con.createStatement();
 

	        System.out.println("Baglandi");
	        try {
	        			String sql1="INSERT INTO snm VALUES (?,?,?,?,?,?,?,?)";
	    
	        			PreparedStatement pst=con.prepareStatement(sql1);
	    	            pst.setString(1, null);
	        			pst.setString(2, isim);
	        			pst.setString(3, soyisim);
	        			pst.setString(4, filmadi);
	        			pst.setInt(5,salon);
	        			pst.setString(6, seans);
	        			pst.setInt(7, ucret);
	        			pst.setString(8, koltuk);
	        			pst.executeUpdate();
	        } catch (SQLException e1) {
			
				e1.printStackTrace(); 
			} 
	        			
	    
	    	
	    	
		}	  catch (ClassNotFoundException ex) {


	        ex.printStackTrace();        


	       System.out.println("Sürücü projeye eklenmemiş!");


	    } catch (SQLException ex) {


	        ex.printStackTrace();


	      System.out.println("Veritabanına bağlantı sağlanamadı!");


	    }

	 
}
	
	
	
}
