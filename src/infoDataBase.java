
public class infoDataBase {
	public static Person getPerson(String name) {
		Person p = new Person(name);
		
		p.setName(name);
		if (name.equalsIgnoreCase("matt")) {
			p.setInfo("Welcome to matt's file!");
			p.setAge(37); 
		} else if(name.equalsIgnoreCase("ali")) {
			p.setInfo("Welcome to ali's file!");
			p.setAge(33);
		
		}else {
			p.setInfo("name is unknown to database");
		}
		return p;
	}
}
