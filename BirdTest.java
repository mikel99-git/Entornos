package test;

public class BirdTest {

	public static void main(String[] args) {
	
		Bird piolin = new Bird();
		piolin.name="piolin";
		piolin.color="yellow";
		piolin.height=2;
		piolin.weight=10;
		
		Bird woodywoodpecker =  new Bird();
		woodywoodpecker.name="woodydoodpecker";
		woodywoodpecker.color="red";
		woodywoodpecker.height=5;
		woodywoodpecker.weight=100;
		 
		/* System.out.println(piolin.color);
		 System.out.println( woodywoodpecker.color);
		 if (piolin.weight< woodywoodpecker.weight) {
			 System.out.println("woody is the lightest");
		 }*/
		
		
		 piolin.Fly();
		 woodywoodpecker.Fly();
		 //Bird empty;
		 
		 
		 
	}

}
