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
	int idfilm;
	int idfilmkoltuk;
	int filmno;
	String eklefilm;
	int eklesalon;
	String ekleseans;
	
	int alSalon;
	String alSeans;
	String kontrolSeans;
	
	public String filmismi;
	public int filmid=0;
	
	public String [] oturak;
	
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


	        String url = "jdbc:mysql://127.0.0.1:/sinema";


	        String kullaniciad = "root";


	        String sifre = "";


	        Connection con = null; Statement st = null; ResultSet rs = null;


	        con = DriverManager.getConnection(url, kullaniciad, sifre);


	        
	        Statement durum=con.createStatement();
		     
		      String sorgu="SELECT seans FROM sinema.filmdurumu WHERE salon="+eklesalon;
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


        String url = "jdbc:mysql://127.0.0.1:/sinema";


        String kullaniciad = "root";


        String sifre = "";


        Connection con = null; Statement st = null; ResultSet rs = null;


        con = DriverManager.getConnection(url, kullaniciad, sifre);


        
        Statement stc=con.createStatement();
        Statement stc2=con.createStatement();
        Statement idogren=con.createStatement();

        System.out.println("Baglandi");
        
        
       String sorgu0="SELECT idfilm FROM sinema.film WHERE filmadi="+"'"+filmismi+"'";
	ResultSet sonuc0=idogren.executeQuery(sorgu0);
	while(sonuc0.next()) {
		idfilm=sonuc0.getInt(1);
	}
       
	String sorgu1="SELECT salon FROM sinema.filmdurumu WHERE filmid="+"'"+idfilm+"'";
    ResultSet sonuc1=stc.executeQuery(sorgu1);
   while(sonuc1.next()) {
   alSalon=sonuc1.getInt(1);
   }
   sonuc1.close(); 
   String sorgu2="SELECT seans FROM sinema.filmdurumu WHERE filmid="+"'"+idfilm+"'";
    
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


        String url = "jdbc:mysql://127.0.0.1:/sinema";


        String kullaniciad = "root";


        String sifre = "";


        Connection con = null; Statement st = null; ResultSet rs = null;


        con = DriverManager.getConnection(url, kullaniciad, sifre);


        
        Statement st1=con.createStatement();
        


        System.out.println("Baglandi");
        
        try {
        	
			String sql2="INSERT INTO sinema.film VALUES (?,?)";
        
			PreparedStatement pst=con.prepareStatement(sql2);
            pst.setString(1, null);
			pst.setString(2, eklefilm);
			pst.execute();
			 
			
		
		
			
			pst.close();
			
			
			
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
	
void sqlbaglantisi5() {
	
	try {


    Class.forName("com.mysql.jdbc.Driver");


    String url = "jdbc:mysql://127.0.0.1:/sinema";


    String kullaniciad = "root";


    String sifre = "";


    Connection con = null; Statement st = null; ResultSet rs = null;


    con = DriverManager.getConnection(url, kullaniciad, sifre);


    
    Statement st1=con.createStatement();
    


    System.out.println("Baglandi");
    
	String sql3="SELECT idfilm FROM sinema.film WHERE filmadi="+"'"+eklefilm+"'";
	ResultSet son=st1.executeQuery(sql3);
	while(son.next()) {
	
		filmid=son.getInt(1);
		System.out.println("film idisi bu "+filmid);
	}
	son.close();

    
    
  	
		}	  catch (ClassNotFoundException ex) {


	        ex.printStackTrace();        


	       System.out.println("Sürücü projeye eklenmemiş!");


	    } catch (SQLException ex) {


	        ex.printStackTrace();


	      System.out.println("Veritabanına bağlantı sağlanamadı!");


	    }
}
void sqlbaglantisi6() {
	try {


        Class.forName("com.mysql.jdbc.Driver");


        String url = "jdbc:mysql://127.0.0.1:/sinema";


        String kullaniciad = "root";


        String sifre = "";


        Connection con = null; Statement st = null; ResultSet rs = null;


        con = DriverManager.getConnection(url, kullaniciad, sifre);


        
        Statement st1=con.createStatement();
        


        System.out.println("Baglandi");
        
        
    	String sql4="INSERT INTO sinema.filmdurumu VALUES(?,?,?)";
		PreparedStatement pst2=con.prepareStatement(sql4);
		System.out.println("geldik mi buraya");
		pst2.setInt(1, filmid);
		pst2.setString(2, ekleseans);
		pst2.setInt(3, eklesalon); 
		
		pst2.executeUpdate();
		pst2.close();
        

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


        String url = "jdbc:mysql://127.0.0.1:/sinema";


        String kullaniciad = "root";


        String sifre = "";


        Connection con = null; Statement st = null; ResultSet rs = null;


        con = DriverManager.getConnection(url, kullaniciad, sifre);


        
        Statement st1=con.createStatement();
        Statement st2=con.createStatement();


        System.out.println("Baglandi");
        try {
        			String sql1="INSERT INTO sinema.kisi VALUES (?,?,?,?)";
    
        			PreparedStatement pst=con.prepareStatement(sql1);
    	            pst.setString(1, null);
        			pst.setString(2, isim);
        			pst.setString(3, soyisim);
        			pst.setInt(4, ucret);
        			pst.executeUpdate();
        			
        			String sql2="SELECT idfilm FROM sinema.film WHERE filmadi="+"'"+filmadi+"'";
        			
        			ResultSet sonucsorgu=st1.executeQuery(sql2);
        			while(sonucsorgu.next()) {
        				filmno=sonucsorgu.getInt(1);
        				
        			}
        			
        			String sql3="INSERT INTO sinema.bilet VALUES(?,?,?,?,?)";
        			
        			PreparedStatement pst2=con.prepareStatement(sql3);
        			pst2.setString(1, null);
        			pst2.setInt(2, filmno);
        			pst2.setString(3,seans);
        			pst2.setInt(4, salon);
        			pst2.setString(5, koltuk);
        			pst2.executeUpdate();
        			
        			
        			
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


void koltukBaglanti() {
	
	
	try {


        Class.forName("com.mysql.jdbc.Driver");


        String url = "jdbc:mysql://127.0.0.1:/sinema";


        String kullaniciad = "root";


        String sifre = "";


        Connection con = null; Statement st = null; ResultSet rs = null;


        con = DriverManager.getConnection(url, kullaniciad, sifre);


        
        
       
        Statement st2=con.createStatement();
        Statement st1=con.createStatement();
        

      


        System.out.println("Baglandi");
        
        
        String sorgu0="SELECT idfilm FROM sinema.film WHERE filmadi="+"'"+filmismi+"'";
		ResultSet sonuc0=st1.executeQuery(sorgu0);
		while(sonuc0.next()) {
			idfilmkoltuk=sonuc0.getInt(1);
			System.out.println("buraya girdi id: "+idfilmkoltuk);
		}
		sonuc0.close();
		
		int index=0;
		  String sqle ="select count(*)from sinema.bilet"; 
          ResultSet sonuce=st1.executeQuery(sqle);
	      
          while(sonuce.next()) {
        index = sonuce.getInt(1);
         System.out.println(index);
	      }
	      sonuce.close();
		
	      oturak=new String[index];
	      
	      		String sorgu1="SELECT koltuk FROM sinema.bilet WHERE idfilm="+"'"+idfilmkoltuk+"'";
	      		ResultSet sonuc1=st2.executeQuery(sorgu1);
	      		int i=0;
		
	      while(sonuc1.next()) {
		
			String kltk=sonuc1.getString("koltuk");
			
			oturak[i]=kltk;
			i++;
	
			
			
		}
		sonuc1.close();
	
		
	}catch (ClassNotFoundException ex) {


        ex.printStackTrace();        


       System.out.println("Sürücü projeye eklenmemiş!");


    } catch (SQLException ex) {


        ex.printStackTrace();


      System.out.println("Veritabanına bağlantı sağlanamadı!");


    }




    }






}
