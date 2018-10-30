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
Insertion Sort 99
