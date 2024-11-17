import java.util.Scanner;
public class Calculate {
    static Scanner sc = new Scanner(System.in);
    public static void Theory(){
        System.out.println("First MST");
        float MST1 = sc.nextFloat();
        MST1 = (MST1*10)/20;
        System.out.println("MST2");
        float MST2 = sc.nextFloat();
        MST2 = (MST2*10)/20;
        System.out.println("Assignment");
        float ASS = sc.nextFloat();
        System.out.println("Quiz");
        float Q = sc.nextFloat();
        System.out.println("Surprise Test");
        float ST = sc.nextFloat();
        ST = (ST*4)/12;
        System.out.println("Attendence");
        float att = sc.nextFloat();
        float Total = MST1 + MST2 + ST + ASS + Q +att;
        System.out.println("Total: ");
        System.out.print(Total);
    }
    public static void praticle(){
        float[] inputs = new float[10];
        float sum = 0;

        System.out.println("Please enter 10 integers:");

        for (int i = 0; i < 10; i++) {
            System.out.print("Praticle " + (i + 1) + ": ");
            inputs[i] = sc.nextFloat();
            sum += inputs[i];
        }
        double average = sum / 10.0;
        average = (average/30)*20;

        System.out.println("Praticle marks");
        float praticle = sc.nextFloat();
        praticle = praticle*4/10;

        System.out.println("Portfolio");
        float pro = sc.nextFloat();

        System.out.println("Attendence");
        float att = sc.nextFloat();

        System.out.println("Surprise Test");
        float ST = sc.nextFloat();
        ST = (ST*4)/12;

        System.out.println("First MST");
        float MST1 = sc.nextFloat();
        System.out.println("MST2");
        float MST2 = sc.nextFloat();
        float totalmst = MST1 + MST2;
        totalmst = totalmst*10/40;

        System.out.println("Assignment");
        float ass = sc.nextFloat();
        ass = ass*6/10;

        System.out.println("Quiz");
        float Q = sc.nextFloat();

        System.out.println(totalmst);

        double Total = average + praticle + att + ass + pro + Q;

        System.out.println(average);
        System.out.println(Total);

    }

    public static void Both(){
        float[] inputs = new float[10];
        float sum = 0;

        System.out.println("Please enter 10 integers:");

        for (int i = 0; i < 10; i++) {
            System.out.print("Praticle " + (i + 1) + ": ");
            inputs[i] = sc.nextFloat();
            sum += inputs[i];
        }
        double average = sum / 10.0;
        average = (average/30)*40;

        System.out.println("Praticle marks: ");
        float praticle = sc.nextFloat();
        praticle = praticle*12/10;

        System.out.println("Attendence");
        float att = sc.nextFloat();

        System.out.println("Assignment");
        float ass = sc.nextFloat();

        double Total = average + praticle + att + ass;

        System.out.println(average);
        System.out.println(Total);
    }

    public static void main(String[] args) {
        praticle();
    }
}