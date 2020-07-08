class StrongestNeighbour{
    
    // Function to find maximum of all adjacents
    static void maximumAdjacent(int sizeOfArray, int arr[]){
        
        
    ArrayList<Integer> a = new ArrayList<Integer>();
    
    for(int i=0;i<sizeOfArray-1;i++)
    {
        if(arr[i]>arr[i+1])
        a.add(arr[i]);
        else
        a.add(arr[i+1]);
        
    }
    
    for(int i=0;i<a.size();i++)
    System.out.print(a.get(i) +" ");
        