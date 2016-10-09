package flowers;

public class Present {
	private int max = 5;
	private Candy[] candys = new Candy[max];
	private double weight = 0;
	
	private int lastIndex = 0;
	
	// update test
	public void addCandy(Candy nw){
		candys[lastIndex] = nw;
		weight += nw.getWeight();
		lastIndex++;
	}
	public double presentWeight(){
		return weight;
	}
	
	public void sortPresent(){
		 Candy[] sortetCandys = new Candy[max];
		 int count = 0;
		 for(Candy candy: candys){
			 if(candy.healthy){
				 sortetCandys[count] = candy;
				 count ++;
			 }
		 }
		 for(Candy candy: candys){
			 if(!candy.healthy){
				 sortetCandys[count] = candy;
				 count ++;
			 }
		 }
		 candys = sortetCandys;
	}
	
	public Candy findCandy(double from, double to){
		for(Candy candy: candys){
			if(candy.getSugar()>= from && candy.getSugar() <= to){
				return candy;
			}
			else{
				System.out.println("No candy whith requested sugar, but i would recomend you this candy! =)");
			}
		}
		return candys[0];
		
	}
}
