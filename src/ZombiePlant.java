public class ZombiePlant {
    private int potency;
    private int treatments;

    public ZombiePlant(int userPotency, int userTreatments) {
        potency = userPotency;
        treatments = userTreatments;
    }

    public int treatmentsNeeded(){
        return treatments;
    }
    public int getPotencyRequired(){
        return potency;
    }

    public boolean isDangerous(){
        if (treatments == 0){
            return false;
        }
        return true;
    }
    public void treat(int input){
       if(isDangerous() == true){
            if (input <= potency && input > 0){
                treatments = treatments - 1;
            }
            if (input > potency){
                treatments = treatments + 1;
            }
        } else if (isDangerous() == false) {
            if (input > potency){
                treatments = treatments + 1;
            }        }
    }
}