import java.util.*;
class employee{
	private String Emp_name,Emp_id;
    private String Emp_gender,Emp_designation,Emp_address;	
    private int Emp_salary,Emp_age;
    int n;
    String name,gen,des,add,id;
    int sal,age;
    Scanner s=new Scanner(System.in);
	void setEmp_name(String name){
		Emp_name=name;
	}
    void setEmp_id(String id){
		Emp_id=id;
	}
	void setEmp_gender(String gen){
		Emp_gender=gen;
	}
    void setEmp_designation(String des){
        Emp_designation=des;
    }
    void setEmp_address(String add){
        Emp_address=add;
    }
    void setEmp_salary(int x){
        Emp_salary=x;
    }
    void setEmp_age(int x){
        Emp_age=x;
    }
    String getEmp_id(){
        return Emp_id;
    }
    
    public employee(){}
    public employee(String id,String name,String gender,String designation,String address,int age,int sal){
        setEmp_address(address);
        setEmp_age(age);
        setEmp_id(id);
        setEmp_salary(sal);
        setEmp_designation(designation);
        setEmp_name(name);
        setEmp_gender(gender);

    }
    void read(employee e[]){
        for(int i=0;i<n;i++){
            System.out.println("Enter id of employee: ");
            id=s.next();
            s.nextLine();
            System.out.println("Enter name of employee: ");
            name=s.nextLine();
            //s.nextLine();
            System.out.println("Enter gender: ");
            gen=s.next();
            //s.nextLine();
            System.out.println("Enter des: ");
            des=s.next();
            s.nextLine();
            System.out.println("Enter add: ");
            add=s.nextLine();
            s.nextLine();
            System.out.println("Enter age: ");
            age=s.nextInt();
            System.out.println("Enter salary: ");
            sal=s.nextInt();
            e[i]=new employee(id,name,gen,des,add,age,sal);

        }
    }
    void display(employee e[]){
        for(int i=0;i<n;i++){
            System.out.println(e[i].Emp_id+" "+e[i].Emp_name+" "+e[i].Emp_age+" "+e[i].Emp_gender+" "+e[i].Emp_address+" "+e[i].Emp_designation+" "+e[i].Emp_salary);
        }
    }
    void search(String se_id,employee e[]){
        int i;
        for(i=0;i<n;i++){
            if(e[i].Emp_id.equalsIgnoreCase(se_id)){
                System.out.println("Emp_id: "+e[i].Emp_id+"\n"+"Emp_name: "+e[i].Emp_name+"\n"+"Emp_age: "+e[i].Emp_age+"\n"+"Emp_gender: "+e[i].Emp_gender+"\n"+"Emp_address: "+e[i].Emp_address+"\n"+"Emp_designation: "+e[i].Emp_designation+"\n"+"Emp_Salary: "+e[i].Emp_salary);
                break;
            }
        }
        if(i==n){
            System.out.println("Employee details not found :(");
        }
    }
	
}