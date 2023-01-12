
/*Write a program to display details of the required employee based on his Id. The details of employee includes, 
Emp_name, Emp_age, Emp_gender, Emp_designation, Emp_salary, Emp_Address etc.
*/

import java.util.*;
class main_1{
	public static void main(String[] args){
		Scanner s=new Scanner(System.in);
		employee e1=new employee();
		
		System.out.println("Enter number of employees: ");
		e1.n=s.nextInt();
		
		employee e[]=new employee[e1.n];  // creating an array of references for referencing all employees
		e1.read(e);
		e1.display(e);


		System.out.println("enter ID: ");
		String se_id=s.next();

		e1.search(se_id,e);

	}
}