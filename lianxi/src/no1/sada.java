package no1;
class A{
	void print(){
		System.out.println("hellow");
	}
}
public class sada {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A a=new A();
		A b=new A();

		if(a.equals(b)) {
			System.out.println("true");
		}else {
			System.out.println("false");
		}
	}

}
