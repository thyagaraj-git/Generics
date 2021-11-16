package generics;
import java.util.Date;

public class mainpair {
public static void main(String args[])
{
	Pair<String,String>p1=new Pair<>();
	p1.setKey("hii");
	p1.setValue("hello");
	System.out.println(p1.getKey()+" "+p1.getValue());
	
	Pair<String,java.util.Date>p2=new Pair<>();
	p2.setKey("today is");
	p2.setValue(new java.util.Date());
	System.out.println(p2.getKey()+" "+p2.getValue());
	
}
}
