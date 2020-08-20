// program 3
package prg3;
import java.util.*;

public class Kruskal {
static int n;
static int c[][];

static void kruskals()
{
	int u=0,v=0,a=0,b=0,min=0;
	int count=0,mincost=0;
	int parent[]=new int[n+1];
	for(int i=1;i<=n;i++)
	{
		parent[i]=0;
	}
	while(count!=n+1)
	{
		min=9999;
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n;j++)
			{
				if(c[i][j]<min)
				{
					min=c[i][j];
					u=a=i;
					v=b=j;
				}
			}
		}
		while(parent[u]!=0)
		{
			u=parent[u];
		}
		while(parent[v]!=0)
		{
			v=parent[v];
		}
		if(u!=v)
		{
			System.out.println(a+"----->"+b+"="+min);
					parent[v]=u;
					mincost=mincost+min;
		}
		c[a][b]=c[b][a]=9999;
		count++;
	}
	System.out.println("mincost="+mincost);
}

static void read()
{
	Scanner ob=new Scanner(System.in);
	System.out.println("enter the no. of vertices:");
	n=ob.nextInt();
	c=new int[n+1][n+1];
	System.out.println("enter the cost matrix:");
	for(int i=1;i<=n;i++)
	{
		for(int j=1;j<=n;j++)
		{
			c[i][j]=ob.nextInt();
		}
			
	}
	
}
	public static void main(String[] args) {
		read();
		kruskals();
		
	}

}

/*
Output 1:
enter the no. of vertices:
6
enter the cost matrix:
9999	3	9999	9999	6	5
3	9999	1	9999	9999	4
9999	1	9999	6	9999	4
9999	9999	6	9999	8	5
6	9999	9999	8	9999	2
5	4	4	5	2	9999
2----->3=1
5----->6=2
1----->2=3
2----->6=4
4----->6=5
mincost=15

Output 2:
enter the no. of vertices:
4
enter the cost matrix:
9999	1	5	2
1	9999	9999	9999	
5	9999	9999	3
2	9999	3	9999
1----->2=1
1----->4=2
3----->4=3
mincost=6
*/
