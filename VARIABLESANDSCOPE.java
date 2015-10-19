
public class VARIABLESANDSCOPE
{
    int score = 5000;

    public void methodA() {
        int score = 100;
        System.out.println("Score A " + score);
    }

    public void methodB() {
        int score = 200;
        int bonus = 50;
        score = score + bonus;
        System.out.println("Score B " + score);
    }

    public void methodC() {
        int bonus = 30;
        score = score + bonus;
        System.out.println("Score C " + score);
    }

    public void methodD() {
        //System.out.println("Score D " + score);
   }

}
