// test driver for the state machine
public class Test extends StateMachine {
    public static void main(String[] args) {
        StateMachine machine = new StateMachine();
        machine.state1.setStateTrue();
        while (true) {
            try {
                Thread.sleep(10);
                machine.controller();
                System.out.println(machine.count);
                System.out.println("State 1: " + machine.state1.enable);
                System.out.println("State 2: " + machine.state2.enable);
                System.out.println("State 3: " + machine.state3.enable);
                System.out.println("State 4: " + machine.state4.enable);
                System.out.println("State 5: " + machine.state5.enable);
                System.out.println("State 6: " + machine.state6.enable);
            }
            catch (InterruptedException e){
                e.printStackTrace();
            }
        }
    }

}
