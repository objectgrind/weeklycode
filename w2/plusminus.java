//@author ANSHUMAN BANSAL
import java.io.*;//ADDED PACKAGE
import java.util.*;//ADDED PACKAGE

public class Solution {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();//INPUTED VALUE BY SCANNER
        
        double positive = 0;//TAKEN VALUE IN DOUBLE BECOZ WE HAVE TO GIVE OUTPUT IN DECIMAL WE CAN ALSO IN FLOAT
        double negative = 0;
        double zero = 0;
        
        for(int i = 0; i<n; i++)//LOOP TO CHECK VALUE IS POSITIVE AND NEGATIVIE OR ZERO
        {
            int value = input.nextInt();
            positive += value>0 ? 1:0;//TERNARY CONDITION SHOULD HAVE STUDIED IN MIET BTECH 1ST YEAR
            negative += value<0 ? 1:0;
            zero     += value==0 ? 1:0;
        }
        System.out.println(positive/n);//PRINT STATEMENT FOR POSITIVE
        System.out.println(negative/n);//PRINT STATEMENT FOR NEGATIVE
        System.out.println(zero/n);//PRINT STATEMENT FOR ZERO NUMBERS
    }
}