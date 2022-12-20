public class _1678_Goal_Parser_Interpretation {
    public String interpret(String command) {
        command = command.replace("()", "o");
        command = command.replace("(al)","al");
        return command;
    }
}
