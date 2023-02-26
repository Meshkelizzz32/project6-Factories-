package project4;

public class PowerSteeringBelt extends Belt{
	public static class Factory implements project4.Factory<PowerSteeringBelt>{
		public PowerSteeringBelt create() {
			return new PowerSteeringBelt();
		}
	}

}