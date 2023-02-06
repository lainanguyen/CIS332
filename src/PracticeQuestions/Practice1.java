package PracticeQuestions;

public class Practice1 {
    public static void main(String[] args) {
        //call methods here to test if they work
        System.out.println(volumeOfCylinder(10, 10));       // 3141.59
        int[] grades = {40, 100, 60, 23, 45};
        System.out.println(newAverage(grades));       // 61.25
        System.out.println(vowelCount("umbrella"));     // 3
    }

    static double volumeOfCylinder(double r, double h) {
        //Use the parameters r and h, and calculate
        return Math.PI * Math.pow(r, 2) * h;
        //the volume of that cylinder. return the answer

    }

    static double newAverage(int[] grades) {
        //Remove the lowest grade in the array, and then return the new average
        int lowestNum = Integer.MAX_VALUE;
        int lowestIndex = 0;
        for (int i = 0; i < grades.length; i++){
            if (grades[i] < lowestNum){
                lowestNum = grades[i];
                lowestIndex = i;
            }
        }
        double sum = 0;
        //add all sums except the lowest
        for (int i=0; i < grades.length; i++){
            if (i != lowestIndex){
                sum += grades[i];
            }
        }
        return sum / (grades.length-1);
    }

    static int vowelCount(String s) {
        //Use the parameter s, and calculate how many vowels (aeiou)
        //are contained in the string. Return that number.
        int myVowelCount = 0;
        for (int i=0; i < s.length(); i++){
            char c = s.charAt(i);
            if (c == 'a'|| c == 'e'|| c == 'i' || c == 'o' || c =='u'){
                myVowelCount++;
            }
        }
        return myVowelCount;
    }

}