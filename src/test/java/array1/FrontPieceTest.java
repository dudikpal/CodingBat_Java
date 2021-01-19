package array1;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class FrontPieceTest {

    @Test
    void frontPiece() {
        int[] nums = {1, 2, 3};

        assertEquals("[1, 2]", Arrays.toString(new FrontPiece().frontPiece(nums)));
    }
}