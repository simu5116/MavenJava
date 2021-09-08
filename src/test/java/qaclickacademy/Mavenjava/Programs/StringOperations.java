package qaclickacademy.Mavenjava.Programs;

public class StringOperations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String a="my******name***is***Simran";
		
		 a=a.replaceAll("[\\*+]"," ");
		
			System.out.println(a);
			
			//==============================
			char[] charaaray={'a','n','b','j','d'};
			
			char temp;
			for(int i=0;i<charaaray.length;i++)
			{
			    for(int j=i+1;j<charaaray.length;j++)
			    {
			        temp=0;
			        if(charaaray[i]>charaaray[j])
			        {
			            temp=charaaray[i];
			            charaaray[i]=charaaray[j];
			            charaaray[j]=temp;
			        }
			    }
			}
			for(int i=0;i<charaaray.length;i++)
			{
			    System.out.println(charaaray[i]);  
			}

	}

}
