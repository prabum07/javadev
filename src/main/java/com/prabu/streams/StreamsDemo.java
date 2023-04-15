package com.prabu.streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class StreamsDemo {
	
	public static void main(String[] args) {
	
		List<movie> movies=Arrays.asList(new movie("ko",2011),new movie("maatrano",2012));
		Predicate<movie> pre= n -> n.getMovieName().endsWith("o");
		Stream<movie>m=movies.stream().filter(pre);
		Function<movie,String> fun=n -> n.getMovieName();
		Stream<String>mapp=m.map(fun);
		mapp.forEach(n->System.out.print(n));
		
		
	}
	
}

class movie{
	
	String movieName;
	public String getMovieName() {
		return movieName;
	}
	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	int year;
	movie(String m,int y)
	{
		movieName=m;
		year=y;
	}
}