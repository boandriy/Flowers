package flowers;

public class Main {

	public static void main(String[] args) {
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
		
	}

}
