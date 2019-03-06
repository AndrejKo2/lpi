import java.util.Map;

public class Equivalence extends BinaryFormula {

    public Equivalence(Formula a, Formula b) {
        super(a,b);
    }

    @Override
    public String toString() {
        StringBuffer vysl = new StringBuffer("(");
        return vysl.append(leftSide().toString()).append("<->").append(rightSide().toString()).append(")").toString();
    }

    public Boolean isSatisfied(Map<String, Boolean> v) {
        if (leftSide().isSatisfied(v) != rightSide().isSatisfied(v)) {
            return false;
        }
        return true;
    }
}
