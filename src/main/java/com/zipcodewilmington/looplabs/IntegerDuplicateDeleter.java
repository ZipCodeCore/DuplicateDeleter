package com.zipcodewilmington.looplabs;

import com.sun.org.apache.xpath.internal.operations.String;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * Created by leon on 1/29/18.
 * @ATTENTION_TO_STUDENTS You are forbidden from modifying the signature of this class.
 */
/* note: I referenced another dev's code while dev'ing this.

i can attempt to explain individual steps for this, and I know enough to know this is some very clean, well thought-out
code, (I literally didn't "wtf" once) but i absolutely cannot take credit for this program. What I *can* promise you is
given enough time I can absolutely learn it, retain it,and apply it to future applicable use. this is not a promise I
would make that i didn't absolutely believe i could keep.

Having said all of this (can't believe you're still reading this far down into my comments) if you still want to hand
my ass to me that is absolutely your prerogative and if that is the case then so be it (smiles wanly).

*/

public final class IntegerDuplicateDeleter extends DuplicateDeleter<Integer> {

    public IntegerDuplicateDeleter(Integer[] intArray){

        super(intArray);

    }

    @Override
    public Integer[] removeDuplicates(int maxNumberOfDuplications){

        String listWithDupsRemoved = "";
        int timesDupOccurred = 0;
        int count= 0;

        for (int i = 0; i < this.array.length; i++){

            for (int k = 0; k < this.array.length; k++){

                if (this.array[k].equals(this.array[i])){
                    count++;
                }
            }

            if (timesDupOccurred < maxNumberOfDuplications){
                listWithDupsRemoved += this.array[i] + " ";
                count++;
            }

            count = 0;

        }

        String[] freeOfDuplicates = listWithDupsRemoved.split(" ");

        if (count > 0) {
            Integer[] freeOfDupsIntArray = new Integer[freeOfDuplicates.length];

            for (int i = 0; i < freeOfDuplicates.length; i++){
                freeOfDupsIntArray[i] = Integer.parseInt(freeOfDuplicates[i]);
            }

            return freeOfDupsIntArray;

        } else {
            Integer[] emptyArray = {};
            return emptyArray;
        }
    }

@Override
    public Integer[] removeExactNumOfDuplicates(int exactNumOfDuplications){

        //start here amy
}

}

