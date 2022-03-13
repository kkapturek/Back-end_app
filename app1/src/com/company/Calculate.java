package com.company;

public class Calculate {
    public static void main(String[] args) {
        System.out.println(crc32("This is example text ..."));
    }

    public static CRC_TABLE = Array(256);

    for (let i = 0; i< 256; ++i)
    {
        let code = i;
        for (let j = 0; j < 8; ++j) {
            code = (code & 0x01 ? 0xEDB88320 ^ (code >>> 1) : (code >>> 1));
        }
        CRC_TABLE[i] = code;
    }

    const crc32 =text =>

    {
        let crc = -1;
        for (let i = 0; i < text.length; ++i) {
            const code = text.charCodeAt(i);
            crc = CRC_TABLE[(code ^ crc) & 0xFF] ^ (crc >>> 8);
        }
        return (-1 ^ crc) >>> 0;
    }
}