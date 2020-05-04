public class konstruktor {
	    int nilai1, nilai2;
	    
	    void dataAngka (){
	        this.nilai1 = nilai1;
	        this.nilai2 = nilai2;
	    }
	    public static void main ( String [ ] args ){
	        int hasil = 0;
	        konstruktor jumlah = new konstruktor();
	        jumlah.nilai1 = 1;
	        jumlah.nilai2 = 9;
	        
	        hasil = jumlah.nilai1 + jumlah.nilai2;
	        System.out.println(+hasil);
	    }
	}
