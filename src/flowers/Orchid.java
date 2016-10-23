package flowers;

public class Orchid extends Flower {

	public Orchid(FlowerSpec flowerSpec) {
		super(flowerSpec);
		setColor(FlowerColor.WHITE);
	}

	@Override
	boolean hasSpikes() {
		return false;
	}
	
}
