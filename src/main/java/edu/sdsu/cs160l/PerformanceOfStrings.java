package edu.sdsu.cs160l;

public class PerformanceOfStrings {
    public double concatenateString(int num) {

        String s = "";
        long timeBeforeExec = System.nanoTime();

        // Test Logic
        for (int i = 0; i < num; i++) {
            s = s + "o";
        }

        long timeAfterExec = System.nanoTime();

        // Calculate elapsed time and convert it to seconds
        return (double) (timeAfterExec - timeBeforeExec) / Math.pow(10, 9);
    }

    public double concatenateStringBuilder(int num) {

        StringBuilder s = new StringBuilder();
        long timeBeforeExec = System.nanoTime();

        for(int i=0;i<num;i++){
            s.append("o");
        }

        long timeAfterExec = System.nanoTime();

        // Calculate elapsed time and convert it to seconds
        return (double) (timeAfterExec - timeBeforeExec) / Math.pow(10, 9);
    }

    public void runAndPrintTimes(){
        System.out.println("\t\t"+"| String\t\t"+"| String Builder");
        for(int i=50000;i<=250000;i+=50000){
            System.out.println("\t\t"+"| "+concatenateString(i)+"\t\t"+"| "+concatenateStringBuilder(i));
        }
    }

    public static void main(String[] args) {
        PerformanceOfStrings strings = new PerformanceOfStrings();
        strings.runAndPrintTimes();
    }

}
