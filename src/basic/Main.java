package basic;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;


class User
{
	int age;
	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	String name;
	
	public User(String name){
		this.name = name;
		this.age = 30;
	}
}

public class Main {
	
	
	
	
	public static void main(String[] args) {
	
		
		List<String> names = List.of("harish","sai","phani","george","henry");
		
//		names.stream().filter(x -> x.startsWith("h")).forEach(System.out::println);
		
		List<String> s = names.stream().map(x -> x.toUpperCase()).collect(Collectors.toList());
		
		List<User> userList = names.stream().map(User::new).collect(Collectors.toList());
		
		int sum = userList.stream().mapToInt(User::getAge).sum();
		
		List<Integer> l = List.of(1,2,3,4,5);
		
		l.stream()
		.skip(2).filter(x -> x%2 == 0).forEach(System.out::println);
		
	}
	
	
	

}
