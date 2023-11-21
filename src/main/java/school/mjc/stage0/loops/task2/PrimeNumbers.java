package school.mjc.stage0.loops.task2;

public class PrimeNumbers {
    public void printPrimeNumbers(int printToInclusive) {
        int counter=1;
        int step=1;
        int notSim=0;
        while(counter<=printToInclusive){
            while (step<counter){
                if(counter%step!=0){
                    step++;
                }
                else {
                    notSim++;
                    break;
                }
            }
            if(notSim==0){
                System.out.println(counter);
            }
            else {
                notSim=0;
            }
            step=2;
            counter++;
        }
    }
}
