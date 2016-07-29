package text;

public class MallardDuck extends Duck {
	
	public MallardDuck(){
		quackBehavior=new Quack();
		flyBehavior=new Fly2();
	
	}
	public void display(){
		System.out.println("I'm a model duck!"+this.head);
		
	}

}
