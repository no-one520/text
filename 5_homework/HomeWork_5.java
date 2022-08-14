class HomeWork_5 
{
	public static void main(String[] args) 
	{
		int totalNumber = 0;
		int answer = 0;
		
		/*
		int i = 100;
		while (i <= 999)
		{
			int hundred = i / 100;		//得出百位数
			int middleNum = i % 100;		//得出十位和个位相加
			int ten = middleNum / 10;	//得出十位数
			int digit =	middleNum % 10;		//得出个位数
			if (i == hundred*hundred*hundred + ten*ten*ten + digit*digit*digit)
			{
				totalNumber++;
				System.out.println("第" + totalNumber + "个水仙花数为" + i);
			}
			i++;
		}
		//System.out.println("水仙花数为" + answer + "一共" + totalNumber + "个"); //此种方式可在外层输出水仙花数，但只会打印最后一个水仙花数。前面的值会覆盖，应该要用到数组的知识。
		*/
		for (int i = 100;i <= 999 ;i++ )
		{
			int hundred = i / 100;		//得出百位数
			int middleNum = i % 100;		//得出十位和个位相加
			int ten = middleNum / 10;	//得出十位数
			int digit =	middleNum % 10;		//得出个位数
			if (i == hundred*hundred*hundred + ten*ten*ten + digit*digit*digit)
			{
				totalNumber++;
				System.out.println("第" + totalNumber + "个水仙花数为" + i);
			}
		}
		System.out.println("水仙花数一共有" + totalNumber + "个");

		
		
	}
}
/*		三层循环测试，错误，应该是最后赋值num时，无法将个位数，十位数，百位数拼接。用字符格式的话应该是将其ascii码相加。
		for (int i = 1;i <= 9;i++ )
		{
			for(int j = 0; j <= 9; i++)
			{
				for(int k = 0; k<=9; k++)
				{
					int num = 'i' + 'j' + 'k';

					if(num == i*i*i+j*j*j+k*k*k){
						System.out.println("水仙花数为：" + num);
					}
				}
			}
			*/