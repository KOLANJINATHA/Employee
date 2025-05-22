package collectionTwo;
import java.util.HashMap;
public class LmsTest {
	public static void main(String[] args) {
		HashMap<Integer,String> lms=new HashMap<>();
		lms.put(1132,"ajay");
		lms.put(570,"nisha");
		lms.put(1200, "hari");
		lms.put(835, "nisha");
		for(Integer x: lms.keySet()) {
			System.out.println(x);
		}
		for(Integer x:lms.keySet()) {
		System.out.println(x+" "+lms.get(x));
		}
		for(String x:lms.values()) {
			System.out.println(x);
		}
		lms.forEach((x,y)-> System.out.println(x+" "+y));
		lms.keySet().forEach(x->System.out.println(x));
		lms.values().forEach(y->System.out.println(y));
		System.out.println("========================================");
		
		Integer a=1132;
		for(Integer x: lms.keySet()) {
			if(x>=a) {
				a=x;
			}
		}
		System.out.println(a);
		System.out.println(" ");
		Integer count=0;
		for(Integer x: lms.keySet()) {
			if(lms.get(x).startsWith("a")&&lms.get(x).endsWith("a")) {
				count++;
			}
		}
		System.out.println(count);
		System.out.println(" ");
		Integer min = 1132;
		for(Integer x: lms.keySet()) {
			if(x<=min) {
				min=x;
			}
		}
		System.out.println(lms.get(min));
		System.out.println(" ");
		lms.keySet().forEach(x->
		{
			if(x%2!=0) {
				System.out.println(x);
			}
		});
		System.out.println(" ");
		for(Integer x: lms.keySet()) {
			System.out.println(lms.get(x).charAt(lms.get(x).length()-1));
		}
		System.out.println(lms.get(570));
		
	}

}
