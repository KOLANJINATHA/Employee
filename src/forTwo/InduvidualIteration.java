package forTwo;

public class InduvidualIteration {
	public static void main(String[] args) {
	
		String[] name=new String[8];
		name[0]="ram";
		name[1]="raja";
		name[2]="ramu";
		name[3]="rahul";
		name[4]="aa";
		name[5]="nathan";
		name[6]="table";
		name[7]="chair";
//		for(int i=0;i<name.length;i++) {
//			if(name[i].startsWith("r")) {
//				System.out.println(name[i]);
//			}
//		}
//		int count=0;
//		for(int i=0;i<name.length;i++) {
//			if(name[i].contains("a")||name[i].contains("e")||name[i].contains("i")||name[i].contains("o")||name[i].contains("u")) {
//				count=count+1;
//			}
//		}
//		System.out.println(count);
//		for(int i=0;i<name.length/2;i++) {
//			System.out.println(name[i]);
//		}
//		
//		for(int i=name.length/2-1;i>=0;i--) {
//
//			System.out.println(name[i]);
//		}
//		System.out.println();
//		
		for(int i=name.length/2;i<=name.length-1;i++) {
			System.out.println(name[i]);
		}
		System.out.println();
		
		for(int i=name.length-1;i>=name.length/2;i--) {
			System.out.println(name[i]);
		}
	}

}
