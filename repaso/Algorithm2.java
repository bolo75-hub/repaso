package repaso;

public class Algorithm2 {
    public static void main(String[] args){

        boolean stop = false;
         String semaphoreState = "rubibi";
        //simulation of street  crossing for a robot
        croosStreet(semaphoreState);

        croosStreet("green");
        croosStreet("yellow");
        croosStreet("red");
        croosStreet("rte45");

		System.out.println(stop);


}

    private static void croosStreet(String semaphoreState) {
        if(semaphoreState == "green") {
            System.out.println("crosing the street ........");
        }
        else if(semaphoreState == "yellow" || semaphoreState == "red") {
            System.out.println("wait for green ..........");
        }
        else if(semaphoreState == "black") {
            System.out.println("contacting with traffic office ..........");
        }
        else {
            System.out.println("unknown inputs, abandon the task..........");
        }

    }
}
