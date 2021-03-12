package recursion;

public class BunnyEars {
    
    public int bunnyEars(int bunnies) {
        if (bunnies == 1) {
            return 2;
        }
        return 2 + bunnyEars(bunnies - 1);
    }
}

/*
We have a number of bunnies and each bunny has two big floppy ears. We want to compute the total number of ears across all the bunnies recursively (without loops or multiplication).

bunnyEars(0) → 0
bunnyEars(1) → 2
bunnyEars(2) → 4
 */
