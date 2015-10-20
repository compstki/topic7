public class VALUEANDREFERENCE
{
    int score = 5000;

    public void calculate() {
        int score = 100;
        addExtra(score);
        System.out.println("Score A " + score);
    }

    public void addExtra(int value) {
        int bonus = 50;
        value = value + bonus;
        System.out.println("Final value " + value);
    }

    public void calculateB() {
        int scores[] = {100,200};
        addExtraB(scores);
        for (int i=0;i<scores.length;i++) {
            System.out.println("Final value " + scores[i]);
        }
    }

    public void addExtraB(int[] values) {
        int bonus = 50;
        for (int i=0;i<values.length;i++) {
            values[i] = values[i] + bonus;
        }
    }

}
