package com.xul.mineshop.basic.utils

class UUID {

    /**
     * 生成UUID
     */
    static String generateUUID() {
        java.util.UUID.randomUUID().toString().replaceAll("-", "")
    }

    /**
     * 生成64位UUID
     */
    static String generate64UUID() {
        generateUUID() + generateUUID()
    }

    /**
     * 生成激活码
     */
    static String generateCode() {
        String.valueOf(new Random().nextInt(899999) + 100000)
    }
}
