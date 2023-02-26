package project4;

public class OilFilter extends Filter{
	public static class Factory implements project4.Factory<OilFilter>{
		public OilFilter create() {
			return new OilFilter();
		}
	}
	}