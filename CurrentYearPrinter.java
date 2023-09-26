import java.util.Calendar;

class CurrentYearPrinter
{
	public static void main(String []args)
	{
		//Getting Current Year
		int currentYear = Calendar.getInstance().get(Calendar.YEAR);
	
		//Printing the current Year
		System.out.println("Current Year is "+currentYear);
	}
}