package observer.consumers;

import observer.iface.WeatherObserver;

public class TVChannel implements WeatherObserver{

	
public void doUpdate(int temperature) {
		
		System.out.println("TV channel updating temperature " + temperature);
		//boolean result = new NewsPapers() instanceof WeatherObserver;
		//System.out.println(result);

	}
}
