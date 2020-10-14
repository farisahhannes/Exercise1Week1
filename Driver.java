//author: farisah hannes
public class Driver {

	public static void main(String [] arg){
//Fish is actually  a data type
		Fish nemo = new Fish(); // nemo object, fish class

		nemo.Swim();
		nemo.color = "red";
		nemo.Swim();

		Fish dory = new Fish(); //another object
		dory.Swim();
		dory.color = "yellow";
		dory.Swim();
	}
}