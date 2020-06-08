package mashini;

public abstract class Mchine {
    protected int power;
    protected int height;
    protected String color;

    public int getPower(){
        return this.power;
    }
    public void setPower(int powerInput){
        this.power = powerInput;
    }

    public int getHeight(){
        return this.height;
    }
    public void setHeight(int heightInput){
        this.height = heightInput;
    }

    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }

    public boolean isWorking(int power){
        if(power>0.0){
            return true;
        }
        return false;
    }
}
