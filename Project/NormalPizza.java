package Project;

public class NormalPizza {
    int NormalPizza;
    int ExtraCheeseForNormal=50;
    int ExtraToppingsForNormal=100;

    public NormalPizza(String choice) {
        if(choice.equals("veg")){
            this.NormalPizza=150;
        }
        else{
            this.NormalPizza=250;
        }
    }
    public void Extracheese(){
        this.NormalPizza+=ExtraCheeseForNormal;
    }
    void Extratoppings(){
        this.NormalPizza+=ExtraToppingsForNormal;
    }
    int NormalBill(){
        return NormalPizza;
    }
}
