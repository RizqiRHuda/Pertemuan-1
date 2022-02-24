public class BilanganGanjil{
	public static void main (String []args){
	    
    System.out.print("Menampilkan deretan bilangan ganjil dari angka 1 sampai 20, kecuali 11 & 17 : ");
    	for(int i=1; i<20; i++){
    	if(i%2!=0){
    	    if(i!=11 && i!=17){
                System.out.print(" " + i);
    	    }
    	}
    	}
	}
}