import java.util.Map;

public class Implication extends BinaryFormula {

    public Implication(Formula a, Formula b) {
        super(a, b);
    }

    @Override
    public String toString() {
        StringBuffer vysl = new StringBuffer("(");
        return vysl.append(leftSide().toString()).append("->").append(rightSide().toString()).append(")").toString();
    }

    @Override
    public Boolean isSatisfied(Map<String, Boolean> v) {
        if (leftSide().isSatisfied(v) == true && rightSide().isSatisfied(v) == false) {
            return false;
        }
        return true;
    }
}
