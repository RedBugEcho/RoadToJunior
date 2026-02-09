public class AttractionAdmissionSystem {
    public static boolean canRide (int height , boolean hasTicket){
        return height >= 140 && hasTicket;
    }

    public static void main(String[] args){
        boolean allowedOrNot = canRide(150,true);
        System.out.println(allowedOrNot);
    }
}
