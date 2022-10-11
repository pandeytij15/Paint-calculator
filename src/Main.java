import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

    Scanner user_input = new Scanner(System.in);
    // declaring room dimensions in metres (line 8-11 using user input)
        double RoomWeidth;
        System.out.println("Enter Weidth of room: ");
        RoomWeidth = user_input.nextDouble() ;

        double RoomHeight;
        System.out.println("Enter Height of room: ");
        RoomHeight = user_input.nextDouble() ;

        double RoomLength;
        System.out.println("Enter Length of room: ");
        RoomLength = user_input.nextDouble() ;

        int Dulux_PricePerLitre = 4;
        int CraigAndRose_PricePerLitre = 16;
        int FarrowBall_PricePerLitre = 20;
        double AmountOfPaint_In_A_Tin_ml = 2500;
        double RoomSurfaceArea = (2 * RoomLength * RoomHeight + RoomLength * RoomWeidth + 2 * RoomHeight * RoomWeidth);
        int AmountOfPaintRequired_PerMetreSquared_In_ml = 100;
        double AmountOfPaintRequiredToPaintRoom_in_ml = AmountOfPaintRequired_PerMetreSquared_In_ml * RoomSurfaceArea;


        System.out.println("Amount of paint needed "+AmountOfPaintRequiredToPaintRoom_in_ml + " ml");
    // Type of paint to be used
        String Type_of_paint = "Dulux";
        switch (Type_of_paint) {
            case "Dulux":
                System.out.println("Dulux is £"+ Dulux_PricePerLitre + " per Litre");
                break;
            case "CraigAndRose":
                System.out.println("CraigAndRose is £" + CraigAndRose_PricePerLitre+ " per Litre");
                break;
            case "Farrow_Ball":
                System.out.println("Farrow_Ball is £" + FarrowBall_PricePerLitre+" per Litre");
        }
    // Taking in account for windows,switches and doors area in m^2

    double[] obstructions_area =  {0.0036,1.2,2}; // Array containing {area of switch,area of window, area of door}
     for (int i = 0;i<obstructions_area.length;i++)   {
         RoomSurfaceArea = RoomSurfaceArea - obstructions_area[i];

     }
        System.out.println("Considering obstruction area required to be painted is "+RoomSurfaceArea+" m^2");


     // Number of Paint tins required
    for (int Number_of_Tins=0;AmountOfPaintRequiredToPaintRoom_in_ml>0;Number_of_Tins++)
    {
        AmountOfPaintRequiredToPaintRoom_in_ml = AmountOfPaintRequiredToPaintRoom_in_ml- AmountOfPaint_In_A_Tin_ml;
        if (AmountOfPaintRequiredToPaintRoom_in_ml<0)
        System.out.println("We need " + (Number_of_Tins+1) +" Tins of 2.5L paint");
    }






    }
}