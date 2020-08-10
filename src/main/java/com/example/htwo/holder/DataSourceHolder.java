package com.example.htwo.holder;

import com.example.htwo.eum.DataBaseType;
import com.example.htwo.utils.InstallUtils;

public class DataSourceHolder {
    private static final ThreadLocal<String> DATASOURCE = new ThreadLocal<>();

    public static void setDatasource(String datasource) {
        DATASOURCE.set(datasource);
    }

    public static String getDatasource() {
        if (InstallUtils.isInstall) {
            return DataBaseType.MYSQL.name();
        } else {
            return DataBaseType.H2.name();
        }
    }
}