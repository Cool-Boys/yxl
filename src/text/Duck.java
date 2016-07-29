package text;
/**
 * Title: Duck<br>
@author yxl
@version 1.00
*/
public abstract class Duck {
public String head;
public String eye;
public String nose;
// 飞的行为
public FlyBehavior flyBehavior;
// 叫的行为
public QuackBehavior quackBehavior;
public String getEye() {
	return eye;
}
public abstract void display();
public void setEye(String eye) {
	this.eye = eye;
}

public String getNose() {
	return nose;
}

public void setNose(String nose) {
	this.nose = nose;
}

public String getHead() {
	return head;
}

public void setHead(String head) {
	this.head = head;
}
public void porFly( )
{
	flyBehavior.fly();
}
public void porGuack()
{
	quackBehavior.Quackq();
}


public void getFly( FlyBehavior fb)
{
	flyBehavior=fb;
}
public void getGuack(QuackBehavior qb)
{
	quackBehavior=qb;
}


}
