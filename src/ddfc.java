import java.util.Scanner;   
public class ddfc 
{

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in); //�ŧisc���L����(Scanner)
		String text=sc.nextLine().toLowerCase(); //�ŧitext �Ǧ^�Ҧ��r���r�����ഫ���p�g���r�� (�D�r��)
		char[] charArray=text.toCharArray(); //�ŧi�@�Ӧr���}�C��A������text.toCharArray( )���Ǧ^�� 
		int[] count=new int[26]; //���L26�Ӧ�m (�]�N�O���i�H�\��26�Ӧr��)
		for(int i=0;i<charArray.length;i++) //0��charArray.length�`��charArray.length��
		{
			if((charArray[i]-'a')<=26&&(charArray[i]-'a')>=0) //����0��26(�]�t)  (i)
			{
				count[charArray[i]-'a']++; //count ��0
			}
			
		}
		for(int i=0;i<26;i++) //0��26�`��26��
		{
			if(i<25) //�p��25
			{
				System.out.print(count[i]+" "); //��X���ڦ��Ů�
			}
			else //��L
			{
				System.out.println(count[i]); //��X���ڨS�Ů�
			}
		}
		char s = 0;
		System.out.println(s-'a' );
	}
}
