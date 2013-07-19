package railo.commons.io;

import java.nio.charset.Charset;

import railo.print;
import railo.runtime.exp.PageException;
import railo.runtime.op.Caster;

public class CharsetUtil {
	public static final Charset UTF8;
	public static final Charset ISO88591;
	public static final Charset UTF16BE;
	public static final Charset UTF16LE;
	
	static {
		UTF8=toCharset("utf-8",null);
		ISO88591=toCharset("iso-8859-1",null);
		UTF16BE=toCharset("utf-16BE",null);
		UTF16LE=toCharset("UTF-16LE",null);
		
		
	}

	public static Charset toCharset(String charset) {
		return Charset.forName(charset.trim());
	}

	public static Charset toCharset(String charset,Charset defaultValue) {
		try{
			return Charset.forName(charset);
		}
		catch(Throwable t){
			return defaultValue;
		}
	}

}
