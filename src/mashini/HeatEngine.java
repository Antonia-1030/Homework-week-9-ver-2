package mashini;

public class HeatEngine extends HeatManager {

    public HeatEngine(int power){
        this.power = power;
    }

    public boolean isWorking(int power){
        if(power>0.0){
            return true;
        }
        return false;
    }
}
