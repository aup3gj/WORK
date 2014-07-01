import java.util.Scanner;   
public class ddfc 
{

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in); //宣告sc讓他接收(Scanner)
		String text=sc.nextLine().toLowerCase(); //宣告text 傳回所有字母字元都轉換成小寫的字母 (非字串)
		char[] charArray=text.toCharArray(); //宣告一個字元陣列後，指派為text.toCharArray( )的傳回值 
		int[] count=new int[26]; //給他26個位置 (也就是說可以擺放26個字元)
		for(int i=0;i<charArray.length;i++) //0到charArray.length循環charArray.length次
		{
			if((charArray[i]-'a')<=26&&(charArray[i]-'a')>=0) //介於0跟26(包含)  (i)
			{
				count[charArray[i]-'a']++; //count 為0
			}
			
		}
		for(int i=0;i<26;i++) //0到26循環26次
		{
			if(i<25) //小於25
			{
				System.out.print(count[i]+" "); //輸出尾巴有空格
			}
			else //其他
			{
				System.out.println(count[i]); //輸出尾巴沒空格
			}
		}
		char s = 0;
		System.out.println(s-'a' );
	}
}
