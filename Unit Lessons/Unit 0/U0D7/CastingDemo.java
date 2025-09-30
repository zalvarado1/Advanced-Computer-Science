public class CastingDemo{

    public static void main(String[] args) {
         // implicit casting
         // storing smaller data types into larger ones
         // happens automatically

         int smallNumber = 100;
         long bigNumber = smallNumber; // int to long
         float decimalNumber = bigNumber; // long to float
         double largeDeciminal = decimalNumber; // float to double

         // Explicit Cating
         // we are MANUALLY converting a data type, 
         // usually to a different data type that may incur data loss

         double pi = 3.14;
         int engineerPi = (int) pi; // truncation - you lose all decimals
         System.err.println(engineerPi);
         pi = engineerPi;
         System.err.println(pi);

         long population = 300L;
         int limitedPopulation = (int) population;

         System.out.println(Integer.MAX_VALUE);
         System.out.println(Integer.MIN_VALUE);
         
         // there is no implicit or explicit casting between nooleans and integers

         // we're not gonna talk about casting objects.
         


    }
}