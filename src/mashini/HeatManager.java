package mashini;

public class HeatManager extends Mchine{
    protected int power;

    public HeatManager(int power){
        this.power = power;
    }

    public boolean isMachineOverheating(){
        return false;
    }

    public boolean isWorking(int power){
        if(power>0.0){
            return true;
        }
        return false;
    }
}
