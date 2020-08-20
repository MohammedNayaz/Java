//Find Minimum Cost Spanning Tree of a given connected undirected graph using Prims’s algorithm.//
package mdn;
import java.util.*;
	public class prims
	{
	static int n;
	static int c[][];
	
	static void prims()
	{
		int u=0,v=0,min=0;
		int ne=0,mincost=0;
		int elec[]=new int[n+1];
		for(int i=1;i<=n;i++)
		{
			elec[i]=0;
			
		}
		elec[1]=1;
		while(ne!=n-1)
		{
			min=9999;
			for(int i=1;i<n;i++)
			{
				for(int j=1;j<n;j++)
				{
				if(elec[i]==1)
				{
					if(c[i][j]<min)
					{
						min=c[i][j];
						u=i;
						v=j;
					}
				}
			}
		}
			if(elec[v]!=1)
			{
				System.out.println(u+"----->"+v+"="+min);
				elec[v]=1;
				ne=ne+1;
				mincost=mincost+min;
			}
			c[u][v]=c[v][u]=9999;
		}
		System.out.println("\nmincost="+mincost);
	}
	static void read()
	{
		Scanner ob=new Scanner(System.in);
		System.out.println("enter the no of vertices:");
		n=ob.nextInt();
		c=new int[n+1][n+1];
		System.out.println("enter the cost matrix:");
		for(int i=1;i<n;i++)
		{
			for(int j=1;j<n;j++)
			{
				c[i][j]=ob.nextInt();
			}
		}
	}
public static void main(String s[])
{
	read();
	prims();
}
}

/*
Output:
1]
enter the no of vertices:
6
enter the cost matrix:
9999	3	9999	9999	6	5
3	9999	1	9999	9999	4
9999	1	9999	6	9999	4
9999	6	6	9999	8	5
6	9999	9999	8	9999	2
5	4	4	5	2	9999
1----->2=3
2----->3=1
2----->6=4
6----->5=2
6----->4=5

mincost=15

2]
enter the ni of vertices:

4
enter the cost matrix:
9999	1	5	2
1	9999	9999	4
5	9999	9999	3
2	4	3	9999
1----->2=1
1----->4=2
4----->3=3

mincost=6
*/


