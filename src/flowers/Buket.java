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
			System.out.println(flower.getStemSize());
		}
	}
	
	public void sortFlowers(){
		Flower[] sortedFlowers = new Flower[max];
		int count = 0;
		for (Flower flower:	flowers){
			if(flower.flowerSpec.fresh){
				sortedFlowers[count] = flower;
				count += 1;
			}
		}
		for (Flower flower: flowers){
			if(!flower.flowerSpec.fresh){
				sortedFlowers[count] = flower;
				count +=1;
			}
		}
		flowers = sortedFlowers;
	}
	public int price(){
		int price = 0; 
		for (Flower flower: this.flowers){
			price += flower.getPrice();
		}
		return price;
	}
	
	public Flower[] flowersByStem(int from,int to,Buket buket){
		int count = 0;
		
		for(Flower flower : buket.flowers){
			if(flower.getStemSize() >= from && flower.getStemSize() <= to){
				count += 1;
			}
		}
		Flower[] flowersByStemp = new Flower[count];
		int i = 0;
		for(Flower flower : buket.flowers){
			if(flower.getStemSize() >= from && flower.getStemSize() <= to){
				flowersByStemp[i] = flower;
				i++;
			}
		}
		
		return flowersByStemp;
	}
	public Flower [] getSpikeFlowers(){
		int count = 0;
		
		for(Flower flower : flowers){
			if(flower.hasSpikes()){
				count += 1;
			}
		}
		Flower[] spikesFlowers = new Flower[count];
		count = 0;
		for(Flower flower : flowers){
			if(flower.hasSpikes()){
				spikesFlowers[count++] = flower;
			}
		}
		return spikesFlowers;
	}
	public Flower[] search(FlowerSpec spec){
		int count = 0;
		for (Flower flower : flowers){
			if(flower.getPrice() == spec.getPrice() || flower.getStemSize() == spec.getStemSize() && flower.flowerSpec.fresh == spec.fresh){
				count += 1;
			}
		}
		count = 0;
		Flower[] foundFlowers = new Flower[count]; 
		for (Flower flower : flowers){
			if(flower.getPrice() == spec.getPrice() || flower.getStemSize() == spec.getStemSize() && flower.flowerSpec.fresh == spec.fresh){
				foundFlowers[count] = flower;
				count += 1;
			}
		}
		return foundFlowers;
	}
}
