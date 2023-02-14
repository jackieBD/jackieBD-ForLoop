public class Application {
    /**
     * This class contains a main method that allows you to manually test the For Loop lab functionality.
     * No changes you make here affect the test case results. You must still run & pass the test cases.
     * All implementation code should be written in the Lab class.
     *
     * The Lab.returnNumbers method should return a String of all numbers between two numbers. All code needed to
     * produce such a result is included in the For Loop lab documentation.
     */
    public static void main(String[] args) {
        int start = 0;
        int end = 10;
        String buildingString = "";

        for (int i=start; i<end;i++){
            buildingString+= i + " ";

        }

        System.out.println(buildingString);

        
    }
}
