/* Given a array of pair, your task is to sort the array elements on the basis of first element of pairs in descending order

Note:-If first element are equal in two or more pairs then give preference to second element having higher value.
 */

/*
class Pair { 
    int x; 
    int y; 
  
    // Constructor 
public Pair(int x, int y) 
    { 
        this.x = x; 
        this.y = y; 
    } 
} 
*/ 

static class  secondelement implements Comparator<Pair> 
{
    public int compare(Pair a, Pair b)
    {
        if(a.x==b.x)
        {
            return b.y-a.y;
        }
        return b.x - a.x;
    }
}
static Pair[] SortPair(Pair arr[], int n)  { 
 //enter your code here
Arrays.sort(arr, new secondelement());
return arr;
 }