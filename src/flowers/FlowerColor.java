package flowers;

public enum FlowerColor {
	RED, BLUE, GREEN, WHITE, YELLOW, NO_COLOR;
	
	@Override
	public String toString() {
		switch(this) {
			case RED: return "RED";
			case BLUE: return "BLUE";
			case GREEN: return "GREEN";
			case WHITE: return "WHITE";
			case YELLOW: return "YELLOW";
			default: return "NO_COLOR";
		}
	}

}
