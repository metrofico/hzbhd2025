package com.hzbhd.config.use;

import com.hzbhd.constant.disc.MpegConstantsDef;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.CharsKt;


public final class UIEncrypt {
    public static final UIEncrypt INSTANCE = new UIEncrypt();

    private UIEncrypt() {
    }

    public final String changeUIToString(String ui) {

        String hexString = Integer.toHexString((~Integer.parseInt(ui, 36)) & MpegConstantsDef.MPEG_MSG_NULL);

        return hexString;
    }

    public final String changeStringToUI(String str) {

        String string = Integer.toString(~(Integer.parseInt(str, 16) | (-4096)), checkRadix(36));

        return string.length() < 2 ? '0' + string : string;
    }

    public final byte[] changeUIToByteArray(String ui1, String ui2) throws NumberFormatException {


        int i = Integer.parseInt(ui1 + ui2, 36);
        System.out.println((Object) ("changeUIToByteArray  " + ui1 + ui2 + ':' + Integer.toHexString(i)));
        return new byte[]{(byte) ((i >> 16) & 255), (byte) ((i >> 8) & 255), (byte) (i & 255)};
    }

    public static int checkRadix(int radix) {
        if (radix < Character.MIN_RADIX || radix > Character.MAX_RADIX) {
            throw new IllegalArgumentException("radix " + radix + " was not in valid range " + Character.MIN_RADIX + ".." + Character.MAX_RADIX);
        }
        return radix;
    }

    public final String changeByteArrayToUI(byte[] byteArray) {

        int length = byteArray.length;
        int length2 = 0;
        for (int i = 0; i < length; i++) {
            length2 += (byteArray[i] & 255) << (((byteArray.length - 1) - i) * 8);
        }
        StringBuilder sbAppend = new StringBuilder().append("changeByteArrayToUI:").append(Integer.toHexString(length2)).append("    ");
        String string = Integer.toString(length2, checkRadix(36));

        System.out.println((Object) sbAppend.append(string).toString());
        StringBuilder sbAppend2 = new StringBuilder().append("0000");
        String string2 = Integer.toString(length2, checkRadix(36));

        String string3 = sbAppend2.append(string2).toString();
        String strSubstring = string3.substring(string3.length() - 4, string3.length());

        return strSubstring;
    }
}
