/*
 * A Test Driver for the Date class.
 */
public class Date {

   private int year;
   private int month;
   private int day;

   public Date() {
      this.day = 1;
      this.month = 1;
      this.year = 1000;
   }

   public Date(int year, int month, int day) {
      this.year = year;
      this.month = month;
      this.day = day;
   }

   public int getYear() {
      return year;
   }

   public void setYear(int year) {
      if(year < 1000 && year > 9999) {
         throw new IllegalArgumentException("year invalid!");
     }
      this.year = year;
   
   }

   public int getMonth() {
      return month;
   }

   public void setMonth(int month) {
      if(month < 1 && month > 12) {
         throw new IllegalArgumentException("month invalid!");
      }
      this.month = month;
   }

   public int getDay() {
      return day;
   }

   public void setDay(int day) {
      if(day < 1 && day > 31) {
         throw new IllegalArgumentException("day invalid!");
      } else if (getMonth() == 2) {
         
      }
      this.day = day;
   }

   public void setDate(int year, int month, int day) {
      setYear(year);
      setMonth(month);
      setDay(day);
   }

   public String toString() {
      String formattedDate = String.format("%d/%d/%d", this.day, this.month, this.year);
      return formattedDate;
   }

   public static void main(String[] args) {
      // Test constructor and toString()
      Date d1 = new Date(2016, 4, 6);
      System.out.println(d1);  // toString()
 
      // Test Setters and Getters
      d1.setYear(2012);
      d1.setMonth(12);
      d1.setDay(23);
      System.out.println(d1.toString());  // run toString() to inspect the modified instance
      System.out.println("Year is: " + d1.getYear());
      System.out.println("Month is: " + d1.getMonth());
      System.out.println("Day is: " + d1.getDay());
 
      // Test setDate()
      d1.setDate(2988, 1, 2);
      System.out.println(d1.toString());  // toString()

      Date d2 = new Date();
      System.out.println(d2.toString());  // toString()

   }
}
