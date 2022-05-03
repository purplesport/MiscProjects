import java.util.Scanner; 

public class Collatz {
    public static void main(String args[]) {
        System.out.println("Enter an upper bound: ");
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        System.out.println("Number of iterations needed to get to 4 3 1 loop");
        for(int i =  1; i<= num; i++){
            System.out.println(i + ": " + Collatz(i));
        }
    }
    public static int Collatz(int num){
        int counter = 0;
        while(num != 1){
            if(num%2 == 0){
                num = num/2;}
            else{
		        num = 3*num +1;}
	        counter++;
        }
        return counter;
    }
}
