public class ArrayTest {
    public static void main(String[] args){

        //创建主数组arr用于引入目标方法，创建相同长度的数组arr1用于对arr中成对元素进行标记
        int[] arr =new int[]{1,1,2,2,3,4,4,5,5};
        int[] arr1 = new int[arr.length];
        for(int i = 0;i < arr.length;i++){
            arr1[i] = 0;
        }

        //遍历数组arr中元素，找出成对元素并在数组arr1中做相应标记
        for(int i = 0;i < arr.length - 1;i++){
            for(int j = i + 1;j < arr.length;j++){
                if (arr[i] == arr[j]){
                    arr1[i] = arr1[j] = 1;
                }
            }
        }

        //输出显示主数组arr
        for(int i = 0;i < arr.length;i++){
            System.out.print(arr[i] + " ");
        }

        //输出显示筛选出的单独元素
        for(int i = 0;i < arr1.length;i++){
            if(arr1[i] == 0){
                System.out.println("\n单独元素为：" + arr[i]);
            }
        }
        //System.out.print(arr[6]);

    }
}
