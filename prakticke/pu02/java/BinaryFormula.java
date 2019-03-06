public class BinaryFormula extends Formula {
    public BinaryFormula() {
        _sub.add(new Formula());
        _sub.add(new Formula());
    }

    public BinaryFormula(Formula leftSide, Formula rightSide) {
        _sub.add(leftSide);
        _sub.add(rightSide);
    }

    public Formula leftSide(){
        return subf()[0];
    }

    public Formula rightSide(){
        return subf()[1];
    }
}
