package org.dromara.hutool.core.util;

import org.dromara.hutool.core.collection.iter.EnumerationIter;
import org.dromara.hutool.core.lang.Console;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import javax.naming.NamingException;
import javax.naming.directory.Attribute;
import javax.naming.directory.Attributes;

public class JNDIUtilTest {

	@Test
	@Disabled
	public void getDnsTest() throws NamingException {
		final Attributes attributes = JNDIUtil.getAttributes("dns:paypal.com", "TXT");
		for (final Attribute attribute: new EnumerationIter<>(attributes.getAll())){
			Console.log(attribute.get());
		}
	}
}