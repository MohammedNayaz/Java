package daa;
import java.util.*;
class TSP 
{
	static int v[], c[][], n, src;
	static double sum, min = 9999, min1 = 9999;
	
	static double calc()
	{
		sum = 0.0;
		for(int j = 1 ; j<=n ; j++ )
		{
			System.out.print(" "+v[j]);
			sum = sum + c[v[j]][v[j+1]];
		}
		sum = sum + c[v[n]][v[1]];
		
		System.out.println(" " +v[1]+" "+sum);
		return sum;
	}
	static void es()
	{
		int i, j, temp, count=0, fact=1;
		double tot = 0.0;
		
		for(i=1 ; i<=n-1; i++)
			fact = fact * i;
		v[1] = src;
		i= 2;
		for(j=1 ; j<=n ; j++)
		{
			if(j!=src)
				v[i++] = j;
		}
		count = 1;
		while(count<fact)
		{
			for(j=1 ; j<=(n-2) ; j++)
			{
				temp = v[n];
				v[n] = v[n-j];
				v[n-j] = temp;
				
				count++;
				tot = calc();
				
				if(tot<min)
					min = tot;
			}
		}
		System.out.println("\n The optimal solution is " +min);
	}
	public static void main(String args[])
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter no of vertices");
		n = s.nextInt();
		c = new int[n+1][n+1];
		v = new int[n+2];
		System.out.println("Enter the cost matrix of the graph");
		for(int i=1 ; i<=n; i++)
		{
			for(int j=1 ; j<=n ; j++)
			{
				c[i][j] = s.nextInt();
				
			}
			v[i] = i;
		}
		System.out.println("Enter the source vertex");
		src = s.nextInt();
		es();
	}

}

/*
Output:
Enter no of vertices
4
Enter the cost matrix of the graph
0	1	3	6
1	0	2	3
3	2	0	1
6	3	1	0
Enter the source vertex
1
 1 2 4 3 1 8.0
 1 3 4 2 1 8.0
 1 3 2 4 1 14.0
 1 4 2 3 1 14.0
 1 4 3 2 1 10.0
 1 2 3 4 1 10.0

 The optimal solution is 8.0
*/
