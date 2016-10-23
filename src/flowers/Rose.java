package flowers;

public class Rose extends Flower{

	public Rose(FlowerSpec flowerSpec){
		super(flowerSpec);
		setColor(FlowerColor.RED);
	}

	@Override
	boolean hasSpikes() {
		return true;
	}
}