public class StateMachine {

    // the counter for the timer
    public int count = 0; // starts off at 0 initially

    // the light states to be set in the machine
    // 0 for red, 1 for green, 2 for amber
    public int North_Bound = 0; // the lights for north bound
    public int South_Bound = 0; // the lights for south bound
    public int East_Bound = 0; // the lights for east bound
    public int West_Bound = 0; // the lights for west bound

    // the walk states to be set in the machine
    // 0 for walk, 1 for don't walk. 2 for flashing don't walk
    public int North_Bound_Walk = 0; // the lights for north bound
    public int South_Bound_Walk = 0; // the lights for south bound
    public int East_Bound_Walk = 0; // the lights for east bound
    public int West_Bound_Walk = 0; // the lights for west bound

    // left turn signal
    public int left_turn = 0;


    // the instantiate of all the possible states of the state machine
    State_1 state1 = new State_1();
    State_2 state2 = new State_2();
    State_3 state3 = new State_3();
    State_4 state4 = new State_4();
    State_5 state5 = new State_5();
    State_6 state6 = new State_6();

    // the main model of the state machine
    public void controller() {
        state1.setStateTrue(); // initially stay at state 1
        while (true) {
            count++;
            try {
                Thread.sleep(10);
                // to stay in state 1
                if (state1.enable && count >= 0 && count <= 60) {
                    state1.setStateTrue();
                }
                // reset the counter for state 1
                else if (state1.enable && count > 60){
                    count = 0;
                    state1.setStateFalse();
                    state2.setStateTrue();
                }
                // to stay in state 2
                else if (state2.enable && count >= 0 && count <= 6) {
                    state2.setStateTrue();
                }
                // reset the counter for state 2
                else if (state2.enable && count > 6){
                    count = 0;
                    state2.setStateFalse();
                    state3.setStateTrue();
                }
                // to stay in state 3
                else if (state3.enable && count >= 0 && count <= 2) {
                    state3.setStateTrue();
                }
                // reset the counter for state 3
                else if (state3.enable && count > 2){
                    count = 0;
                    state3.setStateFalse();
                    state4.setStateTrue();
                }
                // to stay in state 4
                else if (state4.enable && count >= 0 && count <= 60) {
                    state4.setStateTrue();
                }
                // reset the counter for state 4
                else if (state4.enable && count > 60){
                    count = 0;
                    state4.setStateFalse();
                    state5.setStateTrue();
                }
                // to  enter and stay in state 5
                else if (state5.enable && count >= 0 && count <= 6) {
                    state4.setStateFalse();
                    state5.setStateTrue();
                }
                // reset the counter for state 5
                else if (state5.enable && count > 6){
                    count = 0;
                    state5.setStateFalse();
                    state6.setStateTrue();
                }
                // to stay in state 6
                else if (state6.enable && count >= 0 && count <= 2) {
                    state6.setStateTrue();
                }

                else if (state6.enable && count > 2){
                    count = 0;
                    state6.setStateFalse();
                    state1.setStateTrue();
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
