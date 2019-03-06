import java.util.Map;

public class Negation extends Formula {

    public Negation(Formula originalFormula) {
        _sub.add(originalFormula);
    }

    public Formula originalFormula() {
        return subf()[0];
    }

    @Override
    public String toString() {
        return "-" + originalFormula().toString();
    }

    @Override
    public Boolean isSatisfied(Map<String, Boolean> v) {
        return !originalFormula().isSatisfied(v);
    }

}
