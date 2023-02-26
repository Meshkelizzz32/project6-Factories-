package project4;

public class CabinFilter extends Filter{
	public static class Factory implements project4.Factory<CabinFilter>{
		public CabinFilter create() {
			return new CabinFilter();
		}
	}
	}
