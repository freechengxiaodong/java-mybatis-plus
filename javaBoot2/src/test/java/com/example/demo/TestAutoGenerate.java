package com.example.demo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.generator.AutoGenerator;
import com.baomidou.mybatisplus.generator.config.DataSourceConfig;
import com.baomidou.mybatisplus.generator.config.GlobalConfig;
import com.baomidou.mybatisplus.generator.config.PackageConfig;
import com.baomidou.mybatisplus.generator.config.StrategyConfig;
import com.baomidou.mybatisplus.generator.config.rules.DateType;
import com.baomidou.mybatisplus.generator.config.rules.NamingStrategy;
import org.junit.jupiter.api.Test;

public class TestAutoGenerate {
    @Test
    public void autoGenerate() {
        // Step1������������
        AutoGenerator mpg = new AutoGenerator();

        // Step2��ȫ������
        GlobalConfig gc = new GlobalConfig();
        // ��д�������ɵ�Ŀ¼(��Ҫ�޸�)
        String projectPath = "E:\\javaBoot2";
        // ƴ�ӳ��������������Ŀ¼
        gc.setOutputDir(projectPath + "/src/main/java");
        // ���ÿ�������Ϣ����ѡ������Ҫ�޸ģ�
        gc.setAuthor("cxd");
        // �����Ƿ��Ŀ¼��false Ϊ���򿪣���ѡ��
        gc.setOpen(false);
        // ʵ������ Swagger2 ע�⣬��� Swagger ���������� Swagger2 ģʽ����ѡ��
        //gc.setSwagger2(true);
        // ���������ļ�ʱ�Ƿ񸲸ǣ�false ��ʾ�����ǣ���ѡ��
        gc.setFileOverride(true);
        // �����������ɲ��ԣ��˴�Ϊ ASSIGN_ID����ѡ��
        gc.setIdType(IdType.ASSIGN_ID);
        // �����������ͣ��˴�Ϊ ONLY_DATE����ѡ��
        gc.setDateType(DateType.ONLY_DATE);
        // Ĭ�����ɵ� service ���� I ǰ׺
        gc.setServiceName("%sService");
        mpg.setGlobalConfig(gc);

        // Step3������Դ���ã���Ҫ�޸ģ�
        DataSourceConfig dsc = new DataSourceConfig();
        // �������ݿ� url ��ַ
        dsc.setUrl("jdbc:mysql://localhost:3306/testmybatisplus?useUnicode=true&characterEncoding=UTF-8&serverTimezone=UTC");
        // dsc.setSchemaName("testMyBatisPlus"); // ����ֱ���� url ��ָ�����ݿ���
        // �������ݿ�����
        dsc.setDriverName("com.mysql.cj.jdbc.Driver");
        // �������ݿ������û���
        dsc.setUsername("root");
        // �������ݿ���������
        dsc.setPassword("wer34sf");
        mpg.setDataSource(dsc);

        // Step:4��������
        PackageConfig pc = new PackageConfig();
        // ���ø���������Ҫ�޸ģ�
        pc.setParent("com.example");
        // ����ģ��������Ҫ�޸ģ�
        pc.setModuleName("demo");
        // ���� entity ����
        pc.setEntity("entity");
        // ���� mapper ����
        pc.setMapper("mapper");
        // ���� service ����
        pc.setService("service");
        // ���� controller ����
        pc.setController("controller");
        mpg.setPackageInfo(pc);

        // Step5���������ã����ݿ�����ã�
        StrategyConfig strategy = new StrategyConfig();
        // ָ������������ͬʱ���������ʹ�� , ����������Ҫ�޸ģ�
        strategy.setInclude("test_mybatis_plus_user");
        // �������ݱ���ʵ������֮��ӳ��Ĳ���
        strategy.setNaming(NamingStrategy.underline_to_camel);
        // �������ݱ���ֶ���ʵ�����������֮��ӳ��Ĳ���
        strategy.setColumnNaming(NamingStrategy.underline_to_camel);
        // ���� lombok ģʽ
        strategy.setEntityLombokModel(true);
        // ���� rest ���Ŀ�������@RestController��
        strategy.setRestControllerStyle(true);
        // �����շ�ת���ַ�
        strategy.setControllerMappingHyphenStyle(true);
        // ���ñ�ǰ׺������ʵ��ʱȥ����ǰ׺
        // �˴��ı���Ϊ test_mybatis_plus_user��ģ����Ϊ test_mybatis_plus��ȥ��ǰ׺��ʣ��Ϊ user��
        strategy.setTablePrefix(pc.getModuleName() + "_");
        mpg.setStrategy(strategy);

        // Step6��ִ�д������ɲ���
        mpg.execute();
    }
}