package day01;

class A {

	public void chu(int i, int j) {
		// TODO Auto-generated method stub
		int e;
		e=i/j;
	}
	
}

public class ss {	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A a=new A();
		try {
			a.chu(4,0);
		}catch (Exception e) {
			System.out.println(e.getMessage());
		}
		finally {
			System.out.println("finally÷¥––¡À");
		}
		}
		
		
		
	}