package SelPrac;

public class charstr 
{
	public static void main(String[] args) 
	{
		String name  = "DCBA";
		
		char c[] = name.toCharArray();
		
		int len = name.length();
		
		String str="";
		
		for(int i=0;i<len;i++)
		{
			if(c[i]=='A')
				c[i]='E';
			else if(c[i]=='B')
				c[i]='F';
			else if(c[i]=='C')
				c[i]='G';
			else if(c[i]=='D')
				c[i]='H';
			
			str = str + c[i];
		}
		System.out.println(str);
	}
	
}
