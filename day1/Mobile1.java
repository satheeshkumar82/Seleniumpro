package week1.day1;

public class Mobile1
{
  
	public void makeCall() {
		String mobilemodel="Redmi";
	    float mobileweight=1.5f;
	  System.out.println("My mobile model is: "+mobilemodel);
	  System.out.println("My mobile weight is: "+mobileweight);
  }
  public void sendMsg(){
	  boolean fullcharged=true;
	  int mobilecost=15000;
	  System.out.println("charge is full: "+fullcharged);
	  System.out.println("Mobile cost: "+mobilecost);
  }
	public static void main(String[] args) {
		
	Mobile1 m=new Mobile1();
	m.makeCall();
	m.sendMsg();
		
		
			}

}