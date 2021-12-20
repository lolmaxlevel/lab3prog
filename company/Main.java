package com.company;

import com.company.characters.*;

public class Main {

    public static void main(String[] args) {
        Haps haps = new Haps(Role.HAPS);
        Correspondents correspondents = new Correspondents(Role.CORRESPONDENTS);
        Operator operator = new Operator(Role.OPERATOR);
        Policeman policeman = new Policeman(Role.POLICEMAN);
        Staff staff = new Staff(Role.STAFF);
        Viewers viewers = new Viewers(Role.VIEWERS);
        if (haps.CheckIfEveryoneIsListening()){
            haps.blink(policeman, staff, operator, correspondents, viewers);
        };
    }
}
