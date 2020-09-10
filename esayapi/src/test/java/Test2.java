public class Test2 {
	int n;
	Test2(int x){
		n=x;
	}
	int fact() {
		int t = 1;
		for (int i = 1; i <= n; i++) {
			t=t*i;
			System.out.println(t);
		}
		return t;
	}
}

class ex4{
	
	public static void main(String[] args) {
		Test2 f=new Test2(10);
		System.out.println(f.fact());
	}
}