/* Enum
 * 
 * enumerators are constants
 * 
 * ex: 
 * 	
 * 	public enum DaysOfWeek {Sunday, Monday,..., Saturday}
 * 	DaysOfWekk v3;
 * 	v3 = DaysOfWeek.Monday;
 * 	v3 == v4
 * 
 */


public class Enum {
	
	public enum DaysOfWeek {Sunday, Monday, Tuesday, Wednesday, Thursday, Friday, Saturday};
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		DaysOfWeek today = DaysOfWeek.Monday;
//		DaysOfWeek someday = DaysOfWeek.valueOf("Monday");
//		System.out.println(someday);
//		System.out.println(DaysOfWeek.values());
		System.out.println(DaysOfWeek.Monday.ordinal());
		System.out.println(DaysOfWeek.Monday.toString());
		
	}

}
