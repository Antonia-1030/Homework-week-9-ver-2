package mashini;

public class ProductionEngine extends HeatEngine {

    public ProductionEngine(int power){
        this.power = power;
    }

    public boolean isWorking(int power){
        if(power>0.0){
            return true;
        }
        return false;
    }
}
