/**
 * 
 */
package revision;

/**
 * @author François
 *
 */
public class IP {

	/**
	 * @param args
	 */
    int o1 = 0;
    int o2 = 0;
    int o3 = 0;
    int o4 = 0;

    
    public static void main(String[] args) {
	IP ipv4 = new IP();
	ipv4.o1 = Integer.parseInt(args[0]);
	ipv4.o2 = Integer.parseInt(args[1]);
	ipv4.o3 = Integer.parseInt(args[2]);
	ipv4.o4 = Integer.parseInt(args[3]);

	System.out.println("Adress ipv4: " + ipv4.o1 + "." + ipv4.o2 + "." + ipv4.o3 + "." + ipv4.o4);
    }
}
