package collectionOne;
import java.util.ArrayList;


public class Arraylist {
	public static void main(String[] args) {
		ArrayList<Integer> nums=new ArrayList<>();
		nums.add(10);
		nums.add(20);
		nums.add(30);
		nums.add(40);
		nums.add(50);
		System.out.println(nums);
		System.out.println(nums.get(4));
		nums.remove(4);
		nums.set(2, 60);
		System.out.println(nums);
		System.out.println(nums.size());
		for(int i=0;i<nums.size();i++) {
			System.out.println(nums.get(i));
		}
		for(Integer x:nums) {
			System.out.println(x);
		}
		System.out.println(" ");
		nums.forEach(x->System.out.println(x));
		System.out.println(" ");
		nums.forEach(x->
		{
			if(x%2==0) {
				System.out.println(x);
			}
		});
		ArrayList<String> words=new ArrayList<>();
		words.add("luffy");
		words.add("zoro");
		words.add("sanji");
		words.add("usopp");
		words.add("chopper");
		System.out.println(words);
		System.out.println(" ");
		System.out.println(words.get(2));
		System.out.println(" ");
		System.out.println(words.remove(2));
		System.out.println(" ");
		System.out.println(words.set(2, "franky"));
		System.out.println(" ");
		System.out.println(words.size());
		System.out.println(" ");
		System.out.println(words);
		for(String x:words) {
			System.out.println(x);
		}
		System.out.println(" ");
		words.forEach(x->
		{
			if(x.length()%2==0) {
				System.out.println(x);
			}
		});
		System.out.println(" ");
		String max=words.get(0);
		for(int i=0;i<words.size();i++) {
			if(words.get(i).length()>max.length()) {
				max=words.get(i);
				
			}
		}
		System.out.println(max);
		
		
		
	}
	
}
