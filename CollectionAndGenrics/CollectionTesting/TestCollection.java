package CollectionAndGenrics.CollectionTesting;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import javax.swing.text.Utilities;

import CollectionAndGenrics.Utility;

public class TestCollection {
    public static void main(String[] args) {
        
        List<Integer> numList = new ArrayList<>();

        numList.add(4);
        numList.add(6);
        numList.add(-67);
        numList.add(23);

        Collections.sort(numList);
        Utility.print(numList);

        Collections.reverse(numList);

        Utility.print(numList);

        Collections.shuffle(numList);
        Utility.print(numList);

    }

}
