//program 1
package prg1;
import java.util.Scanner;
public class student {
String usn;
String name;
String branch;
long phone;

static void read(){
	Scanner scan = new Scanner(System.in);
	
	Scanner scan1 =new Scanner(System.in);
	
	System.out.println("enter number of objects");
	    int n =scan.nextInt();
	    student s[]=new student[n];
	    for(int i=0;i<n;i++)
	    	s[i]=new student();
	    for(int i=0;i<n;i++)
	    {
	    	
	    	System.out.print("enter usn");
	    	s[i].usn=scan.next();
	    	System.out.println("enter name");
	    	s[i].name=scan1.nextLine();
	    	System.out.println("enter branch");
	    	s[i].branch=scan1.nextLine();
	    	System.out.println("enter phone number");
	    	s[i].phone=scan.nextLong();
	    	    }
	    System.out.println("    USN      "+"    NAME     "+"    BRANCH  "+"  	PHONe   ");
	    for(int i=0;i<n;i++)
	    {
	    	System.out.print(s[i].usn+"         "+s[i].name+"	        "+s[i].branch+"	          "+s[i].phone);
	    	System.out.println();
	    
	    }
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
read();
	}

}
/*

output 1:

enter number of objects
1
enter usn4sm18cs0xx
enter name
name1
enter branch
cse
enter phone number
1111111111
    USN            NAME         BRANCH    	PHONe   
4sm18cs0xx         name1	    cse	    1111111111


output 2:

enter number of objects
2
enter usn4sm18cs0xx
enter name
name1
enter branch
cse
enter phone number
1111111111
enter usn4sm18cs0yy
enter name
name2
enter branch
cse
enter phone number
2222222222
    USN          NAME         BRANCH    	PHONe   
4sm18cs0xx         name1	        cse	          1111111111
4sm18cs0yy         name2	        cse	          2222222222
*/
