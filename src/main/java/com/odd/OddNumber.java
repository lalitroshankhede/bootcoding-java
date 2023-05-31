package com.odd;

public class OddNumber {
    public boolean isOdd(int number)
    {
        if (number%2!=0)
        {
            return true;
        }
        return false;
    }
    public boolean allOdd(int[] nums)
    {
        for (int i = 0; i < nums.length ; i++) {

            if (nums[i]%2!=0)
            {
                return true;
            }
        }
        return false;
    }
}


