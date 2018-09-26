package org.jujubeframework.jdbc.constant;

import java.nio.charset.Charset;

/**
 * 项目常量类
 *
 * @author John Li
 */
public interface EasyJdbcConstants {

    // ------------------------ 项目接口 相关 ------------------------
    /**
     * 基础包名
     */
    public static final String BASE_PACKAGE_NAME = "org.jujubeframework.jdbc";
    /**
     * H2的驱动
     */
    public static final String H2_DRIVER_CLASS_NAME = "org.h2.Driver";
    /**
     * 日期转换的后缀
     */
    public static final String DATE_PATTERN_SUFFIX = "_datePattern";

    // ---------------------------项目相关常量---------------------------------------------

    /**
     * 项目编码
     */
    public static final Charset PROJECT_ENCODING = Charset.forName("UTF-8");
    /**
     * 项目是否是Maven项目
     */
    public static final boolean IS_MAVEN_PROJECT = true;
    /**
     * 系统临时目录
     */
    public static final String FILE_UPLOAD_TMP_PATH = "/usr/local/tmp";

}
