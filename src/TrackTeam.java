import java.util.ArrayList;
public class TrackTeam {
    public static void main(String[] args) {
        //create coach object
        ArrayList <Coach> coaches = new ArrayList<Coach>();
        ArrayList <Thrower> throwers = new ArrayList<Thrower>();



        Coach c1 = new Coach("Emory", "George", "Throws", false);
        Coach c2 = new Coach("John", "Jarvis", "Distance", true);

        coaches.add(c1);
        coaches.add(c2);
        System.out.println("Coaches");
        for (Coach c: coaches) {
            System.out.println(c);
            System.out.println();
        }

        Thrower t1 = new Thrower("Jason", "Ocampo", 12, 0, 31, 97);
        Thrower t2 = new Thrower("Dalton", "Sali", 12, 0, 27, 86);

        throwers.add(t1);
        throwers.add(t2);
        System.out.println("Throwers");
        for (Thrower t: throwers) {
            System.out.println(t);
            System.out.println();
        }

        t1.setShotPR(36);
        t2.setDiscusPR(105);
        for (Thrower t: throwers) {
            System.out.println(t);
            System.out.println();
        }

//        Athlete p1 = new Athlete("Emory", "George", 9, 0);
//        System.out.println(c1);
//        System.out.println();
//        System.out.println(c2);
//        p1.addEvent("Shot Put");
//        p1.addEvent("Discus");
//        p1.addPoints(20);
//        System.out.println();

//        //just print name
//        System.out.println(c1.getFirstName());
//        System.out.println();
    }
}
