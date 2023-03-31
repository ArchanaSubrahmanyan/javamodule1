package javaenums;

public class TestEnum {

	public static void main(String[] args) {

		DayOfWeek today = DayOfWeek.FRIDAY;
		System.out.println("Today is "+today.getName());
		
		
		switch(today) {
		
		case MONDAY:
			System.out.println("Work hard");
			break;
		case TUESDAY:
			System.out.println("Work little more");
			break;
		case WEDNESDAY:
			System.out.println("Work work little more");
			break;
		case THURSDAY:
			System.out.println("Work work more,WEEKEND IS AROUND");
			break;
		case FRIDAY:
			System.out.println("Yeah weekend has arrived");
		case SATURDAY:
			System.out.println("enjoy morning coffee , go shopping");
			break;
		case SUNDAY:
			System.out.println("do all cleaning works,SNOOOOZzz");
			break;
		
		}
		
	}

}
