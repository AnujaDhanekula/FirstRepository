package Examples;

public class SwitchStringStatement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String color="Blue";
		String shirt ="shirt";
		switch (color)
		{
		case "blue": 
			shirt  ="blue" + shirt;
			break;
		case "red":
			shirt  = "red" + shirt;
			break;
		default:
			shirt ="white" +  shirt;
			break;
		}
		System.out.println("shirt type:  "  +shirt);
	};

}
