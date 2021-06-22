public class Arrays {
    public static void main(String[] args) {
        //single dimensional
        int a[] = new int[5];
        a[0] = 10;
        a[1] = 20;
        a[2] = 70;
        a[3] = 40;
        a[4] = 50;

        for(int i : a){
            System.out.println(i);
        }

        //multi-dimensional array
        int [][] arr = new int[3][3];
        arr[0][0]=1;
        arr[0][1]=2;
        arr[0][2]=3;
        arr[1][0]=4;
        arr[1][1]=5;
        arr[1][2]=6;
        arr[2][0]=7;
        arr[2][1]=8;
        arr[2][2]=9;

      for(int i=0; i<arr.length; i++){
          for(int j=0; j<arr.length; j++){
              System.out.println(arr[i][j]);
          }
      }


    }



}
