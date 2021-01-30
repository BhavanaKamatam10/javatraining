package com.company;

public class Main {

    public static void main(String[] args) {
        // write your code here
        int myValue = 10000;

        int myMinIntValue = Integer.MIN_VALUE;
        int myMaxIntValue = Integer.MAX_VALUE;
        System.out.println("Integer Minimum Value= " + myMinIntValue);
        System.out.println("Integer Maximum Value= " + myMaxIntValue);
        System.out.println("BUSTED MAX value = " + (myMaxIntValue+1));
        System.out.println("BUSTED MIN value = " + (myMinIntValue+1));

        int myMaxIntTest = 2_147_483_647;

        byte myMinByteValue = Byte.MIN_VALUE;
        byte myMaxByteValue = Byte.MAX_VALUE;
        System.out.println("Byte Minimum Value= " + myMinByteValue);
        System.out.println("Byte Maximum Value= " + myMaxByteValue);
        //System.out.println("BUSTED MAX value = " + (myMaxIntValue+1));
        //System.out.println("BUSTED MIN value = " + (myMinIntValue+1));

       // int myMaxIntTest = 2_147_483_647;

        short myMinShortValue = Short.MIN_VALUE;
        short myMaxShortValue = Short.MAX_VALUE;
        System.out.println("Short Minimum Value= " + myMinShortValue);
        System.out.println("Short Maximum Value= " + myMaxShortValue);

        long myLongValue = 100L;
        long myMinLongValue = Long.MIN_VALUE;
        long myMaxLongValue = Long.MAX_VALUE;
        System.out.println("Long Minimum Value= " + myMinLongValue);
        System.out.println("Long Maximum Value= " + myMaxLongValue);
        long bigLongLiteralValue = 2_147_483_647_234L;
        System.out.println(bigLongLiteralValue);

        short bigShortLiteralValue = 32761;

        int myTotal = (myMinIntValue/2);
        byte myNewByteValue = (byte) (myMinByteValue/2);
        short myNewShortValue =(short) (myMinShortValue/2);
        System.out.println(myTotal);
        System.out.println(myNewByteValue);
        System.out.println(myNewShortValue);
//--------------------------------------------------------------

        byte byteValue = 10;
        short shortValue = 20;
        int intValue = 50;

        long longTotal = 50000L + 10L * (byteValue + shortValue + intValue);
        System.out.println(longTotal);

        short shortTotal = (short) (1000 + 10 *
                ( byteValue +  shortValue + intValue));
        System.out.println(shortTotal);
        //--------------------------------------------------------

        float myMinFloatValue = Float.MIN_VALUE;
        float myMaxFloatValue = Float.MAX_VALUE;
        System.out.println("Float Minimum Value= " + myMinFloatValue);
        System.out.println("Float Maximum Value= " + myMaxFloatValue);

        double myMinDoubleValue = Double.MIN_VALUE;
        double myMaxDoubleValue = Double.MAX_VALUE;
        System.out.println("Double Minimum Value= " + myMinDoubleValue);
        System.out.println("Double Maximum Value= " + myMaxDoubleValue);

        int myIntValue = 5/2;
        float myFloatValue = 5f/2f;
        double myDoubleValue = 5.00/3.00;
        System.out.println("myIntValue=" +myIntValue);
        System.out.println("myFloatValue=" +myFloatValue);
        System.out.println("myDoubleValue=" +myDoubleValue);
        //---------------------------------------------------------------------

        double numberOfPounds = 200d;
        double convertedKilograms = numberOfPounds * 0.45359237d;
        System.out.println("Converted kilograms=" + convertedKilograms);
//-------------------------------------------------------------------------------

        char myChar = 'N';
        char myUnicodeChar = '\u0044';

        System.out.println(myChar);
        System.out.println(myUnicodeChar);
        char myCopyRightChar ='\u00A9';
        System.out.println(myCopyRightChar);

        boolean myTrueBooleanValue = true;
        boolean myFalseBooleanValue = false;

        boolean isCustomerOverTwentyOne = true;

        //------------------------------------------------------------------------------
        String myString ="This is a String";
        System.out.println("myString is equal to" + myString);
        myString = myString +", and this is more.";
        System.out.println("myString is equal to" + myString);
        myString = myString + "Bhavana Kamatam"  ;
        System.out.println("myString is equal to" + myString);


    }
}
