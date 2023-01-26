package com.dao;

import com.pojo.Book;
import com.pojo.Branch;

public class BookDetails {
	public static Branch showElectrical() {
		 Book book[]=new Book[3];
			book[0]=new Book(1,"Network Analysis",350,10);
			book[1]=new Book(2,"BEDC",300,14);
			book[2]=new Book(3,"DSP",400,15);
			 Branch b=new Branch("Electrical",book);
			 
			
			return b;
			}
			
			public static Branch showIT()
			{ Book book[]=new Book[4];
			
			book[0]=new Book(1,"c",350,10);
			book[1]=new Book(2,"c++",300,18);
			book[2]=new Book(3,"java",400,20);
			book[3]=new Book(4,"html",400,30);
			 Branch b=new Branch("I.T",book);
			
			
			return b;
			}
			public static Branch showMechanical() {
				 Book book[]=new Book[4];
					book[0]=new Book(1,"Electrical Sciences",650,13);
					book[1]=new Book(2,"Chemistry Laboratory",700,18);
					book[2]=new Book(3,"Thermodynamic",800,18);
					book[3]=new Book(4,"Mechanical Measurements",900,15);
					 Branch b=new Branch("Mechanical",book);
					 
					
					return b;
					}
			public static Branch showStories() {
				 Book book[]=new Book[8];
					book[0]=new Book(1,"AkbarBirbalStories",150,20);
					book[1]=new Book(2,"HindiVarnamalaKiKahaniya",100,15);
					book[2]=new Book(3,"JatakaTales",90,12);
					book[3]=new Book(4,"Nanhe Bachchon Ke Saahas",130,16);
					book[4]=new Book(5,"Panchatantra Stories",120,14);
					book[5]=new Book(6,"Tenali Raman Stories For Kids",80,25);
					book[6]=new Book(7,"Tulsidas Ke Dohe",50,10);
					book[7]=new Book(8,"One Hundred Years of Solitude",140,18);
					
					 Branch b=new Branch("Stories",book);
					 
					
					return b;
					}
			
		

			

		}
