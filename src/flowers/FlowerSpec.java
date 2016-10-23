package flowers;

public class FlowerSpec {
	protected double stemSize;
	protected boolean fresh;
	protected int price;

	public FlowerSpec(double stemSize, boolean fresh, int price) {
		this.stemSize = stemSize;
		this.fresh = fresh;
		this.price = price;
	}
	public double getStemSize() {
		return stemSize;
	}
	public void setStemSize(double stemSize) {
		this.stemSize = stemSize;
	}
	public boolean isFresh() {
		return fresh;
	}
	public void setFresh(boolean fresh) {
		this.fresh = fresh;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
}
