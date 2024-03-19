package sdp.designpatterns.filter;

public class Odd implements Function {
    @Override
    public boolean apply(int n) {
        return n % 2 != 0;
    }
}
