import java.util.Scanner;

public class Alphabet {

	public static void main(String[] args) {

			
				char ch;
					Scanner sc=new Scanner(System.in);
				System.out.println("Enter any character");
				ch = sc.next().charAt(0);
				
			
				if(ch=='A'|| ch=='a' || ch=='E'|| ch=='e'|| ch=='I'|| ch=='i' || ch=='O'|| ch=='o' || ch=='U' ||ch=='u')
				{
					System.out.println("Vowel");
				
				}
				else 	
				{
					System.out.println("not vowel");
				
				}
				
			}

		}


	
