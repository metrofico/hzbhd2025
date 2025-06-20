package com.hzbhd.cantype;

import androidx.core.view.InputDeviceCompat;

import com.hzbhd.canbus.adapter.util.SystemConstant;
import com.hzbhd.canbus.car._0.MsgMgr;
import com.hzbhd.constant.disc.MpegConstantsDef;
import com.hzbhd.midware.constant.HotKeyConstant;

import org.apache.log4j.net.SyslogAppender;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;

import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import nfore.android.bt.res.NfDef;

public class CanTypeMap {
    private final LinkedHashMap<String, LinkedHashMap<String, ArrayList<Integer>>> canTypeMap = new LinkedHashMap<>() {
        {
            put("No Can", new LinkedHashMap<>() {{
                put(" Defualt", new ArrayList<>(List.of(0)));
            }});
            put("Raise", new LinkedHashMap<>() {{
                put("VW（MQB）", new ArrayList<>(List.of(3)));
                put("VW（PQ）", new ArrayList<>(List.of(4)));
                put("Skoda", new ArrayList<>(List.of(4)));
                put("Hyundai", new ArrayList<>(List.of(30)));
                put("Kia", new ArrayList<>(List.of(30)));
                put("Chevrolet", new ArrayList<>(List.of(68)));
                put("Buick", new ArrayList<>(List.of(68)));
                put("Opel", new ArrayList<>(List.of(68)));
                put("Ford", new ArrayList<>(List.of(94)));
                put("LINCOLN", new ArrayList<>(List.of(94)));
                put("Jeep", new ArrayList<>(List.of(118)));
                put("Honda", new ArrayList<>(Arrays.asList(MpegConstantsDef.MPEG_INFO_DISPLAY_CFM, 433)));
                put("Citroen", new ArrayList<>(List.of(MpegConstantsDef.MPEG_INFO_DISCTYPE_CFM)));
                put("Peugeot", new ArrayList<>(Arrays.asList(MpegConstantsDef.MPEG_INFO_DISCTYPE_CFM, HotKeyConstant.K_THIRD_KUWO)));
                put("Renault", new ArrayList<>(Arrays.asList(SyslogAppender.LOG_LOCAL6, MpegConstantsDef.MPEG_VIDEO_DISP_INFO_IND)));
                put("Nissan", new ArrayList<>(Arrays.asList(186, HotKeyConstant.K_SPEECH, HotKeyConstant.K_PHONE_ON_OFF)));
                put("Geely", new ArrayList<>(Arrays.asList(HotKeyConstant.K_PHONE_OFF_RETURN, 256)));
                put("ROEWE", new ArrayList<>(List.of(194)));
                put("MG", new ArrayList<>(List.of(194)));
                put("Trumpchi", new ArrayList<>(List.of(220)));
                put("MAXUS", new ArrayList<>(List.of(236)));
                put("Hanteng", new ArrayList<>(Arrays.asList(237, 238)));
                put("Haima", new ArrayList<>(Arrays.asList(239, NfDef.STATE_3WAY_M_HOLD, 242)));
                put("BISU", new ArrayList<>(Arrays.asList(241, 346)));
                put("Soueast", new ArrayList<>(List.of(243)));
                put("DFM", new ArrayList<>(Arrays.asList(NfDef.STATE_3WAY_CALL_M_ACT_S_HOLD, 250, 252, MsgMgr.RADIO_MODE)));
                put("Fiat", new ArrayList<>(List.of(245)));
                put("BMW", new ArrayList<>(Arrays.asList(246, 345)));
                put("BAIC", new ArrayList<>(Arrays.asList(247, 253, 265)));
                put("BaoJ", new ArrayList<>(Arrays.asList(255, 340)));
                put("Brilliance", new ArrayList<>(List.of(256)));
                put("Besturn", new ArrayList<>(Arrays.asList(256, 338)));
                put("Chery", new ArrayList<>(Arrays.asList(256, 193)));
                put("Mazda", new ArrayList<>(Arrays.asList(256, 334)));
                put("Benz", new ArrayList<>(List.of(265)));
                put("Changan", new ArrayList<>(Arrays.asList(284, 375)));
                put("ZOTYE", new ArrayList<>(List.of(327)));
                put("SWM", new ArrayList<>(List.of(481)));
                put("HUANGHAI", new ArrayList<>(List.of(327)));
                put("YEMA", new ArrayList<>(List.of(327)));
                put("Landrover", new ArrayList<>(List.of(327)));
                put("JAC", new ArrayList<>(List.of(332)));
                put("Great Wall", new ArrayList<>(Arrays.asList(337, 343, 344)));
                put("HOVER", new ArrayList<>(List.of(337)));
                put("Toyota", new ArrayList<>(List.of(16)));
                put("Lexus", new ArrayList<>(List.of(16)));
                put("Mitsubishi", new ArrayList<>(List.of(328)));
                put("Qichen", new ArrayList<>(List.of(342)));
                put("Audi", new ArrayList<>(List.of(347)));
                put("Fxauto", new ArrayList<>(List.of(348)));
                put("Lifan", new ArrayList<>(List.of(339)));
                put("Wuling", new ArrayList<>(List.of(340)));
                put("新宝骏 Xinbaojun", new ArrayList<>(List.of(340)));
                put("Volvo", new ArrayList<>(List.of(374)));
                put("ISUZU", new ArrayList<>(List.of(MsgMgr.RADIO_MODE)));
                put("JMC", new ArrayList<>(List.of(MsgMgr.RADIO_MODE)));
            }});
            put("Simple", new LinkedHashMap<>() {{
                put("Peugeot", new ArrayList<>(Arrays.asList(HotKeyConstant.K_AIR_WIND_INC, 263, 141)));
                put("VW（PQ）", new ArrayList<>(List.of(1)));
                put("Skoda", new ArrayList<>(Arrays.asList(1, 2)));
                put("Seat", new ArrayList<>(Arrays.asList(1, 2)));
                put("VW（MQB）", new ArrayList<>(List.of(2)));
                put("Toyota", new ArrayList<>(List.of(11)));
                put("Nissan", new ArrayList<>(Arrays.asList(21, 22, 24, 25)));
                put("Hyundai", new ArrayList<>(Arrays.asList(31, 36, 37, 173, 174, 175)));
                put("Kia", new ArrayList<>(Arrays.asList(31, 174)));
                put("Honda", new ArrayList<>(Arrays.asList(41, 42, 48)));
                put("Opel", new ArrayList<>(Arrays.asList(60, 61, HotKeyConstant.K_6_SHUFFLE)));
                put("Mazda", new ArrayList<>(Arrays.asList(60, 131, 132, HotKeyConstant.K_DARK_MODE)));
                put("Buick", new ArrayList<>(Arrays.asList(61, 72)));
                put("GMC", new ArrayList<>(Arrays.asList(61, 72, 205)));
                put("Chevrolet", new ArrayList<>(Arrays.asList(61, 72)));
                put("Hummer", new ArrayList<>(List.of(72)));
                put("Ford", new ArrayList<>(Arrays.asList(81, 85, 86)));
                put("Benz", new ArrayList<>(Arrays.asList(101, 102)));
                put("Mitsubishi", new ArrayList<>(List.of(103)));
                put("BMW", new ArrayList<>(Arrays.asList(104, 351)));
                put("Renault", new ArrayList<>(Arrays.asList(107, 156, 260, 261)));
                put("LADA", new ArrayList<>(List.of(107)));
                put("Chrysler", new ArrayList<>(List.of(111)));
                put("Dodge", new ArrayList<>(Arrays.asList(111, 112)));
                put("Jeep", new ArrayList<>(Arrays.asList(111, 112)));
                put("Fiat", new ArrayList<>(Arrays.asList(112, MpegConstantsDef.MPEG_KEYBOARD_STATUS_INT, 262)));
                put("Porsche", new ArrayList<>(List.of(178)));
                put("SUBARU", new ArrayList<>(List.of(NfDef.BT_MODE_CONNECTABLE_DISCOVERABLE)));
                put("五十铃 ISUZU", new ArrayList<>(List.of(319)));
                put("Citroen", new ArrayList<>(List.of(141)));
                put("Audi", new ArrayList<>(List.of(356)));
            }});
            put("BAOGOOD", new LinkedHashMap<>() {{
                put("Peugeot", new ArrayList<>(Arrays.asList(HotKeyConstant.K_AIR_WIND_INC, 263, 141)));
                put("VW（PQ）", new ArrayList<>(List.of(1)));
                put("Skoda", new ArrayList<>(Arrays.asList(1, 2)));
                put("Seat", new ArrayList<>(Arrays.asList(1, 2)));
                put("VW（MQB）", new ArrayList<>(List.of(2)));
                put("Toyota", new ArrayList<>(List.of(11)));
                put("Nissan", new ArrayList<>(Arrays.asList(21, 22, 24, 25)));
                put("Hyundai", new ArrayList<>(Arrays.asList(31, 36, 37, 173, 174, 175)));
                put("Kia", new ArrayList<>(Arrays.asList(31, 174)));
                put("Honda", new ArrayList<>(Arrays.asList(41, 42, 48)));
                put("Opel", new ArrayList<>(Arrays.asList(60, 61)));
                put("Mazda", new ArrayList<>(Arrays.asList(60, 131, 132, HotKeyConstant.K_DARK_MODE)));
                put("Buick", new ArrayList<>(Arrays.asList(61, 72)));
                put("GMC", new ArrayList<>(Arrays.asList(61, 72, 205)));
                put("Chevrolet", new ArrayList<>(Arrays.asList(61, 72)));
                put("Hummer", new ArrayList<>(List.of(72)));
                put("Ford", new ArrayList<>(Arrays.asList(81, 85, 86)));
                put("Benz", new ArrayList<>(Arrays.asList(101, 102)));
                put("Mitsubishi", new ArrayList<>(List.of(103)));
                put("BMW", new ArrayList<>(Arrays.asList(104, 351)));
                put("Dacia", new ArrayList<>(List.of(107)));
                put("Renault", new ArrayList<>(Arrays.asList(107, 156, 260, 261)));
                put("LADA", new ArrayList<>(List.of(107)));
                put("Chrysler", new ArrayList<>(List.of(111)));
                put("Dodge", new ArrayList<>(Arrays.asList(111, 112)));
                put("Jeep", new ArrayList<>(Arrays.asList(111, 112)));
                put("Fiat", new ArrayList<>(Arrays.asList(112, MpegConstantsDef.MPEG_KEYBOARD_STATUS_INT, 262)));
                put("Porsche", new ArrayList<>(List.of(178)));
                put("SUBARU", new ArrayList<>(List.of(NfDef.BT_MODE_CONNECTABLE_DISCOVERABLE)));
                put("ISUZU", new ArrayList<>(List.of(319)));
                put("Citroen", new ArrayList<>(List.of(141)));
                put("Audi", new ArrayList<>(List.of(356)));
            }});
            put("Binary", new LinkedHashMap<>() {{
                put("Toyota", new ArrayList<>(Arrays.asList(165, 288, HotKeyConstant.K_AIR_TEMP_UP)));
                put("Honda", new ArrayList<>(Arrays.asList(HotKeyConstant.K_AVM, NfDef.BT_STATE_TURNING_ON, 352, 371)));
                put("Mazda", new ArrayList<>(List.of(MsgMgr.DVD_MODE)));
                put("Hyundai", new ArrayList<>(List.of(280)));
                put("Buick", new ArrayList<>(List.of(292)));
                put("VW", new ArrayList<>(Arrays.asList(293, 294, 295)));
                put("Lexus", new ArrayList<>(Arrays.asList(335, HotKeyConstant.K_AIR_WIND_DEC)));
                put("Ford", new ArrayList<>(List.of(349)));
                put("Nissan", new ArrayList<>(List.of(353)));
                put("Jeep", new ArrayList<>(Arrays.asList(358, 370)));
                put("Peugeot", new ArrayList<>(List.of(372)));
                put("Citroen", new ArrayList<>(List.of(372)));
            }});
            put("Hiworld", new LinkedHashMap<>() {{
                put("Nissan", new ArrayList<>(Arrays.asList(23, 393)));
                put("Hyundai", new ArrayList<>(Arrays.asList(28, 29, 121)));
                put("Kia", new ArrayList<>(List.of(29)));
                put("Honda", new ArrayList<>(Arrays.asList(56, 57, 58, 59, 463, 55, 376, 377)));
                put("Ford", new ArrayList<>(Arrays.asList(97, MpegConstantsDef.MPEG_COMM_STATUS_REQ, 210, 211, HotKeyConstant.K_NEWCANBUS_AIR_ACTIVITY, 96, 378, 379)));
                put("Chrysler", new ArrayList<>(List.of(122)));
                put("Jeep", new ArrayList<>(Arrays.asList(122, 123)));
                put("Fiat", new ArrayList<>(Arrays.asList(123, MpegConstantsDef.MPEG_DIVX_REG_STATUS_INT, 276, HotKeyConstant.K_NEWCANBUS_ACTIVITY)));
                put("Dodge", new ArrayList<>(List.of(123)));
                put("Citroen/Peugeot", new ArrayList<>(Arrays.asList(143, 144)));
                put("Chery", new ArrayList<>(Arrays.asList(HotKeyConstant.K_CAN_CONFIG, 394)));
                put("VW", new ArrayList<>(Arrays.asList(206, 283, 291, 381, 382, 5)));
                put("Skoda", new ArrayList<>(List.of(206)));
                put("Seat", new ArrayList<>(List.of(206)));
                put("BMW", new ArrayList<>(Arrays.asList(HotKeyConstant.K_NEXT_HANGUP, 390, 391)));
                put("Benz", new ArrayList<>(Arrays.asList(HotKeyConstant.K_SOS, 307, HotKeyConstant.K_AIR_POWER, 389)));
                put("Mazda", new ArrayList<>(Arrays.asList(213, NfDef.STATE_3WAY_CALL_MULTIPARTY, 96)));
                put("Haval", new ArrayList<>(Arrays.asList(HotKeyConstant.K_BRIGHTNESS_INCREASE, 233, 204, 385, 386)));
                put("Trumpchi", new ArrayList<>(List.of(248)));
                put("Geely", new ArrayList<>(Arrays.asList(InputDeviceCompat.SOURCE_KEYBOARD, 258, 259, 277)));
                put("CMC", new ArrayList<>(List.of(266)));
                put("Brilliance", new ArrayList<>(List.of(266)));
                put("Mahindra", new ArrayList<>(List.of(270)));
                put("TATA", new ArrayList<>(List.of(271)));
                put("Lexus", new ArrayList<>(Arrays.asList(272, 384)));
                put("yulong", new ArrayList<>(List.of(274)));
                put("ZOTYE", new ArrayList<>(List.of(275)));
                put("DFM", new ArrayList<>(Arrays.asList(298, 413, 414, 415, 416, 417, 418)));
                put("JAC Refine", new ArrayList<>(List.of(329)));
                put("BYD", new ArrayList<>(List.of(336)));
                put("Audi", new ArrayList<>(List.of(HotKeyConstant.K_VOICE_HANGUP)));
                put("Toyota", new ArrayList<>(Arrays.asList(384, 18, 281)));
                put("Renault", new ArrayList<>(Arrays.asList(392, MpegConstantsDef.MPEG_INFO_SUBTITLE_CFM)));
                put("SAIC", new ArrayList<>(Arrays.asList(396, 395, 368, 369, 387, 388)));
                put("Besturn", new ArrayList<>(Arrays.asList(410, 411, 412, 426, 427, 428, 429, 430, 431, 422)));
                put("Red Flag", new ArrayList<>(List.of(431)));
                put("Haima", new ArrayList<>(List.of(135)));
                put("BAIC", new ArrayList<>(Arrays.asList(401, 402, 403, 404)));
                put("GM", new ArrayList<>(Arrays.asList(HotKeyConstant.K_AIR_AUTO, HotKeyConstant.K_AIR_AC)));
                put("Infiniti", new ArrayList<>(List.of(314)));
                put("Buick", new ArrayList<>(Arrays.asList(SyslogAppender.LOG_LOCAL5, HotKeyConstant.K_AIR_IN_OUT_CYCLE)));
                put("Chevrolet", new ArrayList<>(List.of(SyslogAppender.LOG_LOCAL5)));
                put("Opel", new ArrayList<>(Arrays.asList(SyslogAppender.LOG_LOCAL5, 380)));
                put("BAOJUN", new ArrayList<>(List.of(HotKeyConstant.K_AIR_FRONT_DEFOG)));
                put("HAIMA", new ArrayList<>(Arrays.asList(397, 398)));
                put("Mitsubishi", new ArrayList<>(List.of(399)));
                put("Cheetah", new ArrayList<>(List.of(400)));
                put("Iveco", new ArrayList<>(List.of(419)));
                put("Zotye", new ArrayList<>(List.of(420)));
                put("Changan", new ArrayList<>(Arrays.asList(421, 405, 406, 407)));
                put("WEICHAI", new ArrayList<>(List.of(423)));
                put("Kawei", new ArrayList<>(List.of(424)));
                put("Lifan", new ArrayList<>(Arrays.asList(408, 409)));
            }});
            put("XFY", new LinkedHashMap<>() {{
                put("Toyota", new ArrayList<>(List.of(HotKeyConstant.K_TTM)));
                put("Honda", new ArrayList<>(List.of(HotKeyConstant.K_TTM)));
                put("Hyundai", new ArrayList<>(List.of(HotKeyConstant.K_TTM)));
            }});
            put("Oudi", new LinkedHashMap<>() {{
                put("BMW", new ArrayList<>(Arrays.asList(104, 437, 461)));
                put("Honda", new ArrayList<>(Arrays.asList(MpegConstantsDef.MPEG_INFO_MENU_STATUS_CFM, 267)));
                put("Haval", new ArrayList<>(List.of(181)));
                put("BAIC", new ArrayList<>(List.of(HotKeyConstant.K_LONG_SIRI)));
                put("BYD", new ArrayList<>(List.of(282)));
                put("SUBARU", new ArrayList<>(List.of(285)));
                put("Porsche", new ArrayList<>(List.of(286)));
                put("Nissan", new ArrayList<>(List.of(287)));
                put("Benz", new ArrayList<>(List.of(NfDef.BT_STATE_ON)));
                put("BAOJUN", new ArrayList<>(List.of(305)));
                put("Hanteng", new ArrayList<>(List.of(315)));
                put("Soueast", new ArrayList<>(List.of(318)));
                put("WEICHAI", new ArrayList<>(List.of(NfDef.BT_SCAN_START)));
                put("Fiat", new ArrayList<>(List.of(NfDef.BT_SCAN_FINISH)));
                put("Volvo", new ArrayList<>(List.of(326)));
                put("Southeast series", new ArrayList<>(Arrays.asList(383, 445)));
                put("Cadillac", new ArrayList<>(List.of(435)));
                put("Audi", new ArrayList<>(List.of(4)));
                put("WIKA", new ArrayList<>(Arrays.asList(439, HotKeyConstant.K_1_PICKUP)));
                put("Opel", new ArrayList<>(List.of(455)));
            }});

            put("Luzheng", new LinkedHashMap<>() {{
                put("BMW", new ArrayList<>(Arrays.asList(104, 279, 313, 450, 454)));
                put("Porsche", new ArrayList<>(List.of(178)));
                put("Benz", new ArrayList<>(Arrays.asList(MpegConstantsDef.MPEG_TEST_NUM_IND, 234, 299)));
                put("Honda", new ArrayList<>(Arrays.asList(296, HotKeyConstant.K_2_HANGUP)));
                put("VW", new ArrayList<>(Arrays.asList(NfDef.BT_STATE_TURNING_OFF, 325)));
                put("Opel", new ArrayList<>(List.of(NfDef.BT_MODE_CONNECTABLE)));
                put("Mazda", new ArrayList<>(List.of(NfDef.BT_MODE_CONNECTABLE)));
                put("Lexus", new ArrayList<>(List.of(330)));
                put("Toyota", new ArrayList<>(Arrays.asList(330, 350, HotKeyConstant.K_MUTE_PHONE_ON_OUT)));
                put("Land Cruiser", new ArrayList<>(List.of(330)));
                put("Audi", new ArrayList<>(List.of(355)));
                put("Dacia", new ArrayList<>(List.of(107)));
                put("Renault", new ArrayList<>(List.of(107)));
                put("LADA", new ArrayList<>(List.of(107)));
                put("Ford", new ArrayList<>(List.of(432)));
                put("TATA", new ArrayList<>(List.of(453)));
                put("Landrover", new ArrayList<>(List.of(456)));
                put("Nissan", new ArrayList<>(List.of(479)));
                put("Maserati", new ArrayList<>(List.of(474)));
                put("Chrysler", new ArrayList<>(List.of(475)));
            }});

            put("Xinbas", new LinkedHashMap<>() {{
                put("Toyota", new ArrayList<>(List.of(HotKeyConstant.K_AIR_TEMP_DOWN)));
                put("Nissan", new ArrayList<>(List.of(357)));
                put("Mazda", new ArrayList<>(Arrays.asList(133, HotKeyConstant.K_SLEEP, HotKeyConstant.K_ANDROIDAUTO)));
                put("Honda", new ArrayList<>(List.of(45)));
                put("SUBARU", new ArrayList<>(List.of(106)));
            }});

            put("Dogen", new LinkedHashMap<>() {{
                put("Honda", new ArrayList<>(List.of(HotKeyConstant.K_TS_RELEASE)));
                put("Nissan", new ArrayList<>(List.of(309)));
            }});

            put("WWS", new LinkedHashMap<>() {{
                put("Toyota", new ArrayList<>(List.of(NfDef.BT_MODE_NONE)));
                put("Lexus", new ArrayList<>(List.of(NfDef.BT_MODE_NONE)));
            }});

            put("KYC", new LinkedHashMap<>() {{
                put("Mitsubishi", new ArrayList<>(List.of(317)));
                put("Toyota", new ArrayList<>(List.of(341)));
            }});

            put("BSJ", new LinkedHashMap<>() {{
                put("Nissan", new ArrayList<>(List.of(308)));
                put("Ford", new ArrayList<>(List.of(322)));
                put("Toyota", new ArrayList<>(List.of(324)));
                put("Fiat", new ArrayList<>(List.of(373)));
            }});

            put("RSW", new LinkedHashMap<>() {{
                put("BYD", new ArrayList<>(List.of(300)));
                put("Mazda", new ArrayList<>(List.of(316)));
            }});

            put("CYT", new LinkedHashMap<>() {{
                put("Honda", new ArrayList<>(List.of(160)));
            }});

            put("Network use", new LinkedHashMap<>() {{
                put("luxury brand", new ArrayList<>(Arrays.asList(452, 451)));
            }});

            put("Internal", new LinkedHashMap<>() {{
                put("MD", new ArrayList<>(Arrays.asList(436, 441, 442, HotKeyConstant.K_4_REPEAT, 446, 458, 460, 473)));
                put("HY", new ArrayList<>(List.of(447)));
                put("SLD", new ArrayList<>(List.of(448)));
                put("MS", new ArrayList<>(Arrays.asList(434, 438, 443, 444, 459, 440, HotKeyConstant.K_3_SHUFFLE)));
                put("Jeep", new ArrayList<>(List.of(SystemConstant.CAN_TYPE_PENGLING_JEEP)));
                put("CW", new ArrayList<>(Arrays.asList(273, 290)));
                put("JL", new ArrayList<>(List.of(289)));
                put("YD", new ArrayList<>(List.of(304)));
                put("Defualt", new ArrayList<>(List.of(331)));
                put("TD", new ArrayList<>(Arrays.asList(462, HotKeyConstant.K_5_REPEAT)));
                put("LC", new ArrayList<>(List.of(HotKeyConstant.K_UP_PICKUP)));
                put("DH", new ArrayList<>(List.of(HotKeyConstant.K_DOWN_HANGUP)));
            }});

        }

    };
//    private final LinkedHashMap<String, LinkedHashMap<String, ArrayList<Integer>>> canTypeMap = MapsKt.linkedMapOf(
//            new Pair("无 ", MapsKt.linkedMapOf(
//                    new Pair("默认", CollectionsKt.arrayListOf(0)))),
//            new Pair("睿志诚", MapsKt.linkedMapOf(
//                    new Pair("大众", CollectionsKt.arrayListOf(3, 4)),
//                    new Pair("斯柯达", CollectionsKt.arrayListOf(4)),
//                    new Pair("现代", CollectionsKt.arrayListOf(30)),
//                    new Pair("起亚", CollectionsKt.arrayListOf(30)),
//                    new Pair("雪弗兰", CollectionsKt.arrayListOf(68)),
//                    new Pair("别克", CollectionsKt.arrayListOf(68)),
//                    new Pair("欧宝", CollectionsKt.arrayListOf(68)),
//                    new Pair("福特", CollectionsKt.arrayListOf(94)),
//                    new Pair("林肯", CollectionsKt.arrayListOf(94)),
//                    new Pair("吉普", CollectionsKt.arrayListOf(118)),
//                    new Pair("本田", CollectionsKt.arrayListOf(Integer.valueOf(MpegConstantsDef.MPEG_INFO_DISPLAY_CFM), 433)),
//                    new Pair("雪铁龙", CollectionsKt.arrayListOf(Integer.valueOf(MpegConstantsDef.MPEG_INFO_DISCTYPE_CFM))),
//                    new Pair("标致", CollectionsKt.arrayListOf(Integer.valueOf(MpegConstantsDef.MPEG_INFO_DISCTYPE_CFM), Integer.valueOf(HotKeyConstant.K_THIRD_KUWO))),
//                    new Pair("雷诺", CollectionsKt.arrayListOf(Integer.valueOf(SyslogAppender.LOG_LOCAL6), Integer.valueOf(MpegConstantsDef.MPEG_VIDEO_DISP_INFO_IND))),
//                    new Pair("日产", CollectionsKt.arrayListOf(186, Integer.valueOf(HotKeyConstant.K_SPEECH), Integer.valueOf(HotKeyConstant.K_PHONE_ON_OFF))),
//                    new Pair("吉利", CollectionsKt.arrayListOf(Integer.valueOf(HotKeyConstant.K_PHONE_OFF_RETURN), 256)),
//                    new Pair("荣威", CollectionsKt.arrayListOf(194)),
//                    new Pair("名爵", CollectionsKt.arrayListOf(194)),
//                    new Pair("传祺", CollectionsKt.arrayListOf(220)),
//                    new Pair("大通", CollectionsKt.arrayListOf(236)),
//                    new Pair("汉腾", CollectionsKt.arrayListOf(237, 238)),
//                    new Pair("海马", CollectionsKt.arrayListOf(239, Integer.valueOf(NfDef.STATE_3WAY_M_HOLD), 242)),
//                    new Pair("比速", CollectionsKt.arrayListOf(241, 346)),
//                    new Pair("东南", CollectionsKt.arrayListOf(243)),
//                    new Pair("东风", CollectionsKt.arrayListOf(Integer.valueOf(NfDef.STATE_3WAY_CALL_M_ACT_S_HOLD), 250, 252, Integer.valueOf(MsgMgr.RADIO_MODE))),
//                    new Pair("菲亚特", CollectionsKt.arrayListOf(245)),
//                    new Pair("宝马", CollectionsKt.arrayListOf(246, 345)),
//                    new Pair("北汽", CollectionsKt.arrayListOf(247, 253, 265)),
//                    new Pair("宝骏系列", CollectionsKt.arrayListOf(255, 340)),
//                    new Pair("中华", CollectionsKt.arrayListOf(256)),
//                    new Pair("奔腾", CollectionsKt.arrayListOf(256, 338)),
//                    new Pair("Chery", CollectionsKt.arrayListOf(256)),
//                    new Pair("马自达", CollectionsKt.arrayListOf(256, 334)),
//                    new Pair("奔驰", CollectionsKt.arrayListOf(265)),
//                    new Pair("长安", CollectionsKt.arrayListOf(284, 375)),
//                    new Pair("众泰", CollectionsKt.arrayListOf(327)),
//                    new Pair("黄海", CollectionsKt.arrayListOf(327)),
//                    new Pair("野马", CollectionsKt.arrayListOf(327)),
//                    new Pair("路虎", CollectionsKt.arrayListOf(327)),
//                    new Pair("江淮", CollectionsKt.arrayListOf(332)),
//                    new Pair("长城", CollectionsKt.arrayListOf(337, 343, 344)),
//                    new Pair("哈佛", CollectionsKt.arrayListOf(337)),
//                    new Pair("丰田", CollectionsKt.arrayListOf(16)),
//                    new Pair("雷克萨斯", CollectionsKt.arrayListOf(16)),
//                    new Pair("三菱", CollectionsKt.arrayListOf(328)),
//                    new Pair("启辰", CollectionsKt.arrayListOf(342)),
//                    new Pair("奥迪", CollectionsKt.arrayListOf(347)),
//                    new Pair("东风风行", CollectionsKt.arrayListOf(348)),
//                    new Pair("奇瑞", CollectionsKt.arrayListOf(193)),
//                    new Pair("力帆", CollectionsKt.arrayListOf(339)),
//                    new Pair("五菱", CollectionsKt.arrayListOf(340)),
//                    new Pair("新宝骏", CollectionsKt.arrayListOf(340)),
//                    new Pair("沃尔沃", CollectionsKt.arrayListOf(374)),
//                    new Pair("五十铃", CollectionsKt.arrayListOf(Integer.valueOf(MsgMgr.RADIO_MODE))),
//                    new Pair("江铃", CollectionsKt.arrayListOf(Integer.valueOf(MsgMgr.RADIO_MODE))))),
//            new Pair("欣朴 ", MapsKt.linkedMapOf(
//                    new Pair("标致", CollectionsKt.arrayListOf(Integer.valueOf(HotKeyConstant.K_AIR_WIND_INC), 263, 141)),
//                    new Pair("大众VW（PQ）", CollectionsKt.arrayListOf(1, 2)),
//                    new Pair("斯柯达", CollectionsKt.arrayListOf(1, 2)),
//                    new Pair("西亚特", CollectionsKt.arrayListOf(1, 2)),
//                    new Pair("丰田", CollectionsKt.arrayListOf(11)),
//                    new Pair("日产", CollectionsKt.arrayListOf(21, 22, 24, 25)),
//                    new Pair("现代", CollectionsKt.arrayListOf(31, 36, 37, 173, 174, 175)),
//                    new Pair("起亚", CollectionsKt.arrayListOf(31, 174)),
//                    new Pair("本田", CollectionsKt.arrayListOf(41, 42, 48)),
//                    new Pair("欧宝", CollectionsKt.arrayListOf(60, 61, Integer.valueOf(HotKeyConstant.K_6_SHUFFLE))),
//                    new Pair("马自达", CollectionsKt.arrayListOf(60, 131, 132, Integer.valueOf(HotKeyConstant.K_DARK_MODE))),
//                    new Pair("别克", CollectionsKt.arrayListOf(61, 72)),
//                    new Pair("通用", CollectionsKt.arrayListOf(61, 72, 205)),
//                    new Pair("雪佛兰", CollectionsKt.arrayListOf(61, 72)),
//                    new Pair("悍马", CollectionsKt.arrayListOf(72)),
//                    new Pair("福特", CollectionsKt.arrayListOf(81, 85, 86)),
//                    new Pair("奔驰", CollectionsKt.arrayListOf(101, 102)),
//                    new Pair("三菱", CollectionsKt.arrayListOf(103)),
//                    new Pair("宝马", CollectionsKt.arrayListOf(104, 351)),
//                    new Pair("雷诺", CollectionsKt.arrayListOf(107, 156, 260, 261)),
//                    new Pair("拉达", CollectionsKt.arrayListOf(107)),
//                    new Pair("克莱斯勒", CollectionsKt.arrayListOf(111)),
//                    new Pair("道奇", CollectionsKt.arrayListOf(111, 112)),
//                    new Pair("吉普", CollectionsKt.arrayListOf(111, 112)),
//                    new Pair("菲亚特", CollectionsKt.arrayListOf(112, Integer.valueOf(MpegConstantsDef.MPEG_KEYBOARD_STATUS_INT), 262)),
//                    new Pair("保时捷", CollectionsKt.arrayListOf(178)),
//                    new Pair("斯巴鲁", CollectionsKt.arrayListOf(Integer.valueOf(NfDef.BT_MODE_CONNECTABLE_DISCOVERABLE))),
//                    new Pair("五十铃", CollectionsKt.arrayListOf(319)),
//                    new Pair("雪铁龙", CollectionsKt.arrayListOf(141)),
//                    new Pair("奥迪", CollectionsKt.arrayListOf(356)))),
//            new Pair("宝谷", MapsKt.linkedMapOf(
//                    new Pair("标致", CollectionsKt.arrayListOf(Integer.valueOf(HotKeyConstant.K_AIR_WIND_INC), 263, 141)),
//                    new Pair("大众VW（PQ）", CollectionsKt.arrayListOf(1, 2)),
//                    new Pair("斯柯达", CollectionsKt.arrayListOf(1, 2)),
//                    new Pair("西亚特", CollectionsKt.arrayListOf(1, 2)),
//                    new Pair("丰田", CollectionsKt.arrayListOf(11)),
//                    new Pair("日产", CollectionsKt.arrayListOf(21, 22, 24, 25)),
//                    new Pair("现代", CollectionsKt.arrayListOf(31, 36, 37, 173, 174, 175)),
//                    new Pair("起亚", CollectionsKt.arrayListOf(31, 174)),
//                    new Pair("本田", CollectionsKt.arrayListOf(41, 42, 48)),
//                    new Pair("欧宝", CollectionsKt.arrayListOf(60, 61)),
//                    new Pair("马自达", CollectionsKt.arrayListOf(60, 131, 132, Integer.valueOf(HotKeyConstant.K_DARK_MODE))),
//                    new Pair("别克", CollectionsKt.arrayListOf(61, 72)),
//                    new Pair("通用", CollectionsKt.arrayListOf(61, 72, 205)),
//                    new Pair("雪佛兰", CollectionsKt.arrayListOf(61, 72)),
//                    new Pair("悍马", CollectionsKt.arrayListOf(72)),
//                    new Pair("福特", CollectionsKt.arrayListOf(81, 85, 86)),
//                    new Pair("奔驰", CollectionsKt.arrayListOf(101, 102)),
//                    new Pair("三菱", CollectionsKt.arrayListOf(103)),
//                    new Pair("宝马", CollectionsKt.arrayListOf(104, 351)),
//                    new Pair("达西亚", CollectionsKt.arrayListOf(107)),
//                    new Pair("雷诺", CollectionsKt.arrayListOf(107, 156, 260, 261)),
//                    new Pair("拉达", CollectionsKt.arrayListOf(107)),
//                    new Pair("克莱斯勒", CollectionsKt.arrayListOf(111)),
//                    new Pair("道奇", CollectionsKt.arrayListOf(111, 112)),
//                    new Pair("吉普", CollectionsKt.arrayListOf(111, 112)),
//                    new Pair("菲亚特", CollectionsKt.arrayListOf(112, Integer.valueOf(MpegConstantsDef.MPEG_KEYBOARD_STATUS_INT), 262)),
//                    new Pair("保时捷", CollectionsKt.arrayListOf(178)),
//                    new Pair("斯巴鲁", CollectionsKt.arrayListOf(Integer.valueOf(NfDef.BT_MODE_CONNECTABLE_DISCOVERABLE))),
//                    new Pair("五十铃", CollectionsKt.arrayListOf(319)),
//                    new Pair("雪铁龙", CollectionsKt.arrayListOf(141)),
//                    new Pair("奥迪", CollectionsKt.arrayListOf(356)))),
//            new Pair("比纳瑞", MapsKt.linkedMapOf(
//                    new Pair("丰田", CollectionsKt.arrayListOf(165, 288, Integer.valueOf(HotKeyConstant.K_AIR_TEMP_UP))),
//                    new Pair("本田", CollectionsKt.arrayListOf(Integer.valueOf(HotKeyConstant.K_AVM), Integer.valueOf(NfDef.BT_STATE_TURNING_ON), 352, 371)),
//                    new Pair("马自达", CollectionsKt.arrayListOf(Integer.valueOf(MsgMgr.DVD_MODE))),
//                    new Pair("现代", CollectionsKt.arrayListOf(280)),
//                    new Pair("别克", CollectionsKt.arrayListOf(292)),
//                    new Pair("大众", CollectionsKt.arrayListOf(293, 294, 295)),
//                    new Pair("雷克萨斯", CollectionsKt.arrayListOf(335, Integer.valueOf(HotKeyConstant.K_AIR_WIND_DEC))),
//                    new Pair("福特", CollectionsKt.arrayListOf(349)),
//                    new Pair("日产", CollectionsKt.arrayListOf(353)),
//                    new Pair("吉普", CollectionsKt.arrayListOf(358, 370)),
//                    new Pair("标致", CollectionsKt.arrayListOf(372)),
//                    new Pair("雪铁龙", CollectionsKt.arrayListOf(372)))),
//            new Pair("威驰", MapsKt.linkedMapOf(
//                    new Pair("日产", CollectionsKt.arrayListOf(23, 393)),
//                    new Pair("现代", CollectionsKt.arrayListOf(28, 29, 121)),
//                    new Pair("起亚", CollectionsKt.arrayListOf(29)),
//                    new Pair("本田", CollectionsKt.arrayListOf(56, 57, 58, 59, 463, 55, 376, 377)),
//                    new Pair("福特", CollectionsKt.arrayListOf(97, Integer.valueOf(MpegConstantsDef.MPEG_COMM_STATUS_REQ), 210, 211, Integer.valueOf(HotKeyConstant.K_NEWCANBUS_AIR_ACTIVITY), 96, 378, 379)),
//                    new Pair("克莱斯勒", CollectionsKt.arrayListOf(122)),
//                    new Pair("吉普", CollectionsKt.arrayListOf(122, 123)),
//                    new Pair("菲亚特", CollectionsKt.arrayListOf(123, Integer.valueOf(MpegConstantsDef.MPEG_DIVX_REG_STATUS_INT), 276, Integer.valueOf(HotKeyConstant.K_NEWCANBUS_ACTIVITY))),
//                    new Pair("道奇", CollectionsKt.arrayListOf(123)),
//                    new Pair("雪铁龙", CollectionsKt.arrayListOf(143, 144)),
//                    new Pair("Chery", CollectionsKt.arrayListOf(Integer.valueOf(HotKeyConstant.K_CAN_CONFIG))),
//                    new Pair("大众", CollectionsKt.arrayListOf(206, 283, 291, 381, 382, 5)),
//                    new Pair("斯柯达", CollectionsKt.arrayListOf(206)),
//                    new Pair("西亚特", CollectionsKt.arrayListOf(206)),
//                    new Pair("宝马", CollectionsKt.arrayListOf(Integer.valueOf(HotKeyConstant.K_NEXT_HANGUP), 390, 391)),
//                    new Pair("奔驰", CollectionsKt.arrayListOf(Integer.valueOf(HotKeyConstant.K_SOS), 307, Integer.valueOf(HotKeyConstant.K_AIR_POWER), 389)),
//                    new Pair("马自达", CollectionsKt.arrayListOf(213, Integer.valueOf(NfDef.STATE_3WAY_CALL_MULTIPARTY), 96)),
//                    new Pair("哈弗", CollectionsKt.arrayListOf(Integer.valueOf(HotKeyConstant.K_BRIGHTNESS_INCREASE), 233, 204, 385, 386)),
//                    new Pair("传祺", CollectionsKt.arrayListOf(248)),
//                    new Pair("吉利", CollectionsKt.arrayListOf(Integer.valueOf(InputDeviceCompat.SOURCE_KEYBOARD), 258, 259, 277)),
//                    new Pair("中华", CollectionsKt.arrayListOf(266)),
//                    new Pair("华晨", CollectionsKt.arrayListOf(266)),
//                    new Pair("马恒达", CollectionsKt.arrayListOf(270)),
//                    new Pair("TATA", CollectionsKt.arrayListOf(271)),
//                    new Pair("雷克萨斯", CollectionsKt.arrayListOf(272, 384)),
//                    new Pair("裕隆", CollectionsKt.arrayListOf(274)),
//                    new Pair("众泰", CollectionsKt.arrayListOf(275, 420)),
//                    new Pair("东风", CollectionsKt.arrayListOf(298, 413, 414, 415, 416, 417, 418)),
//                    new Pair("江淮瑞风", CollectionsKt.arrayListOf(329)),
//                    new Pair("比亚迪", CollectionsKt.arrayListOf(336)),
//                    new Pair("奥迪", CollectionsKt.arrayListOf(Integer.valueOf(HotKeyConstant.K_VOICE_HANGUP))),
//                    new Pair("丰田", CollectionsKt.arrayListOf(384, 18, 281)),
//                    new Pair("雷诺", CollectionsKt.arrayListOf(392, Integer.valueOf(MpegConstantsDef.MPEG_INFO_SUBTITLE_CFM))),
//                    new Pair("奇瑞", CollectionsKt.arrayListOf(394)),
//                    new Pair("上汽", CollectionsKt.arrayListOf(396, 395, 368, 369, 387, 388)),
//                    new Pair("奔腾", CollectionsKt.arrayListOf(410, 411, 412, 426, 427, 428, 429, 430, 431, 422)),
//                    new Pair("红旗", CollectionsKt.arrayListOf(431)),
//                    new Pair("海马", CollectionsKt.arrayListOf(135, 397, 398)),
//                    new Pair("北汽", CollectionsKt.arrayListOf(401, 402, 403, 404)),
//                    new Pair("通用", CollectionsKt.arrayListOf(Integer.valueOf(HotKeyConstant.K_AIR_AUTO), Integer.valueOf(HotKeyConstant.K_AIR_AC))),
//                    new Pair("英菲尼迪", CollectionsKt.arrayListOf(314)),
//                    new Pair("别克", CollectionsKt.arrayListOf(Integer.valueOf(SyslogAppender.LOG_LOCAL5), Integer.valueOf(HotKeyConstant.K_AIR_IN_OUT_CYCLE))),
//                    new Pair("雪佛兰", CollectionsKt.arrayListOf(Integer.valueOf(SyslogAppender.LOG_LOCAL5))),
//                    new Pair("欧宝", CollectionsKt.arrayListOf(Integer.valueOf(SyslogAppender.LOG_LOCAL5), 380)),
//                    new Pair("宝骏", CollectionsKt.arrayListOf(Integer.valueOf(HotKeyConstant.K_AIR_FRONT_DEFOG))),
//                    new Pair("三菱", CollectionsKt.arrayListOf(399)),
//                    new Pair("猎豹", CollectionsKt.arrayListOf(400)),
//                    new Pair("依维柯", CollectionsKt.arrayListOf(419)),
//                    new Pair("长安", CollectionsKt.arrayListOf(421, 405, 406, 407)),
//                    new Pair("潍柴", CollectionsKt.arrayListOf(423)),
//                    new Pair("卡威", CollectionsKt.arrayListOf(424)),
//                    new Pair("力帆", CollectionsKt.arrayListOf(408, 409)))),
//            new Pair("馨飞扬", MapsKt.linkedMapOf(
//                    new Pair("丰田", CollectionsKt.arrayListOf(Integer.valueOf(HotKeyConstant.K_TTM))),
//                    new Pair("本田", CollectionsKt.arrayListOf(Integer.valueOf(HotKeyConstant.K_TTM))),
//                    new Pair("现代", CollectionsKt.arrayListOf(Integer.valueOf(HotKeyConstant.K_TTM))))),
//            new Pair("欧迪", MapsKt.linkedMapOf(
//                    new Pair("宝马", CollectionsKt.arrayListOf(104, 437, 461)),
//                    new Pair("本田", CollectionsKt.arrayListOf(Integer.valueOf(MpegConstantsDef.MPEG_INFO_MENU_STATUS_CFM), 267)),
//                    new Pair("哈弗", CollectionsKt.arrayListOf(181)),
//                    new Pair("北汽", CollectionsKt.arrayListOf(Integer.valueOf(HotKeyConstant.K_LONG_SIRI))),
//                    new Pair("比亚迪", CollectionsKt.arrayListOf(282)),
//                    new Pair("斯巴鲁", CollectionsKt.arrayListOf(285)),
//                    new Pair("保时捷", CollectionsKt.arrayListOf(286)),
//                    new Pair("日产", CollectionsKt.arrayListOf(287)),
//                    new Pair("奔驰", CollectionsKt.arrayListOf(Integer.valueOf(NfDef.BT_STATE_ON))),
//                    new Pair("宝骏", CollectionsKt.arrayListOf(305)),
//                    new Pair("汉腾", CollectionsKt.arrayListOf(315)),
//                    new Pair("东南", CollectionsKt.arrayListOf(318)),
//                    new Pair("潍柴", CollectionsKt.arrayListOf(Integer.valueOf(NfDef.BT_SCAN_START))),
//                    new Pair("菲亚特", CollectionsKt.arrayListOf(Integer.valueOf(NfDef.BT_SCAN_FINISH))),
//                    new Pair("沃尔沃", CollectionsKt.arrayListOf(326)),
//                    new Pair("东南系列", CollectionsKt.arrayListOf(383, 445)),
//                    new Pair("凯迪拉克", CollectionsKt.arrayListOf(435)),
//                    new Pair("奥迪", CollectionsKt.arrayListOf(4)),
//                    new Pair("WIKA", CollectionsKt.arrayListOf(439, Integer.valueOf(HotKeyConstant.K_1_PICKUP))),
//                    new Pair("欧宝", CollectionsKt.arrayListOf(455)))),
//            new Pair("路征", MapsKt.linkedMapOf(
//                    new Pair("宝马", CollectionsKt.arrayListOf(104, 279, 313, 450, 454)),
//                    new Pair("保时捷", CollectionsKt.arrayListOf(178)),
//                    new Pair("奔驰", CollectionsKt.arrayListOf(Integer.valueOf(MpegConstantsDef.MPEG_TEST_NUM_IND), 234, 299)),
//                    new Pair("本田", CollectionsKt.arrayListOf(296, Integer.valueOf(HotKeyConstant.K_2_HANGUP))),
//                    new Pair("大众", CollectionsKt.arrayListOf(Integer.valueOf(NfDef.BT_STATE_TURNING_OFF), 325)),
//                    new Pair("欧宝", CollectionsKt.arrayListOf(Integer.valueOf(NfDef.BT_MODE_CONNECTABLE))),
//                    new Pair("马自达", CollectionsKt.arrayListOf(Integer.valueOf(NfDef.BT_MODE_CONNECTABLE))),
//                    new Pair("雷克萨斯", CollectionsKt.arrayListOf(330)),
//                    new Pair("丰田", CollectionsKt.arrayListOf(330, 350, Integer.valueOf(HotKeyConstant.K_MUTE_PHONE_ON_OUT))),
//                    new Pair("兰德酷路泽", CollectionsKt.arrayListOf(330)),
//                    new Pair("奥迪", CollectionsKt.arrayListOf(355)),
//                    new Pair("达西亚", CollectionsKt.arrayListOf(107)),
//                    new Pair("雷诺", CollectionsKt.arrayListOf(107)),
//                    new Pair("拉达", CollectionsKt.arrayListOf(107)),
//                    new Pair("福特", CollectionsKt.arrayListOf(432)),
//                    new Pair("塔塔", CollectionsKt.arrayListOf(453)),
//                    new Pair("路虎", CollectionsKt.arrayListOf(456)),
//                    new Pair("日产", CollectionsKt.arrayListOf(479)),
//                    new Pair("玛莎拉蒂", CollectionsKt.arrayListOf(474)),
//                    new Pair("克莱斯勒", CollectionsKt.arrayListOf(475)))),
//            new Pair("鑫巴斯", MapsKt.linkedMapOf(
//                    new Pair("丰田", CollectionsKt.arrayListOf(Integer.valueOf(HotKeyConstant.K_AIR_TEMP_DOWN))),
//                    new Pair("日产", CollectionsKt.arrayListOf(357)),
//                    new Pair("马自达", CollectionsKt.arrayListOf(133, Integer.valueOf(HotKeyConstant.K_SLEEP), Integer.valueOf(HotKeyConstant.K_ANDROIDAUTO))),
//                    new Pair("本田", CollectionsKt.arrayListOf(45)),
//                    new Pair("斯巴鲁", CollectionsKt.arrayListOf(106)))),
//            new Pair("道俊 ", MapsKt.linkedMapOf(
//                    new Pair("本田", CollectionsKt.arrayListOf(Integer.valueOf(HotKeyConstant.K_TS_RELEASE))))),
//            new Pair("道俊", MapsKt.linkedMapOf(
//                    new Pair("日产", CollectionsKt.arrayListOf(309)))),
//            new Pair("威沃思", MapsKt.linkedMapOf(
//                    new Pair("丰田", CollectionsKt.arrayListOf(Integer.valueOf(NfDef.BT_MODE_NONE))),
//                    new Pair("雷克萨斯", CollectionsKt.arrayListOf(Integer.valueOf(NfDef.BT_MODE_NONE))))),
//            new Pair("科易创 ", MapsKt.linkedMapOf(
//                    new Pair("三菱", CollectionsKt.arrayListOf(317)),
//                    new Pair("丰田", CollectionsKt.arrayListOf(341)))),
//            new Pair("保仕杰 BSJ", MapsKt.linkedMapOf(
//                    new Pair("日产", CollectionsKt.arrayListOf(308)),
//                    new Pair("福特", CollectionsKt.arrayListOf(322)),
//                    new Pair("丰田", CollectionsKt.arrayListOf(324)),
//                    new Pair("菲亚特", CollectionsKt.arrayListOf(373)))),
//            new Pair("睿晟威 ", MapsKt.linkedMapOf(
//                    new Pair("比亚迪", CollectionsKt.arrayListOf(300)),
//                    new Pair("马自达", CollectionsKt.arrayListOf(316)))),
//            new Pair("长远通", MapsKt.linkedMapOf(
//                    new Pair("本田", CollectionsKt.arrayListOf(160)))),
//            new Pair("网用", MapsKt.linkedMapOf(
//                    new Pair("豪华品牌", CollectionsKt.arrayListOf(452, 451)))),
//            new Pair("内部协议", MapsKt.linkedMapOf(
//                    new Pair("MD", CollectionsKt.arrayListOf(436, 441, 442, Integer.valueOf(HotKeyConstant.K_4_REPEAT), 446, 458, 460, 473)),
//                    new Pair("HY", CollectionsKt.arrayListOf(447)),
//                    new Pair("SLD", CollectionsKt.arrayListOf(448)),
//                    new Pair("MS", CollectionsKt.arrayListOf(434, 438, 443, 444, 459, 440, Integer.valueOf(HotKeyConstant.K_3_SHUFFLE))),
//                    new Pair("吉普", CollectionsKt.arrayListOf(Integer.valueOf(SystemConstant.CAN_TYPE_PENGLING_JEEP))),
//                    new Pair("CW", CollectionsKt.arrayListOf(273, 290)),
//                    new Pair("JL", CollectionsKt.arrayListOf(289)),
//                    new Pair("YD", CollectionsKt.arrayListOf(304)),
//                    new Pair("默认", CollectionsKt.arrayListOf(331)),
//                    new Pair("TD", CollectionsKt.arrayListOf(462, Integer.valueOf(HotKeyConstant.K_5_REPEAT))),
//                    new Pair("LC", CollectionsKt.arrayListOf(Integer.valueOf(HotKeyConstant.K_UP_PICKUP))),
//                    new Pair("DH", CollectionsKt.arrayListOf(Integer.valueOf(HotKeyConstant.K_DOWN_HANGUP))))));

    public LinkedHashMap<String, LinkedHashMap<String, ArrayList<Integer>>> getCanTypeMap() {
        return this.canTypeMap;
    }
}
