package com.company;

import com.company.award.Award;
import com.company.nominator.Nominator;
import com.company.nominee.Nominee;

public class Main {

    public static void main(String[] args) {

        Nominator soo = new Nominator("Soo");
        Nominee kara = new Nominee("Kara");
        kara.setNomineeAwardQuantityLimit(5);
        kara.setNomineeAwardAmountLimit(500f);
        soo.setNominatorAwardQuantityLimit(5);
        soo.setNominatorAwardAmountLimit(500f);

        Award award1 = new Award (100, 0.75);

        while ((soo.belowAwardQuantityLimit() && soo.belowAwardAmountLimit())&& (kara.belowAwardAmountLimit() && kara.belowAwardQuantityLimit())) {
            soo.nominate(kara, award1);
        }

    }
}
