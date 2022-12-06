package JavaExamples;

public class LoopsConcepts {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//while loop
		int i=1; //initizalation
		while(i<=10)// condition
		{
			System.out.println(i); //1,2,3..10
			i++;//incremental or decremental
		}
		
		System.out.println("-----------------");
		
		//2.for loop
		for(int k=1;k<=10;k++)
		{
			System.out.println(k);//1,2,3...10
		}
		/*for(; ;) {
			System.out.println("hello");
		}*/
		for(int even=0;even<=10;even+=2)
		{
			System.out.println("even number is " +even);
		}

		for(int odd=1;odd<=10;odd+=2)
		{
			System.out.println("even number is " +odd);
		}
		for(int p=0;p<=10;)
		{
			System.out.println(p);
			p++;
		}
         for(int b=1;b<=100;b++)
         {
        	 System.out.println(b);
        	 if(b%5==0)
        	 {
        		 System.out.println("hello");
        	 }
         }
         
         //do while
         int y=3;//initialazation
         do {
        	 System.out.println("ykkkkkkk");
        	 y++;//increment or decrement
         }
         while(y<=10);//
        	 
	}
	}


