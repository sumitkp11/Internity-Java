public class LocalVar{
	void method(){
		int x = 10;
		System.out.println(x);
	}
	
	public static void main(String args[]){
		LocalVar lv = new LocalVar();
		lv.method();
	}
}