public class Checker{
	public static void main(String[] args){
		int len = 10;
		int width = 8;
		
		
		for (int i = 0; i <= width; i++){
			if (i % 2 == 0){                       //Not really an important line of code
				System.out.print("* ");
			}
			else{
				System.out.print(" ");
			}
			
			for (int star = 0; star <= len; star++){
				if(star % 2 == 0){               //Not really an important line of code
					System.out.print(" ");
				}
				else if (star != len || i % 2 != 0){
					System.out.print("* ");
				}
			}
			System.out.println("");
		}
	}
}