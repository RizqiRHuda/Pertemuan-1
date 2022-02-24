public class KataTerbalik{
    public static void main(String[] args){
        System.out.println("Kata sebelum ditampilkan secara terbalik : ");
    
        char[] nama={'S', 'E', 'L', 'A', 'M', 'A', 'T'};
        for(int a=0; a<nama.length; a++){
            System.out.print(nama [a] + " ");
        }
        
        System.out.println(" ");
        System.out.println("Kata sesudah dibalik : ");

        for(int i=nama.length-1; i>=0; i--){
            System.out.print(nama [i] + " ");
        }
    }
}