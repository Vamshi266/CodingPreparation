package stack;

public class DoubleStack {

	static final int SIZE = 10;
	private int[] arr = new int[SIZE];
	private int top1,top2;
	
	public DoubleStack()
	{
		top1 = -1;
		top2 = SIZE;
	}
	
	public boolean isEmpty1()
	{
		return top1 <= 0;
	}
	
	public boolean isEmpty2()
	{
		return top2 >= SIZE;
	}
	
	public boolean push1(int e)
	{
		if(top2 - top1 > 1)
		{
			arr[++top1] = e;
			return true;
		}
		else
		{
			System.out.println("overflow");
			return false;
		}
		
	}
	
	public int pop1()
	{
		if(top1 < 0)
			return -1;

		
		int temp = arr[top1];
		top1--;
		return temp;
	}
	
	public boolean push2(int e)
	{
		if(top2 - top1 > 1)
		{
			arr[--top2] = e;
			return true;
		}
		else
		{
			System.out.println("overflow");
			return false;
		}
	}
	
	public int pop2()
	{
		if(top2 >= SIZE)
			return -1;
		
		int temp = arr[top2];
		top2++;
		return temp;
	}

	public static void main(String[] args) {
		
		
		DoubleStack ds = new DoubleStack();
		
		ds.push1(23);
		ds.push1(24);
		ds.push1(25);
		ds.push1(26);
		ds.push1(27);
		
		ds.push2(31);
		ds.push2(32);
		ds.push2(33);
		ds.push2(34);
		ds.push2(35);
		
		ds.push1(28);
		
		
	}
	
}
