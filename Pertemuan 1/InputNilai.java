import java.util.Scanner;
class InputNilai{
	public static void main(String []args){
	Scanner sc = new Scanner (System.in);
	
		int nilai;
		String nHuruf = " ";
		System.out.println("Program Menghitung Nilai Akhir");
		System.out.println("===============================");


		System.out.print("Input nilai tugas: ");
		int nTugas = sc.nextInt();
		System.out.print("Input nilai UTS\t: ");
		int nUts = sc.nextInt();
		System.out.print("Input nilai UAS\t: ");
		int nUas = sc.nextInt();
		System.out.println("===============================");

		double nAkhir = (0.2*nTugas) + (0.35*nUts) + (0.45*nUas);
	
		if(nAkhir>80 && nAkhir<= 100){
			nHuruf="A";
		}
		else if(nAkhir>73 && nAkhir <=80){
			nHuruf = "B+";
		}
		else if(nAkhir>65 && nAkhir <=73){
			nHuruf = "B";
		}
		else if(nAkhir>60 && nAkhir <=65){
			nHuruf = "C+";	
		}
		else if(nAkhir>50 && nAkhir <=60){
			nHuruf = "C";
		}
		else if(nAkhir>39 && nAkhir <=50){
			nHuruf = "D";
		}
		else if(nAkhir<=39){
		nHuruf = "E";	
		}
		System.out.println("===============================");
		System.out.println("Nilai Akhir : "  + nAkhir);
		//System.out.println();
		System.out.println("Nilai Huruf : " + nHuruf);
		System.out.println("===============================");

		if(nHuruf.equals("D") || nHuruf.equals("E")){
			System.out.println("TIDAK LULUS");
		}else{
			System.out.println("Selamat Anda Lulus");
		}

	}
}