import java.util.*;
class PrimeFactorisation{
	public static void main(String[] args){
		int num;
		System.out.println("enter a number between 100 and 700 for which prime factorization is required");
		Scanner s=new Scanner(System.in);
		boolean b=true;
		do{
			num=s.nextInt();
			if(num<100 || num>700)
				System.out.println("enter number between 100 and 700 only");
			else
				b=false;
		}while(b);	
		System.out.println("the prime factors of "+num+" are:");
		new PrimeFactorisation().primeFactorisation(num);
	}
	public void primeFactorisation(int n){
		if(isPrime(n))
			System.out.println(n);
		else{
			int a[] = new int[10];
			int n1=n,j=0;
			for(int i=2;i<=n1/2;i++){
				if(n1%i==0)
					System.out.print(i+" ");
				while(n1%i==0){
					n1/=i;
					a[j]=i;
					j++;
				}
				if(isPrime(n1) && n1!=1){
					System.out.print(n1);
					a[j]=n1;
					break;
				}
			}
			System.out.println();
			String s="";
			int c=1;
			for(int i=0;i<a.length && a[i]!=0;i++){				
					while((i+1)<a.length && a[i]==a[i+1] && a[i]!=0){
						System.out.println(c);
						c++;
						i++;
					}
					if(c!=1){
						s=s+a[i-1]+"^"+c+"*";
						c=1;
					}
					else{
						s=s+a[i]+"^"+c+"*";
						c=1;
					}
				}
			s=s.substring(0,s.length()-1);
			System.out.println("\nPrime factorisation is "+s);
		}
		if(isPrime(n))
			System.out.println("\nPrime factorisation is "+n+"^1");
	}
	public boolean isPrime(int n){
		for(int i=2;i<n/2;i++){
				if(n%i==0)
					return false;
		}
		return true;
	}
}