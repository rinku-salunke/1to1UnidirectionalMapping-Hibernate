package com.client;

import java.util.Scanner;

import com.config.HibernateUtil;
import com.model.AdharCard;
import com.model.Person;
import com.mysql.cj.Session;

public class Test {

public static void main(String[] args) {
	
Scanner sc=new Scanner(System.in);

org.hibernate.Session session=HibernateUtil.getSessionFactory().openSession();

AdharCard ad=new AdharCard();

System.out.println("Enter The Adhar id");
ad.setAid(sc.nextInt());

System.out.println("Enter The Adhar Name");
ad.setaName(sc.next());

System.out.println();
Person p=new Person();

System.out.println("Enter The Person id");
p.setPid(sc.nextInt());

System.out.println("Enter The Person Name");
p.setpName(sc.next());

p.setAd(ad);

	session.save(p);
	
	session.beginTransaction().commit();

	}
}
