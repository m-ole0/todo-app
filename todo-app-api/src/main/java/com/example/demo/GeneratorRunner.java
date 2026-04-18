package com.example.demo;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import org.mybatis.generator.api.MyBatisGenerator;
import org.mybatis.generator.config.Configuration;
import org.mybatis.generator.config.xml.ConfigurationParser;
import org.mybatis.generator.internal.DefaultShellCallback;

public class GeneratorRunner {
	public static void main(String[] args) throws Exception {

		List<String> warnings = new ArrayList<>();
		boolean overwrite = true;

		File configFile = new File("src/main/resources/generatorConfig.xml");
		ConfigurationParser cp = new ConfigurationParser(warnings);
		Configuration config = cp.parseConfiguration(configFile);

		DefaultShellCallback callback = new DefaultShellCallback(overwrite);
		MyBatisGenerator generator = new MyBatisGenerator(config, callback, warnings);

		generator.generate(null);

		System.out.println("生成完了！");
	}
}