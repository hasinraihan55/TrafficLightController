public class StateMachine {

    // the counter for the timer
    public int count = 0; // starts off at 0 initially

    // the light states to be set in the machine
    public int Red = 0; // the red light
    public int Amber = 0; // the amber light
    public int Green = 0; // the green light

    // the walk states to be set in the machine
    public int walk = 0; // the walk state
    public int dont_walk = 0; // the don't walk state
    public int flashing_dont_walk = 0; // the flashing don't walk state

    // the instantiate of all the possible states of the state machine
    State_1 state1 = new State_1();
    State_2 state2 = new State_2();
    State_3 state3 = new State_3();
    State_4 state4 = new State_4();
    State_5 state5 = new State_5();
    State_6 state6 = new State_6();

    // the main model of the state machine
    public void controller() {
        while (true) {
            count++;
            state1.setStateTrue();
            try {
                Thread.sleep(1000);
                // to stay in state 1
                if (state1.enable && count >= 0 && count < 10) {
                    state1.setStateTrue();
                }
                // to stay in state 2
                else if (state1.enable && count >= 10 && count < 20) {
                    state1.setStateFalse();
                    state2.setStateTrue();
                }
                // to stay in state 3
                else if (state1.enable && count >= 20 && count < 30) {
                    state2.setStateFalse();
                    state3.setStateTrue();
                }


                System.out.println(count);
                System.out.println("State 1: " + state1.enable);
                System.out.println("State 2: " + state2.enable);
                System.out.println("State 3: " + state3.enable);
                System.out.println("State 4: " + state4.enable);
                System.out.println("State 5: " + state5.enable);
                System.out.println("State 6: " + state6.enable);
            }
            catch (InterruptedException exception){
                exception.printStackTrace();
            }
        }
    }


    public static void main(String[] args){

        StateMachine machine = new StateMachine();
        machine.controller();

    }


}
