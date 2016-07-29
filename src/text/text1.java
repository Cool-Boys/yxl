package text;

public class text1 {
	
	public static void main(String args[])
	{
//		int i,min,max;
//		int[] arr={1,3,45,6};
//		
//		min=max=arr[0];
//		System.out.print("arr:");
//		for (int j = 0; j < arr.length; j++) {
//			System.out.print(" "+arr[j]);
//		if (min>arr[j]) {
//			min=arr[j];
//		}	
//		if(arr[j]>max){
//			max=arr[j];
//			
//		}
//		}
//		
//		System.out.println("\nzuidazhi:"+max);
//		System.out.println("zuixiaozhi:"+min);
		
		
		Duck mduck=new MallardDuck();
		mduck.head="Ñ¾î^";
		mduck.display();
		mduck.porFly();
		mduck.getFly(new FlyRocketPowered());
		mduck.porFly();
		mduck.getFly(new FlyBehavior() {
			
			public void fly() {
				// TODO Auto-generated method stub
				System.out.println(" Ëæ±ã·É£¡");
			}
		});
		mduck.porFly();
	}
	
}
