package Chaptor2;

public class Q4
{
    public static void main(String[] args)
    {
        double dNum1 = 10;
        float fNum2 = 2.0F;

        int iNum3 = (int)dNum1 + (int)fNum2;
        int iNum4 = (int)(dNum1 - fNum2);
        int iNum5 = (int)(dNum1 * fNum2);
        int iNum6 = (int)(dNum1 / fNum2);

        System.out.println(iNum3);
        System.out.println(iNum4);
        System.out.println(iNum5);
        System.out.println(iNum6);
    }
}
