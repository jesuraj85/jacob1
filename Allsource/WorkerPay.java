import java.util.Scanner;

public class WorkerPay
{
	private double workHours;
	private double wageRate;
	private int dependentsNum;
   
   public WorkerPay(double workHours, double wageRate,int dependentsNum){
	   this.workHours=workHours;
	   this.wageRate=wageRate;
	   this.dependentsNum=dependentsNum;
   }
   public double grossPay(){
	   double temp=0;
	   if(workHours>=0) {
		   if(workHours <= 40){
			   temp=workHours * wageRate;}
		   else {if(workHours <= 60){
				   temp= wageRate * 40;
				   temp+= 1.5 * wageRate * (workHours - 40);}
			     else{
				   temp= wageRate * 40;
			       temp+= 1.5 * wageRate * 20;
			       temp+= 2 * wageRate * (workHours - 60);
			     }
		   }
		}
	   return temp;
   }
   
   public double fedTax(){
	   double federalTax = grossPay() * 0.1 - 25 * dependentsNum;
	   return (federalTax > 0) ? federalTax : 0;
   }
   
   public void display(){
	   System.out.println("The Hours worked is : "+ workHours);
	   System.out.println("The Hourly Rate is : "+ wageRate);
	   System.out.println("The Number of Dependents is : "+ dependentsNum);
	   System.out.println("The Gross income is : "+ grossPay());
	   System.out.println("The Federal Tax withheld is : "+ fedTax());
	   System.out.println("The Take Home pay is : " + (grossPay() - fedTax()));
   }
   /*
      Students must fill in the code for the private instance fields
      and the two instance methods: grossPay, fedTax, and display.
   */

}    // end class