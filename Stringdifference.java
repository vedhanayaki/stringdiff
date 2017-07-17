package player;
import java.util.Scanner;
public class Stringdifference {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("Enter the Sentences:");
Scanner s=new Scanner(System.in);
String a=s.nextLine();
System.out.println("Enter the sentences1:");
String b=s.nextLine();
if(a.length()>b.length()){
	System.out.println(a.substring(b.length()-1));
}
if(b.length()>a.length()){
	System.out.println(b.substring(a.length()-1));
}
else{
	System.out.println("null");
}
	}

}
