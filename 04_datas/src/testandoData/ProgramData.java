package testandoData;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Date;
import java.util.TimeZone;

public class ProgramData {

	public static void main(String[] args) throws ParseException {
		
		SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy");
		SimpleDateFormat sdf2 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		SimpleDateFormat sdf3 = new SimpleDateFormat("MM/yyyy");
		SimpleDateFormat sdfGmt = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		sdfGmt.setTimeZone(TimeZone.getTimeZone("GMT"));
		
		Date y1 = sdf1.parse("15/09/1992");
		Date y2 = sdf2.parse("23/08/2021 00:25:00");
		Date y3 = Date.from(Instant.parse("1992-09-15T20:45:00Z"));
		
		Date dataAgora = new Date();
		Date dataAgora2 = new Date(System.currentTimeMillis());
		Date dataTeste = new Date(1000000000000L);
		
		System.out.println("y1: "+sdf2.format(y1));
		System.out.println("y2: "+sdf2.format(y2));
		System.out.println("Data atual: "+ sdf2.format(dataAgora));
		System.out.println("Data atual: "+ dataAgora2);
		System.out.println("Data atual: "+ sdf2.format(dataAgora2));
		System.out.println("Data atual: "+ sdf3.format(dataAgora));
		System.out.println("Data teste: "+ sdf2.format(dataTeste));
		System.out.println(sdfGmt.format(y3));

	}

}
