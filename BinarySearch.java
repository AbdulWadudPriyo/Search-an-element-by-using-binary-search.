package Searching; 
public class SearchingAlgorithm{ 
int[]data; 
public SearchingAlgorithm(int[]data) { 
this.data=data; 
} 
public void binarySearch(int item) { 
boolean found=false; 
int low=0; 
int high=data.length-1; 
int location=-1; 
while(low&lt;=high) { 
int mid=(low+high)/2; 
System.out.println(&quot;low= &quot;+low+&quot; high= &quot;+high+&quot; mid=
&quot;+mid); if(item&lt;data[mid]) { 
high=mid-1; 
} 
else if(item&gt;data[mid]) { 
low=mid+1; 
} 
else { 
found=true; 
location=mid; 
break; 
} 
} 
} 
} 
package Searching; 
import java.util.Scanner; 
public class Main { 
public static void main(String[] args) { 
int[]data=new int[10]; 
Scanner input=new Scanner(System.in); 
System.out.println(&quot;Enter&quot;+data.length+ &quot;values&quot;); 
for(int i=0;i&lt;data.length;i++) { 
data[i]=input.nextInt(); 
} 
SearchingAlgorithm search=new
SearchingAlgorithm(data); search.binarySearch(8); 
} 
}