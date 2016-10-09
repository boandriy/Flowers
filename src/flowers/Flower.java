package flowers;

public class Flower {
	protected boolean fresh = true; 
	protected double stemSize = 0;
	protected int price = 0;
	
	
	public void setPrice(int price){
		this.price = price;
	}
	public double getPrice(){
		return price;
	}
	
	public void setStemSize(double stemSize){
		this.stemSize = stemSize;
	}
	public double getStemSize(){
		return stemSize;
	}
}
