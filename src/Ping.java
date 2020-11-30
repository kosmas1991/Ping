import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ping {

	public static void main(String[] args) {
		try {
			Process process = Runtime.getRuntime().exec("ping 192.168.1.101");
			BufferedReader input = new BufferedReader(new InputStreamReader(process.getInputStream()));
			String command = null;
			String megalo = null;
			while ((command = input.readLine()) != null) {
				// System.out.println(command);

				megalo += command;
			}
			if (megalo.contains("time="))
				System.out.println("Pingarei");
			else if (megalo.contains("reachable"))
				System.out.println("unreachable");
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
