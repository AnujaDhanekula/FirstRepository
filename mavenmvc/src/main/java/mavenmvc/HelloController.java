package mavenmvc;
import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class HelloController 
{	
	@RequestMapping("/test")
	public String sendMessage()
	{
	return "hello";
	}
	public String getMessage()
	{
		return "test";
	}
}
