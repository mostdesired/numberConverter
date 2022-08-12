
package numberconverter;
import java.util.Scanner;
/**
 *
 * @author katlego
 */
public class NumberConverter {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);
        System.out.println("enter decimal number");
        int decimalnumber = scan.nextInt();
        
       
        System.out.println(Integer.toHexString(decimalnumber));
    }
    
}
