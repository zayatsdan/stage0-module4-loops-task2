package school.mjc.stage0.loops.task2;

public class FactorialNumbers {
    public void printFactorialRow(int printToInclusive) {
         int counter=1;
        int lastFact=1;
        while (counter<=printToInclusive){
            System.out.println(counter*lastFact);
            lastFact=counter*lastFact;
            counter++;
        }

    }
}
