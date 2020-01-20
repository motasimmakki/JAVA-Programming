class BubbleSort{
	public int[] bubbleSort(int[] array){
		int temp;
		for(int i=0;i<array.length-1;i++){
			for(int j=i+1;j<array.length;j++){
				if(array[i]>array[j]){
					temp=array[j];
					array[j]=array[i];
					array[i]=temp;
				}
			}
		}
		return array;
	}
	public static void main(String[] args) {
		BubbleSort bubbleSort=new BubbleSort();
		int[] arr={7,6,5,4,3,2,1};
		System.out.println("Array Before Sorting : ");
		for(int i=0;i<arr.length;i++)
			System.out.print("["+arr[i]+"]\t");
		arr = bubbleSort.bubbleSort(arr);
		System.out.println("\nArray After Sorting : ");
		for(int i=0;i<arr.length;i++)
			System.out.print("["+arr[i]+"]\t");
	}
}