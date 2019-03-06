import java.util.Arrays;
import java.util.Map;

public class Disjunction extends Formula {

    public Disjunction(Formula[] disjuncts) {
        _sub.addAll(Arrays.asList(disjuncts));
    }

    @Override
    public String toString() {
        if (subf().length == 0){
            return "()";
        }
        StringBuffer vysl = new StringBuffer("(");
        for (Formula formula : subf()) {
            vysl.append(formula + "|");
        }
        return vysl.deleteCharAt(vysl.length()-1).append(")").toString();
    }

    @Override
    public Boolean isSatisfied(Map<String, Boolean> v) {
        boolean tf = false;
        for (Formula formula : subf()) {
            tf |= formula.isSatisfied(v);
        }
        return tf;
    }
}
