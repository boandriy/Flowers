package flowers;

public class Buket {
	private int max = 5;
	private Flower[] flowers = new Flower[max];
	
	private int lastIndex = 0;
	
	// update test
	public void addFlower(Flower nw){
		flowers[lastIndex] = nw;
		lastIndex++;
	} 
	public void displayStemp(){
		for(Flower flower: this.flowers){
			System.out.println(flower.stemSize);
		}
	}
	
	public void sortFlowers(){
		Flower[] sortedFlowers = new Flower[max];
		int count = 0;
		for (Flower flower:	flowers){
			if(flower.fresh){
				sortedFlowers[count] = flower;
				count += 1;
			}
		}
		for (Flower flower: flowers){
			if(!flower.fresh){
				sortedFlowers[count] = flower;
				count +=1;
			}
		}
		flowers = sortedFlowers;
	}
	public int price(){
		int price = 0; 
		for (Flower flower: this.flowers){
			price += flower.price;
		}
		return price;
	}
	
	public Flower[] flowersByStem(int from,int to,Buket buket){
		int count = 0;
		
		for(Flower flower : buket.flowers){
			if(flower.stemSize >= from && flower.stemSize <= to){
				count += 1;
			}
		}
		Flower[] flowersByStemp = new Flower[count];
		int i = 0;
		for(Flower flower : buket.flowers){
			if(flower.stemSize >= from && flower.stemSize <= to){
				flowersByStemp[i] = flower;
				i++;
			}
		}
		
		return flowersByStemp;
	}
}
