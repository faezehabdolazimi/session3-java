package ir.isc;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class main {

		public main(String[] args) {
	
		acount a1=new acount(1100,"zahra",001);
		acount a2=new acount(1500,"raha",002);
		acount a3=new acount(1200,"omid",003);
		acount a4=new acount(1500,"faezeh",001);
	
		List<acount> accountlist= new ArrayList<>();
		
		accountlist.add(a1);
		accountlist.add(a2);
		accountlist.add(a3);
		accountlist.add(a4);
		
		accountlist.forEach(t -> System.out.println(t.toString()));
		
		System.out.println("sorted!");
		Collections.sort(accountlist, (o1, o2) -> o1.compareTo(o2));
		
		accountlist.forEach(t -> System.out.println(t.toString()));
		Collections.reverse(accountlist);
		System.out.println("reverse!");
		accountlist.forEach(t -> System.out.println(t.toString()));
				
		List<acount> accountlist2= new ArrayList<>();
		List<acount> accountlist3= new ArrayList<>();
		List<acount> accountlist4= new ArrayList<>();
		List<acount> accountlist5= new ArrayList<>();
		
		for (acount acount :accountlist) {
			if (acount.getBranch()==1) {
				
				accountlist2.add(acount);
			}
			else if (acount.getBranch()==2) {
				accountlist3.add(acount);
			}
			else if (acount.getBranch()==3) {
				accountlist4.add(acount);
			}
			else{
				accountlist5.add(acount);
			}			
		}
	
		accountlist2.forEach(t -> System.out.println(t.toString()));
		accountlist3.forEach(t -> System.out.println(t.toString()));
		accountlist4.forEach(t -> System.out.println(t.toString()));
		
		Map<Integer,List<acount> > mymap=new HashMap<>();
		
		mymap.put(1, accountlist2);
		mymap.put(2, accountlist3);
		mymap.put(3, accountlist4);
		
		for (Map.Entry<Integer, List<acount>> entry : mymap.entrySet()) {
			Integer key = entry.getKey();
			List<acount> val = entry.getValue();
			
			System.out.println("key : "+key+" value : "+val);
		}
		
		accountlist.removeAll(accountlist3);
		accountlist.forEach(t -> System.out.println(t.toString()));
	
		List<String> name=Arrays.asList("ali","mohi","gha","sara","ahmad") ;
		List<String>ml=  name.stream().filter(t -> t.startsWith("a")).collect(Collectors.toList());
		ml.forEach(t -> System.out.println(t));
		
		
		List<acount>m2=  accountlist.stream()
				.filter(t -> t.getName().startsWith("a"))
				.collect(Collectors.toList());
		
		m2.forEach(t -> System.out.println(t));
		
		accountlist.forEach(t ->t.setName(t.getName().toUpperCase()) );
		
		accountlist.forEach(t -> System.out.println(t));
		
		
		List<acount>m3= accountlist.stream()
		.filter(t -> t.getBalanc()>1000)
		.filter(t -> t.getName()
		.startsWith("A"))
		.collect(Collectors.toList());
		
		m3.forEach(t -> System.out.println(t));
	
	}

}
