# numberConverter
#Write a console application for converting a number from a 10-decimal number system to a hexadecimal one. 
#Input data format: numbers from 0 to 10000. Acceptance criterion: 

#1. Application works, numbers are converted. 

#2*. Add conversion from 10th to 2nd 

#3*. Add conversion from 2nd to 10th Solution upload to the repository on a github, attach the link in response to the task. 

public class NumberConverter {

    public static void main(String[] args) {
    
        Scanner scan = new Scanner(System.in);
        //accept user input from user
        System.out.println("enter decimal number");
        int decimalnumber = scan.nextInt();
       
        System.out.println(Integer.toHexString(decimalnumber));
          }
        }
