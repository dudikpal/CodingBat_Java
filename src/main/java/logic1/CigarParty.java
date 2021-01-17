package logic1;

public class CigarParty {
    public boolean cigarParty(int cigars, boolean isWeekend) {
        if (isWeekend && cigars >= 40) {
            return true;
        }
        /*if (!isWeekend && (cigars >= 40 && cigars <= 60)) {
            return true;
        }*/
        return !isWeekend && (cigars >= 40 && cigars <= 60);
    }
}

/*
public boolean cigarParty(int cigars, boolean isWeekend) {
    if (isWeekend) {
        return (cigars >= 40);
        // A longer way to write the above line:
        // if (cigars >= 40) {
        //   return true;
        // } else {
        //   return false;
        // }
    } else {
        return (cigars >= 40 && cigars <= 60);
    }
}*/
