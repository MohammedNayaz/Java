//program 2
import java.util.*;
public class subset {
	static int n,d;
	static int a[],x[];
	static int sum;
	static int count=0;
	static void set(int m, int k,int sum)
	{
		int i=0;
		x[k]=1;
		if(m+a[k]==d)
		{
			count=count+1;
			System.out.println("set solution is"+count);
			for(i=0;i<=k;i++)
			{
				if(x[i]==1)
				{
					System.out.println(a[i]);
				}
			}	
		}
	else if(m+a[k]+a[k+1]<=d)
	{
		set(m+a[k],k+1,sum-a[k]);
	}
		if((m+sum-a[k]>=d)&&(m+a[k+1]<=d))
		{
			x[k]=0;
			set(m,k+1,sum-a[k]);
		}
		if(count==0)
			System.out.println("no solution exist");
	}
	static void read()
	{
		Scanner ob=new Scanner(System.in);
		System.out.println("enter no.of elements");
		n=ob.nextInt();
		a=new int[n];
		x=new int[n];
		System.out.println("enter the elements in ascending order");
		for(int i=0;i<=n-1;i++)
		{
			a[i]=ob.nextInt();
		}
		System.out.println("enter the required sum:");
		d=ob.nextInt();
	}
		static void solution()
		{
			for(int i=0;i<=n-1;i++)
			{
				sum=sum+a[i];
			}
			if(sum<d||a[0]>d)
			{
				System.out.println("no solution exists");
			}
			else
			{
				set(0,0,sum);
			}
		}
		
		
	public static void main(String[] args) {
		
read();
solution();


	}
}

/*
Output 1:(average case)

enter no.of elements
4
enter the elements in ascending order
2 3 4 6 
enter the required sum:
5
set solution is1
2
3






Output 2:(best case)

enter no.of elements
6
enter the elements in ascending order
2 4 6 8 10 12
enter the required sum:
20
set solution is1
2
4
6
8
set solution is2
2
6
12
set solution is3
2
8
10
set solution is4
4
6
10
set solution is5
8
12

Output 3:(failed case)
enter no.of elements
5
enter the elements in ascending order
1 2 3 4 5
enter the required sum:
20
no solution exists

Output 4: (worst case)

enter no.of elements
5
enter the elements in ascending order
2 4 6 8 9
enter the required sum:
2
set solution is1
2
*/






