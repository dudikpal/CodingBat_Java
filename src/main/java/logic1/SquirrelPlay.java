package logic1;

public class SquirrelPlay {
    public boolean squirrelPlay(int temp, boolean isSummer) {
        if (temp < 60 || temp > 100) {
            return false;
        }
        return isSummer || temp <= 90;
    }
}
