
import javax.swing.JOptionPane;

public class PaintJobEstimator {
   
    
    
    public static void main(String[] args) {
        final double chargePerHour = 18.00;
        int userNumberOfRooms = numberOfRooms();
        double totalWallSpace = getTotalWallSpace(userNumberOfRooms);
        double priceOfPaintPerGallon = priceOfPaintPerGallon();
        double gallonsOfPaintRequired = calculateGallonsOfPaintRequired(totalWallSpace);
        double hoursOfLaborRequired = calculateHoursOfLaborRequired(totalWallSpace);
        double costOfPaint = calculateCostOfPaint(priceOfPaintPerGallon, gallonsOfPaintRequired);
        double laborCharges = calculateLaborCharges(hoursOfLaborRequired, chargePerHour);
        double totalCost = calculateTotalCost(laborCharges, costOfPaint);
        displayDataOnScreen(userNumberOfRooms,totalWallSpace,priceOfPaintPerGallon,
                gallonsOfPaintRequired,hoursOfLaborRequired,costOfPaint,laborCharges,totalCost);
        System.exit(0);
    }
    public static int numberOfRooms(){
        String userInputString;
        int userNumberOfRooms;
        userInputString = JOptionPane.showInputDialog("Please enter the number of rooms to be Painted");
        userNumberOfRooms = Integer.parseInt(userInputString);
        return userNumberOfRooms;
    }
   public static double priceOfPaintPerGallon(){
        String userInputString;
        double priceOfPaint;
        userInputString = JOptionPane.showInputDialog("Please enter the price of the paint");
        priceOfPaint = Double.parseDouble(userInputString);
        return priceOfPaint;
   }
  public static double getTotalWallSpace(int numberOfRooms){
      String userInputString;
      double squareFeetOfWallSpace;
      double totalSquareFeet = 0;
      for(int currentRoom = 1; currentRoom<= numberOfRooms; currentRoom++){
      userInputString  =  JOptionPane.showInputDialog("Please enter the square feet of wall space in room " + currentRoom);
      squareFeetOfWallSpace = Double.parseDouble(userInputString);
      totalSquareFeet +=squareFeetOfWallSpace;
      }
      return totalSquareFeet;
  }
  public static double calculateGallonsOfPaintRequired(double totalWallSpace){
    double gallonsOfPaintRequired = (totalWallSpace / 115);  
    return gallonsOfPaintRequired;
  }
   public static double calculateHoursOfLaborRequired(double totalWallSpace){
    double hoursOfLaborRequired = (totalWallSpace / 115) * 8 ;  
    return hoursOfLaborRequired;
   }
   public static double calculateCostOfPaint(double priceOfPaintPerGallon, double gallonsOfPaintRequired){
      double costOfPaint = priceOfPaintPerGallon * gallonsOfPaintRequired;
      return costOfPaint;
   }
   public static double calculateLaborCharges(double pricePerHour, double hoursRequired){
       double totalLaborCharges = pricePerHour * hoursRequired;
       return totalLaborCharges;
   }
   public static double calculateTotalCost(double totalLaborCharges, double costOfPaint){
       double totalCost = totalLaborCharges + costOfPaint;
       return totalCost;
   }
   public static void displayDataOnScreen(int userNumberofRooms, 
           double totalWallSpace, double priceOfPaintPerGallon, 
           double gallonsOfPaintRequired, double hoursOfLaborRequired, 
           double costOfPaint, double laborCharges, double totalCost){
       
       String outputString = String.format("User number of rooms: %d\n"
               + "Total wall space: %.2f\n"
               + "Price of paint per gallon: $%,.2f\nGallons of paint required:%.1f\n"
               + "Hours of labor required: %.1f\nCost of paint: $%,.2f\n"
               + "Labor Charges: $%,.2f\nTotal Cost: $%,.2f",userNumberofRooms,
               totalWallSpace,priceOfPaintPerGallon,gallonsOfPaintRequired,
               hoursOfLaborRequired,costOfPaint,laborCharges,totalCost);
       JOptionPane.showMessageDialog(null, outputString);
   }
    
    
    }

