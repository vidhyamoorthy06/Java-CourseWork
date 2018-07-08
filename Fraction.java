import java.util.Scanner;

public class Fraction {
	private 
		int num,den;
	public Fraction(int num, int den) {
		super();
		this.num = num;
		this.den = den;
	}

	public Fraction() {
		// TODO Auto-generated constructor stub
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public int getDen() {
		return den;
	}

	public void setDen(int den) {
		this.den = den;
	}

	public Fraction add(Fraction a,Fraction b)
	{
		Fraction result = new Fraction(a.getNum()+b.getNum(),a.getDen()+b.getDen());
		return result;
	}
	
	public Fraction sub(Fraction a,Fraction b)
	{
		Fraction result = new Fraction();
		if(a.getNum()>b.getNum() && a.getDen()>b.getDen() && a.getDen()>0 && b.getDen()>0)
		{
			result = new Fraction(a.getNum()-b.getNum(),a.getDen()-b.getDen());
			return result;
		}
		else if(a.getNum()==0 || b.getNum()==0)
		{
			System.out.println("The numerator is zero");
			return result;
		}	
		else
		{
			System.out.println("The denominator is zero");
			return result;
		}    
	}
	
	public Fraction multiplication(Fraction a,Fraction b)
	{
		Fraction result = new Fraction(a.getNum()*b.getNum(),a.getDen()*b.getDen());
		return result;
	}
	
	public Fraction division(Fraction a, Fraction b)
	{
		Fraction result = new Fraction(a.getNum()*b.getDen(),a.getDen()*b.getNum());
		return result;
	}
	
	public String toString()
	{
		System.out.println(" "+this.getNum()+" / "+this.getDen());
		return null;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter Fraction A ::");
		Scanner sc = new Scanner(System.in);
		String A = sc.nextLine();
		String a[] = A.split("/");
		int num = Integer.parseInt(a[0]);
		int den = Integer.parseInt(a[1]);
		Fraction one = new Fraction(num,den);
		
		System.out.println("Enter Fraction B ::");
		String B = sc.nextLine();
		String b[] = B.split("/");
		 int numb = Integer.parseInt(b[0]);
		int denb = Integer.parseInt(b[1]);
		Fraction two = new Fraction(numb,denb);
		
		System.out.println("Given Fractions : A");
		one.toString();
		System.out.println("B :");
		two.toString();
		
		Fraction addRes = new Fraction();
		addRes = addRes.add(one, two);
		System.out.println("Addition ::");
		addRes.toString();
		
		System.out.println("Subraction ::");
		Fraction subRes = new Fraction();
		subRes = subRes.sub(one, two);
		subRes.toString();
		
		System.out.println("Multiplication ::");
		Fraction mulRes = new Fraction();
		mulRes = mulRes.multiplication(one, two);
		mulRes.toString();
		
		System.out.println("Division ::");
		Fraction divRes = new Fraction();
		divRes = divRes.division(one, two);
		divRes.toString();
		
	}

}
