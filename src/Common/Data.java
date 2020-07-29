package Controller.Common;

import java.util.regex.Pattern;

public class Data {
    private final Pattern pattern = Pattern.compile("\\d+");

    private boolean isNumeric(String strNumb) {
        if(strNumb == null) {
            return false;
        }
        return pattern.matcher(strNumb).matches();
    }

}
