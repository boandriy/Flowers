package flowers;

public class Main {

	public static void main(String[] args) {
		//Flowers
		Orchid orch1 = new Orchid(new FlowerSpec(10,true,25));
		Rose rose1 = new Rose(new FlowerSpec(10,true,25));
		Tulips tulip1 = new Tulips(new FlowerSpec(10,true,25));
		Tulips tulip2 = new Tulips(new FlowerSpec(10,true,25));
		Rose rose2 = new Rose(new FlowerSpec(10,true,25));
		Buket buket = new Buket();
		buket.addFlower(orch1);
		buket.addFlower(rose1);
		buket.addFlower(tulip1);
		buket.addFlower(tulip2);
		buket.addFlower(rose2);
		buket.sortFlowers();
		buket.displayStemp();
		for(Flower flower: buket.getSpikeFlowers()){
			System.out.println(flower.getStemSize());
		}
		
		
		//Presents
		Sinikers snik = new Sinikers(3,false);
		Lien l = new Lien(1,true);
		Nuts nut = new Nuts(2,true);
		Sinikers snik1 = new Sinikers(5,false);
		Nuts nut1 = new Nuts(4,true);
		Present present = new Present();
		present.addCandy(snik);
		present.addCandy(l);
		present.addCandy(nut);
		present.addCandy(snik1);
		present.addCandy(nut1);
		double weight = present.presentWeight();
		System.out.println(weight);
		present.sortPresent();
		Candy sugerCandy = present.findCandy(8, 12);
	}

}
