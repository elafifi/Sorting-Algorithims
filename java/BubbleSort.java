/*
Author: Ahmed Elafifi
Date: 30/10/2018
category:Bubble Sort
*/
public void bubbleSort()
{
    int out, in;
    for(out=nElems-1; out>1; out--) // outer loop (backward)
    for(in=0; in<out; in++) // inner loop (forward)
    if( a[in] > a[in+1] ) // out of order?
    swap(in, in+1); // swap them
} // end bubbleSort()
