import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

/**
  This program tests the mail system. A single phone
     communicates with the program through System.in/System.out.
*/
public class MailSystemTester
{
public static void main(String[] args) throws IOException
{
MailSystem system = new MailSystem(MAILBOX_COUNT);
BufferedReader console = new BufferedReader(
new InputStreamReader(System.in));

Telephone p = new Telephone(console);
Connection c = new Connection(system, p);
p.run(c);
}

private static final int MAILBOX_COUNT = 20;
}