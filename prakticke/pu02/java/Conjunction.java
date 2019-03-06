import java.util.Map;

public class Conjunction extends Formula {

    public Conjunction(Formula[] conjuncts) {
        for (Formula formula : conjuncts) {
            //System.out.println("aaaa" + formula);
            _sub.add(formula);
        }
    }

    public String toString() {
        if (subf().length == 0) {
            return "()";
        }
        StringBuffer vysl = new StringBuffer("(");
        for (Formula formula : subf()) {
            vysl.append(formula + "&");
        }
        return vysl.deleteCharAt(vysl.length() - 1).append(")").toString();
    }

    @Override
    public Boolean isSatisfied(Map<String, Boolean> v) {
        boolean tf = true;
        for (Formula formula : subf()) {
            tf &= formula.isSatisfied(v);
        }
        return tf;
    }
}