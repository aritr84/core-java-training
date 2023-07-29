package ip;

public class ShellSort {
    int sort(int arr[])
    {
        int n = arr.length; //5
        for (int interval = n/2; interval > 0; interval /= 2) //interval = 2
        {
            for (int i = interval; i < n; i += 1) //i=3
            {
                int temp = arr[i];
                int j;
                for (j = i; j >= interval && arr[j - interval] > temp; j -= interval) //j=2
                {
                    arr[j] = arr[j - interval]; //3-2
                    System.out.println("I : " + i  + ", J : " + j);
                }
                arr[j] = temp;
            }
        }
        return 0;
    }
    //interval=2
//100 10 32 111 28
//temp=100
//j=0
//i=2
//n=5
    public static void main(String[] args) {
        int arr[]={32,10,100,111, 28};

        System.out.println("Before Sorting");
        for (int i:arr)
            System.out.print(i + " ");

        System.out.println();

        new ShellSort().sort(arr);

        System.out.println("After Sorting");
        for (int i:arr)
            System.out.print(i + " ");

    }
}