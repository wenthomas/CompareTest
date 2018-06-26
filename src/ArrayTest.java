/**

    @author thomaswen
    @version 1.0
    功能：对给定数组进行检测，筛选输出显示其中不成对的元素。

    算法：
            1，创建两个数组，数组arr用于保存目标数据，数组arr1用于存放对应的标记（0和1）
            2，遍历主数组arr，找到其中成对的元素在数组arr1对应位置做标记
            3，遍历主数组arr，输出显示未标记的（不成对的）数组元素
 */


public class ArrayTest {
    public static void main(String[] args){

        //创建主数组arr用于引入目标方法，创建相同长度的数组arr1用于对arr中成对元素进行标记。
        int[] arr =new int[]{1,1,2,2,3,4,4,5,5};
        int[] arr1 = new int[arr.length];
        for(int i = 0;i < arr.length;i++){
            arr1[i] = 0;
        }

        //遍历数组arr中元素，找出成对元素并在数组arr1中做相应标记。
        for(int i = 0;i < arr.length - 1;i++){
            for(int j = i + 1;j < arr.length;j++){
                if (arr[i] == arr[j]){
                    arr1[i] = arr1[j] = 1;
                }
            }
        }

        //输出显示主数组arr。
        for(int i = 0;i < arr.length;i++){
            System.out.print(arr[i] + " ");
        }

        //输出显示筛选出的单独元素。
        for(int i = 0;i < arr1.length;i++){
            if(arr1[i] == 0){
                System.out.println("\n单独元素为：" + arr[i]);
            }
        }

    }


    /*
     * todo:
     *  1.方法分离（main方法只为启动项目，对于业务和逻辑的编写，都应该封装到类或方法中）
     *  2.此方法无误，最好的方式是使用异或（相同的异或为0）
     *  3.另外附加写一个方法将数组里相同的元素去重
     */
}
