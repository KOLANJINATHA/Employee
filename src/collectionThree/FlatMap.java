package collectionThree;
import java.util.List;
import java.util.stream.Collectors;
import java.util.Arrays;
import java.util.HashMap;
public class FlatMap {
	public static void main(String[] args) {
		List<Integer> num1=Arrays.asList(10,20,30);
		List<Integer> num2=Arrays.asList(40,50,60);
		List<List<Integer>> num3=Arrays.asList(num1,num2);
		List<Integer> numbers=num3.stream().flatMap(x->x.stream()).collect(Collectors.toList());
		System.out.println(numbers);
		
		
		List<Integer> a=Arrays.asList(10,20,30,40);
		List<String> b=Arrays.asList("ramu","somu","raju","koju");
		HashMap<Integer,String> c=new HashMap<>();
		for(int i=0;i<a.size();i++) {
			c.put(a.get(i),b.get(i));
		}
		c.forEach((x,y)->System.out.println(x+" "+y));
	}

}
