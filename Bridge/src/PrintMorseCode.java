public class PrintMorseCode extends MorseCode {
    public PrintMorseCode(MorseCodeFunction function) {
        super(function);
    }

    public PrintMorseCode j() {
        dot();
        dash();
        dash();
        dash();
        space();
        return this;
    }

    public PrintMorseCode i() {
        dot();
        dot();
        space();
        return this;
    }

    public PrintMorseCode s() {
        dot();
        dot();
        dot();
        space();
        return this;
    }

    public PrintMorseCode o() {
        dash();
        dash();
        dash();
        space();
        return this;
    }
}
