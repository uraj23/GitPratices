package LeatCode_programs;

public class LongestSubString 
{
	public static void main(String[] args) {
		
//		 char ch[]=s.toCharArray();
//	      String s2="";
//		    for(int i=0;i<ch.length;i++){
//		    	for(int j=0;j<ch.length;j++)
//		    	{
//		    		for(int k=i;k<=j;k++)
//		    		{
//		    			//System.out.print(ch[k]+" ");
//		    		}
//		    		System.out.println();
//		    	}
//		    }
//		    
//		    for (int i = 0; i < ch.length; i++) {
//		    	for (int j = 0; j <=i; j++) {
//					System.out.print(ch[j]+" ");
//				}
//				System.out.println();
//			}
		
		String s="abcabcbb";   
		      char ch[]=s.toCharArray();
		      String s1="";
		    for(int i=0;i<ch.length;i++){
		        String s3="";
		        for(int j=0;j<=i;j++){
		            if(ch[i]!=ch[j])
		            {
		            s3=s3+ch[j]; 
		            }
		            else if(ch[i]==ch[j])
		            {
		              if(s1.length()<s3.length())
		              {
		                s1=s3;
		              }
		            }
		        }
		        }
		        System.out.println(s1.length());
		        System.out.println(s1);
		    
 }
}
