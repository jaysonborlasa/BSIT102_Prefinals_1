import java.util.Scanner;


public class PREFINAL_ACTIVITY_1 {
	
	public static void main(String[] args) {
            int number = 0;
            Scanner scanner = new Scanner(System.in);
            System.out.print("Please type a number between 0 and 1000:  ");
             // read the number
            number = scanner.nextInt();
            while(number!=-1){
                if(number>=0 && number<=1000){
                	// convert number to a string
                    if(number==0){
                        System.out.print(":\tzero");
                    } else {
                        System.out.print(":\t");
                          numberToWord(((number / 100) % 10), " hundred");
                          // check if number is divisible by hundred
                        numberToWord(((number / 1000) % 100), " thousand");
                        // check if number is divisible by thousand
                        numberToWord((number % 100), " ");
                    }
                } else{
                    System.out.print("Number Out Of Range");
                }
                System.out.print("\nPlease type a number between 0 and 1000:  ");
                number = scanner.nextInt();
            }
        }
        public static void numberToWord(int num, String val) {
        	 // variable to hold string representation of number 
            String ones[] = {" ", " one", " two", " three", " four", " five", " six", " seven", " eight", " nine", " ten", " eleven", " twelve", " thirteen", " fourteen", " fifteen", " sixteen", " seventeen", " eighteen", " nineteen"
            };
            String tens[] = {" ", " ", " twenty", " thirty", " fourty", " fifty", " sixty", " seventy", " eighty", " ninety"};            
            if (num > 19) {
                System.out.print(tens[num / 10] + " " + ones[num % 10]);
            } else {
                System.out.print(ones[num]);
            }            
            if (num > 0) {
                System.out.print(val);
           }
      }
}