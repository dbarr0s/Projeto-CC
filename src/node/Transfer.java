package node;

import java.util.List;
import java.net.InetSocketAddress;

public class Transfer {
    public static void selectNodes(List<InetSocketAddress> nodosDisponveis, int chunks){
        System.out.println(chunks + " " + nodosDisponveis);
    }
}
