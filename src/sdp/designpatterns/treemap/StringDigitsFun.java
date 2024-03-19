package sdp.designpatterns.treemap;

public class StringDigitsFun implements Function {

    @Override
    public String apply(int n) {
        StringBuilder number = new StringBuilder(); // "1023"
        number.append(n);
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < number.length(); i++) {
            char ch = number.charAt(i);
            result.append(mapDigitToString(ch));
        }
        return result.toString();
    }

    public String mapDigitToString(char ch) {
        String str = null;
        switch(ch) {
            case '0':
                str = "Zero";
                break;
            case '1':
                str = "One";
                break;
            case '2':
                str = "Two";
                break;
            case '3':
                str = "Three";
                break;
            case '4':
                str = "Four";
                break;
            case '5':
                str = "Five";
                break;
            case '6':
                str = "Six";
                break;
            case '7':
                str = "Seven";
                break;
            case '8':
                str = "Eight";
                break;
            case '9':
                str = "Nine";
                break;
        }
        return str;
    }
}
