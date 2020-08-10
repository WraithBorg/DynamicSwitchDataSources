package com.example.htwo.eum;

/**
 * 数据源类型
 */
public enum DbNameEum {
    H2, MYSQL,
    ;

    public static DbNameEum getByName(String name) {
        for (DbNameEum em : values()) {
            if (em.name().equals(name)) {
                return em;
            }
        }
        return MYSQL;
    }
}
