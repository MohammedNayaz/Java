package prgm6;
import java.util.*;
public class Fly {
static int n;
static int c[][],d[][];

static void floyds()
{
	int i, j, k;
	for(i=0 ; i<n ; i++)
	{
		for(j=0 ; j<n ; j++)
		{
			d[i][j] = c[i][j];
		}
	}
	for(k=0 ; k<n ; k++)
	{
		for(i=0 ; i<n ; i++)
		{
			for(j=0 ; j<n ; j++)
			{
				d[i][j] = Math.min(d[i][j] , d[i][k] + d[k][j]);
			}
		}
	}
}
	static void read()
	{
		Scanner ob = new Scanner(System.in);
		System.out.println("enter the two vertices:");
		n = ob.nextInt();
		c = new int[n][n];
		d = new int[n][n];
		System.out.println("enter the cost matrix:");
		for(int i=0 ; i<n ; i++)
		{
			for(int j=0 ; j<n ; j++)
			{
				c[i][j] = ob.nextInt();
			}
		}
	}
static void display()
{
	System.out.println("the least distance matrix is:");
	for(int i=0 ; i<n ; i++)
	{
		for(int j=0 ; j<n ; j++)
		{
			System.out.println(""+d[i][j] +"\t");
		}
	System.out.println();
	}
}
public static void main(String s[])
{
	read();
	floyds();
	display();
}
}

/*
Output:
enter the two vertices:
4
enter the cost matrix:
0	9999	3	9999
2	9999	0	9999
9999	7	0	1
6	9999	9999	0
the least distance matrix is:
0	
10	
3	
4	

2	
7	
0	
1	

7	
7	
0	
1	

6	
16	
9	
0	

*/
