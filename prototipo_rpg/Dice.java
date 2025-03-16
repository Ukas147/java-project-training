package prototipo_rpg;
import java.util.Random;

public class Dice {
    Random random = new Random();

    private int valueDice;

    protected int dice2(){
        setValueDice(random.nextInt(2));
        System.out.println("Dado 2: " + getValueDice());
        return getValueDice();
    }

    protected int dice4(){
        setValueDice(random.nextInt(4));
        System.out.println("Dado 4: " + getValueDice());
        return getValueDice();
    }

    protected int dice6(){
        setValueDice(random.nextInt(6));
        System.out.println("Dado 6: " + getValueDice());
        return getValueDice();
    }

    protected int dice8(){
        setValueDice(random.nextInt(8));
        System.out.println("Dado 8: " + getValueDice());
        return getValueDice();
    }

    protected int dice10(){
        setValueDice(random.nextInt(10));
        System.out.println("Dado 10: " + getValueDice());
        return getValueDice();
    }

    protected int dice20(){
        setValueDice(random.nextInt(20));
        System.out.println("Dado 20: " + getValueDice());
        return getValueDice();
    }

    private int getValueDice() {
        return valueDice + 1;
    }

    private void setValueDice(int valueDice) {
        this.valueDice = valueDice;
    }
}