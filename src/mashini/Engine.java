package mashini;


public class Engine extends Mchine {

    public Engine(int power){
        this.power = power;
    }

    public boolean isWorking(int power){
        if (power >0.0) {
            return true;
        }
        return false;
    }
}
