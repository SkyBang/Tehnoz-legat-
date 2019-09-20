import java.util.Scanner;

public class Functii2 {
	static float raza;
	final static double PI = 3.14;

	public static void main(String[] args) {
		
		Scanner Dscan =new Scanner(System.in);
		
		System.out.println("Care e diametrul ");
		float diameter = Dscan.nextFloat();
		
		raza= diameter/2;
		
		Scanner RPMscan =new Scanner(System.in);
		
		System.out.println("cate rotatii pe minut ai? ");
		
		float RPM = RPMscan.nextFloat();
		
		float RPS=RPM/60;
		
		double rez=distanta(raza,RPS);
		System.out.println("distanta parcursa este de "+rez+"cm");
				

	}

	static double distanta (float raza,float RPS)
	{
		double rez;
		return  rez=2*PI*raza*RPS;
		
	}
}
