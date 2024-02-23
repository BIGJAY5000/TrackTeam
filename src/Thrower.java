public class Thrower extends Athlete{
    //attributes

    private double shotPR;
    private double discusPR;

    //constructors
    public Thrower(String firstName, String lastName, int gradeLevel, int pointsEarned, double shotPR, double discusPR){
        super(firstName, lastName, gradeLevel, pointsEarned);
        addEvent("Shot Put");
        addEvent("Discus");
        setDiscusPR(discusPR);
        setShotPR(shotPR);
    }
    //mutators

    public void setShotPR(double shotPR) {
        if (shotPR >= 0 && shotPR <= 80) {
            this.shotPR = shotPR;
        } else {
            this.shotPR = 0;
        }
    }
    public void setDiscusPR(double discusPR) {
        if (discusPR >= 0 && discusPR <= 240) {
            this.discusPR = discusPR;
        } else {
            this.discusPR = 0;
        }
    }
    //accessors
    public double getDiscusPR() {
        return discusPR;
    }

    public double getShotPR() {
        return shotPR;
    }

    public String toString(){
        return super.toString() + "\n Shot Put PR (ft)" + getShotPR() + "\nDiscus PR (ft)" + getDiscusPR();
    }
}
