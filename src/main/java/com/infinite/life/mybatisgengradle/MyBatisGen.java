package com.infinite.life.mybatisgengradle;

import org.mybatis.generator.api.MyBatisGenerator;
import org.mybatis.generator.config.Configuration;
import org.mybatis.generator.config.xml.ConfigurationParser;
import org.mybatis.generator.internal.DefaultShellCallback;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

public class MyBatisGen {

    public static void main(String[] args) throws Exception {
        List<String> warings = new ArrayList<>();
        boolean overwrite = true;
        InputStream in = MyBatisGen.class.getClassLoader().getResourceAsStream("mybatis/mybatis-generate.xml");
        ConfigurationParser cp = new ConfigurationParser(warings);
        Configuration config = cp.parseConfiguration(in);
        DefaultShellCallback callBack = new DefaultShellCallback(overwrite);
        MyBatisGenerator generator = new MyBatisGenerator(config, callBack, warings);
        generator.generate(null);


    }
}
