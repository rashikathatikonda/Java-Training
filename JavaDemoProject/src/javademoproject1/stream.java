package javademoproject1;
import java.util.ArrayList;
import java.util.stream.Collectors;
import java.util.List;
public class stream {
public static void main(String[] args) {
	List<Integer> list=new ArrayList<>();
	for(int i=1;i<=10;i++) {
		list.add(i);
	}
	System.out.println(list);
	List<Integer> filteredList=list.stream().filter(i->i%2==0).collect(Collectors.toList());
	System.out.println(filteredList);
	List<Integer> multiliedBy2=list.stream().map(i->i*2).collect(Collectors.toList());
	System.out.println(multiliedBy2);
	List<String> names=new ArrayList<>();
	names.add("max");
	names.add("milter");
	names.add("john");
	names.add("collins");
}
}
