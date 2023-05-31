package com.even;

public class EvenNumber {
    public boolean isEven(int number)
    {
        if (number%2==0)
        {
            return true;
        }
        return false;
    }

    public boolean allEven(int[] nums)
    {
        for (int i = 0; i < nums.length ; i++) {

            if (nums[i]%2!=0)
            {
                return false;
            }
        }
        return true;
    }
}


