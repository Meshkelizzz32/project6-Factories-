package project4;

public class FuelFilter extends Filter{
public static class Factory implements project4.Factory<FuelFilter>{
	public FuelFilter create() {
		return new FuelFilter();
	}
}
}
