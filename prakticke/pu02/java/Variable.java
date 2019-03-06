import java.util.HashSet;
import java.util.Map;

public class Variable extends Formula {
    public String _name;

    public Variable(String nazov) {
        this._name = nazov;
    }

    public String name() {
        return this._name;
    }

    @Override
    public String toString() {
        return this.name();
    }

    @Override
    public Boolean isSatisfied(Map<String, Boolean> v) {
        return v.get(this.name());
    }

    @Override
    public Integer deg() {
        return 0;
    }

    @Override
    public Formula substitute(Formula what, Formula replacement) {
        return new Formula();
    }

    @Override
    public HashSet<String> vars() {
        HashSet<String> vs = new HashSet<>();
        vs.add(this.name());
        return vs;
    }
}