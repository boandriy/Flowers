package flowers;

abstract public class Flower {
	
	protected FlowerSpec flowerSpec;
	FlowerColor color = FlowerColor.NO_COLOR;
	
	public Flower (FlowerSpec flowerSpec) {
		this.flowerSpec = flowerSpec; 
	}
	
	public void setPrice(int price){
		this.flowerSpec.setPrice(price);;
	}
	public double getPrice(){
		return flowerSpec.getPrice();
	}
	
	public void setStemSize(double stemSize){
		flowerSpec.setStemSize(stemSize);;
	}
	public double getStemSize(){
		return flowerSpec.getStemSize();
	}
	
	public FlowerColor getColor() {
		return color;
	}
	
	public void setColor(FlowerColor color) {
		this.color = color;
	}

	abstract boolean hasSpikes();
}
