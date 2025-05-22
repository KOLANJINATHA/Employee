package forTwo;

public class UseShirt {
	public static void main(String[] args) {
		Shirt s1=new Shirt();
		s1.brand="ramraj";
		s1.price=1000;
		s1.color="blue";
		s1.isChecked=true;
		s1.size="s";
		s1.fabric="cotton";
		Shirt s2=new Shirt();
		s2.brand="otto";
		s2.price=1200;
		s2.color="red";
		s2.isChecked=false;
		s2.size="m";
		s2.fabric="semi cotton";
		Shirt s3=new Shirt();
		s3.brand="kolanji";
		s3.price=2000;
		s3.color="green";
		s3.isChecked=true;
		s3.size="l";
		s3.fabric="silk";
		Shirt s4=new Shirt();
		s4.brand="peter england";
		s4.price=1500;
		s4.isChecked=false;
		s4.color="orange";
		s4.size="xl";
		s4.fabric="nylon";
		Shirt[]shirts= {s1,s2,s3,s4};
//		for(int i=0;i<shirts.length;i++) {
//			System.out.println(shirts[i].brand+" "+shirts[i].price+" "+shirts[i].isChecked+" "+shirts[i].size+" "+shirts[i].fabric);
//		}
//		for(Shirt x:shirts) {
//			System.out.println(x.brand+" "+x.price+" "+x.isChecked+" "+x.color+" "+x.size+" "+x.fabric);
//		}
//		int min=shirts[0].price;
//	for(int i=0;i<shirts.length;i++) {
//			if(shirts[i].price<=min) {
//				min=shirts[i].price;
//			}
//			
//		}
//	         System.out.println(min);
//		
////		for(int i=0;i<shirts.length;i++) {
////			if(shirts[i].brand.contains("otto")) {
////				System.out.println(shirts[i].brand+" "+shirts[i].price);
////			}
////		}
//		
//		Shirt max=shirts[0];
//		for(int i=0;i<shirts.length;i++) {
//			if(shirts[i].price>=max.price) {
//				max=shirts[i];
//			}
//		}
//		System.out.println(max.brand+" "+max.price+" "+max.fabric);
//		
//		
		for(int i=0;i<shirts.length;i++) {
			if(shirts[i].price>=800&&shirts[i].price<=1500) {
				System.out.println(shirts[i].brand+" "+shirts[i].color);
			}
		}
	}

}
