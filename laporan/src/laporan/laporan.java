/**
 * 
 */
package laporan;

import java.awt.geom.Point2D.Float;
import java.nio.FloatBuffer;

/**
 * @author Nur Kasrul
 *
 */
public class laporan {

	/**
	 * @param args
	 */
	static String prak="praktikum percobaan 1";
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(prak);
		biodata();//pemanggilan fungsi
		kali();
		bagi();
		tambah();
		kurang();
		
	}
	public static void biodata(){
		String nama ="Nur Kasrul Andriawan";
		String alamat = "perumahan villa mandiri";
		String kota = "gowa";
		System.out.println("Nama : "+nama +"\nAlamat : "+alamat+"\nkota :"+kota);
	}
	public static void kali(){
		int a=1*5;
		System.out.println("Hasil Kali "+a);
	}
	
	public static void bagi(){
		float a=10/5;
		System.out.println("Hasil Bagi "+a);
	}
	
	public static void tambah(){
		int a=10+5;
		System.out.println("Hasil Penjumlahan "+a);
	}
	
	public static void kurang(){
		int a=20-1;
		System.out.println("Hasil Pengurangan "+a);
	}
	

}
