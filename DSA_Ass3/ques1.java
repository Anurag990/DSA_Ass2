package DSA_Ass3;import java.util.Scanner;//Time Complexity = O(n)//Space Complexity = O(1)public class ques1 {    public static int SearchElement(int []arr,int n)    {        for(int i =0;i<arr.length;i++)        {            if(arr[i] == n)            {                return i;            }        }        return -1;    }    public static void main(String[] args) {        //Given an array.Find the number X in the array.If the element is present, return the        //index of the element, else print "Element not found in array".Input the size of array,        //array from user and the element X from user.        //Use Linear Search to find the element.        Scanner sc = new Scanner(System.in);        System.out.println("Enter the number of elements you want to add :  ");        int n = sc.nextInt();        int []arr = new int[n];        System.out.println("Enter the elements of the array :");        for(int i=0;i<n;i++)        {            arr[i] = sc.nextInt();        }        System.out.println("Enter the elements to be searched in array : ");        int s = sc.nextInt();        if(SearchElement(arr, s)==-1)        {            System.out.println("Element not found in the array");        }        else        {            System.out.println("Element found at index "+SearchElement(arr, s));        }    }}