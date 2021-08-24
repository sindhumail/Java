package practice;

public class substring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String s = "Learning";
char ch =s.charAt(0);
System.out.println(ch);
String sub1=s.substring(3);
System.out.println(sub1);
String sub2=s.substring(4, 7);//Start index is inclusive means it will be taken in to account and gets printed
System.out.println(sub2);//End index is exclusive means it is excluded ..it is feom start till end not TO END

	}

}
