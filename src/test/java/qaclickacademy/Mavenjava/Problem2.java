package qaclickacademy.Mavenjava;

import java.util.HashMap;
import java.util.Map;

public class Problem2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int day=31;
		int month=12;
		int year=1234;
		//int amount=1;
		GivenDate(day,month,year);
		
		
	}
	
	public static void GivenDate(int day,int month,int year)
	{
//		Map<Integer,Integer> map=new HashMap<Integer,Integer>();
//		map.put(1, 31);
//		map.put(2, 28);
//		map.put(3, 31);
//		map.put(4, 30);
//		map.put(5, 31);
//		map.put(6, 30);
//		map.put(7, 31);
//		map.put(8, 31);
//		map.put(9, 30);
//		map.put(10, 31);
//		map.put(11, 30);
//		map.put(12, 31);
//		
//		if(month==2 && checkisLeapYear(year))
//		{
//			if(checkisLeapYear(year))
//				map.put(2, 29);
//			else
//				map.put(2, 28);
//			
//		}
		
		
		if(day>=1 && day<=31 && month>=1 && month<=12)
		{
			if(day==31 && month==12)
			{
				month=1;
				day=1;
				year=year+1;
				nextDate(day,month,year);
				
			}
			else if(day==31 && (month==1 || month==3 || month==5 || month==7 || month==8 || month ==10) )
				//date=30/3
			{
				month=month+1;
				day=1;
				nextDate(day,month,year);
				
			}
			else if(day==30 && (month==4 || month==6 || month==9 || month==11) )
				//date=30/3
			{
				month=month+1;
				day=1;
				nextDate(day,month,year);
				
			}
			else if((month==2))
			{
				//28-2-2021-----//1-3-2021
				//28-2-2020-----//29-2-2020
				
				if(checkisLeapYear(year))
				{
					if(day==28)
					{
					day=day+1;
					nextDate(day,month,year);
					}
					else if(day==29)
					{
						day=1;
						month=month+1;
						nextDate(day,month,year);
						
					}
					
				}
				else
				{
					if(day==28)
					{
				month=month+1;
				day=1;
				nextDate(day,month,year);
					}
				}
			}
			else
			{
				day=day+1;
				nextDate(day,month,year);
			}
		}
//		if(day>=1 && day<=31 && month>=1 && month<=12)
//		{
//			if(day==31 && month==12)
//			{
//				month=1;
//				day=1;
//				year=year+1;
//				nextDate(day,month,year);
//				
//			}
//			else if(day==31 || day==30 || day==28 || day ==29)
//			{
//				month=month+1;
//				day=1;
//				nextDate(day,month,year);
//				
//			}
//			else
//			{
//				day=day+amount;
//				nextDate(day,month,year);
//			}
//		}
		
		
		
	}
	private static boolean checkisLeapYear(int year) {
		// TODO Auto-generated method stub
		
		if(year % 400==0 || (year % 4==0 && year % 100 !=0))
			return true;
		else
			return false;
	}

	public static void nextDate(int day,int month,int year)
	{
		System.out.println(day+" - "+month+" - "+year);
		
		
	}

}
