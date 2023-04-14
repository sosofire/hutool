package org.dromara.hutool.extra.compress;

import org.dromara.hutool.core.io.file.FileUtil;
import org.dromara.hutool.core.util.CharsetUtil;
import org.dromara.hutool.extra.compress.extractor.Extractor;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

public class ExtractorTest {

	@Test
	@Disabled
	public void zipTest(){
		final Extractor extractor = CompressUtil.createExtractor(
				CharsetUtil.defaultCharset(),
				FileUtil.file("d:/test/c_1344112734760931330_20201230104703032.zip"));

		extractor.extract(FileUtil.file("d:/test/compress/test2/"));
	}

	@Test
	@Disabled
	public void sevenZTest(){
		final Extractor extractor = 	CompressUtil.createExtractor(
				CharsetUtil.defaultCharset(),
				FileUtil.file("d:/test/compress/test.7z"));

		extractor.extract(FileUtil.file("d:/test/compress/test2/"));
	}

	@Test
	@Disabled
	public void tgzTest(){
		Extractor extractor = 	CompressUtil.createExtractor(
				CharsetUtil.defaultCharset(),
				"tgz",
				FileUtil.file("d:/test/test.tgz"));

		extractor.extract(FileUtil.file("d:/test/tgz/"));
	}
}