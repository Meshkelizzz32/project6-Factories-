package project4;

public class FanBelt extends Belt{
	public static class Factory implements project4.Factory<FanBelt>{
		public FanBelt create() {
			return new FanBelt();
		}
	}

}
