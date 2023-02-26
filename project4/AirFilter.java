package project4;

public class AirFilter extends Filter{
	public static class Factory implements project4.Factory<AirFilter>{
		public AirFilter create() {
			return new AirFilter();
		}
	}
	}
