package com.converters;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

import org.springframework.core.convert.converter.Converter;
public class DateConverter implements Converter<String, Date>{
	@Override
	public Date convert(String source) {
		System.out.println(source);
		DateFormat dFormat= new SimpleDateFormat("yyyy-MM-dd");
		try {
			if(source.contains("(")) {
				//GMT+0800格式时间处理
				String datestr = source.replace("GMT", "").replaceAll("\\(.*\\)", "");
				System.out.println(datestr);
			      SimpleDateFormat format = new SimpleDateFormat("EEE MMM dd yyyy hh:mm:ss z", Locale.ENGLISH);
			      Date dateTrans = format.parse(datestr);
			      System.out.println(new SimpleDateFormat("yyyy-MM-dd").format(dateTrans));
				return dateTrans;
			}
			dFormat.setLenient(false);
			return dFormat.parse(source);
		} catch (ParseException e) {
			e.printStackTrace();
			return null;
		}
	}
	
}
