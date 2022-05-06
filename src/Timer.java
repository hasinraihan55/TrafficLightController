public class Timer {

    public int count = 0;

    public int counter() {
        try {
            do {
                count++;
                Thread.sleep(1000);
            }
            while (true);
        }
        catch (InterruptedException exception){
            exception.printStackTrace();
        }

        return count;

    }

    public static void main(String[] args) {


	    Timer newtimer = new Timer();
	    newtimer.counter();

	    if (newtimer.counter() <= 12){
	        System.out.println("SHORT");
        }
	    else{
	        System.out.println("PERFECT");
        }

    }
}
