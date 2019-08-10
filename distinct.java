
import java.util.*;
import java.io.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int c=0;
		int a[]=new int[num];
		for(int i=0;i<num;i++)
		     { 
             a[i]=sc.nextInt();
             }
		for(int j=0;j<num;j++)
		    {  c=0;
		        for(int k=0;k<num;k++)
		            { 
                    if(a[j]==a[k])
                        { c++;	
                        }
		            }
		        if(c==1)
		            { System.out.print(a[j]+" ");
                    }
		    }
	}
}
