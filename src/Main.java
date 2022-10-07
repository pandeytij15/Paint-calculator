public class Main {
    public static void main(String[] args) {

        int Room_weidth_metres = 3;
        double Room_height_metres = 2.7d;
        double Room_length_metres = 3.3d;
        double Room_surface_area_metre_squared = (2*Room_length_metres*Room_height_metres + Room_length_metres*Room_weidth_metres + 2*Room_height_metres*Room_weidth_metres);
        int Amount_of_paint_required_per_metre_squared_in_ml = 100;
        double Amount_of_paint_required_to_paint_room_in_ml = Amount_of_paint_required_per_metre_squared_in_ml * Room_surface_area_metre_squared;


        System.out.println(Amount_of_paint_required_to_paint_room_in_ml+"ml");
    }
}