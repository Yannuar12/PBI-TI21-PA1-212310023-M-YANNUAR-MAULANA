import java.util.Scanner;

public class Latihan_03 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String jwb;
		
		System.out.print("Masukkan Nomor : ");
		jwb = input.nextLine();
		
		createNoRegis(jwb);
	}
	
	static void createNoRegis(String paramJWB) {
		System.out.print("No Register : IBIK");
		
		for (int i = paramJWB.length(); i < 5; i++) {
			System.out.print(0);
		}
		
		System.out.println(paramJWB);
	}
}