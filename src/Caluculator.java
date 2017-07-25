
public class Caluculator {
	void sum(int a, int b){
		System.out.println((a+b));
	}
	void sum(int a, int b, int c){
		System.out.println((a+b+c));
	}
	

	public static  void main(String[] args) {
		Caluculator c = new Caluculator();
		c.sum(10, 20);
		c.sum(10, 20,30);
		
	}

}
