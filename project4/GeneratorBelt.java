package project4;

public class GeneratorBelt extends Belt{
	public static class Factory implements project4.Factory<GeneratorBelt>{
		public GeneratorBelt create() {
			return new GeneratorBelt();
		}
	}

}