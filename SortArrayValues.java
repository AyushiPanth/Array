
package Array;
import static java.util.Arrays.sort;
public class SortArrayValues {

   
    public static void main(String[] args) {
       int values[]={1,2,7,31,33,45};
       sort(values);
       for(int i=0;i<values.length;i++)
       {
           System.out.println(values[i]);
       }    
    }   
}
