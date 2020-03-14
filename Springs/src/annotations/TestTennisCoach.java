package annotations;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestTennisCoach {

	public static void main(String[] args) {
		
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("AnnotationsComponent.xml");
		
		TennisCoach tc=context.getBean("tennisCoach",TennisCoach.class);
		FootBallCoach fbc=context.getBean("fbCoach",FootBallCoach.class);
		
		System.out.println(tc.getDailyWorkout());
		System.out.println(tc.getDailyFortune());
		
		fbc.showFootBallCoach();
		context.close();
	}

}
