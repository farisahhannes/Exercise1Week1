//author: farisah hannes
public class Driver {

	public static void main(String [] arg){
//Fish is actually  a data type
		Fish nemo = new Fish(); // nemo object, fish class

		nemo.Swim();
		//nemo.color = "red";
		nemo.Swim();
		//tukar value
		nemo.SetColor("red"); //change here
		nemo.Swim();

		//nemo.Eat(); //superclass call subclass method

		Shark fiery = new Shark();
		fiery.Eat();
		fiery.Swim();
		fiery.SetSharpTeeth(130);
		fiery.Eat();

		//Fish dory = new Fish(); //another object
		//dory.Swim();
		//dory.color = "yellow";
		//dory.SetColor("yellow");
		//dory.Swim();

		//Aquirium fancyAquirium = new Aquirium();
		//fancyAquirium.fillFish();
	}
}