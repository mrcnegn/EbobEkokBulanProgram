import java.util.Scanner; 
public class ebobekokbulanprogram {

	public static void main(String[] args) {
		
		    Scanner input =new Scanner(System.in);
		    int ebob=0,i=1;
		    System.out.print("birinci sayýyý giriniz: ");
		    int a =input.nextInt();
		    System.out.print("ikinci sayýyý giriniz: ");
		    int b =input.nextInt();

		    while(i<=(a*b)){
		       i++;
		      if(a%i==0 && b%i==0){
		        ebob = i;
		       
		    }

		    }System.out.println(ebob);
		    int ekok=(a*b)/ebob;
		    System.out.print(ekok);
		  }
		}
		

	