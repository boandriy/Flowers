package flowers;

public class Main {

	public static void main(String[] args) {
		//Flowers
		Orchid orch1 = new Orchid(10,true);
		Orchid orch2 = new Orchid(15.5,false);
		Tulips tulip1 = new Tulips(13.2, true);
		Tulips tulip2 = new Tulips(24, true);
		Tulips tulip3 = new Tulips(18, false);
		Buket buket = new Buket();
		buket.addFlower(orch1);
		buket.addFlower(orch2);
		buket.addFlower(tulip1);
		buket.addFlower(tulip2);
		buket.addFlower(tulip3);
		buket.sortFlowers();
		buket.displayStemp();
		
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
