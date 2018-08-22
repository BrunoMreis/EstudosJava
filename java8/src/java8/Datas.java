package java8;

import java.text.DateFormat;
import java.time.LocalDate;
import java.time.Month;
import java.time.Period;
import java.time.format.DateTimeFormatter;

import javafx.scene.input.DataFormat;

public class Datas {
	public static void main(String[] args) {
		
		System.out.println(LocalDate.now());
		
		LocalDate futuro = LocalDate.of(2099, Month.JANUARY,25);
		System.out.println(futuro);
		
		
		System.out.println(Period.between(futuro, LocalDate.now()));
		
		
		DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		
		String dataFormatada = formato.format(LocalDate.now());
		
		System.out.println(dataFormatada);
	}

}
