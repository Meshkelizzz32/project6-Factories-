package project4;
import java.util.*;

public class Part {
public String toString() {
	return getClass().getSimpleName();
}
static  List<Factory<? extends Part>> partFactories=new ArrayList<Factory<? extends Part>>();
static {
	partFactories.add(new FuelFilter.Factory());
	partFactories.add(new AirFilter.Factory());
	partFactories.add(new CabinFilter.Factory());
	partFactories.add(new OilFilter.Factory());
	partFactories.add(new FanBelt.Factory());
	partFactories.add(new PowerSteeringBelt.Factory());
	partFactories.add(new GeneratorBelt.Factory());
	}
private static Random rand=new Random();
public static Part createRandom() {
int n=rand.nextInt(partFactories.size());
return partFactories.get(n).create();
}
}
