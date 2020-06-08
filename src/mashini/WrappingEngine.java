package mashini;

public class WrappingEngine extends HeatManager {

    public WrappingEngine(int power){
        this.power = power;
    }

    public boolean isWorking(int power){
        if(power>0.0){
            return true;
        }
        return false;
    }
}
