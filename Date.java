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

   public int getDay () {
      return day;
   }

   public void setDay(int day) {
      if(day < 1 && day > 31) {
         throw new IllegalArgumentException("day invalid!");
      } else if (getMonth() == 2) {
         if(day == 30 || day == 31) {
            throw new IllegalArgumentException("invalid input of day for month of February!");
         } else if(day == 29) {
            //check if ang year kay leap year siya
            if(!(getYear() % 4 == 0 && getYear() % 100 == 0 && getYear() % 400 == 0)) {
               throw new IllegalArgumentException("The year you inputted is not a leap year, therefore setting the day to 29 is invalid");
             } 
         }
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
}
