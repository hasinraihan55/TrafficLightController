public class Test extends StateMachine {
    public static void main(String[] args){
        int count = 0;
        StateMachine machine = new StateMachine();
        while (true) {
            count++;
            machine.controller();
            System.out.println(machine.North_Bound);
        }

    }

}
