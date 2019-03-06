import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

public class Formula {
    Set<Formula> _sub = new LinkedHashSet<Formula>();

    public Formula() {
    }

    /*public Formula skopiruj(Formula other){
        Formula formula = new Formula();
        System.out.println(other.toString());
        for (Formula f : other.subf()){
            System.out.println(formula.toString());
            formula._sub.add(f);
            //system.out.println("formula.sub" + formula.toString());
        }

        return formula;
    }*/

    public Formula[] subf() {
        return _sub.toArray(new Formula[0]);
    }

    public String toString() {
        return "";
    }

    public Integer deg() {
        int pocet = 1;
        for (Formula formula : subf()) {
            pocet += formula.deg();
        }
        return pocet;
    }

    public HashSet<String> vars() {
        HashSet<String> vs = new HashSet<>();
        for (Formula formula : subf()){
            vs.addAll(formula.vars());
        }
        return vs;
    }

    public Formula substitute(Formula what, Formula replacement) {
        this.toString().replace(what.toString(), replacement.toString());
        return this;
    }

    public Boolean isSatisfied(Map<String, Boolean> v) {
        return null;
    }

    public Boolean equals(Formula other) {
        if (this.toString().equals(other.toString())) {
            return true;
        }
        return false;
    }
}

