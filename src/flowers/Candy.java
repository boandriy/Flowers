package flowers;

public class Candy {
	protected double weight = 0;
	protected int sugar = 0;
	protected boolean healthy = true; 
	
	public void setWeight(double weight){
		this.weight = weight;
	}
	public double getWeight(){
		return weight;
	}
	
	public void setSugar(int sugar){
		this.sugar = sugar;
	}
	public double getSugar(){
		return sugar;
	}
}
