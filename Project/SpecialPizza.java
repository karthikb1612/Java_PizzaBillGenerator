package Project;

public class SpecialPizza {
    int SpecialPizza;
    int ExtraCheeseForSpecial=50;
    int ExtraToppingsForSpecial=100;
    public SpecialPizza(String choice) {
        if(choice.equals("veg")){
            this.SpecialPizza=200;
        }else{
            this.SpecialPizza=350;
        }
    }
    void Extracheese(){
        this.SpecialPizza+=ExtraCheeseForSpecial;
    }
    void Extratoppings(){
        this.SpecialPizza+=ExtraToppingsForSpecial;
    }
    int SpecialBill(){
        return SpecialPizza;
    }
}
