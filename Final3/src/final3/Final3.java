/* Bu programda private,public ve protect olayını analamk için yeni class oluşturup ekrana 
yazılanlara baktık 
 */

package final3;

 
class Kapsul{
		
		private int x = 10; //private olduğu için sadece bur classda çalışır
		public String s = "Kod5 Java Eğitimi"; //herkese açık String bir s değişkeni 
		protected double y = 3.14; //protected double türünde y değişkeni tanımaldım
		
		private void kod5(){ //private metot yazdırdık sadece bu classda çalışır
			
			System.out.println("Furkan Can"); //ekranda yazmıcaktır
		}
		
		public Kapsul(){ //public metot yazdırdık herkese açıktır
			
			System.out.println("Yapılandırıcı metot çalıştı.");
		}
	}
 
public class Final3 {
 
	public static void main(String[] args) {
		
		Kapsul nesne = new Kapsul(); //kapsul sınıfından nesne oluşturdum
		
		System.out.println(nesne.s); //ekrana yazdırma
		//System.out.println(nesne.x); // Bu satır hata verecektir.
		System.out.println(nesne.y);//ekrana yazdırma
		
		//nesne.kod5(); // Bu satır hata verecektir.*/
	}
}