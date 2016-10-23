package flowers;

public class Tulips extends Flower {

	public Tulips(FlowerSpec flowerSpec) {
		super(flowerSpec);
		setColor(FlowerColor.YELLOW);
	}

	public boolean hasSpikes(){
		return false;
	}
	
	
	
}
