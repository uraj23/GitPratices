package LeatCode_programs;

public class AeiousProg 
{
	public static void main(String[] args) {
		
		String s="yuvaeraju";
		char ch[]=s.toCharArray();
		int a=0;
		int e=0;
		int i1=0;
		int o=0;
		int u=0;
		int c=0;
		for(int i=0;i<ch.length;i++)
		{
			if(ch[i]=='a') 
				{a++;}
			else if(ch[i]=='e') { e++;}
			else if(ch[i]=='i') {i1++;}
			else if(ch[i]=='o') {o++;}
		   else if(ch[i]=='u') {o++;}
		   else {
			   c++;
		   }
		   }
		System.out.println("a "+a);
		System.out.println("e "+e);
		System.out.println("i "+i1);
		System.out.println("o "+o);
		System.out.println("u "+u);
		System.out.println("c "+c);
		}
	}


