//Wrapper.java
import java.util.*;
class Wrapper{
	public static void main(String[] args){
		//list expect Integer object
		ArrayList<Integer> list = new ArrayList<>();
		 //auto-boxing, java auto convert int 1 to new Integer(1)
		list.add(1);
		list.add(new Double(1.1).intValue());
		for(long j : list){
			System.out.println(j);
		}
		for(Integer k : list){
			//auto unboxing to int, then promote to float
			System.out.println(k+1.1f);
		}
	}
}