import java.util.*;

public class Test3{
    public static void main(String[] args){
		//word();
		//word1();
		//word2();
		//word3();
		//word4();
		//word5();
		//word6();
		word7();
	}
	//练习二 选AB
	/*public static void word(){
		int a = 0141;
		System.out.print(a);
	}*/
	
	
	//练习三
	//'b' '\t' 
    //'\u123f'
	
	
	//练习四
	/*public static void word1(){
		int x = 2;
		int y = 1;
		boolean z = (x!=2&&y==y++);
		System.out.println(z);
		System.out.print("y="+y);
	}*/
	
	//练习五
	/*public static void word2(){
		//int x = 1;
		//int y  = 2;
		//int z = 3;
		//y +=z--/++x;
		//System.out.print(y);
		
		//int x = 2;
		//System.out.print(x++/3);
		
		
	}*/
	
	//课后作业
	/*public static void word3(){
		//int x = 1;
		//int y = 2;
		//int t;
		//t = x;
		//x = y;
		//y = t;
		//System.out.print(x);
		//System.out.print(y);
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("请输入如一个0~1000的整数:");
		int i = scanner.nextInt();
		int sum,first,secored,third;
		first = i%10;
		secored = i/10%10;
        third = i/100;
        System.out.print(first+secored+third);		
	}*/
	
	
	
	//练习一
	/*public static void word4(){
		Scanner scanner = new Scanner(System.in);
		System.out.print("请输入整数x:");
		int i = scanner.nextInt();
		if(i%2==0){
			System.out.println("输入的数值是偶数");
		}
		System.out.print("数值为:"+i);
	}*/
	
	
	//练习二
	/*public static void word5(){
		Scanner scanner = new Scanner(System.in);
		System.out.print("请输入整数x:");
		int x = scanner.nextInt();
		System.out.print("请输入整数y:");
		int y = scanner.nextInt();
		if(x>y){
			System.out.print(x);
		}else if(x<y){
			System.out.print(y);
		}else{
			System.out.print("二者相等");
		}
		
	}*/
	
	
	//练习三
	/*public static void word6(){
		int sum = 0;
		int i = 1;
		/*while(i<=100){
			sum += i;
			i++;
		}
		System.out.println(sum);
		*/
		
		
		/*while(i<=100){
			if(i%2==0){
				i++;
				
			}else{
				sum += i;
				i++;
			}
		}
		System.out.print(sum);
		
		do{
			sum += i;
			i++;
		}while(i< 100);
		System.out.print(sum);
	}*/
	
	
	//练习四
	/*public static void word7(){
		int sum  = 0;
		for(int i=1;i<=100;i++){
			sum +=i;
			
		}
		System.out.print(sum);
	}
        float cock = 5,hen = 3,poult = 1/3,sum = 0;
	    int cocknum = 0,hennum = 0,poultnum = 0;
		for(cocknum = 0;cocknum*5<100;cocknum++){
			for(hennum = 0;hennum*3<100;hennum++){
				for(poultnum = 0;poultnum<100;poultnum++){
					int sum2 = cocknum*15+hennum*9+poultnum;
					if(sum2==300&&cocknum+hennum+poultnum==100){
						System.out.print("公鸡"+cocknum+"母鸡"+hennum+"小鸡"+poultnum);
					}
				}
			}
		}
    }*/
	

	
}