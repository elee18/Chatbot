import java.util.Scanner;

/**
 * A simple class to run the ChatBot class.
 * @author Laurie White
 * @version April 2012
 */
public class ChatBotRunner5
{

 /**
  * Create a ChatBot, give it user input, and print its replies.
  */
 public static void main(String[] args)
 {
  ChatBot5 maggie = new ChatBot5();
  
  System.out.println (maggie.getGreeting());
  Scanner in = new Scanner (System.in);
  String statement = in.nextLine();
  
  while (!statement.equals("Bye"))
  {
   System.out.println (maggie.getResponse(statement));
   statement = in.nextLine();
  }
 }

}