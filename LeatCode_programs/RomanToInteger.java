package LeatCode_programs;

public class RomanToInteger {
	
		public static void main(String[] args) {
			String s="III";
			
	        int n=0,ans=0;
	       for(int i=s.length()-1;i>=0;i--){
	           switch(s.charAt(i)){
	               case 'I' :n=n+1;break;
	               case 'V' :n=n+5;break;
	               case 'x' :n=n+10;break;
	               case 'L' :n=n+50;break;
	               case 'C' :n=n+100;break;
	               case 'D' :n=n+500;break;
	               case 'M' :n=n+1000;break;
	           }
	           if(4*n<ans){
	               ans=ans-n;
	           }
	           else{
	               ans=ans+n;
	           }
	       }
		System.out.println(ans);
		}
       
}
