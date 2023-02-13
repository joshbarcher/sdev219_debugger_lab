package modules;

import helpers.Range;

public class Numbers
{
    public boolean isNum(int n)
    {
        if (n <= 1)
        {
            return false;
        }

        int check = (int)Math.floor(Math.sqrt(n));
        for (int i = check; i >= 2; i--)
        {
            if (n % i == 0)
            {
                return false;
            }
        }
        return true;
    }

    public int[] numsIn(Range range)
    {
        int[] nums = new int[range.intsInRange()];

        int count = 0;
        for (int i = range.getLow(); i <= range.getHigh(); i++)
        {
            if (isNum(i))
            {
                nums[count] = i;
                count++;
            }
        }

        return trim(nums);
    }

    private int[] trim(int[] nums)
    {
        int count = numsValid(nums);
        int[] trimmed = new int[count];
        for (int i = 0; i < count; i++)
        {
            trimmed[i] = nums[i];
        }
        return trimmed;
    }

    private int numsValid(int[] nums)
    {
        int count = 0;
        for (int i = 0; i < nums.length; i++)
        {
            if (nums[i] != 0)
            {
                count++;
            }
            else
            {
                break;
            }
        }
        return count;
    }

    public int howMany(Range range)
    {
        int[] nums = numsIn(range);
        return nums.length;
    }
}
