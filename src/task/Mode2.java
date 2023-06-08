package task;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Mode2 {


    public Character mode (String two) {
        String mode = String.valueOf(two.charAt(0));
        Mode1 [] freq = new Mode1[two.length()];

        for (int count = 0; count < two.length(); count++) {
            for (int countTwo = 0; countTwo < two.length(); countTwo++){
                {
                    Mode1 mode1 = new Mode1();
                    mode1.setOcc(two.charAt(count));
                    mode1.doFReq();
                    freq[count] = mode1;
                }
            }

        }

        for (int countTT = 0; countTT < freq.length; countTT++) {
            for (int countT2 = countTT; countT2 < freq.length; countT2++) {
                if (freq[countTT].getOcc() == freq[countT2].getOcc()) {
                      freq[countTT].doFReq();
                }

            }
        }
    Mode1 mod = null;
        int modet = 0;
        for (int count5 =0; count5 < freq.length; count5++) {
            if (freq[count5].getFreq() > modet) {
                modet = freq[count5].getFreq();
                mod= freq[count5];

            }

        }

        for (int countT = 0; countT < freq.length; countT++){
        System.out.println((freq[countT].getFreq()));
        }


        return mod.getOcc();
    }
}
