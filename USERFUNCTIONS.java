import javax.swing.JOptionPane;
public class USERFUNCTIONS
{
    public void preDefFunctionsA() {
        float myValue = -3.7f;
        int newValue = (int) myValue;
        int nextValue = Math.abs(newValue);
        System.out.println(myValue);
        System.out.println(newValue);
        System.out.println(nextValue);
    }

    public void preDefFunctionsB() {
        String myValue = "hippopotamus";
        String newValue = myValue.substring(0,4);
        String nextValue = myValue.substring(myValue.length()-3,myValue.length());
        String lastValue = myValue.substring(3,4);
        System.out.println(myValue);
        System.out.println(newValue);
        System.out.println(nextValue);
        System.out.println(lastValue);
    }

    public int getValidInteger() {
        int userInput = Integer.parseInt(JOptionPane.showInputDialog("Enter number"));
        while ((userInput < 1) || (userInput > 10)) {
            System.out.println("Input muxt be between 1 and 10");
            userInput = Integer.parseInt(JOptionPane.showInputDialog("Enter number"));
        }
        return userInput;
    }
    
        public String getValidName() {
        String userInput = JOptionPane.showInputDialog("Enter name");
        while ((userInput.length() < 1) || (userInput.length() > 10)) {
            System.out.println("Length must be between 1 and 10");
            userInput = JOptionPane.showInputDialog("Enter name");
        }
        return userInput;
    }
    
    public void enterHealthData() {
        int age = getValidRange("age", 17, 130);
        int heightCM = getValidRange("Height", 140, 200);
        int weightKG = getValidRange("Weight", 40, 170);
        float BMI = (float) (weightKG * 10000) /(heightCM * heightCM);
        System.out.println("Age: " + age + "BMI: " + BMI);
    }
    
    public int getValidRange(String data, int lower, int upper) {
        int userInput = Integer.parseInt(JOptionPane.showInputDialog("Enter " + data));
        while ((userInput < lower) || (userInput > upper)) {
            System.out.println("Input must be between " + lower + " and " + upper);
            userInput = Integer.parseInt(JOptionPane.showInputDialog("Enter " + data));
        }
        return userInput;
    }
}