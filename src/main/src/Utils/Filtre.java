package Utils;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Filtre {
    public static HashMap add(String operator, String col, String value) {
        HashMap _filter1 = new HashMap();

        _filter1.put("operator", operator);
        _filter1.put("col", col);
        _filter1.put("value", value);

        return _filter1;
    }

    public static HashMap add(String operator, String col, Integer value) {
        HashMap _filter1 = new HashMap();

        _filter1.put("operator", operator);
        _filter1.put("col", col);
        _filter1.put("value", value);

        return _filter1;
    }

    public static HashMap add(String operator, String col, List value) {
        HashMap _filter1 = new HashMap();

        _filter1.put("operator", operator);
        _filter1.put("col", col);
        _filter1.put("value", value);

        return _filter1;
    }

}
