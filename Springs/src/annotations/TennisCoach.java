package annotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class TennisCoach {
	private FortuneService fortuneService;
	@Autowired
	public TennisCoach(FortuneService thefortuneService)
	{
		fortuneService=thefortuneService;
	}
public String getDailyWorkout()
{
	
	return "Do Workout Regularly.........";
}
public String getDailyFortune()
{
	
	return fortuneService.getFortune();
}

}
