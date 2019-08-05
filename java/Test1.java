import java.util.*;

public class Test1{
    public static void main(String[] args){
	    /*byte[] bytes = {1,3,5,7,9};
	    byte[] bytes2 = new byte[bytes.length];
	    for(int i = 1;i<=bytes.length;i++){
		    bytes2[i] = bytes[i];
	    }
	    System.out.print(bytes[0]);
		System.out.print(bytes2[0]);*/
		//little();
		//little2();
		//little3();
		//little4();
		//little6();
		//little7();
		//little10();
		//little8();
		//little9();
		littl11();
    }
	/*public static void little(){
		int result = 1;
		for(int i = 1;i<11;i++){
			result = result*i; 
		}
		System.out.print(result);
	}*/
	/*public static void little2(){
		for(int x = 0;x < 10;x++){
		    for(int i = 0;i < 10;i++){
			    System.out.print(" *");	
		    }
			System.out.println();
		}
	}*/
	/*public static void little3(){
	    for(int i = 1;i<10;i++){
			for(int j = 1;j<=i;j++){
				System.out.print(j +"*"+ i+"="+i*j +"\t");
			}
			System.out.println();
		}
	}*/
	/*public static void little4(){
		for(int i = 1;i<=10;i++){
			for(int j = 1;j<=10;j++){
				if(i<=1||i>=10){
					System.out.print(" *");
				}else{
					if(j<=1||j>=10){
						System.out.print(" *");
					}else{
						System.out.print("  ");
					}
				}
			}
			System.out.println();
		}
	}*/
	/*public static void little6(){
		byte[] sourceArray = {1,7,9,11,13,15,17,19};
		byte[] doubleArray = {2,4,6,8,10};
		byte[] newArray = new byte[sourceArray.length+doubleArray.length];
		System.arraycopy(sourceArray,0,newArray,0,sourceArray.length);
		System.arraycopy(doubleArray,0,newArray,sourceArray.length,doubleArray.length);
		Arrays.sort(newArray);//升序
		System.out.print(Arrays.toString(newArray));
		
		
		//byte[] sourceArray = {1,4,5,6,8};
		//byte[] newArray = Arrays.copyOf(sourceArray,5);
		//System.out.print(Arrays.toString(newArray));
		*/
	/*public static void little7){
		System.out.print("100-9999中的水仙花数有:");
		for(int i = 100;i<=999;i++){
			int first = i % 10;
			int secore = (i / 10) % 10;
			int third = ((i / 10) / 10) % 10;
			if(i == (first*first*first)+(secore*secore*secore)+(third*third*third)){
				System.out.println(i);
			}
		}
	}*/
	/*public static void little10(){
		int sum = 0;
		for(int i = 1;i< 100;i++){
			if(i % 10 ==3){
				continue;
			}else{
				sum = sum+i;
			}
		}
		System.out.print(sum);
	}*/
	/*public static void little8(){重点
		for (int i = 1; i <= 1000; i++){
            int sum=0;
            for (int j = 1; j < i; j++){
                if(i%j==0){
                sum+=j;
                }
            }
            if(i==sum)
            {
                System.out.println(i);
            }
        }
	}*/
    /*public static void little9(){
	    double sum = 0;
	    double h = 100;
		double a = 0;
	    for(int i = 1;i<=10;i++){
		    h=h/2;
			a = a+2*h;
        }
		sum = a+100-h;
		System.out.print("共经过的米数:"+sum);
		System.out.print("第10次反弹:"+h);
	}*/
	public static void little11()
}
