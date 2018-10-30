/**
* Name:Ahmed Elafifi 
* Date: 30/10/2018
* category: Insertion Sort
*/
//no. of comparisons: n*(n-1)/4
//no. of copies: n*(n-1)/4
//for random data this algorithm runs twice as fast as the bubble sort and faster than the selection sort.

public void insertionSort()
{
    int in, out;
    for(out=1; out<nElems; out++) // out is dividing line
    {
    long temp = a[out]; // remove marked item
    in = out; // start shifts at out
    while(in>0 && a[in-1] >= temp) // until one is smaller,
    {
    a[in] = a[in-1]; // shift item right,
    --in; // go left one position
    }
    a[in] = temp; // insert marked item
    } // end for
} //
