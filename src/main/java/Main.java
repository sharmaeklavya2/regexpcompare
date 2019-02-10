import dk.brics.automaton.Automaton;
import dk.brics.automaton.RegExp;

public class Main {
    private static String regexp1, regexp2;

    private static void parse_args(String args[]) {
        if(args.length != 2) {
            System.err.println("usage: regexp1 regexp2");
            System.exit(2);
        }
        regexp1 = args[0];
        regexp2 = args[1];
    }

    public static void main(String args[]) {
        parse_args(args);
        Automaton a1 = new RegExp(regexp1).toAutomaton();
        Automaton a2 = new RegExp(regexp2).toAutomaton();
        System.out.println(a1.equals(a2));
    }
}
